package br.com.tidicas.controller;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.tidicas.bean.Index;
import br.com.tidicas.bean.impl.IndexImpl;

/**
 * Classe controller secundário
 * @author Evaldo Junior
 *
 */
@ManagedBean
@ViewScoped
public class Page2Bean {
	
	public final String pagina = "Página 2";
	
	public Index getIndex() {
		Index index = new IndexImpl();
		index.setMensagem(pagina);
		return index;		
	}

	public void menuAction(){
        
        try {
			FacesContext.getCurrentInstance().
			getExternalContext().redirect("/primefaces/page2.jsf");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}