/*******************************************************************************
 * Copyright (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) 
 * 
 * All Rights Reserved. WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.ussdstub.dto;

import com.wso2telco.ussdstub.dto.ResponseRequest;
import com.wso2telco.ussdstub.dto.USSDAction;

// TODO: Auto-generated Javadoc
/**
 * The Class InboundUSSDMessageRequest.
 */
public class InboundUSSDMessageRequest {
    
    /** The address. */
    private String address;
    
    /** The session id. */
    private String sessionID;
    
    /** The short code. */
    private String shortCode;
    
    /** The keyword. */
    private String keyword;
    
    /** The inbound ussd message. */
    private String inboundUSSDMessage;
    
    /** The client correlator. */
    private String clientCorrelator;
    
    /** The response request. */
    private ResponseRequest responseRequest;
    
    /** The ussd action. */
    private USSDAction ussdAction;

    /**
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Gets the session id.
     *
     * @return the session id
     */
    public String getSessionID() {
        return this.sessionID;
    }

    /**
     * Gets the short code.
     *
     * @return the short code
     */
    public String getShortCode() {
        return this.shortCode;
    }

    /**
     * Gets the inbound ussd message.
     *
     * @return the inbound ussd message
     */
    public String getInboundUSSDMessage() {
        return this.inboundUSSDMessage;
    }

    /**
     * Gets the client correlator.
     *
     * @return the client correlator
     */
    public String getClientCorrelator() {
        return this.clientCorrelator;
    }

    /**
     * Gets the response request.
     *
     * @return the response request
     */
    public ResponseRequest getResponseRequest() {
        return this.responseRequest;
    }

    /**
     * Gets the ussd action.
     *
     * @return the ussd action
     */
    public USSDAction getUssdAction() {
        return this.ussdAction;
    }

    /**
     * Gets the keyword.
     *
     * @return the keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * Sets the session id.
     *
     * @param sessionID the new session id
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    /**
     * Sets the short code.
     *
     * @param shortCode the new short code
     */
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * Sets the keyword.
     *
     * @param keyword the new keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Sets the ussd action.
     *
     * @param ussdAction the new ussd action
     */
    public void setUssdAction(USSDAction ussdAction) {
        this.ussdAction = ussdAction;
    }

    /**
     * Sets the address.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the inbound ussd message.
     *
     * @param inboundUSSDMessage the new inbound ussd message
     */
    public void setInboundUSSDMessage(String inboundUSSDMessage) {
        this.inboundUSSDMessage = inboundUSSDMessage;
    }

    /**
     * Sets the client correlator.
     *
     * @param clientCorrelator the new client correlator
     */
    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    /**
     * Sets the response request.
     *
     * @param responseRequest the new response request
     */
    public void setResponseRequest(ResponseRequest responseRequest) {
        this.responseRequest = responseRequest;
    }
}