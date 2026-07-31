package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.MyTracker;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public interface NetworkConfigParams {
    @Nullable
    String getFromNetworkParams(@NonNull String str);

    @Nullable
    @Deprecated(since = MyTracker.VERSION)
    EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(@Nullable AdsFormat... adsFormatArr);

    @Nullable
    Map<String, List<Map<String, String>>> obtainNetworkMediationConfigs(@Nullable String... strArr);

    @NonNull
    Map<String, String> obtainNetworkParams();

    @Nullable
    String removeFromNetworkParams(@NonNull String str);
}
