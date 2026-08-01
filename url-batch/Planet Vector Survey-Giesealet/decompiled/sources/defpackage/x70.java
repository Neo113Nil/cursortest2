package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class x70 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ y70 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x70(y70 y70Var, int i) {
        super(0);
        this.e = i;
        this.f = y70Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        int i = this.e;
        y70 y70Var = this.f;
        switch (i) {
            case 0:
                Context context = y70Var.d;
                Object applicationContext = context != null ? context.getApplicationContext() : null;
                return new mn0(applicationContext instanceof Application ? (Application) applicationContext : null, y70Var, y70Var.a());
            default:
                if (!y70Var.m) {
                    g8.s("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                q20 q20Var = y70Var.k;
                if (q20Var.c == f20.d) {
                    g8.s("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                v70 v70Var = new v70();
                v70Var.a = y70Var.l.b;
                v70Var.b = q20Var;
                return ((w70) new p01(y70Var.getViewModelStore(), v70Var, y70Var.getDefaultViewModelCreationExtras()).i(hj0.a(w70.class))).a;
        }
    }
}
