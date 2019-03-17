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
public class GenericStack<Obj extends Object>{
    private int top;
    private int sizeOfStack;
    private Obj[] arr;
    

    public GenericStack(int size){
        this.sizeOfStack=size;
        this.arr = (Obj[]) new Object[sizeOfStack];
        this.top=-1;
    }
    public void push(Obj x)
    {
        if(this.isFull())
        {
            System.out.println("Stack full");
        }
        System.out.println("Object add:" +x);
        this.arr[++top]=x;
    }
    public Obj pop()
    {
        if(this.isEmpty()){
            System.out.println("Stack empty");
        }
        Obj x=this.arr[top--];
        System.out.println("popped:"+x);
        return x;
        
    }
    
    public boolean isEmpty() {
        return (top==-1);
    }

    private boolean isFull() {
        return(top==sizeOfStack-1);
        }
    
}
