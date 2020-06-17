/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fhgh;

/**
 *
 * @author aluno09
 */
public class func {

    private String nome;
    private String Departamento;
    private int Salario;
    private String data;
    private String Rg;
    public String getNome(){
    return nome;
}
    public String getDepartamento(String departamento){
        return departamento;
    }
    public double getSalario(){
        return salario;
    }
    public String getdata(String data){
        return data;
    }
    public String getRg(String Rg){
        return Rg;
    }
     public void setNome(){
    this.nome = nome;
}
    public void setDepartamento(String departamento){
        this.Departamento = departamento;
    }
    public void setSalario(){
        this.Salario = salario;
    }
    public void setdata(String data){
        this.data = data;
    }
    public void setRg(String Rg){
        this.Rg = Rg;
    }
    private double GanhoAnual;
    
    private double RecebeAumento;
    private int salario;
    
    public double getRecebeAumento(double RecebeAumento){
        return RecebeAumento;
    }
    public void setRecebeAumento(double RecebeAumento){
        this.RecebeAumento = RecebeAumento;
    }
    public void getGanhoAnual(){
        double Ganho = salario * 12;
       
}
    @SuppressWarnings("SillyAssignment")
    public void setGanhoAnual(){
        this.GanhoAnual = GanhoAnual;
       
}
}
