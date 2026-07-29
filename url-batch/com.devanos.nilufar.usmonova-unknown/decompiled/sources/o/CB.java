package o;

import java.util.Map;

/* loaded from: classes.dex */
public final class CB {
    public static int a(Object obj, int i, Object obj2) {
        BB bb = (BB) obj;
        AB ab = (AB) obj2;
        int i2 = 0;
        if (bb.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : bb.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            ab.getClass();
            int Z = C0627Yb.Z(i);
            int a = AB.a(ab.a, key, value);
            i2 = AbstractC2188wx.f(a, a, Z, i2);
        }
        return i2;
    }

    public static BB b(Object obj, Object obj2) {
        BB bb = (BB) obj;
        BB bb2 = (BB) obj2;
        if (!bb2.isEmpty()) {
            if (!bb.h) {
                bb = bb.b();
            }
            bb.a();
            if (!bb2.isEmpty()) {
                bb.putAll(bb2);
            }
        }
        return bb;
    }
}
