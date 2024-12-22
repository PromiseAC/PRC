package part1.common.Message;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//定义返回信息格式RpcResponse（类似http格式）
public class RpcResponse {
    //状态码
    private int code;
    //状态信息
    private String message;
    //具体数据
    private Object data;
    //构造成功信息
    public static RpcResponse sussess(Object data) {
        return RpcResponse.builder().code(200).data(data).build();
    }
    //构造失败信息
    public static RpcResponse fail() {
        return RpcResponse.builder().code(500).message("服务器发生错误").build();
    }
}
