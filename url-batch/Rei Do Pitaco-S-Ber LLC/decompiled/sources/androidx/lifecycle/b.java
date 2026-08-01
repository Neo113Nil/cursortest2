package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import defpackage.c6;
import defpackage.j0;
import defpackage.jf;
import defpackage.l8;
import defpackage.lp;
import defpackage.lq;
import defpackage.mq;
import defpackage.n00;
import defpackage.o00;
import defpackage.q00;
import defpackage.sk;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class b {
    public static final Object j = new Object();
    public final Object a = new Object();
    public final q00 b = new q00();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    public b() {
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        ((c6) c6.e0().u).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        l8.h(str, " on a background thread", "Cannot invoke ");
    }

    public final void b(mq mqVar) {
        if (mqVar.b) {
            if (!mqVar.e()) {
                mqVar.c(false);
                return;
            }
            int i = mqVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            mqVar.c = i2;
            j0 j0Var = mqVar.a;
            Object obj = this.e;
            j0Var.getClass();
            lp lpVar = (lp) obj;
            jf jfVar = (jf) j0Var.g;
            if (lpVar == null || !jfVar.d0) {
                return;
            }
            View D = jfVar.D();
            if (D.getParent() != null) {
                l8.u("DialogFragment can not be attached to a container view");
                return;
            }
            if (jfVar.h0 != null) {
                if (sk.G(3)) {
                    Log.d("FragmentManager", "DialogFragment " + j0Var + " setting the content view on " + jfVar.h0);
                }
                jfVar.h0.setContentView(D);
            }
        }
    }

    public final void c(mq mqVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (mqVar != null) {
                b(mqVar);
                mqVar = null;
            } else {
                q00 q00Var = this.b;
                q00Var.getClass();
                o00 o00Var = new o00(q00Var);
                q00Var.h.put(o00Var, Boolean.FALSE);
                while (o00Var.hasNext()) {
                    b((mq) ((Map.Entry) o00Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(j0 j0Var) {
        Object obj;
        a("observeForever");
        lq lqVar = new lq(this, j0Var);
        q00 q00Var = this.b;
        n00 a = q00Var.a(j0Var);
        if (a != null) {
            obj = a.g;
        } else {
            n00 n00Var = new n00(j0Var, lqVar);
            q00Var.i++;
            n00 n00Var2 = q00Var.g;
            if (n00Var2 == null) {
                q00Var.f = n00Var;
                q00Var.g = n00Var;
            } else {
                n00Var2.h = n00Var;
                n00Var.i = n00Var2;
                q00Var.g = n00Var;
            }
            obj = null;
        }
        mq mqVar = (mq) obj;
        if (mqVar instanceof LiveData$LifecycleBoundObserver) {
            l8.l("Cannot add the same observer with different lifecycles");
        } else {
            if (mqVar != null) {
                return;
            }
            lqVar.c(true);
        }
    }

    public final void e(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }
}
