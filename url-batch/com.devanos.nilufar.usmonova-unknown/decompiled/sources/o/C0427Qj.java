package o;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* renamed from: o.Qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427Qj extends InputConnectionWrapper {
    public final EditText a;
    public final C0140Fh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0427Qj(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        C0140Fh c0140Fh = new C0140Fh(3);
        this.a = editText;
        this.b = c0140Fh;
        if (C0272Kj.k != null) {
            C0272Kj a = C0272Kj.a();
            if (a.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0168Gj c0168Gj = a.e;
            c0168Gj.getClass();
            Bundle bundle = editorInfo.extras;
            LC lc = (LC) c0168Gj.c.i;
            int a2 = lc.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? ((ByteBuffer) lc.k).getInt(a2 + lc.h) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C0140Fh.y(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return C0140Fh.y(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
