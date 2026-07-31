package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.pj;
import com.my.target.wh;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class yf extends di {
    private final wh.c d;
    private final uh e;

    private yf(t5 t5Var, uh uhVar, uh uhVar2, wh.c cVar) {
        super(t5Var, uhVar);
        this.e = uhVar2;
        this.d = cVar;
    }

    public static yf a(t5 t5Var, uh uhVar, uh uhVar2, wh.c cVar) {
        return new yf(t5Var, uhVar, uhVar2, cVar);
    }

    @Override // com.my.target.di
    public void a(boolean z, float f, Context context) {
    }

    @Override // com.my.target.di
    public void c() {
    }

    @Override // com.my.target.di
    public void a(View view) {
        pj.a a;
        wh.a(this.a, 1, this.d);
        wh.a(this.e, 1, this.d);
        mi.b("ViewabilityTracker: RenderStatTracker", "Render tracked, kill self");
        if ((th.c(this.a.c) || th.c(this.e.c)) && (a = a()) != null) {
            a.a();
        }
        b();
    }
}
