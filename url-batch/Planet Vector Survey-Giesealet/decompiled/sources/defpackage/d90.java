package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d90 {
    public final b90 a;
    public int b;
    public String c;
    public boolean d;
    public boolean e;

    public d90() {
        b90 b90Var = new b90();
        b90Var.a = -1;
        b90Var.e = -1;
        b90Var.f = -1;
        this.a = b90Var;
        this.b = -1;
    }

    public final void a(String str) {
        if (tt0.w(str)) {
            g8.r("Cannot pop up to an empty route");
        } else {
            this.c = str;
            this.d = false;
        }
    }
}
