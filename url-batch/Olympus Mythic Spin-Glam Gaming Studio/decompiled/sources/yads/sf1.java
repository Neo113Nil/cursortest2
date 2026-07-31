package yads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class sf1 {
    public static ArrayList a(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        dx.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(nc1.b(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
