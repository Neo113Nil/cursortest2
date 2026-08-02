package com.meta.analytics.dsp.uinode;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0887Yl extends AbstractC02267s {
    public static byte[] A00;
    public static String[] A01 = {"jrDlnlrK", "iy84zN2ZyMyHjuWhjHotEPEqpiKyPe89", "dhX4OOJDnXlCZP9pL8vYTq2cDSC1Ep0f", "V5wGJKV", "mjidYuf4", "f2fONlBHJxOBrlG7qLTpq6ivaaiBfV2e", "tNB7OhzIAdgb5rZvvS5ZVqcHEeMF5GsI", "2zYeFugNugInNaPrLN78SJaAZY8hyaCl"};
    public static final C02227m A02;
    public static final C02227m A03;
    public static final C02227m A04;
    public static final C02227m A05;
    public static final C02227m A06;
    public static final C02227m A07;
    public static final C02227m A08;
    public static final C02227m A09;
    public static final C02227m A0A;
    public static final C02227m[] A0B;
    public static final String A0C;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 42);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-102, -73, -102, -71, -92, -87, -81, -96, -94, -96, -83, -22, -35, -39, -28, -93, -107, -100, -107, -109, -92, 112, 122, 112, -106, -94, -97, -99, 112, -75, -58, -75, -66, -60, -61, 112, -89, -104, -107, -94, -107, 112, -11, -25, -18, -25, -27, -10, -62, 5, 17, Ascii.ETB, 16, Ascii.SYN, -54, -52, -53, -62, -24, -12, -15, -17, -62, 7, Ascii.CAN, 7, 16, Ascii.SYN, Ascii.NAK, -49, -64, -45, -49, -95, -110, -91, -95, 109, -99, -97, -106, -102, -114, -97, -90, 109, -104, -110, -90, -19, -34, -15, -19, -71, -21, -34, -33, -34, -21, -34, -25, -36, -34, -20, -71, Ascii.CR, 8, 4, -2, 7, Ascii.FF, -71, -24, -25, -71, -18, -23, -35, -38, -19, -34, -71, -36, -38, -20, -36, -38, -35, -34, -71, -24, -25, -71, -35, -34, -27, -34, -19, -34, -71, -21, -34, -20, -19, -21, -30, -36, -19, -17, 2, 2, -13, -5, -2, 2, -85, -88, -69, -88, -82, -65, -82, -73, -67, -88, -78, -83, -4, Ascii.CR, -4, 5, Ascii.VT, 10, -77, -75, -84, -78, -75, -84, -73, -68, -80, -94, -80, -80, -90, -84, -85, -100, -90, -95, -90, -104, -90, -90, -100, -94, -95, -110, -89, -100, -96, -104, -43, -54, -50, -58, -96, -101, -105, -111, -102, -117, -107, -112, -32, -27, -36, -47};
    }

    static {
        A04();
        C02227m c02227m = new C02227m(0, A00(Opcodes.IF_ICMPEQ, 8, 31), A00(73, 16, 35));
        A04 = c02227m;
        C02227m c02227m2 = new C02227m(1, A00(207, 8, 2), A00(89, 59, 111));
        A09 = c02227m2;
        String A002 = A00(Opcodes.LRETURN, 8, 25);
        String A003 = A00(4, 7, 49);
        C02227m c02227m3 = new C02227m(2, A002, A003);
        A05 = c02227m3;
        String A004 = A00(215, 4, 66);
        String A005 = A00(69, 4, 81);
        C02227m c02227m4 = new C02227m(3, A004, A005);
        A0A = c02227m4;
        String A006 = A00(203, 4, 55);
        String A007 = A00(11, 4, 110);
        C02227m c02227m5 = new C02227m(4, A006, A007);
        A08 = c02227m5;
        C02227m c02227m6 = new C02227m(5, A00(Opcodes.ATHROW, 12, 9), A007);
        A07 = c02227m6;
        C02227m c02227m7 = new C02227m(6, A00(Opcodes.PUTFIELD, 10, 19), A005);
        A06 = c02227m7;
        C02227m c02227m8 = new C02227m(7, A00(155, 4, 29), A005);
        A03 = c02227m8;
        C02227m c02227m9 = new C02227m(8, A00(Opcodes.LCMP, 7, 100), A003);
        A02 = c02227m9;
        C02227m[] c02227mArr = {c02227m, c02227m2, c02227m3, c02227m4, c02227m5, c02227m6, c02227m7, c02227m8, c02227m9};
        A0B = c02227mArr;
        A0C = AbstractC02267s.A02(A00(Opcodes.GOTO, 6, 109), c02227mArr);
    }

    public C0887Yl(C02237o c02237o) {
        super(c02237o);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02267s
    public final String A06() {
        return A00(Opcodes.GOTO, 6, 109);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02267s
    public final C02227m[] A0A() {
        return A0B;
    }

    public final Cursor A0B() {
        return A05().rawQuery(A00(42, 27, 120), null);
    }

    public final Cursor A0C() {
        return A05().rawQuery(A0C, null);
    }

    public final Cursor A0D(String str) {
        return A05().rawQuery(A00(15, 27, 38) + A04.A01 + A00(0, 4, 80), new String[]{str});
    }

    public final String A0E(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map) throws SQLiteException {
        String uuid = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        String eventId = A04.A01;
        contentValues.put(eventId, uuid);
        String eventId2 = A09.A01;
        contentValues.put(eventId2, str);
        contentValues.put(A05.A01, Integer.valueOf(i));
        String eventId3 = A0A.A01;
        contentValues.put(eventId3, str2);
        contentValues.put(A08.A01, Double.valueOf(d));
        contentValues.put(A07.A01, Double.valueOf(d2));
        String eventId4 = A06.A01;
        contentValues.put(eventId4, str3);
        String str4 = A03.A01;
        String eventId5 = map != null ? new JSONObject(map).toString() : null;
        contentValues.put(str4, eventId5);
        if (A01[2].charAt(6) == '9') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "s3YvQaCKhotLBtEqHITMzm2bHxiojI5j";
        strArr[5] = "6LuOsEhvTekWWK5Zi4EuC4VUkJbxKkeL";
        contentValues.put(A02.A01, (Integer) 0);
        SQLiteDatabase A052 = A05();
        String eventId6 = A00(Opcodes.GOTO, 6, 109);
        A052.insertOrThrow(eventId6, null, contentValues);
        return uuid;
    }

    public final boolean A0F(String str) {
        return A05().delete(A00(Opcodes.GOTO, 6, 109), new StringBuilder().append(A04.A01).append(A00(0, 4, 80)).toString(), new String[]{str}) > 0;
    }
}
