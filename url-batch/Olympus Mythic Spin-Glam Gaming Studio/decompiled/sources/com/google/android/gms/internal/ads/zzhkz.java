package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhkz extends zzhkx {
    public zzhkz(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhkx
    final zzhkv zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzhky(bArr, i);
    }
}
