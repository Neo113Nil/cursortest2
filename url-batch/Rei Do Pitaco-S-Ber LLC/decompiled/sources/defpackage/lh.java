package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class lh {
    public int a = 1;
    public final pt b;
    public pt c;
    public pt d;
    public int e;
    public int f;

    public lh(pt ptVar) {
        this.b = ptVar;
        this.c = ptVar;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        nt b = this.c.b.b();
        int a = b.a(6);
        return !(a == 0 || ((ByteBuffer) b.d).get(a + b.a) == 0) || this.e == 65039;
    }
}
