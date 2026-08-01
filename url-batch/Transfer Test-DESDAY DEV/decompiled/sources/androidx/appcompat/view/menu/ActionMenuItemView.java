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
import k.AbstractC0154c;
import k.C0153b;
import k.C0166o;
import k.InterfaceC0163l;
import k.InterfaceC0177z;
import k.MenuC0164m;
import l.C0201b0;
import l.InterfaceC0220l;
import l.d1;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0201b0 implements InterfaceC0177z, View.OnClickListener, InterfaceC0220l {
    public C0166o h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1254j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0163l f1255k;

    /* renamed from: l, reason: collision with root package name */
    public C0153b f1256l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC0154c f1257m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1258n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1259o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1260p;

    /* renamed from: q, reason: collision with root package name */
    public int f1261q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1262r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1258n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2139c, 0, 0);
        this.f1260p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1262r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1261q = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0177z
    public final void a(C0166o c0166o) {
        this.h = c0166o;
        setIcon(c0166o.getIcon());
        setTitle(c0166o.getTitleCondensed());
        setId(c0166o.f2783a);
        setVisibility(c0166o.isVisible() ? 0 : 8);
        setEnabled(c0166o.isEnabled());
        if (c0166o.hasSubMenu() && this.f1256l == null) {
            this.f1256l = new C0153b(this);
        }
    }

    @Override // l.InterfaceC0220l
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.h.getIcon() == null;
    }

    @Override // l.InterfaceC0220l
    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.InterfaceC0177z
    public C0166o getItemData() {
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
        if (this.f1254j != null && ((this.h.f2804y & 4) != 4 || (!this.f1258n && !this.f1259o))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.i : null);
        CharSequence charSequence = this.h.f2796q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.h.f2786e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.h.f2797r;
        if (TextUtils.isEmpty(charSequence2)) {
            d1.a(this, z4 ? null : this.h.f2786e);
        } else {
            d1.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0163l interfaceC0163l = this.f1255k;
        if (interfaceC0163l != null) {
            interfaceC0163l.b(this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1258n = h();
        i();
    }

    @Override // l.C0201b0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1261q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1260p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1254j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1254j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0153b c0153b;
        if (this.h.hasSubMenu() && (c0153b = this.f1256l) != null && c0153b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1259o != z2) {
            this.f1259o = z2;
            C0166o c0166o = this.h;
            if (c0166o != null) {
                MenuC0164m menuC0164m = c0166o.f2793n;
                menuC0164m.f2763k = true;
                menuC0164m.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1254j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1262r;
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

    public void setItemInvoker(InterfaceC0163l interfaceC0163l) {
        this.f1255k = interfaceC0163l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1261q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0154c abstractC0154c) {
        this.f1257m = abstractC0154c;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        i();
    }
}
