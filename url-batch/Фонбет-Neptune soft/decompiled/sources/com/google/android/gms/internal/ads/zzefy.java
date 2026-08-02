package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzefy implements zzeez {
    private final Context zza;
    private final zzcql zzb;
    private final Executor zzc;

    public zzefy(Context context, zzcql zzcqlVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcqlVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzeez
    public final /* bridge */ /* synthetic */ Object zza(zzfex zzfexVar, final zzfel zzfelVar, zzeew zzeewVar) throws zzffn, zzeir {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgZ)).booleanValue() && zzfelVar.zzag) {
            zzbov zzc = ((zzfge) zzeewVar.zzb).zzc();
            if (zzc == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzffn(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzffn(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzefw
                            @Override // com.google.android.gms.internal.ads.zzgbq
                            public final ListenableFuture zza(Object obj) {
                                return zzefy.this.zzc(zza, zzfelVar, obj);
                            }
                        }, zzbzo.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzffn(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzffn(e2);
            }
        } else {
            zza = ((zzfge) zzeewVar.zzb).zza();
        }
        zzcql zzcqlVar = this.zzb;
        zzcsk zzcskVar = new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza);
        final zzfge zzfgeVar = (zzfge) zzeewVar.zzb;
        Objects.requireNonNull(zzfgeVar);
        zzcpl zza2 = zzcqlVar.zza(zzcskVar, new zzcpr(zza, null, new zzcrs() { // from class: com.google.android.gms.internal.ads.zzefx
            @Override // com.google.android.gms.internal.ads.zzcrs
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfge.this.zzb();
            }
        }, (zzfem) zzfelVar.zzu.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcmy((zzfge) zzeewVar.zzb), this.zzc);
        ((zzegp) zzeewVar.zzc).zzc(zza2.zzk());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) throws zzffn {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzfexVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgZ)).booleanValue() && zzfelVar.zzag) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzffm.zza(this.zza, zzfelVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgZ)).booleanValue() && zzfelVar.zzag) {
            Object obj = zzeewVar.zzb;
            ((zzfge) obj).zzn(this.zza, zzqVar3, zzfexVar.zza.zza.zzd, zzfelVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfelVar.zzs), (zzbos) zzeewVar.zzc);
            return;
        }
        Object obj2 = zzeewVar.zzb;
        ((zzfge) obj2).zzm(this.zza, zzqVar3, zzfexVar.zza.zza.zzd, zzfelVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfelVar.zzs), (zzbos) zzeewVar.zzc);
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfel zzfelVar, Object obj) throws Exception {
        return zzgcj.zzh(zzcrg.zza(this.zza, view, zzfelVar));
    }
}
