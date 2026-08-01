package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class dw extends ci {
    public final int e;
    public EditText f;
    public final ja g;

    public dw(bi biVar, int i) {
        super(biVar);
        this.e = R.drawable.design_password_eye;
        this.g = new ja(5, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.ci
    public final void b() {
        p();
    }

    @Override // defpackage.ci
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.ci
    public final int d() {
        return this.e;
    }

    @Override // defpackage.ci
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.ci
    public final boolean j() {
        return true;
    }

    @Override // defpackage.ci
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.ci
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.ci
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.ci
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
