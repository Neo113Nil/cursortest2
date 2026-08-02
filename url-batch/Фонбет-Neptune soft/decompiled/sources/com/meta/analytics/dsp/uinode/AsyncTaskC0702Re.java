package com.meta.analytics.dsp.uinode;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Re, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC0702Re extends AsyncTask<String, Void, C0703Rf> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C02177f A00;
    public RJ A01;
    public InterfaceC0701Rd A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final C0703Rf A00(String... strArr) {
        if (KL.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                Map<String, String> map = this.A03;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        A02 = A03(A02, entry.getKey(), entry.getValue());
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new C0703Rf(this.A01);
                    }
                    i = i2;
                }
            }
            return null;
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, Ascii.SYN, Ascii.SYN, Ascii.VT, Ascii.SYN, 68, Ascii.VT, Ascii.DC4, 1, 10, Ascii.CR, 10, 3, 68, 17, Ascii.SYN, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = AsyncTaskC0702Re.class.getSimpleName();
        HashSet hashSet = new HashSet();
        A08 = hashSet;
        hashSet.add(A01(0, 1, 73));
        hashSet.add(A01(29, 4, 24));
    }

    public AsyncTaskC0702Re(C02177f c02177f) {
        this(c02177f, null, null);
    }

    public AsyncTaskC0702Re(C02177f c02177f, Map<String, String> extraData) {
        this(c02177f, extraData, null);
    }

    public AsyncTaskC0702Re(C02177f c02177f, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = c02177f;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), LJ.A01(this.A00.A03().A61()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 92);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 124);
        }
        StringBuilder append = new StringBuilder().append(str).append(A01).append(str2);
        String prepend = A01(2, 1, 100);
        StringBuilder append2 = append.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return append2.append(prepend2).toString();
    }

    private final void A05(C0703Rf response) {
        if (KL.A02(this)) {
            return;
        }
        try {
            InterfaceC0701Rd interfaceC0701Rd = this.A02;
            if (interfaceC0701Rd != null) {
                interfaceC0701Rd.AEC(response);
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    private boolean A06(String str) {
        RJ ADy;
        RK A00 = C0700Rc.A00(this.A00);
        try {
            Map<String, String> map = this.A04;
            if (map == null || map.size() == 0) {
                ADy = A00.ADy(str, new RY());
            } else {
                RY params = new RY();
                params.A05(this.A04);
                ADy = A00.ADz(str, params.A08());
            }
            this.A01 = ADy;
        } catch (Exception e) {
            Log.e(A07, A01(4, 19, 62) + str, e);
        }
        RJ rj = this.A01;
        String[] strArr = A06;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A06[2] = "iiLT70HajwBiOF9fGWlLisdNhF1wiwwV";
        return rj != null && rj.A83() == 200;
    }

    public final void A07(InterfaceC0701Rd interfaceC0701Rd) {
        this.A02 = interfaceC0701Rd;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C0703Rf doInBackground(String[] strArr) {
        if (KL.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            KL.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        InterfaceC0701Rd interfaceC0701Rd = this.A02;
        if (interfaceC0701Rd != null) {
            interfaceC0701Rd.AEA();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C0703Rf c0703Rf) {
        if (KL.A02(this)) {
            return;
        }
        try {
            A05(c0703Rf);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            KL.A00(th, this);
        }
    }
}
