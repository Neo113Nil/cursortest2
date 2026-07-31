package com.inmobi.media;

import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class Q6 {
    public final I2 a;

    public Q6(String b64feature) {
        Intrinsics.checkNotNullParameter(b64feature, "b64feature");
        I2 i2 = new I2();
        this.a = i2;
        i2.a(b64feature);
    }

    public final boolean a(boolean z) {
        BitSet bitSet = this.a.a;
        return bitSet != null ? bitSet.get(0) : z;
    }
}
