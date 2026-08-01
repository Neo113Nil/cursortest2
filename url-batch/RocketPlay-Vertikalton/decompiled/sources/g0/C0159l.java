package g0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159l extends AbstractC0136F {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2925C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2926D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2927A;

    /* renamed from: B, reason: collision with root package name */
    public final A1.e f2928B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2929a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2930b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2931c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2932e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2933f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2934g;
    public final Drawable h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2935j;

    /* renamed from: k, reason: collision with root package name */
    public int f2936k;

    /* renamed from: l, reason: collision with root package name */
    public int f2937l;

    /* renamed from: m, reason: collision with root package name */
    public float f2938m;

    /* renamed from: n, reason: collision with root package name */
    public int f2939n;

    /* renamed from: o, reason: collision with root package name */
    public int f2940o;

    /* renamed from: p, reason: collision with root package name */
    public float f2941p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2944s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2951z;

    /* renamed from: q, reason: collision with root package name */
    public int f2942q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2943r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2945t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2946u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2947v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2948w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2949x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2950y = new int[2];

    public C0159l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.f1949A0, 1.0f);
        this.f2951z = ofFloat;
        this.f2927A = 0;
        A1.e eVar = new A1.e(8, this);
        this.f2928B = eVar;
        C0157j c0157j = new C0157j(this);
        this.f2931c = stateListDrawable;
        this.d = drawable;
        this.f2934g = stateListDrawable2;
        this.h = drawable2;
        this.f2932e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2933f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2935j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2929a = i2;
        this.f2930b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0158k(this));
        ofFloat.addUpdateListener(new P0.A(1 == true ? 1 : 0, this));
        RecyclerView recyclerView2 = this.f2944s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0139I abstractC0139I = recyclerView2.f2000m;
            if (abstractC0139I != null) {
                abstractC0139I.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2003o;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f2944s;
            recyclerView3.f2005p.remove(this);
            if (recyclerView3.f2007q == this) {
                recyclerView3.f2007q = null;
            }
            ArrayList arrayList2 = this.f2944s.f1991g0;
            if (arrayList2 != null) {
                arrayList2.remove(c0157j);
            }
            this.f2944s.removeCallbacks(eVar);
        }
        this.f2944s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f2944s.f2005p.add(this);
            this.f2944s.j(c0157j);
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

    @Override // g0.AbstractC0136F
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f2942q;
        RecyclerView recyclerView2 = this.f2944s;
        if (i != recyclerView2.getWidth() || this.f2943r != recyclerView2.getHeight()) {
            this.f2942q = recyclerView2.getWidth();
            this.f2943r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f2927A != 0) {
            if (this.f2945t) {
                int i2 = this.f2942q;
                int i3 = this.f2932e;
                int i4 = i2 - i3;
                int i5 = this.f2937l;
                int i6 = this.f2936k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f2931c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f2943r;
                int i9 = this.f2933f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = K.T.f633a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, RecyclerView.f1949A0);
                    drawable.draw(canvas);
                    canvas.translate(RecyclerView.f1949A0, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f2946u) {
                int i10 = this.f2943r;
                int i11 = this.i;
                int i12 = i10 - i11;
                int i13 = this.f2940o;
                int i14 = this.f2939n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f2934g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f2942q;
                int i17 = this.f2935j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(RecyclerView.f1949A0, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, RecyclerView.f1949A0);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean c(float f2, float f3) {
        if (f3 >= this.f2943r - this.i) {
            int i = this.f2940o;
            int i2 = this.f2939n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(float f2, float f3) {
        RecyclerView recyclerView = this.f2944s;
        WeakHashMap weakHashMap = K.T.f633a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f2932e;
        if (z2) {
            if (f2 > i) {
                return false;
            }
        } else if (f2 < this.f2942q - i) {
            return false;
        }
        int i2 = this.f2937l;
        int i3 = this.f2936k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final void f(int i) {
        A1.e eVar = this.f2928B;
        StateListDrawable stateListDrawable = this.f2931c;
        if (i == 2 && this.f2947v != 2) {
            stateListDrawable.setState(f2925C);
            this.f2944s.removeCallbacks(eVar);
        }
        if (i == 0) {
            this.f2944s.invalidate();
        } else {
            g();
        }
        if (this.f2947v == 2 && i != 2) {
            stateListDrawable.setState(f2926D);
            this.f2944s.removeCallbacks(eVar);
            this.f2944s.postDelayed(eVar, 1200);
        } else if (i == 1) {
            this.f2944s.removeCallbacks(eVar);
            this.f2944s.postDelayed(eVar, 1500);
        }
        this.f2947v = i;
    }

    public final void g() {
        int i = this.f2927A;
        ValueAnimator valueAnimator = this.f2951z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2927A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
