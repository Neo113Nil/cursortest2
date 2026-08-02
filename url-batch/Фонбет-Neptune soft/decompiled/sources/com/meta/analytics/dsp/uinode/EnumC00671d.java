package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC00671d {
    public static byte[] A01;
    public static final /* synthetic */ EnumC00671d[] A02;
    public static final EnumC00671d A03;
    public static final EnumC00671d A04;
    public static final EnumC00671d A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{Ascii.CAN, Ascii.ETB, Ascii.DC2, Ascii.ESC, 1, Ascii.SO, Ascii.FF, Ascii.ESC, Ascii.GS, Ascii.US, Ascii.GS, Ascii.SYN, Ascii.ESC, 3, 1, Ascii.FS, Ascii.VT, 10, Ascii.FF, 3, 1, Ascii.SYN, 16, Ascii.DC2, 16, Ascii.ESC, Ascii.SYN, 119, 101, 98, 118, 105, 101, 119, Byte.MAX_VALUE, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String A012 = A01(27, 16, 0);
        EnumC00671d enumC00671d = new EnumC00671d(A012, 0, A012);
        A05 = enumC00671d;
        String A013 = A01(13, 14, 115);
        EnumC00671d enumC00671d2 = new EnumC00671d(A013, 1, A013);
        A04 = enumC00671d2;
        String A014 = A01(0, 13, 126);
        EnumC00671d enumC00671d3 = new EnumC00671d(A014, 2, A014);
        A03 = enumC00671d3;
        A02 = new EnumC00671d[]{enumC00671d, enumC00671d2, enumC00671d3};
    }

    public EnumC00671d(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static EnumC00671d A00(String str) {
        for (EnumC00671d enumC00671d : values()) {
            if (enumC00671d.A00.equalsIgnoreCase(str)) {
                return enumC00671d;
            }
        }
        return A03;
    }

    public static EnumC00671d valueOf(String str) {
        return (EnumC00671d) Enum.valueOf(EnumC00671d.class, str);
    }

    public static EnumC00671d[] values() {
        return (EnumC00671d[]) A02.clone();
    }
}
