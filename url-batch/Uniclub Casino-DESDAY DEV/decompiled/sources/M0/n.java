package M0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f536a;

    public n(q qVar) {
        this.f536a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f536a;
        if (qVar.f557s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f557s;
        m mVar = qVar.f560v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f557s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f557s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f557s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f557s);
        qVar.j(qVar.b());
    }
}
