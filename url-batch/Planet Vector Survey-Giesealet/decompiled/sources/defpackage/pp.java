package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pp {
    public int a = 1;
    public final n50 b;
    public n50 c;
    public n50 d;
    public int e;
    public int f;

    public pp(n50 n50Var) {
        this.b = n50Var;
        this.c = n50Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        l50 b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.g).get(a + b.d) == 0) || this.e == 65039;
    }
}
