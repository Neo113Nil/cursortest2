package com.my.target;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class fg {
    private final uh a;
    private WeakReference b;
    private float c = -1.0f;
    private long d;

    private fg(th thVar) {
        this.a = uh.a(thVar);
        for (gc gcVar : thVar.a(2).c) {
            if (gcVar instanceof eg) {
                this.a.c.add((eg) gcVar);
            }
        }
    }

    public static fg a(th thVar) {
        return new fg(thVar);
    }

    public void b(int i) {
        Context context;
        double d;
        View view;
        float f = i;
        if (f == this.c) {
            return;
        }
        if (!a(i)) {
            a();
        }
        WeakReference weakReference = this.b;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            context = null;
            d = 0.0d;
        } else {
            d = qi.a(view);
            context = view.getContext();
        }
        b(d, i, context);
        this.c = f;
        this.d = System.currentTimeMillis();
    }

    public void a(View view) {
        WeakReference weakReference;
        if (view != null || (weakReference = this.b) == null) {
            this.b = new WeakReference(view);
        } else {
            weakReference.clear();
        }
    }

    private void a() {
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((eg) it.next()).a(-1.0f);
        }
    }

    private boolean a(int i) {
        float f = i;
        float f2 = this.c;
        if (f < f2) {
            return false;
        }
        return this.d <= 0 || (((long) (f - f2)) * 1000) - (System.currentTimeMillis() - this.d) <= 1000;
    }

    private void a(double d, int i, Context context) {
        uh a = this.a.a();
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            eg egVar = (eg) it.next();
            int j = egVar.j();
            int i2 = egVar.i();
            if (j > i || (i2 != 0 && i2 < i)) {
                egVar.a(-1.0f);
            } else if (egVar.f > d) {
                egVar.a(-1.0f);
            } else {
                if (egVar.h() >= 0.0f) {
                    float f = i;
                    if (f > egVar.h()) {
                        if (f - egVar.h() >= egVar.h) {
                            a.c.add(egVar);
                            it.remove();
                        }
                    }
                }
                egVar.a(i);
            }
        }
        wh.b(a, 1);
    }

    private void b(double d, int i, Context context) {
        if (this.a.c.isEmpty()) {
            return;
        }
        if (context == null) {
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((gc) it.next()).a(-1.0f);
            }
            return;
        }
        a(d, i, context);
    }
}
