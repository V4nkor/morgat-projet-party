package com.projetparty.projetparty.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private int age;

    private List<InterestDto> interests;
    private List<RatingDto> ratings;
    private List<MessageDto> receivedMessages;
    private List<MessageDto> sentMessages;
}
