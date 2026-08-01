package M0;

import K.S;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f495c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f495c = textInputLayout;
        this.f494b = editText;
        this.f493a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f495c;
        textInputLayout.u(!textInputLayout.f1768A0, false);
        if (textInputLayout.f1807k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f1823s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f494b;
        int lineCount = editText.getLineCount();
        int i = this.f493a;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = S.f360a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f1826t0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f493a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
