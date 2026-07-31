package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzibt implements zzhrh {
    final zzhrh zza;
    final zzhrh zzb;

    /* synthetic */ zzibt(zzhrh zzhrhVar, zzhrh zzhrhVar2, byte[] bArr) {
        this.zza = zzhrhVar;
        this.zzb = zzhrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhrh
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i) : this.zzb.zza(bArr, i);
    }
}
