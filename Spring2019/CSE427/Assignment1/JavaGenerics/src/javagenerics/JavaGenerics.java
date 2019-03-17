/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;

/**
 *
 * @author Yen
 */
public class JavaGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GenericStack<Integer> IntStk=new GenericStack<Integer>(4);
        GenericStack<Double> DblStk=new GenericStack<Double>(4);
        GenericStack<Character> CharStk=new GenericStack<Character>(4);
        GenericStack<String> StrStk=new GenericStack<String>(4);

        IntStk.push(4);
        DblStk.push(3.33);
        CharStk.push('a');
        StrStk.push("North South University||CSE427");
        IntStk.push(16352163);
        IntStk.pop();
        IntStk.push(16352163);
    }
    
}
