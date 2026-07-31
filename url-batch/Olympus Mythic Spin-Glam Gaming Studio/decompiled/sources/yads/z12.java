package yads;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class z12 implements l52 {
    public final zy1 a;
    public final t8 b;
    public final pb2 c;
    public final vl3 d;
    public String e;
    public a22 f;

    public z12(zy1 zy1Var, t8 t8Var) {
        pb2 pb2Var = new pb2();
        vl3 vl3Var = new vl3();
        this.a = zy1Var;
        this.b = t8Var;
        this.c = pb2Var;
        this.d = vl3Var;
    }

    public ec3 a(Context context, int i, boolean z) {
        ec3 ec3Var;
        a22 a22Var = this.f;
        View a = a22Var != null ? a22Var.c.a() : null;
        if (a == null) {
            return new bc3(ac3.g, null, null);
        }
        if (hl3.b(a)) {
            return new bc3(ac3.h, null, null);
        }
        ul3 a2 = hl3.a.a(a);
        String str = a2.b;
        this.e = str;
        if (a2.a < 1) {
            return zb3.a(1, null, str);
        }
        if (!a(a, i) || z) {
            String str2 = this.b.k;
            mg0[] mg0VarArr = mg0.b;
            if (!Intrinsics.areEqual(str2, "divkit") || this.b.H) {
                ec3 a3 = this.a.a(z);
                ec3Var = a3;
                if (!z) {
                    boolean z2 = a3 instanceof cc3;
                    ec3Var = a3;
                    if (z2) {
                        Rect a4 = this.d.a(a);
                        ec3Var = a3;
                        if (a4 != null) {
                            ec3Var = a3;
                            if (this.c.a(a, a4) > 0) {
                                return new cc3(CollectionsKt.plus(((cc3) a3).a, dc3.f));
                            }
                        }
                    }
                }
            } else {
                cc3 cc3Var = new cc3();
                ec3Var = cc3Var;
                if (!z) {
                    Rect a5 = this.d.a(a);
                    ec3Var = cc3Var;
                    if (a5 != null) {
                        ec3Var = cc3Var;
                        if (this.c.a(a, a5) > 0) {
                            return new cc3(CollectionsKt.plus(cc3Var.a, dc3.f));
                        }
                    }
                }
            }
        } else {
            ec3Var = new bc3(ac3.e, null, this.e);
        }
        return ec3Var;
    }

    public final mp2 b() {
        return this.a.e();
    }

    public final boolean a() {
        View a;
        a22 a22Var = this.f;
        if (a22Var == null || (a = a22Var.c.a()) == null) {
            return true;
        }
        return hl3.b(a);
    }

    public final void a(a22 a22Var) {
        this.a.d = a22Var;
        this.f = a22Var;
    }

    public final boolean a(View view, int i) {
        int a = hl3.a(view);
        this.e = "actualPercent: " + a + ", expectedPercent: " + i;
        return a < i;
    }
}
