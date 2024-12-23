package part2.common.Message;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
//定义请求信息格式RpcRequest
public class RpcRequest {
    //服务类名，客户端只知道接口
    private String interfaceName;
    //调用的方法名
    private String methodName;
    //参数列表
    private Object[] params;
    //参数类型
    private Class<?>[] paramsType;

}
