package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class za0 extends ya0 {
    public za0(db0 db0Var, WindowInsets windowInsets) {
        super(db0Var, windowInsets);
    }

    @Override // defpackage.sa0, defpackage.ab0
    public List<Rect> e(int i) {
        List<Rect> boundingRects;
        boundingRects = this.c.getBoundingRects(cb0.a(i));
        return boundingRects;
    }

    @Override // defpackage.sa0, defpackage.ab0
    public List<Rect> f(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.c.getBoundingRectsIgnoringVisibility(cb0.a(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // defpackage.sa0, defpackage.ab0
    public void p() {
    }
}
