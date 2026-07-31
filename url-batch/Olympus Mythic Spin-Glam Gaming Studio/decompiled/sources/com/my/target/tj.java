package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.wh;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class tj {
    private final uh a;
    private final uh b;
    private final wh.c c;
    private WeakReference d;

    private tj(uh uhVar, uh uhVar2, wh.c cVar) {
        this.b = uhVar2;
        this.a = uhVar;
        this.c = cVar;
    }

    public static tj a(th thVar, wh.c cVar) {
        return new tj(thVar.b(2), thVar.a(2), cVar);
    }

    public void a(View view) {
        WeakReference weakReference;
        if (view == null && (weakReference = this.d) != null) {
            weakReference.clear();
        } else {
            this.d = new WeakReference(view);
        }
    }

    public void a(float f, float f2) {
        Context context;
        double d;
        View view;
        WeakReference weakReference = this.d;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            context = null;
            d = 0.0d;
        } else {
            d = qi.a(view);
            context = view.getContext();
        }
        a(d, f, f2, context);
    }

    public void a() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.b.c.clear();
        this.a.c.clear();
        this.d = null;
    }

    private void a(double d, float f, float f2, Context context) {
        if (this.a.c.isEmpty() && this.b.c.isEmpty()) {
            return;
        }
        if (context == null) {
            Iterator it = this.b.c.iterator();
            while (it.hasNext()) {
                ((gc) it.next()).a(-1.0f);
            }
            return;
        }
        uh a = this.a.a();
        while (true) {
            if (this.a.c.isEmpty()) {
                break;
            }
            int size = this.a.c.size() - 1;
            if (v4.a(((ke) this.a.c.get(size)).i(), f) == 1) {
                break;
            }
            ke keVar = (ke) this.a.c.remove(size);
            int i = keVar.f;
            boolean j = keVar.j();
            boolean z = ((double) i) <= d;
            if ((z && j) || (!z && !j)) {
                a.c.add(keVar);
            }
        }
        float f3 = f2 - f;
        Iterator it2 = this.b.c.iterator();
        while (it2.hasNext()) {
            gc gcVar = (gc) it2.next();
            int i2 = gcVar.f;
            float h = gcVar.h();
            boolean z2 = d < ((double) i2);
            boolean z3 = h < 0.0f;
            if (v4.a(f3, gcVar.h) == -1 && (z2 || z3)) {
                if (!gcVar.i) {
                    a.c.add(gcVar);
                }
                it2.remove();
            } else if (z2) {
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
        wh.b(a, 1, this.c);
    }
}
