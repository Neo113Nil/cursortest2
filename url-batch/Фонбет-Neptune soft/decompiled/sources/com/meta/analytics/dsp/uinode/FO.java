package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class FO extends AbstractC0973am {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, Ascii.FF, 69, 95, Ascii.FF, 66, 67, 88, Ascii.FF, 94, 73, 77, 72, 85, Ascii.FF, 67, 94, Ascii.FF, 77, 64, 94, 73, 77, 72, 85, Ascii.FF, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, Base64.padSymbol, 37};
    }

    static {
        A03();
    }

    public FO(C0889Yn c0889Yn, C00841u c00841u) {
        super(c0889Yn, c00841u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls == null || trackingUrls.isEmpty()) {
            return;
        }
        Iterator<String> it = trackingUrls.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new AsyncTaskC0702Re(this.A0B, extraData).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0973am
    public final void A0M() {
        C1007bK c1007bK = (C1007bK) this.A01;
        if (c1007bK.A0R()) {
            if (this.A06 != null) {
                this.A06.A0B(c1007bK);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0973am
    public final void A0O(InterfaceC00530p interfaceC00530p, C8S c8s, C8Q c8q, C00851v c00851v) {
        C1007bK c1007bK = (C1007bK) interfaceC00530p;
        long currentTimeMillis = System.currentTimeMillis();
        C0970aj c0970aj = new C0970aj(this, c00851v, c1007bK, currentTimeMillis, c8q);
        A0F().postDelayed(c0970aj, c8s.A05().A05());
        c1007bK.A0L(this.A0B, new C0969ai(this, c0970aj, currentTimeMillis, c8q), this.A08, c00851v, V2.A0K());
    }
}
