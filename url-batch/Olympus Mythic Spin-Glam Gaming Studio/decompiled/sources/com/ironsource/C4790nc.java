package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.IronSourceNetwork;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4790nc implements InterfaceC4772mc {
    @Override // com.ironsource.InterfaceC4772mc
    public void a(@NotNull K9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            IronSourceNetwork.destroyAd(adInstance);
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.ADAPTER_API.verbose("destroy ad with identifier: " + adInstance.e() + " failed. error: " + e.getMessage());
        }
    }
}
