package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.qg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4289qg {
    public static final boolean a(C4210ng c4210ng) {
        Intrinsics.checkNotNullParameter(c4210ng, "<this>");
        int i = c4210ng.b;
        if ((400 <= i && i < 600) || i <= 0) {
            return false;
        }
        String str = c4210ng.c;
        return str == null || str.length() == 0;
    }
}
