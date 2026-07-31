package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class Cc implements Bc {
    @Override // com.ironsource.Bc
    public void a(@NotNull Activity activity, @NotNull K9 adInstance, @NotNull Map<String, String> showParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.Bc
    public boolean a(@NotNull K9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
