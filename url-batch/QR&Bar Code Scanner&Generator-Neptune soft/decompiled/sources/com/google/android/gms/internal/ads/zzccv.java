package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzccv implements RewardItem {
    private final zzcci zza;

    public zzccv(zzcci zzcciVar) {
        this.zza = zzcciVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzcci zzcciVar = this.zza;
        if (zzcciVar != null) {
            try {
                return zzcciVar.zze();
            } catch (RemoteException e) {
                zzcgp.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzcci zzcciVar = this.zza;
        if (zzcciVar != null) {
            try {
                return zzcciVar.zzf();
            } catch (RemoteException e) {
                zzcgp.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
