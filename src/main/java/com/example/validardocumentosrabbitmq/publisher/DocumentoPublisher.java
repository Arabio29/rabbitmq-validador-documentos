package com.example.validardocumentosrabbitmq.publisher;

import com.example.validardocumentosrabbitmq.MessagingConfig.MessaginConfig;
import com.example.validardocumentosrabbitmq.dto.DocumentoDTO;
import com.example.validardocumentosrabbitmq.dto.DocumentoStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/documento")
public class DocumentoPublisher {
    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{nombreDocumento}")
    public String colaDocumento(@RequestBody DocumentoDTO documento, @PathVariable String nombreDocumento){

        DocumentoStatus documentoStatus = new DocumentoStatus(documento, "Process", "la validación del documento está en proceso " + nombreDocumento);
        documento.generarIdUnico();

        template.convertAndSend(MessaginConfig.EXCHANGE, MessaginConfig.ROUTING_KEY, documentoStatus);

        return "Tú documento xlsx se ha enviado con exito !!";
    }
}
