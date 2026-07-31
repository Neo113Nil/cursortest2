package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
final class zzbze extends zzbnv {
    final /* synthetic */ zzbzg zza;

    /* synthetic */ zzbze(zzbzg zzbzgVar, byte[] bArr) {
        Objects.requireNonNull(zzbzgVar);
        this.zza = zzbzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zze(zzbnm zzbnmVar, String str) {
        zzbzg zzbzgVar = this.zza;
        if (zzbzgVar.zze() == null) {
            return;
        }
        zzbzgVar.zze().onCustomClick(zzbzgVar.zzc(zzbnmVar), str);
    }
}
