package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhxr {
    private zzhxu zza = null;
    private zzici zzb = null;
    private zzici zzc = null;
    private zzici zzd = null;
    private zzici zze = null;
    private zzici zzf = null;
    private zzici zzg = null;

    private zzhxr() {
    }

    /* synthetic */ zzhxr(byte[] bArr) {
    }

    public final zzhxr zza(zzhxu zzhxuVar) {
        this.zza = zzhxuVar;
        return this;
    }

    public final zzhxr zzb(zzici zziciVar, zzici zziciVar2) {
        this.zzc = zziciVar;
        this.zzd = zziciVar2;
        return this;
    }

    public final zzhxr zzc(zzici zziciVar) {
        this.zzb = zziciVar;
        return this;
    }

    public final zzhxr zzd(zzici zziciVar, zzici zziciVar2) {
        this.zze = zziciVar;
        this.zzf = zziciVar2;
        return this;
    }

    public final zzhxr zze(zzici zziciVar) {
        this.zzg = zziciVar;
        return this;
    }

    public final zzhxs zzf() throws GeneralSecurityException {
        zzhxu zzhxuVar = this.zza;
        if (zzhxuVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger zzd = zzhxuVar.zzf().zzd();
        BigInteger zzd2 = this.zza.zzd();
        BigInteger zzb = this.zzc.zzb(zzheq.zza());
        BigInteger zzb2 = this.zzd.zzb(zzheq.zza());
        BigInteger zzb3 = this.zzb.zzb(zzheq.zza());
        BigInteger zzb4 = this.zze.zzb(zzheq.zza());
        BigInteger zzb5 = this.zzf.zzb(zzheq.zza());
        BigInteger zzb6 = this.zzg.zzb(zzheq.zza());
        if (!zzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!zzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!zzb.multiply(zzb2).equals(zzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger subtract = zzb.subtract(bigInteger);
        BigInteger subtract2 = zzb2.subtract(bigInteger);
        if (!zzd.multiply(zzb3).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!zzd.multiply(zzb4).mod(subtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!zzd.multiply(zzb5).mod(subtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (zzb2.multiply(zzb6).mod(zzb).equals(bigInteger)) {
            return new zzhxs(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
