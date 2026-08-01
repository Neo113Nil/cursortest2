package U;

import android.graphics.Rect;
import android.view.View;
import g0.C0134x;
import g0.I;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f816a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f817b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f818c;

    public g(I i) {
        this.f816a = Integer.MIN_VALUE;
        this.f818c = new Rect();
        this.f817b = i;
    }

    public static g a(I i, int i2) {
        if (i2 == 0) {
            return new C0134x(i, 0);
        }
        if (i2 == 1) {
            return new C0134x(i, 1);
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
        if (Integer.MIN_VALUE == this.f816a) {
            return 0;
        }
        return l() - this.f816a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public g(i iVar) {
        this.f816a = 0;
        this.f818c = new d();
        this.f817b = iVar;
    }
}
