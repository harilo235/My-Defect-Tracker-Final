package com.sgic.defect.dtoMapper;

import com.sgic.defect.dto.ModuleDto;
import com.sgic.defect.entity.Module;
import com.sgic.defect.service.ModuleServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleDtoMapper {

    @Autowired
    private ModuleServiceImpl moduleServiceImpl;

    ModelMapper modelMapper = new ModelMapper();

//    private ModuleDto EntityToDto(Module module){
//        ModuleDto moduleDto = modelMapper.map(module, ModuleDto.class);
//        return
//    }
}
