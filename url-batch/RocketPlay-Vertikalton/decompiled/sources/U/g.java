package U;

import android.graphics.Rect;
import android.view.View;
import g0.AbstractC0139I;
import g0.C0169w;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f1174a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1175b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1176c;

    public g(AbstractC0139I abstractC0139I) {
        this.f1174a = Integer.MIN_VALUE;
        this.f1176c = new Rect();
        this.f1175b = abstractC0139I;
    }

    public static g a(AbstractC0139I abstractC0139I, int i) {
        if (i == 0) {
            return new C0169w(abstractC0139I, 0);
        }
        if (i == 1) {
            return new C0169w(abstractC0139I, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f1174a) {
            return 0;
        }
        return l() - this.f1174a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public g(i iVar) {
        this.f1174a = 0;
        this.f1176c = new d();
        this.f1175b = iVar;
    }
}
