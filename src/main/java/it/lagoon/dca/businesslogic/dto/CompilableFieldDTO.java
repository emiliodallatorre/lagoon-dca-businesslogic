package it.lagoon.dca.businesslogic.dto;

import java.util.UUID;

import it.lagoon.dca.datamodel.data.enums.CompilableFieldType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CompilableFieldDTO {
    private final UUID id;
    
    private final String title;
    private final String description;
    private final CompilableFieldType type;
}
