package org.gujavasc.minicurso.javaee.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.gujavasc.minicurso.javaee.jpa.Cliente;

/**
 *
 * @author rodrigo
 */
@Stateless
public class ClienteEJB implements ClienteEJBLocal {

    @PersistenceContext
    private EntityManager manager;
    
    public void salvar(Cliente cliente) {        
        //manager.getTransaction().begin();
        manager.persist(cliente);
        //manager.getTransaction().commit();
    }
}
