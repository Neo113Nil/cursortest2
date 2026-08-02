package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeho implements zzehc {
    private final zzcwq zza;
    private final Context zzb;
    private final zzduy zzc;
    private final zzfef zzd;
    private final Executor zze;
    private final zzcgv zzf;
    private final zzbpx zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhD)).booleanValue();

    public zzeho(zzcwq zzcwqVar, Context context, Executor executor, zzduy zzduyVar, zzfef zzfefVar, zzcgv zzcgvVar, zzbpx zzbpxVar) {
        this.zzb = context;
        this.zza = zzcwqVar;
        this.zze = executor;
        this.zzc = zzduyVar;
        this.zzd = zzfefVar;
        this.zzf = zzcgvVar;
        this.zzg = zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(final zzfdw zzfdwVar, final zzfdk zzfdkVar) {
        final zzdvc zzdvcVar = new zzdvc();
        zzfzp zzn = zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzehm
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzeho.this.zzc(zzfdkVar, zzfdwVar, zzdvcVar, obj);
            }
        }, this.zze);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehn
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
        final zzcmp zza = this.zzc.zza(this.zzd.zze, zzfdkVar, zzfdwVar.zzb.zzb);
        zza.zzab(zzfdkVar.zzX);
        zzdvcVar.zza(this.zzb, (View) zza);
        zzchh zzchhVar = new zzchh();
        final zzcwn zza2 = this.zza.zza(new zzczt(zzfdwVar, zzfdkVar, null), new zzdlk(new zzehq(this.zzf, zzchhVar, zzfdkVar, zza, this.zzd, this.zzh, this.zzg), zza), new zzcwo(zzfdkVar.zzab));
        zza2.zzj().zzi(zza, false, this.zzh ? this.zzg : null);
        zzchhVar.zzd(zza2);
        zza2.zzc().zzj(new zzddu() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zzl() {
                zzcmp zzcmpVar = zzcmp.this;
                if (zzcmpVar.zzP() != null) {
                    zzcmpVar.zzP().zzp();
                }
            }
        }, zzchc.zzf);
        zza2.zzj();
        zzfdp zzfdpVar = zzfdkVar.zzt;
        return zzfzg.zzm(zzdux.zzj(zza, zzfdpVar.zzb, zzfdpVar.zza), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzehl
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj2) {
                zzcmp zzcmpVar = zza;
                zzfdk zzfdkVar2 = zzfdkVar;
                zzcwn zzcwnVar = zza2;
                if (zzfdkVar2.zzN) {
                    zzcmpVar.zzag();
                }
                zzcmpVar.zzaa();
                zzcmpVar.onPause();
                return zzcwnVar.zza();
            }
        }, this.zze);
    }
}
