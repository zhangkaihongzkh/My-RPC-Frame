package cn.neverenough.test;

import cn.neverenough.rpc.RpcClient;
import cn.neverenough.rpc.RpcClientProxy;
import cn.neverenough.rpc.api.HelloObject;
import cn.neverenough.rpc.api.HelloService;
import cn.neverenough.rpc.netty.client.NettyClient;

public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient("127.0.0.1", 9999);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }

}

