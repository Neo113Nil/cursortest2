package g0;

import android.view.View;
import java.util.List;

/* renamed from: g0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2979a;

    /* renamed from: b, reason: collision with root package name */
    public int f2980b;

    /* renamed from: c, reason: collision with root package name */
    public int f2981c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2982e;

    /* renamed from: f, reason: collision with root package name */
    public int f2983f;

    /* renamed from: g, reason: collision with root package name */
    public int f2984g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2985j;

    /* renamed from: k, reason: collision with root package name */
    public List f2986k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2987l;

    public final void a(View view) {
        int b2;
        int size = this.f2986k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((Z) this.f2986k.get(i2)).f2830a;
            C0140J c0140j = (C0140J) view3.getLayoutParams();
            if (view3 != view && !c0140j.f2789a.i() && (b2 = (c0140j.f2789a.b() - this.d) * this.f2982e) >= 0 && b2 < i) {
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
            this.d = ((C0140J) view2.getLayoutParams()).f2789a.b();
        }
    }

    public final View b(C0145O c0145o) {
        List list = this.f2986k;
        if (list == null) {
            View view = c0145o.k(this.d, Long.MAX_VALUE).f2830a;
            this.d += this.f2982e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((Z) this.f2986k.get(i)).f2830a;
            C0140J c0140j = (C0140J) view2.getLayoutParams();
            if (!c0140j.f2789a.i() && this.d == c0140j.f2789a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
