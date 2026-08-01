package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class v20 {
    public static final ig m = new ig(1);
    public static final ig n = new ig(2);
    public static final ig o = new ig(3);
    public static final ig p = new ig(4);
    public static final ig q = new ig(5);
    public static final ig r = new ig(0);
    public final z10 c;
    public final m60 d;
    public final float g;
    public w20 j;
    public float k;
    public boolean l;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean e = false;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public v20(z10 z10Var, m60 m60Var) {
        this.c = z10Var;
        this.d = m60Var;
        if (m60Var == o || m60Var == p || m60Var == q) {
            this.g = 0.1f;
        } else if (m60Var == r) {
            this.g = 0.00390625f;
        } else if (m60Var == m || m60Var == n) {
            this.g = 0.002f;
        } else {
            this.g = 1.0f;
        }
        this.j = null;
        this.k = Float.MAX_VALUE;
        this.l = false;
    }

    public static x2 b() {
        ThreadLocal threadLocal = x2.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new x2(new o4(3)));
        }
        return (x2) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, v2] */
    public final void a(float f) {
        float durationScale;
        if (this.e) {
            this.k = f;
            return;
        }
        if (this.j == null) {
            this.j = new w20(f);
        }
        w20 w20Var = this.j;
        double d = f;
        w20Var.i = d;
        double d2 = (float) d;
        if (d2 > 3.4028234663852886E38d) {
            l8.x("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < -3.4028234663852886E38d) {
            l8.x("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.g * 0.75f);
        w20Var.d = abs;
        w20Var.e = abs * 62.5d;
        o4 o4Var = b().e;
        o4Var.getClass();
        if (Thread.currentThread() != ((Looper) o4Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        this.e = true;
        float B = this.d.B(this.c);
        this.b = B;
        if (B > Float.MAX_VALUE || B < -3.4028235E38f) {
            l8.l("Starting value need to be in between min value and max value");
            return;
        }
        x2 b = b();
        ArrayList arrayList = b.b;
        if (arrayList.size() == 0) {
            ((Choreographer) b.e.g).postFrameCallback(new w2(b.d));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                b.g = durationScale;
                if (b.h == null) {
                    b.h = new o4(2, b);
                }
                final o4 o4Var2 = b.h;
                if (((v2) o4Var2.g) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: v2
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((x2) o4.this.h).g = f2;
                        }
                    };
                    o4Var2.g = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.d.Y(this.c, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                l8.c();
                return;
            }
            i++;
        }
    }

    public final void d() {
        if (this.j.b <= 0.0d) {
            l8.x("Spring animations can only come to an end when there is damping");
            return;
        }
        o4 o4Var = b().e;
        o4Var.getClass();
        if (Thread.currentThread() != ((Looper) o4Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.e) {
            this.l = true;
        }
    }
}
