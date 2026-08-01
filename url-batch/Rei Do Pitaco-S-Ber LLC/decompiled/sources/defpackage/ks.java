package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ks extends m60 {
    public final int u;

    public ks(int i) {
        this.u = i;
    }

    @Override // defpackage.m60
    public final float B(z10 z10Var) {
        float[] fArr = ((ls) z10Var).G;
        if (fArr != null) {
            return fArr[this.u];
        }
        return 0.0f;
    }

    @Override // defpackage.m60
    public final void Y(z10 z10Var, float f) {
        ls lsVar = (ls) z10Var;
        float[] fArr = lsVar.G;
        if (fArr != null) {
            int i = this.u;
            if (fArr[i] != f) {
                fArr[i] = f;
                h hVar = lsVar.I;
                if (hVar != null) {
                    float i2 = lsVar.i();
                    MaterialButton materialButton = (MaterialButton) hVar.g;
                    int i3 = (int) (i2 * 0.11f);
                    if (materialButton.J != i3) {
                        materialButton.J = i3;
                        materialButton.w();
                        materialButton.invalidate();
                    }
                }
                lsVar.invalidateSelf();
            }
        }
    }
}
