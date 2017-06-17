package com.paydock.paydocksdk.Services;

import com.paydock.paydocksdk.Models.CustomerItemResponse;
import com.paydock.paydocksdk.Models.CustomerItemsResponse;
import com.paydock.paydocksdk.Models.CustomerRequest;
import com.paydock.paydocksdk.Models.CustomerResponse;
import com.paydock.paydocksdk.Models.CustomerSearchRequest;
import com.paydock.paydocksdk.Models.CustomerUpdateRequest;
import com.paydock.paydocksdk.Models.GatewayItemResponse;
import com.paydock.paydocksdk.Models.GatewayItemsResponse;
import com.paydock.paydocksdk.Models.GatewayRequest;
import com.paydock.paydocksdk.Models.GatewayResponse;
import com.paydock.paydocksdk.Models.GatewayUpdateRequest;

/**
 * Created by Mark on 17/06/2017.
 */

public interface IGateways {

    GatewayResponse add(GatewayRequest request) throws Exception ;

    GatewayItemResponse delete(String GatewayId) throws Exception ;

    GatewayItemsResponse get() throws Exception ;

    GatewayItemResponse get(String GatewayId) throws Exception ;

    GatewayItemResponse update(GatewayUpdateRequest request) throws Exception ;
}