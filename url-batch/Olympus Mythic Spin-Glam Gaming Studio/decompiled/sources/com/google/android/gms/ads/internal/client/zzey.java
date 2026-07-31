package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdj;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzey extends com.google.android.gms.ads.preload.zzb {
    public zzey(Context context) {
        super(context, AdFormat.REWARDED);
    }

    @Nullable
    public final RewardedAd zza(String str) {
        zzcda zzcdaVar;
        try {
            zzcdaVar = this.zza.zzq(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzcdaVar = null;
        }
        if (zzcdaVar == null) {
            return null;
        }
        return new zzcdj(zzj(), zzcdaVar);
    }
}
