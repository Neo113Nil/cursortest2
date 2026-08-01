package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class cz implements Runnable {
    public int f;
    public int g;
    public OverScroller h;
    public Interpolator i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ RecyclerView l;

    public cz(RecyclerView recyclerView) {
        this.l = recyclerView;
        cy cyVar = RecyclerView.N0;
        this.i = cyVar;
        this.j = false;
        this.k = false;
        this.h = new OverScroller(recyclerView.getContext(), cyVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.l;
        recyclerView.setScrollState(2);
        this.g = 0;
        this.f = 0;
        Interpolator interpolator = this.i;
        cy cyVar = RecyclerView.N0;
        if (interpolator != cyVar) {
            this.i = cyVar;
            this.h = new OverScroller(recyclerView.getContext(), cyVar);
        }
        this.h.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.j) {
            this.k = true;
            return;
        }
        RecyclerView recyclerView = this.l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = f80.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.l;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.N0;
        }
        if (this.i != interpolator) {
            this.i = interpolator;
            this.h = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.g = 0;
        this.f = 0;
        recyclerView.setScrollState(2);
        this.h.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.l;
        int[] iArr = recyclerView.x0;
        if (recyclerView.s == null) {
            recyclerView.removeCallbacks(this);
            this.h.abortAnimation();
            return;
        }
        this.k = false;
        this.j = true;
        recyclerView.p();
        OverScroller overScroller = this.h;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f;
            int i6 = currY - this.g;
            this.f = currX;
            this.g = currY;
            int o = RecyclerView.o(i5, recyclerView.M, recyclerView.O, recyclerView.getWidth());
            int o2 = RecyclerView.o(i6, recyclerView.N, recyclerView.P, recyclerView.getHeight());
            int[] iArr2 = recyclerView.x0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.u(o, o2, 1, iArr2, null)) {
                o -= iArr[0];
                o2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o, o2);
            }
            if (recyclerView.r != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.f0(o, o2, iArr);
                int i7 = iArr[0];
                int i8 = iArr[1];
                int i9 = o - i7;
                int i10 = o2 - i8;
                up upVar = recyclerView.s.e;
                if (upVar != null && !upVar.d && upVar.e) {
                    int b = recyclerView.l0.b();
                    if (b == 0) {
                        upVar.i();
                    } else if (upVar.a >= b) {
                        upVar.a = b - 1;
                        upVar.g(i7, i8);
                    } else {
                        upVar.g(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = o;
                i2 = o2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.u.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.x0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.v(i3, i4, i, i2, null, 1, iArr3);
            int i11 = i - iArr[0];
            int i12 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.w(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            up upVar2 = recyclerView.s.e;
            if ((upVar2 == null || !upVar2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.y();
                        if (recyclerView.M.isFinished()) {
                            recyclerView.M.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.z();
                        if (recyclerView.O.isFinished()) {
                            recyclerView.O.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.P.isFinished()) {
                            recyclerView.P.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.L0) {
                    am amVar = recyclerView.k0;
                    int[] iArr4 = amVar.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    amVar.d = 0;
                }
            } else {
                b();
                cm cmVar = recyclerView.j0;
                if (cmVar != null) {
                    cmVar.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                gy.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        up upVar3 = recyclerView.s.e;
        if (upVar3 != null && upVar3.d) {
            upVar3.g(0, 0);
        }
        this.j = false;
        if (!this.k) {
            recyclerView.setScrollState(0);
            recyclerView.n0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = f80.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
