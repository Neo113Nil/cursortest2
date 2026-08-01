package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class v50 {
    public final f3 a;
    public final l70 b = new l70(new g9[16]);
    public final l70 c = new l70(new ji0[16]);
    public final l70 d = new l70(new p10[16]);
    public final l70 e = new l70(new ji0[16]);
    public boolean f;

    public v50(f3 f3Var) {
        this.a = f3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [t50] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(t50 t50Var, ji0 ji0Var, HashSet hashSet) {
        if (!t50Var.d.q) {
            cy.b("visitSubtreeIf called on an unattached node");
        }
        l70 l70Var = new l70(new t50[16]);
        t50 t50Var2 = t50Var.d;
        t50 t50Var3 = t50Var2.i;
        if (t50Var3 == null) {
            nz.h(l70Var, t50Var2);
        } else {
            l70Var.b(t50Var3);
        }
        while (true) {
            int i = l70Var.f;
            if (i == 0) {
                return;
            }
            t50 t50Var4 = (t50) l70Var.j(i - 1);
            if ((t50Var4.g & 32) != 0) {
                for (t50 t50Var5 = t50Var4; t50Var5 != null; t50Var5 = t50Var5.i) {
                    if ((t50Var5.f & 32) != 0) {
                        ol olVar = t50Var5;
                        ?? r5 = 0;
                        while (olVar != 0) {
                            if (olVar instanceof w50) {
                                w50 w50Var = (w50) olVar;
                                if (w50Var instanceof g9) {
                                    g9 g9Var = (g9) w50Var;
                                    if ((g9Var.r instanceof sy) && g9Var.t.contains(ji0Var)) {
                                        hashSet.add(w50Var);
                                    }
                                }
                                if (w50Var.f().o(ji0Var)) {
                                    break;
                                }
                            } else if ((olVar.f & 32) != 0 && (olVar instanceof ol)) {
                                t50 t50Var6 = olVar.s;
                                int i2 = 0;
                                olVar = olVar;
                                r5 = r5;
                                while (t50Var6 != null) {
                                    if ((t50Var6.f & 32) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            olVar = t50Var6;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new l70(new t50[16]);
                                            }
                                            if (olVar != 0) {
                                                r5.b(olVar);
                                                olVar = 0;
                                            }
                                            r5.b(t50Var6);
                                        }
                                    }
                                    t50Var6 = t50Var6.i;
                                    olVar = olVar;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            olVar = nz.j(r5);
                        }
                    }
                }
            }
            nz.h(l70Var, t50Var4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        b bVar = new b(8, this);
        x60 x60Var = this.a.w0;
        if (x60Var.f(bVar) >= 0) {
            return;
        }
        x60Var.a(bVar);
    }
}
