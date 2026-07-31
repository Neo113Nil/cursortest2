package yads;

import com.monetization.ads.quality.base.model.AdQualityVerificationMode;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AdQualityVerificationMode.values().length];
        try {
            iArr[AdQualityVerificationMode.FAST_VERIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdQualityVerificationMode.LONG_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
