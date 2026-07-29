package o;

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

/* loaded from: classes.dex */
public final class K5 extends Spinner {
    public static final int[] p = {R.attr.spinnerMode};
    public final L4 h;
    public final Context i;
    public final A5 j;
    public SpinnerAdapter k;
    public final boolean l;
    public final J5 m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f55o;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public K5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.devanos.nilufar.usmonova.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f55o = new Rect();
        CV.a(this, getContext());
        int[] iArr = AbstractC1886sL.u;
        C0950e6 F = C0950e6.F(context, attributeSet, iArr, com.devanos.nilufar.usmonova.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) F.i;
        this.h = new L4(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.i = new C2169we(context, resourceId);
        } else {
            this.i = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, p, com.devanos.nilufar.usmonova.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i = typedArray.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
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
        } catch (Exception e2) {
            e = e2;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i == 0) {
            D5 d5 = new D5(this);
            this.m = d5;
            d5.j = typedArray2.getString(2);
        } else if (i == 1) {
            H5 h5 = new H5(this, this.i, attributeSet);
            C0950e6 F2 = C0950e6.F(this.i, attributeSet, iArr, com.devanos.nilufar.usmonova.R.attr.spinnerStyle);
            this.n = ((TypedArray) F2.i).getLayoutDimension(3, -2);
            h5.h(F2.x(1));
            h5.I = typedArray2.getString(2);
            F2.L();
            this.m = h5;
            this.j = new A5(this, this, h5);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.devanos.nilufar.usmonova.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        F.L();
        this.l = true;
        SpinnerAdapter spinnerAdapter = this.k;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.k = null;
        }
        this.h.e(attributeSet, com.devanos.nilufar.usmonova.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.f55o;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        L4 l4 = this.h;
        if (l4 != null) {
            l4.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        J5 j5 = this.m;
        return j5 != null ? j5.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        J5 j5 = this.m;
        return j5 != null ? j5.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.m != null ? this.n : super.getDropDownWidth();
    }

    public final J5 getInternalPopup() {
        return this.m;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        J5 j5 = this.m;
        return j5 != null ? j5.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.i;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        J5 j5 = this.m;
        return j5 != null ? j5.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        L4 l4 = this.h;
        if (l4 != null) {
            return l4.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        L4 l4 = this.h;
        if (l4 != null) {
            return l4.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        J5 j5 = this.m;
        if (j5 == null || !j5.a()) {
            return;
        }
        j5.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        I5 i5 = (I5) parcelable;
        super.onRestoreInstanceState(i5.getSuperState());
        if (!i5.h || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new B5(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        I5 i5 = new I5(super.onSaveInstanceState());
        J5 j5 = this.m;
        i5.h = j5 != null && j5.a();
        return i5;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        A5 a5 = this.j;
        if (a5 == null || !a5.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        J5 j5 = this.m;
        if (j5 == null) {
            return super.performClick();
        }
        if (j5.a()) {
            return true;
        }
        this.m.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        L4 l4 = this.h;
        if (l4 != null) {
            l4.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        L4 l4 = this.h;
        if (l4 != null) {
            l4.g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        J5 j5 = this.m;
        if (j5 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            j5.k(i);
            j5.l(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        J5 j5 = this.m;
        if (j5 != null) {
            j5.i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.m != null) {
            this.n = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        J5 j5 = this.m;
        if (j5 != null) {
            j5.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(EB.t(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        J5 j5 = this.m;
        if (j5 != null) {
            j5.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        L4 l4 = this.h;
        if (l4 != null) {
            l4.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        L4 l4 = this.h;
        if (l4 != null) {
            l4.j(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.l) {
            this.k = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        J5 j5 = this.m;
        if (j5 != null) {
            Context context = this.i;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            E5 e5 = new E5();
            e5.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                e5.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                C5.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            j5.p(e5);
        }
    }
}
