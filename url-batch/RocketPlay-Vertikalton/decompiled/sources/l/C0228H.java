package l;

import K.C0019l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.R;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228H extends C0223C {

    /* renamed from: e, reason: collision with root package name */
    public final C0227G f3322e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3323f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3324g;
    public PorterDuff.Mode h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3325j;

    public C0228H(C0227G c0227g) {
        super(c0227g);
        this.f3324g = null;
        this.h = null;
        this.i = false;
        this.f3325j = false;
        this.f3322e = c0227g;
    }

    @Override // l.C0223C
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0227G c0227g = this.f3322e;
        Context context = c0227g.getContext();
        int[] iArr = f.a.f2564g;
        C0019l i2 = C0019l.i(context, attributeSet, iArr, R.attr.seekBarStyle);
        K.T.k(c0227g, c0227g.getContext(), iArr, attributeSet, (TypedArray) i2.f684b, R.attr.seekBarStyle);
        Drawable d = i2.d(0);
        if (d != null) {
            c0227g.setThumb(d);
        }
        Drawable c2 = i2.c(1);
        Drawable drawable = this.f3323f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3323f = c2;
        if (c2 != null) {
            c2.setCallback(c0227g);
            D.b.b(c2, c0227g.getLayoutDirection());
            if (c2.isStateful()) {
                c2.setState(c0227g.getDrawableState());
            }
            f();
        }
        c0227g.invalidate();
        TypedArray typedArray = (TypedArray) i2.f684b;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0266n0.b(typedArray.getInt(3, -1), this.h);
            this.f3325j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f3324g = i2.b(2);
            this.i = true;
        }
        i2.k();
        f();
    }

    public final void f() {
        Drawable drawable = this.f3323f;
        if (drawable != null) {
            if (this.i || this.f3325j) {
                Drawable mutate = drawable.mutate();
                this.f3323f = mutate;
                if (this.i) {
                    D.a.h(mutate, this.f3324g);
                }
                if (this.f3325j) {
                    D.a.i(this.f3323f, this.h);
                }
                if (this.f3323f.isStateful()) {
                    this.f3323f.setState(this.f3322e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f3323f != null) {
            int max = this.f3322e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3323f.getIntrinsicWidth();
                int intrinsicHeight = this.f3323f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3323f.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f3323f.draw(canvas);
                    canvas.translate(width, RecyclerView.f1949A0);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
