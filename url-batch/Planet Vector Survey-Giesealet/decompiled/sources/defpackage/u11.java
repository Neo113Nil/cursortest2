package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class u11 extends t11 {
    public u11(d21 d21Var, WindowInsets windowInsets) {
        super(d21Var, windowInsets);
    }

    @Override // defpackage.z11
    public d21 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return d21.c(consumeDisplayCutout, null);
    }

    @Override // defpackage.z11
    public xm e() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new xm(displayCutout);
    }

    @Override // defpackage.s11, defpackage.z11
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u11)) {
            return false;
        }
        u11 u11Var = (u11) obj;
        return Objects.equals(this.c, u11Var.c) && Objects.equals(this.g, u11Var.g) && s11.B(this.h, u11Var.h);
    }

    @Override // defpackage.z11
    public int hashCode() {
        return this.c.hashCode();
    }
}
