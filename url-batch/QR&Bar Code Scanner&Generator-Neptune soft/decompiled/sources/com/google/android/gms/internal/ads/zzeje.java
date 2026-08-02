package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeje implements zzehc {
    private final Context zza;
    private final zzduy zzb;
    private final zzdmh zzc;
    private final zzfef zzd;
    private final Executor zze;
    private final zzcgv zzf;
    private final zzbpx zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhD)).booleanValue();

    public zzeje(Context context, zzcgv zzcgvVar, zzfef zzfefVar, Executor executor, zzdmh zzdmhVar, zzduy zzduyVar, zzbpx zzbpxVar) {
        this.zza = context;
        this.zzd = zzfefVar;
        this.zzc = zzdmhVar;
        this.zze = executor;
        this.zzf = zzcgvVar;
        this.zzb = zzduyVar;
        this.zzg = zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(final zzfdw zzfdwVar, final zzfdk zzfdkVar) {
        final zzdvc zzdvcVar = new zzdvc();
        zzfzp zzn = zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzeje.this.zzc(zzfdkVar, zzfdwVar, zzdvcVar, obj);
            }
        }, this.zze);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeja
            @Override // java.lang.Runnable
            public final void run() {
                zzdvc.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        zzfdp zzfdpVar = zzfdkVar.zzt;
        return (zzfdpVar == null || zzfdpVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfzp zzc(final zzfdk zzfdkVar, zzfdw zzfdwVar, zzdvc zzdvcVar, Object obj) throws Exception {
        final zzcmp zza = this.zzb.zza(this.zzd.zze, zzfdkVar, zzfdwVar.zzb.zzb);
        zza.zzab(zzfdkVar.zzX);
        zzdvcVar.zza(this.zza, (View) zza);
        zzchh zzchhVar = new zzchh();
        final zzdlh zze = this.zzc.zze(new zzczt(zzfdwVar, zzfdkVar, null), new zzdlk(new zzejd(this.zza, this.zzf, zzchhVar, zzfdkVar, zza, this.zzd, this.zzh, this.zzg), zza));
        zzchhVar.zzd(zze);
        zze.zzc().zzj(new zzddu() { // from class: com.google.android.gms.internal.ads.zzejb
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zzl() {
                zzcmp zzcmpVar = zzcmp.this;
                if (zzcmpVar.zzP() != null) {
                    zzcmpVar.zzP().zzp();
                }
            }
        }, zzchc.zzf);
        zze.zzk().zzi(zza, true, this.zzh ? this.zzg : null);
        zze.zzk();
        zzfdp zzfdpVar = zzfdkVar.zzt;
        return zzfzg.zzm(zzdux.zzj(zza, zzfdpVar.zzb, zzfdpVar.zza), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzejc
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj2) {
                zzcmp zzcmpVar = zza;
                zzfdk zzfdkVar2 = zzfdkVar;
                zzdlh zzdlhVar = zze;
                if (zzfdkVar2.zzN) {
                    zzcmpVar.zzag();
                }
                zzcmpVar.zzaa();
                zzcmpVar.onPause();
                return zzdlhVar.zzg();
            }
        }, this.zze);
    }
}
