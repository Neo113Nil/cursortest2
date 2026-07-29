package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.z5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2332z5 extends C2002u5 {
    public final C2266y5 l;
    public Drawable m;
    public ColorStateList n;

    /* renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f252o;
    public boolean p;
    public boolean q;

    public C2332z5(C2266y5 c2266y5) {
        super(c2266y5);
        this.n = null;
        this.f252o = null;
        this.p = false;
        this.q = false;
        this.l = c2266y5;
    }

    @Override // o.C2002u5
    public final void T(AttributeSet attributeSet, int i) {
        super.T(attributeSet, R.attr.seekBarStyle);
        C2266y5 c2266y5 = this.l;
        Context context = c2266y5.getContext();
        int[] iArr = AbstractC1886sL.g;
        C0950e6 F = C0950e6.F(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) F.i;
        AZ.g(c2266y5, c2266y5.getContext(), iArr, attributeSet, (TypedArray) F.i, R.attr.seekBarStyle);
        Drawable y = F.y(0);
        if (y != null) {
            c2266y5.setThumb(y);
        }
        Drawable x = F.x(1);
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.m = x;
        if (x != null) {
            x.setCallback(c2266y5);
            AbstractC1252ij.b(x, c2266y5.getLayoutDirection());
            if (x.isStateful()) {
                x.setState(c2266y5.getDrawableState());
            }
            h0();
        }
        c2266y5.invalidate();
        if (typedArray.hasValue(3)) {
            this.f252o = AbstractC1317jj.b(typedArray.getInt(3, -1), this.f252o);
            this.q = true;
        }
        if (typedArray.hasValue(2)) {
            this.n = F.w(2);
            this.p = true;
        }
        F.L();
        h0();
    }

    public final void h0() {
        Drawable drawable = this.m;
        if (drawable != null) {
            if (this.p || this.q) {
                Drawable mutate = drawable.mutate();
                this.m = mutate;
                if (this.p) {
                    AbstractC1187hj.h(mutate, this.n);
                }
                if (this.q) {
                    AbstractC1187hj.i(this.m, this.f252o);
                }
                if (this.m.isStateful()) {
                    this.m.setState(this.l.getDrawableState());
                }
            }
        }
    }

    public final void i0(Canvas canvas) {
        if (this.m != null) {
            int max = this.l.getMax();
            if (max > 1) {
                int intrinsicWidth = this.m.getIntrinsicWidth();
                int intrinsicHeight = this.m.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.m.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.m.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
