package P0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f954a;

    public m(p pVar) {
        this.f954a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f954a;
        if (pVar.f975s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f975s;
        l lVar = pVar.f978v;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (pVar.f975s.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f975s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f975s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        pVar.b().m(pVar.f975s);
        pVar.j(pVar.b());
    }
}
