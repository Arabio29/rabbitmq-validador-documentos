package com.example.validardocumentosrabbitmq.dto;


public class DocumentoStatus {
    private DocumentoDTO documento;
    private String status;
    private String message;

    public DocumentoStatus(DocumentoDTO documento, String status, String message) {
        this.documento = documento;
        this.status = status;
        this.message = message;
    }

    public DocumentoDTO getDocumento() {
        return documento;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setDocumento(DocumentoDTO documento) {
        this.documento = documento;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


