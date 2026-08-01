package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class r21 implements m20 {
    public final /* synthetic */ jj d;
    public final /* synthetic */ r5 e;
    public final /* synthetic */ wi0 f;
    public final /* synthetic */ gj0 g;
    public final /* synthetic */ View h;

    public r21(jj jjVar, r5 r5Var, wi0 wi0Var, gj0 gj0Var, View view) {
        this.d = jjVar;
        this.e = r5Var;
        this.f = wi0Var;
        this.g = gj0Var;
        this.h = view;
    }

    @Override // defpackage.m20
    public final void g(o20 o20Var, e20 e20Var) {
        switch (q21.a[e20Var.ordinal()]) {
            case 1:
                d31.E(this.d, null, new p70(this.g, this.f, o20Var, this, this.h, null), 1);
                return;
            case 2:
                r5 r5Var = this.e;
                if (r5Var != null) {
                    w00 w00Var = (w00) r5Var.f;
                    synchronized (w00Var.a) {
                        try {
                            if (!w00Var.a()) {
                                ArrayList arrayList = w00Var.b;
                                w00Var.b = w00Var.c;
                                w00Var.c = arrayList;
                                w00Var.d = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((kj) arrayList.get(i)).resumeWith(ky0.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.f.K();
                return;
            case 3:
                this.f.E();
                return;
            case 4:
                this.f.z();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                g8.c();
                return;
        }
    }
}
