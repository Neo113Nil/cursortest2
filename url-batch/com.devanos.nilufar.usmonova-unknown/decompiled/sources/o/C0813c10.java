package o;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: o.c10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0813c10 extends C0748b10 {
    public C0813c10(C1142h10 c1142h10, WindowInsets windowInsets) {
        super(c1142h10, windowInsets);
    }

    @Override // o.C1010f10
    public C1142h10 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return C1142h10.c(consumeDisplayCutout, null);
    }

    @Override // o.C1010f10
    public C0167Gi e() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0167Gi(displayCutout);
    }

    @Override // o.AbstractC0682a10, o.C1010f10
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0813c10)) {
            return false;
        }
        C0813c10 c0813c10 = (C0813c10) obj;
        return Objects.equals(this.c, c0813c10.c) && Objects.equals(this.g, c0813c10.g);
    }

    @Override // o.C1010f10
    public int hashCode() {
        return this.c.hashCode();
    }
}
