package g0;

import android.view.View;
import java.util.List;

/* renamed from: g0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2543a;

    /* renamed from: b, reason: collision with root package name */
    public int f2544b;

    /* renamed from: c, reason: collision with root package name */
    public int f2545c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2546e;

    /* renamed from: f, reason: collision with root package name */
    public int f2547f;

    /* renamed from: g, reason: collision with root package name */
    public int f2548g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2549j;

    /* renamed from: k, reason: collision with root package name */
    public List f2550k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2551l;

    public final void a(View view) {
        int b2;
        int size = this.f2550k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((Z) this.f2550k.get(i2)).f2392a;
            J j2 = (J) view3.getLayoutParams();
            if (view3 != view && !j2.f2351a.i() && (b2 = (j2.f2351a.b() - this.d) * this.f2546e) >= 0 && b2 < i) {
                view2 = view3;
                if (b2 == 0) {
                    break;
                } else {
                    i = b2;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((J) view2.getLayoutParams()).f2351a.b();
        }
    }

    public final View b(O o2) {
        List list = this.f2550k;
        if (list == null) {
            View view = o2.k(this.d, Long.MAX_VALUE).f2392a;
            this.d += this.f2546e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((Z) this.f2550k.get(i)).f2392a;
            J j2 = (J) view2.getLayoutParams();
            if (!j2.f2351a.i() && this.d == j2.f2351a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
