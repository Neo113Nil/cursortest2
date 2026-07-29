package org.bouncycastle.math.ec.rfc8032;

import androidx.core.view.PointerIconCompat;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes3.dex */
abstract class Scalar25519 {
    private static final int L0 = -50998291;
    private static final int L1 = 19280294;
    private static final int L2 = 127719000;
    private static final int L3 = -6428113;
    private static final int L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int SCALAR_BYTES = 32;
    static final int SIZE = 8;
    private static final int TARGET_LENGTH = 254;
    private static final int[] L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    Scalar25519() {
    }

    static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, L);
    }

    static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    static void getOrderWnafVar(int i, byte[] bArr) {
        Wnaf.getSignedVar(L, i, bArr);
    }

    static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[48];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce384(bArr), iArr3);
    }

    static byte[] reduce384(byte[] bArr) {
        long decode24 = Codec.decode24(bArr, 32) << 4;
        long j = decode24 & 4294967295L;
        long decode32 = Codec.decode32(bArr, 35);
        long j2 = decode32 & 4294967295L;
        long decode242 = Codec.decode24(bArr, 39) << 4;
        long j3 = decode242 & 4294967295L;
        long decode322 = Codec.decode32(bArr, 42);
        long decode16 = ((Codec.decode16(bArr, 46) << 4) & 4294967295L) + ((decode322 & 4294967295L) >> 28);
        long decode323 = (Codec.decode32(bArr, 28) & 4294967295L) - (decode16 * 5343);
        long j4 = (decode322 & M28L) + (j3 >> 28);
        long decode324 = ((Codec.decode32(bArr, 14) & 4294967295L) - (decode16 * (-50998291))) - (j4 * 19280294);
        long decode243 = (((Codec.decode24(bArr, 18) << 4) & 4294967295L) - (decode16 * 19280294)) - (j4 * 127719000);
        long decode325 = ((Codec.decode32(bArr, 21) & 4294967295L) - (decode16 * 127719000)) - (j4 * (-6428113));
        long decode244 = (((Codec.decode24(bArr, 25) << 4) & 4294967295L) - (decode16 * (-6428113))) - (j4 * 5343);
        long j5 = (decode242 & M28L) + (j2 >> 28);
        long decode326 = (Codec.decode32(bArr, 7) & 4294967295L) - (j5 * (-50998291));
        long decode245 = (((Codec.decode24(bArr, 11) << 4) & 4294967295L) - (j4 * (-50998291))) - (j5 * 19280294);
        long j6 = decode324 - (j5 * 127719000);
        long j7 = decode243 - (j5 * (-6428113));
        long j8 = decode325 - (j5 * 5343);
        long j9 = (decode32 & M28L) + (j >> 28);
        long j10 = decode24 & M28L;
        long decode246 = ((Codec.decode24(bArr, 4) << 4) & 4294967295L) - (j9 * (-50998291));
        long j11 = decode326 - (j9 * 19280294);
        long j12 = decode245 - (j9 * 127719000);
        long j13 = j6 - (j9 * (-6428113));
        long j14 = j7 - (j9 * 5343);
        long j15 = decode323 + (decode244 >> 28);
        long j16 = decode244 & M28L;
        long j17 = j10 + (j15 >> 28);
        long j18 = j15 & M28L;
        long j19 = j18 >>> 27;
        long j20 = j17 + j19;
        long decode327 = (Codec.decode32(bArr, 0) & 4294967295L) - (j20 * (-50998291));
        long j21 = j11 - (j20 * 127719000);
        long j22 = j12 - (j20 * (-6428113));
        long j23 = j13 - (j20 * 5343);
        long j24 = (decode246 - (j20 * 19280294)) + (decode327 >> 28);
        long j25 = decode327 & M28L;
        long j26 = j21 + (j24 >> 28);
        long j27 = j24 & M28L;
        long j28 = j22 + (j26 >> 28);
        long j29 = j26 & M28L;
        long j30 = j23 + (j28 >> 28);
        long j31 = j28 & M28L;
        long j32 = j14 + (j30 >> 28);
        long j33 = j30 & M28L;
        long j34 = j8 + (j32 >> 28);
        long j35 = j32 & M28L;
        long j36 = j16 + (j34 >> 28);
        long j37 = j34 & M28L;
        long j38 = j18 + (j36 >> 28);
        long j39 = j36 & M28L;
        long j40 = j38 >> 28;
        long j41 = j38 & M28L;
        long j42 = j40 - j19;
        long j43 = j25 + (j42 & (-50998291));
        long j44 = j27 + (j42 & 19280294) + (j43 >> 28);
        long j45 = j43 & M28L;
        long j46 = j29 + (j42 & 127719000) + (j44 >> 28);
        long j47 = j44 & M28L;
        long j48 = j31 + (j42 & (-6428113)) + (j46 >> 28);
        long j49 = j46 & M28L;
        long j50 = j33 + (j42 & 5343) + (j48 >> 28);
        long j51 = j48 & M28L;
        long j52 = j35 + (j50 >> 28);
        long j53 = j50 & M28L;
        long j54 = j37 + (j52 >> 28);
        long j55 = j52 & M28L;
        long j56 = j39 + (j54 >> 28);
        long j57 = j54 & M28L;
        long j58 = j41 + (j56 >> 28);
        long j59 = M28L & j56;
        byte[] bArr2 = new byte[64];
        Codec.encode56(j45 | (j47 << 28), bArr2, 0);
        Codec.encode56(j49 | (j51 << 28), bArr2, 7);
        Codec.encode56((j55 << 28) | j53, bArr2, 14);
        Codec.encode56((j59 << 28) | j57, bArr2, 21);
        Codec.encode32((int) j58, bArr2, 28);
        return bArr2;
    }

    static byte[] reduce512(byte[] bArr) {
        long decode32 = Codec.decode32(bArr, 49);
        long j = decode32 & 4294967295L;
        long decode322 = Codec.decode32(bArr, 56);
        long j2 = bArr[63] & 255;
        long decode24 = ((Codec.decode24(bArr, 60) << 4) & 4294967295L) + ((decode322 & 4294967295L) >> 28);
        long j3 = decode322 & M28L;
        long decode323 = ((Codec.decode32(bArr, 42) & 4294967295L) - (j2 * (-6428113))) - (decode24 * 5343);
        long decode324 = ((Codec.decode32(bArr, 28) & 4294967295L) - (decode24 * (-50998291))) - (j3 * 19280294);
        long decode242 = ((((Codec.decode24(bArr, 32) << 4) & 4294967295L) - (j2 * (-50998291))) - (decode24 * 19280294)) - (j3 * 127719000);
        long decode325 = (((Codec.decode32(bArr, 35) & 4294967295L) - (j2 * 19280294)) - (decode24 * 127719000)) - (j3 * (-6428113));
        long decode243 = ((((Codec.decode24(bArr, 39) << 4) & 4294967295L) - (j2 * 127719000)) - (decode24 * (-6428113))) - (j3 * 5343);
        long decode244 = ((Codec.decode24(bArr, 53) << 4) & 4294967295L) + (j >> 28);
        long j4 = decode32 & M28L;
        long j5 = decode325 - (decode244 * 5343);
        long j6 = (decode242 - (decode244 * (-6428113))) - (j4 * 5343);
        long decode245 = (((Codec.decode24(bArr, 46) << 4) & 4294967295L) - (j2 * 5343)) + (decode323 >> 28);
        long decode326 = (((Codec.decode32(bArr, 21) & 4294967295L) - (decode244 * (-50998291))) - (j4 * 19280294)) - (decode245 * 127719000);
        long decode246 = (((((Codec.decode24(bArr, 25) << 4) & 4294967295L) - (j3 * (-50998291))) - (decode244 * 19280294)) - (j4 * 127719000)) - (decode245 * (-6428113));
        long j7 = ((decode324 - (decode244 * 127719000)) - (j4 * (-6428113))) - (decode245 * 5343);
        long j8 = (decode323 & M28L) + (decode243 >> 28);
        long decode327 = ((Codec.decode32(bArr, 14) & 4294967295L) - (decode245 * (-50998291))) - (j8 * 19280294);
        long decode247 = ((((Codec.decode24(bArr, 18) << 4) & 4294967295L) - (j4 * (-50998291))) - (decode245 * 19280294)) - (j8 * 127719000);
        long j9 = decode246 - (j8 * 5343);
        long j10 = (decode243 & M28L) + (j5 >> 28);
        long decode328 = (Codec.decode32(bArr, 7) & 4294967295L) - (j10 * (-50998291));
        long decode248 = (((Codec.decode24(bArr, 11) << 4) & 4294967295L) - (j8 * (-50998291))) - (j10 * 19280294);
        long j11 = decode327 - (j10 * 127719000);
        long j12 = decode247 - (j10 * (-6428113));
        long j13 = (decode326 - (j8 * (-6428113))) - (j10 * 5343);
        long j14 = (j5 & M28L) + (j6 >> 28);
        long j15 = j6 & M28L;
        long decode249 = ((Codec.decode24(bArr, 4) << 4) & 4294967295L) - (j14 * (-50998291));
        long j16 = decode328 - (j14 * 19280294);
        long j17 = decode248 - (j14 * 127719000);
        long j18 = j11 - (j14 * (-6428113));
        long j19 = j12 - (j14 * 5343);
        long j20 = j7 + (j9 >> 28);
        long j21 = j9 & M28L;
        long j22 = j15 + (j20 >> 28);
        long j23 = j20 & M28L;
        long j24 = j23 >>> 27;
        long j25 = j22 + j24;
        long decode329 = (Codec.decode32(bArr, 0) & 4294967295L) - (j25 * (-50998291));
        long j26 = j16 - (j25 * 127719000);
        long j27 = j17 - (j25 * (-6428113));
        long j28 = j18 - (j25 * 5343);
        long j29 = (decode249 - (j25 * 19280294)) + (decode329 >> 28);
        long j30 = decode329 & M28L;
        long j31 = j26 + (j29 >> 28);
        long j32 = j29 & M28L;
        long j33 = j27 + (j31 >> 28);
        long j34 = j31 & M28L;
        long j35 = j28 + (j33 >> 28);
        long j36 = j33 & M28L;
        long j37 = j19 + (j35 >> 28);
        long j38 = j35 & M28L;
        long j39 = j13 + (j37 >> 28);
        long j40 = j37 & M28L;
        long j41 = j21 + (j39 >> 28);
        long j42 = j39 & M28L;
        long j43 = j23 + (j41 >> 28);
        long j44 = j41 & M28L;
        long j45 = j43 >> 28;
        long j46 = j43 & M28L;
        long j47 = j45 - j24;
        long j48 = j30 + (j47 & (-50998291));
        long j49 = j32 + (j47 & 19280294) + (j48 >> 28);
        long j50 = j48 & M28L;
        long j51 = j34 + (j47 & 127719000) + (j49 >> 28);
        long j52 = j49 & M28L;
        long j53 = j36 + (j47 & (-6428113)) + (j51 >> 28);
        long j54 = j51 & M28L;
        long j55 = j38 + (j47 & 5343) + (j53 >> 28);
        long j56 = j53 & M28L;
        long j57 = j40 + (j55 >> 28);
        long j58 = j55 & M28L;
        long j59 = j42 + (j57 >> 28);
        long j60 = j57 & M28L;
        long j61 = j44 + (j59 >> 28);
        long j62 = j59 & M28L;
        long j63 = j46 + (j61 >> 28);
        long j64 = j61 & M28L;
        byte[] bArr2 = new byte[32];
        Codec.encode56(j50 | (j52 << 28), bArr2, 0);
        Codec.encode56(j54 | (j56 << 28), bArr2, 7);
        Codec.encode56((j60 << 28) | j58, bArr2, 14);
        Codec.encode56((j64 << 28) | j62, bArr2, 21);
        Codec.encode32((int) j63, bArr2, 28);
        return bArr2;
    }

    static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[4];
        System.arraycopy(iArr7, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        System.arraycopy(iArr, 0, iArr10, 0, 4);
        int[] iArr11 = new int[4];
        iArr11[0] = 1;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int i = PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
        int[] iArr12 = iArr11;
        int[] iArr13 = new int[4];
        int[] iArr14 = iArr9;
        int[] iArr15 = iArr10;
        int i2 = 15;
        int i3 = bitLengthPositive;
        int[] iArr16 = iArr4;
        int[] iArr17 = iArr5;
        while (i3 > TARGET_LENGTH) {
            i--;
            if (i < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i2, iArr6) - i3;
            int i4 = bitLength & (~(bitLength >> 31));
            if (iArr6[i2] < 0) {
                ScalarUtil.addShifted_NP(i2, i4, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.addShifted_UV(3, i4, iArr14, iArr13, iArr15, iArr12);
            } else {
                ScalarUtil.subShifted_NP(i2, i4, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.subShifted_UV(3, i4, iArr14, iArr13, iArr15, iArr12);
            }
            int[] iArr18 = iArr15;
            int[] iArr19 = iArr12;
            if (ScalarUtil.lessThan(i2, iArr16, iArr17)) {
                int i5 = i3 >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i5, iArr16);
                int[] iArr20 = iArr17;
                iArr17 = iArr16;
                iArr16 = iArr20;
                i2 = i5;
                i3 = bitLengthPositive2;
                iArr15 = iArr14;
                iArr12 = iArr13;
                iArr13 = iArr19;
                iArr14 = iArr18;
            } else {
                iArr12 = iArr19;
                iArr15 = iArr18;
            }
        }
        System.arraycopy(iArr15, 0, iArr2, 0, 4);
        System.arraycopy(iArr12, 0, iArr3, 0, 4);
        return true;
    }

    static void toSignedDigits(int i, int[] iArr) {
        Nat.caddTo(8, (~iArr[0]) & 1, L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
    }
}
