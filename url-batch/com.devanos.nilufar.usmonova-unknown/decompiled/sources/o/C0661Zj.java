package o;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: o.Zj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661Zj implements TextWatcher {
    public final EditText h;
    public C0635Yj i;
    public boolean j = true;

    public C0661Zj(EditText editText) {
        this.h = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0272Kj a = C0272Kj.a();
            if (editableText == null) {
                length = 0;
            } else {
                a.getClass();
                length = editableText.length();
            }
            a.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.h;
        if (editText.isInEditMode() || !this.j || C0272Kj.k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b = C0272Kj.a().b();
        if (b != 0) {
            if (b == 1) {
                C0272Kj.a().e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (b != 3) {
                return;
            }
        }
        C0272Kj a = C0272Kj.a();
        if (this.i == null) {
            this.i = new C0635Yj(editText);
        }
        a.f(this.i);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
