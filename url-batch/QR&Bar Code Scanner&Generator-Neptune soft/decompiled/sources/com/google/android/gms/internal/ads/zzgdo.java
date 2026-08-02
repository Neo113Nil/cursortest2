package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgdo extends zzgdm {
    public zzgdo(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgdm
    final zzgdk zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgdn(bArr, i);
    }
}
