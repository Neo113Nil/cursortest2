package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class js extends Drawable.ConstantState {
    public m10 a;
    public ug b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public Rect g;
    public final float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public final Paint.Style p;

    public js(js jsVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = jsVar.a;
        this.b = jsVar.b;
        this.j = jsVar.j;
        this.c = jsVar.c;
        this.d = jsVar.d;
        this.f = jsVar.f;
        this.e = jsVar.e;
        this.k = jsVar.k;
        this.h = jsVar.h;
        this.o = jsVar.o;
        this.i = jsVar.i;
        this.l = jsVar.l;
        this.m = jsVar.m;
        this.n = jsVar.n;
        this.p = jsVar.p;
        if (jsVar.g != null) {
            this.g = new Rect(jsVar.g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        ls lsVar = new ls(this);
        lsVar.k = true;
        lsVar.l = true;
        return lsVar;
    }

    public js(m10 m10Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = Paint.Style.FILL_AND_STROKE;
        this.a = m10Var;
        this.b = null;
    }
}
