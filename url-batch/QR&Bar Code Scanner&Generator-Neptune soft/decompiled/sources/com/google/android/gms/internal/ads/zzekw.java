package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzekw implements zzehj {
    private final Context zza;
    private final Executor zzb;
    private final zzduh zzc;

    public zzekw(Context context, Executor executor, zzduh zzduhVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzduhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, zzfdk zzfdkVar, final zzehf zzehfVar) throws zzfek, zzekr {
        zzdud zze = this.zzc.zze(new zzczt(zzfdwVar, zzfdkVar, zzehfVar.zza), new zzdue(new zzdmp() { // from class: com.google.android.gms.internal.ads.zzekv
            @Override // com.google.android.gms.internal.ads.zzdmp
            public final void zza(boolean z, Context context, zzddn zzddnVar) {
                zzehf zzehfVar2 = zzehf.this;
                try {
                    ((zzffa) zzehfVar2.zzb).zzu(z);
                    ((zzffa) zzehfVar2.zzb).zzx(context);
                } catch (zzfek e) {
                    throw new zzdmo(e.getCause());
                }
            }
        }));
        zze.zzd().zzj(new zzcuq((zzffa) zzehfVar.zzb), this.zzb);
        ((zzeix) zzehfVar.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek {
        try {
            zzfef zzfefVar = zzfdwVar.zza.zza;
            if (zzfefVar.zzo.zza == 3) {
                ((zzffa) zzehfVar.zzb).zzq(this.zza, zzfefVar.zzd, zzfdkVar.zzw.toString(), (zzbvq) zzehfVar.zzc);
            } else {
                ((zzffa) zzehfVar.zzb).zzp(this.zza, zzfefVar.zzd, zzfdkVar.zzw.toString(), (zzbvq) zzehfVar.zzc);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzehfVar.zza)), e);
        }
    }
}
