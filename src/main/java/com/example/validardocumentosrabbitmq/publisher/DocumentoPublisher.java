package com.example.validardocumentosrabbitmq.publisher;

import com.example.validardocumentosrabbitmq.MessagingConfig.MessaginConfig;
import com.example.validardocumentosrabbitmq.dto.DocumentoDTO;
import com.example.validardocumentosrabbitmq.dto.DocumentoStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class DocumentoPublisher {
    @Autowired
    private RabbitTemplate template;

    @PostMapping("/rabbitmq")
    public String colaDocumento(@RequestBody List<DocumentoDTO> documentos){
        try {
        DocumentoStatus documentoStatus = new DocumentoStatus(documentos, "Process", "la validación del documento está en proceso ");

        template.convertAndSend(MessaginConfig.EXCHANGE, MessaginConfig.ROUTING_KEY, documentoStatus);

        return "Tú documento xlsx se ha enviado con exito !!";

        } catch (Exception e) {
            // Manejar errores
            return "Ha ocurrido un error al procesar la solicitud: " + e.getMessage();
        }
    }
}
