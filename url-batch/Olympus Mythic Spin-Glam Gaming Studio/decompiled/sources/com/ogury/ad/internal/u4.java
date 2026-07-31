package com.ogury.ad.internal;

import android.media.AudioManager;
import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class u4 {
    public final q0 a;
    public final y9 b;
    public final b c;

    public u4(q0 androidDevice, y9 orientationChangedCommand, b ad) {
        Intrinsics.checkNotNullParameter(androidDevice, "androidDevice");
        Intrinsics.checkNotNullParameter(orientationChangedCommand, "orientationChangedCommand");
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a = androidDevice;
        this.b = orientationChangedCommand;
        this.c = ad;
    }

    public final void a(w6 mraidCommandExecutor) {
        Intrinsics.checkNotNullParameter(mraidCommandExecutor, "mraidCommandExecutor");
        y7 y7Var = mraidCommandExecutor.a;
        int b = ib.b(y7Var.getWidth());
        int b2 = ib.b(y7Var.getHeight());
        int a = ib.a(y7Var.getX());
        int a2 = ib.a(y7Var.getY());
        this.b.a(mraidCommandExecutor);
        b bVar = this.c;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String placementType = bVar.x.b() ? "interstitial" : POBCommonConstants.BANNER_PLACEMENT_TYPE;
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        b8.a(mraidCommandExecutor.a, x6.b(placementType));
        b8.a(mraidCommandExecutor.a, x6.a(false));
        Object systemService = this.a.a.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        b8.a(mraidCommandExecutor.a, x6.a(((AudioManager) systemService).getStreamVolume(3)));
        b8.a(mraidCommandExecutor.a, "ogySdkMraidGateway.updateSupportFlags({sms: false, tel: false, calendar: false, storePicture: false, inlineVideo: false, vpaid: false, location: false})");
        b8.a(mraidCommandExecutor.a, x6.b(b, b2, a, a2));
        b8.a(mraidCommandExecutor.a, x6.a(b, b2, a, a2));
        b8.a(mraidCommandExecutor.a, x6.c(b, b2, a, a2));
        b8.a(mraidCommandExecutor.a, x6.a(b, b2));
        Intrinsics.checkNotNullParameter("default", "state");
        b8.a(mraidCommandExecutor.a, x6.c("default"));
        mraidCommandExecutor.a.setAdState("default");
    }
}
