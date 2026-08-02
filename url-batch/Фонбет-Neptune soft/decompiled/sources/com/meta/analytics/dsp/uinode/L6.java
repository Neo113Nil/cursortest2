package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: assets/audience_network.dex */
public abstract class L6 {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"W5GQ1A2ylrhjGcW6pMhO2KpBuuMbjdB5", "Zx6aawmOn04orHuEArp9Y", "DMoITyb3L57ZarlqFv80uTh", "nsJ3", "1RYBeERStpTg7BOn5NhEUzstvZKMnlwS", "VuYSQW8JaBTDlxPB8JxFHKy", "", "NX"};
    public static final AtomicReference<Boolean> A03;
    public static volatile L5 A04;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{60, 19, Ascii.EM, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.EM, 48, Ascii.FS, 19, Ascii.DC4, Ascii.ESC, Ascii.CAN, Ascii.SO, 9, 83, 5, 16, 17, 123, 121, 110, 115, 108, 115, 110, 99, Ascii.SYN, 7, 7, Ascii.ESC, Ascii.RS, Ascii.DC4, Ascii.SYN, 3, Ascii.RS, Ascii.CAN, Ascii.EM, Ascii.CAN, Ascii.SUB, 17, Ascii.SUB, Ascii.CR, Ascii.SYN, Ascii.FS, 77, 73, 78, 115, 68, 75, 118, 69, 82, 83, 73, 79, 78, 17, 6, 16, 10, Ascii.EM, 6, 2, 1, Ascii.SI, 6, 34, 0, Ascii.ETB, 10, Ascii.NAK, 10, Ascii.ETB, Ascii.SUB, 122, 124, 106, 124, 34, 124, 107, 100};
    }

    static {
        A07();
        A00 = -1;
        A04 = L5.A04;
        A03 = new AtomicReference<>(null);
    }

    public static int A01(Context context) {
        if (A04 == L5.A04) {
            A08(context);
        }
        return A00;
    }

    public static int A02(Context context) {
        try {
            XmlResourceParser parser = context.getAssets().openXmlResourceParser(A06(0, 19, 71));
            return A05(parser);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A05(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(A06(76, 8, 53))) {
                for (int i = 0; i < i; i++) {
                    if (xmlPullParser.getAttributeName(i).equals(A06(45, 13, 26))) {
                        int i2 = Integer.parseInt(xmlPullParser.getAttributeValue(i));
                        return i2;
                    }
                }
            }
        }
        return 0;
    }

    public static void A08(Context context) {
        if (A0B()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A04 != L5.A04) {
            return;
        }
        A04 = L5.A03;
        Executors.newSingleThreadExecutor().execute(new C0786Uk(context));
    }

    public static void A0A(C02177f c02177f, Throwable th) {
        c02177f.A07().A9a(A06(38, 7, 69), C8A.A1c, new C8B(th));
    }

    public static boolean A0B() {
        return A04 == L5.A02;
    }

    public static boolean A0C(C02177f c02177f) {
        Boolean cachedValue = A03.get();
        if (cachedValue != null) {
            return cachedValue.booleanValue();
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = true;
        try {
            xmlResourceParser = c02177f.getAssets().openXmlResourceParser(A06(0, 19, 71));
            loop0: while (true) {
                if (xmlResourceParser.next() == 1) {
                    break;
                }
                if (xmlResourceParser.getEventType() == 2 && (xmlResourceParser.getName().equals(A06(27, 11, 77)) || xmlResourceParser.getName().equals(A06(19, 8, 32)))) {
                    for (int i = 0; i < xmlResourceParser.getAttributeCount(); i++) {
                        if (xmlResourceParser.getAttributeName(i).equals(A06(58, 18, 89)) && !Boolean.parseBoolean(xmlResourceParser.getAttributeValue(i))) {
                            z = false;
                            break loop0;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            A0A(c02177f, th);
            String[] strArr = A02;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A02[0] = "eeMQW8Hjee4jIvBA7BhrF0CVQhVUWKRk";
            if (xmlResourceParser != null) {
                try {
                    xmlResourceParser.close();
                } catch (Exception e) {
                    A0A(c02177f, e);
                }
            }
        }
        A03.set(Boolean.valueOf(z));
        return z;
    }
}
