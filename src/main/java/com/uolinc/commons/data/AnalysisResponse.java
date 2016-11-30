/**
 * 
 */
package com.uolinc.commons.data;

import java.io.Serializable;


/**
 * @author tqi_evianna
 *
 */
public interface AnalysisResponse extends Serializable {

    String getRequestUUID();
    StatusType getStatus();
}
