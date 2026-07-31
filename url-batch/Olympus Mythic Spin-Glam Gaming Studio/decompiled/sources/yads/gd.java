package yads;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes5.dex */
public final class gd implements hg0 {
    public final w00 a;

    public gd(w00 w00Var) {
        this.a = w00Var;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(R$id.age_divider);
        if (findViewById == null || this.a.f != null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // yads.hg0
    public final void c() {
    }
}
