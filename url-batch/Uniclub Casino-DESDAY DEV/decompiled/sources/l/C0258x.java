package l;

import K.C0003d;
import K.C0005f;
import K.InterfaceC0002c;
import K.InterfaceC0018t;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.fortuneodd.shadegrid.R;

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0258x extends EditText implements InterfaceC0018t {

    /* renamed from: a, reason: collision with root package name */
    public final C0244q f3090a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f3091b;

    /* renamed from: c, reason: collision with root package name */
    public final C0197D f3092c;
    public final Q.s d;

    /* renamed from: e, reason: collision with root package name */
    public final C0197D f3093e;

    /* renamed from: f, reason: collision with root package name */
    public C0256w f3094f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0258x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0244q c0244q = new C0244q(this);
        this.f3090a = c0244q;
        c0244q.d(attributeSet, R.attr.editTextStyle);
        Z z2 = new Z(this);
        this.f3091b = z2;
        z2.f(attributeSet, R.attr.editTextStyle);
        z2.b();
        C0197D c0197d = new C0197D();
        c0197d.f2855b = this;
        this.f3092c = c0197d;
        this.d = new Q.s();
        C0197D c0197d2 = new C0197D(this);
        this.f3093e = c0197d2;
        c0197d2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0197d2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0256w getSuperCaller() {
        if (this.f3094f == null) {
            this.f3094f = new C0256w(this);
        }
        return this.f3094f;
    }

    @Override // K.InterfaceC0018t
    public final C0005f a(C0005f c0005f) {
        return this.d.a(this, c0005f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0244q c0244q = this.f3090a;
        if (c0244q != null) {
            c0244q.a();
        }
        Z z2 = this.f3091b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f649a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244q c0244q = this.f3090a;
        if (c0244q != null) {
            return c0244q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0244q c0244q = this.f3090a;
        if (c0244q != null) {
            return c0244q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3091b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3091b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0197D c0197d;
        if (Build.VERSION.SDK_INT >= 28 || (c0197d = this.f3092c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0197d.f2856c;
        return textClassifier == null ? T.a((TextView) c0197d.f2855b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3091b.getClass();
        Z.h(editorInfo, onCreateInputConnection, this);
        i1.r.g(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = K.S.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new P.b(onCreateInputConnection, new M0.k(this));
        }
        return this.f3093e.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && K.S.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = AbstractC0200G.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0002c interfaceC0002c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || K.S.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0002c = new C.g(primaryClip, 1);
            } else {
                C0003d c0003d = new C0003d();
                c0003d.f379b = primaryClip;
                c0003d.f380c = 1;
                interfaceC0002c = c0003d;
            }
            interfaceC0002c.r(i == 16908322 ? 0 : 1);
            K.S.h(this, interfaceC0002c.i());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244q c0244q = this.f3090a;
        if (c0244q != null) {
            c0244q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244q c0244q = this.f3090a;
        if (c0244q != null) {
            c0244q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3091b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3091b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q1.d.a0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3093e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3093e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244q c0244q = this.f3090a;
        if (c0244q != null) {
            c0244q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0244q c0244q = this.f3090a;
        if (c0244q != null) {
            c0244q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f3091b;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f3091b;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Z z2 = this.f3091b;
        if (z2 != null) {
            z2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0197D c0197d;
        if (Build.VERSION.SDK_INT >= 28 || (c0197d = this.f3092c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0197d.f2856c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
