package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum L10 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C1151h9.j),
    ENUM(null),
    MESSAGE(null);

    public final Object h;

    L10(Serializable serializable) {
        this.h = serializable;
    }
}
