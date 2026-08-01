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
import f.a;
import k.AbstractC0148c;
import k.C0147b;
import k.C0160o;
import k.InterfaceC0157l;
import k.InterfaceC0171z;
import k.MenuC0158m;
import l.C0230d0;
import l.InterfaceC0245l;
import l.e1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0230d0 implements InterfaceC0171z, View.OnClickListener, InterfaceC0245l {
    public C0160o h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1110j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0157l f1111k;

    /* renamed from: l, reason: collision with root package name */
    public C0147b f1112l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0148c f1113m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1114n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1115o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1116p;

    /* renamed from: q, reason: collision with root package name */
    public int f1117q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1118r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1114n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1928c, 0, 0);
        this.f1116p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1118r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1117q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0171z
    public final void a(C0160o c0160o) {
        this.h = c0160o;
        setIcon(c0160o.getIcon());
        setTitle(c0160o.getTitleCondensed());
        setId(c0160o.f2715a);
        setVisibility(c0160o.isVisible() ? 0 : 8);
        setEnabled(c0160o.isEnabled());
        if (c0160o.hasSubMenu() && this.f1112l == null) {
            this.f1112l = new C0147b(this);
        }
    }

    @Override // l.InterfaceC0245l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0245l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0171z
    public C0160o getItemData() {
        return this.h;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.i);
        if (this.f1110j != null && ((this.h.f2736y & 4) != 4 || (!this.f1114n && !this.f1115o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f2728q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f2718e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f2729r;
        if (TextUtils.isEmpty(charSequence2)) {
            e1.a(this, z4 ? null : this.h.f2718e);
        } else {
            e1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0157l interfaceC0157l = this.f1111k;
        if (interfaceC0157l != null) {
            interfaceC0157l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1114n = h();
        i();
    }

    @Override // l.C0230d0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1117q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1116p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1110j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1110j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0147b c0147b;
        if (this.h.hasSubMenu() && (c0147b = this.f1112l) != null && c0147b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1115o != z2) {
            this.f1115o = z2;
            C0160o c0160o = this.h;
            if (c0160o != null) {
                MenuC0158m menuC0158m = c0160o.f2725n;
                menuC0158m.f2695k = true;
                menuC0158m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1110j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1118r;
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
        i();
    }

    public void setItemInvoker(InterfaceC0157l interfaceC0157l) {
        this.f1111k = interfaceC0157l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1117q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0148c abstractC0148c) {
        this.f1113m = abstractC0148c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
