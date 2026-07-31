package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.pj;
import com.my.target.wh;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class kj extends di {
    private kj(t5 t5Var, uh uhVar) {
        super(t5Var, uhVar);
    }

    public static kj a(t5 t5Var, uh uhVar) {
        return new kj(t5Var, uhVar);
    }

    @Override // com.my.target.di
    public void a(View view) {
    }

    @Override // com.my.target.di
    public void c() {
    }

    @Override // com.my.target.di
    public void a(boolean z, float f, Context context) {
        pj.a a;
        if (v4.a(f, 0.0f) == 1) {
            wh.a(this.a, 1, (wh.c) null);
            mi.b("ViewabilityTracker: ShowStatTracker", "ViewIn tracked, kill self");
            if (th.c(this.a.c) && (a = a()) != null) {
                a.a();
            }
            b();
        }
    }
}
