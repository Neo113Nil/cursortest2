package l;

import K.C0019l;
import a1.AbstractC0067d;
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
import j.C0177c;
import k.ViewTreeObserverOnGlobalLayoutListenerC0193d;

/* renamed from: l.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237Q extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0271q f3358a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3359b;

    /* renamed from: c, reason: collision with root package name */
    public final C0229I f3360c;
    public SpinnerAdapter d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3361e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0236P f3362f;

    /* renamed from: g, reason: collision with root package name */
    public int f3363g;
    public final Rect h;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0237Q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luckycounter.drinkwater.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.h = new Rect();
        S0.a(this, getContext());
        int[] iArr = f.a.f2576u;
        C0019l i2 = C0019l.i(context, attributeSet, iArr, com.luckycounter.drinkwater.R.attr.spinnerStyle);
        this.f3358a = new C0271q(this);
        TypedArray typedArray2 = (TypedArray) i2.f684b;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f3359b = new C0177c(context, resourceId);
        } else {
            this.f3359b = context;
        }
        int i3 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, i, com.luckycounter.drinkwater.R.attr.spinnerStyle, 0);
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
            DialogInterfaceOnClickListenerC0231K dialogInterfaceOnClickListenerC0231K = new DialogInterfaceOnClickListenerC0231K(this);
            this.f3362f = dialogInterfaceOnClickListenerC0231K;
            dialogInterfaceOnClickListenerC0231K.f3330c = typedArray2.getString(2);
        } else if (i3 == 1) {
            C0234N c0234n = new C0234N(this, this.f3359b, attributeSet);
            C0019l i4 = C0019l.i(this.f3359b, attributeSet, iArr, com.luckycounter.drinkwater.R.attr.spinnerStyle);
            this.f3363g = ((TypedArray) i4.f684b).getLayoutDimension(3, -2);
            c0234n.k(i4.c(1));
            c0234n.f3341C = typedArray2.getString(2);
            i4.k();
            this.f3362f = c0234n;
            this.f3360c = new C0229I(this, this, c0234n);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.luckycounter.drinkwater.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        i2.k();
        this.f3361e = true;
        SpinnerAdapter spinnerAdapter = this.d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.d = null;
        }
        this.f3358a.d(attributeSet, com.luckycounter.drinkwater.R.attr.spinnerStyle);
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
        C0271q c0271q = this.f3358a;
        if (c0271q != null) {
            c0271q.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0236P interfaceC0236P = this.f3362f;
        return interfaceC0236P != null ? interfaceC0236P.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0236P interfaceC0236P = this.f3362f;
        return interfaceC0236P != null ? interfaceC0236P.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f3362f != null ? this.f3363g : super.getDropDownWidth();
    }

    public final InterfaceC0236P getInternalPopup() {
        return this.f3362f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0236P interfaceC0236P = this.f3362f;
        return interfaceC0236P != null ? interfaceC0236P.m() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f3359b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0236P interfaceC0236P = this.f3362f;
        return interfaceC0236P != null ? interfaceC0236P.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271q c0271q = this.f3358a;
        if (c0271q != null) {
            return c0271q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271q c0271q = this.f3358a;
        if (c0271q != null) {
            return c0271q.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0236P interfaceC0236P = this.f3362f;
        if (interfaceC0236P == null || !interfaceC0236P.a()) {
            return;
        }
        interfaceC0236P.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f3362f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0235O c0235o = (C0235O) parcelable;
        super.onRestoreInstanceState(c0235o.getSuperState());
        if (!c0235o.f3351a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0193d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0235O c0235o = new C0235O(super.onSaveInstanceState());
        InterfaceC0236P interfaceC0236P = this.f3362f;
        c0235o.f3351a = interfaceC0236P != null && interfaceC0236P.a();
        return c0235o;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0229I c0229i = this.f3360c;
        if (c0229i == null || !c0229i.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0236P interfaceC0236P = this.f3362f;
        if (interfaceC0236P == null) {
            return super.performClick();
        }
        if (interfaceC0236P.a()) {
            return true;
        }
        this.f3362f.g(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271q c0271q = this.f3358a;
        if (c0271q != null) {
            c0271q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0271q c0271q = this.f3358a;
        if (c0271q != null) {
            c0271q.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC0236P interfaceC0236P = this.f3362f;
        if (interfaceC0236P == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC0236P.p(i2);
            interfaceC0236P.c(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC0236P interfaceC0236P = this.f3362f;
        if (interfaceC0236P != null) {
            interfaceC0236P.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f3362f != null) {
            this.f3363g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0236P interfaceC0236P = this.f3362f;
        if (interfaceC0236P != null) {
            interfaceC0236P.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AbstractC0067d.k(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0236P interfaceC0236P = this.f3362f;
        if (interfaceC0236P != null) {
            interfaceC0236P.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271q c0271q = this.f3358a;
        if (c0271q != null) {
            c0271q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271q c0271q = this.f3358a;
        if (c0271q != null) {
            c0271q.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3361e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0236P interfaceC0236P = this.f3362f;
        if (interfaceC0236P != null) {
            Context context = this.f3359b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0232L c0232l = new C0232L();
            c0232l.f3335a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0232l.f3336b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0230J.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0236P.n(c0232l);
        }
    }
}
