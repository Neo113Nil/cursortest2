package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* loaded from: classes14.dex */
public final class ka2 {
    public static final ia2 g = new ia2();
    public static final long h = TimeUnit.SECONDS.toMillis(1);
    public static volatile ka2 i;
    public final ha2 c;
    public boolean e;
    public boolean f;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ea2 d = new ea2();

    public ka2(Context context) {
        this.c = new ha2(context);
    }

    public final void a(wd3 wd3Var) {
        synchronized (this.a) {
            try {
                this.d.b(wd3Var);
                if (!this.d.a()) {
                    this.c.c.getClass();
                    zo2.a("om_sdk_js_request_tag");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(wd3 wd3Var) {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.f;
                if (!z) {
                    this.d.a(wd3Var);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            wd3Var.a();
        } else {
            a();
        }
    }

    public final void c() {
        synchronized (this.a) {
            this.b.removeCallbacksAndMessages(null);
            this.e = false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a() {
        boolean z;
        synchronized (this.a) {
            try {
                if (this.e) {
                    z = false;
                } else {
                    z = true;
                    this.e = true;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            b();
            this.c.a(new ja2(this));
        }
    }

    public final void b() {
        this.b.postDelayed(new Runnable() { // from class: yads.ka2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ka2.a(ka2.this);
            }
        }, h);
    }

    public static final void a(ka2 ka2Var) {
        ka2Var.c.c.getClass();
        zo2.a("om_sdk_js_request_tag");
        synchronized (ka2Var.a) {
            ka2Var.f = true;
            Unit unit = Unit.INSTANCE;
        }
        ka2Var.c();
        ka2Var.d.b();
    }
}
