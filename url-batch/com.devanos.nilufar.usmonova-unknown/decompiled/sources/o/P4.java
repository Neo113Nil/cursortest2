package o;

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
import com.devanos.nilufar.usmonova.R;

/* loaded from: classes.dex */
public final class P4 extends CheckedTextView {
    public final Q4 h;
    public final L4 i;
    public final R5 j;
    public C1607o5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public P4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        RV.a(context);
        CV.a(this, getContext());
        R5 r5 = new R5(this);
        this.j = r5;
        r5.f(attributeSet, R.attr.checkedTextViewStyle);
        r5.b();
        L4 l4 = new L4(this);
        this.i = l4;
        l4.e(attributeSet, R.attr.checkedTextViewStyle);
        this.h = new Q4(this);
        Context context2 = getContext();
        int[] iArr = AbstractC1886sL.l;
        C0950e6 F = C0950e6.F(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) F.i;
        AZ.g(this, getContext(), iArr, attributeSet, (TypedArray) F.i, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(EB.t(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(F.w(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC1317jj.b(typedArray.getInt(3, -1), null));
                }
                F.L();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(EB.t(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            F.L();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            F.L();
            throw th;
        }
    }

    private C1607o5 getEmojiTextViewHelper() {
        if (this.k == null) {
            this.k = new C1607o5(this);
        }
        return this.k;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        R5 r5 = this.j;
        if (r5 != null) {
            r5.b();
        }
        L4 l4 = this.i;
        if (l4 != null) {
            l4.a();
        }
        Q4 q4 = this.h;
        if (q4 != null) {
            q4.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return PO.r(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        L4 l4 = this.i;
        if (l4 != null) {
            return l4.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        L4 l4 = this.i;
        if (l4 != null) {
            return l4.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        Q4 q4 = this.h;
        if (q4 != null) {
            return (ColorStateList) q4.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        Q4 q4 = this.h;
        if (q4 != null) {
            return (PorterDuff.Mode) q4.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.j.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.j.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0048Bt.O(onCreateInputConnection, editorInfo, this);
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
        L4 l4 = this.i;
        if (l4 != null) {
            l4.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        L4 l4 = this.i;
        if (l4 != null) {
            l4.g(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        Q4 q4 = this.h;
        if (q4 != null) {
            if (q4.e) {
                q4.e = false;
            } else {
                q4.e = true;
                q4.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.j;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.j;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(PO.s(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        L4 l4 = this.i;
        if (l4 != null) {
            l4.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        L4 l4 = this.i;
        if (l4 != null) {
            l4.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        Q4 q4 = this.h;
        if (q4 != null) {
            q4.a = colorStateList;
            q4.c = true;
            q4.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        Q4 q4 = this.h;
        if (q4 != null) {
            q4.b = mode;
            q4.d = true;
            q4.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        R5 r5 = this.j;
        r5.k(colorStateList);
        r5.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        R5 r5 = this.j;
        r5.l(mode);
        r5.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        R5 r5 = this.j;
        if (r5 != null) {
            r5.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(EB.t(getContext(), i));
    }
}
