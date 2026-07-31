package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzehw implements zzdgp {
    final /* synthetic */ zzeec zza;
    final /* synthetic */ zzfcj zzb;

    zzehw(zzehx zzehxVar, zzeec zzeecVar, zzfcj zzfcjVar) {
        this.zza = zzeecVar;
        this.zzb = zzfcjVar;
        Objects.requireNonNull(zzehxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z, Context context, zzcwf zzcwfVar) throws zzdgo {
        try {
            zzfea zzfeaVar = (zzfea) this.zza.zzb;
            zzfeaVar.zzs(z);
            zzfeaVar.zzw(context);
        } catch (zzfdj e) {
            throw new zzdgo(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zzb;
    }
}
