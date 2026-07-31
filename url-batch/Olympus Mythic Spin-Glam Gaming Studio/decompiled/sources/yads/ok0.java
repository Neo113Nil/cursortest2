package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public final class ok0 {
    public final ep2 a;
    public final Context b;
    public final gk0 c;
    public final HashMap d;
    public final HashMap e;
    public final Handler f;
    public Runnable g;

    public ok0(ep2 ep2Var, Context context) {
        gk0 gk0Var = new gk0();
        this.a = ep2Var;
        this.b = context;
        this.c = gk0Var;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new Handler(Looper.getMainLooper());
    }

    public final void a(final String str, r21 r21Var) {
        fk0 a = this.c.a(str);
        if (a != null) {
            Drawable drawable = a.a;
            if (drawable != null) {
                r21Var.a.a(drawable);
                return;
            }
            return;
        }
        lk0 lk0Var = (lk0) this.d.get(str);
        if (lk0Var != null) {
            lk0Var.a.add(r21Var);
            return;
        }
        qk0 qk0Var = new qk0(str, this.b, new nk0(this, str), new vp2() { // from class: yads.ok0$$ExternalSyntheticLambda0
            @Override // yads.vp2
            public final void a(hm3 hm3Var) {
                ok0.a(ok0.this, str, hm3Var);
            }
        });
        this.d.put(str, new lk0(r21Var));
        this.a.a(qk0Var);
    }

    public static final void a(ok0 ok0Var, String str, hm3 hm3Var) {
        lk0 lk0Var = (lk0) ok0Var.d.remove(str);
        if (lk0Var == null) {
            return;
        }
        ok0Var.a(str, lk0Var, null, hm3Var);
    }

    public final void a(String str, lk0 lk0Var, Drawable drawable, hm3 hm3Var) {
        this.e.put(str, new mk0(lk0Var, drawable, hm3Var));
        if (this.g == null) {
            Runnable runnable = new Runnable() { // from class: yads.ok0$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ok0.a(ok0.this);
                }
            };
            this.f.postDelayed(runnable, 100L);
            this.g = runnable;
        }
    }

    public static final void a(ok0 ok0Var) {
        Iterator it = ok0Var.e.entrySet().iterator();
        while (it.hasNext()) {
            mk0 mk0Var = (mk0) ((Map.Entry) it.next()).getValue();
            for (r21 r21Var : mk0Var.a.b) {
                if (mk0Var.c == null) {
                    Drawable drawable = mk0Var.b;
                    if (drawable != null) {
                        r21Var.a.a(drawable);
                    } else {
                        r21Var.getClass();
                    }
                } else {
                    r21Var.getClass();
                    boolean z = ob1.a;
                }
            }
        }
        ok0Var.e.clear();
        ok0Var.g = null;
    }
}
