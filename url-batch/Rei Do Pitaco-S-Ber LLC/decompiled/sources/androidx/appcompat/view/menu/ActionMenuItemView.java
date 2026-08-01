package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.c1;
import defpackage.d1;
import defpackage.kt;
import defpackage.kx;
import defpackage.l1;
import defpackage.p5;
import defpackage.rs;
import defpackage.s50;
import defpackage.ss;
import defpackage.vs;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends p5 implements kt, View.OnClickListener, l1 {
    public vs m;
    public CharSequence n;
    public Drawable o;
    public rs p;
    public c1 q;
    public d1 r;
    public boolean s;
    public boolean t;
    public final int u;
    public int v;
    public final int w;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.s = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kx.c, 0, 0);
        this.u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.w = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.v = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.l1
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.l1
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.m.getIcon() == null;
    }

    @Override // defpackage.kt
    public final void c(vs vsVar) {
        this.m = vsVar;
        setIcon(vsVar.getIcon());
        setTitle(vsVar.getTitleCondensed());
        setId(vsVar.a);
        setVisibility(vsVar.isVisible() ? 0 : 8);
        setEnabled(vsVar.isEnabled());
        if (vsVar.hasSubMenu() && this.q == null) {
            this.q = new c1(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.kt
    public vs getItemData() {
        return this.m;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.n);
        if (this.o != null && ((this.m.y & 4) != 4 || (!this.s && !this.t))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.n : null);
        CharSequence charSequence = this.m.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.m.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.m.r;
        if (TextUtils.isEmpty(charSequence2)) {
            s50.a(this, z3 ? null : this.m.e);
        } else {
            s50.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rs rsVar = this.p;
        if (rsVar != null) {
            rsVar.a(this.m);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.s = g();
        h();
    }

    @Override // defpackage.p5, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.v) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.u;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.o == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.o.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c1 c1Var;
        if (this.m.hasSubMenu() && (c1Var = this.q) != null && c1Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.t != z) {
            this.t = z;
            vs vsVar = this.m;
            if (vsVar != null) {
                ss ssVar = vsVar.n;
                ssVar.k = true;
                ssVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.o = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.w;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(rs rsVar) {
        this.p = rsVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.v = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(d1 d1Var) {
        this.r = d1Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.n = charSequence;
        h();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }
}
