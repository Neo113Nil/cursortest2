package com.ironsource;

import java.util.Date;

/* renamed from: com.ironsource.g5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4658g5 {
    private long a = new Date().getTime();

    public static long a(C4658g5 c4658g5) {
        if (c4658g5 == null) {
            return 0L;
        }
        return new Date().getTime() - c4658g5.a;
    }
}
