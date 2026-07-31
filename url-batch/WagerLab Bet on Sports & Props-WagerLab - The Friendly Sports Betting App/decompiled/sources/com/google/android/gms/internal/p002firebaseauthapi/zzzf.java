package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzzf {
    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (zznj.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    private static BigInteger zza(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger zza = zznj.zza(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(zza);
        if (zza.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger mod2 = mod.mod(zza);
        if (mod2.equals(BigInteger.ZERO)) {
            bigInteger3 = BigInteger.ZERO;
        } else {
            if (zza.testBit(0) && zza.testBit(1)) {
                bigInteger2 = mod2.modPow(zza.add(BigInteger.ONE).shiftRight(2), zza);
            } else if (!zza.testBit(0) || zza.testBit(1)) {
                bigInteger2 = null;
            } else {
                bigInteger2 = BigInteger.ONE;
                BigInteger shiftRight = zza.subtract(BigInteger.ONE).shiftRight(1);
                int i = 0;
                while (true) {
                    BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(zza);
                    if (mod3.equals(BigInteger.ZERO)) {
                        break;
                    }
                    BigInteger modPow = mod3.modPow(shiftRight, zza);
                    if (!modPow.add(BigInteger.ONE).equals(zza)) {
                        if (!modPow.equals(BigInteger.ONE)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                        bigInteger2 = bigInteger2.add(BigInteger.ONE);
                        i++;
                        if (i == 128 && !zza.isProbablePrime(80)) {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    } else {
                        BigInteger shiftRight2 = zza.add(BigInteger.ONE).shiftRight(1);
                        BigInteger bigInteger4 = BigInteger.ONE;
                        BigInteger bigInteger5 = bigInteger2;
                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                            BigInteger multiply = bigInteger5.multiply(bigInteger4);
                            bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(zza).multiply(mod3)).mod(zza);
                            bigInteger4 = multiply.add(multiply).mod(zza);
                            if (shiftRight2.testBit(bitLength)) {
                                BigInteger mod4 = bigInteger5.multiply(bigInteger2).add(bigInteger4.multiply(mod3)).mod(zza);
                                bigInteger4 = bigInteger2.multiply(bigInteger4).add(bigInteger5).mod(zza);
                                bigInteger5 = mod4;
                            }
                        }
                        bigInteger2 = bigInteger5;
                    }
                }
            }
            if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(zza).compareTo(mod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
            bigInteger3 = bigInteger2;
        }
        return z != bigInteger3.testBit(0) ? zza.subtract(bigInteger3).mod(zza) : bigInteger3;
    }

    public static KeyPair zza(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator zza = zzzj.zzd.zza("EC");
        zza.initialize(eCParameterSpec);
        return zza.generateKeyPair();
    }

    public static ECPrivateKey zza(zzzi zzziVar, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) zzzj.zze.zza("EC").generatePrivate(new ECPrivateKeySpec(zzne.zza(bArr), zza(zzziVar)));
    }

    public static ECPublicKey zza(ECParameterSpec eCParameterSpec, zzzh zzzhVar, byte[] bArr) throws GeneralSecurityException {
        return (ECPublicKey) zzzj.zze.zza("EC").generatePublic(new ECPublicKeySpec(zza(eCParameterSpec.getCurve(), zzzhVar, bArr), eCParameterSpec));
    }

    public static ECParameterSpec zza(zzzi zzziVar) throws NoSuchAlgorithmException {
        int ordinal = zzziVar.ordinal();
        if (ordinal == 0) {
            return zznj.zza;
        }
        if (ordinal == 1) {
            return zznj.zzb;
        }
        if (ordinal == 2) {
            return zznj.zzc;
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + String.valueOf(zzziVar));
    }

    public static ECPoint zza(EllipticCurve ellipticCurve, zzzh zzzhVar, byte[] bArr) throws GeneralSecurityException {
        int zza = zza(ellipticCurve);
        int ordinal = zzzhVar.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            if (bArr.length != (zza * 2) + 1) {
                throw new GeneralSecurityException("invalid point size");
            }
            if (bArr[0] != 4) {
                throw new GeneralSecurityException("invalid point format");
            }
            int i = zza + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, bArr.length)));
            zznj.zza(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (bArr.length != zza * 2) {
                    throw new GeneralSecurityException("invalid point size");
                }
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, zza)), new BigInteger(1, Arrays.copyOfRange(bArr, zza, bArr.length)));
                zznj.zza(eCPoint2, ellipticCurve);
                return eCPoint2;
            }
            throw new GeneralSecurityException("invalid format:" + String.valueOf(zzzhVar));
        }
        BigInteger zza2 = zznj.zza(ellipticCurve);
        if (bArr.length != zza + 1) {
            throw new GeneralSecurityException("compressed point has wrong length");
        }
        byte b = bArr[0];
        if (b != 2) {
            if (b != 3) {
                throw new GeneralSecurityException("invalid format");
            }
            z = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() == -1 || bigInteger.compareTo(zza2) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        return new ECPoint(bigInteger, zza(bigInteger, z, ellipticCurve));
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        try {
            if (!zznj.zza(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            return zza(eCPrivateKey, eCPublicKey.getW());
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    private static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        zznj.zza(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = zzzj.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement zza = zzzj.zzc.zza("ECDH");
        zza.init(eCPrivateKey);
        try {
            zza.doPhase(generatePublic, true);
            byte[] generateSecret = zza.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(zznj.zza(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            zza(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
