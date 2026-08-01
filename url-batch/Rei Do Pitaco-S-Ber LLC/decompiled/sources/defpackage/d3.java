package defpackage;

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

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class d3 extends Button {
    public final y1 f;
    public final l5 g;
    public i4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f50.a(context);
        b50.a(this, getContext());
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, i);
        l5 l5Var = new l5(this);
        this.g = l5Var;
        l5Var.f(attributeSet, i);
        l5Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private i4 getEmojiTextViewHelper() {
        if (this.h == null) {
            this.h = new i4(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h90.c) {
            return super.getAutoSizeMaxTextSize();
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            return Math.round(l5Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h90.c) {
            return super.getAutoSizeMinTextSize();
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            return Math.round(l5Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h90.c) {
            return super.getAutoSizeStepGranularity();
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            return Math.round(l5Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h90.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        l5 l5Var = this.g;
        return l5Var != null ? l5Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (h90.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            return l5Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof y40 ? ((y40) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        l5 l5Var = this.g;
        if (l5Var == null || h90.c) {
            return;
        }
        l5Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        l5 l5Var = this.g;
        if (l5Var != null) {
            u5 u5Var = l5Var.i;
            if (h90.c || !u5Var.f()) {
                return;
            }
            u5Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (h90.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (h90.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (h90.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.k(i);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(vv.b0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((g8) getEmojiTextViewHelper().b.g).C(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.a.setAllCaps(z);
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        l5 l5Var = this.g;
        l5Var.l(colorStateList);
        l5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        l5 l5Var = this.g;
        l5Var.m(mode);
        l5Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = h90.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            u5 u5Var = l5Var.i;
            if (z || u5Var.f()) {
                return;
            }
            u5Var.g(i, f);
        }
    }
}
