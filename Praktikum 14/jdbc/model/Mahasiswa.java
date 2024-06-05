/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author alfer
 */
public class Mahasiswa {

    private int id;
    private String nama;
    
    
    public Mahasiswa(){
    }
    
    public Mahasiswa(int id,String nama) {
       this.id = id;
       this.nama = nama;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id; 
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa { "+"id= "+ id +", nama= "+ nama + "}";
    }
}
