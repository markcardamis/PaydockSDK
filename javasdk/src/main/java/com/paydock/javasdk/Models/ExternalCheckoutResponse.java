package com.paydock.javasdk.Models;

public class ExternalCheckoutResponse  extends Response
{
    public Resource resource;

    public static class Resource   
    {
        public String type;
        public Data data;
    }

    public static class Data   
    {
        public String checkout_type;
        public String link;
        public String reference_id;
        public String mode;
        public String token;
    }

}


