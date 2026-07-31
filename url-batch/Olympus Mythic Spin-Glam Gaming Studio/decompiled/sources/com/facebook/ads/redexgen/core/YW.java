package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public final class YW {
    public static byte[] A00;
    public static String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{79, 119, 122, 71, 92, 90, 79, 75, 86, 80, 81, 31, 86, 81, 31, 72, 86, 81, 91, 80, 72, 31, 86, 81, 89, 80, 31, 92, 87, 90, 92, 84, 98, 108, 112, 110, 124, 104, 123, 109, 91, 87, 66, 15, 20, 14, 22, 4, 96, 113, 115, 124, 112, 117, 100, 113, 117, 110, 96, 99};
    }

    static {
        A02();
        A02 = YW.class.getSimpleName();
    }

    public static Map<String, String> A01(@Nullable C3218gi c3218gi) {
        Window window;
        HashMap hashMap = new HashMap();
        if (c3218gi == null) {
            return hashMap;
        }
        try {
            hashMap.put(A00(40, 3, 0), String.valueOf(A04(c3218gi)));
            Activity A0E = c3218gi.A0E();
            if (A0E != null && (window = A0E.getWindow()) != null) {
                int i = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                hashMap.put(A00(58, 2, 39), Integer.toString(flags));
                int type = 4194304 & i;
                String A002 = A00(1, 1, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                String flagDismissKeyguardEnabled = A00(0, 1, 79);
                hashMap.put(A00(48, 5, 39), type > 0 ? A002 : flagDismissKeyguardEnabled);
                int type2 = 524288 & i;
                if (A01[6].length() == 6) {
                    throw new RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (type2 <= 0) {
                    A002 = flagDismissKeyguardEnabled;
                }
                hashMap.put(A00(53, 5, 50), A002);
            }
        } catch (Exception e) {
            Log.e(A02, A00(2, 30, 15), e);
            InterfaceC2629Tc A08 = c3218gi.A08();
            int type3 = AbstractC2630Td.A2T;
            A08.ABC(A00(43, 5, 77), type3, new C2631Te(e));
        }
        return hashMap;
    }

    public static boolean A03(C3218gi c3218gi) {
        return !YC.A04(A01(c3218gi));
    }

    public static boolean A04(C3218gi c3218gi) {
        KeyguardManager keyguardManager = (KeyguardManager) c3218gi.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
