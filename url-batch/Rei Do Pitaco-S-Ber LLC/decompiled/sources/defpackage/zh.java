package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class zh {
    public final /* synthetic */ bi a;

    public zh(bi biVar) {
        this.a = biVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        bi biVar = this.a;
        yh yhVar = biVar.A;
        if (biVar.x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = biVar.x;
        if (editText != null) {
            editText.removeTextChangedListener(yhVar);
            if (biVar.x.getOnFocusChangeListener() == biVar.b().e()) {
                biVar.x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        biVar.x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(yhVar);
        }
        biVar.b().l(biVar.x);
        biVar.k(biVar.b());
    }
}
