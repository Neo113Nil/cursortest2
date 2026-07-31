package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.internal.model.i3;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 extends s {
    public final VungleAdSize q;
    public VungleAdSize r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, VungleAdSize adSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.q = adSize;
    }

    public final j0 a(com.vungle.ads.internal.presenter.b adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        return new j0(adPlayCallback, this);
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return this.q;
    }

    public final VungleAdSize m() {
        return this.r;
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(i3 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.e() || placement.h() || placement.f();
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        if (vungleAdSize != null) {
            return vungleAdSize.isValidSize$vungle_ads_release();
        }
        return false;
    }

    @Override // com.vungle.ads.internal.s
    public final void a(com.vungle.ads.internal.model.h0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.a(advertisement);
        com.vungle.ads.internal.util.s e = e();
        Long a = e != null ? e.a() : null;
        if ((a != null && a.longValue() == 3) || (a != null && a.longValue() == 4)) {
            l();
        }
        if (this.q.getIsAdaptiveWidth() || this.q.getIsAdaptiveHeight()) {
            Pair a2 = com.vungle.ads.internal.util.a0.a(d());
            int intValue = ((Number) a2.component1()).intValue();
            int intValue2 = ((Number) a2.component2()).intValue();
            int d = this.q.getIsAdaptiveWidth() ? advertisement.d() : this.q.getWidth();
            int a3 = this.q.getIsAdaptiveHeight() ? advertisement.a() : this.q.getHeight();
            int min = Math.min(intValue, d);
            int min2 = Math.min(intValue2, a3);
            if (this.q.getIsAdaptiveHeight() && this.q.getHeight() > 0) {
                min2 = Math.min(this.q.getHeight(), min2);
            }
            this.r = new VungleAdSize(min, min2);
        }
    }
}
