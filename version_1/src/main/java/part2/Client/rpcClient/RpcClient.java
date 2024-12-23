package part2.Client.rpcClient;

import part2.common.Message.RpcResponse;
import part2.common.Message.RpcRequest;

public interface RpcClient {
    //定义底层通信的方法
    RpcResponse sendRequest(RpcRequest request);
}
