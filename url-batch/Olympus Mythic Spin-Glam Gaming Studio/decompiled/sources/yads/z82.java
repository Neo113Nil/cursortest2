package yads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes4.dex */
public final class z82 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final d92 a;

    public z82(d92 d92Var) {
        this.a = d92Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.a.a(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
