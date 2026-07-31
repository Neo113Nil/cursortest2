package yads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* loaded from: classes10.dex */
public final class ei3 {
    public final hu0 a = new hu0();
    public final ai3 b;
    public final di3 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ei3(Context context) {
        ai3 ai3Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            ai3Var = sb3.a >= 17 ? ci3.a(applicationContext) : null;
            if (ai3Var == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    ai3Var = new bi3(windowManager);
                }
            }
            this.b = ai3Var;
            this.c = ai3Var != null ? di3.f : null;
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
            this.f = -1.0f;
            this.i = 1.0f;
            this.j = 0;
        }
        ai3Var = null;
        this.b = ai3Var;
        this.c = ai3Var != null ? di3.f : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        this.d = true;
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
        if (this.b != null) {
            di3 di3Var = this.c;
            di3Var.getClass();
            di3Var.c.sendEmptyMessage(1);
            this.b.a(new zh3() { // from class: yads.ei3$$ExternalSyntheticLambda0
                @Override // yads.zh3
                public final void a(Display display) {
                    ei3.this.a(display);
                }
            });
        }
        a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f;
        float f2;
        if (sb3.a < 30 || this.e == null) {
            return;
        }
        if (this.a.a.a()) {
            hu0 hu0Var = this.a;
            if (hu0Var.a.a()) {
                f = (float) (1.0E9d / (hu0Var.a.e != 0 ? r0.f / r3 : 0L));
            } else {
                f = -1.0f;
            }
        } else {
            f = this.f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (this.a.a.a()) {
                hu0 hu0Var2 = this.a;
                if ((hu0Var2.a.a() ? hu0Var2.a.f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.02f;
                    if (Math.abs(f - this.g) < f2) {
                        return;
                    }
                }
            }
            f2 = 1.0f;
            if (Math.abs(f - this.g) < f2) {
            }
        } else if (f == -1.0f && this.a.e < 30) {
            return;
        }
        this.g = f;
        a(false);
    }

    public final void a(boolean z) {
        Surface surface;
        float f;
        if (sb3.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
                if (z && this.h == f) {
                    return;
                }
                this.h = f;
                yh3.a(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.h = f;
        yh3.a(surface, f);
    }

    public final void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            gh1.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.k = -9223372036854775807L;
            this.l = -9223372036854775807L;
        }
    }
}
