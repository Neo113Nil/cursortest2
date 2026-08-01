package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class xg {
    public int a;
    public final Object b;
    public final Object c;

    public xg(ny nyVar) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = nyVar;
    }

    public static xg a(ny nyVar, int i) {
        if (i == 0) {
            return new yv(nyVar, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new yv(nyVar, i2);
        }
        l8.l("invalid orientation");
        return null;
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

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public xg(zg zgVar) {
        this.a = 0;
        this.c = new ce();
        this.b = zgVar;
    }
}
