package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzkb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzke extends zzlj {
    private final zzkh zza;

    @Nullable
    private final zzaam zzb;

    @Nullable
    private final zzaal zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj, com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final /* synthetic */ zzbi zzc() {
        return (zzkh) zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj, com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzkb) zza();
    }

    public static zzke zza(zzkh zzkhVar, zzaal zzaalVar) throws GeneralSecurityException {
        if (zzkhVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzkhVar.zze() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        if (zzaalVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        byte[] zza = zzaalVar.zza(zzbf.zza());
        byte[] zzb = zzkhVar.zze().zzb();
        if (zza.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (!Arrays.equals(zzaah.zza(zza), zzb)) {
            throw new GeneralSecurityException("Invalid private key for public key.");
        }
        return new zzke(zzkhVar, null, zzaalVar);
    }

    public static zzke zza(zzkh zzkhVar, zzaam zzaamVar) throws GeneralSecurityException {
        if (zzkhVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzkhVar.zzf() == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        if (zzaamVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        BigInteger zza = zzaamVar.zza(zzbf.zza());
        ECPoint zzf = zzkhVar.zzf();
        zzkb.zzc zzd = ((zzkb) ((zzlg) zzkhVar.zza())).zzd();
        BigInteger order = zza(zzd).getOrder();
        if (zza.signum() <= 0 || zza.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (!zznj.zza(zza, zza(zzd)).equals(zzf)) {
            throw new GeneralSecurityException("Invalid private value");
        }
        return new zzke(zzkhVar, zzaamVar, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    /* renamed from: zzd */
    public final /* synthetic */ zzlg zza() {
        return (zzkb) ((zzlg) this.zza.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    /* renamed from: zze */
    public final /* synthetic */ zzli zzc() {
        return this.zza;
    }

    @Nullable
    public final zzaam zzf() {
        return this.zzb;
    }

    @Nullable
    public final zzaal zzg() {
        return this.zzc;
    }

    private static ECParameterSpec zza(zzkb.zzc zzcVar) {
        if (zzcVar == zzkb.zzc.zza) {
            return zznj.zza;
        }
        if (zzcVar == zzkb.zzc.zzb) {
            return zznj.zzb;
        }
        if (zzcVar == zzkb.zzc.zzc) {
            return zznj.zzc;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzcVar));
    }

    private zzke(zzkh zzkhVar, @Nullable zzaam zzaamVar, @Nullable zzaal zzaalVar) {
        this.zza = zzkhVar;
        this.zzb = zzaamVar;
        this.zzc = zzaalVar;
    }
}
