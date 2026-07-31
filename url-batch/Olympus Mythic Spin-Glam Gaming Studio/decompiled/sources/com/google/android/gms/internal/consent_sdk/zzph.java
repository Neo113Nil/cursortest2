package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes11.dex */
final class zzph extends zzpk {
    zzph(byte[] bArr, int i, int i2) {
        super(bArr);
        zzpm.zzi(0, 47, bArr.length);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    final byte zzb(int i) {
        return ((zzpk) this).zza[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final int zzd() {
        return 47;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpk, com.google.android.gms.internal.consent_sdk.zzpm
    public final byte zza(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return ((zzpk) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", 47");
    }
}
