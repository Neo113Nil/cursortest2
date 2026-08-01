package l;

import K.C0014m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.football.transfertrivia.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185G extends C0180B {

    /* renamed from: e, reason: collision with root package name */
    public final C0184F f2891e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f2892f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2893g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2894j;

    public C0185G(C0184F c0184f) {
        super(c0184f);
        this.f2893g = null;
        this.h = null;
        this.i = false;
        this.f2894j = false;
        this.f2891e = c0184f;
    }

    @Override // l.C0180B
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0184F c0184f = this.f2891e;
        Context context = c0184f.getContext();
        int[] iArr = f.a.f2142g;
        C0014m i2 = C0014m.i(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.T.k(c0184f, c0184f.getContext(), iArr, attributeSet, (TypedArray) i2.f425b, R.attr.seekBarStyle);
        Drawable d = i2.d(0);
        if (d != null) {
            c0184f.setThumb(d);
        }
        Drawable c2 = i2.c(1);
        Drawable drawable = this.f2892f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f2892f = c2;
        if (c2 != null) {
            c2.setCallback(c0184f);
            D.b.b(c2, c0184f.getLayoutDirection());
            if (c2.isStateful()) {
                c2.setState(c0184f.getDrawableState());
            }
            f();
        }
        c0184f.invalidate();
        TypedArray typedArray = (TypedArray) i2.f425b;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0221l0.b(typedArray.getInt(3, -1), this.h);
            this.f2894j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f2893g = i2.b(2);
            this.i = true;
        }
        i2.k();
        f();
    }

    public final void f() {
        Drawable drawable = this.f2892f;
        if (drawable != null) {
            if (this.i || this.f2894j) {
                Drawable mutate = drawable.mutate();
                this.f2892f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f2893g);
                }
                if (this.f2894j) {
                    D.a.i(this.f2892f, this.h);
                }
                if (this.f2892f.isStateful()) {
                    this.f2892f.setState(this.f2891e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f2892f != null) {
            int max = this.f2891e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f2892f.getIntrinsicWidth();
                int intrinsicHeight = this.f2892f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f2892f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f2892f.draw(canvas);
                    canvas.translate(width, RecyclerView.f1570A0);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
