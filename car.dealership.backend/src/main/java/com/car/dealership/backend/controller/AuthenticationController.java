package com.car.dealership.backend.controller;

import com.car.dealership.backend.dto.LoginRequestDto;
import com.car.dealership.backend.dto.LoginResponseDto;
import com.car.dealership.backend.dto.RegistrationDto;
import com.car.dealership.backend.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authService;

    @PostMapping("/registration")
    public ResponseEntity<Void> registration(@RequestBody RegistrationDto dto) {
        this.authService.registration(dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(LoginRequestDto loginDto) {
        LoginResponseDto dto = this.authService.login(loginDto);
        return ResponseEntity
                .ok()
                .header(HttpHeaders.AUTHORIZATION, dto.getToken())
                .body(dto);
    }

}
