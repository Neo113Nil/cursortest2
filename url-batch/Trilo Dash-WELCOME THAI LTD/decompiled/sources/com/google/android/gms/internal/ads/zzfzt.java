package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfzt implements zzfwl {
    final zzfxa zza;

    public zzfzt(zzfxa zzfxaVar) {
        this.zza = zzfxaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzghf.zzc(this.zza.zzb().zzb(), ((zzfwl) this.zza.zzb().zza()).zza(bArr, bArr2));
    }
}
