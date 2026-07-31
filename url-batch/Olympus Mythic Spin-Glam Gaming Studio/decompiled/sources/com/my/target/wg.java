package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.pj;
import com.my.target.wh;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class wg extends i3 {
    private final wh.c f;
    private th g;

    private wg(t5 t5Var, uh uhVar, long j, th thVar, wh.c cVar) {
        super(t5Var, uhVar, j);
        this.g = thVar;
        this.f = cVar;
    }

    public static wg a(t5 t5Var, uh uhVar, long j, th thVar, wh.c cVar) {
        return new wg(t5Var, uhVar, j, thVar, cVar);
    }

    private void d() {
        pj.a a;
        wh.a(this.a, 1, this.f);
        if (!th.c(this.a.c) || (a = a()) == null) {
            return;
        }
        a.a();
    }

    @Override // com.my.target.di
    public void a(View view) {
    }

    @Override // com.my.target.di
    public void b() {
        super.b();
        this.g = null;
    }

    @Override // com.my.target.di
    public void c() {
        this.e = 0L;
    }

    private void b(Context context) {
        String e = qi.e(context);
        if (e != null) {
            wh.a(this.g, e, 1);
        }
    }

    @Override // com.my.target.di
    public void a(boolean z, float f, Context context) {
        if (a(z)) {
            a(context);
        }
    }

    private void a(Context context) {
        this.a.d.b(1, 6000);
        b(context);
        d();
        pj.a a = a();
        if (a != null) {
            a.b();
        }
        mi.b("ViewabilityTracker: ShowStatTracker", "Show tracked, kill self");
        b();
    }
}
