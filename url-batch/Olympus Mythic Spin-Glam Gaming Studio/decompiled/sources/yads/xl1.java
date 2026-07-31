package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes14.dex */
public final class xl1 implements hg0 {
    public final kj1 a;

    public xl1(w00 w00Var) {
        this.a = new kj1(w00Var);
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        Float a = this.a.a();
        if (extendedViewContainer == null || a == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(iy.a(new sk2(Math.min(Math.max(a.floatValue(), 1.0f), 1.7777778f)), new xi1(viewGroup, 0.5f)));
    }

    @Override // yads.hg0
    public final void c() {
    }
}
