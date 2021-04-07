package io.github.VagnerBelfort;


import io.github.VagnerBelfort.domain.entity.Cliente;
import io.github.VagnerBelfort.domain.repositorio.Clientes;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            System.out.println("salvando clientes");
            clientes.salvar(new Cliente( "vagner"));
            clientes.salvar(new Cliente( "belfort"));

            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("atualizando clientes");
            todosClientes.forEach(c ->{
                c.setNome(c.getNome() + " atualizado ");
                clientes.atualizar(c);
            });

            System.out.println("buscando clientes");
            clientes.buscarPorNome("vagner").forEach(System.out::println);

            System.out.println("deletando clientes");
            clientes.obterTodos().forEach(c ->{
                clientes.deletar(c);
            });

            todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
