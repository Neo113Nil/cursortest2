package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwj;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzfb extends com.google.android.gms.ads.preload.zzb {
    public zzfb(Context context) {
        super(context, AdFormat.REWARDED);
    }

    public final RewardedAd zza(String str) {
        zzbwa zzbwaVar;
        try {
            zzbwaVar = this.zza.zzq(str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbwaVar = null;
        }
        if (zzbwaVar == null) {
            return null;
        }
        return new zzbwj(zzj(), zzbwaVar);
    }
}
