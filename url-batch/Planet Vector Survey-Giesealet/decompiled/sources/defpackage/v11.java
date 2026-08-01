package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class v11 extends u11 {
    public oy o;
    public oy p;
    public oy q;

    public v11(d21 d21Var, WindowInsets windowInsets) {
        super(d21Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.z11
    public oy h() {
        Insets mandatorySystemGestureInsets;
        if (this.p == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.p = oy.d(mandatorySystemGestureInsets);
        }
        return this.p;
    }

    @Override // defpackage.z11
    public oy j() {
        Insets systemGestureInsets;
        if (this.o == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.o = oy.d(systemGestureInsets);
        }
        return this.o;
    }

    @Override // defpackage.z11
    public oy l() {
        Insets tappableElementInsets;
        if (this.q == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.q = oy.d(tappableElementInsets);
        }
        return this.q;
    }

    @Override // defpackage.s11, defpackage.z11
    public d21 m(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return d21.c(inset, null);
    }

    @Override // defpackage.t11, defpackage.z11
    public void s(oy oyVar) {
    }
}
