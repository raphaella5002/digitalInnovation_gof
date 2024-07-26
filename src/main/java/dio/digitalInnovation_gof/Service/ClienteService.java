package dio.digitalInnovation_gof.Service;

import dio.digitalInnovation_gof.Model.Cliente;

public interface ClienteService {
        Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir (Cliente cliente);

    void atualizar (Long id, Cliente cliente);

    void deletar (Long id);
}
