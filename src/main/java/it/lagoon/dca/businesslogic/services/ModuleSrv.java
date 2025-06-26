package it.lagoon.dca.businesslogic.services;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.lagoon.dca.businesslogic.dto.ModuleDTO;
import it.lagoon.dca.datamodel.data.jpa.module.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleSrv {
    @Autowired
    private ModuleRepository moduleRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public Iterable<ModuleDTO> findAll() {
        final Iterable<it.lagoon.dca.datamodel.data.jpa.module.Module> modules = moduleRepository.findAll();

        final List<ModuleDTO> moduleDTOs = new ArrayList<>();
        for (it.lagoon.dca.datamodel.data.jpa.module.Module module : modules) {
            final ModuleDTO moduleDTO = objectMapper.convertValue(module, ModuleDTO.class);
            moduleDTOs.add(moduleDTO);
        }

        return moduleDTOs;
    }
}
