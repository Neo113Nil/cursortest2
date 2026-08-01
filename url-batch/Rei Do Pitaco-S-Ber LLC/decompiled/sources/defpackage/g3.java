package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g3 extends CheckedTextView {
    public final h3 f;
    public final y1 g;
    public final l5 h;
    public i4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004d, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        f50.a(context);
        b50.a(this, getContext());
        l5 l5Var = new l5(this);
        this.h = l5Var;
        l5Var.f(attributeSet, R.attr.checkedTextViewStyle);
        l5Var.b();
        y1 y1Var = new y1(this);
        this.g = y1Var;
        y1Var.l(attributeSet, R.attr.checkedTextViewStyle);
        this.f = new h3(this);
        Context context2 = getContext();
        int[] iArr = kx.l;
        y5 l = y5.l(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) l.a;
        f80.l(this, getContext(), iArr, attributeSet, (TypedArray) l.a, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(vv.t(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(l.e(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(vf.b(typedArray.getInt(3, -1), null));
                }
                l.n();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(vv.t(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            l.n();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            l.n();
            throw th;
        }
    }

    private i4 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new i4(this);
        }
        return this.i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.b();
        }
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.a();
        }
        h3 h3Var = this.f;
        if (h3Var != null) {
            h3Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof y40 ? ((y40) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.g;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.g;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h3 h3Var = this.f;
        if (h3Var != null) {
            return (ColorStateList) h3Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h3 h3Var = this.f;
        if (h3Var != null) {
            return (PorterDuff.Mode) h3Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        oo.A(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h3 h3Var = this.f;
        if (h3Var != null) {
            if (h3Var.e) {
                h3Var.e = false;
            } else {
                h3Var.e = true;
                h3Var.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(vv.b0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h3 h3Var = this.f;
        if (h3Var != null) {
            h3Var.a = colorStateList;
            h3Var.c = true;
            h3Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h3 h3Var = this.f;
        if (h3Var != null) {
            h3Var.b = mode;
            h3Var.d = true;
            h3Var.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        l5 l5Var = this.h;
        l5Var.l(colorStateList);
        l5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        l5 l5Var = this.h;
        l5Var.m(mode);
        l5Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(vv.t(getContext(), i));
    }
}
