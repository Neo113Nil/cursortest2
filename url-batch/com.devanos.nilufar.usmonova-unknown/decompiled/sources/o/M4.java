package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.devanos.nilufar.usmonova.R;

/* loaded from: classes.dex */
public final class M4 extends Button {
    public final L4 h;
    public final R5 i;
    public C1607o5 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        RV.a(context);
        CV.a(this, getContext());
        L4 l4 = new L4(this);
        this.h = l4;
        l4.e(attributeSet, R.attr.buttonStyle);
        R5 r5 = new R5(this);
        this.i = r5;
        r5.f(attributeSet, R.attr.buttonStyle);
        r5.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private C1607o5 getEmojiTextViewHelper() {
        if (this.j == null) {
            this.j = new C1607o5(this);
        }
        return this.j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        L4 l4 = this.h;
        if (l4 != null) {
            l4.a();
        }
        R5 r5 = this.i;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeMaxTextSize();
        }
        R5 r5 = this.i;
        if (r5 != null) {
            return Math.round(r5.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeMinTextSize();
        }
        R5 r5 = this.i;
        if (r5 != null) {
            return Math.round(r5.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeStepGranularity();
        }
        R5 r5 = this.i;
        if (r5 != null) {
            return Math.round(r5.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        R5 r5 = this.i;
        return r5 != null ? r5.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            return r5.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return PO.r(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.i.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R5 r5 = this.i;
        if (r5 == null || AbstractC1468m00.c) {
            return;
        }
        r5.i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        R5 r5 = this.i;
        if (r5 != null) {
            C0688a6 c0688a6 = r5.i;
            if (AbstractC1468m00.c || !c0688a6.f()) {
                return;
            }
            c0688a6.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC1468m00.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            r5.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC1468m00.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            r5.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC1468m00.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            r5.j(i);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(PO.s(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0048Bt) getEmojiTextViewHelper().b.i).H(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        R5 r5 = this.i;
        if (r5 != null) {
            r5.a.setAllCaps(z);
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        R5 r5 = this.i;
        r5.k(colorStateList);
        r5.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        R5 r5 = this.i;
        r5.l(mode);
        r5.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        R5 r5 = this.i;
        if (r5 != null) {
            r5.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = AbstractC1468m00.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            C0688a6 c0688a6 = r5.i;
            if (z || c0688a6.f()) {
                return;
            }
            c0688a6.g(f, i);
        }
    }
}
