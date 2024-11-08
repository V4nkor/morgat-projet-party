package com.projetparty.projetparty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdressDto {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    private String street;
    private String city;
    private String region;
    private String country;
}
