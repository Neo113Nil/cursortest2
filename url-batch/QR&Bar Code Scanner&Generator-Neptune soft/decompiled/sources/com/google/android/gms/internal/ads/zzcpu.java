package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcpu extends zzevw {
    private final zzgxv zzA;
    private final zzexi zza;
    private final zzcpw zzb;
    private final zzcpu zzc = this;
    private final zzgxv zzd;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;
    private final zzgxv zzi;
    private final zzgxv zzj;
    private final zzgxv zzk;
    private final zzgxv zzl;
    private final zzgxv zzm;
    private final zzgxv zzn;
    private final zzgxv zzo;
    private final zzgxv zzp;
    private final zzgxv zzq;
    private final zzgxv zzr;
    private final zzgxv zzs;
    private final zzgxv zzt;
    private final zzgxv zzu;
    private final zzgxv zzv;
    private final zzgxv zzw;
    private final zzgxv zzx;
    private final zzgxv zzy;
    private final zzgxv zzz;

    /* synthetic */ zzcpu(zzcpw zzcpwVar, zzexi zzexiVar, zzcpt zzcptVar) {
        zzgxv zzgxvVar;
        zzctp zzctpVar;
        zzgxv zzgxvVar2;
        zzgxv zzgxvVar3;
        zzcpg zzcpgVar;
        zzgxv zzgxvVar4;
        zzctp zzctpVar2;
        zzgxv zzgxvVar5;
        zzgxv zzgxvVar6;
        zzgxv zzgxvVar7;
        zzctj zzctjVar;
        zzgxv zzgxvVar8;
        zzctl zzctlVar;
        zzctn zzctnVar;
        zzgxv zzgxvVar9;
        zzgxv zzgxvVar10;
        zzgxv zzgxvVar11;
        zzctr zzctrVar;
        zzgxv zzgxvVar12;
        zzcth zzcthVar;
        zzgxv zzgxvVar13;
        zzgxv zzgxvVar14;
        zzgxv zzgxvVar15;
        zzgxv zzgxvVar16;
        this.zzb = zzcpwVar;
        this.zza = zzexiVar;
        zzgxvVar = zzcpwVar.zzF;
        this.zzd = zzgxh.zzc(new zzfjv(zzgxvVar));
        zzexk zzexkVar = new zzexk(zzexiVar);
        this.zze = zzexkVar;
        zzctpVar = zzcto.zza;
        zzgxvVar2 = zzcpwVar.zzh;
        zzgxvVar3 = zzcpwVar.zzn;
        this.zzf = new zzevv(zzctpVar, zzgxvVar2, zzgxvVar3, zzfhc.zza(), zzexkVar);
        zzexj zzexjVar = new zzexj(zzexiVar);
        this.zzg = zzexjVar;
        zzcpgVar = zzcpf.zza;
        zzgxvVar4 = zzcpwVar.zzh;
        this.zzh = new zzewe(zzcpgVar, zzgxvVar4, zzexjVar, zzfhc.zza());
        zzctpVar2 = zzcto.zza;
        zzgxvVar5 = zzcpwVar.zzh;
        zzgxvVar6 = zzcpwVar.zzad;
        zzgxvVar7 = zzcpwVar.zzn;
        this.zzi = new zzewp(zzctpVar2, zzexkVar, zzgxvVar5, zzgxvVar6, zzgxvVar7, zzfhc.zza(), zzexjVar);
        zzctjVar = zzcti.zza;
        zzfhc zza = zzfhc.zza();
        zzgxvVar8 = zzcpwVar.zzh;
        this.zzj = new zzewt(zzctjVar, zza, zzgxvVar8);
        zzctlVar = zzctk.zza;
        this.zzk = new zzexa(zzctlVar, zzfhc.zza(), zzexjVar);
        zzctnVar = zzctm.zza;
        zzgxvVar9 = zzcpwVar.zzn;
        zzgxvVar10 = zzcpwVar.zzh;
        this.zzl = new zzexh(zzctnVar, zzgxvVar9, zzgxvVar10);
        this.zzm = new zzexz(zzfhc.zza());
        zzexl zzexlVar = new zzexl(zzexiVar);
        this.zzn = zzexlVar;
        zzexm zzexmVar = new zzexm(zzexiVar);
        this.zzo = zzexmVar;
        zzgxvVar11 = zzcpwVar.zzad;
        zzctrVar = zzctq.zza;
        zzfhc zza2 = zzfhc.zza();
        zzgxvVar12 = zzcpwVar.zzn;
        this.zzp = new zzexv(zzgxvVar11, zzexlVar, zzexmVar, zzctrVar, zza2, zzexjVar, zzgxvVar12);
        zzcthVar = zzctg.zza;
        zzgxvVar13 = zzcpwVar.zzad;
        zzgxvVar14 = zzcpwVar.zzn;
        this.zzq = new zzewj(zzexjVar, zzcthVar, zzgxvVar13, zzgxvVar14, zzfhc.zza());
        zzexn zzexnVar = new zzexn(zzexiVar);
        this.zzr = zzexnVar;
        zzgxv zzc = zzgxh.zzc(zzdwp.zza());
        this.zzs = zzc;
        zzgxv zzc2 = zzgxh.zzc(zzdwn.zza());
        this.zzt = zzc2;
        zzgxv zzc3 = zzgxh.zzc(zzdwr.zza());
        this.zzu = zzc3;
        zzgxv zzc4 = zzgxh.zzc(zzdwt.zza());
        this.zzv = zzc4;
        zzgxl zzc5 = zzgxm.zzc(4);
        zzc5.zzb(zzfib.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfib.BUILD_URL, zzc2);
        zzc5.zzb(zzfib.HTTP, zzc3);
        zzc5.zzb(zzfib.PRE_PROCESS, zzc4);
        zzgxm zzc6 = zzc5.zzc();
        this.zzw = zzc6;
        zzgxvVar15 = zzcpwVar.zzh;
        zzgxv zzc7 = zzgxh.zzc(new zzdwu(zzexnVar, zzgxvVar15, zzfhc.zza(), zzc6));
        this.zzx = zzc7;
        zzgxs zza3 = zzgxt.zza(0, 1);
        zza3.zza(zzc7);
        zzgxt zzc8 = zza3.zzc();
        this.zzy = zzc8;
        zzfik zzfikVar = new zzfik(zzc8);
        this.zzz = zzfikVar;
        zzfhc zza4 = zzfhc.zza();
        zzgxvVar16 = zzcpwVar.zzn;
        this.zzA = zzgxh.zzc(new zzfij(zza4, zzgxvVar16, zzfikVar));
    }

    private final zzevz zze() {
        zzcfp zzcfpVar = new zzcfp();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        String zzd = this.zza.zzd();
        zzgxq.zzb(zzd);
        return new zzevz(zzcfpVar, zzfzqVar, zzd, this.zza.zzb(), this.zza.zza(), null);
    }

    private final zzexc zzf() {
        zzbin zzbinVar = new zzbin();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        List zzf = this.zza.zzf();
        zzgxq.zzb(zzf);
        return new zzexc(zzbinVar, zzfzqVar, zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzevw
    public final zzevh zza() {
        zzcop zzcopVar;
        zzgxv zzgxvVar;
        zzgxv zzgxvVar2;
        zzcopVar = this.zzb.zza;
        Context zza = zzcopVar.zza();
        zzgxq.zzb(zza);
        zzcfm zzcfmVar = new zzcfm();
        zzcfn zzcfnVar = new zzcfn();
        zzgxvVar = this.zzb.zzaD;
        Object zzb = zzgxvVar.zzb();
        zzevz zze = zze();
        zzexc zzf = zzf();
        zzgxc zza2 = zzgxh.zza(this.zzf);
        zzgxc zza3 = zzgxh.zza(this.zzh);
        zzgxc zza4 = zzgxh.zza(this.zzi);
        zzgxc zza5 = zzgxh.zza(this.zzj);
        zzgxc zza6 = zzgxh.zza(this.zzk);
        zzgxc zza7 = zzgxh.zza(this.zzl);
        zzgxc zza8 = zzgxh.zza(this.zzm);
        zzgxc zza9 = zzgxh.zza(this.zzp);
        zzgxc zza10 = zzgxh.zza(this.zzq);
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        zzfju zzfjuVar = (zzfju) this.zzd.zzb();
        zzgxvVar2 = this.zzb.zzW;
        return zzexq.zza(zza, zzcfmVar, zzcfnVar, zzb, zze, zzf, zza2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, zzfzqVar, zzfjuVar, (zzdxq) zzgxvVar2.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzevw
    public final zzevh zzb() {
        zzcop zzcopVar;
        zzgxv zzgxvVar;
        zzgxv zzgxvVar2;
        zzcop zzcopVar2;
        zzgxv zzgxvVar3;
        zzcop zzcopVar3;
        zzgxv zzgxvVar4;
        zzgxv zzgxvVar5;
        zzgxv zzgxvVar6;
        zzcop zzcopVar4;
        zzcop zzcopVar5;
        zzcop zzcopVar6;
        zzgxv zzgxvVar7;
        zzgxv zzgxvVar8;
        zzgxv zzgxvVar9;
        zzgxv zzgxvVar10;
        zzgxv zzgxvVar11;
        zzgxv zzgxvVar12;
        zzcopVar = this.zzb.zza;
        Context zza = zzcopVar.zza();
        zzgxq.zzb(zza);
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        zzcfm zzcfmVar = new zzcfm();
        zzfzq zzfzqVar2 = zzchc.zza;
        zzgxq.zzb(zzfzqVar2);
        String zzc = this.zza.zzc();
        zzgxq.zzb(zzc);
        zzewy zzewyVar = new zzewy(zzcfmVar, zzfzqVar2, zzc, null);
        zzgxvVar = this.zzb.zzn;
        zzetp zzetpVar = new zzetp(zzewyVar, 0L, (ScheduledExecutorService) zzgxvVar.zzb());
        zzbzg zzbzgVar = new zzbzg();
        zzgxvVar2 = this.zzb.zzn;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzgxvVar2.zzb();
        zzcopVar2 = this.zzb.zza;
        Context zza2 = zzcopVar2.zza();
        zzgxq.zzb(zza2);
        zzexf zzexfVar = new zzexf(zzbzgVar, scheduledExecutorService, zza2, null);
        zzgxvVar3 = this.zzb.zzn;
        zzetp zzetpVar2 = new zzetp(zzexfVar, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdj)).longValue(), (ScheduledExecutorService) zzgxvVar3.zzb());
        zzcfp zzcfpVar = new zzcfp();
        zzcopVar3 = this.zzb.zza;
        Context zza3 = zzcopVar3.zza();
        zzgxq.zzb(zza3);
        zzgxvVar4 = this.zzb.zzn;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzgxvVar4.zzb();
        zzfzq zzfzqVar3 = zzchc.zza;
        zzgxq.zzb(zzfzqVar3);
        zzevt zzevtVar = new zzevt(zzcfpVar, zza3, scheduledExecutorService2, zzfzqVar3, this.zza.zza(), null);
        zzgxvVar5 = this.zzb.zzn;
        zzetp zzetpVar3 = new zzetp(zzevtVar, 0L, (ScheduledExecutorService) zzgxvVar5.zzb());
        zzfzq zzfzqVar4 = zzchc.zza;
        zzgxq.zzb(zzfzqVar4);
        zzexx zzexxVar = new zzexx(zzfzqVar4);
        zzgxvVar6 = this.zzb.zzn;
        zzetp zzetpVar4 = new zzetp(zzexxVar, 0L, (ScheduledExecutorService) zzgxvVar6.zzb());
        zzexo zzexoVar = new zzeve() { // from class: com.google.android.gms.internal.ads.zzexo
            @Override // com.google.android.gms.internal.ads.zzeve
            public final /* synthetic */ int zza() {
                return 0;
            }

            @Override // com.google.android.gms.internal.ads.zzeve
            public final zzfzp zzb() {
                return zzfzg.zzi(new zzevd() { // from class: com.google.android.gms.internal.ads.zzexp
                    @Override // com.google.android.gms.internal.ads.zzevd
                    public final void zzf(Object obj) {
                        try {
                            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        };
        zzcopVar4 = this.zzb.zza;
        Context zza4 = zzcopVar4.zza();
        zzgxq.zzb(zza4);
        String zzc2 = this.zza.zzc();
        zzgxq.zzb(zzc2);
        zzfzq zzfzqVar5 = zzchc.zza;
        zzgxq.zzb(zzfzqVar5);
        zzewc zzewcVar = new zzewc(null, zza4, zzc2, zzfzqVar5);
        zzbee zzbeeVar = new zzbee();
        zzfzq zzfzqVar6 = zzchc.zza;
        zzgxq.zzb(zzfzqVar6);
        zzcopVar5 = this.zzb.zza;
        Context zza5 = zzcopVar5.zza();
        zzgxq.zzb(zza5);
        zzcfp zzcfpVar2 = new zzcfp();
        int zza6 = this.zza.zza();
        zzcopVar6 = this.zzb.zza;
        Context zza7 = zzcopVar6.zza();
        zzgxq.zzb(zza7);
        zzgxvVar7 = this.zzb.zzad;
        zzcfy zzcfyVar = (zzcfy) zzgxvVar7.zzb();
        zzgxvVar8 = this.zzb.zzn;
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) zzgxvVar8.zzb();
        zzfzq zzfzqVar7 = zzchc.zza;
        zzgxq.zzb(zzfzqVar7);
        String zzc3 = this.zza.zzc();
        zzgxq.zzb(zzc3);
        zzgxvVar9 = this.zzb.zzaD;
        String zzc4 = this.zza.zzc();
        zzgxq.zzb(zzc4);
        zzbds zzbdsVar = new zzbds();
        zzgxvVar10 = this.zzb.zzad;
        zzcfy zzcfyVar2 = (zzcfy) zzgxvVar10.zzb();
        zzgxvVar11 = this.zzb.zzn;
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) zzgxvVar11.zzb();
        zzfzq zzfzqVar8 = zzchc.zza;
        zzgxq.zzb(zzfzqVar8);
        zzfvs zzm = zzfvs.zzm(zzetpVar, zzetpVar2, zzetpVar3, zzetpVar4, zzexoVar, zzewcVar, new zzewr(zzbeeVar, zzfzqVar6, zza5, null), zzf(), zze(), new zzewn(zzcfpVar2, zza6, zza7, zzcfyVar, scheduledExecutorService3, zzfzqVar7, zzc3, null), (zzeve) zzgxvVar9.zzb(), zzewj.zza(zzc4, zzbdsVar, zzcfyVar2, scheduledExecutorService4, zzfzqVar8));
        zzfju zzfjuVar = (zzfju) this.zzd.zzb();
        zzgxvVar12 = this.zzb.zzW;
        return new zzevh(zza, zzfzqVar, zzm, zzfjuVar, (zzdxq) zzgxvVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzevw
    public final zzfih zzc() {
        return (zzfih) this.zzA.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzevw
    public final zzfju zzd() {
        return (zzfju) this.zzd.zzb();
    }
}
