package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgfi {
    private final zzgak zza;
    private final zzgaq zzb;

    public zzgfi(zzgak zzgakVar) {
        this.zza = zzgakVar;
        this.zzb = null;
    }

    public zzgfi(zzgaq zzgaqVar) {
        this.zza = null;
        this.zzb = zzgaqVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgak zzgakVar = this.zza;
        return zzgakVar != null ? zzgakVar.zzb(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
