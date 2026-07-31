package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
final class zzbzf extends zzbny {
    final /* synthetic */ zzbzg zza;

    /* synthetic */ zzbzf(zzbzg zzbzgVar, byte[] bArr) {
        Objects.requireNonNull(zzbzgVar);
        this.zza = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zze(zzbnm zzbnmVar) {
        zzbzg zzbzgVar = this.zza;
        zzbzgVar.zzd().onCustomFormatAdLoaded(zzbzgVar.zzc(zzbnmVar));
    }
}
