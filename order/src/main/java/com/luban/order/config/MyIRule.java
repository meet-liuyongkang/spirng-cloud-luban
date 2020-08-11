package com.luban.order.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author <a href="mailto:jiangyue@dtstack.com">江月 At 袋鼠云</a>.
 * @description
 * @date 2020/8/11 8:20 下午
 */
public class MyIRule extends AbstractLoadBalancerRule {

    private Integer count = 0;
    private Integer index = 0;

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        ILoadBalancer lb = this.getLoadBalancer();
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                if (index < allList.size()) {
                    if (count < 2) {
                        server = (Server) upList.get(index);
                        count++;
                    } else {
                        server = (Server) upList.get(index++);
                        count = 0;
                    }
                } else {
                    index = 0;
                    count = 0;
                    server = (Server) upList.get(index);
                    count++;
                }

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }
}
