package o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
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
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1541n5 extends EditText implements InterfaceC1158hG {
    public final L4 h;
    public final R5 i;
    public final C2002u5 j;
    public final C2292yV k;
    public final C2002u5 l;
    public C1475m5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541n5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        RV.a(context);
        CV.a(this, getContext());
        L4 l4 = new L4(this);
        this.h = l4;
        l4.e(attributeSet, R.attr.editTextStyle);
        R5 r5 = new R5(this);
        this.i = r5;
        r5.f(attributeSet, R.attr.editTextStyle);
        r5.b();
        C2002u5 c2002u5 = new C2002u5(8, false);
        c2002u5.i = this;
        this.j = c2002u5;
        this.k = new C2292yV();
        C2002u5 c2002u52 = new C2002u5(this, 7);
        this.l = c2002u52;
        c2002u52.T(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener R = c2002u52.R(keyListener);
        if (R == keyListener) {
            return;
        }
        super.setKeyListener(R);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    private C1475m5 getSuperCaller() {
        if (this.m == null) {
            this.m = new C1475m5(this);
        }
        return this.m;
    }

    @Override // o.InterfaceC1158hG
    public final C1510me a(C1510me c1510me) {
        return this.k.a(this, c1510me);
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2002u5 c2002u5;
        if (Build.VERSION.SDK_INT >= 28 || (c2002u5 = this.j) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2002u5.j;
        return textClassifier == null ? L5.a((TextView) c2002u5.i) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
    
        if (r3 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0113, code lost:
    
        if (r3 != null) goto L62;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] d;
        String[] stringArray;
        InputConnection c0462Rs;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.i.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i >= 30) {
                AbstractC0116Ej.a(editorInfo, text);
            } else {
                text.getClass();
                if (i >= 30) {
                    AbstractC0116Ej.a(editorInfo, text);
                } else {
                    int i2 = editorInfo.initialSelStart;
                    int i3 = editorInfo.initialSelEnd;
                    int i4 = i2 > i3 ? i3 : i2;
                    if (i2 <= i3) {
                        i2 = i3;
                    }
                    int length = text.length();
                    if (i4 < 0 || i2 > length) {
                        AbstractC1305jX.G(editorInfo, null, 0, 0);
                    } else {
                        int i5 = editorInfo.inputType & 4095;
                        if (i5 == 129 || i5 == 225 || i5 == 18) {
                            AbstractC1305jX.G(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            AbstractC1305jX.G(editorInfo, text, i4, i2);
                        } else {
                            int i6 = i2 - i4;
                            int i7 = i6 > 1024 ? 0 : i6;
                            int i8 = 2048 - i7;
                            int min = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
                            int min2 = Math.min(i4, i8 - min);
                            int i9 = i4 - min2;
                            if (Character.isLowSurrogate(text.charAt(i9))) {
                                i9++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
                                min--;
                            }
                            int i10 = min2 + i7;
                            AbstractC1305jX.G(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
                        }
                    }
                }
            }
        }
        AbstractC0048Bt.O(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i <= 30 && (d = AZ.d(this)) != null) {
            AbstractC1305jX.F(editorInfo, d);
            C1932t2 c1932t2 = new C1932t2(3, this);
            if (i >= 25) {
                c0462Rs = new C0436Qs(onCreateInputConnection, c1932t2);
            } else {
                String[] strArr = AbstractC1305jX.i;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        c0462Rs = new C0462Rs(onCreateInputConnection, c1932t2);
                    }
                }
            }
            onCreateInputConnection = c0462Rs;
        }
        return this.l.U(onCreateInputConnection, editorInfo);
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
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AZ.d(this) != null) {
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
                z = AbstractC2200x5.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC1312je interfaceC1312je;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AZ.d(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC1312je = new Y1(primaryClip, 1);
            } else {
                C1378ke c1378ke = new C1378ke(0);
                c1378ke.i = primaryClip;
                c1378ke.j = 1;
                interfaceC1312je = c1378ke;
            }
            interfaceC1312je.U(i == 16908322 ? 0 : 1);
            AZ.f(this, interfaceC1312je.mo8build());
        }
        return true;
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.i;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.i;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(PO.s(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.l.a0(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.l.R(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        C2002u5 c2002u5;
        if (Build.VERSION.SDK_INT >= 28 || (c2002u5 = this.j) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2002u5.j = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}
