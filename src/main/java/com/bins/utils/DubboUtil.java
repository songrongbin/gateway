package com.bins.utils;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by songrongbin on 2016/9/28.
 */
public class DubboUtil {
    public static ReferenceConfig<GenericService> buildConfig(String address, String appName, String interfaceName, String dubboVesion) {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(address);

        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(appName);
        applicationConfig.setId(appName);

        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();
        reference.setInterface(interfaceName);
        reference.setGeneric(true);
        reference.setApplication(applicationConfig);
        reference.setVersion(dubboVesion);
        reference.setRegistry(registryConfig);
        return  reference;
    }
}
