package com.my.target;

import com.my.target.common.models.LoudnessMetadata;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class q0 extends fb {
    private int e;
    private final LoudnessMetadata f;

    private q0(String str, LoudnessMetadata loudnessMetadata) {
        super(str);
        this.f = loudnessMetadata;
    }

    public static q0 a(String str, LoudnessMetadata loudnessMetadata) {
        return new q0(str, loudnessMetadata);
    }

    public LoudnessMetadata b() {
        return this.f;
    }

    public void a(int i) {
        this.e = i;
    }
}
