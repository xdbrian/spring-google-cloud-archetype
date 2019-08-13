package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * Detalle de clientes.
 * @Autor xdbrian.steventh@gmai.com
 */
@Getter
@Setter
public class ClientResponse implements Serializable {
    private Integer id;
    private String nombre;
    private String apellido;
    private String sexo;
    private Integer edad;
    private String fechaacimiento;
    private Integer edadProbableMuerte;//https://d6wn6bmjj722w.cloudfront.net/1.0/life-expectancy/total/male/Peru/1990-12-21/
}
