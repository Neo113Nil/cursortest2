package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzefi implements zzeez {
    private final Context zza;
    private final zzcoy zzb;
    private final Executor zzc;

    zzefi(Context context, zzcoy zzcoyVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcoyVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, zzfel zzfelVar, final zzeew zzeewVar) throws zzffn, zzeir {
        zzcov zza = this.zzb.zza(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzdfs(new zzdgx() { // from class: com.google.android.gms.internal.ads.zzefh
            @Override // com.google.android.gms.internal.ads.zzdgx
            public final void zza(boolean z, Context context, zzcxd zzcxdVar) {
                zzeew zzeewVar2 = zzeew.this;
                try {
                    ((zzfge) zzeewVar2.zzb).zzv(z);
                    ((zzfge) zzeewVar2.zzb).zzw(context);
                } catch (zzffn e) {
                    throw new zzdgw(e.getCause());
                }
            }
        }, null), new zzcow(zzfelVar.zzaa));
        zza.zzd().zzo(new zzcmy((zzfge) zzeewVar.zzb), this.zzc);
        ((zzegp) zzeewVar.zzc).zzc(zza.zzk());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) throws zzffn {
        zzfge zzfgeVar = (zzfge) zzeewVar.zzb;
        zzffg zzffgVar = zzfexVar.zza.zza;
        zzfgeVar.zzl(this.zza, zzffgVar.zzd, zzfelVar.zzv.toString(), (zzbos) zzeewVar.zzc);
    }
}
