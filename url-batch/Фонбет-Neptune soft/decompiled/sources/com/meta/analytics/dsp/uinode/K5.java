package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class K5 {
    public static K5 A00;
    public static byte[] A01;
    public static String[] A02 = {"Nd0aIJaSSdT6golxDxmvfQ8KGIhkioAs", "ixyRHf3ginhO64aTdthArc1g6ok2H3", "GbO21nRDfLqDtubwMBv4WZcS7UdykcI0", "mXXayHEFxYYogLv80iNIAWV0V8DSaho2", "P31SQSGtrqVfDfZK9ecLZSYzpsOr4NmF", "LoLWC0hqSx9uRqEUKclND68NLRAhrZnk", "BjBhbLG4paZ7rOUqjAFqxmQoWglNay8W", "K86adGKhBwKF7i3Zzr1zFaSNRf7F"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C0791Up A01(C0889Yn c0889Yn, JSONObject jSONObject, long j) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONArray(A04(Opcodes.DCMPL, 10, 78)).getJSONObject(0);
        C8T A002 = C8T.A00(jSONObject2.getJSONObject(A04(115, 10, 70)));
        String optString = jSONObject2.optString(A04(130, 14, 18));
        String optString2 = jSONObject2.optString(A04(0, 19, 98));
        String A04 = A04(100, 15, 87);
        C8S c8s = new C8S(A002, optString, optString2, jSONObject2.has(A04) ? jSONObject2.optString(A04) : null);
        String A042 = A04(26, 3, 57);
        if (jSONObject2.has(A042)) {
            JSONArray jSONArray = jSONObject2.getJSONArray(A042);
            int i = 0;
            while (true) {
                int length = jSONArray.length();
                String[] strArr = A02;
                if (strArr[5].charAt(22) == strArr[0].charAt(22)) {
                    String[] strArr2 = A02;
                    strArr2[5] = "EVHdYwJmDBIkQbvU6cH0jf8LCXZeDjo6";
                    strArr2[0] = "LqKeHeP2dtVwdsKCNOcbJj8gANtIspsD";
                    if (i >= length) {
                        break;
                    }
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JC.A06(c0889Yn, jSONObject3, j, null);
                    String optString3 = jSONObject3.optString(A04(19, 7, 39));
                    String optString4 = jSONObject3.optString(A04(85, 15, 63));
                    JSONObject optJSONObject = jSONObject3.optJSONObject(A04(63, 4, 116));
                    JSONArray optJSONArray = jSONObject3.optJSONArray(A04(Opcodes.IF_ICMPLT, 8, 90));
                    if (optJSONObject != null) {
                        c8s.A0A(new C8Q(optString3, optString4, optJSONObject, optJSONArray));
                    } else {
                        c0889Yn.A0E().A4t(AdErrorType.UNKNOWN_ERROR.getErrorCode(), A04(67, 18, 82));
                    }
                    i++;
                } else {
                    throw new RuntimeException();
                }
            }
        }
        String A043 = A04(47, 12, 116);
        if (jSONObject2.has(A043)) {
            c8s.A0B(jSONObject2.getJSONObject(A043));
        }
        return new C0791Up(c8s, jSONObject.optString(A04(29, 18, 1)));
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, 113, 74, 103, 112, 101, 122, 103, 97, 124, 123, 114, 74, 118, 122, 123, 115, 124, 114, 49, 52, 49, 32, 36, 53, 34, 47, 42, Base64.padSymbol, Ascii.ETB, Ascii.CAN, 41, 0, Ascii.ETB, Ascii.SUB, Ascii.US, Ascii.DC2, Ascii.ETB, 2, Ascii.US, Ascii.EM, Ascii.CAN, 41, 3, 3, Ascii.US, Ascii.DC2, 96, 107, 98, 106, 109, 92, 115, 98, 113, 98, 110, 112, Ascii.ETB, Ascii.ESC, 16, 17, 103, 98, 119, 98, 65, 68, 81, 68, 106, 71, 79, 64, 70, 81, 5, 76, 86, 5, 75, 80, 73, 73, 44, 41, 60, 41, Ascii.ETB, 37, 39, 44, 45, 36, Ascii.ETB, 60, 49, 56, 45, 68, 67, 76, Byte.MAX_VALUE, 84, 69, 83, 84, Byte.MAX_VALUE, 67, 79, 78, 70, 73, 71, 85, 84, 87, 88, 95, 88, 69, 88, 94, 95, 74, 93, 93, 64, 93, 3, 0, 4, 17, 16, Ascii.ETB, 0, 58, 6, 10, Ascii.VT, 3, Ascii.FF, 2, Ascii.SI, 7, 17, 17, 3, 5, 7, 73, 85, 88, 90, 92, 84, 92, 87, 77, 74, 89, 95, 76, 78, 70, 72, 95, 94, 69, 72, 65, 84};
    }

    static {
        A05();
        A00 = new K5();
    }

    public static synchronized K5 A00() {
        K5 k5;
        synchronized (K5.class) {
            k5 = A00;
        }
        return k5;
    }

    private C0790Uo A02(JSONObject jSONObject) {
        return new C0790Uo(jSONObject.optString(A04(Opcodes.D2F, 7, 21), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), null);
    }

    private C0790Uo A03(JSONObject jSONObject) {
        try {
            JSONArray placements = jSONObject.getJSONArray(A04(Opcodes.DCMPL, 10, 78));
            JSONObject definition = placements.getJSONObject(0);
            C8T A002 = C8T.A00(definition.getJSONObject(A04(115, 10, 70)));
            String adReportingConfig = definition.optString(A04(130, 14, 18));
            return new C0790Uo(jSONObject.optString(A04(Opcodes.D2F, 7, 21), A04(0, 0, 87)), jSONObject.optInt(A04(59, 4, 3), 0), new C8S(A002, adReportingConfig, definition.optString(A04(0, 19, 98)), null));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final K7 A06(C0889Yn c0889Yn, String str, long j) throws JSONException {
        char c;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(A04(Opcodes.RET, 4, 70));
            int hashCode = optString.hashCode();
            String A04 = A04(125, 5, 88);
            switch (hashCode) {
                case 96432:
                    if (optString.equals(A04(26, 3, 57))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (optString.equals(A04)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return A01(c0889Yn, jSONObject, j);
                case 1:
                    return A03(jSONObject);
                default:
                    JSONObject jsonResponse = jSONObject.optJSONObject(A04);
                    if (jsonResponse != null) {
                        return A02(jsonResponse);
                    }
                    break;
            }
        }
        return new K7(K6.A04);
    }
}
