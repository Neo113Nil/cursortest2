package com.mobilefuse.sdk.math;

import kotlin.Metadata;

/* compiled from: MathMf.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"minPreferPositive", "", "a", "b", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes6.dex */
public final class MathMf {
    public static final float minPreferPositive(float f, float f2) {
        float f3 = 0;
        if (f >= f3 || f2 >= f3) {
            return f < f3 ? f2 : f2 < f3 ? f : Math.min(f, f2);
        }
        return Math.min(f, f2);
    }
}
