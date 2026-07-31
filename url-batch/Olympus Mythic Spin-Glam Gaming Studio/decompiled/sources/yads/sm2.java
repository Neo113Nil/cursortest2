package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class sm2 {
    public static Object a(Class cls, String str, Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = new ArrayList();
        int length = copyOf.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return rm2.a(null, cls, str, (Class[]) arrayList.toArray(new Class[0]), Arrays.copyOf(objArr, objArr.length));
            }
            Object obj = copyOf[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
    }
}
