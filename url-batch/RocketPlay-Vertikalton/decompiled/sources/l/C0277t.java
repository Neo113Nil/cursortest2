package l;

import K.C0019l;
import a1.AbstractC0067d;
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
import c1.AbstractC0104b;
import com.luckycounter.drinkwater.R;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277t extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f3496a;

    /* renamed from: b, reason: collision with root package name */
    public final C0271q f3497b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f3498c;
    public C0285x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0277t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        T0.a(context);
        S0.a(this, getContext());
        Y y2 = new Y(this);
        this.f3498c = y2;
        y2.f(attributeSet, R.attr.checkedTextViewStyle);
        y2.b();
        C0271q c0271q = new C0271q(this);
        this.f3497b = c0271q;
        c0271q.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f3496a = new i0.d(this);
        Context context2 = getContext();
        int[] iArr = f.a.f2567l;
        C0019l i = C0019l.i(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) i.f684b;
        K.T.k(this, getContext(), iArr, attributeSet, (TypedArray) i.f684b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0067d.k(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(i.b(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC0266n0.b(typedArray.getInt(3, -1), null));
                }
                i.k();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0067d.k(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            i.k();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            i.k();
            throw th;
        }
    }

    private C0285x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0285x(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Y y2 = this.f3498c;
        if (y2 != null) {
            y2.b();
        }
        C0271q c0271q = this.f3497b;
        if (c0271q != null) {
            c0271q.a();
        }
        i0.d dVar = this.f3496a;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f1058a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271q c0271q = this.f3497b;
        if (c0271q != null) {
            return c0271q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271q c0271q = this.f3497b;
        if (c0271q != null) {
            return c0271q.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        i0.d dVar = this.f3496a;
        if (dVar != null) {
            return (ColorStateList) dVar.f3034e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i0.d dVar = this.f3496a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f3035f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3498c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3498c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0104b.s(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271q c0271q = this.f3497b;
        if (c0271q != null) {
            c0271q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271q c0271q = this.f3497b;
        if (c0271q != null) {
            c0271q.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i0.d dVar = this.f3496a;
        if (dVar != null) {
            if (dVar.f3033c) {
                dVar.f3033c = false;
            } else {
                dVar.f3033c = true;
                dVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3498c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3498c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(F1.d.q0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271q c0271q = this.f3497b;
        if (c0271q != null) {
            c0271q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271q c0271q = this.f3497b;
        if (c0271q != null) {
            c0271q.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i0.d dVar = this.f3496a;
        if (dVar != null) {
            dVar.f3034e = colorStateList;
            dVar.f3031a = true;
            dVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i0.d dVar = this.f3496a;
        if (dVar != null) {
            dVar.f3035f = mode;
            dVar.f3032b = true;
            dVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3498c;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3498c;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3498c;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0067d.k(getContext(), i));
    }
}
