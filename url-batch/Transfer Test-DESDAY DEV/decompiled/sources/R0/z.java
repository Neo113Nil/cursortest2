package R0;

import K.T;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f768b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f769c;

    public z(TextInputLayout textInputLayout, EditText editText) {
        this.f769c = textInputLayout;
        this.f768b = editText;
        this.f767a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f769c;
        textInputLayout.u(!textInputLayout.f1993A0, false);
        if (textInputLayout.f2033k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2047s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f768b;
        int lineCount = editText.getLineCount();
        int i = this.f767a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = T.f372a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2050t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f767a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
