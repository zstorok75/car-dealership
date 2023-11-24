package com.car.dealership.backend.mapper;

import com.car.dealership.backend.dto.CustomerDto;
import com.car.dealership.backend.entity.CustomerEntity;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDto entityToDto(CustomerEntity entity) {
        throw new NotImplementedException("Function is not implemented yet");
    }

    public CustomerEntity dtoToEntity(CustomerDto dto) {
        throw new NotImplementedException("Function is not implemented yet");
    }
}
