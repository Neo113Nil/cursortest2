package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.p3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5582p3 extends Z2 {
    public C5582p3(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @VisibleForTesting
    public final int b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.Cdo
    @Nullable
    public final byte[] a(@Nullable byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i = this.a;
        if (length <= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.c.warning("\"%s\" %s exceeded limit of %d bytes", this.b, bArr, Integer.valueOf(this.a));
        return bArr2;
    }

    @NonNull
    @VisibleForTesting
    public final String a() {
        return this.b;
    }
}
