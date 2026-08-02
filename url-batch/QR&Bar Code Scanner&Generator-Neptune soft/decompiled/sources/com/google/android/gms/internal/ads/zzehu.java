package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzehu implements zzehc {
    private final zzcwf zza;
    private final Context zzb;
    private final zzduy zzc;
    private final Executor zzd;

    public zzehu(zzcwf zzcwfVar, Context context, Executor executor, zzduy zzduyVar) {
        this.zzb = context;
        this.zza = zzcwfVar;
        this.zzd = executor;
        this.zzc = zzduyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final zzfzp zza(final zzfdw zzfdwVar, final zzfdk zzfdkVar) {
        return zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzehr
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzehu.this.zzc(zzfdwVar, zzfdkVar, obj);
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzehc
    public final boolean zzb(zzfdw zzfdwVar, zzfdk zzfdkVar) {
        zzfdp zzfdpVar = zzfdkVar.zzt;
        return (zzfdpVar == null || zzfdpVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzfzp zzc(zzfdw zzfdwVar, zzfdk zzfdkVar, Object obj) throws Exception {
        com.google.android.gms.ads.internal.client.zzq zza = zzfej.zza(this.zzb, zzfdkVar.zzv);
        final zzcmp zza2 = this.zzc.zza(zza, zzfdkVar, zzfdwVar.zzb.zzb);
        final zzcvx zza3 = this.zza.zza(new zzczt(zzfdwVar, zzfdkVar, null), new zzcvy((View) zza2, zza2, zzfej.zzc(zza), zzfdkVar.zzab, zzfdkVar.zzaf, zzfdkVar.zzP));
        zza3.zzg().zzi(zza2, false, null);
        zza3.zzc().zzj(new zzddu() { // from class: com.google.android.gms.internal.ads.zzehs
            @Override // com.google.android.gms.internal.ads.zzddu
            public final void zzl() {
                zzcmp zzcmpVar = zzcmp.this;
                if (zzcmpVar.zzP() != null) {
                    zzcmpVar.zzP().zzp();
                }
            }
        }, zzchc.zzf);
        zza3.zzg();
        zzfdp zzfdpVar = zzfdkVar.zzt;
        return zzfzg.zzm(zzdux.zzj(zza2, zzfdpVar.zzb, zzfdpVar.zza), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzeht
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj2) {
                return zzcvx.this.zza();
            }
        }, zzchc.zzf);
    }
}
