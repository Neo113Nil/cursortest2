package io.bidmachine.analytics.internal.G;

import io.bidmachine.analytics.internal.g.C5901c;
import io.bidmachine.analytics.internal.g.EnumC5899a;
import io.bidmachine.analytics.internal.g.EnumC5905g;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;

/* loaded from: classes8.dex */
public abstract class b {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC5899a.values().length];
            try {
                iArr[EnumC5899a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5899a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5899a.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5899a.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC5905g.values().length];
            try {
                iArr2[EnumC5905g.PRECISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC5905g.ESTIMATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final long a(C5901c c5901c) {
        return (c5901c.c() - (c5901c.c() % 1000)) - MathKt.roundToLong(c5901c.d() * 1000000000000L);
    }

    public static final io.bidmachine.analytics.internal.G.a b(C5901c c5901c) {
        return new io.bidmachine.analytics.internal.G.a(c5901c.b(), c5901c.f(), io.bidmachine.analytics.internal.I.g.a(new Date(c5901c.c())), a(c5901c.a()), a(c5901c), a(c5901c.e()));
    }

    private static final int a(EnumC5899a enumC5899a) {
        int i = a.$EnumSwitchMapping$0[enumC5899a.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i2;
    }

    private static final int a(EnumC5905g enumC5905g) {
        int i = a.$EnumSwitchMapping$1[enumC5905g.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i2;
    }
}
