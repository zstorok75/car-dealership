package com.car.dealership.backend.service;

import com.car.dealership.backend.dto.LoginRequestDto;
import com.car.dealership.backend.dto.LoginResponseDto;
import com.car.dealership.backend.dto.RegistrationDto;
import com.car.dealership.backend.entity.StaffEntity;
import com.car.dealership.backend.repository.StaffRepository;
import com.car.dealership.backend.security.JwtService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final StaffRepository staffRepo;

     private final PasswordEncoder passwordEncoder;

     private final AuthenticationManager authManager;

     private final JwtService jwtService;

    public AuthenticationService(
            StaffRepository staffRepo,
            PasswordEncoder passwordEncoder,
            AuthenticationManager authManager,
            JwtService jwtService) {
        this.staffRepo = staffRepo;
         this.passwordEncoder = passwordEncoder;
         this.authManager = authManager;
        this.jwtService = jwtService;
    }

    public void registration(RegistrationDto dto) {
        StaffEntity newUser = new StaffEntity();
        newUser.setContactEmail(dto.getEmail());
        newUser.setPassword(
                // this.passwordEncoder.encode(dto.getPassword())
                dto.getPassword()
        );
        this.staffRepo.save(newUser);
    }

    public LoginResponseDto login(LoginRequestDto loginDto) {
        this.authManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getEmail(), loginDto.getPassword()
        ));
        StaffEntity staff = this.staffRepo.findByContactEmail(loginDto.getEmail()).orElseThrow();

        return new LoginResponseDto(loginDto.getEmail(), jwtService.generateToken(staff));
    }

}
