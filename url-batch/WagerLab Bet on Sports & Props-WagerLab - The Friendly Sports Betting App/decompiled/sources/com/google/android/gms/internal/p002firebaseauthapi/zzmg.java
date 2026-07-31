package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzkg;
import com.google.android.gms.internal.p002firebaseauthapi.zzwx;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzmg {
    private static final zzps<zzki, zzbd> zza = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmj
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzma.zza((zzki) zzbiVar);
        }
    }, zzki.class, zzbd.class);
    private static final zzps<zzkq, zzbg> zzb = zzps.zza(new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmi
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpu
        public final Object zza(zzbi zzbiVar) {
            return zzmd.zza((zzkq) zzbiVar);
        }
    }, zzkq.class, zzbg.class);
    private static final zzcd<zzbd> zzc = zzod.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", zzbd.class, zzwr.zzf());
    private static final zzbh<zzbg> zzd = zzod.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzbg.class, zzwx.zzb.ASYMMETRIC_PUBLIC, zzwu.zzg());
    private static final zzor<zzkg> zze = new zzor() { // from class: com.google.android.gms.internal.firebase-auth-api.zzml
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzor
        public final zzbi zza(zzcb zzcbVar, Integer num) {
            return zzmg.zza((zzkg) zzcbVar, num);
        }
    };

    public static /* synthetic */ zzki zza(zzkg zzkgVar, Integer num) {
        byte[] bArr;
        zzaaj zza2;
        zzaal zza3;
        if (zzkgVar.zze().equals(zzkg.zzf.zzd)) {
            byte[] zza4 = zzaah.zza();
            zza3 = zzaal.zza(zza4, zzbf.zza());
            zza2 = zzaaj.zza(zzaah.zza(zza4));
        } else {
            if (!zzkgVar.zze().equals(zzkg.zzf.zza) && !zzkgVar.zze().equals(zzkg.zzf.zzb) && !zzkgVar.zze().equals(zzkg.zzf.zzc)) {
                throw new GeneralSecurityException("Unknown KEM ID");
            }
            zzzi zzc2 = zzmk.zzc(zzkgVar.zze());
            KeyPair zza5 = zzzf.zza(zzzf.zza(zzc2));
            zzzh zzzhVar = zzzh.UNCOMPRESSED;
            ECPoint w = ((ECPublicKey) zza5.getPublic()).getW();
            EllipticCurve curve = zzzf.zza(zzc2).getCurve();
            zznj.zza(w, curve);
            int zza6 = zzzf.zza(curve);
            int ordinal = zzzhVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    int i = zza6 + 1;
                    bArr = new byte[i];
                    byte[] zza7 = zzne.zza(w.getAffineX());
                    System.arraycopy(zza7, 0, bArr, i - zza7.length, zza7.length);
                    bArr[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                } else {
                    if (ordinal != 2) {
                        throw new GeneralSecurityException("invalid format:" + String.valueOf(zzzhVar));
                    }
                    int i2 = zza6 * 2;
                    bArr = new byte[i2];
                    byte[] zza8 = zzne.zza(w.getAffineX());
                    if (zza8.length > zza6) {
                        zza8 = Arrays.copyOfRange(zza8, zza8.length - zza6, zza8.length);
                    }
                    byte[] zza9 = zzne.zza(w.getAffineY());
                    if (zza9.length > zza6) {
                        zza9 = Arrays.copyOfRange(zza9, zza9.length - zza6, zza9.length);
                    }
                    System.arraycopy(zza9, 0, bArr, i2 - zza9.length, zza9.length);
                    System.arraycopy(zza8, 0, bArr, zza6 - zza8.length, zza8.length);
                }
            } else {
                int i3 = (zza6 * 2) + 1;
                bArr = new byte[i3];
                byte[] zza10 = zzne.zza(w.getAffineX());
                byte[] zza11 = zzne.zza(w.getAffineY());
                System.arraycopy(zza11, 0, bArr, i3 - zza11.length, zza11.length);
                System.arraycopy(zza10, 0, bArr, (zza6 + 1) - zza10.length, zza10.length);
                bArr[0] = 4;
            }
            zza2 = zzaaj.zza(bArr);
            zza3 = zzaal.zza(zzne.zza(((ECPrivateKey) zza5.getPrivate()).getS(), zzmk.zza(zzkgVar.zze())), zzbf.zza());
        }
        return zzki.zza(zzkq.zza(zzkgVar, zza2, num), zza3);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zziv.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
        }
        zzkl.zza();
        zzox zza2 = zzox.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzkg.zzc().zza(zzkg.zze.zza).zza(zzkg.zzf.zzd).zza(zzkg.zzc.zza).zza(zzkg.zzb.zza).zza());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzkg.zzc().zza(zzkg.zze.zzc).zza(zzkg.zzf.zzd).zza(zzkg.zzc.zza).zza(zzkg.zzb.zza).zza());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzkg.zzc().zza(zzkg.zze.zza).zza(zzkg.zzf.zzd).zza(zzkg.zzc.zza).zza(zzkg.zzb.zzb).zza());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzkg.zzc().zza(zzkg.zze.zzc).zza(zzkg.zzf.zzd).zza(zzkg.zzc.zza).zza(zzkg.zzb.zzb).zza());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzkg.zzc().zza(zzkg.zze.zza).zza(zzkg.zzf.zzd).zza(zzkg.zzc.zza).zza(zzkg.zzb.zzc).zza());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzkg.zzc().zza(zzkg.zze.zzc).zza(zzkg.zzf.zzd).zza(zzkg.zzc.zza).zza(zzkg.zzb.zzc).zza());
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzkg.zzc().zza(zzkg.zze.zza).zza(zzkg.zzf.zza).zza(zzkg.zzc.zza).zza(zzkg.zzb.zza).zza());
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzkg.zzc().zza(zzkg.zze.zzc).zza(zzkg.zzf.zza).zza(zzkg.zzc.zza).zza(zzkg.zzb.zza).zza());
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzkg.zzc().zza(zzkg.zze.zza).zza(zzkg.zzf.zza).zza(zzkg.zzc.zza).zza(zzkg.zzb.zzb).zza());
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzkg.zzc().zza(zzkg.zze.zzc).zza(zzkg.zzf.zza).zza(zzkg.zzc.zza).zza(zzkg.zzb.zzb).zza());
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzkg.zzc().zza(zzkg.zze.zza).zza(zzkg.zzf.zzb).zza(zzkg.zzc.zzb).zza(zzkg.zzb.zza).zza());
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzkg.zzc().zza(zzkg.zze.zzc).zza(zzkg.zzf.zzb).zza(zzkg.zzc.zzb).zza(zzkg.zzb.zza).zza());
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzkg.zzc().zza(zzkg.zze.zza).zza(zzkg.zzf.zzb).zza(zzkg.zzc.zzb).zza(zzkg.zzb.zzb).zza());
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzkg.zzc().zza(zzkg.zze.zzc).zza(zzkg.zzf.zzb).zza(zzkg.zzc.zzb).zza(zzkg.zzb.zzb).zza());
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzkg.zzc().zza(zzkg.zze.zza).zza(zzkg.zzf.zzc).zza(zzkg.zzc.zzc).zza(zzkg.zzb.zza).zza());
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzkg.zzc().zza(zzkg.zze.zzc).zza(zzkg.zzf.zzc).zza(zzkg.zzc.zzc).zza(zzkg.zzb.zza).zza());
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzkg.zzc().zza(zzkg.zze.zza).zza(zzkg.zzf.zzc).zza(zzkg.zzc.zzc).zza(zzkg.zzb.zzb).zza());
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzkg.zzc().zza(zzkg.zze.zzc).zza(zzkg.zzf.zzc).zza(zzkg.zzc.zzc).zza(zzkg.zzb.zzb).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zzpa.zza().zza(zza);
        zzpa.zza().zza(zzb);
        zzop.zza().zza(zze, zzkg.class);
        zznq.zza().zza((zzbh) zzc, true);
        zznq.zza().zza((zzbh) zzd, false);
    }
}
