package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ig extends m60 {
    public final /* synthetic */ int u;

    public /* synthetic */ ig(int i) {
        this.u = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m60
    public final float B(z10 z10Var) {
        switch (this.u) {
            case 0:
                return ((View) z10Var).getAlpha();
            case 1:
                return ((View) z10Var).getScaleX();
            case 2:
                return ((View) z10Var).getScaleY();
            case 3:
                return ((View) z10Var).getRotation();
            case 4:
                return ((View) z10Var).getRotationX();
            default:
                return ((View) z10Var).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m60
    public final void Y(z10 z10Var, float f) {
        switch (this.u) {
            case 0:
                ((View) z10Var).setAlpha(f);
                break;
            case 1:
                ((View) z10Var).setScaleX(f);
                break;
            case 2:
                ((View) z10Var).setScaleY(f);
                break;
            case 3:
                ((View) z10Var).setRotation(f);
                break;
            case 4:
                ((View) z10Var).setRotationX(f);
                break;
            default:
                ((View) z10Var).setRotationY(f);
                break;
        }
    }
}
