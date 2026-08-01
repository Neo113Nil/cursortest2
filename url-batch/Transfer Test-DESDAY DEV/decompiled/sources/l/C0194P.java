package l;

import K.C0014m;
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
import j.C0146c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0155d;

/* renamed from: l.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194P extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0228p f2927a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2928b;

    /* renamed from: c, reason: collision with root package name */
    public final C0186H f2929c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2930e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0193O f2931f;

    /* renamed from: g, reason: collision with root package name */
    public int f2932g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0194P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.football.transfertrivia.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        Q0.a(this, getContext());
        int[] iArr = f.a.f2154u;
        C0014m i2 = C0014m.i(context, attributeSet, iArr, com.football.transfertrivia.R.attr.spinnerStyle);
        this.f2927a = new C0228p(this);
        TypedArray typedArray2 = (TypedArray) i2.f425b;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f2928b = new C0146c(context, resourceId);
        } else {
            this.f2928b = context;
        }
        int i3 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.football.transfertrivia.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i3 = typedArray.getInt(0, 0);
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
        if (i3 == 0) {
            DialogInterfaceOnClickListenerC0188J dialogInterfaceOnClickListenerC0188J = new DialogInterfaceOnClickListenerC0188J(this);
            this.f2931f = dialogInterfaceOnClickListenerC0188J;
            dialogInterfaceOnClickListenerC0188J.f2903c = typedArray2.getString(2);
        } else if (i3 == 1) {
            C0191M c0191m = new C0191M(this, this.f2928b, attributeSet);
            C0014m i4 = C0014m.i(this.f2928b, attributeSet, iArr, com.football.transfertrivia.R.attr.spinnerStyle);
            this.f2932g = ((TypedArray) i4.f425b).getLayoutDimension(3, -2);
            c0191m.k(i4.c(1));
            c0191m.f2916C = typedArray2.getString(2);
            i4.k();
            this.f2931f = c0191m;
            this.f2929c = new C0186H(this, this, c0191m);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.football.transfertrivia.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        i2.k();
        this.f2930e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f2927a.d(attributeSet, com.football.transfertrivia.R.attr.spinnerStyle);
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
        C0228p c0228p = this.f2927a;
        if (c0228p != null) {
            c0228p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0193O interfaceC0193O = this.f2931f;
        return interfaceC0193O != null ? interfaceC0193O.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0193O interfaceC0193O = this.f2931f;
        return interfaceC0193O != null ? interfaceC0193O.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2931f != null ? this.f2932g : super.getDropDownWidth();
    }

    public final InterfaceC0193O getInternalPopup() {
        return this.f2931f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0193O interfaceC0193O = this.f2931f;
        return interfaceC0193O != null ? interfaceC0193O.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2928b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0193O interfaceC0193O = this.f2931f;
        return interfaceC0193O != null ? interfaceC0193O.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0228p c0228p = this.f2927a;
        if (c0228p != null) {
            return c0228p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228p c0228p = this.f2927a;
        if (c0228p != null) {
            return c0228p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0193O interfaceC0193O = this.f2931f;
        if (interfaceC0193O == null || !interfaceC0193O.a()) {
            return;
        }
        interfaceC0193O.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2931f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0192N c0192n = (C0192N) parcelable;
        super.onRestoreInstanceState(c0192n.getSuperState());
        if (!c0192n.f2920a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0155d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0192N c0192n = new C0192N(super.onSaveInstanceState());
        InterfaceC0193O interfaceC0193O = this.f2931f;
        c0192n.f2920a = interfaceC0193O != null && interfaceC0193O.a();
        return c0192n;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0186H c0186h = this.f2929c;
        if (c0186h == null || !c0186h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0193O interfaceC0193O = this.f2931f;
        if (interfaceC0193O == null) {
            return super.performClick();
        }
        if (interfaceC0193O.a()) {
            return true;
        }
        this.f2931f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0228p c0228p = this.f2927a;
        if (c0228p != null) {
            c0228p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0228p c0228p = this.f2927a;
        if (c0228p != null) {
            c0228p.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0193O interfaceC0193O = this.f2931f;
        if (interfaceC0193O == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0193O.o(i2);
            interfaceC0193O.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0193O interfaceC0193O = this.f2931f;
        if (interfaceC0193O != null) {
            interfaceC0193O.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2931f != null) {
            this.f2932g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0193O interfaceC0193O = this.f2931f;
        if (interfaceC0193O != null) {
            interfaceC0193O.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(T.e.w(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0193O interfaceC0193O = this.f2931f;
        if (interfaceC0193O != null) {
            interfaceC0193O.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228p c0228p = this.f2927a;
        if (c0228p != null) {
            c0228p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228p c0228p = this.f2927a;
        if (c0228p != null) {
            c0228p.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2930e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0193O interfaceC0193O = this.f2931f;
        if (interfaceC0193O != null) {
            Context context = this.f2928b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0189K c0189k = new C0189K();
            c0189k.f2906a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0189k.f2907b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0187I.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0193O.n(c0189k);
        }
    }
}
