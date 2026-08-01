package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ua0 extends ta0 {
    public ua0(db0 db0Var, WindowInsets windowInsets) {
        super(db0Var, windowInsets);
    }

    @Override // defpackage.ab0
    public db0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return db0.g(null, consumeDisplayCutout);
    }

    @Override // defpackage.sa0, defpackage.ab0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        return Objects.equals(this.c, ua0Var.c) && Objects.equals(this.g, ua0Var.g) && sa0.J(this.h, ua0Var.h);
    }

    @Override // defpackage.ab0
    public pf g() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new pf(displayCutout);
    }

    @Override // defpackage.ab0
    public int hashCode() {
        return this.c.hashCode();
    }
}
