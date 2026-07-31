package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class Uf {
    public static final Tf a(byte b) {
        return b == 1 ? Tf.a : b == 2 ? Tf.c : b == 3 ? Tf.b : b == 4 ? Tf.d : Tf.a;
    }

    public static final boolean b(Tf tf) {
        Intrinsics.checkNotNullParameter(tf, "<this>");
        return tf == Tf.b || tf == Tf.d;
    }

    public static final int a(Tf tf) {
        Intrinsics.checkNotNullParameter(tf, "<this>");
        int ordinal = tf.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 90;
        }
        if (ordinal == 2) {
            return 180;
        }
        if (ordinal == 3) {
            return 270;
        }
        throw new NoWhenBranchMatchedException();
    }
}
