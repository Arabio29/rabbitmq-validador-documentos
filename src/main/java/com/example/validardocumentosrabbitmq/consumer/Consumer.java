package com.example.validardocumentosrabbitmq.consumer;

import com.example.validardocumentosrabbitmq.MessagingConfig.MessaginConfig;
import com.example.validardocumentosrabbitmq.dto.DocumentoStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @RabbitListener(queues = MessaginConfig.QUEUE)
    public void consumeDocumentoFromQueue(DocumentoStatus documentoStatus){
        System.out.println("Documento recibido, voy a procesarlo :) " + documentoStatus);
    }
}
