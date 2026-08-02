package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdsy implements zzbpu {
    private final zzbni zza;
    private final zzdtn zzb;
    private final zzgxc zzc;

    public zzdsy(zzdpb zzdpbVar, zzdoq zzdoqVar, zzdtn zzdtnVar, zzgxc zzgxcVar) {
        this.zza = zzdpbVar.zzc(zzdoqVar.zzy());
        this.zzb = zzdtnVar;
        this.zzc = zzgxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbmy) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzi("/nativeAdCustomClick", this);
    }
}
