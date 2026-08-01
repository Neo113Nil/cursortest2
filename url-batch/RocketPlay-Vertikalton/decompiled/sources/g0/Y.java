package g0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f2823a;

    /* renamed from: b, reason: collision with root package name */
    public int f2824b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2825c;
    public Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2826e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2828g;

    public Y(RecyclerView recyclerView) {
        this.f2828g = recyclerView;
        T.d dVar = RecyclerView.f1952E0;
        this.d = dVar;
        this.f2826e = false;
        this.f2827f = false;
        this.f2825c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.f2828g;
        recyclerView.setScrollState(2);
        this.f2824b = 0;
        this.f2823a = 0;
        Interpolator interpolator = this.d;
        T.d dVar = RecyclerView.f1952E0;
        if (interpolator != dVar) {
            this.d = dVar;
            this.f2825c = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f2825c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f2826e) {
            this.f2827f = true;
            return;
        }
        RecyclerView recyclerView = this.f2828g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = K.T.f633a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f2828g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z2 = abs > abs2;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z2) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f1952E0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f2825c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2824b = 0;
        this.f2823a = 0;
        recyclerView.setScrollState(2);
        this.f2825c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f2828g;
        if (recyclerView.f2000m == null) {
            recyclerView.removeCallbacks(this);
            this.f2825c.abortAnimation();
            return;
        }
        this.f2827f = false;
        this.f2826e = true;
        recyclerView.p();
        OverScroller overScroller = this.f2825c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f2823a;
            int i6 = currY - this.f2824b;
            this.f2823a = currX;
            this.f2824b = currY;
            int o2 = RecyclerView.o(i5, recyclerView.F, recyclerView.f1963H, recyclerView.getWidth());
            int o3 = RecyclerView.o(i6, recyclerView.f1962G, recyclerView.f1964I, recyclerView.getHeight());
            int[] iArr = recyclerView.f2008q0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u2 = recyclerView.u(o2, o3, iArr, null, 1);
            int[] iArr2 = recyclerView.f2008q0;
            if (u2) {
                o2 -= iArr2[0];
                o3 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o2, o3);
            }
            if (recyclerView.f1998l != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.d0(o2, o3, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = o2 - i7;
                int i10 = o3 - i8;
                C0168v c0168v = recyclerView.f2000m.f2780e;
                if (c0168v != null && !c0168v.d && c0168v.f2994e) {
                    int b2 = recyclerView.f1987e0.b();
                    if (b2 == 0) {
                        c0168v.i();
                    } else if (c0168v.f2991a >= b2) {
                        c0168v.f2991a = b2 - 1;
                        c0168v.g(i7, i8);
                    } else {
                        c0168v.g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = o2;
                i2 = o3;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f2003o.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f2008q0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.v(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.w(i4, i11);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C0168v c0168v2 = recyclerView.f2000m.f2780e;
            if ((c0168v2 == null || !c0168v2.d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.y();
                        if (recyclerView.F.isFinished()) {
                            recyclerView.F.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.z();
                        if (recyclerView.f1963H.isFinished()) {
                            recyclerView.f1963H.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.f1962G.isFinished()) {
                            recyclerView.f1962G.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f1964I.isFinished()) {
                            recyclerView.f1964I.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = K.T.f633a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.C0) {
                    C0160m c0160m = recyclerView.f1985d0;
                    int[] iArr4 = c0160m.f2954c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0160m.d = 0;
                }
            } else {
                b();
                RunnableC0162o runnableC0162o = recyclerView.f1984c0;
                if (runnableC0162o != null) {
                    runnableC0162o.a(recyclerView, i4, i11);
                }
            }
        }
        C0168v c0168v3 = recyclerView.f2000m.f2780e;
        if (c0168v3 != null && c0168v3.d) {
            c0168v3.g(0, 0);
        }
        this.f2826e = false;
        if (!this.f2827f) {
            recyclerView.setScrollState(0);
            recyclerView.j0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = K.T.f633a;
            recyclerView.postOnAnimation(this);
        }
    }
}
