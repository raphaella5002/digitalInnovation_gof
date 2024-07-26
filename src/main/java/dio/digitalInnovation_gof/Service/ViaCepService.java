package dio.digitalInnovation_gof.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dio.digitalInnovation_gof.Model.Endereço;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
    
public interface ViaCepService {

    @RequestMapping (method = RequestMethod.GET, value = "/{cep}/json/")
    Endereço consultarCep(@PathVariable ("cep") String cep);
}
