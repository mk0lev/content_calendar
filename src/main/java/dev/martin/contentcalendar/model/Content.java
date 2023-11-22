package dev.martin.contentcalendar.model;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public record Content(
        Integer id,
        @NotBlank
        String title,
        @NotBlank
        String desc,
        Status status,
        Type ContentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {}
