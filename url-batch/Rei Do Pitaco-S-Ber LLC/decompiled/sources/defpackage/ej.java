package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ej extends Drawable.ConstantState {
    public Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public m10 t;
    public int u;
    public int v;
    public final Rect w;
    public int[] x;

    public ej(ej ejVar) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.v;
        if (ejVar != null) {
            this.a = ejVar.a;
            this.b = ejVar.b;
            this.c = ejVar.c;
            this.d = ejVar.d;
            this.e = ejVar.e;
            this.f = ejVar.f;
            this.g = ejVar.g;
            this.h = ejVar.h;
            this.i = ejVar.i;
            this.j = ejVar.j;
            this.k = ejVar.k;
            this.l = ejVar.l;
            this.m = ejVar.m;
            this.n = ejVar.n;
            this.o = ejVar.o;
            this.p = ejVar.p;
            this.q = ejVar.q;
            this.r = ejVar.r;
            this.s = ejVar.s;
            this.u = ejVar.u;
            this.v = ejVar.v;
            m10 m10Var = ejVar.t;
            if (m10Var instanceof o10) {
                this.t = ((o10) m10Var).k().a();
            } else if (m10Var instanceof h30) {
                this.t = ((h30) m10Var).i().c();
            } else {
                this.t = m10Var;
            }
            if (ejVar.w != null) {
                this.w = new Rect(ejVar.w);
            }
            int[] iArr = ejVar.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
