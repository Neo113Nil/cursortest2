package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5401i3 {
    public final C5375h3 a;
    public final GZIPCompressor b;

    public C5401i3() {
        this(new C5375h3(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C5375h3 c5375h3 = this.a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c5375h3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, copyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C5401i3(C5375h3 c5375h3, GZIPCompressor gZIPCompressor) {
        this.a = c5375h3;
        this.b = gZIPCompressor;
    }
}
