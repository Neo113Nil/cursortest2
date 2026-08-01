package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class z00 implements a10 {
    public final ScrollFeedbackProvider f;

    public z00(NestedScrollView nestedScrollView) {
        this.f = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.a10
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.a10
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f.onScrollProgress(i, i2, i3, i4);
    }
}
