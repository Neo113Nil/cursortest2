package l;

import K.C0011l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.fortuneodd.shadegrid.R;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202I extends C0197D {

    /* renamed from: e, reason: collision with root package name */
    public final C0201H f2890e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2891f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2892g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2893j;

    public C0202I(C0201H c0201h) {
        super(c0201h);
        this.f2892g = null;
        this.h = null;
        this.i = false;
        this.f2893j = false;
        this.f2890e = c0201h;
    }

    @Override // l.C0197D
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0201H c0201h = this.f2890e;
        Context context = c0201h.getContext();
        int[] iArr = f.a.f1933g;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.S.k(c0201h, c0201h.getContext(), iArr, attributeSet, (TypedArray) r2.f414c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0201h.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f2891f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2891f = h;
        if (h != null) {
            h.setCallback(c0201h);
            D.b.b(h, c0201h.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0201h.getDrawableState());
            }
            f();
        }
        c0201h.invalidate();
        TypedArray typedArray = (TypedArray) r2.f414c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0239n0.b(typedArray.getInt(3, -1), this.h);
            this.f2893j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2892g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2891f;
        if (drawable != null) {
            if (this.i || this.f2893j) {
                Drawable mutate = drawable.mutate();
                this.f2891f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2892g);
                }
                if (this.f2893j) {
                    D.a.i(this.f2891f, this.h);
                }
                if (this.f2891f.isStateful()) {
                    this.f2891f.setState(this.f2890e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2891f != null) {
            int max = this.f2890e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2891f.getIntrinsicWidth();
                int intrinsicHeight = this.f2891f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2891f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2891f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
