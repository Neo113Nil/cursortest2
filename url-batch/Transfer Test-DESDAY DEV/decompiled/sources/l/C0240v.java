package l;

import K.C0006e;
import K.C0008g;
import K.InterfaceC0005d;
import K.InterfaceC0021u;
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
import com.football.transfertrivia.R;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0240v extends EditText implements InterfaceC0021u {

    /* renamed from: a, reason: collision with root package name */
    public final C0228p f3089a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3090b;

    /* renamed from: c, reason: collision with root package name */
    public final C0180B f3091c;
    public final Q.s d;

    /* renamed from: e, reason: collision with root package name */
    public final C0180B f3092e;

    /* renamed from: f, reason: collision with root package name */
    public C0238u f3093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        R0.a(context);
        Q0.a(this, getContext());
        C0228p c0228p = new C0228p(this);
        this.f3089a = c0228p;
        c0228p.d(attributeSet, R.attr.editTextStyle);
        X x2 = new X(this);
        this.f3090b = x2;
        x2.f(attributeSet, R.attr.editTextStyle);
        x2.b();
        C0180B c0180b = new C0180B();
        c0180b.f2856b = this;
        this.f3091c = c0180b;
        this.d = new Q.s();
        C0180B c0180b2 = new C0180B(this);
        this.f3092e = c0180b2;
        c0180b2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0180b2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0238u getSuperCaller() {
        if (this.f3093f == null) {
            this.f3093f = new C0238u(this);
        }
        return this.f3093f;
    }

    @Override // K.InterfaceC0021u
    public final C0008g a(C0008g c0008g) {
        return this.d.a(this, c0008g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0228p c0228p = this.f3089a;
        if (c0228p != null) {
            c0228p.a();
        }
        X x2 = this.f3090b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f637a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0228p c0228p = this.f3089a;
        if (c0228p != null) {
            return c0228p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228p c0228p = this.f3089a;
        if (c0228p != null) {
            return c0228p.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3090b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3090b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0180B c0180b;
        if (Build.VERSION.SDK_INT >= 28 || (c0180b = this.f3091c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0180b.f2857c;
        return textClassifier == null ? AbstractC0195Q.a((TextView) c0180b.f2856b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3090b.getClass();
        X.h(editorInfo, onCreateInputConnection, this);
        h0.f.h(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = K.T.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new P.c(onCreateInputConnection, new P.b(this));
        }
        return this.f3092e.c(onCreateInputConnection, editorInfo);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && K.T.f(this) != null) {
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
                z2 = AbstractC0183E.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0005d interfaceC0005d;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || K.T.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0005d = new A0.h(primaryClip, 1);
            } else {
                C0006e c0006e = new C0006e();
                c0006e.f392b = primaryClip;
                c0006e.f393c = 1;
                interfaceC0005d = c0006e;
            }
            interfaceC0005d.u(i == 16908322 ? 0 : 1);
            K.T.h(this, interfaceC0005d.j());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0228p c0228p = this.f3089a;
        if (c0228p != null) {
            c0228p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228p c0228p = this.f3089a;
        if (c0228p != null) {
            c0228p.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3090b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3090b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(A.c.D0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3092e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3092e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228p c0228p = this.f3089a;
        if (c0228p != null) {
            c0228p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228p c0228p = this.f3089a;
        if (c0228p != null) {
            c0228p.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3090b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3090b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3090b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0180B c0180b;
        if (Build.VERSION.SDK_INT >= 28 || (c0180b = this.f3091c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0180b.f2857c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
