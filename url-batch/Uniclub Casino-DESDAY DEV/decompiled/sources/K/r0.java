package K;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class r0 extends q0 {
    public r0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
    }

    @Override // K.u0
    public w0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f429c.consumeDisplayCutout();
        return w0.g(null, consumeDisplayCutout);
    }

    @Override // K.u0
    public C0009j e() {
        DisplayCutout displayCutout;
        displayCutout = this.f429c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0009j(displayCutout);
    }

    @Override // K.p0, K.u0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Objects.equals(this.f429c, r0Var.f429c) && Objects.equals(this.f432g, r0Var.f432g);
    }

    @Override // K.u0
    public int hashCode() {
        return this.f429c.hashCode();
    }
}
