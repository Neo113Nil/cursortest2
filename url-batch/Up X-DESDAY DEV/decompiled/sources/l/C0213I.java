package l;

import K.C0012l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ratebook.luckyconvert.R;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213I extends C0208D {

    /* renamed from: e, reason: collision with root package name */
    public final C0212H f2865e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2866f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2867g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2868j;

    public C0213I(C0212H c0212h) {
        super(c0212h);
        this.f2867g = null;
        this.h = null;
        this.i = false;
        this.f2868j = false;
        this.f2865e = c0212h;
    }

    @Override // l.C0208D
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0212H c0212h = this.f2865e;
        Context context = c0212h.getContext();
        int[] iArr = f.a.f1928g;
        C0012l r2 = C0012l.r(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.T.k(c0212h, c0212h.getContext(), iArr, attributeSet, (TypedArray) r2.f432c, R.attr.seekBarStyle);
        Drawable i2 = r2.i(0);
        if (i2 != null) {
            c0212h.setThumb(i2);
        }
        Drawable h = r2.h(1);
        Drawable drawable = this.f2866f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2866f = h;
        if (h != null) {
            h.setCallback(c0212h);
            D.b.b(h, c0212h.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(c0212h.getDrawableState());
            }
            f();
        }
        c0212h.invalidate();
        TypedArray typedArray = (TypedArray) r2.f432c;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0250n0.b(typedArray.getInt(3, -1), this.h);
            this.f2868j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2867g = r2.g(2);
            this.i = true;
        }
        r2.t();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2866f;
        if (drawable != null) {
            if (this.i || this.f2868j) {
                Drawable mutate = drawable.mutate();
                this.f2866f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2867g);
                }
                if (this.f2868j) {
                    D.a.i(this.f2866f, this.h);
                }
                if (this.f2866f.isStateful()) {
                    this.f2866f.setState(this.f2865e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2866f != null) {
            int max = this.f2865e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2866f.getIntrinsicWidth();
                int intrinsicHeight = this.f2866f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2866f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2866f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
