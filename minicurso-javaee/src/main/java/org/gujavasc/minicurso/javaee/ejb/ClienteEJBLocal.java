package org.gujavasc.minicurso.javaee.ejb;

import javax.ejb.Local;
import org.gujavasc.minicurso.javaee.jpa.Cliente;

/**
 *
 * @author rodrigo
 */
@Local
public interface ClienteEJBLocal {
    
    public void salvar(Cliente cliente);
    
}
