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
import o.AbstractC1798r1;
import o.AbstractC1886sL;
import o.C1284jC;
import o.C1733q1;
import o.InterfaceC0760bC;
import o.InterfaceC2194x1;
import o.InterfaceC2273yC;
import o.MenuC0825cC;
import o.TM;
import o.V5;

/* loaded from: classes.dex */
public class ActionMenuItemView extends V5 implements InterfaceC2273yC, View.OnClickListener, InterfaceC2194x1 {

    /* renamed from: o, reason: collision with root package name */
    public C1284jC f0o;
    public CharSequence p;
    public Drawable q;
    public InterfaceC0760bC r;
    public C1733q1 s;
    public AbstractC1798r1 t;
    public boolean u;
    public boolean v;
    public final int w;
    public int x;
    public final int y;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.u = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1886sL.c, 0, 0);
        this.w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.y = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.x = -1;
        setSaveEnabled(false);
    }

    @Override // o.InterfaceC2273yC
    public final void a(C1284jC c1284jC) {
        this.f0o = c1284jC;
        setIcon(c1284jC.getIcon());
        setTitle(c1284jC.getTitleCondensed());
        setId(c1284jC.a);
        setVisibility(c1284jC.isVisible() ? 0 : 8);
        setEnabled(c1284jC.isEnabled());
        if (c1284jC.hasSubMenu() && this.s == null) {
            this.s = new C1733q1(this);
        }
    }

    @Override // o.InterfaceC2194x1
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // o.InterfaceC2194x1
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f0o.getIcon() == null;
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

    @Override // o.InterfaceC2273yC
    public C1284jC getItemData() {
        return this.f0o;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.p);
        if (this.q != null && ((this.f0o.y & 4) != 4 || (!this.u && !this.v))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.p : null);
        CharSequence charSequence = this.f0o.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f0o.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f0o.r;
        if (TextUtils.isEmpty(charSequence2)) {
            TM.C(this, z3 ? null : this.f0o.e);
        } else {
            TM.C(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0760bC interfaceC0760bC = this.r;
        if (interfaceC0760bC != null) {
            interfaceC0760bC.b(this.f0o);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.u = g();
        h();
    }

    @Override // o.V5, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.x) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.w;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.q == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.q.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1733q1 c1733q1;
        if (this.f0o.hasSubMenu() && (c1733q1 = this.s) != null && c1733q1.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.v != z) {
            this.v = z;
            C1284jC c1284jC = this.f0o;
            if (c1284jC != null) {
                MenuC0825cC menuC0825cC = c1284jC.n;
                menuC0825cC.k = true;
                menuC0825cC.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.q = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.y;
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

    public void setItemInvoker(InterfaceC0760bC interfaceC0760bC) {
        this.r = interfaceC0760bC;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.x = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC1798r1 abstractC1798r1) {
        this.t = abstractC1798r1;
    }

    public void setTitle(CharSequence charSequence) {
        this.p = charSequence;
        h();
    }
}
