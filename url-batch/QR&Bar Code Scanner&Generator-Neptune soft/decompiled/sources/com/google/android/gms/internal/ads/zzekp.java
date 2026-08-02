package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzekp {
    private final zzfeu zza;
    private final zzdvi zzb;
    private final zzdxq zzc;
    private final zzfir zzd;

    public zzekp(zzfeu zzfeuVar, zzdvi zzdviVar, zzdxq zzdxqVar, zzfir zzfirVar) {
        this.zza = zzfeuVar;
        this.zzb = zzdviVar;
        this.zzc = zzdxqVar;
        this.zzd = zzfirVar;
    }

    public final void zza(zzfdn zzfdnVar, zzfdk zzfdkVar, int i, @Nullable zzehg zzehgVar, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhs)).booleanValue()) {
            zzfiq zzb = zzfiq.zzb("adapter_status");
            zzb.zzg(zzfdnVar);
            zzb.zzf(zzfdkVar);
            zzb.zza("adapter_l", String.valueOf(j));
            zzb.zza("sc", Integer.toString(i));
            if (zzehgVar != null) {
                zzb.zza("arec", Integer.toString(zzehgVar.zzb().zza));
                String zza = this.zza.zza(zzehgVar.getMessage());
                if (zza != null) {
                    zzb.zza("areec", zza);
                }
            }
            zzdvh zzb2 = this.zzb.zzb(zzfdkVar.zzu);
            if (zzb2 != null) {
                zzb.zza("ancn", zzb2.zza);
                zzbxq zzbxqVar = zzb2.zzb;
                if (zzbxqVar != null) {
                    zzb.zza("adapter_v", zzbxqVar.toString());
                }
                zzbxq zzbxqVar2 = zzb2.zzc;
                if (zzbxqVar2 != null) {
                    zzb.zza("adapter_sv", zzbxqVar2.toString());
                }
            }
            this.zzd.zzb(zzb);
            return;
        }
        zzdxp zza2 = this.zzc.zza();
        zza2.zze(zzfdnVar);
        zza2.zzd(zzfdkVar);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j));
        zza2.zzb("sc", Integer.toString(i));
        if (zzehgVar != null) {
            zza2.zzb("arec", Integer.toString(zzehgVar.zzb().zza));
            String zza3 = this.zza.zza(zzehgVar.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdvh zzb3 = this.zzb.zzb(zzfdkVar.zzu);
        if (zzb3 != null) {
            zza2.zzb("ancn", zzb3.zza);
            zzbxq zzbxqVar3 = zzb3.zzb;
            if (zzbxqVar3 != null) {
                zza2.zzb("adapter_v", zzbxqVar3.toString());
            }
            zzbxq zzbxqVar4 = zzb3.zzc;
            if (zzbxqVar4 != null) {
                zza2.zzb("adapter_sv", zzbxqVar4.toString());
            }
        }
        zza2.zzg();
    }
}
