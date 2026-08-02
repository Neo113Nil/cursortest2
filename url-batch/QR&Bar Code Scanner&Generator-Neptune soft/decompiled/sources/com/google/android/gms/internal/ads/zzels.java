package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzels implements zzehj {
    private final Context zza;
    private final Executor zzb;
    private final zzduh zzc;

    public zzels(Context context, Executor executor, zzduh zzduhVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzduhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) {
        try {
            ((zzffa) zzehfVar.zzb).zzk(zzfdwVar.zza.zza.zzd, zzfdkVar.zzw.toString());
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzehfVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, zzfdk zzfdkVar, final zzehf zzehfVar) throws zzfek, zzekr {
        zzdud zze = this.zzc.zze(new zzczt(zzfdwVar, zzfdkVar, zzehfVar.zza), new zzdue(new zzdmp() { // from class: com.google.android.gms.internal.ads.zzelo
            @Override // com.google.android.gms.internal.ads.zzdmp
            public final void zza(boolean z, Context context, zzddn zzddnVar) {
                zzehf zzehfVar2 = zzehf.this;
                try {
                    ((zzffa) zzehfVar2.zzb).zzu(z);
                    ((zzffa) zzehfVar2.zzb).zzy();
                } catch (zzfek e) {
                    com.google.android.gms.ads.internal.util.zze.zzk("Cannot show rewarded video.", e);
                    throw new zzdmo(e.getCause());
                }
            }
        }));
        zze.zzd().zzj(new zzcuq((zzffa) zzehfVar.zzb), this.zzb);
        zzdeh zze2 = zze.zze();
        zzdcy zzb = zze.zzb();
        ((zzeiy) zzehfVar.zzc).zzc(new zzelr(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek {
        if (((zzffa) zzehfVar.zzb).zzA()) {
            zze(zzfdwVar, zzfdkVar, zzehfVar);
            return;
        }
        ((zzeiy) zzehfVar.zzc).zzd(new zzelq(this, zzfdwVar, zzfdkVar, zzehfVar));
        ((zzffa) zzehfVar.zzb).zzh(this.zza, zzfdwVar.zza.zza.zzd, null, (zzccd) zzehfVar.zzc, zzfdkVar.zzw.toString());
    }
}
