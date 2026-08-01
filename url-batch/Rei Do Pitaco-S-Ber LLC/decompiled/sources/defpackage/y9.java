package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class y9 extends oo {
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ y9(int i, Object obj) {
        this.o = i;
        this.p = obj;
    }

    @Override // defpackage.oo
    public final void B(int i) {
        switch (this.o) {
            case 0:
                break;
            default:
                s40 s40Var = (s40) this.p;
                s40Var.e = true;
                r40 r40Var = (r40) s40Var.f.get();
                if (r40Var != null) {
                    r40Var.a();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oo
    public final void D(Typeface typeface, boolean z) {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                ba baVar = chip.j;
                chip.setText(baVar.Q0 ? baVar.S : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    s40 s40Var = (s40) obj;
                    s40Var.e = true;
                    r40 r40Var = (r40) s40Var.f.get();
                    if (r40Var != null) {
                        r40Var.a();
                        break;
                    }
                }
                break;
        }
    }

    private final void V(int i) {
    }
}
