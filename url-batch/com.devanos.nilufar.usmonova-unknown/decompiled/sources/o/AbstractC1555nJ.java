package o;

import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: o.nJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1555nJ {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(EnumC1489mJ.h, 0);
        hashMap.put(EnumC1489mJ.i, 1);
        hashMap.put(EnumC1489mJ.j, 2);
        for (EnumC1489mJ enumC1489mJ : hashMap.keySet()) {
            a.append(((Integer) b.get(enumC1489mJ)).intValue(), enumC1489mJ);
        }
    }

    public static int a(EnumC1489mJ enumC1489mJ) {
        Integer num = (Integer) b.get(enumC1489mJ);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC1489mJ);
    }

    public static EnumC1489mJ b(int i) {
        EnumC1489mJ enumC1489mJ = (EnumC1489mJ) a.get(i);
        if (enumC1489mJ != null) {
            return enumC1489mJ;
        }
        throw new IllegalArgumentException(AbstractC2188wx.g(i, "Unknown Priority for value "));
    }
}
