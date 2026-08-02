package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0909Zi implements AnonymousClass48 {
    public static byte[] A01;
    public static String[] A02 = {"46YXIWmMPzvDd0obWRnJ4BqqVPRLtWBw", "gh8OkU42ZlKkobP3JZNpp9ULZO5A8ZhR", "pYzKTcWKS", "s80LPKQojprV6sWgUGQ2HgvoHgQNhHA6", "mXkvahQSLAFHEVEVhsUobK6", "jBm2h6b3G4Mz5Atqbj4RgeaplM7i81Ud", "dS7v9a2czFlDs6aC1vqF8J", "Ti7FTP9Lv4Lzv8sgvsknxkrAm3hOTwvH"};
    public final /* synthetic */ C0372Eb A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 124;
            if (A02[6].length() != 22) {
                throw new RuntimeException();
            }
            A02[2] = "fZFgh8O1A";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{48, 58, 49};
    }

    static {
        A01();
    }

    public C0909Zi(C0372Eb c0372Eb) {
        this.A00 = c0372Eb;
    }

    private final void A02(AnonymousClass49 anonymousClass49) {
        throw new NullPointerException(A00(0, 3, 81));
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass48
    public final void ABK(AnonymousClass49 anonymousClass49) {
        A02(anonymousClass49);
        throw null;
    }
}
