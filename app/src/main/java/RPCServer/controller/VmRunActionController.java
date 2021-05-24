package RPCServer.controller;

import org.restlet.resource.ServerResource;
import org.restlet.resource.Get;

public class VmRunActionController extends ServerResource{

    @Get
    public void runVm() {
        String targetMacAddressString = (String)this.getRequestAttributes().get("macAddress");
        int targetMacAddress = Integer.parseInt(targetMacAddressString);

        System.out.println(String.format("%08d", targetMacAddress) + " vm has been started!\n");
    }
    
}