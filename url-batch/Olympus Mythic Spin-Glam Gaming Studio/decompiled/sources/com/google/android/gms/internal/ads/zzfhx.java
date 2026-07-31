package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzfhx implements zzfoe {
    private final zzfiu zza;

    public zzfhx(zzfiu zzfiuVar) {
        this.zza = zzfiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final ListenableFuture zza(zzfof zzfofVar) {
        zzfia zzfiaVar = (zzfia) zzfofVar;
        return ((zzfhw) this.zza).zzb(zzfiaVar.zzb, zzfiaVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final void zzb(zzfnu zzfnuVar) {
        zzfnuVar.zza = ((zzfhw) this.zza).zza();
    }
}
