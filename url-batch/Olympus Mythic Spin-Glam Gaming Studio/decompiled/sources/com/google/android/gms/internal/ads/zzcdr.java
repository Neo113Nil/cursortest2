package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcdr extends zzccw {
    private final String zza;
    private final int zzb;

    public zzcdr(@Nullable RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzf() throws RemoteException {
        return this.zzb;
    }

    public zzcdr(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
