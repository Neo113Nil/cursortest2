package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbn;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdql implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;

    private zzdql(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
    }

    public static zzdql zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        return new zzdql(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzchd) this.zza).zza();
        final String zzb = ((zzdxu) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzchs) this.zzc).zza();
        final zzbbn.zza.EnumC0070zza enumC0070zza = (zzbbn.zza.EnumC0070zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbbh zzbbhVar = new zzbbh(new zzbbm(zza));
        zzbbn.zzar.zza zzs = zzbbn.zzar.zzs();
        zzs.zzc(zza2.buddyApkVersion);
        zzs.zzg(zza2.clientJarVersion);
        zzs.zzk(true != zza2.isClientJar ? 2 : 0);
        final zzbbn.zzar zzbu = zzs.zzbu();
        zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzdqk
            @Override // com.google.android.gms.internal.ads.zzbbg
            public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar) {
                zzbbn.zza.zzb zzcc = zzaVar.zzY().zzcc();
                zzcc.zzc(zzbbn.zza.EnumC0070zza.this);
                zzaVar.zzaa(zzcc);
                zzbbn.zzm.zza zzcc2 = zzaVar.zzG().zzcc();
                zzcc2.zzd(zzb);
                zzcc2.zzs(zzbu);
                zzaVar.zzI(zzcc2);
                zzaVar.zzh(str);
            }
        });
        return zzbbhVar;
    }
}
