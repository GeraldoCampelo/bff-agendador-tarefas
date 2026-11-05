package com.javanauta.bffagendadortarefas.infrastructure.exceptions;

public class BusinessException extends RuntimeException {

    public BusinessException(String messagem) {super(messagem);}

    public BusinessException(String messagem, Throwable cause) {super(messagem,cause);}
}
