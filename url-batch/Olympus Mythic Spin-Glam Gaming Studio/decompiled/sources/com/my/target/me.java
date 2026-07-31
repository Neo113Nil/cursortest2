package com.my.target;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.my.target.pj;
import com.my.target.wh;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class me extends di {
    private long d;
    private long e;
    private final uh f;
    private final uh g;
    private final wh.c h;

    private me(t5 t5Var, uh uhVar, uh uhVar2, wh.c cVar) {
        super(t5Var, uhVar.a());
        this.d = 0L;
        this.e = 0L;
        this.g = uhVar2;
        this.f = uhVar;
        this.h = cVar;
    }

    public static me a(t5 t5Var, uh uhVar, uh uhVar2, wh.c cVar) {
        return new me(t5Var, uhVar, uhVar2, cVar);
    }

    @Override // com.my.target.di
    public void c() {
        mi.b("ViewabilityTracker: PlayHeadViewabilityStatTracker", "stopTracking");
        this.e = SystemClock.elapsedRealtime();
    }

    @Override // com.my.target.di
    public void a(View view) {
        mi.b("ViewabilityTracker: PlayHeadViewabilityStatTracker", "startTracking");
        if (this.d == 0) {
            this.d = SystemClock.elapsedRealtime();
            return;
        }
        Iterator it = this.g.c.iterator();
        while (it.hasNext()) {
            ((gc) it.next()).a(-1.0f);
        }
        this.d += SystemClock.elapsedRealtime() - this.e;
    }

    @Override // com.my.target.di
    public void a(boolean z, float f, Context context) {
        a((SystemClock.elapsedRealtime() - this.d) / 1000.0f, f);
    }

    void a(float f, float f2) {
        a(f2, f);
    }

    private void a(double d, float f) {
        pj.a a;
        if (this.f.c.isEmpty() && this.g.c.isEmpty()) {
            mi.b("ViewabilityTracker: PlayHeadViewabilityStatTracker", "killSelf");
            b();
            return;
        }
        uh a2 = this.f.a();
        while (true) {
            if (this.f.c.isEmpty()) {
                break;
            }
            int size = this.f.c.size() - 1;
            if (v4.a(((ke) this.f.c.get(size)).i(), f) == 1) {
                break;
            }
            ke keVar = (ke) this.f.c.remove(size);
            int i = keVar.f;
            boolean j = keVar.j();
            boolean z = ((double) i) <= d;
            if ((z && j) || (!z && !j)) {
                a2.c.add(keVar);
            }
        }
        Iterator it = this.g.c.iterator();
        while (it.hasNext()) {
            gc gcVar = (gc) it.next();
            int i2 = gcVar.f;
            float h = gcVar.h();
            boolean z2 = d < ((double) i2);
            boolean z3 = h < 0.0f;
            if (z2) {
                gcVar.a(-1.0f);
            } else if (v4.a(gcVar.h, 0.0f) == 0 && gcVar.i) {
                a2.c.add(gcVar);
                it.remove();
            } else if (z3) {
                gcVar.a(f);
            } else if (v4.a(f - h, gcVar.h) != -1) {
                if (gcVar.i) {
                    a2.c.add(gcVar);
                }
                it.remove();
            }
        }
        wh.b(a2, 1, this.h);
        if (!th.c(a2.c) || (a = a()) == null) {
            return;
        }
        a.a();
    }
}
