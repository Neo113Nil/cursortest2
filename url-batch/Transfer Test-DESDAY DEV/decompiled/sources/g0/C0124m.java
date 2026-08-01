package g0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124m extends F {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2489C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2490D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2491A;

    /* renamed from: B, reason: collision with root package name */
    public final Q.b f2492B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2494b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2495c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2496e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2497f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2498g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2499j;

    /* renamed from: k, reason: collision with root package name */
    public int f2500k;

    /* renamed from: l, reason: collision with root package name */
    public int f2501l;

    /* renamed from: m, reason: collision with root package name */
    public float f2502m;

    /* renamed from: n, reason: collision with root package name */
    public int f2503n;

    /* renamed from: o, reason: collision with root package name */
    public int f2504o;

    /* renamed from: p, reason: collision with root package name */
    public float f2505p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2508s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2515z;

    /* renamed from: q, reason: collision with root package name */
    public int f2506q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2507r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2509t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2510u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2511v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2512w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2513x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2514y = new int[2];

    public C0124m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1570A0, 1.0f);
        this.f2515z = ofFloat;
        this.f2491A = 0;
        Q.b bVar = new Q.b(7, this);
        this.f2492B = bVar;
        C0122k c0122k = new C0122k(this);
        this.f2495c = stateListDrawable;
        this.d = drawable;
        this.f2498g = stateListDrawable2;
        this.h = drawable2;
        this.f2496e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2497f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2499j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2493a = i2;
        this.f2494b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0123l(this));
        ofFloat.addUpdateListener(new R0.A(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2508s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            I i4 = recyclerView2.f1621m;
            if (i4 != null) {
                i4.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1624o;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2508s;
            recyclerView3.f1626p.remove(this);
            if (recyclerView3.f1628q == this) {
                recyclerView3.f1628q = null;
            }
            ArrayList arrayList2 = this.f2508s.f1612g0;
            if (arrayList2 != null) {
                arrayList2.remove(c0122k);
            }
            this.f2508s.removeCallbacks(bVar);
        }
        this.f2508s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f2508s.f1626p.add(this);
            this.f2508s.j(c0122k);
        }
    }

    public static int e(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // g0.F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2506q;
        RecyclerView recyclerView2 = this.f2508s;
        if (i != recyclerView2.getWidth() || this.f2507r != recyclerView2.getHeight()) {
            this.f2506q = recyclerView2.getWidth();
            this.f2507r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2491A != 0) {
            if (this.f2509t) {
                int i2 = this.f2506q;
                int i3 = this.f2496e;
                int i4 = i2 - i3;
                int i5 = this.f2501l;
                int i6 = this.f2500k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2495c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2507r;
                int i9 = this.f2497f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = K.T.f372a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, RecyclerView.f1570A0);
                    drawable.draw(canvas);
                    canvas.translate(RecyclerView.f1570A0, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f2510u) {
                int i10 = this.f2507r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2504o;
                int i14 = this.f2503n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2498g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2506q;
                int i17 = this.f2499j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(RecyclerView.f1570A0, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, RecyclerView.f1570A0);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f2507r - this.i) {
            int i = this.f2504o;
            int i2 = this.f2503n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2508s;
        WeakHashMap weakHashMap = K.T.f372a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2496e;
        if (z2) {
            if (f2 > i) {
                return false;
            }
        } else if (f2 < this.f2506q - i) {
            return false;
        }
        int i2 = this.f2501l;
        int i3 = this.f2500k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        Q.b bVar = this.f2492B;
        StateListDrawable stateListDrawable = this.f2495c;
        if (i == 2 && this.f2511v != 2) {
            stateListDrawable.setState(f2489C);
            this.f2508s.removeCallbacks(bVar);
        }
        if (i == 0) {
            this.f2508s.invalidate();
        } else {
            g();
        }
        if (this.f2511v == 2 && i != 2) {
            stateListDrawable.setState(f2490D);
            this.f2508s.removeCallbacks(bVar);
            this.f2508s.postDelayed(bVar, 1200);
        } else if (i == 1) {
            this.f2508s.removeCallbacks(bVar);
            this.f2508s.postDelayed(bVar, 1500);
        }
        this.f2511v = i;
    }

    public final void g() {
        int i = this.f2491A;
        ValueAnimator valueAnimator = this.f2515z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2491A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
