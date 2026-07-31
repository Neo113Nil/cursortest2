package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes9.dex */
public final class no1 {
    public static Map a(yn1 yn1Var) {
        MediatedAdapterInfo b = yn1Var.b();
        String str = b.getCom.ironsource.Qf.b java.lang.String();
        String str2 = POBCommonConstants.NULL_VALUE;
        if (str == null) {
            str = POBCommonConstants.NULL_VALUE;
        }
        Pair pair = TuplesKt.to("mediation_adapter_version", str);
        String networkName = b.getNetworkName();
        if (networkName == null) {
            networkName = POBCommonConstants.NULL_VALUE;
        }
        Pair pair2 = TuplesKt.to("mediation_network_name", networkName);
        String networkSdkVersion = b.getNetworkSdkVersion();
        if (networkSdkVersion != null) {
            str2 = networkSdkVersion;
        }
        return MapsKt.mapOf(pair, pair2, TuplesKt.to("mediation_network_sdk_version", str2));
    }
}
