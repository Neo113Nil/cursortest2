package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0824Vx implements InterfaceC0440Gu {
    public static byte[] A00;
    public static final InterfaceC0439Gt A01;
    public static final C0824Vx A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{51, 2, Ascii.SUB, Ascii.SUB, Ascii.SO, 87, 4, Ascii.CAN, 2, 5, Ascii.DC4, Ascii.DC2};
    }

    static {
        A01();
        A02 = new C0824Vx();
        A01 = new C0825Vy();
    }

    public C0824Vx() {
    }

    public /* synthetic */ C0824Vx(C0825Vy c0825Vy) {
        this();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final Uri A8E() {
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final long ADl(C0444Gy c0444Gy) throws IOException {
        throw new IOException(A00(0, 12, 28));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final void close() throws IOException {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException();
    }
}
