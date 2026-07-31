package io.bidmachine.ads.networks.nast;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"Lio/bidmachine/ads/networks/nast/NastConfig;", "Lio/bidmachine/NetworkConfig;", "()V", "createNetworkAdapter", "Lio/bidmachine/NetworkAdapter;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class NastConfig extends NetworkConfig {
    public NastConfig() {
        super(NastAdapter.KEY, null);
    }

    @Override // io.bidmachine.NetworkConfig
    @NotNull
    protected NetworkAdapter createNetworkAdapter() {
        return new NastAdapter();
    }
}
