/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftmanagement.Business.Utilizador;

import java.util.ArrayList;
import shiftmanagement.Business.Turno.Turno;

/**
 *
 * @author Tiago
 */
public class Aluno extends Utilizador{
    
    private boolean trabalhador;
    private ArrayList<Turno> horario;
    
    public Aluno(){
        super();
        this.trabalhador = false;
    }
    
    public Aluno(String user, String nome, String mail, String pass, boolean trabalhador){
        super(user, nome, mail, pass);
        this.trabalhador = trabalhador;
    }
    
    public void adicionaTurno(Turno t){
        this.horario.add(t);
    }
    
    public ArrayList<Turno> getHorario(){
        ArrayList<Turno> res = new ArrayList<Turno>();
        for(Turno t: this.horario)
            res.add(t);
        return res;
    }
    
    public boolean verificaTrabalhador(){
        return this.trabalhador;
    }
    
    public boolean equals(Object o){
        if(o==null || this.getClass()!=o.getClass()) return false;
        if(o == this) return true;
        else {
            Aluno s = (Aluno) o;
            return (this.getNome().equals(s.getNome()) &&
                    this.getPass().equals(s.getPass()) && this.getMail().equals(s.getMail()) 
                    && this.verificaTrabalhador() == s.verificaTrabalhador() );
        }
    }
    
     public String toString() {
        StringBuffer sb = new StringBuffer("Aluno(");
        sb.append(this.getNome());
        sb.append(",");
        sb.append(this.getMail());
        sb.append(",");
        sb.append("Trabalhador: " +  this.verificaTrabalhador());
        sb.append(")");
        return sb.toString();
    }
}
