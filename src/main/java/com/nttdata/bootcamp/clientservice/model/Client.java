package com.nttdata.bootcamp.clientservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
    private LocalDateTime createdAt;
}
