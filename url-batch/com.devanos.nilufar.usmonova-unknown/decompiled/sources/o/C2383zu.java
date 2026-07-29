package o;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.zu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2383zu implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public C2383zu(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC0048Bt.n(obj, "proxy");
        AbstractC0048Bt.n(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (AbstractC0048Bt.h(name, "supports") && AbstractC0048Bt.h(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (AbstractC0048Bt.h(name, "unsupported") && AbstractC0048Bt.h(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean h = AbstractC0048Bt.h(name, "protocols");
        ArrayList arrayList = this.a;
        if (h && objArr.length == 0) {
            return arrayList;
        }
        if ((AbstractC0048Bt.h(name, "selectProtocol") || AbstractC0048Bt.h(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        AbstractC0048Bt.l(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((!AbstractC0048Bt.h(name, "protocolSelected") && !AbstractC0048Bt.h(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        AbstractC0048Bt.l(obj4, "null cannot be cast to non-null type kotlin.String");
        this.c = (String) obj4;
        return null;
    }
}
