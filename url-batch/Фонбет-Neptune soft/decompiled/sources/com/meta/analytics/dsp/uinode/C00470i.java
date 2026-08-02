package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00470i {
    public static byte[] A00;
    public static String[] A01 = {"88AoqknPZ4rnlocmRSd1iIvU160OI6Up", "Xa", "c0t0ITAkOrWkNbi2AOUUle7x7Lv9c02n", "B7XNNyfmW5R2wceLmJkXAkDES3fZG3Pt", "MUV", "NALjFYAH0tlSEiNw3RaQSfKZY5jyxbRm", "XF7p93xq3OHri6co5HggQunfVTz3vEaG", "n2FdIZz9zx79PfKUryB9rXi8CBHMM9xX"};
    public static final String A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, Ascii.SUB, 78, 85, Ascii.SUB, 74, 91, 72, 73, 95, Ascii.SUB, 80, 73, 85, 84, Ascii.SUB, 94, 91, 78, 91, Ascii.SUB, 83, 84, Ascii.SUB, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, Ascii.DC4, 19, Ascii.SYN, 3, Ascii.SYN, 82, 83, 78, 84, 73, 88, 65, 94, 75, 64, 113, 66, 71, 64, 69, 98, 115, 96, 97, 123, 124, 117, Ascii.ESC, 10, Ascii.CAN, Ascii.CAN, Ascii.US, 3, Ascii.EM, 4, Ascii.RS, Ascii.FF, 3, 39, 32, 59, 38, 49, 40, 47, 52, 41, 62, 4, 46, 41, 55, 4, 44, 62, 57, 4, Base64.padSymbol, 58, 55, 55, 57, 58, 56, 48, 49, 55, 48, 32, 123, 100, 105, 104, 98, 82, 120, Byte.MAX_VALUE, 97};
    }

    static {
        A03();
        A02 = C00470i.class.getSimpleName();
    }

    public static AbstractC00460h A00(C0889Yn c0889Yn, J2 j2, String str, Uri uri, Map<String, String> map, C1U c1u) {
        return A01(c0889Yn, j2, str, uri, map, true, false, c1u);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC00460h A01(C0889Yn c0889Yn, J2 j2, String action, Uri uri, Map<String, String> map, boolean z, boolean z2, C1U c1u) {
        char c;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        String key = uri.getAuthority();
        String queryParameter = uri.getQueryParameter(A02(113, 9, 44));
        String queryParameter2 = uri.getQueryParameter(A02(45, 4, 86));
        if (queryParameter2 != null) {
            boolean isEmpty = TextUtils.isEmpty(queryParameter2);
            if (A01[2].charAt(25) != 'L') {
                throw new RuntimeException();
            }
            A01[2] = "ISDJ842CIGTTmPHzT0dMVnvZcLrwzpZ1";
            if (!isEmpty) {
                try {
                    JSONObject jSONObject = new JSONObject(queryParameter2);
                    Iterator<String> dataIterator = jSONObject.keys();
                    while (dataIterator.hasNext()) {
                        String next = dataIterator.next();
                        try {
                            map.put(next, jSONObject.getString(next));
                        } catch (JSONException e) {
                            e = e;
                            c0889Yn.A07().A9a(A02(64, 7, 51), C8A.A23, new C8B(e));
                            Log.w(A02, A02(0, 45, 27), e);
                            C00520o A002 = C00520o.A00(j2, ActivityUtils.A00());
                            switch (key.hashCode()) {
                                case -1458789996:
                                    break;
                                case 109770977:
                                    break;
                                case 1546100943:
                                    break;
                            }
                            switch (c) {
                            }
                        }
                    }
                } catch (JSONException e2) {
                    e = e2;
                }
            }
        }
        C00520o A0022 = C00520o.A00(j2, ActivityUtils.A00());
        switch (key.hashCode()) {
            case -1458789996:
                if (key.equals(A02(71, 11, 74))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109770977:
                if (key.equals(A02(82, 5, 117))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1546100943:
                if (key.equals(A02(55, 9, 15))) {
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
                if (queryParameter != null) {
                    return null;
                }
                return (!z2 || TextUtils.isEmpty(uri.getQueryParameter(A02(87, 22, 122)))) ? new C0403Fg(c0889Yn, j2, action, uri, map, A0022, z, c1u) : new C0402Ff(c0889Yn, j2, action, uri, map, true);
            case 1:
                if (A02(109, 4, 100).equals(uri.getQueryParameter(A02(49, 6, 28)))) {
                    return new C0400Fd(c0889Yn, j2, action, uri, map, A0022, z);
                }
                return z2 ? new C0402Ff(c0889Yn, j2, action, uri, map) : new C0401Fe(c0889Yn, j2, action, uri, map, A0022, z);
            case 2:
                return new C1021bY(c0889Yn, j2, action, uri, map);
            default:
                return new C1020bX(c0889Yn, j2, action, uri);
        }
    }

    public static boolean A04(String str) {
        return A02(82, 5, 117).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
