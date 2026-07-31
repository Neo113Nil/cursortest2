package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5660s3 implements Lo {
    public final C5226b9 a;

    public C5660s3() {
        this(new C5226b9());
    }

    @Override // io.appmetrica.analytics.impl.Lo
    @NonNull
    public final byte[] a(@NonNull C5381h9 c5381h9, @NonNull C5804xh c5804xh) {
        byte[] bArr = new byte[0];
        String str = c5381h9.b;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        C5226b9 c5226b9 = this.a;
        return ((InterfaceC5200a9) c5226b9.a.a(c5381h9.o)).a(bArr);
    }

    public C5660s3(C5226b9 c5226b9) {
        this.a = c5226b9;
    }
}
