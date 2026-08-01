package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class z9 extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public z9(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ba baVar = this.a.j;
        if (baVar != null) {
            baVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
