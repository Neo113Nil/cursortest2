package D0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import l.AbstractC0261y0;
import p0.AbstractC0279a;

/* loaded from: classes.dex */
public abstract class f extends AbstractC0261y0 {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f139p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f140q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f141r;

    /* renamed from: s, reason: collision with root package name */
    public int f142s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f143t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f144u;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140q = new Rect();
        this.f141r = new Rect();
        this.f142s = 119;
        this.f143t = true;
        this.f144u = false;
        int[] iArr = AbstractC0279a.h;
        n.a(context, attributeSet, 0, 0);
        n.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f142s = obtainStyledAttributes.getInt(1, this.f142s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f143t = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f139p;
        if (drawable != null) {
            if (this.f144u) {
                this.f144u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f143t;
                Rect rect = this.f140q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f142s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f141r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f139p;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f139p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f139p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f139p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f142s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f139p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // l.AbstractC0261y0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        this.f144u = z2 | this.f144u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f144u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f139p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f139p);
            }
            this.f139p = drawable;
            this.f144u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f142s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f142s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f142s = i;
            if (i == 119 && this.f139p != null) {
                this.f139p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f139p;
    }
}
