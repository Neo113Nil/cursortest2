package o;

import java.io.Serializable;

/* renamed from: o.nu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1592nu {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C1151h9.class, C1151h9.j),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Object h;

    EnumC1592nu(Class cls, Serializable serializable) {
        this.h = serializable;
    }
}
