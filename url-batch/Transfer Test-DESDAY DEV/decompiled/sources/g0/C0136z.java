package g0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2571a;

    public /* synthetic */ C0136z(RecyclerView recyclerView) {
        this.f2571a = recyclerView;
    }

    public void a(C0112a c0112a) {
        int i = c0112a.f2408a;
        RecyclerView recyclerView = this.f2571a;
        if (i == 1) {
            recyclerView.f1621m.Y(c0112a.f2409b, c0112a.f2410c);
            return;
        }
        if (i == 2) {
            recyclerView.f1621m.b0(c0112a.f2409b, c0112a.f2410c);
        } else if (i == 4) {
            recyclerView.f1621m.c0(c0112a.f2409b, c0112a.f2410c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1621m.a0(c0112a.f2409b, c0112a.f2410c);
        }
    }

    public Z b(int i) {
        RecyclerView recyclerView = this.f2571a;
        int h = recyclerView.f1609f.h();
        int i2 = 0;
        Z z2 = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            Z L2 = RecyclerView.L(recyclerView.f1609f.g(i2));
            if (L2 != null && !L2.i() && L2.f2394c == i) {
                if (!recyclerView.f1609f.f2417c.contains(L2.f2392a)) {
                    z2 = L2;
                    break;
                }
                z2 = L2;
            }
            i2++;
        }
        if (z2 == null) {
            return null;
        }
        if (!recyclerView.f1609f.f2417c.contains(z2.f2392a)) {
            return z2;
        }
        if (RecyclerView.f1576y0) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2571a;
        int h = recyclerView.f1609f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g2 = recyclerView.f1609f.g(i6);
            Z L2 = RecyclerView.L(g2);
            if (L2 != null && !L2.p() && (i4 = L2.f2394c) >= i && i4 < i5) {
                L2.a(2);
                L2.a(1024);
                ((J) g2.getLayoutParams()).f2353c = true;
            }
        }
        O o2 = recyclerView.f1604c;
        ArrayList arrayList = o2.f2362c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Z z2 = (Z) arrayList.get(size);
            if (z2 != null && (i3 = z2.f2394c) >= i && i3 < i5) {
                z2.a(2);
                o2.g(size);
            }
        }
        recyclerView.f1614i0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2571a;
        int h = recyclerView.f1609f.h();
        for (int i3 = 0; i3 < h; i3++) {
            Z L2 = RecyclerView.L(recyclerView.f1609f.g(i3));
            if (L2 != null && !L2.p() && L2.f2394c >= i) {
                if (RecyclerView.f1576y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + L2 + " now at position " + (L2.f2394c + i2));
                }
                L2.m(i2, false);
                recyclerView.f1608e0.f2378f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1604c.f2362c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Z z2 = (Z) arrayList.get(i4);
            if (z2 != null && z2.f2394c >= i) {
                if (RecyclerView.f1576y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + z2 + " now at position " + (z2.f2394c + i2));
                }
                z2.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1613h0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f2571a;
        int h = recyclerView.f1609f.h();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z2 = false;
        for (int i11 = 0; i11 < h; i11++) {
            Z L2 = RecyclerView.L(recyclerView.f1609f.g(i11));
            if (L2 != null && (i10 = L2.f2394c) >= i4 && i10 <= i3) {
                if (RecyclerView.f1576y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + L2);
                }
                if (L2.f2394c == i) {
                    L2.m(i2 - i, false);
                } else {
                    L2.m(i5, false);
                }
                recyclerView.f1608e0.f2378f = true;
            }
        }
        O o2 = recyclerView.f1604c;
        o2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        ArrayList arrayList = o2.f2362c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Z z3 = (Z) arrayList.get(i12);
            if (z3 != null && (i9 = z3.f2394c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    z3.m(i2 - i, z2);
                } else {
                    z3.m(i8, z2);
                }
                if (RecyclerView.f1576y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + z3);
                }
            }
            i12++;
            z2 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1613h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(Z z2, K.r rVar, K.r rVar2) {
        boolean z3;
        RecyclerView recyclerView = this.f2571a;
        recyclerView.getClass();
        z2.o(false);
        C0121j c0121j = (C0121j) recyclerView.f1586J;
        if (rVar != null) {
            c0121j.getClass();
            int i = rVar.f440a;
            int i2 = rVar2.f440a;
            if (i != i2 || rVar.f441b != rVar2.f441b) {
                z3 = c0121j.g(z2, i, rVar.f441b, i2, rVar2.f441b);
                if (z3) {
                    return;
                }
                recyclerView.V();
                return;
            }
        }
        c0121j.l(z2);
        z2.f2392a.setAlpha(RecyclerView.f1570A0);
        c0121j.i.add(z2);
        z3 = true;
        if (z3) {
        }
    }

    public void g(Z z2, K.r rVar, K.r rVar2) {
        boolean z3;
        RecyclerView recyclerView = this.f2571a;
        recyclerView.f1604c.l(z2);
        recyclerView.h(z2);
        z2.o(false);
        C0121j c0121j = (C0121j) recyclerView.f1586J;
        c0121j.getClass();
        int i = rVar.f440a;
        int i2 = rVar.f441b;
        View view = z2.f2392a;
        int left = rVar2 == null ? view.getLeft() : rVar2.f440a;
        int top = rVar2 == null ? view.getTop() : rVar2.f441b;
        if (z2.i() || (i == left && i2 == top)) {
            c0121j.l(z2);
            c0121j.h.add(z2);
            z3 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z3 = c0121j.g(z2, i, i2, left, top);
        }
        if (z3) {
            recyclerView.V();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2571a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
