package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.common.Constants;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(GMT_ID);

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder("yyyy-MM-ddThh:mm:ss.sssZ".length());
        padInt(sb, gregorianCalendar.get(1), "yyyy".length());
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, "MM".length());
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), "dd".length());
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), "hh".length());
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(12), "mm".length());
        sb.append(AbstractJsonLexerKt.COLON);
        padInt(sb, gregorianCalendar.get(13), "ss".length());
        sb.append('.');
        padInt(sb, gregorianCalendar.get(14), "sss".length());
        sb.append('Z');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x0196, IndexOutOfBoundsException -> 0x0198, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x0196, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:18:0x004b, B:20:0x005b, B:21:0x005d, B:23:0x0069, B:24:0x006c, B:26:0x0072, B:30:0x007c, B:35:0x008c, B:37:0x0094, B:38:0x00c9, B:40:0x00cf, B:42:0x00d7, B:43:0x015f, B:49:0x00e2, B:50:0x00fa, B:51:0x00fb, B:53:0x0107, B:56:0x0110, B:58:0x012b, B:61:0x013a, B:62:0x015a, B:64:0x015d, B:65:0x018e, B:66:0x0195), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x0196, IndexOutOfBoundsException -> 0x0198, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x0196, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:18:0x004b, B:20:0x005b, B:21:0x005d, B:23:0x0069, B:24:0x006c, B:26:0x0072, B:30:0x007c, B:35:0x008c, B:37:0x0094, B:38:0x00c9, B:40:0x00cf, B:42:0x00d7, B:43:0x015f, B:49:0x00e2, B:50:0x00fa, B:51:0x00fb, B:53:0x0107, B:56:0x0110, B:58:0x012b, B:61:0x013a, B:62:0x015a, B:64:0x015d, B:65:0x018e, B:66:0x0195), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date parse(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        TimeZone timeZone;
        char charAt;
        try {
            int parseInt = parseInt(str, 0, 4);
            int i5 = checkOffset(str, 4, '-') ? 5 : 4;
            int i6 = i5 + 2;
            int parseInt2 = parseInt(str, i5, i6);
            if (checkOffset(str, i6, '-')) {
                i6 = i5 + 3;
            }
            int i7 = i6 + 2;
            int parseInt3 = parseInt(str, i6, i7);
            boolean checkOffset = checkOffset(str, i7, 'T');
            if (!checkOffset && str.length() <= i7) {
                return new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3).getTime();
            }
            if (checkOffset) {
                int i8 = i6 + 5;
                int parseInt4 = parseInt(str, i6 + 3, i8);
                if (checkOffset(str, i8, AbstractJsonLexerKt.COLON)) {
                    i8 = i6 + 6;
                }
                int i9 = i8 + 2;
                int parseInt5 = parseInt(str, i8, i9);
                if (checkOffset(str, i9, AbstractJsonLexerKt.COLON)) {
                    i9 = i8 + 3;
                }
                if (str.length() > i9 && (charAt = str.charAt(i9)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i10 = i9 + 2;
                    i4 = parseInt(str, i9, i10);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (checkOffset(str, i10, '.')) {
                        int i11 = i9 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str, i9 + 4);
                        int min = Math.min(indexOfNonDigit, i9 + 6);
                        i2 = (int) (Math.pow(10.0d, 3 - (min - i11)) * parseInt(str, i11, min));
                        i3 = parseInt5;
                        i = parseInt4;
                        i7 = indexOfNonDigit;
                    } else {
                        i = parseInt4;
                        i7 = i10;
                        i3 = parseInt5;
                        i2 = 0;
                    }
                    if (str.length() > i7) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt2 = str.charAt(i7);
                    if (charAt2 == 'Z') {
                        timeZone = TIMEZONE_Z;
                    } else {
                        if (charAt2 != '+' && charAt2 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                        }
                        String substring = str.substring(i7);
                        if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                            String str2 = GMT_ID + substring;
                            TimeZone timeZone2 = TimeZone.getTimeZone(str2);
                            String id = timeZone2.getID();
                            if (!id.equals(str2) && !id.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                            }
                            timeZone = timeZone2;
                        }
                        timeZone = TIMEZONE_Z;
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                    gregorianCalendar.setLenient(false);
                    gregorianCalendar.set(1, parseInt);
                    gregorianCalendar.set(2, parseInt2 - 1);
                    gregorianCalendar.set(5, parseInt3);
                    gregorianCalendar.set(11, i);
                    gregorianCalendar.set(12, i3);
                    gregorianCalendar.set(13, i4);
                    gregorianCalendar.set(14, i2);
                    return gregorianCalendar.getTime();
                }
                i = parseInt4;
                i7 = i9;
                i3 = parseInt5;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            i4 = 0;
            if (str.length() > i7) {
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new SerializationException("Not an RFC 3339 date: " + str, e);
        }
    }

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
