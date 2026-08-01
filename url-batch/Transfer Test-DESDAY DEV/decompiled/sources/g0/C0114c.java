package g0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114c {

    /* renamed from: a, reason: collision with root package name */
    public final C0136z f2415a;

    /* renamed from: e, reason: collision with root package name */
    public View f2418e;
    public int d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0113b f2416b = new C0113b();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2417c = new ArrayList();

    public C0114c(C0136z c0136z) {
        this.f2415a = c0136z;
    }

    public final void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = this.f2415a.f2571a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f2416b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.L(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = this.f2415a.f2571a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.f2416b.e(childCount, z2);
        if (z2) {
            i(view);
        }
        Z L2 = RecyclerView.L(view);
        if (L2 != null) {
            if (!L2.k() && !L2.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(L2);
                throw new IllegalArgumentException(Y.V.e(recyclerView, sb));
            }
            if (RecyclerView.f1576y0) {
                Log.d("RecyclerView", "reAttach " + L2);
            }
            L2.f2398j &= -257;
        } else if (RecyclerView.f1575x0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(Y.V.e(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f2 = f(i);
        this.f2416b.f(f2);
        RecyclerView recyclerView = this.f2415a.f2571a;
        View childAt = recyclerView.getChildAt(f2);
        if (childAt != null) {
            Z L2 = RecyclerView.L(childAt);
            if (L2 != null) {
                if (L2.k() && !L2.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(L2);
                    throw new IllegalArgumentException(Y.V.e(recyclerView, sb));
                }
                if (RecyclerView.f1576y0) {
                    Log.d("RecyclerView", "tmpDetach " + L2);
                }
                L2.a(256);
            }
        } else if (RecyclerView.f1575x0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f2);
            throw new IllegalArgumentException(Y.V.e(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f2);
    }

    public final View d(int i) {
        return this.f2415a.f2571a.getChildAt(f(i));
    }

    public final int e() {
        return this.f2415a.f2571a.getChildCount() - this.f2417c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f2415a.f2571a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0113b c0113b = this.f2416b;
            int b2 = i - (i2 - c0113b.b(i2));
            if (b2 == 0) {
                while (c0113b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f2415a.f2571a.getChildAt(i);
    }

    public final int h() {
        return this.f2415a.f2571a.getChildCount();
    }

    public final void i(View view) {
        this.f2417c.add(view);
        C0136z c0136z = this.f2415a;
        Z L2 = RecyclerView.L(view);
        if (L2 != null) {
            int i = L2.f2405q;
            View view2 = L2.f2392a;
            if (i != -1) {
                L2.f2404p = i;
            } else {
                WeakHashMap weakHashMap = K.T.f372a;
                L2.f2404p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0136z.f2571a;
            if (recyclerView.O()) {
                L2.f2405q = 4;
                recyclerView.r0.add(L2);
            } else {
                WeakHashMap weakHashMap2 = K.T.f372a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(View view) {
        if (this.f2417c.remove(view)) {
            C0136z c0136z = this.f2415a;
            Z L2 = RecyclerView.L(view);
            if (L2 != null) {
                int i = L2.f2404p;
                RecyclerView recyclerView = c0136z.f2571a;
                if (recyclerView.O()) {
                    L2.f2405q = i;
                    recyclerView.r0.add(L2);
                } else {
                    WeakHashMap weakHashMap = K.T.f372a;
                    L2.f2392a.setImportantForAccessibility(i);
                }
                L2.f2404p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2416b.toString() + ", hidden list:" + this.f2417c.size();
    }
}
