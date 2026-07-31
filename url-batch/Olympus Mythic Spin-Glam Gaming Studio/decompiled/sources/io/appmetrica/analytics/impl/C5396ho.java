package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5396ho implements Lo {
    public final C5226b9 a;

    public C5396ho() {
        this(new C5226b9());
    }

    @Override // io.appmetrica.analytics.impl.Lo
    @NonNull
    public final byte[] a(@NonNull C5381h9 c5381h9, @NonNull C5804xh c5804xh) {
        byte[] bArr = new byte[0];
        try {
            bArr = Base64Utils.decompressBase64GzipAsBytes(c5381h9.b);
        } catch (Throwable unused) {
        }
        byte[] a = ((InterfaceC5200a9) this.a.a.a(c5381h9.o)).a(bArr);
        return a == null ? new byte[0] : a;
    }

    public C5396ho(C5226b9 c5226b9) {
        this.a = c5226b9;
    }

    @NonNull
    @VisibleForTesting
    public final C5226b9 a() {
        return this.a;
    }
}
