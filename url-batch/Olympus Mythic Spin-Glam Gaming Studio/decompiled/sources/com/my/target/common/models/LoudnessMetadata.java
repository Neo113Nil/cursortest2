package com.my.target.common.models;

import androidx.annotation.NonNull;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class LoudnessMetadata {
    private final float a;
    private final float b;

    private LoudnessMetadata(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static LoudnessMetadata a(float f, float f2) {
        return new LoudnessMetadata(f, f2);
    }

    public boolean equals(Object obj) {
        if (obj != null && LoudnessMetadata.class == obj.getClass()) {
            LoudnessMetadata loudnessMetadata = (LoudnessMetadata) obj;
            if (Float.compare(this.a, loudnessMetadata.a) == 0 && Float.compare(this.b, loudnessMetadata.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public float getIntegratedLufs() {
        return this.a;
    }

    public float getTruePeak() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b));
    }

    @NonNull
    public String toString() {
        return "LoudnessMetadata{integratedLufs=" + this.a + ", truePeak=" + this.b + "}";
    }
}
