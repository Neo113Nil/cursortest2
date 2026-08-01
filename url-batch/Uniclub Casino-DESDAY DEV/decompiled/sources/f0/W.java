package f0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f2007a;

    /* renamed from: b, reason: collision with root package name */
    public int f2008b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2009c;
    public Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2010e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2012g;

    public W(RecyclerView recyclerView) {
        this.f2012g = recyclerView;
        S.d dVar = RecyclerView.f1412u0;
        this.d = dVar;
        this.f2010e = false;
        this.f2011f = false;
        this.f2009c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f2010e) {
            this.f2011f = true;
            return;
        }
        RecyclerView recyclerView = this.f2012g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = K.S.f360a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        int i4;
        RecyclerView recyclerView = this.f2012g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i5 = width / 2;
            float f2 = width;
            float f3 = i5;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i4 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i4, 2000);
        }
        int i6 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f1412u0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f2009c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2008b = 0;
        this.f2007a = 0;
        recyclerView.setScrollState(2);
        this.f2009c.startScroll(0, 0, i, i2, i6);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f2012g;
        if (recyclerView.f1453l == null) {
            recyclerView.removeCallbacks(this);
            this.f2009c.abortAnimation();
            return;
        }
        this.f2011f = false;
        this.f2010e = true;
        recyclerView.m();
        OverScroller overScroller = this.f2009c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f2007a;
            int i6 = currY - this.f2008b;
            this.f2007a = currX;
            this.f2008b = currY;
            int[] iArr = recyclerView.f1460o0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r2 = recyclerView.r(i5, i6, iArr, null, 1);
            int[] iArr2 = recyclerView.f1460o0;
            if (r2) {
                i5 -= iArr2[0];
                i6 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i5, i6);
            }
            if (recyclerView.f1451k != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.X(i5, i6, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = i5 - i7;
                int i10 = i6 - i8;
                C0117v c0117v = recyclerView.f1453l.f1966e;
                if (c0117v != null && !c0117v.d && c0117v.f2176e) {
                    int b2 = recyclerView.f1440c0.b();
                    if (b2 == 0) {
                        c0117v.i();
                    } else if (c0117v.f2173a >= b2) {
                        c0117v.f2173a = b2 - 1;
                        c0117v.g(i7, i8);
                    } else {
                        c0117v.g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f1455m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1460o0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.s(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.t(i4, i11);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C0117v c0117v2 = recyclerView.f1453l.f1966e;
            if ((c0117v2 == null || !c0117v2.d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.v();
                        if (recyclerView.f1416D.isFinished()) {
                            recyclerView.f1416D.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.w();
                        if (recyclerView.F.isFinished()) {
                            recyclerView.F.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f1417E.isFinished()) {
                            recyclerView.f1417E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f1418G.isFinished()) {
                            recyclerView.f1418G.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = K.S.f360a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0109m c0109m = recyclerView.f1438b0;
                int[] iArr4 = c0109m.f2136c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0109m.d = 0;
            } else {
                a();
                RunnableC0111o runnableC0111o = recyclerView.f1436a0;
                if (runnableC0111o != null) {
                    runnableC0111o.a(recyclerView, i4, i11);
                }
            }
        }
        C0117v c0117v3 = recyclerView.f1453l.f1966e;
        if (c0117v3 != null && c0117v3.d) {
            c0117v3.g(0, 0);
        }
        this.f2010e = false;
        if (!this.f2011f) {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = K.S.f360a;
            recyclerView.postOnAnimation(this);
        }
    }
}
