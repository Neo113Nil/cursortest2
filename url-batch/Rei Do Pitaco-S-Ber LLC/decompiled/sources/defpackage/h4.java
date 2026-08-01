package defpackage;

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
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class h4 extends EditText implements sv {
    public final y1 f;
    public final l5 g;
    public final o4 h;
    public final z40 i;
    public final o4 j;
    public g4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        f50.a(context);
        b50.a(this, getContext());
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, R.attr.editTextStyle);
        l5 l5Var = new l5(this);
        this.g = l5Var;
        l5Var.f(attributeSet, R.attr.editTextStyle);
        l5Var.b();
        o4 o4Var = new o4(6, false);
        o4Var.g = this;
        this.h = o4Var;
        this.i = new z40();
        o4 o4Var2 = new o4(this, 5);
        this.j = o4Var2;
        o4Var2.z(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener v = o4Var2.v(keyListener);
        if (v == keyListener) {
            return;
        }
        super.setKeyListener(v);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private g4 getSuperCaller() {
        if (this.k == null) {
            this.k = new g4(this);
        }
        return this.k;
    }

    @Override // defpackage.sv
    public final bd a(bd bdVar) {
        this.i.getClass();
        return z40.a(this, bdVar);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o4 o4Var;
        if (Build.VERSION.SDK_INT >= 28 || (o4Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) o4Var.h;
        return textClassifier == null ? f5.a((TextView) o4Var.g) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] g;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        l5.h(editorInfo, onCreateInputConnection, this);
        oo.A(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (g = f80.g(this)) != null) {
            editorInfo.contentMimeTypes = g;
            onCreateInputConnection = new go(onCreateInputConnection, new h(1, this));
        }
        return this.j.C(onCreateInputConnection, editorInfo);
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
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && f80.g(this) != null) {
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
                z = r4.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        yc ycVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || f80.g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                ycVar = new j0(primaryClip, 1);
            } else {
                zc zcVar = new zc();
                zcVar.g = primaryClip;
                zcVar.h = 1;
                ycVar = zcVar;
            }
            ycVar.x(i == 16908322 ? 0 : 1);
            f80.i(this, ycVar.build());
        }
        return true;
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(vv.b0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.j.M(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j.v(keyListener));
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        o4 o4Var;
        if (Build.VERSION.SDK_INT >= 28 || (o4Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o4Var.h = textClassifier;
        }
    }
}
