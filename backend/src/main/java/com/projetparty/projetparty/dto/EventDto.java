package com.projetparty.projetparty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    private String name;
    private String description;
    private Date startDate;
    private Time startTime;
    private Boolean isFree;
    private float price;
    private Integer reservedNb;
    private Integer maxNb;
    private boolean isSuppliesNeeded;

    private ThemeDto theme;
    private AdressDto adress;
    private List<GameDto> games;
}
