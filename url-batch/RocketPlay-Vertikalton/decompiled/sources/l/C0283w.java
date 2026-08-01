package l;

import K.C0011d;
import K.C0013f;
import K.InterfaceC0009c;
import K.InterfaceC0026t;
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
import c1.AbstractC0104b;
import com.luckycounter.drinkwater.R;

/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0283w extends EditText implements InterfaceC0026t {

    /* renamed from: a, reason: collision with root package name */
    public final C0271q f3514a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3515b;

    /* renamed from: c, reason: collision with root package name */
    public final C0223C f3516c;
    public final Q.r d;

    /* renamed from: e, reason: collision with root package name */
    public final C0223C f3517e;

    /* renamed from: f, reason: collision with root package name */
    public C0281v f3518f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0271q c0271q = new C0271q(this);
        this.f3514a = c0271q;
        c0271q.d(attributeSet, R.attr.editTextStyle);
        Y y2 = new Y(this);
        this.f3515b = y2;
        y2.f(attributeSet, R.attr.editTextStyle);
        y2.b();
        C0223C c0223c = new C0223C();
        c0223c.f3285b = this;
        this.f3516c = c0223c;
        this.d = new Q.r();
        C0223C c0223c2 = new C0223C(this);
        this.f3517e = c0223c2;
        c0223c2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0223c2.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0281v getSuperCaller() {
        if (this.f3518f == null) {
            this.f3518f = new C0281v(this);
        }
        return this.f3518f;
    }

    @Override // K.InterfaceC0026t
    public final C0013f a(C0013f c0013f) {
        return this.d.a(this, c0013f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0271q c0271q = this.f3514a;
        if (c0271q != null) {
            c0271q.a();
        }
        Y y2 = this.f3515b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f1058a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271q c0271q = this.f3514a;
        if (c0271q != null) {
            return c0271q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271q c0271q = this.f3514a;
        if (c0271q != null) {
            return c0271q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3515b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3515b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0223C c0223c;
        if (Build.VERSION.SDK_INT >= 28 || (c0223c = this.f3516c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0223c.f3286c;
        return textClassifier == null ? AbstractC0238S.a((TextView) c0223c.f3285b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3515b.getClass();
        Y.h(editorInfo, onCreateInputConnection, this);
        AbstractC0104b.s(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f2 = K.T.f(this)) != null) {
            editorInfo.contentMimeTypes = f2;
            onCreateInputConnection = new P.c(onCreateInputConnection, new P.b(this));
        }
        return this.f3517e.c(onCreateInputConnection, editorInfo);
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
                z2 = AbstractC0226F.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0009c interfaceC0009c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || K.T.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0009c = new A1.d(primaryClip, 1);
            } else {
                C0011d c0011d = new C0011d();
                c0011d.f654b = primaryClip;
                c0011d.f655c = 1;
                interfaceC0009c = c0011d;
            }
            interfaceC0009c.p(i == 16908322 ? 0 : 1);
            K.T.h(this, interfaceC0009c.h());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271q c0271q = this.f3514a;
        if (c0271q != null) {
            c0271q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271q c0271q = this.f3514a;
        if (c0271q != null) {
            c0271q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3515b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3515b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(F1.d.q0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3517e.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3517e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271q c0271q = this.f3514a;
        if (c0271q != null) {
            c0271q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271q c0271q = this.f3514a;
        if (c0271q != null) {
            c0271q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3515b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3515b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3515b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0223C c0223c;
        if (Build.VERSION.SDK_INT >= 28 || (c0223c = this.f3516c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0223c.f3286c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
