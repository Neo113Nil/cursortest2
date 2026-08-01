package f0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096l extends F {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2102C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2103D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2104A;

    /* renamed from: B, reason: collision with root package name */
    public final K0.B f2105B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2107b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2108c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2109e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2110f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2111g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2112j;

    /* renamed from: k, reason: collision with root package name */
    public int f2113k;

    /* renamed from: l, reason: collision with root package name */
    public int f2114l;

    /* renamed from: m, reason: collision with root package name */
    public float f2115m;

    /* renamed from: n, reason: collision with root package name */
    public int f2116n;

    /* renamed from: o, reason: collision with root package name */
    public int f2117o;

    /* renamed from: p, reason: collision with root package name */
    public float f2118p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2121s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2128z;

    /* renamed from: q, reason: collision with root package name */
    public int f2119q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2120r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2122t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2123u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2124v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2125w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2126x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2127y = new int[2];

    public C0096l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2128z = ofFloat;
        this.f2104A = 0;
        K0.B b2 = new K0.B(6, this);
        this.f2105B = b2;
        C0094j c0094j = new C0094j(this);
        this.f2108c = stateListDrawable;
        this.d = drawable;
        this.f2111g = stateListDrawable2;
        this.h = drawable2;
        this.f2109e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2110f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2112j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2106a = i2;
        this.f2107b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0095k(this));
        ofFloat.addUpdateListener(new K0.C(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2121s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            I i4 = recyclerView2.f1451l;
            if (i4 != null) {
                i4.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f1453m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2121s;
            recyclerView3.f1455n.remove(this);
            if (recyclerView3.f1457o == this) {
                recyclerView3.f1457o = null;
            }
            ArrayList arrayList2 = this.f2121s.f1441e0;
            if (arrayList2 != null) {
                arrayList2.remove(c0094j);
            }
            this.f2121s.removeCallbacks(b2);
        }
        this.f2121s = recyclerView;
        if (recyclerView != null) {
            recyclerView.g(this);
            this.f2121s.f1455n.add(this);
            this.f2121s.h(c0094j);
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

    @Override // f0.F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2119q;
        RecyclerView recyclerView2 = this.f2121s;
        if (i != recyclerView2.getWidth() || this.f2120r != recyclerView2.getHeight()) {
            this.f2119q = recyclerView2.getWidth();
            this.f2120r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2104A != 0) {
            if (this.f2122t) {
                int i2 = this.f2119q;
                int i3 = this.f2109e;
                int i4 = i2 - i3;
                int i5 = this.f2114l;
                int i6 = this.f2113k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2108c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2120r;
                int i9 = this.f2110f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = K.T.f381a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f2123u) {
                int i10 = this.f2120r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2117o;
                int i14 = this.f2116n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2111g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2119q;
                int i17 = this.f2112j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f2120r - this.i) {
            int i = this.f2117o;
            int i2 = this.f2116n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2121s;
        WeakHashMap weakHashMap = K.T.f381a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2109e;
        if (z2) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f2119q - i) {
            return false;
        }
        int i2 = this.f2114l;
        int i3 = this.f2113k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        K0.B b2 = this.f2105B;
        StateListDrawable stateListDrawable = this.f2108c;
        if (i == 2 && this.f2124v != 2) {
            stateListDrawable.setState(f2102C);
            this.f2121s.removeCallbacks(b2);
        }
        if (i == 0) {
            this.f2121s.invalidate();
        } else {
            g();
        }
        if (this.f2124v == 2 && i != 2) {
            stateListDrawable.setState(f2103D);
            this.f2121s.removeCallbacks(b2);
            this.f2121s.postDelayed(b2, 1200);
        } else if (i == 1) {
            this.f2121s.removeCallbacks(b2);
            this.f2121s.postDelayed(b2, 1500);
        }
        this.f2124v = i;
    }

    public final void g() {
        int i = this.f2104A;
        ValueAnimator valueAnimator = this.f2128z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2104A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
