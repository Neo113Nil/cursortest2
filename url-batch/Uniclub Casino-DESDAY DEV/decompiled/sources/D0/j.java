package D0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class j extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f154b;

    public /* synthetic */ j(int i, Object obj) {
        this.f153a = i;
        this.f154b = obj;
    }

    private final void w0(int i) {
    }

    @Override // q1.l
    public final void d0(int i) {
        switch (this.f153a) {
            case 0:
                l lVar = (l) this.f154b;
                lVar.d = true;
                k kVar = (k) lVar.f158e.get();
                if (kVar != null) {
                    y0.e eVar = (y0.e) kVar;
                    eVar.u();
                    eVar.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // q1.l
    public final void e0(Typeface typeface, boolean z2) {
        switch (this.f153a) {
            case 0:
                if (!z2) {
                    l lVar = (l) this.f154b;
                    lVar.d = true;
                    k kVar = (k) lVar.f158e.get();
                    if (kVar != null) {
                        y0.e eVar = (y0.e) kVar;
                        eVar.u();
                        eVar.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f154b;
                y0.e eVar2 = chip.f1628e;
                chip.setText(eVar2.f4155C0 ? eVar2.f4158E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }
}
