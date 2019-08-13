package com.example.demo.service.impl;

import com.example.demo.model.ClientRequest;
import com.example.demo.model.ClientResponse;
import com.example.demo.model.ExpectativeLifeResponse;
import com.example.demo.service.ServiceClient;
import com.example.demo.util.ClientAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//import review.intercorp.client.external.model.ApiExpectativeLife;


/**
 * Getión de información de cliente.
 *
 * @Autor xdbrian.steventh@gmai.com
 */
@Service
public class ServiceClientImpl implements ServiceClient {

    private List<ClientResponse> memory;

    ServiceClientImpl() {
        memory = new ArrayList<>();
    }


//    @Autowired
//    private ApiExpectativeLife apiExpectativeLife;

    /**
     * Lista cliente.
     *
     * @return
     */
    @Override
    public List<ClientResponse> list() {


//        memory.stream().forEach( item -> {
//            ExpectativeLifeResponse expectativeLifeResponse = getExpectativeLife(
//                    item.getSexo(),
//                    item.getFechaacimiento());
//
//            item.setEdadProbableMuerte(expectativeLifeResponse.getTotalLifeExpectancy().intValue());
//        });
        return memory;
    }


    private ExpectativeLifeResponse getExpectativeLife(String sexo, String fechaacimiento) {
//        try {
//            return apiExpectativeLife.expectativeLife(SexEnum.get(sexo).getCodeExternal(),"Peru",fechaacimiento).execute().body();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return null;
    }

    /**
     * Retorna clientes por ID
     *
     * @param id
     * @return
     */
    @Override
    public ClientResponse get(Integer id) {
        return null;
    }

    /**
     * Agrega clientes a memoria
     *
     * @param rq
     * @return
     */
    @Override
    public ClientResponse add(ClientRequest rq) {

        ClientResponse clientResponse = ClientAdapter.toRs.apply(rq, memory.size());
        memory.add(clientResponse);

        return clientResponse;
    }

    /**
     * Remueve cliente de memoria por id
     *
     * @param id
     */
    @Override
    public void remove(Integer id) {
        memory.remove(id);
    }

    /**
     * Remueve todos los clientes
     */
    @Override
    public void removeAll() {
        memory.clear();
    }
}
