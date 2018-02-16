/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samquigley.jmdns;

import java.io.IOException;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

/**
 *
 * @author samq2
 */
public class ExampleServiceDiscovery {

    private static class SampleListener implements ServiceListener{
        
        @Override
        public void serviceAdded (ServiceEvent event){
            System.out.println(" Service added : " + event.getInfo());
        }
        
        @Override
        public void serviceRemoved (ServiceEvent event ){
            System.out.println(" Service removed : " + event.getInfo());
        }
        
        @Override
        public void serviceResolved ( ServiceEvent event){
            System.out.println("Service resolved:" + event.getInfo());
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            // Add a service listener
            jmdns.addServiceListener("_http._tcp.local." , new SampleListener()) ;
        } 
        catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
