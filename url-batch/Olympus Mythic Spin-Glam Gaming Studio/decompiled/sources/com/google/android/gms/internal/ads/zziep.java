package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes5.dex */
public final class zziep extends IOException {
    zziep() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zziep(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i))), th);
    }

    zziep(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
