package com.rizwan.authapi.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class AuthResponse {

    private String token;
}
