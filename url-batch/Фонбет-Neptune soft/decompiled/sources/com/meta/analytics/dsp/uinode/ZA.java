package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZA implements InterfaceC00881y {
    public static byte[] A03;
    public C01785m A00;
    public C0889Yn A01;
    public final NativeAdBase.MediaCacheFlag A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{59, 52, 33, 60, 35, 48, 100, Byte.MAX_VALUE, 122, Byte.MAX_VALUE, 126, 102, Byte.MAX_VALUE};
    }

    public ZA(C01785m c01785m, C0889Yn c0889Yn, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = c01785m;
        this.A01 = c0889Yn;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00881y
    public final void ABR(C0495Jb c0495Jb) {
        KK.A00(new ZD(this, c0495Jb));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00881y
    public final void ACP(List<C1007bK> list) {
        C01946c manager = new C01946c(this.A01);
        String firstRequestId = A02(6, 7, 70);
        for (C1007bK c1007bK : list) {
            if (A02(6, 7, 70).equals(firstRequestId)) {
                firstRequestId = c1007bK.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c1007bK.A0E().A0G() != null) {
                    manager.A0b(new C01926a(c1007bK.A0E().A0G().getUrl(), c1007bK.A0E().A0G().getHeight(), c1007bK.A0E().A0G().getWidth(), c1007bK.A0G(), A02(0, 6, 2)));
                }
                if (c1007bK.A0E().A0F() != null) {
                    manager.A0b(new C01926a(c1007bK.A0E().A0F().getUrl(), c1007bK.A0E().A0F().getHeight(), c1007bK.A0E().A0F().getWidth(), c1007bK.A0G(), A02(0, 6, 2)));
                }
                if (!TextUtils.isEmpty(c1007bK.A0E().A0d())) {
                    manager.A0a(new C6Y(c1007bK.A0E().A0d(), c1007bK.A0G(), A02(0, 6, 2), c1007bK.A0E().A0A()));
                }
            }
        }
        manager.A0W(new ZB(this, list), new C6V(firstRequestId, A02(0, 6, 2)));
    }
}
