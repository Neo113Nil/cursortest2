package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Locale;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes11.dex */
public final class zzps extends IOException {
    zzps() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzps(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i))), th);
    }

    zzps(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
