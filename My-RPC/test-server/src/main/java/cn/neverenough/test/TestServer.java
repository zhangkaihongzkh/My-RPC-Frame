package cn.neverenough.test;


import cn.neverenough.rpc.api.HelloService;
import cn.neverenough.rpc.registry.DefaultServiceRegistry;
import cn.neverenough.rpc.server.RpcServer;


public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        DefaultServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);
    }
}
