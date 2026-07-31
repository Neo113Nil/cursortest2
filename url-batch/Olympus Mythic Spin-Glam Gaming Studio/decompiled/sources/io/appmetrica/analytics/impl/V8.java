package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes9.dex */
public final class V8 implements Lo {
    public final C5226b9 a;

    public V8() {
        this(new C5226b9());
    }

    @Override // io.appmetrica.analytics.impl.Lo
    @NonNull
    public final byte[] a(@NonNull C5381h9 c5381h9, @NonNull C5804xh c5804xh) {
        String str = c5381h9.b;
        return ((InterfaceC5200a9) this.a.a.a(c5381h9.o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public V8(C5226b9 c5226b9) {
        this.a = c5226b9;
    }
}
