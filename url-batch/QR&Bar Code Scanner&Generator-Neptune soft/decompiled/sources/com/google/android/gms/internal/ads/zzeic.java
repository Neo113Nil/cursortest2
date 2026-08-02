package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeic implements zzehc {
    private final zzcxz zza;
    private final Context zzb;
    private final zzduy zzc;
    private final zzfef zzd;
    private final Executor zze;
    private final zzfsm zzf;

    public zzeic(zzcxz zzcxzVar, Context context, Executor executor, zzduy zzduyVar, zzfef zzfefVar, zzfsm zzfsmVar) {
        this.zzb = context;
        this.zza = zzcxzVar;
        this.zze = executor;
        this.zzc = zzduyVar;
        this.zzd = zzfefVar;
        this.zzf = zzfsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(final zzfdw zzfdwVar, final zzfdk zzfdkVar) {
        return zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzehw
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzeic.this.zzc(zzfdwVar, zzfdkVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        zzfdp zzfdpVar = zzfdkVar.zzt;
        return (zzfdpVar == null || zzfdpVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfzp zzc(zzfdw zzfdwVar, zzfdk zzfdkVar, Object obj) throws Exception {
        View zzdvbVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzfej.zza(this.zzb, zzfdkVar.zzv);
        final zzcmp zza2 = this.zzc.zza(zza, zzfdkVar, zzfdwVar.zzb.zzb);
        zza2.zzab(zzfdkVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgJ)).booleanValue() && zzfdkVar.zzai) {
            zzdvbVar = zzcyq.zza(this.zzb, (View) zza2, zzfdkVar);
        } else {
            zzdvbVar = new zzdvb(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzas) this.zzf.apply(zzfdkVar));
        }
        final zzcxd zza3 = this.zza.zza(new zzczt(zzfdwVar, zzfdkVar, null), new zzcxj(zzdvbVar, zza2, new zzczc() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // com.google.android.gms.internal.ads.zzczc
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return zzcmp.this.zzs();
            }
        }, zzfej.zzc(zza)));
        zza3.zzj().zzi(zza2, false, null);
        zza3.zzc().zzj(new zzddu() { // from class: com.google.android.gms.internal.ads.zzehy
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zzl() {
                zzcmp zzcmpVar = zzcmp.this;
                if (zzcmpVar.zzP() != null) {
                    zzcmpVar.zzP().zzp();
                }
            }
        }, zzchc.zzf);
        zza3.zzj();
        zzfdp zzfdpVar = zzfdkVar.zzt;
        zzfzp zzj = zzdux.zzj(zza2, zzfdpVar.zzb, zzfdpVar.zza);
        if (zzfdkVar.zzN) {
            zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehz
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmp.this.zzag();
                }
            }, this.zze);
        }
        zzj.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeia
            @Override // java.lang.Runnable
            public final void run() {
                zzeic.this.zzd(zza2);
            }
        }, this.zze);
        return zzfzg.zzm(zzj, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzeib
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj2) {
                return zzcxd.this.zza();
            }
        }, zzchc.zzf);
    }

    final /* synthetic */ void zzd(zzcmp zzcmpVar) {
        zzcmpVar.zzaa();
        zzcnl zzs = zzcmpVar.zzs();
        com.google.android.gms.ads.internal.client.zzff zzffVar = this.zzd.zza;
        if (zzffVar == null || zzs == null) {
            return;
        }
        zzs.zzs(zzffVar);
    }
}
