package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Struct;

/* loaded from: classes10.dex */
public interface NetworkParams {
    @Nullable
    Struct getExt(@NonNull Context context);

    @NonNull
    String getNetworkKey();

    @NonNull
    String getNetworkName();
}
