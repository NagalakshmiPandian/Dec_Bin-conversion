/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nagamvcc.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;
import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
import org.nagamvcc.model.Converter;
/**
 *
 * @author Admin
 */
@ManagedBean(name = "converterController")
public class ConverterController {
    
    private Converter converter = new Converter();
    private UIInput numberInput;
    private UIPanel resultPanel;
    
    public Converter getConverter(){
        return converter;
    }
    public void setConverter(Converter converter){
        this.converter = converter;
    }
    public UIPanel getResultPanel(){
        return resultPanel;
    }
    public void setResultPanel(UIPanel resultpanel){
        this.resultPanel = resultpanel;
    }
    public UIInput getNumberInput(){
        return numberInput;
    }
    public void setNumberInput(UIInput numberInput){
        this.numberInput = numberInput;
    }
    
    public String toBinary(){
        FacesContext ctx = FacesContext.getCurrentInstance();
        try {
            converter.toBinary();
            resultPanel.setRendered(true);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
            "Decimal number is converted into binary", null));
            
        }catch (Exception ex){
            resultPanel.setRendered(false);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(),null));
            
        }
        return null;
    }
    public String toHex(){
        FacesContext ctx = FacesContext.getCurrentInstance();
        try {
            converter.toHex();
            resultPanel.setRendered(true);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
            "Decimal number is converted into Hexadecimal",null));
            
        }catch (Exception ex){
            resultPanel.setRendered(false);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(),null));
            
        }
        return null;
   
    }
    public String toOctal(){
        FacesContext ctx = FacesContext.getCurrentInstance();
        try {
            converter.toOctal();
            resultPanel.setRendered(true);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
            "Decimal number is converted into Octal",null));
            
        }catch (Exception ex){
            resultPanel.setRendered(false);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(),null));
            
        }
        return null;
    }
    public String clear(){
        FacesContext ctx = FacesContext.getCurrentInstance();
        try {
            converter.clear();
            resultPanel.setRendered(true);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
            "Results cleared",null));
            
        }catch (Exception ex){
            resultPanel.setRendered(false);
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(),null));
            
        }
        return null;
        }
}
