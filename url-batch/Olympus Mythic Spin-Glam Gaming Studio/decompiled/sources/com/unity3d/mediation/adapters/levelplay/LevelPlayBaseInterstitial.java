package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import com.ironsource.InterfaceC4870s3;
import com.ironsource.mediationsdk.adunit.adapter.BaseInterstitial;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class LevelPlayBaseInterstitial<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseInterstitial<NetworkAdapter> implements InterfaceC4870s3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseInterstitial(@NotNull NetworkSettings networkSettings) {
        super(networkSettings);
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
    }

    @Override // com.ironsource.InterfaceC4870s3
    public void collectBiddingData(@Nullable AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
    }
}
