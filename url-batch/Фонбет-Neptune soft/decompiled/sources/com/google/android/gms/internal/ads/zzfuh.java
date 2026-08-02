package com.google.android.gms.internal.ads;

import org.apache.commons.io.IOUtils;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfuh extends zzfug {
    private final char zza;

    zzfuh(char c) {
        this.zza = c;
    }

    public final String toString() {
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        int i = this.zza;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.ads.zzfui
    public final boolean zzb(char c) {
        return c == this.zza;
    }
}
