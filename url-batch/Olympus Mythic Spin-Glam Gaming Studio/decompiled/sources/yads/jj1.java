package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes3.dex */
public final class jj1 implements hg0 {
    public final kj1 a;

    public jj1(w00 w00Var) {
        this.a = new kj1(w00Var);
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        Float a = this.a.a();
        if (extendedViewContainer == null || a == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new sk2(a.floatValue()));
    }

    @Override // yads.hg0
    public final void c() {
    }
}
