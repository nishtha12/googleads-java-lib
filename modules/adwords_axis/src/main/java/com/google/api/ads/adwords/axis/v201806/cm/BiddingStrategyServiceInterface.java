// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * BiddingStrategyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;

public interface BiddingStrategyServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of bidding strategies that match the selector.
     * 
     *         
     * @return list of bidding strategies specified by the selector.
     *         
     * @throws com.google.ads.api.services.common.error.ApiException if problems
     * occurred while retrieving results.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.BiddingStrategyPage get(com.google.api.ads.adwords.axis.v201806.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     *         
     * @param operations the operations to apply
     *         
     * @return the modified list of BiddingStrategy
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201806.cm.BiddingStrategyReturnValue mutate(com.google.api.ads.adwords.axis.v201806.cm.BiddingStrategyOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;

    /**
     * Returns a list of bidding strategies that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @throws ApiException when there are one or more errors with the request.
     */
    public com.google.api.ads.adwords.axis.v201806.cm.BiddingStrategyPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201806.cm.ApiException;
}
