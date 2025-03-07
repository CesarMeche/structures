package model;

import structure.MyQueueu;
import structure.MyStock;

public class PalindromValidator {


    MyQueueu<Character> next;
    MyStock<Character> last;
    char[] aux;
    public boolean isPalindrom(String palin) {
        aux = palin.toCharArray();
        next = new MyQueueu<Character>();
        last = new MyStock<Character>();

        for (int i = 0; i < aux.length; i++) {
            exclude(i);
        }
        return validate();
    }
    private void exclude(int i){
        if (aux[i]>='A'&&aux[i]<='Z'||aux[i]>='a'&&aux[i]<='z') {
            next.push(aux[i]);
            last.push(aux[i]);
        }
    }
    private boolean validate(){
        while (!next.isEmpty()) {
           char a= next.poll();
           char b=last.pop();
           if (a!=b) {
            return false;
           }
        }
        return true;
    }

}
