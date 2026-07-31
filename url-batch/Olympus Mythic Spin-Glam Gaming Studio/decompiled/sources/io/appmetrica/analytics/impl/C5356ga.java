package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5356ga implements InterfaceC5200a9 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5200a9
    public final S8 a(C5326f6 c5326f6) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5200a9
    public final byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public final EnumC5252c9 a() {
        return EnumC5252c9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
