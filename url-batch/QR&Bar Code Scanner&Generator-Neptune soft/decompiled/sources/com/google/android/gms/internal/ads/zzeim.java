package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeim implements zzehj {
    private final Context zza;
    private final zzcxz zzb;
    private View zzc;
    private zzbvt zzd;

    public zzeim(Context context, zzcxz zzcxzVar) {
        this.zza = context;
        this.zzb = zzcxzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzehj
    public final /* bridge */ /* synthetic */ Object zza(zzfdw zzfdwVar, final zzfdk zzfdkVar, final zzehf zzehfVar) throws zzfek, zzekr {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgJ)).booleanValue() && zzfdkVar.zzai) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfek(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeii
                            @Override // com.google.android.gms.internal.ads.zzfyn
                            public final zzfzp zza(Object obj) {
                                return zzeim.this.zzc(view, zzfdkVar, obj);
                            }
                        }, zzchc.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfek(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfek(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcxd zza = this.zzb.zza(new zzczt(zzfdwVar, zzfdkVar, zzehfVar.zza), new zzcxj(view, null, new zzczc() { // from class: com.google.android.gms.internal.ads.zzeij
            @Override // com.google.android.gms.internal.ads.zzczc
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                try {
                    return ((zzbxd) zzehf.this.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfek(e3);
                }
            }
        }, (zzfdl) zzfdkVar.zzv.get(0)));
        zza.zzg().zza(view);
        ((zzeix) zzehfVar.zzc).zzc(zza.zzh());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final void zzb(zzfdw zzfdwVar, zzfdk zzfdkVar, zzehf zzehfVar) throws zzfek {
        try {
            ((zzbxd) zzehfVar.zzb).zzp(zzfdkVar.zzaa);
            zzeik zzeikVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgJ)).booleanValue() && zzfdkVar.zzai) {
                ((zzbxd) zzehfVar.zzb).zzj(zzfdkVar.zzV, zzfdkVar.zzw.toString(), zzfdwVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeil(this, zzehfVar, zzeikVar), (zzbvq) zzehfVar.zzc, zzfdwVar.zza.zza.zze);
            } else {
                ((zzbxd) zzehfVar.zzb).zzi(zzfdkVar.zzV, zzfdkVar.zzw.toString(), zzfdwVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeil(this, zzehfVar, zzeikVar), (zzbvq) zzehfVar.zzc, zzfdwVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfek(e);
        }
    }

    final /* synthetic */ zzfzp zzc(View view, zzfdk zzfdkVar, Object obj) throws Exception {
        return zzfzg.zzi(zzcyq.zza(this.zza, view, zzfdkVar));
    }
}
