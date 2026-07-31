package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes14.dex */
public final class xk1 implements hg0 {
    public final w00 a;

    public xk1(w00 w00Var) {
        this.a = w00Var;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.media_container);
        if (extendedViewContainer != null) {
            w00 w00Var = this.a;
            if (w00Var.d == null && w00Var.a == null) {
                extendedViewContainer.setVisibility(8);
            }
        }
    }

    @Override // yads.hg0
    public final void c() {
    }
}
