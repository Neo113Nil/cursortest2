package yads;

/* loaded from: classes14.dex */
public final class oe0 {
    public final String a;
    public int b;
    public long c;
    public final pm1 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ pe0 g;

    public oe0(pe0 pe0Var, String str, int i, pm1 pm1Var) {
        this.g = pe0Var;
        this.a = str;
        this.b = i;
        this.c = pm1Var == null ? -1L : pm1Var.d;
        if (pm1Var == null || !pm1Var.a()) {
            return;
        }
        this.d = pm1Var;
    }

    public final boolean a(qd qdVar) {
        long j = this.c;
        if (j == -1) {
            return false;
        }
        pm1 pm1Var = qdVar.d;
        if (pm1Var == null) {
            return this.b != qdVar.c;
        }
        if (pm1Var.d > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        int a = qdVar.b.a(pm1Var.a);
        int a2 = qdVar.b.a(this.d.a);
        pm1 pm1Var2 = qdVar.d;
        if (pm1Var2.d < this.d.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (!pm1Var2.a()) {
            int i = qdVar.d.e;
            return i == -1 || i > this.d.b;
        }
        pm1 pm1Var3 = qdVar.d;
        int i2 = pm1Var3.b;
        int i3 = pm1Var3.c;
        pm1 pm1Var4 = this.d;
        int i4 = pm1Var4.b;
        return i2 > i4 || (i2 == i4 && i3 > pm1Var4.c);
    }
}
