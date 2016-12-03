/**
 * 
 */
package com.uolinc.commons.patterns.analysis.data;

import com.uolinc.commons.data.AnalysisResponse;
import com.uolinc.commons.data.StatusType;


/**
 * @author tqi_evianna
 *
 */
public class AbstractAnalysisResponse implements AnalysisResponse {

    private static final long serialVersionUID = 1L;

    private String requestUUID;
    private StatusType status;

    /**
     * 
     */
    public AbstractAnalysisResponse() {
        super();
    }
    
    /**
     * 
     * @param requestUUID
     */
    public AbstractAnalysisResponse(final String requestUUID, final StatusType status) {
        this.requestUUID = requestUUID;
        this.status = status;
    }
    /*
     * (non-Javadoc)
     * @see com.uolinc.commons.data.AnalysisResponse#getRequestUUID()
     */
    public String getRequestUUID() {
        return this.requestUUID;
    }

    /*
     * (non-Javadoc)
     * @see com.uolinc.commons.data.AnalysisResponse#getStatus()
     */
    public StatusType getStatus() {
        return this.status;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AbstractAnalysisResponse [requestUUID=" + requestUUID + ", status=" + status + "]";
    }
}