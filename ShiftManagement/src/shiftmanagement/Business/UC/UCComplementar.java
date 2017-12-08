/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftmanagement.Business.UC;

import java.util.HashSet;
import shiftmanagement.Business.Turno.Turno;
import shiftmanagement.Business.Utilizador.Professor;

/**
 *
 * @author Tiago
 */
public class UCComplementar extends UC{
    
    private String diaSemana;
    private String per;
    
    public UCComplementar(){
        super();
        this.diaSemana = "";
        this.per = "";
    }
    
    public UCComplementar(String nome, String cod, String p, String diaSemana, String per, HashSet<Turno> turnos, HashSet<Professor> profs){
        super(nome, cod, p, turnos, profs);
        this.diaSemana = diaSemana;
        this.per = per;
    }
    
    public String getDiaS(){
        return this.diaSemana;
    }
    
    public String getPer(){
        return this.per;
    }
    
    public void setDiaS(String d){
        this.diaSemana = d;
    }
    
    public void setPer(String p){
        this.per = p;
    }
    
}
