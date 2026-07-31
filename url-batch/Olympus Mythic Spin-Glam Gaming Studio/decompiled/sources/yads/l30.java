package yads;

/* loaded from: classes15.dex */
public abstract class l30 {
    public static v30 a(oo2 oo2Var, String str, tl2 tl2Var, int i) {
        u30 u30Var = new u30();
        u30Var.a = tl2Var.a(str);
        u30Var.d = tl2Var.a;
        u30Var.e = tl2Var.b;
        String c = oo2Var.c();
        if (c == null) {
            c = tl2Var.a(((lo) oo2Var.b.get(0)).a).toString();
        }
        u30Var.f = c;
        u30Var.g = i;
        oh.a(u30Var.a, "The uri must be set.");
        return new v30(u30Var.a, 0L, u30Var.b, null, u30Var.c, u30Var.d, u30Var.e, u30Var.f, u30Var.g, null);
    }
}
