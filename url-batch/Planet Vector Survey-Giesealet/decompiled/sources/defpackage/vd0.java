package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class vd0 {
    public String a;
    public dw0 b;
    public ct c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public sl i;
    public a5 j;
    public boolean k;
    public o50 m;
    public td0 n;
    public c10 o;
    public long h = gy.a;
    public long l = px0.c(0, 0);
    public long p = vi.g(0, 0, 0, 0);

    public vd0(String str, dw0 dw0Var, ct ctVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dw0Var;
        this.c = ctVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final void a() {
        this.j = null;
        this.n = null;
        this.o = null;
        if (!(true & true)) {
            ey.a("width and height must be >= 0");
        }
        this.p = vi.g(0, 0, 0, 0);
        this.l = px0.c(0, 0);
        this.k = false;
    }

    public final void b(sl slVar) {
        long j;
        sl slVar2 = this.i;
        if (slVar != null) {
            int i = gy.b;
            j = gy.a(slVar.a(), slVar.h());
        } else {
            j = gy.a;
        }
        if (slVar2 == null) {
            this.i = slVar;
            this.h = j;
        } else if (slVar == null || this.h != j) {
            this.i = slVar;
            this.h = j;
            a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j = this.h;
        int i = gy.b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
