package com.projetparty.projetparty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThemeDto {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    private String type;
    private String label;
}
