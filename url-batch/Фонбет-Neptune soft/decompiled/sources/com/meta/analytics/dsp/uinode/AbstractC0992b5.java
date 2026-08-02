package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.google.common.base.Ascii;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0992b5 extends C1F implements Serializable {
    public static JSONObject A0F = null;
    public static byte[] A0G = null;
    public static String[] A0H = {"1gqRR9im7tmNjhPy8NnQpjCX4rd8Ielc", "ZkOx7RNEMabKvQ7fgN15WIbWDw11JZFu", "ifeh8sROmLFDdOYqa0sy0eFfj5RHH1gU", "fnDzwAhU6GMUs0cCq2fTQuWEzv5lBJki", "OVtNfYqIZ80xqW4zrHdkYxbTKYgYXHc", "chIpxbYwiAOd1RIHlv8aEwW7ihQHRwI", "GnSiEcQE", "uApEYGhuY9oy1RN675k2bDQ9FUD4oA7y"};
    public static final LinkedHashMap<String, String> A0I;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C1C A05;
    public C1U A06;
    public C1X A07;
    public C00641a A08;
    public C00701g A09;
    public String A0A;
    public final List<C1G> A0D;
    public boolean A0B = false;
    public boolean A0C = false;
    public final Map<String, String> A0E = new HashMap();

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        String[] strArr = A0H;
        if (strArr[2].charAt(14) == strArr[1].charAt(14)) {
            throw new RuntimeException();
        }
        A0H[5] = "bfB1pGz3pHLReaUGKuLSmGsyYLYBAtW";
        A0G = new byte[]{40, 45, Ascii.SYN, 42, 33, 38, 32, 42, 44, 58, Ascii.SYN, 37, 32, 39, 34, Ascii.SYN, 60, 59, 37, 118, 121, 72, 123, 120, 112, 120, 72, 99, 110, 103, 114, 81, 69, 68, 95, 83, 92, 89, 83, 91, 111, 83, 95, 69, 94, 68, 84, 95, 71, 94, 111, 68, 89, 93, 85, 89, 77, 76, 87, 91, 84, 81, 91, 83, 103, 91, 76, 89, 103, 76, 81, 85, 93, 37, 49, 48, 43, 39, 40, 45, 39, 47, Ascii.ESC, 34, 40, 37, 50, 43, 54, 0, 2, 0, Ascii.VT, 6, 60, 2, 16, 16, 6, Ascii.ETB, 16, 34, 32, 51, 46, 52, 50, 36, 45, 9, 2, Ascii.VT, 3, 4, 53, Ascii.VT, Ascii.SO, Ascii.EM, 53, Ascii.FF, Ascii.CAN, Ascii.SI, Ascii.ESC, Ascii.US, Ascii.SI, 4, 9, 19, 102, 106, 104, 43, 99, 100, 102, 96, 103, 106, 106, 110, 43, 100, 97, 118, 43, 108, 107, 113, 96, 119, 118, 113, 108, 113, 108, 100, 105, 43, 99, 108, 107, 108, 118, 109, 90, 100, 102, 113, 108, 115, 108, 113, 124, 81, 70, 35, 52, 43, Ascii.CAN, 38, 55, 55, Ascii.CAN, 37, 40, 50, 41, 35, Ascii.CAN, 50, 53, 43, 52, 82, 86, 0, 85, 107, 83, 68, 107, 91, 66, 81, 70, 88, 85, 77, 107, 71, 81, 87, 65, 70, 81, 107, 64, 91, 95, 81, 90, 10, 0, Ascii.FF, Ascii.CR, 45, 42, 55, 48, 37, 40, 40, Ascii.ESC, 54, 33, 34, 33, 54, 54, 33, 54, 91, 92, 70, 87, 64, 65, 70, 91, 70, 91, 83, 94, 78, 67, 76, 70, 81, 65, 67, 82, 71, 73, 68, 92, 74, 80, 81, 108, 115, 110, 104, 110, 125, 117, 104, 50, 37, 55, 33, 50, 36, 37, 36, Ascii.US, 54, 41, 36, 37, 47, 59, 32, 39, Base64.padSymbol, 36, 44, Ascii.ETB, 36, 39, 47, Ascii.ETB, 41, 38, 49, Ascii.ETB, 33, 41, 42, Ascii.ETB, 43, 36, 33, 43, 35, Ascii.ETB, 39, 38, 43, 45, 112, 109, 112, 104, 97, Ascii.EM, Ascii.RS, 0};
    }

    static {
        A09();
        A0I = new LinkedHashMap<>(10, 0.75f, false);
    }

    public AbstractC0992b5(List<C1G> list) {
        this.A0D = list;
    }

    public static String A06(String str) {
        return A0I.get(str);
    }

    private HashMap<String, String> A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(Opcodes.DRETURN, 18, 123));
        HashMap<String, String> hashMap = new HashMap<>();
        if (optJSONObject == null) {
            return hashMap;
        }
        Iterator<String> nameItr = optJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                String next = nameItr.next();
                hashMap.put(next, optJSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static List<C1G> A08(JSONObject jSONObject, C0889Yn c0889Yn, C1S c1s) {
        JSONArray optJSONArray = jSONObject.optJSONArray(A05(101, 8, 125));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            return C1O.A01(optJSONArray, jSONObject, c0889Yn, c1s);
        }
        List<AdInfo> adInfoList = new ArrayList<>();
        C1G A00 = C1G.A00(jSONObject);
        c1s.A3N(A00, jSONObject);
        adInfoList.add(A00);
        return adInfoList;
    }

    private void A0A(int i) {
        this.A00 = i;
    }

    private final void A0B(int i) {
        this.A04 = i;
    }

    private void A0C(C1C c1c) {
        this.A05 = c1c;
    }

    private final void A0D(C1U c1u) {
        this.A06 = c1u;
    }

    private void A0E(C1X c1x) {
        this.A07 = c1x;
    }

    private final void A0F(C00641a c00641a) {
        this.A08 = c00641a;
    }

    private void A0G(C00701g c00701g) {
        this.A09 = c00701g;
    }

    private void A0H(String str) {
        this.A0A = str;
    }

    public final int A0r() {
        return this.A00;
    }

    public final int A0s() {
        return this.A01;
    }

    public final int A0t() {
        return this.A02;
    }

    public final int A0u() {
        return this.A03;
    }

    public final int A0v() {
        return this.A04;
    }

    public final C1C A0w() {
        return this.A05;
    }

    public final C1G A0x() {
        return this.A0D.get(0);
    }

    public final C1U A0y() {
        return this.A06;
    }

    public final C1X A0z() {
        return this.A07;
    }

    public final C00641a A10() {
        return this.A08;
    }

    public final C00701g A11() {
        return this.A09;
    }

    public final String A12() {
        return this.A0A;
    }

    public final String A13(String str) {
        return this.A0E.get(str);
    }

    public final List<C1G> A14() {
        return Collections.unmodifiableList(this.A0D);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A15(MC mc) {
        char c;
        String A0P = A0P();
        switch (A0P.hashCode()) {
            case -1364000502:
                String[] strArr = A0H;
                if (strArr[2].charAt(14) == strArr[1].charAt(14)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0H;
                strArr2[3] = "ynfghRupyY8lJ5WDqUPqAC0JO3E4ojqs";
                strArr2[0] = "OEwRxUcpVPGJQFz3LRrAkRkf0LWdVsmf";
                if (A0P.equals(A05(276, 14, 124))) {
                    c = 1;
                    switch (c) {
                        case 0:
                            mc.A43(A05(128, 45, 57));
                            break;
                        case 1:
                            break;
                        default:
                            return;
                    }
                    mc.A43(QP.A08.A02());
                }
                break;
            case 604727084:
                if (A0P.equals(A05(241, 12, 14))) {
                    c = 0;
                    switch (c) {
                    }
                    mc.A43(QP.A08.A02());
                }
                break;
        }
        c = 65535;
        switch (c) {
        }
        mc.A43(QP.A08.A02());
    }

    public final void A16(JSONObject jSONObject) {
        String A05;
        JSONObject layoutObject;
        A0D(C1U.A00(jSONObject.optJSONObject(A05(225, 16, 120))));
        A0F = jSONObject.optJSONObject(A05(89, 12, 95));
        C1Z A06 = new C1Z().A06(jSONObject.optString(A05(319, 5, 56)));
        String A052 = A05(221, 4, 95);
        if (jSONObject.optJSONObject(A052) != null) {
            A05 = jSONObject.optJSONObject(A052).optString(A05(324, 3, 80));
        } else {
            A05 = A05(0, 0, 70);
        }
        A0F(A06.A05(A05).A04(jSONObject.optString(A05(0, 19, 117))).A07(AbstractC00651b.A03(jSONObject)).A08());
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(262, 6, 25));
        if (optJSONObject != null) {
            String A053 = A05(268, 8, 32);
            if (A0H[5].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[2] = "L9OC0yGJthGch16tOTqUcqcE9MnsMaz6";
            strArr[1] = "n6CgIEssquLp46jPM2UWfBhL1rINMjIc";
            layoutObject = optJSONObject.optJSONObject(A053);
        } else {
            layoutObject = null;
        }
        A0C(new C1C(C1P.A01(layoutObject), C1P.A01(optJSONObject != null ? optJSONObject.optJSONObject(A05(253, 9, 30)) : null)));
        A0G(AbstractC00651b.A01(jSONObject));
        A0E(AbstractC00651b.A00(jSONObject));
        A0A(jSONObject.optInt(A05(19, 12, 43), 0));
        A0B(jSONObject.optInt(A05(109, 19, 86), -1));
        this.A0E.putAll(A07(jSONObject));
        this.A03 = jSONObject.optInt(A05(55, 18, 4), 0);
        this.A01 = jSONObject.optInt(A05(73, 16, 120), 1);
        this.A0C = jSONObject.optBoolean(A05(290, 29, 116), false);
        this.A02 = jSONObject.optInt(A05(31, 24, 12), this.A03);
        String optString = jSONObject.optString(A05(Opcodes.LRETURN, 2, 14));
        A0H(optString);
        A0I.put(optString, jSONObject.optString(A05(Opcodes.INSTANCEOF, 28, 8)));
        A0d(jSONObject);
    }

    public final void A17(boolean z) {
        this.A0B = z;
    }

    public final boolean A18() {
        return this.A0B;
    }

    public final boolean A19() {
        return this.A0C;
    }
}
