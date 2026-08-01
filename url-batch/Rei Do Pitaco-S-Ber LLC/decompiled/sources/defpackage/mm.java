package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class mm {
    public static final r8 d;
    public static final r8 e;
    public static final r8 f;
    public static final r8 g;
    public static final r8 h;
    public static final r8 i;
    public final r8 a;
    public final r8 b;
    public final int c;

    static {
        r8 r8Var = r8.i;
        d = tg.l(":");
        e = tg.l(":status");
        f = tg.l(":method");
        g = tg.l(":path");
        h = tg.l(":scheme");
        i = tg.l(":authority");
    }

    public mm(r8 r8Var, r8 r8Var2) {
        r8Var.getClass();
        r8Var2.getClass();
        this.a = r8Var;
        this.b = r8Var2;
        this.c = r8Var2.a() + r8Var.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return oo.b(this.a, mmVar.a) && oo.b(this.b, mmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.h() + ": " + this.b.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mm(String str, String str2) {
        this(tg.l(str), tg.l(str2));
        str.getClass();
        str2.getClass();
        r8 r8Var = r8.i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mm(r8 r8Var, String str) {
        this(r8Var, tg.l(str));
        r8Var.getClass();
        str.getClass();
        r8 r8Var2 = r8.i;
    }
}
