package M0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.fortuneodd.shadegrid.R;

/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f605e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f606f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f607g;

    public y(q qVar, int i) {
        super(qVar);
        this.f605e = R.drawable.design_password_eye;
        this.f607g = new ViewOnClickListenerC0025a(2, this);
        if (i != 0) {
            this.f605e = i;
        }
    }

    @Override // M0.r
    public final void b() {
        q();
    }

    @Override // M0.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // M0.r
    public final int d() {
        return this.f605e;
    }

    @Override // M0.r
    public final View.OnClickListener f() {
        return this.f607g;
    }

    @Override // M0.r
    public final boolean k() {
        return true;
    }

    @Override // M0.r
    public final boolean l() {
        EditText editText = this.f606f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // M0.r
    public final void m(EditText editText) {
        this.f606f = editText;
        q();
    }

    @Override // M0.r
    public final void r() {
        EditText editText = this.f606f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f606f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // M0.r
    public final void s() {
        EditText editText = this.f606f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
