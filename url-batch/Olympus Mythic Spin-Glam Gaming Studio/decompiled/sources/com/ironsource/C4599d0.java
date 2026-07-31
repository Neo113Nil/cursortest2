package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4599d0 implements InterfaceC4581c0 {

    @NotNull
    private final Bc a;

    public C4599d0(@NotNull Bc networkShowApi) {
        Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC4581c0
    public void a(@NotNull Activity activity, @NotNull K9 adInstance) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC4581c0
    public boolean a(@NotNull K9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.a.a(adInstance);
    }
}
