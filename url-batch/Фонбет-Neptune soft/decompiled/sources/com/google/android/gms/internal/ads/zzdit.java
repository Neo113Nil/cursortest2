package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdit implements zzaxw {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdiw zzb;

    zzdit(zzdiw zzdiwVar, String str) {
        this.zza = str;
        this.zzb = zzdiwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzdp(zzaxv zzaxvVar) {
        Map map;
        zzdkx zzdkxVar;
        zzdkx zzdkxVar2;
        zzdkx zzdkxVar3;
        zzdkx zzdkxVar4;
        Map map2;
        zzdkx zzdkxVar5;
        zzdkx zzdkxVar6;
        zzdkx zzdkxVar7;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbz)).booleanValue()) {
            if (zzaxvVar.zzj) {
                zzdiw zzdiwVar = this.zzb;
                String str = this.zza;
                map = zzdiwVar.zzx;
                map.put(str, true);
                zzdiw zzdiwVar2 = this.zzb;
                zzdkxVar = zzdiwVar2.zzn;
                View zzf = zzdkxVar.zzf();
                zzdkxVar2 = this.zzb.zzn;
                Map zzl = zzdkxVar2.zzl();
                zzdkxVar3 = this.zzb.zzn;
                zzdiwVar2.zzB(zzf, zzl, zzdkxVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzaxvVar.zzj) {
                zzdiw zzdiwVar3 = this.zzb;
                zzdkxVar4 = zzdiwVar3.zzn;
                if (zzdkxVar4 == null) {
                    return;
                }
                map2 = zzdiwVar3.zzx;
                map2.put(this.zza, true);
                zzdiw zzdiwVar4 = this.zzb;
                zzdkxVar5 = zzdiwVar4.zzn;
                View zzf2 = zzdkxVar5.zzf();
                zzdkxVar6 = this.zzb.zzn;
                Map zzl2 = zzdkxVar6.zzl();
                zzdkxVar7 = this.zzb.zzn;
                zzdiwVar4.zzB(zzf2, zzl2, zzdkxVar7.zzm(), true);
            }
        }
    }
}
