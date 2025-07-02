package it.lagoon.dca.businesslogic.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.lagoon.dca.businesslogic.dto.CompilableModuleDTO;
import it.lagoon.dca.datamodel.data.jpa.module.CompilableModule;
import it.lagoon.dca.datamodel.data.jpa.module.CompilableModuleRepository;

@Service
public class CompilableModuleSrv {
    @Autowired
    private CompilableModuleRepository moduleRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public Iterable<CompilableModuleDTO> findAll() {
        final Iterable<CompilableModule> modules = moduleRepository.findAll();

        final List<CompilableModuleDTO> compilableModuleDTOs = new ArrayList<>();
        for (CompilableModule module : modules) {
            final CompilableModuleDTO moduleDTO = objectMapper.convertValue(module, CompilableModuleDTO.class);
            compilableModuleDTOs.add(moduleDTO);
        }

        return compilableModuleDTOs;
    }
}
