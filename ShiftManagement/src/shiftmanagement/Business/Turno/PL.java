/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftmanagement.Business.Turno;

import java.sql.Time;

/**
 *
 * @author Tiago
 */
public class PL extends Turno{
    
    private int alunos;
    private int maxAlunos;
    
    public PL(){
        super();
        this.maxAlunos = 0;
        this.alunos = 0;
    }
    
    public PL(String id, String uc, int max, Time l, int n, String dia){
        super(id, uc, l, n, dia);
        this.maxAlunos = max;
    }
    
    public PL(String id, int max, Sala s, String p, Time l, String uc, int n, String dia, int a){
        super(id, s, p, l, uc, n, dia);
        this.maxAlunos = max;
        this.alunos = a;
    }
    
    public int getMax(){
        return this.maxAlunos;
    }
    
    public void setMax(int m){
        this.maxAlunos = m;
    }
    
    public int getAlunos(){
        return this.alunos;
    }
    
    public void setAlunos(int x){
        this.alunos = x;
    }
    
}
