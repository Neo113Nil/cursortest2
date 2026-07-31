package com.my.target;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.my.target.wh;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class mj {
    private long b;
    private final uh d;
    private final uh e;
    private WeakReference g;
    private final wh.c h;
    private boolean a = false;
    private final zf c = zf.e;
    private final Runnable f = new Runnable() { // from class: com.my.target.mj$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            mj.this.a();
        }
    };

    private mj(uh uhVar, uh uhVar2, wh.c cVar) {
        this.e = uhVar2;
        this.d = uhVar;
        this.h = cVar;
    }

    public static mj a(th thVar, wh.c cVar) {
        return new mj(thVar.b(1), thVar.a(1), cVar);
    }

    public void b() {
        if (this.a) {
            mi.b("ViewabilityBannerTracker", "banner viewability already tracking");
            return;
        }
        this.a = true;
        this.b = SystemClock.elapsedRealtime();
        this.c.a(this.f);
    }

    public void c() {
        this.c.b(this.f);
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e.c.clear();
        this.d.c.clear();
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        a((SystemClock.elapsedRealtime() - this.b) / 1000.0f);
    }

    void a(float f) {
        Context context;
        double d;
        View view;
        WeakReference weakReference = this.g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            context = null;
            d = 0.0d;
        } else {
            d = qi.a(view);
            context = view.getContext();
        }
        a(d, f, context);
    }

    public void a(View view) {
        WeakReference weakReference;
        if (view == null && (weakReference = this.g) != null) {
            weakReference.clear();
        } else {
            this.g = new WeakReference(view);
        }
    }

    private void a(double d, float f, Context context) {
        if (this.d.c.isEmpty() && this.e.c.isEmpty()) {
            return;
        }
        if (context == null) {
            Iterator it = this.e.c.iterator();
            while (it.hasNext()) {
                ((gc) it.next()).a(-1.0f);
            }
            return;
        }
        uh a = this.d.a();
        while (true) {
            if (this.d.c.isEmpty()) {
                break;
            }
            int size = this.d.c.size() - 1;
            if (v4.a(((ke) this.d.c.get(size)).i(), f) == 1) {
                break;
            }
            ke keVar = (ke) this.d.c.remove(size);
            int i = keVar.f;
            boolean j = keVar.j();
            boolean z = ((double) i) <= d;
            if ((z && j) || (!z && !j)) {
                a.c.add(keVar);
            }
        }
        Iterator it2 = this.e.c.iterator();
        while (it2.hasNext()) {
            gc gcVar = (gc) it2.next();
            int i2 = gcVar.f;
            float h = gcVar.h();
            boolean z2 = d < ((double) i2);
            boolean z3 = h < 0.0f;
            if (z2) {
                gcVar.a(-1.0f);
            } else if (z3) {
                gcVar.a(f);
            } else if (v4.a(f - h, gcVar.h) != -1) {
                if (gcVar.i) {
                    a.c.add(gcVar);
                }
                it2.remove();
            }
        }
        wh.b(a, 1, this.h);
    }
}
