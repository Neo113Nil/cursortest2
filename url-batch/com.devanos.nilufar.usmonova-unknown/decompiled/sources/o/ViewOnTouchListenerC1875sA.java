package o;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.google.firebase.messaging.ServiceStarter;
import java.util.WeakHashMap;

/* renamed from: o.sA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1875sA implements View.OnTouchListener {
    public static final int y = ViewConfiguration.getTapTimeout();
    public final C1609o7 h;
    public final AccelerateInterpolator i;
    public final C1713pj j;
    public R2 k;
    public final float[] l;
    public final float[] m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final int f217o;
    public final float[] p;
    public final float[] q;
    public final float[] r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final C1713pj x;

    public ViewOnTouchListenerC1875sA(C1713pj c1713pj) {
        C1609o7 c1609o7 = new C1609o7();
        c1609o7.e = Long.MIN_VALUE;
        c1609o7.g = -1L;
        c1609o7.f = 0L;
        this.h = c1609o7;
        this.i = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.l = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.m = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.p = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.q = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.r = fArr5;
        this.j = c1713pj;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.n = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f217o = y;
        c1609o7.a = ServiceStarter.ERROR_UNKNOWN;
        c1609o7.b = ServiceStarter.ERROR_UNKNOWN;
        this.x = c1713pj;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f, float f2, float f3) {
        float f4;
        float interpolation;
        float b = b(this.l[i] * f2, 0.0f, this.m[i]);
        float c = c(f2 - f, b) - c(f, b);
        AccelerateInterpolator accelerateInterpolator = this.i;
        if (c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else {
            if (c <= 0.0f) {
                f4 = 0.0f;
                if (f4 != 0.0f) {
                    return 0.0f;
                }
                float f5 = this.p[i];
                float f6 = this.q[i];
                float f7 = this.r[i];
                float f8 = f5 * f3;
                return f4 > 0.0f ? b(f4 * f8, f6, f7) : -b((-f4) * f8, f6, f7);
            }
            interpolation = accelerateInterpolator.getInterpolation(c);
        }
        f4 = b(interpolation, -1.0f, 1.0f);
        if (f4 != 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.n;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.v && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.t) {
            this.v = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C1609o7 c1609o7 = this.h;
        int i2 = (int) (currentAnimationTimeMillis - c1609o7.e);
        int i3 = c1609o7.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c1609o7.i = i;
        c1609o7.h = c1609o7.a(currentAnimationTimeMillis);
        c1609o7.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C1713pj c1713pj;
        int count;
        C1609o7 c1609o7 = this.h;
        float f = c1609o7.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(c1609o7.c);
        if (abs != 0 && (count = (c1713pj = this.x).getCount()) != 0) {
            int childCount = c1713pj.getChildCount();
            int firstVisiblePosition = c1713pj.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c1713pj.getChildAt(0).getTop() >= 0)) : !(i >= count && c1713pj.getChildAt(childCount - 1).getBottom() <= c1713pj.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.w) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.u = true;
            this.s = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            C1713pj c1713pj = this.j;
            float a = a(0, x, width, c1713pj.getWidth());
            float a2 = a(1, motionEvent.getY(), view.getHeight(), c1713pj.getHeight());
            C1609o7 c1609o7 = this.h;
            c1609o7.c = a;
            c1609o7.d = a2;
            if (!this.v && e()) {
                if (this.k == null) {
                    this.k = new R2(i2, this);
                }
                this.v = true;
                this.t = true;
                if (this.s || (i = this.f217o) <= 0) {
                    this.k.run();
                } else {
                    R2 r2 = this.k;
                    long j = i;
                    WeakHashMap weakHashMap = AZ.a;
                    c1713pj.postOnAnimationDelayed(r2, j);
                }
                this.s = true;
            }
        }
        return false;
    }
}
