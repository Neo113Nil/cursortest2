package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.Enums;
import com.google.errorprone.annotations.Immutable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

@Immutable
/* loaded from: classes6.dex */
public final class RsaSsaPssVerifyJce implements PublicKeyVerify {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final Enums.HashType mgf1Hash;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssVerifyJce(final RSAPublicKey pubKey, Enums.HashType sigHash, Enums.HashType mgf1Hash, int saltLength) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateSignatureHash(sigHash);
        Validators.validateRsaModulusSize(pubKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(pubKey.getPublicExponent());
        this.publicKey = pubKey;
        this.sigHash = sigHash;
        this.mgf1Hash = mgf1Hash;
        this.saltLength = saltLength;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(final byte[] signature, final byte[] data) throws GeneralSecurityException {
        BigInteger publicExponent = this.publicKey.getPublicExponent();
        BigInteger modulus = this.publicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        int bitLength2 = (modulus.bitLength() + 6) / 8;
        if (bitLength != signature.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bytes2Integer = SubtleUtil.bytes2Integer(signature);
        if (bytes2Integer.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        emsaPssVerify(data, SubtleUtil.integer2Bytes(bytes2Integer.modPow(publicExponent, modulus), bitLength2), modulus.bitLength() - 1);
    }

    private void emsaPssVerify(byte[] m, byte[] em, int emBits) throws GeneralSecurityException {
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] digest = engineFactory.digest(m);
        int digestLength = engineFactory.getDigestLength();
        int length = em.length;
        if (length < this.saltLength + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        byte b = 1;
        if (em[em.length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i = (length - digestLength) - 1;
        byte[] copyOf = Arrays.copyOf(em, i);
        byte[] copyOfRange = Arrays.copyOfRange(em, copyOf.length, copyOf.length + digestLength);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            byte b2 = b;
            int i4 = i;
            long j = (length * 8) - emBits;
            if (i2 < j) {
                if (((copyOf[i3 / 8] >> (7 - (i3 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i2 = i3 + 1;
                b = b2;
                i = i4;
            } else {
                byte[] mgf1 = SubtleUtil.mgf1(copyOfRange, i4, this.mgf1Hash);
                int length2 = mgf1.length;
                byte[] bArr = new byte[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    bArr[i5] = (byte) (mgf1[i5] ^ copyOf[i5]);
                }
                for (int i6 = 0; i6 <= j; i6++) {
                    int i7 = i6 / 8;
                    bArr[i7] = (byte) ((~(b2 << (7 - (i6 % 8)))) & bArr[i7]);
                }
                int i8 = 0;
                while (true) {
                    int i9 = this.saltLength;
                    if (i8 < (r6 - i9) - 2) {
                        if (bArr[i8] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        i8++;
                    } else {
                        if (bArr[(r6 - i9) - 2] != b2) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - i9, length2);
                        int i10 = digestLength + 8;
                        byte[] bArr2 = new byte[this.saltLength + i10];
                        System.arraycopy(digest, 0, bArr2, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr2, i10, copyOfRange2.length);
                        if (!Bytes.equal(engineFactory.digest(bArr2), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                }
            }
        }
    }
}
