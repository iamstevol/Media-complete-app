package com.iamstevol.media.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseStatusError {

    @JsonProperty("status_code")
    private int status;

    @JsonProperty("status_message")
    private String message;
}
