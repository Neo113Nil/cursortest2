package W0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends F1.d {
    public static List r0(Object[] objArr) {
        i1.f.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        i1.f.d(asList, "asList(...)");
        return asList;
    }

    public static void s0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        i1.f.e(bArr, "<this>");
        i1.f.e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void t0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        i1.f.e(objArr, "<this>");
        i1.f.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void u0(Object[] objArr, int i, int i2) {
        i1.f.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList v0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
