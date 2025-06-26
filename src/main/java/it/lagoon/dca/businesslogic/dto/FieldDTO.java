package it.lagoon.dca.businesslogic.dto;

import java.util.UUID;

import it.lagoon.dca.datamodel.data.enums.FieldType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class FieldDTO {
    private final UUID id;
    
    private final String title;
    private final String description;
    private final FieldType type;
}
