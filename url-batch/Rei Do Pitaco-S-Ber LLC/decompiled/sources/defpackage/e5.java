package defpackage;

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

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class e5 extends Spinner {
    public static final int[] n = {R.attr.spinnerMode};
    public final y1 f;
    public final Context g;
    public final u4 h;
    public SpinnerAdapter i;
    public final boolean j;
    public final d5 k;
    public int l;
    public final Rect m;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.m = new Rect();
        b50.a(this, getContext());
        int[] iArr = kx.u;
        y5 l = y5.l(com.ionia.reidopitaco.libya.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray2 = (TypedArray) l.a;
        this.f = new y1(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.g = new dd(context, resourceId);
        } else {
            this.g = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, n, com.ionia.reidopitaco.libya.R.attr.spinnerStyle, 0);
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
            x4 x4Var = new x4(this);
            this.k = x4Var;
            x4Var.h = typedArray2.getString(2);
        } else if (i == 1) {
            b5 b5Var = new b5(this, this.g, attributeSet);
            y5 l2 = y5.l(com.ionia.reidopitaco.libya.R.attr.spinnerStyle, 0, this.g, attributeSet, iArr);
            this.l = ((TypedArray) l2.a).getLayoutDimension(3, -2);
            b5Var.i(l2.f(1));
            b5Var.H = typedArray2.getString(2);
            l2.n();
            this.k = b5Var;
            this.h = new u4(this, this, b5Var);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.ionia.reidopitaco.libya.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        l.n();
        this.j = true;
        SpinnerAdapter spinnerAdapter = this.i;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.i = null;
        }
        this.f.l(attributeSet, com.ionia.reidopitaco.libya.R.attr.spinnerStyle);
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
        Rect rect = this.m;
        drawable.getPadding(rect);
        return rect.left + rect.right + i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        d5 d5Var = this.k;
        return d5Var != null ? d5Var.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        d5 d5Var = this.k;
        return d5Var != null ? d5Var.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.k != null ? this.l : super.getDropDownWidth();
    }

    public final d5 getInternalPopup() {
        return this.k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        d5 d5Var = this.k;
        return d5Var != null ? d5Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        d5 d5Var = this.k;
        return d5Var != null ? d5Var.p() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d5 d5Var = this.k;
        if (d5Var == null || !d5Var.b()) {
            return;
        }
        d5Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        c5 c5Var = (c5) parcelable;
        super.onRestoreInstanceState(c5Var.getSuperState());
        if (!c5Var.f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new v4(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        c5 c5Var = new c5(super.onSaveInstanceState());
        d5 d5Var = this.k;
        c5Var.f = d5Var != null && d5Var.b();
        return c5Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u4 u4Var = this.h;
        if (u4Var == null || !u4Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        d5 d5Var = this.k;
        if (d5Var == null) {
            return super.performClick();
        }
        if (d5Var.b()) {
            return true;
        }
        d5Var.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.j) {
            this.i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        d5 d5Var = this.k;
        if (d5Var != null) {
            Context context = this.g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            y4 y4Var = new y4();
            y4Var.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                y4Var.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                w4.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            d5Var.q(y4Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        d5 d5Var = this.k;
        if (d5Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            d5Var.l(i);
            d5Var.m(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        d5 d5Var = this.k;
        if (d5Var != null) {
            d5Var.k(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.k != null) {
            this.l = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        d5 d5Var = this.k;
        if (d5Var != null) {
            d5Var.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(vv.t(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        d5 d5Var = this.k;
        if (d5Var != null) {
            d5Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }
}
