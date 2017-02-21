package com.bins.api;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.bins.mongodb.model.Customer;
import com.bins.utils.DubboUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bins.baseframe.dto.req.*;

@Controller
@RequestMapping(value = "/")
public class ProxyController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "{optype}/{module}/{function}.do", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public Object singleRequest(@PathVariable String optype,
                                @PathVariable String module, @PathVariable String function, HttpServletRequest request) {

        String url = optype + "/" + module + "/" + function + ".do";
        Object ret = dynamicInvokeService(request, optype, module, function);
        return ret;
    }

    private Object dynamicInvokeService(HttpServletRequest request, String optype, String module, String function) {
        Object o = null;
        if ("get".equals(optype)) {
        	if (module.equals("trade")) {
                ReferenceConfig<GenericService> reference = DubboUtil.buildConfig("zookeeper://127.0.0.1:2181", "gateway", "com.bins.baseframe.api.BaseFrameApi", "1.0.0");
                GenericService genericService = reference.get(); // 用com.alibaba.dubbo.rpc.service.GenericService可以替代所有接口引用
                // 基本类型以及Date,List,Map等不需要转换，直接调用

                HelloWorldReqDto req = new HelloWorldReqDto();

                o = genericService.$invoke("baseFrameApi", new String[] {"com.bins.baseframe.dto.req.HelloWorldReqDto"}, new Object[] {req});
            } else {
        		o = getResult(request);
        	}
        } else if ("post".equals(optype)){
            o = postResult(request);
        } else {
            o = 123;
        }
        return o;
    }

    private Object postResult(HttpServletRequest request) {
        return "12";
    }

    private Object getResult(HttpServletRequest request) {
        Customer c = new Customer();
        c.setFirstName("andy");
        c.setLastName("bin");
        mongoTemplate.insert(c);
        return 1;
    }
}