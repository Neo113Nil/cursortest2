package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class oq {
    public static um2 a(mq mqVar, ArrayList arrayList) {
        i41 i41Var = l41.c;
        dx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            nq a = mqVar.a(bundle);
            a.getClass();
            int i3 = i2 + 1;
            if (objArr.length < i3) {
                objArr = Arrays.copyOf(objArr, e41.a(objArr.length, i3));
            }
            objArr[i2] = a;
            i++;
            i2 = i3;
        }
        return l41.b(i2, objArr);
    }
}
