package com.meta.analytics.dsp.uinode;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class GD {
    public static byte[] A00;
    public static String[] A01 = {"xVcH0cVTcM5dU0QEBrIHPQrgB87ckwr3", "Yf7aft0T7tBGFrMB58RtpYM4TkcmUw5V", "ISkGeuFN5Zur6LMrf", "n8NQXDKEWUvjAMPXZcFJTvL046WVMJJd", "llz3D7", "D2JaB4yw3jvtMDgGovIRxLPj", "1AmkBf3sygWt0Ydi8ksa8eUE1O", "BOb6KOWWr15AuA974NLt7KdVjpKhFTgP"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        if (A01[4].length() == 29) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "VQDAG0Hjx9dAkblLnkOv7N5A";
        strArr[6] = "N4JdvVtxtXseuXAHK8DjAghucx";
        A00 = new byte[]{-26, -56, -59, -78, -68, -58, -90, -68, -58, -5, -64, -87, -4, Ascii.CAN, -48, -30, -84, -83, -3, -53};
    }

    static {
        A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r4 == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        return r6.A0E(r8.get(r7[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r4 == 1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static GH A00(GH gh, String[] strArr, Map<String, GH> map) {
        if (gh == null && strArr == null) {
            if (A01[2].length() != 17) {
                throw new RuntimeException();
            }
            A01[3] = "hdj5xkr89sMqDNtQe3zjMhPrx8WAgiZJ";
            return null;
        }
        int i = 0;
        if (gh == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (gh == null && strArr.length > 1) {
            GH gh2 = new GH();
            int length = strArr.length;
            while (i < length) {
                gh2.A0E(map.get(strArr[i]));
                i++;
            }
            return gh2;
        }
        if (gh != null && strArr != null) {
            int length2 = strArr.length;
            if (A01[3].charAt(24) != '6') {
                A01[4] = "zDaVAZ4";
            }
        }
        if (gh != null && strArr != null && strArr.length > 1) {
            int length3 = strArr.length;
            while (i < length3) {
                gh.A0E(map.get(strArr[i]));
                i++;
            }
            return gh;
        }
        return gh;
    }

    public static String A02(String str) {
        String A012 = A01(1, 2, 90);
        String A013 = A01(0, 1, 123);
        String replaceAll = str.replaceAll(A012, A013);
        String out = A01(4, 5, 59);
        String replaceAll2 = replaceAll.replaceAll(out, A013);
        String A014 = A01(3, 1, 49);
        String replaceAll3 = replaceAll2.replaceAll(A013, A014);
        String out2 = A01(9, 11, 63);
        return replaceAll3.replaceAll(out2, A014);
    }

    public static void A04(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i, int i2, GH gh) {
        if (gh.A07() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(gh.A07()), i, i2, 33);
        }
        if (gh.A0P()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (gh.A0Q()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (gh.A0O()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(gh.A05()), i, i2, 33);
        }
        if (gh.A0N()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(gh.A04()), i, i2, 33);
        }
        if (gh.A0L() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(gh.A0L()), i, i2, 33);
        }
        if (gh.A08() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(gh.A08()), i, i2, 33);
        }
        switch (gh.A06()) {
            case 1:
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) gh.A03(), true), i, i2, 33);
                break;
            case 2:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(gh.A03()), i, i2, 33);
                break;
            case 3:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(gh.A03() / 100.0f), i, i2, 33);
                break;
        }
    }
}
