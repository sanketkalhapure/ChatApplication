/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

/**
 *
 * @author User
 */
public class ServerMain {
    public static void main(String[] args) {
        Server s=new Server();
        s.waitingForClient();
        s.setIoStreams();
    }
    
}
