package com.example.demo.expose;

import com.example.demo.service.ServiceAnalyze;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Gestiona métricas.
 *
 * @Autor xdbrian.steventh@gmail.com
 */
@RestController(value = "/api/v1/kpi")
@Api(value = "Gestión de métricas", description = "Realiza calculo de métricas en función de los clienttes")
public class KpiController {

    @Autowired
    private ServiceAnalyze serviceAnalyze;

    @GetMapping(value = "/kpi-clientes")
    @ApiOperation(value = "Obtiene métricas de clientes", response = List.class)
    public ResponseEntity<Object> getAll() {
        return ResponseEntity.ok(serviceAnalyze.kpideclientes());
    }


}