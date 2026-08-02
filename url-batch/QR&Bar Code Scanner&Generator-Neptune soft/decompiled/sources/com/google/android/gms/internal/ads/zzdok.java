package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdok implements zzbbq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdol zzb;

    zzdok(zzdol zzdolVar, String str) {
        this.zzb = zzdolVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final void zzc(zzbbp zzbbpVar) {
        Map map;
        zzdql zzdqlVar;
        zzdql zzdqlVar2;
        zzdql zzdqlVar3;
        zzdql zzdqlVar4;
        Map map2;
        zzdql zzdqlVar5;
        zzdql zzdqlVar6;
        zzdql zzdqlVar7;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbx)).booleanValue()) {
            if (zzbbpVar.zzj) {
                map = this.zzb.zzy;
                map.put(this.zza, true);
                zzdol zzdolVar = this.zzb;
                zzdqlVar = zzdolVar.zzo;
                View zzf = zzdqlVar.zzf();
                zzdqlVar2 = this.zzb.zzo;
                Map zzl = zzdqlVar2.zzl();
                zzdqlVar3 = this.zzb.zzo;
                zzdolVar.zzv(zzf, zzl, zzdqlVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzbbpVar.zzj) {
                zzdol zzdolVar2 = this.zzb;
                zzdqlVar4 = zzdolVar2.zzo;
                if (zzdqlVar4 == null) {
                    return;
                }
                map2 = zzdolVar2.zzy;
                map2.put(this.zza, true);
                zzdol zzdolVar3 = this.zzb;
                zzdqlVar5 = zzdolVar3.zzo;
                View zzf2 = zzdqlVar5.zzf();
                zzdqlVar6 = this.zzb.zzo;
                Map zzl2 = zzdqlVar6.zzl();
                zzdqlVar7 = this.zzb.zzo;
                zzdolVar3.zzv(zzf2, zzl2, zzdqlVar7.zzm(), true);
            }
        }
    }
}
