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
    public int f2385a;

    /* renamed from: b, reason: collision with root package name */
    public int f2386b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2387c;
    public Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2388e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2389f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2390g;

    public Y(RecyclerView recyclerView) {
        this.f2390g = recyclerView;
        T.d dVar = RecyclerView.E0;
        this.d = dVar;
        this.f2388e = false;
        this.f2389f = false;
        this.f2387c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.f2390g;
        recyclerView.setScrollState(2);
        this.f2386b = 0;
        this.f2385a = 0;
        Interpolator interpolator = this.d;
        T.d dVar = RecyclerView.E0;
        if (interpolator != dVar) {
            this.d = dVar;
            this.f2387c = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f2387c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f2388e) {
            this.f2389f = true;
            return;
        }
        RecyclerView recyclerView = this.f2390g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = K.T.f372a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f2390g;
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
            interpolator = RecyclerView.E0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f2387c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2386b = 0;
        this.f2385a = 0;
        recyclerView.setScrollState(2);
        this.f2387c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f2390g;
        if (recyclerView.f1621m == null) {
            recyclerView.removeCallbacks(this);
            this.f2387c.abortAnimation();
            return;
        }
        this.f2389f = false;
        this.f2388e = true;
        recyclerView.p();
        OverScroller overScroller = this.f2387c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f2385a;
            int i6 = currY - this.f2386b;
            this.f2385a = currX;
            this.f2386b = currY;
            int o2 = RecyclerView.o(i5, recyclerView.F, recyclerView.f1584H, recyclerView.getWidth());
            int o3 = RecyclerView.o(i6, recyclerView.f1583G, recyclerView.f1585I, recyclerView.getHeight());
            int[] iArr = recyclerView.f1629q0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u2 = recyclerView.u(o2, o3, iArr, null, 1);
            int[] iArr2 = recyclerView.f1629q0;
            if (u2) {
                o2 -= iArr2[0];
                o3 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o2, o3);
            }
            if (recyclerView.f1619l != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.d0(o2, o3, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = o2 - i7;
                int i10 = o3 - i8;
                C0133w c0133w = recyclerView.f1621m.f2342e;
                if (c0133w != null && !c0133w.d && c0133w.f2558e) {
                    int b2 = recyclerView.f1608e0.b();
                    if (b2 == 0) {
                        c0133w.i();
                    } else if (c0133w.f2555a >= b2) {
                        c0133w.f2555a = b2 - 1;
                        c0133w.g(i7, i8);
                    } else {
                        c0133w.g(i7, i8);
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
            if (!recyclerView.f1624o.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1629q0;
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
            C0133w c0133w2 = recyclerView.f1621m.f2342e;
            if ((c0133w2 == null || !c0133w2.d) && z2) {
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
                        if (recyclerView.f1584H.isFinished()) {
                            recyclerView.f1584H.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.f1583G.isFinished()) {
                            recyclerView.f1583G.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f1585I.isFinished()) {
                            recyclerView.f1585I.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = K.T.f372a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1572C0) {
                    C0125n c0125n = recyclerView.f1606d0;
                    int[] iArr4 = c0125n.f2518c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0125n.d = 0;
                }
            } else {
                b();
                RunnableC0127p runnableC0127p = recyclerView.f1605c0;
                if (runnableC0127p != null) {
                    runnableC0127p.a(recyclerView, i4, i11);
                }
            }
        }
        C0133w c0133w3 = recyclerView.f1621m.f2342e;
        if (c0133w3 != null && c0133w3.d) {
            c0133w3.g(0, 0);
        }
        this.f2388e = false;
        if (!this.f2389f) {
            recyclerView.setScrollState(0);
            recyclerView.j0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = K.T.f372a;
            recyclerView.postOnAnimation(this);
        }
    }
}
