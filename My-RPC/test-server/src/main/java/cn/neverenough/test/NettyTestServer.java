package cn.neverenough.test;

import cn.neverenough.rpc.api.HelloService;
import cn.neverenough.rpc.netty.server.NettyServer;
import cn.neverenough.rpc.registry.DefaultServiceRegistry;
import cn.neverenough.rpc.registry.ServiceRegistry;

public class NettyTestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry registry = new DefaultServiceRegistry();
        registry.register(helloService);
        NettyServer server = new NettyServer();
        server.start(9999);
    }

}

