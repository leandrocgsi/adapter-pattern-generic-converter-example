/*
 * $Date: 2009-10-20 10:46:57 -0200 (ter, 20 out 2009) $
 * $Revision: 123402 $
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
 */
package br.com.erudio.utils.exception;


/**
 *
 */
public class AnalysisRequestException extends AbstractDelfosServiceException {

    private static final long serialVersionUID = -8589328126820625659L;


    public AnalysisRequestException(
        String message ) {

        super( message );
    }


    public AnalysisRequestException(
        Throwable t ) {

        super( t );
    }


    /**
     *
     */
    public AnalysisRequestException() {

        super();
    }


    /**
     * @param message
     * @param code
     */
    public AnalysisRequestException(
        String message,
        String code ) {

        super( message, code );
    }


    /**
     * @param message
     * @param cause
     * @param code
     */
    public AnalysisRequestException(
        String message,
        Throwable cause,
        String code ) {

        super( message, cause, code );
    }


    /**
     * @param message
     * @param cause
     */
    public AnalysisRequestException(
        String message,
        Throwable cause ) {

        super( message, cause );
    }


    /**
     * @param cause
     * @param code
     */
    public AnalysisRequestException(
        Throwable cause,
        String code ) {

        super( cause, code );
    }
}
