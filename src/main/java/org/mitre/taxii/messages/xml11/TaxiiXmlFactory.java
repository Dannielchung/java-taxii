package org.mitre.taxii.messages.xml11;
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

import org.mitre.taxii.ResourcePaths;
import org.mitre.taxii.Versions;

/**
 * Class used to create instances of TaxiiXml for TAXII 1.1.
 * This factory ensures the TaxiiXml object is initialized properly and ready
 * for use.
 *
 * @author jasenj1
 */
public class TaxiiXmlFactory extends org.mitre.taxii.messages.TaxiiXmlFactory {

    /**
     * Generate a TaxiiXml object configured for TAXII 1.1 messages.
     *
     * @return a TaxiiXml object configured for TAXII 1.1 messages.
     */
    public TaxiiXml createTaxiiXml() {
        TaxiiXml tx = new TaxiiXml(
                Versions.VID_TAXII_XML_11,
                Versions.VID_TAXII_SERVICES_11,
                this.getClass().getPackage().getName(),
                this.getContextPackages(),
                ResourcePaths.TAXII_11_SCHEMA_RESOURCE,
                ResourcePaths.TAXII_11_SCHEMATRON_XSLT_RESOURCE);
        return tx;
    }

}
