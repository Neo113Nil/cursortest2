package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzehf implements zzefg {
    private final Context zza;
    private final zzdkx zzb;
    private final zzcfo zzc;
    private final Executor zzd;

    public zzehf(Context context, zzcfo zzcfoVar, zzdkx zzdkxVar, Executor executor) {
        this.zza = context;
        this.zzc = zzcfoVar;
        this.zzb = zzdkxVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, final zzefb zzefbVar) throws zzfcd, zzeio {
        zzdjz zze = this.zzb.zze(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzdkc(new zzdlf() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // com.google.android.gms.internal.ads.zzdlf
            public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
                zzehf.this.zzc(zzefbVar, z, context, zzdcfVar);
            }
        }, null));
        zze.zzd().zzj(new zzcti((zzfct) zzefbVar.zzb), this.zzd);
        ((zzegu) zzefbVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) throws zzfcd {
        ((zzfct) zzefbVar.zzb).zzn(this.zza, zzfbsVar.zza.zza.zzd, zzfbgVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbgVar.zzt), (zzbuf) zzefbVar.zzc);
    }

    final /* synthetic */ void zzc(zzefb zzefbVar, boolean z, Context context, zzdcf zzdcfVar) throws zzdle {
        try {
            ((zzfct) zzefbVar.zzb).zzu(z);
            if (this.zzc.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaB)).intValue()) {
                ((zzfct) zzefbVar.zzb).zzv();
            } else {
                ((zzfct) zzefbVar.zzb).zzw(context);
            }
        } catch (zzfcd e) {
            com.google.android.gms.ads.internal.util.zze.zzi("Cannot show interstitial.");
            throw new zzdle(e.getCause());
        }
    }
}
