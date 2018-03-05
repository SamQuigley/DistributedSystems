
package com.learn.mqttexample;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;


class SampleSubscriber implements MqttCallback {

    public SampleSubscriber() {
    }

    @Override
    public void connectionLost(Throwable thrwbl) {
    }

    @Override
    public void messageArrived(String string, MqttMessage mm) throws Exception {
        System.out.println(mm + " arrived from topic " + string);
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken imdt) {
    }
    
}
