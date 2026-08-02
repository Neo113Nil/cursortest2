package com.meta.analytics.dsp.uinode;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0833Wj implements DQ {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-47, -60, -65, -64, -54, -118, -68, -47, -66};
    }

    public C0833Wj() {
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final int A6U() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final MediaCodecInfo A6V(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean A9H(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 2).equals(str);
    }

    @Override // com.meta.analytics.dsp.uinode.DQ
    public final boolean AFf() {
        return false;
    }
}
