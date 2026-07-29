package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeit implements zzefg {
    private final Context zza;
    private final Executor zzb;
    private final zzdsx zzc;

    public zzeit(Context context, Executor executor, zzdsx zzdsxVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, final zzefb zzefbVar) throws zzfcd, zzeio {
        zzdst zze = this.zzc.zze(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzdsu(new zzdlf() { // from class: com.google.android.gms.internal.ads.zzeis
            @Override // com.google.android.gms.internal.ads.zzdlf
            public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
                zzefb zzefbVar2 = zzefb.this;
                try {
                    ((zzfct) zzefbVar2.zzb).zzu(z);
                    ((zzfct) zzefbVar2.zzb).zzx(context);
                } catch (zzfcd e) {
                    throw new zzdle(e.getCause());
                }
            }
        }));
        zze.zzd().zzj(new zzcti((zzfct) zzefbVar.zzb), this.zzb);
        ((zzegu) zzefbVar.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) throws zzfcd {
        try {
            zzfby zzfbyVar = zzfbsVar.zza.zza;
            if (zzfbyVar.zzo.zza == 3) {
                ((zzfct) zzefbVar.zzb).zzq(this.zza, zzfbyVar.zzd, zzfbgVar.zzw.toString(), (zzbuf) zzefbVar.zzc);
            } else {
                ((zzfct) zzefbVar.zzb).zzp(this.zza, zzfbyVar.zzd, zzfbgVar.zzw.toString(), (zzbuf) zzefbVar.zzc);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefbVar.zza)), e);
        }
    }
}
