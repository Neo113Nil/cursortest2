package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzefx implements zzdgp {
    private final zzfcj zza;
    private final zzbqw zzb;
    private final AdFormat zzc;
    private zzcwk zzd = null;

    zzefx(zzfcj zzfcjVar, zzbqw zzbqwVar, AdFormat adFormat) {
        this.zza = zzfcjVar;
        this.zzb = zzbqwVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z, Context context, zzcwf zzcwfVar) throws zzdgo {
        boolean zzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdgo("Adapter failed to show.");
                }
                zzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zzk) {
                zzcwk zzcwkVar = this.zzd;
                if (zzcwkVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbJ)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzcwkVar.zza();
                return;
            }
            throw new zzdgo("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgo(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zza;
    }

    public final void zzc(zzcwk zzcwkVar) {
        this.zzd = zzcwkVar;
    }
}
