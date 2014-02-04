/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.praticasolucoes.exemplo.jpa.hibernate.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UICommand;
import javax.faces.event.ActionEvent;



/**
 *
 * @author edney
 */
@ManagedBean
public class TextoBean {
  private String texto;
  
  public String tranformaEmCaixaAlta(ActionEvent e) {
     
      UICommand c = (UICommand) e.getComponent();
      System.out.println(c.getAttributes().get("chave"));
      
      this.setTexto(this.getTexto().toUpperCase());
      return "formulario";
  }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
  
          
    
    
}
