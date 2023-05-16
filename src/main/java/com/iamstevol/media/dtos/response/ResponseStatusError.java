package com.iamstevol.media.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.iamstevol.media.constants.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ResponseStatusError {

    @JsonProperty("status_code")
    private int status;

    @JsonProperty("status_message")
    private String message;

}
