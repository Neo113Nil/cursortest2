package B0;

import G0.j;
import G0.k;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f98b;

    public /* synthetic */ b(int i, Object obj) {
        this.f97a = i;
        this.f98b = obj;
    }

    private final void r0(int i) {
    }

    @Override // F1.d
    public final void U(int i) {
        switch (this.f97a) {
            case 0:
                break;
            default:
                k kVar = (k) this.f98b;
                kVar.d = true;
                j jVar = (j) kVar.f510e.get();
                if (jVar != null) {
                    f fVar = (f) jVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // F1.d
    public final void V(Typeface typeface, boolean z2) {
        switch (this.f97a) {
            case 0:
                Chip chip = (Chip) this.f98b;
                f fVar = chip.f2222e;
                chip.setText(fVar.C0 ? fVar.f110E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    k kVar = (k) this.f98b;
                    kVar.d = true;
                    j jVar = (j) kVar.f510e.get();
                    if (jVar != null) {
                        f fVar2 = (f) jVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
