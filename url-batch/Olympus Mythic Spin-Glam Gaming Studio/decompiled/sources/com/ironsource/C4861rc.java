package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.rc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4861rc implements InterfaceC4844qc {
    @Override // com.ironsource.InterfaceC4844qc
    public void a(@NotNull Nc onNetworkSDKInitListener) {
        Intrinsics.checkNotNullParameter(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC4844qc
    public void b(@NotNull String controllerUrl) {
        Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC4844qc
    public void a(@NotNull Context applicationContext, @NotNull String applicationKey, @NotNull String userId, @NotNull Map<String, String> initParams) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(applicationKey, "applicationKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC4844qc
    public void a(@NotNull String controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.ironsource.InterfaceC4844qc
    public void a(int i) {
        SDKUtils.setDebugMode(i);
    }
}
