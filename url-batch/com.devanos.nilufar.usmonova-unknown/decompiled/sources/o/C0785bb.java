package o;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

/* renamed from: o.bb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785bb {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public boolean a(float f, float f2) {
        ViewParent c;
        if (this.a && (c = c(0)) != null) {
            try {
                return AbstractC0811c00.b(c, (NestedScrollView) this.d, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    public boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent c;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (this.a && (c = c(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (((int[]) this.e) == null) {
                        this.e = new int[2];
                    }
                    int[] iArr4 = (int[]) this.e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (c instanceof InterfaceC1616oE) {
                    ((InterfaceC1616oE) c).c(nestedScrollView, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (c instanceof InterfaceC1550nE) {
                        ((InterfaceC1550nE) c).e(nestedScrollView, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            AbstractC0811c00.d(c, nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + c + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public ViewParent c(int i) {
        if (i == 0) {
            return (ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int d(C0208Hx c0208Hx, S2 s2, boolean z) {
        Object[] objArr;
        int i;
        C0950e6 c0950e6 = (C0950e6) this.c;
        C2182wr c2182wr = (C2182wr) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            C2002u5 o2 = ((C1590ns) this.d).o(c0208Hx, s2);
            C1219iB c1219iB = (C1219iB) o2.i;
            int e = c1219iB.e();
            for (int i2 = 0; i2 < e; i2++) {
                HI hi = (HI) c1219iB.f(i2);
                if (!hi.d && !hi.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int e2 = c1219iB.e();
            for (0; i < e2; i + 1) {
                HI hi2 = (HI) c1219iB.f(i);
                if (objArr == false) {
                    i = (!hi2.h && hi2.d) == true ? 0 : i + 1;
                }
                ((C0027Ay) this.b).p(hi2.c, (C2182wr) this.e, hi2.i == 1, true);
                if (!c2182wr.isEmpty()) {
                    c0950e6.k(hi2.a, c2182wr, !hi2.h && hi2.d);
                    c2182wr.clear();
                }
            }
            ((C1590ns) c0950e6.j).p();
            boolean r = c0950e6.r(o2, z);
            int e3 = c1219iB.e();
            for (int i3 = 0; i3 < e3; i3++) {
                HI hi3 = (HI) c1219iB.f(i3);
                BF.e(hi3.c, hi3.g);
            }
            this.a = false;
            return r ? 1 : 0;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public void e() {
        if (this.a) {
            return;
        }
        ((C1219iB) ((C1590ns) this.d).i).a();
        C0950e6 c0950e6 = (C0950e6) this.c;
        YD yd = (YD) ((C1590ns) c0950e6.j).i;
        int i = yd.j;
        if (i > 0) {
            Object[] objArr = yd.h;
            int i2 = 0;
            do {
                ((EE) objArr[i2]).y();
                i2++;
            } while (i2 < i);
        }
        ((YD) ((C1590ns) c0950e6.j).i).h();
    }
}
