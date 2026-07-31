package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzenq implements zzemq {
    private final zzcxi zza;
    private final Context zzb;
    private final zzdxg zzc;
    private final zzflw zzd;
    private final Executor zze;
    private final zzgub zzf;
    private final zzeae zzg;

    public zzenq(zzcxi zzcxiVar, Context context, Executor executor, zzdxg zzdxgVar, zzflw zzflwVar, zzgub zzgubVar, zzeae zzeaeVar) {
        this.zzb = context;
        this.zza = zzcxiVar;
        this.zze = executor;
        this.zzc = zzdxgVar;
        this.zzd = zzflwVar;
        this.zzf = zzgubVar;
        this.zzg = zzeaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar = zzfldVar.zzs;
        return (zzfliVar == null || zzfliVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(final zzflo zzfloVar, final zzfld zzfldVar) {
        return zzhcy.zzj(zzhcy.zza(null), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzenp
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzenq.this.zzc(zzfloVar, zzfldVar, obj);
            }
        }, this.zze);
    }

    final /* synthetic */ ListenableFuture zzc(zzflo zzfloVar, zzfld zzfldVar, Object obj) {
        zzbix zzbixVar = zzbjg.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            this.zzg.zzf(zzdzs.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zza = zzfmc.zza(context, zzfldVar.zzu);
        final zzclm zza2 = this.zzc.zza(zza, zzfldVar, zzfloVar.zzb.zzb);
        zza2.zzaw(zzfldVar.zzW);
        View zza3 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjf)).booleanValue() && zzfldVar.zzag) ? zzcxx.zza(context, zza2.zzE(), zzfldVar) : new zzdxj(context, zza2.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfldVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            this.zzg.zzf(zzdzs.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcxi zzcxiVar = this.zza;
        final zzcwe zzf = zzcxiVar.zzf(new zzczb(zzfloVar, zzfldVar, null), new zzcwk(zza3, zza2, new zzcyj() { // from class: com.google.android.gms.internal.ads.zzenl
            @Override // com.google.android.gms.internal.ads.zzcyj
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return zzclm.this.zzh();
            }
        }, zzfmc.zzb(zza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            this.zzg.zzf(zzdzs.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdxf zzj = zzf.zzj();
        zzeae zzeaeVar = this.zzg;
        zzj.zzi(zza2, false, null, zzeaeVar);
        zzdeh zzd = zzf.zzd();
        zzdej zzdejVar = new zzdej() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // com.google.android.gms.internal.ads.zzdej
            public final /* synthetic */ void zzdr() {
                zzclm zzclmVar = zzclm.this;
                if (zzclmVar.zzP() != null) {
                    zzclmVar.zzP().zzq();
                }
            }
        };
        zzhdi zzhdiVar = zzcgj.zzh;
        zzd.zzq(zzdejVar, zzhdiVar);
        zzfli zzfliVar = zzfldVar.zzs;
        String str = zzfliVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgt)).booleanValue() && zzf.zzm().zza(true)) {
            str = zzcnd.zza(str, zzcnd.zzb(zzfldVar));
        }
        zzf.zzj();
        ListenableFuture zzj2 = zzdxf.zzj(zza2, zzfliVar.zzb, str, zzeaeVar, zzcxiVar.zze());
        if (zzfldVar.zzM) {
            zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclm.this.zzav();
                }
            }, this.zze);
        }
        zzj2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzenq.this.zzd(zza2);
            }
        }, this.zze);
        return zzhcy.zzk(zzj2, new zzgub() { // from class: com.google.android.gms.internal.ads.zzeno
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj2) {
                return zzcwe.this.zzi();
            }
        }, zzhdiVar);
    }

    final /* synthetic */ void zzd(zzclm zzclmVar) {
        zzclmVar.zzJ();
        zzflw zzflwVar = this.zzd;
        zzcms zzh = zzclmVar.zzh();
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzflwVar.zza;
        if (zzfwVar != null && zzh != null) {
            zzh.zzb(zzfwVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbZ)).booleanValue() || zzclmVar.isAttachedToWindow()) {
            return;
        }
        zzclmVar.onPause();
        zzclmVar.zzaG(true);
    }
}
