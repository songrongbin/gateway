package com.bins.zk;


import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.data.Stat;

public class ZooKeeperConfig implements Config {

    public byte[] getConfig(String path) throws Exception {
        CuratorFramework client = ZooKeeperFactory.get();
        System.out.println(client.getData());
        if (!exists(client, path)) {
            throw new RuntimeException("Path " + path + " does not exists.");
        }
        return client.getData().forPath(path);
    }
     
    private boolean exists(CuratorFramework client, String path) throws Exception {
        Stat stat = client.checkExists().forPath(path);
        return !(stat == null);
    }
 
}