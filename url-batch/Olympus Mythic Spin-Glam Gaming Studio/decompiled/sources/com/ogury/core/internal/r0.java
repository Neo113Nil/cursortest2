package com.ogury.core.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes5.dex */
public final class r0 {
    public static boolean a(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Class.forName(className);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
