package model;

import java.util.Scanner;

import structure.PriorityQueue;

public class uwu {
    PriorityQueue<String> pq = new PriorityQueue<String>(

            4);
    Scanner s;
    int kid=1;
    int women=1;
    int oldPeople=1;
    int regular=1;

    public void menu() {
        s = new Scanner(System.in);
        int m = 0;
        while (m != 3) {
            System.out.println("Bienvenido\n1.Sacar punto\n2.Pasar turno");
            m = s.nextInt();
            switch (m) {
                case 1:
                    addTrurn();
                    break;
                case 2:
                    nextTrun();
                    break;
                default:
                    break;
            }
        }
    }

    public void addTrurn() {
        System.out.println("Quien Tomara el turno?\n1.Un niño\n2.Un anciano\n3.Una mujer\n4.Otros");
        int sm = s.nextInt();
        String turn = "";
        switch (sm) {
            case 1:
                turn = "A" + kid;

                kid++;
                break;
            case 2:
                turn = "B" + oldPeople;

                oldPeople++;
                break;
            case 3:
                turn = "C" + women;
                women++;
                break;
            case 4:
                turn = "D" + regular;
                regular++;
                break;

            default:
                break;
        }
        
        System.out.println("Tu turno es: " + turn);
        pq.push(turn, sm - 1);
    }

    public void nextTrun() {
        if (pq.peak()==null) {
            System.out.println("No hay turnos");
        }else{

            System.out.println(
                pq.poll()
                
                );
            }
    }
}
