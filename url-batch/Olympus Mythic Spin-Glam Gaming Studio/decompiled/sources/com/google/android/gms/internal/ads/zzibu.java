package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzibu implements zzhrh {
    public static zzhrh zzb(zzhrf zzhrfVar) throws GeneralSecurityException {
        zzhrh zzb = zzhrl.zzb(zzhrfVar);
        try {
            return new zzibt(zzb, zzhrm.zzb(zzhrfVar), null);
        } catch (GeneralSecurityException unused) {
            return zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhrh
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        throw null;
    }
}
