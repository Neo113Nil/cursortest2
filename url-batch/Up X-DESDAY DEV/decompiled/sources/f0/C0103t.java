package f0;

import android.view.View;
import java.util.List;

/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2156a;

    /* renamed from: b, reason: collision with root package name */
    public int f2157b;

    /* renamed from: c, reason: collision with root package name */
    public int f2158c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2159e;

    /* renamed from: f, reason: collision with root package name */
    public int f2160f;

    /* renamed from: g, reason: collision with root package name */
    public int f2161g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2162j;

    /* renamed from: k, reason: collision with root package name */
    public List f2163k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2164l;

    public final void a(View view) {
        int b2;
        int size = this.f2163k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((X) this.f2163k.get(i2)).f2009a;
            J j2 = (J) view3.getLayoutParams();
            if (view3 != view && !j2.f1970a.i() && (b2 = (j2.f1970a.b() - this.d) * this.f2159e) >= 0 && b2 < i) {
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
            this.d = ((J) view2.getLayoutParams()).f1970a.b();
        }
    }

    public final View b(O o2) {
        List list = this.f2163k;
        if (list == null) {
            View view = o2.i(this.d, Long.MAX_VALUE).f2009a;
            this.d += this.f2159e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((X) this.f2163k.get(i)).f2009a;
            J j2 = (J) view2.getLayoutParams();
            if (!j2.f1970a.i() && this.d == j2.f1970a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
