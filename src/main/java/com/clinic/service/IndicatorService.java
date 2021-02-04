package com.clinic.service;

import com.clinic.dto.IndicatorDTO;
import com.clinic.dto.IndicatorsListDTO;

public interface IndicatorService
{
    IndicatorsListDTO getIndicatorsList();

    void addNewIndicator(IndicatorDTO indicator);

}
