package org.mitre.taxii.client;
/*
Copyright (c) 2014, The MITRE Corporation
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.
    * Neither the name of The MITRE Corporation nor the 
      names of its contributors may be used to endorse or promote products
      derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */

import java.io.IOException;
import javax.net.ssl.SSLException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

/**
 * Abstract class that handles error responses received from a TAXII server.
 * 
 * @author jasenj1
 */
public abstract class HttpResponseErrorHandler {
    
    /**
     * We received a response that was not a 200 (Success)
     * value. Make up an appropriate Status Message.
     * 
     * @param response the HTTP response object.
     * @param msgIn the TAXII message received from the server.
     * @return StatusMessage based on the HTTP response code.
     */
    public abstract Object buildStatusCodeStatusMessage(CloseableHttpResponse response, Object message);
    
    /**
     * Construct an "UNAUTHORIZED" StatusMessage.
     * 
     * <p>Section 5.2 of the TAXII HTTP Protocol Binding Specification states:</p>
     * <p>
     * "If TLS is used, problems with the TLS handshake or connection are indicated
     * using a TLS Alert Protocol Record. This section defines rules for interpreting
     * a TLS Alert Protocol Record as a TAXII Status Message. Treat a TLS Alert
     * Protocol Record as being equivalent to a TAXII Status Message with the 
     * following properties:
     * </p>
     * <ul>
     * <li>Status = Use the appropriate TAXII Status Type as identified in Table 3.</li>
     * <li>Message = The TLS Alert, represented as a hexadecimal string."</li>
     * </ul>
     * <p>
     * Unfortunately, Java does not give us access to the TLS Alert, so we'll 
     * just make all the Statuses UNAUTHORIZED and return the exception's message.
     * </p>
     * 
     * @param ex
     * @param message
     * @return "UNAUTHORIZED" status message.
     */ 
    public abstract Object buildSSLErrorStatusMessage(SSLException ex, Object message);
    
    /**
     * Render the headers and the response content as a string.
     * This could include more things such as the status code.
     * 
     * @param response
     * @return A string consisting of the HTTP Response headers nicely formatted.
     */
     public String buildResponseStr(CloseableHttpResponse response) {
        StringBuilder sb = new StringBuilder();
        
        HeaderIterator hi = response.headerIterator();
        while (hi.hasNext()) {
            Header header = hi.nextHeader();
            sb.append(header.getName()).append(": ").append(header.getValue()).append("\r\n");                        
        }
        sb.append("\r\n");
        try {
            sb.append(EntityUtils.toString(response.getEntity()));            
        } catch (IOException | IllegalStateException ex) {
            // Don't care
        }
        
        return sb.toString();
    }
    
}
