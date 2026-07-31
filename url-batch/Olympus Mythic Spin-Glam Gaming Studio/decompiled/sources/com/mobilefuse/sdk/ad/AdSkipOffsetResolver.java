package com.mobilefuse.sdk.ad;

import com.mobilefuse.sdk.math.MathMf;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ResolveAdSkipOffset.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a)\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"UNSKIPPABLE", "", "resolveAdSkipOffset", "adSkipOffsetSec", "forceSkipSec", "blockSkipSec", "(Ljava/lang/Float;FF)F", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final class AdSkipOffsetResolver {
    public static final float UNSKIPPABLE = -1.0f;

    public static /* synthetic */ float resolveAdSkipOffset$default(Float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = -1.0f;
        }
        if ((i & 4) != 0) {
            f3 = -1.0f;
        }
        return resolveAdSkipOffset(f, f2, f3);
    }

    public static final float resolveAdSkipOffset(@Nullable Float f, float f2, float f3) {
        if (f != null) {
            f2 = MathMf.minPreferPositive(f.floatValue(), f2);
        }
        return Math.max(f2, f3);
    }
}
