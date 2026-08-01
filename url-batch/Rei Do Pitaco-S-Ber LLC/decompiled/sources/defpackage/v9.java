package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class v9 {
    public final dy a;
    public View e;
    public int d = 0;
    public final u9 b = new u9();
    public final ArrayList c = new ArrayList();

    public v9(dy dyVar) {
        this.a = dyVar;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = this.a.f;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.M(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = this.a.f;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.e(childCount, z);
        if (z) {
            i(view);
        }
        dz M = RecyclerView.M(view);
        if (M != null) {
            if (!M.j() && !M.o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(M);
                l8.q(sb, recyclerView.B());
                return;
            } else {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "reAttach " + M);
                }
                M.j &= -257;
            }
        } else if (RecyclerView.G0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String B = recyclerView.B();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(B);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f = f(i);
        this.b.g(f);
        RecyclerView recyclerView = this.a.f;
        View childAt = recyclerView.getChildAt(f);
        if (childAt != null) {
            dz M = RecyclerView.M(childAt);
            if (M != null) {
                if (M.j() && !M.o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(M);
                    l8.q(sb, recyclerView.B());
                    return;
                } else {
                    if (RecyclerView.H0) {
                        Log.d("RecyclerView", "tmpDetach " + M);
                    }
                    M.a(256);
                }
            }
        } else if (RecyclerView.G0) {
            throw new IllegalArgumentException("No view at offset " + f + recyclerView.B());
        }
        recyclerView.detachViewFromParent(f);
    }

    public final View d(int i) {
        return this.a.f.getChildAt(f(i));
    }

    public final int e() {
        return this.a.f.getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.a.f.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            u9 u9Var = this.b;
            int b = i - (i2 - u9Var.b(i2));
            if (b == 0) {
                while (u9Var.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public final View g(int i) {
        return this.a.f.getChildAt(i);
    }

    public final int h() {
        return this.a.f.getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        dz M = RecyclerView.M(view);
        if (M != null) {
            View view2 = M.a;
            RecyclerView recyclerView = this.a.f;
            int i = M.q;
            if (i != -1) {
                M.p = i;
            } else {
                M.p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.P()) {
                view2.setImportantForAccessibility(4);
            } else {
                M.q = 4;
                recyclerView.y0.add(M);
            }
        }
    }

    public final void j(View view) {
        dz M;
        if (!this.c.remove(view) || (M = RecyclerView.M(view)) == null) {
            return;
        }
        RecyclerView recyclerView = this.a.f;
        int i = M.p;
        if (recyclerView.P()) {
            M.q = i;
            recyclerView.y0.add(M);
        } else {
            M.a.setImportantForAccessibility(i);
        }
        M.p = 0;
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
