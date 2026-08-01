package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class so implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public so(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (oo.b(name, "supports") && oo.b(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (oo.b(name, "unsupported") && oo.b(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean b = oo.b(name, "protocols");
        ArrayList arrayList = this.a;
        if (b && objArr.length == 0) {
            return arrayList;
        }
        if ((oo.b(name, "selectProtocol") || oo.b(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        obj3.getClass();
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
        if ((!oo.b(name, "protocolSelected") && !oo.b(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        this.c = (String) obj4;
        return null;
    }
}
