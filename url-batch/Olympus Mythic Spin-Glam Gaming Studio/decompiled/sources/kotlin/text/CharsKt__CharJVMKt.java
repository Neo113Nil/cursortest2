package kotlin.text;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CharJVM.kt */
/* loaded from: classes4.dex */
public abstract class CharsKt__CharJVMKt {
    public static boolean isWhitespace(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final String uppercase(char c, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static String lowercase(char c, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String valueOf = String.valueOf(c);
        Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static String titlecase(char c, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String uppercase = uppercase(c, locale);
        if (uppercase.length() <= 1) {
            String valueOf = String.valueOf(c);
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return !Intrinsics.areEqual(uppercase, upperCase) ? uppercase : String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return uppercase;
        }
        char charAt = uppercase.charAt(0);
        Intrinsics.checkNotNull(uppercase, "null cannot be cast to non-null type java.lang.String");
        String substring = uppercase.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }

    public static final int digitOf(char c, int i) {
        return Character.digit((int) c, i);
    }

    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new IntRange(2, 36));
    }
}
