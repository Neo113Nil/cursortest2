package l;

import K.C0014m;
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
import com.football.transfertrivia.R;
import i0.C0141d;

/* renamed from: l.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232r extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0141d f3060a;

    /* renamed from: b, reason: collision with root package name */
    public final C0228p f3061b;

    /* renamed from: c, reason: collision with root package name */
    public final X f3062c;
    public C0242w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0232r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        R0.a(context);
        Q0.a(this, getContext());
        X x2 = new X(this);
        this.f3062c = x2;
        x2.f(attributeSet, R.attr.checkedTextViewStyle);
        x2.b();
        C0228p c0228p = new C0228p(this);
        this.f3061b = c0228p;
        c0228p.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f3060a = new C0141d(this);
        Context context2 = getContext();
        int[] iArr = f.a.f2145l;
        C0014m i = C0014m.i(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) i.f425b;
        K.T.k(this, getContext(), iArr, attributeSet, (TypedArray) i.f425b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(T.e.w(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(i.b(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC0221l0.b(typedArray.getInt(3, -1), null));
                }
                i.k();
                getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(T.e.w(getContext(), resourceId));
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

    private C0242w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0242w(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        X x2 = this.f3062c;
        if (x2 != null) {
            x2.b();
        }
        C0228p c0228p = this.f3061b;
        if (c0228p != null) {
            c0228p.a();
        }
        C0141d c0141d = this.f3060a;
        if (c0141d != null) {
            c0141d.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f637a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0228p c0228p = this.f3061b;
        if (c0228p != null) {
            return c0228p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228p c0228p = this.f3061b;
        if (c0228p != null) {
            return c0228p.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0141d c0141d = this.f3060a;
        if (c0141d != null) {
            return (ColorStateList) c0141d.f2614e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0141d c0141d = this.f3060a;
        if (c0141d != null) {
            return (PorterDuff.Mode) c0141d.f2615f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3062c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3062c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        h0.f.h(editorInfo, onCreateInputConnection, this);
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
        C0228p c0228p = this.f3061b;
        if (c0228p != null) {
            c0228p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228p c0228p = this.f3061b;
        if (c0228p != null) {
            c0228p.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0141d c0141d = this.f3060a;
        if (c0141d != null) {
            if (c0141d.f2613c) {
                c0141d.f2613c = false;
            } else {
                c0141d.f2613c = true;
                c0141d.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3062c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3062c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A.c.D0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228p c0228p = this.f3061b;
        if (c0228p != null) {
            c0228p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228p c0228p = this.f3061b;
        if (c0228p != null) {
            c0228p.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0141d c0141d = this.f3060a;
        if (c0141d != null) {
            c0141d.f2614e = colorStateList;
            c0141d.f2611a = true;
            c0141d.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0141d c0141d = this.f3060a;
        if (c0141d != null) {
            c0141d.f2615f = mode;
            c0141d.f2612b = true;
            c0141d.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3062c;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3062c;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3062c;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(T.e.w(getContext(), i));
    }
}
