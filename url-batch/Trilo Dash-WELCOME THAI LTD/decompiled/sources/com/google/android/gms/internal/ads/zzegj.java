package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzegj implements zzefg {
    private final Context zza;
    private final zzcwr zzb;
    private View zzc;
    private zzbui zzd;

    public zzegj(Context context, zzcwr zzcwrVar) {
        this.zza = context;
        this.zzb = zzcwrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, final zzfbg zzfbgVar, final zzefb zzefbVar) throws zzfcd, zzeio {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() && zzfbgVar.zzai) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfcd(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzegf
                            @Override // com.google.android.gms.internal.ads.zzfuh
                            public final zzfvj zza(Object obj) {
                                return zzegj.this.zzc(view, zzfbgVar, obj);
                            }
                        }, zzcfv.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfcd(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfcd(e2);
            }
        } else {
            view = this.zzc;
        }
        zzcvv zza = this.zzb.zza(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzcwb(view, null, new zzcxu() { // from class: com.google.android.gms.internal.ads.zzegg
            @Override // com.google.android.gms.internal.ads.zzcxu
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                try {
                    return ((zzbvs) zzefb.this.zzb).zze();
                } catch (RemoteException e3) {
                    throw new zzfcd(e3);
                }
            }
        }, (zzfbh) zzfbgVar.zzv.get(0)));
        zza.zzg().zza(view);
        ((zzegu) zzefbVar.zzc).zzc(zza.zzh());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) throws zzfcd {
        try {
            ((zzbvs) zzefbVar.zzb).zzp(zzfbgVar.zzaa);
            zzegh zzeghVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() && zzfbgVar.zzai) {
                ((zzbvs) zzefbVar.zzb).zzj(zzfbgVar.zzV, zzfbgVar.zzw.toString(), zzfbsVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegi(this, zzefbVar, zzeghVar), (zzbuf) zzefbVar.zzc, zzfbsVar.zza.zza.zze);
            } else {
                ((zzbvs) zzefbVar.zzb).zzi(zzfbgVar.zzV, zzfbgVar.zzw.toString(), zzfbsVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegi(this, zzefbVar, zzeghVar), (zzbuf) zzefbVar.zzc, zzfbsVar.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfcd(e);
        }
    }

    final /* synthetic */ zzfvj zzc(View view, zzfbg zzfbgVar, Object obj) throws Exception {
        return zzfva.zzi(zzcxi.zza(this.zza, view, zzfbgVar));
    }
}
