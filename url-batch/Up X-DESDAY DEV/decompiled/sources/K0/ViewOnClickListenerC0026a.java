package K0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: K0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0026a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f481b;

    public /* synthetic */ ViewOnClickListenerC0026a(int i, Object obj) {
        this.f480a = i;
        this.f481b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f480a) {
            case 0:
                C0030e c0030e = (C0030e) this.f481b;
                EditText editText = c0030e.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0030e.q();
                return;
            case 1:
                ((l) this.f481b).u();
                return;
            case 2:
                y yVar = (y) this.f481b;
                EditText editText2 = yVar.f585f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = yVar.f585f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    yVar.f585f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    yVar.f585f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    yVar.f585f.setSelection(selectionEnd);
                }
                yVar.q();
                return;
            default:
                ((com.google.android.material.datepicker.m) this.f481b).H();
                throw null;
        }
    }
}
