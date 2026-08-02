package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeja implements zzeez {
    private final Context zza;
    private final Executor zzb;
    private final zzdou zzc;

    public zzeja(Context context, Executor executor, zzdou zzdouVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, final zzeew zzeewVar) throws zzffn, zzeir {
        zzdoq zze = this.zzc.zze(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzdor(new zzdgx() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // com.google.android.gms.internal.ads.zzdgx
            public final void zza(boolean z, Context context, zzcxd zzcxdVar) {
                zzeew zzeewVar2 = zzeew.this;
                try {
                    ((zzfge) zzeewVar2.zzb).zzv(z);
                    ((zzfge) zzeewVar2.zzb).zzz(context);
                } catch (zzffn e) {
                    throw new zzdgw(e.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcmy((zzfge) zzeewVar.zzb), this.zzb);
        ((zzegp) zzeewVar.zzc).zzc(zze.zzn());
        return zze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) throws zzffn {
        try {
            zzffg zzffgVar = zzfexVar.zza.zza;
            if (zzffgVar.zzo.zza == 3) {
                ((zzfge) zzeewVar.zzb).zzr(this.zza, zzffgVar.zzd, zzfelVar.zzv.toString(), (zzbos) zzeewVar.zzc);
            } else {
                ((zzfge) zzeewVar.zzb).zzq(this.zza, zzffgVar.zzd, zzfelVar.zzv.toString(), (zzbos) zzeewVar.zzc);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeewVar.zza)), e);
        }
    }
}
