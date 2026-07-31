package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public abstract class IntMath {
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    static final int[] halfPowersOf10 = {3, 31, Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static boolean isPowerOfTwo(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }

    static int lessThanBranchFree(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    /* renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int log2(int i, RoundingMode roundingMode) {
        MathPreconditions.checkPositive(VastAttributes.HORIZONTAL_POSITION, i);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + lessThanBranchFree((-1257966797) >>> numberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int divide(int i, int i2, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i3 & 1) != 0))) {
                            return i3;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    public static int checkedAdd(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        MathPreconditions.checkNoOverflow(j == ((long) i3), "checkedAdd", i, i2);
        return i3;
    }

    public static int checkedMultiply(int i, int i2) {
        long j = i * i2;
        int i3 = (int) j;
        MathPreconditions.checkNoOverflow(j == ((long) i3), "checkedMultiply", i, i2);
        return i3;
    }

    public static int saturatedAdd(int i, int i2) {
        return Ints.saturatedCast(i + i2);
    }

    public static int saturatedMultiply(int i, int i2) {
        return Ints.saturatedCast(i * i2);
    }
}
