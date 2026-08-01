package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class t4 extends o4 {
    public final s4 j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;

    public t4(s4 s4Var) {
        super(s4Var);
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.j = s4Var;
    }

    public final void Q() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable mutate = drawable.mutate();
                this.k = mutate;
                if (this.n) {
                    mutate.setTintList(this.l);
                }
                if (this.o) {
                    this.k.setTintMode(this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(this.j.getDrawableState());
                }
            }
        }
    }

    public final void R(Canvas canvas) {
        if (this.k != null) {
            int max = this.j.getMax();
            if (max > 1) {
                int intrinsicWidth = this.k.getIntrinsicWidth();
                int intrinsicHeight = this.k.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.k.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.k.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // defpackage.o4
    public final void z(AttributeSet attributeSet, int i) {
        super.z(attributeSet, R.attr.seekBarStyle);
        s4 s4Var = this.j;
        Context context = s4Var.getContext();
        int[] iArr = kx.g;
        y5 l = y5.l(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) l.a;
        f80.l(s4Var, s4Var.getContext(), iArr, attributeSet, (TypedArray) l.a, R.attr.seekBarStyle);
        Drawable g = l.g(0);
        if (g != null) {
            s4Var.setThumb(g);
        }
        Drawable f = l.f(1);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k = f;
        if (f != null) {
            f.setCallback(s4Var);
            f.setLayoutDirection(s4Var.getLayoutDirection());
            if (f.isStateful()) {
                f.setState(s4Var.getDrawableState());
            }
            Q();
        }
        s4Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.m = vf.b(typedArray.getInt(3, -1), this.m);
            this.o = true;
        }
        if (typedArray.hasValue(2)) {
            this.l = l.e(2);
            this.n = true;
        }
        l.n();
        Q();
    }
}
