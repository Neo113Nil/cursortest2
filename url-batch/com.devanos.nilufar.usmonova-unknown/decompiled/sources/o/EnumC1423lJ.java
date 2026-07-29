package o;

import java.util.Set;

/* renamed from: o.lJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1423lJ {
    m("Boolean"),
    n("Char"),
    f193o("Byte"),
    p("Short"),
    q("Int"),
    r("Float"),
    s("Long"),
    t("Double");

    public final C0827cE h;
    public final C0827cE i;
    public final Object j;
    public final Object k;
    public static final Set l = P6.u0(new EnumC1423lJ[]{n, f193o, p, q, r, s, t});

    EnumC1423lJ(String str) {
        this.h = C0827cE.e(str);
        this.i = C0827cE.e(str.concat("Array"));
        C1357kJ c1357kJ = new C1357kJ(this, 1);
        EnumC1992tz enumC1992tz = EnumC1992tz.h;
        this.j = EB.C(enumC1992tz, c1357kJ);
        this.k = EB.C(enumC1992tz, new C1357kJ(this, 0));
    }
}
