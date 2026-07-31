package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbsi extends zzbhc {
    final /* synthetic */ zzbsj zza;

    /* synthetic */ zzbsi(zzbsj zzbsjVar, byte[] bArr) {
        Objects.requireNonNull(zzbsjVar);
        this.zza = zzbsjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zze(zzbgq zzbgqVar) {
        zzbsj zzbsjVar = this.zza;
        zzbsjVar.zzd().onCustomFormatAdLoaded(zzbsjVar.zzc(zzbgqVar));
    }
}
