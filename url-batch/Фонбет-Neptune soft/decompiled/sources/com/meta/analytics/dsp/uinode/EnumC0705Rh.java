package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC0705Rh {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ EnumC0705Rh[] A02;
    public static final EnumC0705Rh A03;
    public static final EnumC0705Rh A04;
    public static final EnumC0705Rh A05;
    public static final EnumC0705Rh A06;
    public static final EnumC0705Rh A07;
    public static final EnumC0705Rh A08;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, Byte.MAX_VALUE, -92, -86, 101, 120, Byte.MIN_VALUE, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String A022 = A02(0, 5, 105);
        final int i = 0;
        EnumC0705Rh enumC0705Rh = new EnumC0705Rh(A022, i) { // from class: com.facebook.ads.redexgen.X.J6
            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A04(JSONArray jSONArray, int i2) {
                return jSONArray.optJSONArray(i2) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i2) {
                boolean A002;
                A002 = AbstractC0706Ri.A00(jSONArray.optJSONArray(i2), jSONArray2.optJSONArray(i2));
                return A002;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                boolean A002;
                A002 = AbstractC0706Ri.A00(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
                return A002;
            }
        };
        A03 = enumC0705Rh;
        final String A023 = A02(5, 7, 40);
        final int i2 = 1;
        EnumC0705Rh enumC0705Rh2 = new EnumC0705Rh(A023, i2) { // from class: com.facebook.ads.redexgen.X.In
            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A04(JSONArray jSONArray, int i3) {
                return jSONArray.optBoolean(i3, true) == jSONArray.optBoolean(i3, false);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i3) {
                return jSONArray.optBoolean(i3) == jSONArray2.optBoolean(i3);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A04 = enumC0705Rh2;
        final String A024 = A02(12, 6, 81);
        final int i3 = 2;
        EnumC0705Rh enumC0705Rh3 = new EnumC0705Rh(A024, i3) { // from class: com.facebook.ads.redexgen.X.ID
            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A04(JSONArray jSONArray, int i4) {
                return jSONArray.optInt(i4, 0) == jSONArray.optInt(i4, 1) && jSONArray.optDouble(i4, 0.0d) == jSONArray.optDouble(i4, 1.0d) && ((double) jSONArray.optInt(i4, 0)) != jSONArray.optDouble(i4, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i4) {
                return jSONArray.optDouble(i4) == jSONArray2.optDouble(i4);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A05 = enumC0705Rh3;
        final String A025 = A02(18, 3, 50);
        final int i4 = 3;
        EnumC0705Rh enumC0705Rh4 = new EnumC0705Rh(A025, i4) { // from class: com.facebook.ads.redexgen.X.I5
            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A04(JSONArray jSONArray, int i5) {
                return jSONArray.optInt(i5, 0) == jSONArray.optInt(i5, 1) && jSONArray.optDouble(i5, 0.0d) == jSONArray.optDouble(i5, 1.0d) && ((double) jSONArray.optInt(i5, 0)) == jSONArray.optDouble(i5, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i5) {
                return jSONArray.optInt(i5) == jSONArray2.optInt(i5);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        A06 = enumC0705Rh4;
        final String A026 = A02(21, 6, 18);
        final int i5 = 4;
        EnumC0705Rh enumC0705Rh5 = new EnumC0705Rh(A026, i5) { // from class: com.facebook.ads.redexgen.X.I4
            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A04(JSONArray jSONArray, int i6) {
                return jSONArray.optJSONObject(i6) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i6) {
                return AbstractC0706Ri.A02(jSONArray.optJSONObject(i6), jSONArray2.optJSONObject(i6));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC0706Ri.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A07 = enumC0705Rh5;
        final String A027 = A02(27, 6, 36);
        final int i6 = 5;
        EnumC0705Rh enumC0705Rh6 = new EnumC0705Rh(A027, i6) { // from class: com.facebook.ads.redexgen.X.Hx
            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A04(JSONArray jSONArray, int i7) {
                return jSONArray.optString(i7) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i7) {
                return jSONArray.optString(i7).equals(jSONArray2.optString(i7));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0705Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A08 = enumC0705Rh6;
        A02 = new EnumC0705Rh[]{enumC0705Rh, enumC0705Rh2, enumC0705Rh3, enumC0705Rh4, enumC0705Rh5, enumC0705Rh6};
    }

    public EnumC0705Rh(String str, int i) {
    }

    public static EnumC0705Rh A00(JSONArray jSONArray, int i) {
        for (EnumC0705Rh type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC0705Rh A01(JSONObject jSONObject, String str) {
        for (EnumC0705Rh enumC0705Rh : values()) {
            boolean A062 = enumC0705Rh.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (A062) {
                return enumC0705Rh;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC0705Rh valueOf(String str) {
        return (EnumC0705Rh) Enum.valueOf(EnumC0705Rh.class, str);
    }

    public static EnumC0705Rh[] values() {
        return (EnumC0705Rh[]) A02.clone();
    }
}
