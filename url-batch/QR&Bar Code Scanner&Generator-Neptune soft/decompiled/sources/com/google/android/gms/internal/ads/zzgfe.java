package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgfe implements zzgeu {
    private final zzgep zza;
    private final int zzb;

    private zzgfe(zzgep zzgepVar, int i) {
        this.zza = zzgepVar;
        this.zzb = i;
    }

    static zzgfe zzc(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? new zzgfe(new zzgep("HmacSha512"), 3) : new zzgfe(new zzgep("HmacSha384"), 2) : new zzgfe(new zzgep("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    public final zzgev zza(byte[] bArr) throws GeneralSecurityException {
        KeyPair zzc = zzgoe.zzc(zzgoe.zzk(this.zzb));
        byte[] zzg = zzgoe.zzg((ECPrivateKey) zzc.getPrivate(), zzgoe.zzj(zzgoe.zzk(this.zzb), 1, bArr));
        byte[] zzl = zzgoe.zzl(zzgoe.zzk(this.zzb).getCurve(), 1, ((ECPublicKey) zzc.getPublic()).getW());
        byte[] zzc2 = zzgnv.zzc(zzl, bArr);
        byte[] zzd = zzgfd.zzd(zzb());
        zzgep zzgepVar = this.zza;
        return new zzgev(zzgepVar.zzb(null, zzg, "eae_prk", zzc2, "shared_secret", zzd, zzgepVar.zza()), zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zzb - 1;
        return i != 0 ? i != 1 ? zzgfd.zze : zzgfd.zzd : zzgfd.zzc;
    }
}
