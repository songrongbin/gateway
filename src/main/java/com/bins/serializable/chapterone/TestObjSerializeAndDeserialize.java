package com.bins.serializable.chapterone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;

/**
 * <p>ClassName: TestObjSerializeAndDeserialize<p>
 * <p>Description: 测试对象的序列化和反序列<p>
 * @author xudp
 * @version 1.0 V
 * @createTime 2014-6-9 下午03:17:25
 */
public class TestObjSerializeAndDeserialize {

    public static void main(String[] args) throws Exception {
        SerializePerson();//序列化Person对象
        Person p = DeserializePerson();//反序列Perons对象
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",
                                                 p.getName(), p.getAge(), p.getSex()));
    }
    
    /**
     * MethodName: SerializePerson 
     * Description: 序列化Person对象
     * @author xudp
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void SerializePerson() throws FileNotFoundException,
            IOException {
        Person person = new Person();
        person.setName("gacl");
        person.setAge(25);
        person.setSex("男");
        // ObjectOutputStream 对象输出流，将Person对象存储到E盘的Person.txt文件中，完成对Person对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("E:/Person.txt")));
        oo.writeObject(person);
        System.out.println("Person对象序列化成功！");
        oo.close();
    }

    /**
     * MethodName: DeserializePerson 
     * Description: 反序列Perons对象
     * @author xudp
     * @return
     * @throws Exception
     * @throws IOException
     */
    private static Person DeserializePerson() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("E:/Person.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("Person对象反序列化成功！");
        return person;
    }

    private String getBodyJson() {

        String tradeinfo = "{\"region\":\"朝阳区(五环里)\",\"provinceId\":11000000,\"zip\":null,\"phone\":null,\"idCard\":null,\"status\":1,\"cityId\":11010000,\"street\":\"全部区域\",\"city\":\"北京市\",\"id\":447,\"updatedAt\":\"2016-06-14 10:50:03\",\"details\":\"霄云路鹏润大厦\",\"streetId\":110102001,\"isDefault\":1,\"createdAt\":\"2016-06-14 10:50:03\",\"name\":\"宋荣彬\",\"userId\":1027,\"province\":\"北京\",\"regionId\":11010200,\"mobile\":\"18629437310\"}";

        return "{\n" +
                "    \"addressId\":110102001,\n" +
                "    \"addressJson\":\"{\"region\":\"朝阳区(五环里)\",\"provinceId\":11000000,\"zip\":null,\"phone\":null,\"status\":1,\"cityId\":11010000,\"street\":\"全部区域\",\"city\":\"北京市\",\"updatedAt\":\"2016-06-14 10:50:03\",\"id\":447,\"details\":\"霄云路鹏润大厦\",\"streetId\":110102001,\"isDefault\":1,\"createdAt\":\"2016-06-14 10:50:03\",\"userId\":1027,\"name\":\"宋荣彬\",\"province\":\"北京\",\"mobile\":\"18629437310\",\"regionId\":11010200}\",\n" +
                "    \"buyer\":{\n" +
                "        \"id\":1027,\n" +
                "        \"mobile\":\"18629437310\",\n" +
                "        \"name\":\"Andybins\"\n" +
                "    },\n" +
                "    \"coupons\":[\n" +
                "\n" +
                "    ],\n" +
                "    \"deliveryJson\":\"{\"needConfirmation\":true,\"memo\":\"无\",\"receivingTimeType\":1}\",\n" +
                "    \"gomeMoney\":0,\n" +
                "    \"invoiceJson\":\"{\"content\":\"键盘\",\"title\":\"*公司\",\"titleType\":1,\"type\":1}\",\n" +
                "    \"orders\":[\n" +
                "        {\n" +
                "            \"orderItems\":[\n" +
                "                {\n" +
                "                    \"kid\":\"0\",\n" +
                "                    \"mshop\":{\n" +
                "                        \"id\":63,\n" +
                "                        \"name\":\"张林林_XPOP\"\n" +
                "                    },\n" +
                "                    \"quantity\":4,\n" +
                "                    \"sku\":{\n" +
                "                        \"activity\":{\n" +
                "                            \"id\":155,\n" +
                "                            \"name\":\"sdfasdsdsfasd \",\n" +
                "                            \"type\":2\n" +
                "                        },\n" +
                "                        \"attributes\":[\n" +
                "                            {\n" +
                "                                \"name\":\"颜色\",\n" +
                "                                \"value\":\"白色\"\n" +
                "                            }\n" +
                "                        ],\n" +
                "                        \"discount\":20,\n" +
                "                        \"id\":50649,\n" +
                "                        \"image\":\"http://10.125.31.23/v1/img/T1DtbTB7CT1RXrhCrK.jpg\",\n" +
                "                        \"item\":{\n" +
                "                            \"brandId\":2,\n" +
                "                            \"brandName\":\"漫步者\",\n" +
                "                            \"id\":45095,\n" +
                "                            \"name\":\"艾薇拉1.532423s永生仿真花假花装饰玫瑰套装摆件 客厅餐桌玻璃花艺摆设\"\n" +
                "                        },\n" +
                "                        \"price\":1000\n" +
                "                    }\n" +
                "                }\n" +
                "            ],\n" +
                "            \"seller\":{\n" +
                "                \"id\":185,\n" +
                "                \"name\":\"13592622175\"\n" +
                "            },\n" +
                "            \"shippingCost\":0,\n" +
                "            \"shop\":{\n" +
                "                \"id\":63,\n" +
                "                \"name\":\"张林林_XPOP\",\n" +
                "                \"type\":1\n" +
                "            },\n" +
                "            \"type\":1\n" +
                "        }\n" +
                "    ],\n" +
                "    \"payType\":4\n" +
                "}";
    }

}