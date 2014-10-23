package org.gujavasc.minicurso.javaee.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.gujavasc.minicurso.javaee.jpa.Cliente;
import org.gujavasc.minicurso.javaee.ejb.ClienteEJBLocal;

/**
 *
 * @author rodrigo
 */

@Named("clienteManagedBean")
@RequestScoped
public class ClienteManagedBean {

    private Cliente cliente = new Cliente();
    
    @Inject
    private ClienteEJBLocal ejb;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String salvar() {
        //System.out.println("Cliente = " + cliente);
        ejb.salvar(cliente);
        return "sucesso";
    }
    
}
