package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by huyongqiang on 2016/10/28.
 */
public class DynamicSubject implements InvocationHandler {
    private Object sub;

    public DynamicSubject(Object obj) {
        this.sub = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Method:" + method + ",Args:" + args);
        method.invoke(sub, args);
        return null;
    }
}