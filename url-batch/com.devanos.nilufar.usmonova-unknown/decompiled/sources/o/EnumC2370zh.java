package o;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: o.zh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2370zh {
    k(true),
    l(true),
    m(true),
    n(false),
    f255o(true),
    p(true),
    q(true),
    r(true),
    s(true),
    t(true),
    u(true),
    v(true),
    w(true),
    x(true);

    public static final Set i;
    public static final Set j;
    public final boolean h;

    static {
        EnumC2370zh[] values = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC2370zh enumC2370zh : values) {
            if (enumC2370zh.h) {
                arrayList.add(enumC2370zh);
            }
        }
        i = AbstractC0720ac.M0(arrayList);
        j = P6.u0(values());
    }

    EnumC2370zh(boolean z) {
        this.h = z;
    }
}
