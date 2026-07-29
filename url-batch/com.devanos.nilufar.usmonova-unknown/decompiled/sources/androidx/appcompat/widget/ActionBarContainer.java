package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.devanos.nilufar.usmonova.R;
import o.AbstractC1430lQ;
import o.AbstractC1886sL;
import o.C1141h1;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean h;
    public View i;
    public View j;
    public Drawable k;
    public Drawable l;
    public Drawable m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2o;
    public final int p;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1141h1(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1886sL.a);
        boolean z = false;
        this.k = obtainStyledAttributes.getDrawable(0);
        this.l = obtainStyledAttributes.getDrawable(2);
        this.p = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.n = true;
            this.m = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.n ? !(this.k != null || this.l != null) : this.m == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful()) {
            this.k.setState(getDrawableState());
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null && drawable2.isStateful()) {
            this.l.setState(getDrawableState());
        }
        Drawable drawable3 = this.m;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.m.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.m;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = findViewById(R.id.action_bar);
        this.j = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.n) {
            Drawable drawable = this.m;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.k == null) {
                z2 = false;
            } else if (this.i.getVisibility() == 0) {
                this.k.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            } else {
                View view = this.j;
                if (view == null || view.getVisibility() != 0) {
                    this.k.setBounds(0, 0, 0, 0);
                } else {
                    this.k.setBounds(this.j.getLeft(), this.j.getTop(), this.j.getRight(), this.j.getBottom());
                }
            }
            this.f2o = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.i == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.p) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.i == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.k);
        }
        this.k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.i;
            if (view != null) {
                this.k.setBounds(view.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
            }
        }
        boolean z = false;
        if (!this.n ? !(this.k != null || this.l != null) : this.m == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.m;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.m);
        }
        this.m = drawable;
        boolean z = this.n;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.m) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.k != null || this.l != null) : this.m == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.l);
        }
        this.l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2o && this.l != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.n ? !(this.k != null || this.l != null) : this.m == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.h = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.m;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.k;
        boolean z = this.n;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.l && this.f2o) {
            return true;
        }
        return (drawable == this.m && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(AbstractC1430lQ abstractC1430lQ) {
    }
}
