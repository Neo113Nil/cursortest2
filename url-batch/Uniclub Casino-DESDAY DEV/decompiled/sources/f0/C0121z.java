package f0;

import K.C0016q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: f0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2191a;

    public /* synthetic */ C0121z(RecyclerView recyclerView) {
        this.f2191a = recyclerView;
    }

    public void a(C0097a c0097a) {
        int i = c0097a.f2031a;
        RecyclerView recyclerView = this.f2191a;
        if (i == 1) {
            recyclerView.f1453l.W(c0097a.f2032b, c0097a.f2033c);
            return;
        }
        if (i == 2) {
            recyclerView.f1453l.Z(c0097a.f2032b, c0097a.f2033c);
        } else if (i == 4) {
            recyclerView.f1453l.a0(c0097a.f2032b, c0097a.f2033c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1453l.Y(c0097a.f2032b, c0097a.f2033c);
        }
    }

    public X b(int i) {
        RecyclerView recyclerView = this.f2191a;
        int m2 = recyclerView.f1442e.m();
        int i2 = 0;
        X x2 = null;
        while (true) {
            if (i2 >= m2) {
                break;
            }
            X I2 = RecyclerView.I(recyclerView.f1442e.l(i2));
            if (I2 != null && !I2.i() && I2.f2016c == i) {
                if (!((ArrayList) recyclerView.f1442e.d).contains(I2.f2014a)) {
                    x2 = I2;
                    break;
                }
                x2 = I2;
            }
            i2++;
        }
        if (x2 == null || ((ArrayList) recyclerView.f1442e.d).contains(x2.f2014a)) {
            return null;
        }
        return x2;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2191a;
        int m2 = recyclerView.f1442e.m();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m2; i6++) {
            View l2 = recyclerView.f1442e.l(i6);
            X I2 = RecyclerView.I(l2);
            if (I2 != null && !I2.p() && (i4 = I2.f2016c) >= i && i4 < i5) {
                I2.a(2);
                I2.a(1024);
                ((J) l2.getLayoutParams()).f1977c = true;
            }
        }
        O o2 = recyclerView.f1437b;
        ArrayList arrayList = o2.f1985c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x2 = (X) arrayList.get(size);
            if (x2 != null && (i3 = x2.f2016c) >= i && i3 < i5) {
                x2.a(2);
                o2.e(size);
            }
        }
        recyclerView.f1447g0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2191a;
        int m2 = recyclerView.f1442e.m();
        for (int i3 = 0; i3 < m2; i3++) {
            X I2 = RecyclerView.I(recyclerView.f1442e.l(i3));
            if (I2 != null && !I2.p() && I2.f2016c >= i) {
                I2.m(i2, false);
                recyclerView.f1440c0.f2000f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1437b.f1985c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x2 = (X) arrayList.get(i4);
            if (x2 != null && x2.f2016c >= i) {
                x2.m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1445f0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f2191a;
        int m2 = recyclerView.f1442e.m();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < m2; i11++) {
            X I2 = RecyclerView.I(recyclerView.f1442e.l(i11));
            if (I2 != null && (i9 = I2.f2016c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    I2.m(i2 - i, false);
                } else {
                    I2.m(i5, false);
                }
                recyclerView.f1440c0.f2000f = true;
            }
        }
        O o2 = recyclerView.f1437b;
        o2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = o2.f1985c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            X x2 = (X) arrayList.get(i12);
            if (x2 != null && (i8 = x2.f2016c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    x2.m(i2 - i, false);
                } else {
                    x2.m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1445f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(X x2, C0016q c0016q, C0016q c0016q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2191a;
        recyclerView.getClass();
        x2.o(false);
        C0105i c0105i = (C0105i) recyclerView.f1419H;
        if (c0016q != null) {
            c0105i.getClass();
            int i = c0016q.f433a;
            int i2 = c0016q2.f433a;
            if (i != i2 || c0016q.f434b != c0016q2.f434b) {
                z2 = c0105i.g(x2, i, c0016q.f434b, i2, c0016q2.f434b);
                if (z2) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        c0105i.l(x2);
        x2.f2014a.setAlpha(0.0f);
        c0105i.i.add(x2);
        z2 = true;
        if (z2) {
        }
    }

    public void g(X x2, C0016q c0016q, C0016q c0016q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2191a;
        recyclerView.f1437b.j(x2);
        recyclerView.f(x2);
        x2.o(false);
        C0105i c0105i = (C0105i) recyclerView.f1419H;
        c0105i.getClass();
        int i = c0016q.f433a;
        int i2 = c0016q.f434b;
        View view = x2.f2014a;
        int left = c0016q2 == null ? view.getLeft() : c0016q2.f433a;
        int top = c0016q2 == null ? view.getTop() : c0016q2.f434b;
        if (x2.i() || (i == left && i2 == top)) {
            c0105i.l(x2);
            c0105i.h.add(x2);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0105i.g(x2, i, i2, left, top);
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2191a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
