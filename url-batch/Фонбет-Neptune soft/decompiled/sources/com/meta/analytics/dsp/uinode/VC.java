package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public class VC extends AbstractC00540q {
    public static byte[] A01;
    public final /* synthetic */ V2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.ETB, 42, Base64.padSymbol, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, Base64.padSymbol, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public VC(V2 v2) {
        this.A00 = v2;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0B(C1007bK c1007bK) {
        this.A00.A1T(c1007bK);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0C() {
        V1 v1;
        V1 v12;
        v1 = this.A00.A0G;
        if (v1 != null) {
            v12 = this.A00.A0G;
            v12.AAc();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0F(InterfaceC00530p interfaceC00530p) {
        FO fo;
        FO fo2;
        fo = this.A00.A0A;
        if (fo != null) {
            fo2 = this.A00.A0A;
            fo2.A0J();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00540q
    public final void A0G(C0495Jb c0495Jb) {
        long j;
        V1 v1;
        V1 v12;
        C0S A0E = this.A00.A11().A0E();
        j = this.A00.A00;
        A0E.A2m(C0547Lf.A01(j), c0495Jb.A03().getErrorCode(), c0495Jb.A04());
        v1 = this.A00.A0G;
        if (v1 != null) {
            v12 = this.A00.A0G;
            v12.ABR(c0495Jb);
        }
    }
}
