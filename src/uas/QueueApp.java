/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author LENOVO
 */
public class QueueApp {
    public static void main(String[] args){
        Queue antrian = new Queue(10);
        antrian.enqueue(50);
        antrian.display();
        antrian.enqueue(20);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        antrian.enqueue(80);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        antrian.enqueue(55);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.print("Nama saya Rizki Agung Alamsyah");
    }
}
