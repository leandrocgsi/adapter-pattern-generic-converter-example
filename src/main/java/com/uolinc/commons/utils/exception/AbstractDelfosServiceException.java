/*
 * $Date$
 * $Revision$
 */

/* Copyright (c) - UOL Inc,
 * Todos os direitos reservados
 *
 * Este arquivo e uma propriedade confidencial do Universo Online Inc.
 * Nenhuma parte do mesmo pode ser copiada, reproduzida, impressa ou
 * transmitida por qualquer meio sem autorizacao expressa e por escrito
 * de um representante legal do Universo Online Inc.
 *
 * All rights reserved
 *
 * This file is a confidential property of Universo Online Inc.
 * No part of this file may be reproduced or copied in any form or by
 * any means without written permisson from an authorized person from
 * Universo Online Inc.
 *
 */
package com.uolinc.commons.utils.exception;


/**
 *
 */
public class AbstractDelfosServiceException extends Exception {

    private static final long serialVersionUID = 7112745954082566540L;

    private String code;


    public AbstractDelfosServiceException() {

    }


    /**
     * @param message
     */
    public AbstractDelfosServiceException(
        String message ) {

        super( message );
    }


    public AbstractDelfosServiceException(
        String message,
        String code ) {

        super( message );
        this.code = code;
    }


    /**
     * @param cause
     */
    public AbstractDelfosServiceException(
        Throwable cause ) {

        super( cause );
    }


    public AbstractDelfosServiceException(
        Throwable cause,
        String code ) {

        super( cause );
        this.code = code;
    }


    /**
     * @param message
     * @param cause
     */
    public AbstractDelfosServiceException(
        String message,
        Throwable cause ) {

        super( message, cause );
    }


    public AbstractDelfosServiceException(
        String message,
        Throwable cause,
        String code ) {

        super( message, cause );
        this.code = code;
    }


    public String getCode() {

        return code;
    }

}
