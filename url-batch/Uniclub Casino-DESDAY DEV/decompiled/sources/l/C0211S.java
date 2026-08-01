package l;

import K.C0011l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import j.C0150c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0159d;

/* renamed from: l.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211S extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0244q f2926a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2927b;

    /* renamed from: c, reason: collision with root package name */
    public final C0203J f2928c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2929e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0210Q f2930f;

    /* renamed from: g, reason: collision with root package name */
    public int f2931g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0211S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fortuneodd.shadegrid.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        S0.a(this, getContext());
        int[] iArr = f.a.f1945u;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, com.fortuneodd.shadegrid.R.attr.spinnerStyle);
        this.f2926a = new C0244q(this);
        TypedArray typedArray2 = (TypedArray) r2.f414c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2927b = new C0150c(context, resourceId);
        } else {
            this.f2927b = context;
        }
        int i2 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.fortuneodd.shadegrid.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i2 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i2 == 0) {
            DialogInterfaceOnClickListenerC0205L dialogInterfaceOnClickListenerC0205L = new DialogInterfaceOnClickListenerC0205L(this);
            this.f2930f = dialogInterfaceOnClickListenerC0205L;
            dialogInterfaceOnClickListenerC0205L.f2902c = typedArray2.getString(2);
        } else if (i2 == 1) {
            C0208O c0208o = new C0208O(this, this.f2927b, attributeSet);
            C0011l r3 = C0011l.r(this.f2927b, attributeSet, iArr, com.fortuneodd.shadegrid.R.attr.spinnerStyle);
            this.f2931g = ((TypedArray) r3.f414c).getLayoutDimension(3, -2);
            c0208o.k(r3.h(1));
            c0208o.f2915C = typedArray2.getString(2);
            r3.t();
            this.f2930f = c0208o;
            this.f2928c = new C0203J(this, this, c0208o);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.fortuneodd.shadegrid.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        r2.t();
        this.f2929e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2926a.d(attributeSet, com.fortuneodd.shadegrid.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.h;
        drawable.getPadding(rect);
        return i3 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0244q c0244q = this.f2926a;
        if (c0244q != null) {
            c0244q.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        return interfaceC0210Q != null ? interfaceC0210Q.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        return interfaceC0210Q != null ? interfaceC0210Q.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2930f != null ? this.f2931g : super.getDropDownWidth();
    }

    public final InterfaceC0210Q getInternalPopup() {
        return this.f2930f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        return interfaceC0210Q != null ? interfaceC0210Q.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2927b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        return interfaceC0210Q != null ? interfaceC0210Q.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244q c0244q = this.f2926a;
        if (c0244q != null) {
            return c0244q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0244q c0244q = this.f2926a;
        if (c0244q != null) {
            return c0244q.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        if (interfaceC0210Q == null || !interfaceC0210Q.a()) {
            return;
        }
        interfaceC0210Q.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2930f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0209P c0209p = (C0209P) parcelable;
        super.onRestoreInstanceState(c0209p.getSuperState());
        if (!c0209p.f2919a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0159d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0209P c0209p = new C0209P(super.onSaveInstanceState());
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        c0209p.f2919a = interfaceC0210Q != null && interfaceC0210Q.a();
        return c0209p;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0203J c0203j = this.f2928c;
        if (c0203j == null || !c0203j.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        if (interfaceC0210Q == null) {
            return super.performClick();
        }
        if (interfaceC0210Q.a()) {
            return true;
        }
        this.f2930f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244q c0244q = this.f2926a;
        if (c0244q != null) {
            c0244q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0244q c0244q = this.f2926a;
        if (c0244q != null) {
            c0244q.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        if (interfaceC0210Q == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0210Q.o(i2);
            interfaceC0210Q.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        if (interfaceC0210Q != null) {
            interfaceC0210Q.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2930f != null) {
            this.f2931g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        if (interfaceC0210Q != null) {
            interfaceC0210Q.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(q1.d.u(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        if (interfaceC0210Q != null) {
            interfaceC0210Q.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244q c0244q = this.f2926a;
        if (c0244q != null) {
            c0244q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0244q c0244q = this.f2926a;
        if (c0244q != null) {
            c0244q.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2929e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0210Q interfaceC0210Q = this.f2930f;
        if (interfaceC0210Q != null) {
            Context context = this.f2927b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0206M c0206m = new C0206M();
            c0206m.f2905a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0206m.f2906b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0204K.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0210Q.n(c0206m);
        }
    }
}
