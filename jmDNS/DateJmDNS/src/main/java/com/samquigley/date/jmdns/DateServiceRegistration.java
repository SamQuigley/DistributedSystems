/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samquigley.date.jmdns;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
/**
 *
 * @author samq2
 */
public class DateServiceRegistration {
    public static void main(String[] args) throws InterruptedException{
    Date date = new Date();
        try
        {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "example", 1234, "path=index.html");
            jmdns.registerService(serviceInfo);
            System.out.print(date.toString());
        }
        catch(IOException e){   
            System.out.println(e.getMessage());
        }      
    }
}
