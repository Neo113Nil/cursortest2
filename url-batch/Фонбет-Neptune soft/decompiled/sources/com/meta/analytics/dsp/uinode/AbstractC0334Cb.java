package com.meta.analytics.dsp.uinode;

import android.util.Log;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0334Cb {
    public static byte[] A00;
    public static String[] A01 = {"vniJFRP", "oJtPNZwcQG6hLH64wW6tXvk3sbQ9WwGW", "zry57w6QfhfaFpFxdZgKHC1xYn", "fo4QeY", "i9CLNlynjhorIFu8zs9NEh7lWGRKe1E6", "M5SbcVIJ6zX6bTvbAFwxovtl6mtBjy6T", "O1VKgn8XNf4GQEXWcT9RCCs6YBao3Pp0", "jcDd8FEzgCzhSc3FOh8Nko0kxmmUpCTh"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-28, 7, 7, -4, -43, 8, 3, 1, -23, 8, -3, 0, -85, -60, -55, -53, -58, -58, -59, -56, -54, -69, -70, 118, -58, -55, -55, -66, 118, -52, -69, -56, -55, -65, -59, -60, -112, 118};
    }

    static {
        A03();
    }

    public static C0333Ca A00(byte[] bArr) {
        C0470Hz c0470Hz = new C0470Hz(bArr);
        if (c0470Hz.A07() < 32) {
            return null;
        }
        c0470Hz.A0Y(0);
        if (c0470Hz.A08() != c0470Hz.A04() + 4 || c0470Hz.A08() != CJ.A0s) {
            return null;
        }
        int dataSize = CJ.A01(c0470Hz.A08());
        if (dataSize > 1) {
            Log.w(A01(0, 12, 98), A01(12, 26, 36) + dataSize);
            return null;
        }
        UUID uuid = new UUID(c0470Hz.A0L(), c0470Hz.A0L());
        if (dataSize == 1) {
            int atomType = c0470Hz.A0H() * 16;
            if (A01[0].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "thpi9L";
            strArr[2] = "TMAT5NZ1bWTkNSNpNaLonMSfAF";
            c0470Hz.A0Z(atomType);
        }
        int atomSize = c0470Hz.A0H();
        if (atomSize != c0470Hz.A04()) {
            return null;
        }
        byte[] bArr2 = new byte[atomSize];
        c0470Hz.A0c(bArr2, 0, atomSize);
        return new C0333Ca(uuid, dataSize, bArr2);
    }

    public static UUID A02(byte[] bArr) {
        UUID uuid;
        C0333Ca parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            uuid = parsedAtom.A01;
            return uuid;
        }
        return null;
    }
}
