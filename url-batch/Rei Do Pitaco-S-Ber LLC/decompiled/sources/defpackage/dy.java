package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class dy implements lf {
    public final /* synthetic */ RecyclerView f;

    public /* synthetic */ dy(RecyclerView recyclerView) {
        this.f = recyclerView;
    }

    public void a(x1 x1Var) {
        int i = x1Var.a;
        RecyclerView recyclerView = this.f;
        if (i == 1) {
            recyclerView.s.Y(x1Var.b, x1Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.s.b0(x1Var.b, x1Var.d);
        } else if (i == 4) {
            recyclerView.s.c0(x1Var.b, x1Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.s.a0(x1Var.b, x1Var.d);
        }
    }

    public dz b(int i) {
        RecyclerView recyclerView = this.f;
        int h = recyclerView.k.h();
        int i2 = 0;
        dz dzVar = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            dz M = RecyclerView.M(recyclerView.k.g(i2));
            if (M != null && !M.h() && M.c == i) {
                if (!recyclerView.k.c.contains(M.a)) {
                    dzVar = M;
                    break;
                }
                dzVar = M;
            }
            i2++;
        }
        if (dzVar != null) {
            if (!recyclerView.k.c.contains(dzVar.a)) {
                return dzVar;
            }
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f;
        int h = recyclerView.k.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.k.g(i6);
            dz M = RecyclerView.M(g);
            if (M != null && !M.o() && (i4 = M.c) >= i && i4 < i5) {
                M.a(2);
                if (obj == null) {
                    M.a(1024);
                } else if ((1024 & M.j) == 0) {
                    if (M.k == null) {
                        ArrayList arrayList = new ArrayList();
                        M.k = arrayList;
                        M.l = Collections.unmodifiableList(arrayList);
                    }
                    M.k.add(obj);
                }
                ((oy) g.getLayoutParams()).c = true;
            }
        }
        ty tyVar = recyclerView.h;
        ArrayList arrayList2 = tyVar.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            dz dzVar = (dz) arrayList2.get(size);
            if (dzVar != null && (i3 = dzVar.c) >= i && i3 < i5) {
                dzVar.a(2);
                tyVar.h(size);
            }
        }
        recyclerView.p0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f;
        int h = recyclerView.k.h();
        for (int i3 = 0; i3 < h; i3++) {
            dz M = RecyclerView.M(recyclerView.k.g(i3));
            if (M != null && !M.o() && M.c >= i) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + M + " now at position " + (M.c + i2));
                }
                M.l(i2, false);
                recyclerView.l0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.h.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            dz dzVar = (dz) arrayList.get(i4);
            if (dzVar != null && dzVar.c >= i) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + dzVar + " now at position " + (dzVar.c + i2));
                }
                dzVar.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.o0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f;
        int h = recyclerView.k.h();
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
        for (int i11 = 0; i11 < h; i11++) {
            dz M = RecyclerView.M(recyclerView.k.g(i11));
            if (M != null && (i9 = M.c) >= i4 && i9 <= i3) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + M);
                }
                if (M.c == i) {
                    M.l(i2 - i, false);
                } else {
                    M.l(i5, false);
                }
                recyclerView.l0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.h.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            dz dzVar = (dz) arrayList.get(i12);
            if (dzVar != null && (i8 = dzVar.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    dzVar.l(i2 - i, false);
                } else {
                    dzVar.l(i10, false);
                }
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + dzVar);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.o0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(dz dzVar, av avVar, av avVar2) {
        boolean z;
        dzVar.n(false);
        RecyclerView recyclerView = this.f;
        je jeVar = (je) recyclerView.Q;
        if (avVar != null) {
            jeVar.getClass();
            int i = avVar.a;
            int i2 = avVar2.a;
            if (i != i2 || avVar.b != avVar2.b) {
                z = jeVar.g(dzVar, i, avVar.b, i2, avVar2.b);
                if (z) {
                    return;
                }
                recyclerView.W();
                return;
            }
        }
        jeVar.l(dzVar);
        dzVar.a.setAlpha(0.0f);
        jeVar.i.add(dzVar);
        z = true;
        if (z) {
        }
    }

    public void g(dz dzVar, av avVar, av avVar2) {
        boolean z;
        RecyclerView recyclerView = this.f;
        recyclerView.h.m(dzVar);
        recyclerView.h(dzVar);
        dzVar.n(false);
        je jeVar = (je) recyclerView.Q;
        jeVar.getClass();
        int i = avVar.a;
        int i2 = avVar.b;
        View view = dzVar.a;
        int left = avVar2 == null ? view.getLeft() : avVar2.a;
        int top = avVar2 == null ? view.getTop() : avVar2.b;
        if (dzVar.h() || (i == left && i2 == top)) {
            jeVar.l(dzVar);
            jeVar.h.add(dzVar);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = jeVar.g(dzVar, i, i2, left, top);
        }
        if (z) {
            recyclerView.W();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // defpackage.lf
    public boolean i(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.f;
        if (recyclerView.s.e()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.s.d()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.o0();
        return recyclerView.I(i, i2, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.lf
    public float s() {
        float f;
        RecyclerView recyclerView = this.f;
        if (recyclerView.s.e()) {
            f = recyclerView.g0;
        } else {
            if (!recyclerView.s.d()) {
                return 0.0f;
            }
            f = recyclerView.f0;
        }
        return -f;
    }

    @Override // defpackage.lf
    public void w() {
        this.f.o0();
    }
}
