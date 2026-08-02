package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcib extends zzexi {
    private final zzeww zza;
    private final zzcif zzb;
    private final zzhfl zzc;
    private final zzhfl zzd;
    private final zzhfl zze;
    private final zzhfl zzf;
    private final zzhfl zzg;
    private final zzhfl zzh;
    private final zzhfl zzi;
    private final zzhfl zzj;
    private final zzhfl zzk;
    private final zzhfl zzl;
    private final zzhfl zzm;

    /* synthetic */ zzcib(zzcif zzcifVar, zzeww zzewwVar, zzcia zzciaVar) {
        zzhfl zzhflVar;
        zzhfl zzhflVar2;
        zzhfl zzhflVar3;
        this.zzb = zzcifVar;
        this.zza = zzewwVar;
        zzhflVar = zzcifVar.zzz;
        this.zzc = zzhfb.zzc(new zzfkg(zzhflVar));
        zzexe zzexeVar = new zzexe(zzewwVar);
        this.zzd = zzexeVar;
        zzhfl zzc = zzhfb.zzc(zzdrf.zza());
        this.zze = zzc;
        zzhfl zzc2 = zzhfb.zzc(zzdrd.zza());
        this.zzf = zzc2;
        zzhfl zzc3 = zzhfb.zzc(zzdrh.zza());
        this.zzg = zzc3;
        zzhfl zzc4 = zzhfb.zzc(zzdrj.zza());
        this.zzh = zzc4;
        zzhff zzc5 = zzhfg.zzc(4);
        zzc5.zzb(zzfjf.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfjf.BUILD_URL, zzc2);
        zzc5.zzb(zzfjf.HTTP, zzc3);
        zzc5.zzb(zzfjf.PRE_PROCESS, zzc4);
        zzhfg zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzhflVar2 = zzcifVar.zzh;
        zzhfl zzc7 = zzhfb.zzc(new zzdrk(zzexeVar, zzhflVar2, zzfig.zza(), zzc6));
        this.zzj = zzc7;
        zzhfp zza = zzhfq.zza(0, 1);
        zza.zza(zzc7);
        zzhfq zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzfjo zzfjoVar = new zzfjo(zzc8);
        this.zzl = zzfjoVar;
        zzfig zza2 = zzfig.zza();
        zzhflVar3 = zzcifVar.zze;
        this.zzm = zzhfb.zzc(new zzfjn(zza2, zzhflVar3, zzfjoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzexi
    public final zzevr zza() {
        zzcgm zzcgmVar;
        zzhfl zzhflVar;
        zzhfl zzhflVar2;
        zzcgm zzcgmVar2;
        zzhfl zzhflVar3;
        zzcgm zzcgmVar3;
        zzhfl zzhflVar4;
        zzhfl zzhflVar5;
        zzhfl zzhflVar6;
        zzcgm zzcgmVar4;
        zzcgm zzcgmVar5;
        zzhfl zzhflVar7;
        zzhfl zzhflVar8;
        zzhfl zzhflVar9;
        zzhfl zzhflVar10;
        zzhfl zzhflVar11;
        zzhfl zzhflVar12;
        zzcgmVar = this.zzb.zza;
        Context zzb = zzcgmVar.zzb();
        zzhfk.zzb(zzb);
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        zzbys zzbysVar = new zzbys();
        zzgcu zzgcuVar2 = zzbzo.zza;
        zzhfk.zzb(zzgcuVar2);
        zzeyd zzeydVar = new zzeyd(zzbysVar, zzgcuVar2, zzewx.zza(this.zza));
        zzeto zza = zzetq.zza();
        zzhflVar = this.zzb.zze;
        zzevo zza2 = zzeyz.zza(zzeydVar, zza, (ScheduledExecutorService) zzhflVar.zzb(), 0);
        zzbsr zzbsrVar = new zzbsr();
        zzhflVar2 = this.zzb.zze;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhflVar2.zzb();
        zzcgmVar2 = this.zzb.zza;
        Context zzb2 = zzcgmVar2.zzb();
        zzhfk.zzb(zzb2);
        zzeyn zzeynVar = new zzeyn(zzbsrVar, scheduledExecutorService, zzb2);
        zzhflVar3 = this.zzb.zze;
        zzevo zzb3 = zzeyz.zzb(zzeynVar, (ScheduledExecutorService) zzhflVar3.zzb());
        zzbyv zzbyvVar = new zzbyv();
        zzcgmVar3 = this.zzb.zza;
        Context zzb4 = zzcgmVar3.zzb();
        zzhfk.zzb(zzb4);
        zzhflVar4 = this.zzb.zze;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzhflVar4.zzb();
        zzgcu zzgcuVar3 = zzbzo.zza;
        zzhfk.zzb(zzgcuVar3);
        zzeww zzewwVar = this.zza;
        zzewo zza3 = zzewq.zza(zzbyvVar, zzb4, scheduledExecutorService2, zzgcuVar3, zzewy.zza(zzewwVar), zzexa.zza(zzewwVar), zzexb.zza(zzewwVar));
        zzhflVar5 = this.zzb.zze;
        zzevo zza4 = zzeza.zza(zza3, (ScheduledExecutorService) zzhflVar5.zzb());
        zzgcu zzgcuVar4 = zzbzo.zza;
        zzhfk.zzb(zzgcuVar4);
        zzezi zzeziVar = new zzezi(zzgcuVar4);
        zzhflVar6 = this.zzb.zze;
        zzevo zzc = zzeyz.zzc(zzeziVar, (ScheduledExecutorService) zzhflVar6.zzb());
        zzeyx zzeyxVar = new zzeyx();
        zzbak zzbakVar = new zzbak();
        zzgcu zzgcuVar5 = zzbzo.zza;
        zzhfk.zzb(zzgcuVar5);
        zzcgmVar4 = this.zzb.zza;
        Context zzb5 = zzcgmVar4.zzb();
        zzhfk.zzb(zzb5);
        zzexv zzexvVar = new zzexv(zzbakVar, zzgcuVar5, zzb5);
        zzbbf zzbbfVar = new zzbbf();
        zzgcu zzgcuVar6 = zzbzo.zza;
        zzhfk.zzb(zzgcuVar6);
        zzbyv zzbyvVar2 = new zzbyv();
        zzgcu zzgcuVar7 = zzbzo.zza;
        zzhfk.zzb(zzgcuVar7);
        zzeww zzewwVar2 = this.zza;
        zzbyv zzbyvVar3 = new zzbyv();
        zzeww zzewwVar3 = this.zza;
        zzcif zzcifVar = this.zzb;
        int zza5 = zzewy.zza(zzewwVar3);
        zzcgmVar5 = zzcifVar.zza;
        Context zzb6 = zzcgmVar5.zzb();
        zzhfk.zzb(zzb6);
        zzhflVar7 = this.zzb.zzae;
        zzbze zzbzeVar = (zzbze) zzhflVar7.zzb();
        zzhflVar8 = this.zzb.zze;
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) zzhflVar8.zzb();
        zzgcu zzgcuVar8 = zzbzo.zza;
        zzhfk.zzb(zzgcuVar8);
        zzhflVar9 = this.zzb.zzaL;
        String zza6 = zzewx.zza(this.zza);
        zzazy zzazyVar = new zzazy();
        zzhflVar10 = this.zzb.zzae;
        zzbze zzbzeVar2 = (zzbze) zzhflVar10.zzb();
        zzhflVar11 = this.zzb.zze;
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) zzhflVar11.zzb();
        zzgcu zzgcuVar9 = zzbzo.zza;
        zzhfk.zzb(zzgcuVar9);
        zzfxw zzs = zzfxw.zzs(zza2, zzb3, zza4, zzc, zzeyxVar, zzexvVar, new zzeyh(zzbbfVar, zzgcuVar6, zzewz.zza(this.zza)), new zzewu(zzbyvVar2, zzgcuVar7, zzexc.zza(zzewwVar2), zzexd.zza(zzewwVar2), zzewy.zza(zzewwVar2)), new zzexr(zzbyvVar3, zza5, zzb6, zzbzeVar, scheduledExecutorService3, zzgcuVar8, zzewx.zza(this.zza)), (zzevo) zzhflVar9.zzb(), zzexn.zza(zza6, zzazyVar, zzbzeVar2, scheduledExecutorService4, zzgcuVar9));
        zzfkf zzfkfVar = (zzfkf) this.zzc.zzb();
        zzhflVar12 = this.zzb.zzM;
        return new zzevr(zzb, zzgcuVar, zzs, zzfkfVar, (zzdsk) zzhflVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzexi
    public final zzfjl zzb() {
        return (zzfjl) this.zzm.zzb();
    }
}
