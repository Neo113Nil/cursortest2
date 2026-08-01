package g0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171y extends AbstractC0141K {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f3006a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f3007b = new c0(this);

    /* renamed from: c, reason: collision with root package name */
    public C0169w f3008c;
    public C0169w d;

    public static int b(View view, U.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(AbstractC0139I abstractC0139I, U.g gVar) {
        int v2 = abstractC0139I.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l2 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = abstractC0139I.u(i2);
            int abs = Math.abs(((gVar.c(u2) / 2) + gVar.e(u2)) - l2);
            if (abs < i) {
                view = u2;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(AbstractC0139I abstractC0139I, View view) {
        int[] iArr = new int[2];
        if (abstractC0139I.d()) {
            iArr[0] = b(view, d(abstractC0139I));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0139I.e()) {
            iArr[1] = b(view, e(abstractC0139I));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final U.g d(AbstractC0139I abstractC0139I) {
        C0169w c0169w = this.d;
        if (c0169w == null || ((AbstractC0139I) c0169w.f1175b) != abstractC0139I) {
            this.d = new C0169w(abstractC0139I, 0);
        }
        return this.d;
    }

    public final U.g e(AbstractC0139I abstractC0139I) {
        C0169w c0169w = this.f3008c;
        if (c0169w == null || ((AbstractC0139I) c0169w.f1175b) != abstractC0139I) {
            this.f3008c = new C0169w(abstractC0139I, 1);
        }
        return this.f3008c;
    }

    public final void f() {
        AbstractC0139I layoutManager;
        RecyclerView recyclerView = this.f3006a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c2 = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c2 == null) {
            return;
        }
        int[] a2 = a(layoutManager, c2);
        int i = a2[0];
        if (i == 0 && a2[1] == 0) {
            return;
        }
        this.f3006a.g0(i, a2[1], false);
    }
}
