package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class t40 implements TextWatcher {
    public int f;
    public final /* synthetic */ EditText g;
    public final /* synthetic */ TextInputLayout h;

    public t40(TextInputLayout textInputLayout, EditText editText) {
        this.h = textInputLayout;
        this.g = editText;
        this.f = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.h;
        textInputLayout.w(!textInputLayout.G0, false);
        if (textInputLayout.q) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.y) {
            textInputLayout.x(editable);
        }
        EditText editText = this.g;
        int lineCount = editText.getLineCount();
        int i = this.f;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.z0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
