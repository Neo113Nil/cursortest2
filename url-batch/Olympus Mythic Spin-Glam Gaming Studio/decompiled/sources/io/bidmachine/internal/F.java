package io.bidmachine.internal;

import io.bidmachine.protobuf.sdk.RestrictionMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class F {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RestrictionMode.values().length];
            try {
                iArr[RestrictionMode.RESTRICTION_MODE_STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictionMode.RESTRICTION_MODE_MODERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestrictionMode.RESTRICTION_MODE_OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[y.values().length];
            try {
                iArr2[y.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[y.MODERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[y.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final y a(RestrictionMode restrictionMode) {
        Intrinsics.checkNotNullParameter(restrictionMode, "<this>");
        int i = a.$EnumSwitchMapping$0[restrictionMode.ordinal()];
        if (i == 1) {
            return y.STRICT;
        }
        if (i == 2) {
            return y.MODERATE;
        }
        if (i != 3) {
            return null;
        }
        return y.OPEN;
    }

    public static final RestrictionMode a(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        int i = a.$EnumSwitchMapping$1[yVar.ordinal()];
        if (i == 1) {
            return RestrictionMode.RESTRICTION_MODE_STRICT;
        }
        if (i == 2) {
            return RestrictionMode.RESTRICTION_MODE_MODERATE;
        }
        if (i == 3) {
            return RestrictionMode.RESTRICTION_MODE_OPEN;
        }
        throw new NoWhenBranchMatchedException();
    }
}
