package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class L4 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public L4(C0683a2 c0683a2, C1818rJ c1818rJ, InterfaceC2006u9 interfaceC2006u9) {
        List j;
        AbstractC0048Bt.n(c1818rJ, "routeDatabase");
        this.b = c0683a2;
        this.c = c1818rJ;
        C1318jk c1318jk = C1318jk.h;
        this.d = c1318jk;
        this.e = c1318jk;
        this.f = new ArrayList();
        C0932ds c0932ds = c0683a2.h;
        AbstractC0048Bt.n(c0932ds, "url");
        URI h = c0932ds.h();
        if (h.getHost() == null) {
            j = HY.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c0683a2.g.select(h);
            j = (select == null || select.isEmpty()) ? HY.j(Proxy.NO_PROXY) : HY.v(select);
        }
        this.d = j;
        this.a = 0;
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0214Id) this.d) != null) {
                if (((C0214Id) this.f) == null) {
                    this.f = new C0214Id();
                }
                C0214Id c0214Id = (C0214Id) this.f;
                c0214Id.c = null;
                c0214Id.b = false;
                c0214Id.d = null;
                c0214Id.a = false;
                WeakHashMap weakHashMap = AZ.a;
                ColorStateList g = AbstractC1769qZ.g(view);
                if (g != null) {
                    c0214Id.b = true;
                    c0214Id.c = g;
                }
                PorterDuff.Mode h = AbstractC1769qZ.h(view);
                if (h != null) {
                    c0214Id.a = true;
                    c0214Id.d = h;
                }
                if (c0214Id.b || c0214Id.a) {
                    C1409l5.d(background, c0214Id, view.getDrawableState());
                    return;
                }
            }
            C0214Id c0214Id2 = (C0214Id) this.e;
            if (c0214Id2 != null) {
                C1409l5.d(background, c0214Id2, view.getDrawableState());
                return;
            }
            C0214Id c0214Id3 = (C0214Id) this.d;
            if (c0214Id3 != null) {
                C1409l5.d(background, c0214Id3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        C0214Id c0214Id = (C0214Id) this.e;
        if (c0214Id != null) {
            return (ColorStateList) c0214Id.c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        C0214Id c0214Id = (C0214Id) this.e;
        if (c0214Id != null) {
            return (PorterDuff.Mode) c0214Id.d;
        }
        return null;
    }

    public boolean d() {
        return this.a < ((List) this.d).size() || !((ArrayList) this.f).isEmpty();
    }

    public void e(AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = AbstractC1886sL.y;
        C0950e6 F = C0950e6.F(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) F.i;
        View view2 = (View) this.b;
        AZ.g(view2, view2.getContext(), iArr, attributeSet, (TypedArray) F.i, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                C1409l5 c1409l5 = (C1409l5) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (c1409l5) {
                    f = c1409l5.a.f(context2, i2);
                }
                if (f != null) {
                    h(f);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC1769qZ.q(view, F.w(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC1769qZ.r(view, AbstractC1317jj.b(typedArray.getInt(2, -1), null));
            }
            F.L();
        } catch (Throwable th) {
            F.L();
            throw th;
        }
    }

    public void f() {
        this.a = -1;
        h(null);
        a();
    }

    public void g(int i) {
        ColorStateList colorStateList;
        this.a = i;
        C1409l5 c1409l5 = (C1409l5) this.c;
        if (c1409l5 != null) {
            Context context = ((View) this.b).getContext();
            synchronized (c1409l5) {
                colorStateList = c1409l5.a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0214Id) this.d) == null) {
                this.d = new C0214Id();
            }
            C0214Id c0214Id = (C0214Id) this.d;
            c0214Id.c = colorStateList;
            c0214Id.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void i(ColorStateList colorStateList) {
        if (((C0214Id) this.e) == null) {
            this.e = new C0214Id();
        }
        C0214Id c0214Id = (C0214Id) this.e;
        c0214Id.c = colorStateList;
        c0214Id.b = true;
        a();
    }

    public void j(PorterDuff.Mode mode) {
        if (((C0214Id) this.e) == null) {
            this.e = new C0214Id();
        }
        C0214Id c0214Id = (C0214Id) this.e;
        c0214Id.d = mode;
        c0214Id.a = true;
        a();
    }

    public L4(View view) {
        this.a = -1;
        this.b = view;
        this.c = C1409l5.a();
    }
}
