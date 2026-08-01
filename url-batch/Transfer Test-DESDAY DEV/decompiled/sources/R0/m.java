package R0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f688a;

    public m(p pVar) {
        this.f688a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f688a;
        if (pVar.f709s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f709s;
        l lVar = pVar.f712v;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (pVar.f709s.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f709s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f709s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        pVar.b().m(pVar.f709s);
        pVar.j(pVar.b());
    }
}
