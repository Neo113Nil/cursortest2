package com.google.common.primitives;

/* loaded from: classes14.dex */
public abstract class Booleans {
    public static boolean contains(boolean[] zArr, boolean z) {
        for (boolean z2 : zArr) {
            if (z2 == z) {
                return true;
            }
        }
        return false;
    }
}
