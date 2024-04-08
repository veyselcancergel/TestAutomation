package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateTokenResponse {
    @JsonProperty("token")
    public String token;

    @JsonProperty("expires")
    public Object expires;

    @JsonProperty("status")
    public String status;

    @JsonProperty("result")
    public String result;
}
