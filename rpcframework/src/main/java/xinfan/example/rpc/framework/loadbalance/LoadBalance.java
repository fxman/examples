package xinfan.example.rpc.framework.loadbalance;

import xinfan.example.rpc.framework.extension.SPI;

import java.util.List;

/**
 * Interface to the load balancing policy
 */
@SPI
public interface LoadBalance {
    /**
     * Choose one from the list of existing service address list
     * @param serviceAddress Service address lsit
     * @param rpcServiceName
     * @return target service address
     */
    String selectServiceAddress(List<String>serviceAddress,String rpcServiceName);
}
