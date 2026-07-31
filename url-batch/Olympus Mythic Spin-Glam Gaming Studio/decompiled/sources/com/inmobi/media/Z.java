package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Z {
    public final C4248p1 a;
    public final X b;
    public final C4274q1 c;
    public final AdConfig d;
    public final C4314rf e;
    public final Ok f;
    public final boolean g;

    public Z(C4248p1 adManagerComponent, Ac mediationSpecificConfig) {
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(mediationSpecificConfig, "mediationSpecificConfig");
        this.a = adManagerComponent;
        this.b = new X(adManagerComponent.d, adManagerComponent.f);
        C4274q1 c4274q1 = adManagerComponent.a;
        this.c = c4274q1;
        AdConfig adConfig = c4274q1.b;
        this.d = adConfig;
        this.e = new C4367tf(adManagerComponent.b, adManagerComponent.c).a();
        Integer num = mediationSpecificConfig.d;
        long intValue = num != null ? num.intValue() : 15000;
        Integer num2 = mediationSpecificConfig.d;
        this.f = new Ok(intValue, num2 != null ? num2.intValue() : 15000, mediationSpecificConfig.d != null ? r11.intValue() : 15000);
        this.g = adConfig.getApplyGzipReq();
    }

    public final Object a(X6 x6) {
        C4493y9 c4493y9 = this.a.c;
        if (c4493y9 != null) {
            c4493y9.a("AdFetchManager", "fetchAd Called");
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        C3868ah c3868ah = this.c.a;
        Map map = c3868ah.d;
        long j = c3868ah.a;
        Context context = this.a.b;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = context instanceof Activity ? "activity" : "others";
        this.c.getClass();
        return new C4508yo(new C4247p0(this.d.getUrl(), new Zk(this.d.getIncludeIds()), new C4194n0(uuid, map, j, str, "native", MapsKt.emptyMap(), this.c.a.c, this.d.getRendering().getEnablePubMuteControl() && AbstractC4002fj.f), this.f, this.e, this.a.c, this.g).a(), this.a.c).a(new Function1() { // from class: com.inmobi.media.Z$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Z.a(Z.this, (W) obj);
            }
        }, x6);
    }

    public static final Unit a(Z z, W adFetchEvent) {
        Intrinsics.checkNotNullParameter(adFetchEvent, "adFetchEvent");
        C4493y9 c4493y9 = z.a.c;
        if (c4493y9 != null) {
            c4493y9.a("AdFetchManager", "adFetchEvent " + adFetchEvent);
        }
        z.b.a(adFetchEvent);
        return Unit.INSTANCE;
    }
}
