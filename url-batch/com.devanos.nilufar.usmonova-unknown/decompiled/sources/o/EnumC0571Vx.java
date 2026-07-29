package o;

import java.util.LinkedHashMap;

/* renamed from: o.Vx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0571Vx {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final LinkedHashMap i;
    public final int h;

    static {
        EnumC0571Vx[] values = values();
        int E = EB.E(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(E < 16 ? 16 : E);
        for (EnumC0571Vx enumC0571Vx : values) {
            linkedHashMap.put(Integer.valueOf(enumC0571Vx.h), enumC0571Vx);
        }
        i = linkedHashMap;
    }

    EnumC0571Vx(int i2) {
        this.h = i2;
    }
}
