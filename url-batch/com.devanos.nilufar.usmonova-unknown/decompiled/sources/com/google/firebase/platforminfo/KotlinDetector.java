package com.google.firebase.platforminfo;

import o.C1464ly;

/* loaded from: classes.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static String detectVersion() {
        try {
            return C1464ly.l.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
