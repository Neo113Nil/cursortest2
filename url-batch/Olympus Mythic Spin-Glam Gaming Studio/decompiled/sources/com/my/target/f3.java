package com.my.target;

import android.content.Context;
import android.util.SizeF;
import com.my.target.pj;
import com.my.target.wh;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class f3 implements t5 {
    private float c;
    private final zf d;
    private final boolean f;
    private final wh.c g;
    private b7 a = null;
    private final Runnable e = new Runnable() { // from class: com.my.target.f3$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            f3.this.d();
        }
    };
    private boolean h = false;
    private boolean i = false;
    private pj.a j = null;
    private j7 k = null;
    private final ArrayList b = new ArrayList();

    private f3(lj ljVar, th thVar, boolean z, wh.c cVar) {
        this.c = 50.0f;
        this.g = cVar;
        this.d = zf.a((int) (ljVar.b() * 1000.0f));
        a(ljVar, thVar);
        this.c = ljVar.c() * 100.0f;
        this.f = z;
    }

    public static f3 a(lj ljVar, th thVar, boolean z, wh.c cVar) {
        return new f3(ljVar, thVar, z, cVar);
    }

    private boolean b() {
        b7 b7Var = this.a;
        if (b7Var == null) {
            mi.b("ComposeVisibilityTracker", "Tracking disappeared");
            c();
            return false;
        }
        float a = a(b7Var);
        boolean z = v4.a(a, this.c) != -1;
        StringBuilder sb = new StringBuilder();
        sb.append("Compose Banner visibility ");
        sb.append(a);
        sb.append("% (isVisible = ");
        sb.append(z);
        sb.append("). Id: ");
        j7 j7Var = this.k;
        sb.append(j7Var != null ? j7Var.x() : null);
        mi.b("ComposeVisibilityTracker", sb.toString());
        if (z) {
            a(z, a, this.a.a());
            return z;
        }
        c();
        return z;
    }

    private void c() {
        this.a = null;
        if (this.h) {
            this.h = false;
            this.i = false;
            this.k = null;
            this.d.b(this.e);
            mi.b("ComposeVisibilityTracker", "Stop tracking");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!this.h) {
            this.d.b(this.e);
            return;
        }
        if (this.k != null) {
            mi.b("ComposeVisibilityTracker", "tick for " + this.k.x());
        }
        b();
    }

    @Override // com.my.target.t5
    public pj.a a() {
        return this.j;
    }

    @Override // com.my.target.t5
    public void a(di diVar) {
        this.b.remove(diVar);
        if (this.b.isEmpty() && this.f) {
            mi.b("ComposeVisibilityTracker", "statTrackers are empty and shouldStopOnShow = true, stop tracking");
            c();
        }
    }

    public void a(pj.a aVar) {
        this.j = aVar;
    }

    public void a(j7 j7Var, b7 b7Var) {
        this.a = b7Var;
        if (b()) {
            a(j7Var);
        } else {
            c();
        }
    }

    private void a(j7 j7Var) {
        if (this.h) {
            return;
        }
        if (this.b.isEmpty() && this.f) {
            return;
        }
        this.k = j7Var;
        this.h = true;
        mi.b("ComposeVisibilityTracker", "Started tracking");
        this.d.a(this.e);
    }

    private void a(boolean z, float f, Context context) {
        boolean z2 = this.i;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            ((di) this.b.get(size)).a(z, f, context);
        }
        if (z2 == z) {
            return;
        }
        this.i = this.h && z;
        pj.a aVar = this.j;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    private float a(b7 b7Var) {
        SizeF b = b7Var.b();
        SizeF c = b7Var.c();
        float width = b.getWidth() * b.getHeight();
        float width2 = c.getWidth() * c.getHeight();
        if (width == 0.0f) {
            return 0.0f;
        }
        return (width2 / width) * 100.0f;
    }

    private void a(lj ljVar, th thVar) {
        long a = (long) (ljVar.a() * 1000.0f);
        uh b = thVar.b("viewabilityDuration");
        a("ViewabilityDuration", b.c.size());
        if (!b.c.isEmpty()) {
            this.b.add(nj.a(this, b, a, this.g));
        }
        uh b2 = thVar.b("show");
        a("Show", b2.c.size());
        this.b.add(wg.a(this, b2, a, thVar, this.g));
        uh b3 = thVar.b("viewin");
        a("View In", b3.c.size());
        this.b.add(kj.a(this, b3));
        uh b4 = thVar.b("render");
        a("Render", b4.c.size());
        uh b5 = thVar.b("viewabilityMeasurable");
        a("ViewabilityMeasurable", b5.c.size());
        this.b.add(yf.a(this, b4, b5, this.g));
        uh b6 = thVar.b(1);
        a("OvvStats", b6.c.size());
        uh a2 = thVar.a(1);
        a("MrcStats", a2.c.size());
        this.b.add(me.a(this, b6, a2, this.g));
    }

    private void a(String str, int i) {
        mi.b("ComposeVisibilityTracker", str + " stats count = " + i);
    }
}
