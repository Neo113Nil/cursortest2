package com.inmobi.media;

import android.util.Base64;
import java.util.BitSet;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class I2 {
    public BitSet a;

    public final void a(String b64String) {
        byte[] value;
        BitSet bitSet;
        Intrinsics.checkNotNullParameter(b64String, "b64String");
        try {
            value = Base64.decode(b64String, 0);
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
            value = null;
        }
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            F5.a.getClass();
            if (F5.w()) {
                bitSet = BitSet.valueOf(value);
            } else {
                Intrinsics.checkNotNullParameter(value, "<this>");
                BitSet bitSet2 = new BitSet(value.length * 8);
                int i = 0;
                for (byte b : value) {
                    int i2 = 0;
                    while (i2 < 8) {
                        int i3 = i + 1;
                        bitSet2.set(i, ((b >> ((byte) i2)) & 1) == 1);
                        i2++;
                        i = i3;
                    }
                }
                bitSet = bitSet2;
            }
            this.a = bitSet;
        }
    }
}
