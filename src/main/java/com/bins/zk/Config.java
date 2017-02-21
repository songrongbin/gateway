package com.bins.zk;

public interface Config {
    byte[] getConfig(String path) throws Exception;
}