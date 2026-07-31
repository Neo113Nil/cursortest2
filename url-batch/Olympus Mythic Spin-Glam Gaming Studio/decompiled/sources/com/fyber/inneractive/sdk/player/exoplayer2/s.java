package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes5.dex */
public final class s {
    public static final s d = new s(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    public s(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.b == sVar.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
