package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzefk implements zzdgp {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzfcj zzb;
    final /* synthetic */ zzefm zzc;

    zzefk(zzefm zzefmVar, zzbzm zzbzmVar, zzfcj zzfcjVar) {
        this.zza = zzbzmVar;
        this.zzb = zzfcjVar;
        Objects.requireNonNull(zzefmVar);
        this.zzc = zzefmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z, Context context, zzcwf zzcwfVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zzb;
    }
}
