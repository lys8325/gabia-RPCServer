package RPCServer.controller;

import org.apache.log4j.Logger;

public class XMLServer {

    private Logger logger = Logger.getLogger(XMLServer.class);

    public String runVm(int macAddress){

        String response = String.format("%08d", macAddress) + " vm has been started!";
        logger.info(response);

        return response;

    }

    public String stopVm(int macAddress){

        String response = String.format("%08d", macAddress) + " vm has been stopped!";
        logger.info(response);

        return response;
        
    }

}
