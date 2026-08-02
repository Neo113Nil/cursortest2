package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.encoding.Base64;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8g, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02398g {
    public static String A00;
    public static LA A01;
    public static byte[] A02;
    public static String[] A03 = {"pgH9SdtSFWTXX0l", "vxegEtvJMZ23RgjyHpc", "ulS7n8X7nNx1Irtm69lPCCFagtwQ2KXJ", "SMp4Mt4DU3EtKobKtaKcK4J1Rc2yK13N", "2t39yg7rltV6biRCRlaAvBIZnsjhSKww", "tY1PV27PV17ox8mww3so5aazg5RDJQQX", "2fotvTqtzlir49zwNSe", "KHZMFPmOyKnxl7a"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{-87, -56, -51, -41};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized LA A00(C02177f c02177f) {
        LA la;
        synchronized (C02398g.class) {
            if (A01 == null) {
                A01 = LB.A00(c02177f);
            }
            la = A01;
        }
        return la;
    }

    public static Integer A01(String str) {
        Map<String, Integer> map = A04;
        synchronized (map) {
            Integer num = map.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(C02177f c02177f, String str, Map<String, String> params) {
        String str2;
        if (A0A(c02177f)) {
            str2 = C0521Kc.A03(str);
        } else {
            str2 = A00;
        }
        if (str2 != null) {
            String fingerprint = A02(1, 3, 55);
            params.put(fingerprint, str2);
        }
    }

    public static void A07(final C02177f c02177f, boolean z) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(c02177f);
        try {
            final SharedPreferences A002 = KE.A00(c02177f);
            final C8K c8k = new C8K(c02177f);
            final String str = Build.FINGERPRINT + A02(0, 1, 30) + c8k.A06();
            A00 = A002.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8f
                public static byte[] A04;
                public static String[] A05 = {"CoyLTTqL9oN", "BQ7yf8H5Dy6", "lyn", "mKjKy3YozjHGjndyHmGPrtRgt1Zkpmof", "kCMvlxHItYqHUu0uJG5AXtsVRpKoPm5F", "PZWzUgGQe3CdPYsrWXqgA6txhpTzavVR", "1z7bJiu6sIQ4w4e4OAYhOvPnvUYdbbgv", "yc5QaeADf08N4Bq6BgqF"};

                public static String A01(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
                    }
                    return new String(copyOfRange);
                }

                public static void A02() {
                    A04 = new byte[]{Ascii.CAN, Base64.padSymbol, 51, 46, Base64.padSymbol, 45, 17, Ascii.GS, Ascii.US, 92, 19, Ascii.FS, Ascii.SYN, 0, Ascii.GS, Ascii.ESC, Ascii.SYN, 92, 4, Ascii.ETB, Ascii.FS, Ascii.SYN, Ascii.ESC, Ascii.FS, Ascii.NAK, 100, 116, 102, 119, 110, 112, 96, Byte.MAX_VALUE, 116, 112, 114, 112, 123, 112, 103, 124, 118};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
                
                    if (r1.equals(r0) != false) goto L6;
                 */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Boolean call() throws Exception {
                    AtomicInteger atomicInteger;
                    String str2 = null;
                    if (Build.VERSION.SDK_INT < 31) {
                        String A012 = A01(0, 1, 52);
                        String checksumApiFingerprint = Build.VERSION.CODENAME;
                    }
                    if (C0478Ih.A2G(C02177f.this)) {
                        String A0B = c8k.A0B();
                        String checksumApiFingerprint2 = A01(6, 19, 13);
                        if (checksumApiFingerprint2.equals(A0B)) {
                            C02177f c02177f2 = C02177f.this;
                            String checksumApiFingerprint3 = c02177f2.getPackageName();
                            str2 = LG.A01(c02177f2, checksumApiFingerprint3);
                        }
                    }
                    String checksumApiFingerprint4 = A05[7];
                    if (checksumApiFingerprint4.length() != 20) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[0] = "qQmXUpBlhYC";
                    strArr[1] = "2roBSgd9zyy";
                    if (str2 == null) {
                        C02177f c02177f3 = C02177f.this;
                        String checksumApiFingerprint5 = c02177f3.getPackageName();
                        C02398g.A00 = C0521Kc.A02(c02177f3, checksumApiFingerprint5);
                    } else {
                        if (C0478Ih.A1I(C02177f.this)) {
                            C02177f c02177f4 = C02177f.this;
                            String checksumApiFingerprint6 = c02177f4.getPackageName();
                            String A022 = C0521Kc.A02(c02177f4, checksumApiFingerprint6);
                            String checksumApiFingerprint7 = A01(1, 5, 33);
                            C8B c8b = new C8B(checksumApiFingerprint7);
                            c8b.A05(1);
                            c8b.A06(1);
                            c8b.A0A(false);
                            JSONObject jSONObject = new JSONObject();
                            String checksumApiFingerprint8 = A01(25, 5, 120);
                            jSONObject.put(checksumApiFingerprint8, str2);
                            String checksumApiFingerprint9 = A01(30, 5, 108);
                            jSONObject.put(checksumApiFingerprint9, A022);
                            c8b.A07(jSONObject);
                            AnonymousClass89 A07 = C02177f.this.A07();
                            int i = C8A.A1I;
                            String checksumApiFingerprint10 = A01(35, 7, 106);
                            A07.A9b(checksumApiFingerprint10, i, c8b);
                        }
                        C02398g.A00 = str2;
                    }
                    SharedPreferences.Editor edit = A002.edit();
                    String str3 = str;
                    String checksumApiFingerprint11 = C02398g.A00;
                    edit.putString(str3, checksumApiFingerprint11).apply();
                    atomicInteger = C02398g.A05;
                    atomicInteger.set(2);
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            AtomicInteger atomicInteger = A05;
            String[] strArr = A03;
            if (strArr[1].length() != strArr[6].length()) {
                Exception e = new RuntimeException();
                throw e;
            }
            String[] strArr2 = A03;
            strArr2[7] = "qnCKfAZ4ZrzI6TW";
            strArr2[0] = "3RwSqq6UclGHbC0";
            atomicInteger.set(0);
        }
    }

    public static void A08(C02177f c02177f, boolean z, String str) {
        if (A0A(c02177f)) {
            A09(c02177f, z, str);
        } else {
            A07(c02177f, z);
        }
    }

    public static void A09(C02177f c02177f, boolean z, final String str) {
        if (str == null) {
            str = c02177f.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(c02177f);
        final C0521Kc c0521Kc = new C0521Kc(c02177f, str);
        try {
            c0521Kc.A06();
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.8e
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                public final Boolean call() throws Exception {
                    Map map;
                    Map map2;
                    C0521Kc.this.A05();
                    map = C02398g.A04;
                    synchronized (map) {
                        map2 = C02398g.A04;
                        map2.put(str, 2);
                    }
                    return true;
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z) {
                futureTask.get();
            }
        } catch (Exception unused) {
            Map<String, Integer> map = A04;
            synchronized (map) {
                map.put(str, 0);
            }
        }
    }

    public static boolean A0A(C02177f c02177f) {
        return ProcessUtils.isRemoteRenderingProcess() || C0478Ih.A2L(c02177f);
    }

    public static boolean A0B(String str) {
        Map<String, Integer> map = A04;
        synchronized (map) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            map.put(str, 1);
            return false;
        }
    }
}
