package R0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.J;
import com.football.transfertrivia.MainActivity;
import com.football.transfertrivia.ResultActivity;
import o1.AbstractC0302t;
import o1.AbstractC0308z;

/* renamed from: R0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0027a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f655b;

    public /* synthetic */ ViewOnClickListenerC0027a(int i, Object obj) {
        this.f654a = i;
        this.f655b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f655b;
        switch (this.f654a) {
            case 0:
                e eVar = (e) obj;
                EditText editText = eVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                eVar.q();
                return;
            case 1:
                ((k) obj).u();
                return;
            case 2:
                x xVar = (x) obj;
                EditText editText2 = xVar.f758f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = xVar.f758f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    xVar.f758f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    xVar.f758f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    xVar.f758f.setSelection(selectionEnd);
                }
                xVar.q();
                return;
            case 3:
                ((com.google.android.material.datepicker.m) obj).H();
                throw null;
            case 4:
                int i = MainActivity.f1746A;
                MainActivity mainActivity = (MainActivity) obj;
                AbstractC0302t.i(J.e(mainActivity), AbstractC0308z.f3346b, new s0.m(mainActivity, null));
                return;
            default:
                int i2 = ResultActivity.f1748C;
                ResultActivity resultActivity = (ResultActivity) obj;
                AbstractC0302t.i(J.e(resultActivity), AbstractC0308z.f3346b, new s0.v(resultActivity, null));
                return;
        }
    }
}
