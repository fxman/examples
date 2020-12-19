package xinfan.example.rpc.framework.registry;

import xinfan.example.rpc.framework.extension.SPI;

import java.net.InetSocketAddress;

/**
 * 服务注册接口
 */
@SPI
public interface ServiceRegistry {
    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);
}
