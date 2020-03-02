package com.mcy.util.core.collection.springcharacteristic;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

/**
 * @author chaoyang.man
 * @version 1.0
 * @date 2020/3/2 8:08 下午
 * <p>
 * Bean获取的工具类
 */
@Component
public class ObtainBeanUtil implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 根据类对象获取Bean
     *
     * @param clazz 类型对象
     * @param <T>   该Bean的类
     * @return 结果Bean
     */
    public <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

    /**
     * 获取范型的实现类的Bean
     *
     * @param clazz        接口的clazz
     * @param genericClazz 具体的范型
     * @param <T>          范型的实现类
     * @return 结果Bean
     */
    public <T> T getGenericsType(Class<T> clazz, Class genericClazz) {
        String[] beanNames = applicationContext.getBeanNamesForType(ResolvableType.forClassWithGenerics(clazz, genericClazz));
        if (StringUtils.isBlank(beanNames[0])) {
            return null;
        }
        return (T) applicationContext.getBean(beanNames[0]);
    }


}
