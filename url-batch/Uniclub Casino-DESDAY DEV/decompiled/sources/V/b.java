package V;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f769a;

    /* renamed from: b, reason: collision with root package name */
    public final J0.e f770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        J0.e eVar = new J0.e(10);
        this.f769a = editText;
        this.f770b = eVar;
        if (T.j.f723k != null) {
            T.j a2 = T.j.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            T.f fVar = a2.f727e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            U.b bVar = (U.b) fVar.f718c.f750a;
            int a3 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) bVar.d).getInt(a3 + bVar.f350a) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f716a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f769a.getEditableText();
        this.f770b.getClass();
        return J0.e.l(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f769a.getEditableText();
        this.f770b.getClass();
        return J0.e.l(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
