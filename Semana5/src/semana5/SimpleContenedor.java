/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author jose.avila
 */
public interface SimpleContenedor<AnyType> {
    void insert(AnyType t);
    void remove(AnyType t);
    AnyType find(AnyType t);
    
    boolean isEmpty();
    void makeEmpty();
}
