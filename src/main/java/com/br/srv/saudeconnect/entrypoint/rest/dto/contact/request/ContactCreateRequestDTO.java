package com.br.srv.saudeconnect.entrypoint.rest.dto.contact.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactCreateRequestDTO {
    private String email;
    private String phone;
    private String instagram;
    private String facebook;
}
