package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class va0 extends ua0 {
    public io s;
    public io t;
    public io u;

    public va0(db0 db0Var, WindowInsets windowInsets) {
        super(db0Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.ab0
    public io j() {
        Insets mandatorySystemGestureInsets;
        if (this.t == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.t = io.d(mandatorySystemGestureInsets);
        }
        return this.t;
    }

    @Override // defpackage.ab0
    public io l() {
        Insets systemGestureInsets;
        if (this.s == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.s = io.d(systemGestureInsets);
        }
        return this.s;
    }

    @Override // defpackage.ab0
    public io n() {
        Insets tappableElementInsets;
        if (this.u == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.u = io.d(tappableElementInsets);
        }
        return this.u;
    }

    @Override // defpackage.sa0, defpackage.ab0
    public db0 q(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return db0.g(null, inset);
    }

    @Override // defpackage.ta0, defpackage.ab0
    public void w(io ioVar) {
    }
}
