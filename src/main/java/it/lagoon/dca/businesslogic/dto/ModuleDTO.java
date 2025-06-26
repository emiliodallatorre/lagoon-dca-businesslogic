package it.lagoon.dca.businesslogic.dto;

import java.util.Set;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ModuleDTO {
    final UUID id;
    
    final String title;
    final String description;
    final String pdfPath;
    
    final Set<FieldDTO> fields;
}
