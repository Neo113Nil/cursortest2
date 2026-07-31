package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzach extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzach(Throwable th) {
        super(r3.toString(), th);
        String simpleName = th.getClass().getSimpleName();
        String concat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        StringBuilder sb = new StringBuilder(simpleName.length() + 11 + concat.length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(concat);
    }
}
