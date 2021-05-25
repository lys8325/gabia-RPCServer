package RPCServer.controller;

public class XMLServer {
    public String runVm(int macAddress){
        String response = String.format("%08d", macAddress) + " vm has been started!\n";
        System.out.println(response);

        return response;
    }

    public String stopVm(int macAddress){
        String response = String.format("%08d", macAddress) + " vm has been stopped!\n";
        System.out.println(response);

        return response;
    }
}
