package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.pj;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class di {
    protected final uh a;
    private final t5 b;
    private boolean c = false;

    protected di(t5 t5Var, uh uhVar) {
        this.b = t5Var;
        this.a = uhVar;
    }

    protected final pj.a a() {
        if (this.c) {
            return null;
        }
        return this.b.a();
    }

    public abstract void a(View view);

    public abstract void a(boolean z, float f, Context context);

    public void b() {
        if (this.c) {
            return;
        }
        this.b.a(this);
        this.c = true;
        mi.b("ViewabilityTracker: StatTracker", "i'm killed");
    }

    public abstract void c();
}
