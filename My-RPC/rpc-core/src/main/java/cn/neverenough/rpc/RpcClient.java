package cn.neverenough.rpc;

import cn.neverenough.entity.RpcRequest;

public interface RpcClient {
    Object sendRequest(RpcRequest rpcRequest);

}
