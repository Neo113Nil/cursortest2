package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.facebook.common.util.UriUtil;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdnk implements zzbjl {
    private final zzbha zza;
    private final zzdnx zzb;
    private final zzhpr zzc;

    public zzdnk(zzdje zzdjeVar, zzdiu zzdiuVar, zzdnx zzdnxVar, zzhpr zzhprVar) {
        this.zza = zzdjeVar.zzg(zzdiuVar.zzS());
        this.zzb = zzdnxVar;
        this.zzc = zzhprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(UriUtil.LOCAL_ASSET_SCHEME);
        try {
            this.zza.zze((zzbgq) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(sb2, e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}
