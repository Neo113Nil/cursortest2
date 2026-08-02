package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class V9 implements C6U {
    public static byte[] A03;
    public static String[] A04 = {"WE91vPqiHLcyJwrbQHRJcIvZwn5D9l", "3LK2x46Pp3Ld9onr8DyN9Ggm", "60IU9PqapOW3gkaytJRkZEg3", "UqNMzTGRyBNLAx", "QjYmXRpW4", "DeQ01HErfJf7NLfnuVX6corDAbYDzPur", "bhlqPTI7mETXQlgoFXHPJBBhjQPpzoup", "oYTMQ3SHL"};
    public final /* synthetic */ C1007bK A00;
    public final /* synthetic */ V2 A01;
    public final /* synthetic */ boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-16, Ascii.VT, 19, Ascii.SYN, Ascii.SI, Ascii.SO, -54, Ascii.RS, Ascii.EM, -54, Ascii.SO, Ascii.EM, 33, Ascii.CAN, Ascii.SYN, Ascii.EM, Ascii.VT, Ascii.SO, -54, Ascii.VT, -54, Ascii.ETB, Ascii.SI, Ascii.SO, 19, Ascii.VT, -40};
    }

    static {
        A01();
    }

    public V9(V2 v2, C1007bK c1007bK, boolean z) {
        this.A01 = v2;
        this.A00 = c1007bK;
        this.A02 = z;
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        C0889Yn c0889Yn;
        long j;
        V1 v1;
        V1 v12;
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        AdErrorType adErrorType = AdErrorType.CACHE_FAILURE_ERROR;
        String A00 = A00(0, 27, 110);
        c0889Yn = this.A01.A0c;
        C0S A0E = c0889Yn.A0E();
        j = this.A01.A00;
        A0E.A2m(C0547Lf.A01(j), adErrorType.getErrorCode(), A00);
        v1 = this.A01.A0G;
        if (v1 != null) {
            V2 v2 = this.A01;
            String[] strArr = A04;
            String errorMessage = strArr[4];
            if (errorMessage.length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A04[6] = "7cQ3648pyLFx7h83cxUuTBVDS0jRS450";
            v12 = v2.A0G;
            v12.ABR(C0495Jb.A01(adErrorType, A00));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        V1 v1;
        JL jl;
        C0889Yn c0889Yn;
        V1 v12;
        C0889Yn c0889Yn2;
        boolean A0q;
        V1 v13;
        FO fo;
        FO fo2;
        this.A01.A0a = this.A00;
        if (this.A02) {
            fo = this.A01.A0A;
            if (fo != null) {
                fo2 = this.A01.A0A;
                String[] strArr = A04;
                if (strArr[4].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[4] = "vb7V14ygc";
                strArr2[7] = "eJXYUqUMt";
                fo2.A0I();
            }
        }
        v1 = this.A01.A0G;
        if (v1 != null) {
            jl = this.A01.A0E;
            if (jl.equals(JL.A04)) {
                A0q = this.A01.A0q();
                if (!A0q) {
                    v13 = this.A01.A0G;
                    v13.ACF();
                }
            }
            if (this.A02) {
                c0889Yn = this.A01.A0c;
                if (!C0478Ih.A1Q(c0889Yn) || this.A01.A0z() == null || !this.A01.A0z().A0m()) {
                    v12 = this.A01.A0G;
                    v12.AAg();
                } else {
                    V2 v2 = this.A01;
                    c0889Yn2 = v2.A0c;
                    v2.A0M = PC.A01(c0889Yn2, this.A01.A0z(), 4, new VA(this));
                }
            }
        }
    }
}
