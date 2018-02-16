/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samquigley.jmdns;

import java.io.IOException;

import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
/**
 *
 * @author samq2
 */
public class ExampleServiceRegistration {
    public static void main(String[] args) throws InterruptedException{
    
        try
        {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "example", 1234, "path=index.html");
            jmdns.registerService(serviceInfo);
        }
        catch(IOException e){   
            System.out.println(e.getMessage());
        }      
    }
}
