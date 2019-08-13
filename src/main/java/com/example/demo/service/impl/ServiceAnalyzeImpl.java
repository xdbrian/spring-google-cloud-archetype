package com.example.demo.service.impl;

import com.example.demo.model.ClientResponse;
import com.example.demo.model.KpiClienteResponse;
import com.example.demo.service.ServiceAnalyze;
import com.example.demo.service.ServiceClient;
import com.example.demo.util.AnalyzeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Getión de métricas.
 *
 * @Autor xdbrian.steventh@gmai.com
 */
@Service
public class ServiceAnalyzeImpl implements ServiceAnalyze {

    @Autowired
    private ServiceClient serviceClient;

    /**
     * Cálculo KPI de clientes.
     */
    @Override
    public KpiClienteResponse kpideclientes() {
        KpiClienteResponse kpiClienteResponse = new KpiClienteResponse();

        List<Integer> listAge = serviceClient.list().stream()
                .map(ClientResponse::getEdad)
                .collect(Collectors.toList());

        Float average = AnalyzeUtil.average.apply(listAge);
        kpiClienteResponse.setAverage(average);

        List<Integer> listAges = serviceClient.list().stream().map(ClientResponse::getEdad).collect(Collectors.toList());
        kpiClienteResponse.setStandardDesviation(AnalyzeUtil.desviationStandard.apply(listAges));
        return kpiClienteResponse;
    }

}
