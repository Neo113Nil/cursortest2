package com.ogury.ad.internal;

import android.content.Intent;

/* loaded from: classes6.dex */
public final class s3 {
    public static final s3 a = new s3();

    public static Intent a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return Intent.parseUri(str, 0);
    }
}
