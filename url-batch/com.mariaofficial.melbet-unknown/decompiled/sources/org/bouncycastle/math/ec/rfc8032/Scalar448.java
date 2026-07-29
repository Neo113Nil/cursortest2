package org.bouncycastle.math.ec.rfc8032;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.location.LocationRequestCompat;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;

/* loaded from: classes3.dex */
abstract class Scalar448 {
    private static final int L4_0 = 43969588;
    private static final int L4_1 = 30366549;
    private static final int L4_2 = 163752818;
    private static final int L4_3 = 258169998;
    private static final int L4_4 = 96434764;
    private static final int L4_5 = 227822194;
    private static final int L4_6 = 149865618;
    private static final int L4_7 = 550336261;
    private static final int L_0 = 78101261;
    private static final int L_1 = 141809365;
    private static final int L_2 = 175155932;
    private static final int L_3 = 64542499;
    private static final int L_4 = 158326419;
    private static final int L_5 = 191173276;
    private static final int L_6 = 104575268;
    private static final int L_7 = 137584065;
    private static final long M26L = 67108863;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int SCALAR_BYTES = 57;
    static final int SIZE = 14;
    private static final int TARGET_LENGTH = 447;
    private static final int[] L = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};
    private static final int[] LSq = {463601321, -1045562440, 1239460018, -1189350089, -412821483, 1160071467, -1564970643, 1256291574, -1170454588, -240530412, 2118977290, -1845154869, -1618855054, -1019204973, 1437344377, -1849925303, 1189267370, 280387897, -680846520, -500732508, -1100672524, -1, -1, -1, -1, -1, -1, 268435455};

    Scalar448() {
    }

    static boolean checkVar(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        decode(bArr, iArr);
        return !Nat.gte(14, iArr, L);
    }

    static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 14);
    }

    static void getOrderWnafVar(int i, byte[] bArr) {
        Wnaf.getSignedVar(L, i, bArr);
    }

    static void multiply225Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[22];
        Nat.mul(iArr2, 0, 8, iArr, 0, 14, iArr4, 0);
        if (iArr2[7] < 0) {
            Nat.addTo(14, L, 0, iArr4, 8);
            Nat.subFrom(14, iArr, 0, iArr4, 8);
        }
        byte[] bArr = new byte[88];
        Codec.encode32(iArr4, 0, 22, bArr, 0);
        decode(reduce704(bArr), iArr3);
    }

    static byte[] reduce704(byte[] bArr) {
        long decode24 = Codec.decode24(bArr, 60) << 4;
        long j = decode24 & 4294967295L;
        long decode32 = Codec.decode32(bArr, 70);
        long j2 = decode32 & 4294967295L;
        long decode322 = Codec.decode32(bArr, 84);
        long j3 = (decode322 & 4294967295L) >>> 28;
        long j4 = decode322 & M28L;
        long decode242 = ((Codec.decode24(bArr, 74) << 4) & 4294967295L) + (j2 >>> 28);
        long j5 = decode32 & M28L;
        long decode323 = (Codec.decode32(bArr, 77) & 4294967295L) + (decode242 >>> 28);
        long j6 = decode242 & M28L;
        long decode243 = ((Codec.decode24(bArr, 81) << 4) & 4294967295L) + (decode323 >>> 28);
        long j7 = decode323 & M28L;
        long j8 = j4 + (decode243 >>> 28);
        long j9 = decode243 & M28L;
        long decode244 = ((Codec.decode24(bArr, 53) << 4) & 4294967295L) + (j3 * 149865618) + (j8 * 550336261);
        long decode245 = ((Codec.decode24(bArr, 46) << 4) & 4294967295L) + (j3 * 96434764) + (j8 * 227822194) + (j9 * 149865618);
        long decode324 = (Codec.decode32(bArr, 49) & 4294967295L) + (j3 * 227822194) + (j8 * 149865618) + (j9 * 550336261);
        long decode325 = (Codec.decode32(bArr, 28) & 4294967295L) + (j8 * 43969588) + (j9 * 30366549) + (j7 * 163752818);
        long decode246 = ((Codec.decode24(bArr, 32) << 4) & 4294967295L) + (j3 * 43969588) + (j8 * 30366549) + (j9 * 163752818) + (j7 * 258169998);
        long decode326 = (Codec.decode32(bArr, 35) & 4294967295L) + (j3 * 30366549) + (j8 * 163752818) + (j9 * 258169998) + (j7 * 96434764);
        long decode247 = ((Codec.decode24(bArr, 39) << 4) & 4294967295L) + (j3 * 163752818) + (j8 * 258169998) + (j9 * 96434764) + (j7 * 227822194);
        long decode327 = (Codec.decode32(bArr, 42) & 4294967295L) + (j3 * 258169998) + (j8 * 96434764) + (j9 * 227822194) + (j7 * 149865618);
        long decode328 = (Codec.decode32(bArr, 63) & 4294967295L) + (j >>> 28);
        long j10 = decode24 & M28L;
        long decode248 = ((Codec.decode24(bArr, 67) << 4) & 4294967295L) + (decode328 >>> 28);
        long j11 = decode328 & M28L;
        long j12 = j5 + (decode248 >>> 28);
        long j13 = decode248 & M28L;
        long j14 = j6 + (j12 >>> 28);
        long j15 = j12 & M28L;
        long j16 = decode247 + (j14 * 149865618);
        long j17 = decode327 + (j14 * 550336261);
        long decode249 = ((Codec.decode24(bArr, 18) << 4) & 4294967295L) + (j14 * 43969588) + (j15 * 30366549) + (j13 * 163752818);
        long decode329 = (Codec.decode32(bArr, 21) & 4294967295L) + (j7 * 43969588) + (j14 * 30366549) + (j15 * 163752818) + (j13 * 258169998);
        long decode2410 = ((Codec.decode24(bArr, 25) << 4) & 4294967295L) + (j9 * 43969588) + (j7 * 30366549) + (j14 * 163752818) + (j15 * 258169998) + (j13 * 96434764);
        long j18 = decode325 + (j14 * 258169998) + (j15 * 96434764) + (j13 * 227822194);
        long j19 = decode246 + (j14 * 96434764) + (j15 * 227822194) + (j13 * 149865618);
        long j20 = decode326 + (j14 * 227822194) + (j15 * 149865618) + (j13 * 550336261);
        long j21 = decode244 + (decode324 >>> 28);
        long j22 = decode324 & M28L;
        long decode3210 = (Codec.decode32(bArr, 56) & 4294967295L) + (j3 * 550336261) + (j21 >>> 28);
        long j23 = j21 & M28L;
        long j24 = j10 + (decode3210 >>> 28);
        long j25 = decode3210 & M28L;
        long j26 = j11 + (j24 >>> 28);
        long j27 = j24 & M28L;
        long decode3211 = (Codec.decode32(bArr, 7) & 4294967295L) + (j26 * 43969588);
        long j28 = j18 + (j26 * 149865618);
        long j29 = j19 + (j26 * 550336261);
        long j30 = j21 & M26L;
        long j31 = (j25 * 4) + (j23 >>> 26) + 1;
        long decode3212 = (Codec.decode32(bArr, 0) & 4294967295L) + (78101261 * j31);
        long j32 = decode3211 + (30366549 * j27) + (175155932 * j31);
        long decode2411 = ((Codec.decode24(bArr, 11) << 4) & 4294967295L) + (j13 * 43969588) + (j26 * 30366549) + (163752818 * j27) + (64542499 * j31);
        long decode3213 = (Codec.decode32(bArr, 14) & 4294967295L) + (j15 * 43969588) + (j13 * 30366549) + (j26 * 163752818) + (258169998 * j27) + (158326419 * j31);
        long j33 = decode249 + (j26 * 258169998) + (96434764 * j27) + (191173276 * j31);
        long j34 = decode329 + (j26 * 96434764) + (227822194 * j27) + (104575268 * j31);
        long j35 = decode2410 + (j26 * 227822194) + (149865618 * j27) + (j31 * 137584065);
        long decode2412 = ((Codec.decode24(bArr, 4) << 4) & 4294967295L) + (43969588 * j27) + (141809365 * j31) + (decode3212 >>> 28);
        long j36 = decode3212 & M28L;
        long j37 = j32 + (decode2412 >>> 28);
        long j38 = decode2412 & M28L;
        long j39 = decode2411 + (j37 >>> 28);
        long j40 = j37 & M28L;
        long j41 = decode3213 + (j39 >>> 28);
        long j42 = j39 & M28L;
        long j43 = j33 + (j41 >>> 28);
        long j44 = j41 & M28L;
        long j45 = j34 + (j43 >>> 28);
        long j46 = j43 & M28L;
        long j47 = j35 + (j45 >>> 28);
        long j48 = j45 & M28L;
        long j49 = j28 + (j27 * 550336261) + (j47 >>> 28);
        long j50 = j47 & M28L;
        long j51 = j29 + (j49 >>> 28);
        long j52 = j49 & M28L;
        long j53 = j20 + (j51 >>> 28);
        long j54 = j51 & M28L;
        long j55 = j16 + (j15 * 550336261) + (j53 >>> 28);
        long j56 = j53 & M28L;
        long j57 = j17 + (j55 >>> 28);
        long j58 = j55 & M28L;
        long j59 = decode245 + (j7 * 550336261) + (j57 >>> 28);
        long j60 = j57 & M28L;
        long j61 = j22 + (j59 >>> 28);
        long j62 = j59 & M28L;
        long j63 = j30 + (j61 >>> 28);
        long j64 = j61 & M28L;
        long j65 = j63 & M26L;
        long j66 = (j63 >>> 26) - 1;
        long j67 = j36 - (j66 & 78101261);
        long j68 = (j38 - (j66 & 141809365)) + (j67 >> 28);
        long j69 = j67 & M28L;
        long j70 = (j40 - (j66 & 175155932)) + (j68 >> 28);
        long j71 = j68 & M28L;
        long j72 = (j42 - (j66 & 64542499)) + (j70 >> 28);
        long j73 = j70 & M28L;
        long j74 = (j44 - (j66 & 158326419)) + (j72 >> 28);
        long j75 = j72 & M28L;
        long j76 = (j46 - (j66 & 191173276)) + (j74 >> 28);
        long j77 = j74 & M28L;
        long j78 = (j48 - (j66 & 104575268)) + (j76 >> 28);
        long j79 = j76 & M28L;
        long j80 = (j50 - (j66 & 137584065)) + (j78 >> 28);
        long j81 = j78 & M28L;
        long j82 = j52 + (j80 >> 28);
        long j83 = j80 & M28L;
        long j84 = j54 + (j82 >> 28);
        long j85 = j82 & M28L;
        long j86 = j56 + (j84 >> 28);
        long j87 = j84 & M28L;
        long j88 = j58 + (j86 >> 28);
        long j89 = j86 & M28L;
        long j90 = j60 + (j88 >> 28);
        long j91 = j88 & M28L;
        long j92 = j62 + (j90 >> 28);
        long j93 = j90 & M28L;
        long j94 = j64 + (j92 >> 28);
        long j95 = j92 & M28L;
        long j96 = j94 & M28L;
        byte[] bArr2 = new byte[57];
        Codec.encode56(j69 | (j71 << 28), bArr2, 0);
        Codec.encode56(j73 | (j75 << 28), bArr2, 7);
        Codec.encode56((j79 << 28) | j77, bArr2, 14);
        Codec.encode56((j83 << 28) | j81, bArr2, 21);
        Codec.encode56((j87 << 28) | j85, bArr2, 28);
        Codec.encode56(j89 | (j91 << 28), bArr2, 35);
        Codec.encode56(j93 | (j95 << 28), bArr2, 42);
        Codec.encode56(j96 | ((j65 + (j94 >> 28)) << 28), bArr2, 49);
        return bArr2;
    }

    static byte[] reduce912(byte[] bArr) {
        long decode32 = Codec.decode32(bArr, 84);
        long j = decode32 & 4294967295L;
        long decode322 = Codec.decode32(bArr, 91);
        long j2 = decode322 & 4294967295L;
        long decode323 = Codec.decode32(bArr, 98);
        long j3 = decode323 & 4294967295L;
        long decode324 = Codec.decode32(bArr, 105);
        long j4 = decode324 & 4294967295L;
        long decode16 = Codec.decode16(bArr, 112) & 4294967295L;
        long decode24 = ((Codec.decode24(bArr, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY) << 4) & 4294967295L) + (j4 >>> 28);
        long j5 = decode324 & M28L;
        long decode242 = ((Codec.decode24(bArr, 74) << 4) & 4294967295L) + (decode16 * 227822194) + (decode24 * 149865618);
        long decode325 = (Codec.decode32(bArr, 77) & 4294967295L) + (decode16 * 149865618) + (decode24 * 550336261);
        long decode243 = ((Codec.decode24(bArr, 53) << 4) & 4294967295L) + (decode24 * 43969588) + (j5 * 30366549);
        long decode326 = (Codec.decode32(bArr, 56) & 4294967295L) + (decode16 * 43969588) + (decode24 * 30366549) + (j5 * 163752818);
        long decode244 = ((Codec.decode24(bArr, 60) << 4) & 4294967295L) + (decode16 * 30366549) + (decode24 * 163752818) + (j5 * 258169998);
        long decode327 = (Codec.decode32(bArr, 63) & 4294967295L) + (decode16 * 163752818) + (decode24 * 258169998) + (j5 * 96434764);
        long decode245 = ((Codec.decode24(bArr, 67) << 4) & 4294967295L) + (decode16 * 258169998) + (decode24 * 96434764) + (j5 * 227822194);
        long decode328 = (Codec.decode32(bArr, 70) & 4294967295L) + (decode16 * 96434764) + (decode24 * 227822194) + (j5 * 149865618);
        long decode246 = ((Codec.decode24(bArr, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY) << 4) & 4294967295L) + (j3 >>> 28);
        long j6 = decode323 & M28L;
        long j7 = decode245 + (decode246 * 149865618);
        long j8 = decode328 + (decode246 * 550336261);
        long decode247 = ((Codec.decode24(bArr, 46) << 4) & 4294967295L) + (decode246 * 43969588) + (j6 * 30366549);
        long decode329 = (Codec.decode32(bArr, 49) & 4294967295L) + (j5 * 43969588) + (decode246 * 30366549) + (j6 * 163752818);
        long j9 = decode243 + (decode246 * 163752818) + (j6 * 258169998);
        long j10 = decode326 + (decode246 * 258169998) + (j6 * 96434764);
        long j11 = decode244 + (decode246 * 96434764) + (j6 * 227822194);
        long j12 = decode327 + (decode246 * 227822194) + (j6 * 149865618);
        long decode248 = ((Codec.decode24(bArr, 95) << 4) & 4294967295L) + (j2 >>> 28);
        long j13 = decode322 & M28L;
        long j14 = j12 + (decode248 * 550336261);
        long decode249 = ((Codec.decode24(bArr, 39) << 4) & 4294967295L) + (decode248 * 43969588) + (j13 * 30366549);
        long decode3210 = (Codec.decode32(bArr, 42) & 4294967295L) + (j6 * 43969588) + (decode248 * 30366549) + (j13 * 163752818);
        long j15 = decode247 + (decode248 * 163752818) + (j13 * 258169998);
        long j16 = decode329 + (decode248 * 258169998) + (j13 * 96434764);
        long j17 = j9 + (decode248 * 96434764) + (j13 * 227822194);
        long j18 = j10 + (decode248 * 227822194) + (j13 * 149865618);
        long j19 = j11 + (decode248 * 149865618) + (j13 * 550336261);
        long decode2410 = ((Codec.decode24(bArr, 88) << 4) & 4294967295L) + (j >>> 28);
        long j20 = decode32 & M28L;
        long j21 = decode242 + (j5 * 550336261) + (j8 >>> 28);
        long j22 = j8 & M28L;
        long j23 = decode325 + (j21 >>> 28);
        long j24 = j21 & M28L;
        long decode2411 = ((Codec.decode24(bArr, 81) << 4) & 4294967295L) + (decode16 * 550336261) + (j23 >>> 28);
        long j25 = j23 & M28L;
        long j26 = j20 + (decode2411 >>> 28);
        long j27 = decode2411 & M28L;
        long j28 = j15 + (decode2410 * 96434764) + (j26 * 227822194) + (j27 * 149865618);
        long j29 = j16 + (decode2410 * 227822194) + (j26 * 149865618) + (j27 * 550336261);
        long decode2412 = ((Codec.decode24(bArr, 25) << 4) & 4294967295L) + (j27 * 43969588) + (j25 * 30366549);
        long decode3211 = (Codec.decode32(bArr, 28) & 4294967295L) + (j26 * 43969588) + (j27 * 30366549) + (j25 * 163752818);
        long decode2413 = ((Codec.decode24(bArr, 32) << 4) & 4294967295L) + (decode2410 * 43969588) + (j26 * 30366549) + (j27 * 163752818) + (j25 * 258169998);
        long decode3212 = (Codec.decode32(bArr, 35) & 4294967295L) + (j13 * 43969588) + (decode2410 * 30366549) + (j26 * 163752818) + (j27 * 258169998) + (j25 * 96434764);
        long j30 = decode249 + (decode2410 * 163752818) + (j26 * 258169998) + (j27 * 96434764) + (j25 * 227822194);
        long j31 = decode3210 + (decode2410 * 258169998) + (j26 * 96434764) + (j27 * 227822194) + (j25 * 149865618);
        long j32 = j14 + (j19 >>> 28);
        long j33 = j19 & M28L;
        long j34 = j7 + (j6 * 550336261) + (j32 >>> 28);
        long j35 = j32 & M28L;
        long j36 = j22 + (j34 >>> 28);
        long j37 = j34 & M28L;
        long j38 = j24 + (j36 >>> 28);
        long j39 = j36 & M28L;
        long decode2414 = ((Codec.decode24(bArr, 11) << 4) & 4294967295L) + (j37 * 43969588);
        long decode3213 = (Codec.decode32(bArr, 14) & 4294967295L) + (j39 * 43969588) + (j37 * 30366549);
        long decode2415 = ((Codec.decode24(bArr, 18) << 4) & 4294967295L) + (j38 * 43969588) + (j39 * 30366549) + (j37 * 163752818);
        long decode3214 = (Codec.decode32(bArr, 21) & 4294967295L) + (j25 * 43969588) + (j38 * 30366549) + (j39 * 163752818) + (j37 * 258169998);
        long j40 = decode2412 + (j38 * 163752818) + (j39 * 258169998) + (j37 * 96434764);
        long j41 = decode3211 + (j38 * 258169998) + (j39 * 96434764) + (j37 * 227822194);
        long j42 = decode2413 + (j38 * 96434764) + (j39 * 227822194) + (j37 * 149865618);
        long j43 = decode3212 + (j38 * 227822194) + (j39 * 149865618) + (j37 * 550336261);
        long j44 = j17 + (decode2410 * 149865618) + (j26 * 550336261) + (j29 >>> 28);
        long j45 = j29 & M28L;
        long j46 = j18 + (decode2410 * 550336261) + (j44 >>> 28);
        long j47 = j44 & M28L;
        long j48 = j33 + (j46 >>> 28);
        long j49 = j46 & M28L;
        long j50 = j35 + (j48 >>> 28);
        long j51 = j48 & M28L;
        long j52 = j44 & M26L;
        long j53 = (j49 * 4) + (j47 >>> 26) + 1;
        long decode3215 = (Codec.decode32(bArr, 0) & 4294967295L) + (78101261 * j53);
        long decode3216 = (Codec.decode32(bArr, 7) & 4294967295L) + (j50 * 43969588) + (30366549 * j51) + (175155932 * j53);
        long j54 = decode2414 + (j50 * 30366549) + (163752818 * j51) + (64542499 * j53);
        long j55 = decode3213 + (j50 * 163752818) + (258169998 * j51) + (158326419 * j53);
        long j56 = decode2415 + (j50 * 258169998) + (96434764 * j51) + (191173276 * j53);
        long j57 = decode3214 + (j50 * 96434764) + (227822194 * j51) + (104575268 * j53);
        long j58 = j40 + (j50 * 227822194) + (149865618 * j51) + (j53 * 137584065);
        long decode2416 = ((Codec.decode24(bArr, 4) << 4) & 4294967295L) + (43969588 * j51) + (141809365 * j53) + (decode3215 >>> 28);
        long j59 = decode3215 & M28L;
        long j60 = decode3216 + (decode2416 >>> 28);
        long j61 = decode2416 & M28L;
        long j62 = j54 + (j60 >>> 28);
        long j63 = j60 & M28L;
        long j64 = j55 + (j62 >>> 28);
        long j65 = j62 & M28L;
        long j66 = j56 + (j64 >>> 28);
        long j67 = j64 & M28L;
        long j68 = j57 + (j66 >>> 28);
        long j69 = j66 & M28L;
        long j70 = j58 + (j68 >>> 28);
        long j71 = j68 & M28L;
        long j72 = j41 + (j50 * 149865618) + (j51 * 550336261) + (j70 >>> 28);
        long j73 = j70 & M28L;
        long j74 = j42 + (j50 * 550336261) + (j72 >>> 28);
        long j75 = j72 & M28L;
        long j76 = j43 + (j74 >>> 28);
        long j77 = j74 & M28L;
        long j78 = j30 + (j38 * 149865618) + (j39 * 550336261) + (j76 >>> 28);
        long j79 = j76 & M28L;
        long j80 = j31 + (j38 * 550336261) + (j78 >>> 28);
        long j81 = j78 & M28L;
        long j82 = j28 + (j25 * 550336261) + (j80 >>> 28);
        long j83 = j80 & M28L;
        long j84 = j45 + (j82 >>> 28);
        long j85 = j82 & M28L;
        long j86 = j52 + (j84 >>> 28);
        long j87 = j84 & M28L;
        long j88 = j86 & M26L;
        long j89 = (j86 >>> 26) - 1;
        long j90 = j59 - (j89 & 78101261);
        long j91 = (j61 - (j89 & 141809365)) + (j90 >> 28);
        long j92 = j90 & M28L;
        long j93 = (j63 - (j89 & 175155932)) + (j91 >> 28);
        long j94 = j91 & M28L;
        long j95 = (j65 - (j89 & 64542499)) + (j93 >> 28);
        long j96 = j93 & M28L;
        long j97 = (j67 - (j89 & 158326419)) + (j95 >> 28);
        long j98 = j95 & M28L;
        long j99 = (j69 - (j89 & 191173276)) + (j97 >> 28);
        long j100 = j97 & M28L;
        long j101 = (j71 - (j89 & 104575268)) + (j99 >> 28);
        long j102 = j99 & M28L;
        long j103 = (j73 - (j89 & 137584065)) + (j101 >> 28);
        long j104 = j101 & M28L;
        long j105 = j75 + (j103 >> 28);
        long j106 = j103 & M28L;
        long j107 = j77 + (j105 >> 28);
        long j108 = j105 & M28L;
        long j109 = j79 + (j107 >> 28);
        long j110 = j107 & M28L;
        long j111 = j81 + (j109 >> 28);
        long j112 = j109 & M28L;
        long j113 = j83 + (j111 >> 28);
        long j114 = j111 & M28L;
        long j115 = j85 + (j113 >> 28);
        long j116 = j113 & M28L;
        long j117 = j87 + (j115 >> 28);
        long j118 = j115 & M28L;
        long j119 = j88 + (j117 >> 28);
        long j120 = j117 & M28L;
        byte[] bArr2 = new byte[57];
        Codec.encode56(j92 | (j94 << 28), bArr2, 0);
        Codec.encode56(j96 | (j98 << 28), bArr2, 7);
        Codec.encode56((j102 << 28) | j100, bArr2, 14);
        Codec.encode56((j106 << 28) | j104, bArr2, 21);
        Codec.encode56((j110 << 28) | j108, bArr2, 28);
        Codec.encode56(j112 | (j114 << 28), bArr2, 35);
        Codec.encode56(j116 | (j118 << 28), bArr2, 42);
        Codec.encode56(j120 | (j119 << 28), bArr2, 49);
        return bArr2;
    }

    static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[28];
        System.arraycopy(LSq, 0, iArr4, 0, 28);
        int[] iArr5 = new int[28];
        Nat448.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[28];
        int[] iArr7 = L;
        Nat448.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[28];
        int[] iArr9 = new int[8];
        System.arraycopy(iArr7, 0, iArr9, 0, 8);
        int[] iArr10 = new int[8];
        System.arraycopy(iArr, 0, iArr10, 0, 8);
        int[] iArr11 = new int[8];
        iArr11[0] = 1;
        int i = 1788;
        int[] iArr12 = iArr11;
        int[] iArr13 = new int[8];
        int[] iArr14 = iArr9;
        int[] iArr15 = iArr10;
        int i2 = 27;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(27, iArr5);
        int[] iArr16 = iArr4;
        int[] iArr17 = iArr5;
        while (bitLengthPositive > TARGET_LENGTH) {
            i--;
            if (i < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i2, iArr6) - bitLengthPositive;
            int i3 = bitLength & (~(bitLength >> 31));
            if (iArr6[i2] < 0) {
                ScalarUtil.addShifted_NP(i2, i3, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.addShifted_UV(7, i3, iArr14, iArr13, iArr15, iArr12);
            } else {
                ScalarUtil.subShifted_NP(i2, i3, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.subShifted_UV(7, i3, iArr14, iArr13, iArr15, iArr12);
            }
            int[] iArr18 = iArr15;
            int[] iArr19 = iArr12;
            if (ScalarUtil.lessThan(i2, iArr16, iArr17)) {
                int i4 = bitLengthPositive >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i4, iArr16);
                int[] iArr20 = iArr17;
                iArr17 = iArr16;
                iArr16 = iArr20;
                i2 = i4;
                bitLengthPositive = bitLengthPositive2;
                iArr15 = iArr14;
                iArr12 = iArr13;
                iArr13 = iArr19;
                iArr14 = iArr18;
            } else {
                iArr12 = iArr19;
                iArr15 = iArr18;
            }
        }
        System.arraycopy(iArr15, 0, iArr2, 0, 8);
        System.arraycopy(iArr12, 0, iArr3, 0, 8);
        return true;
    }

    static void toSignedDigits(int i, int[] iArr, int[] iArr2) {
        iArr2[14] = (1 << (i - 448)) + Nat.cadd(14, 1 & (~iArr[0]), iArr, L, iArr2);
        Nat.shiftDownBit(15, iArr2, 0);
    }
}
