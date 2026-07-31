package com.fyber.inneractive.sdk.protobuf;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class l1 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName(C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static String a(byte[] bArr) {
        return new String(bArr, a);
    }

    public static z0 a(Object obj, Object obj2) {
        d2 d2Var = (d2) obj2;
        t0 t0Var = (t0) ((d2) obj).toBuilder();
        if (!t0Var.a.getClass().isInstance(d2Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        t0Var.c();
        t0.a(t0Var.b, (z0) ((b) d2Var));
        return t0Var.b();
    }
}
