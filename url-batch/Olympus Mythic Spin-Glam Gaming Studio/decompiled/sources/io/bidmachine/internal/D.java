package io.bidmachine.internal;

import io.bidmachine.protobuf.sdk.RestrictionKind;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class D {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RestrictionKind.values().length];
            try {
                iArr[RestrictionKind.RESTRICTION_KIND_COPPA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictionKind.RESTRICTION_KIND_NON_PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestrictionKind.RESTRICTION_KIND_GDPR_NO_CONSENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RestrictionKind.RESTRICTION_KIND_CCPA_OPT_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RestrictionKind.RESTRICTION_KIND_NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C.values().length];
            try {
                iArr2[C.COPPA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[C.NON_PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[C.GDPR_NO_CONSENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[C.CCPA_OPT_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[C.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final RestrictionKind a(C c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        int i = a.$EnumSwitchMapping$1[c.ordinal()];
        if (i == 1) {
            return RestrictionKind.RESTRICTION_KIND_COPPA;
        }
        if (i == 2) {
            return RestrictionKind.RESTRICTION_KIND_NON_PERSONALIZED;
        }
        if (i == 3) {
            return RestrictionKind.RESTRICTION_KIND_GDPR_NO_CONSENT;
        }
        if (i == 4) {
            return RestrictionKind.RESTRICTION_KIND_CCPA_OPT_OUT;
        }
        if (i == 5) {
            return RestrictionKind.RESTRICTION_KIND_NONE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
