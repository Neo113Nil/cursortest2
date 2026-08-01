package P0;

import K.T;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f1033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f1034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f1035c;

    public z(TextInputLayout textInputLayout, EditText editText) {
        this.f1035c = textInputLayout;
        this.f1034b = editText;
        this.f1033a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f1035c;
        textInputLayout.u(!textInputLayout.f2359A0, false);
        if (textInputLayout.f2399k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2413s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f1034b;
        int lineCount = editText.getLineCount();
        int i = this.f1033a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = T.f633a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2416t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f1033a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
