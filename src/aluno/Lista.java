/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno;

import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class Lista {
    ArrayList<Aluno> Lista;
    public Lista() {
        Lista = new ArrayList();
    }
    
    public void Adicionar(Aluno a) {
        Lista.add(a);
    }
}
