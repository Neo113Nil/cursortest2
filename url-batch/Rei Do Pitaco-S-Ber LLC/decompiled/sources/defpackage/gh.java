package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class gh extends InputConnectionWrapper {
    public final TextView a;
    public final tg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        tg tgVar = new tg(18);
        this.a = textView;
        this.b = tgVar;
        if (ah.k != null) {
            ah a = ah.a();
            if (a.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            wg wgVar = a.e;
            wgVar.getClass();
            Bundle bundle = editorInfo.extras;
            ot otVar = (ot) wgVar.c.f;
            int a2 = otVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? ((ByteBuffer) otVar.d).getInt(a2 + otVar.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return tg.o(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return tg.o(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
