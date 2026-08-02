package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1018bV extends KT {
    public static byte[] A02;
    public final /* synthetic */ C00600w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, Ascii.DC4, 4, Ascii.SI, 2, Ascii.CAN, 62, 2, 0, 17, 17, 8, Ascii.SI, 6};
    }

    public C1018bV(C00600w c00600w, JSONObject jSONObject) {
        this.A00 = c00600w;
        this.A01 = jSONObject;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C02177f c02177f;
        C02177f c02177f2;
        CountDownLatch countDownLatch;
        C00590v c00590v;
        C00590v c00590v2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c00590v = this.A00.A02;
            synchronized (c00590v) {
                c00590v2 = this.A00.A02;
                c00590v2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e) {
            c02177f2 = this.A00.A03;
            c02177f2.A07().A9a(A00(0, 17, 116), C8A.A1B, new C8B(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c02177f = this.A00.A03;
            c02177f.A07().A9a(A00(0, 17, 116), C8A.A1A, new C8B(e2));
        }
    }
}
