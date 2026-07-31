package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
/* loaded from: classes10.dex */
public abstract class StringsKt___StringsKt extends StringsKt___StringsJvmKt {
    public static char first(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static Character firstOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static char last(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(StringsKt.getLastIndex(charSequence));
    }

    public static Character lastOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static char single(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String drop(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        String substring = str.substring(RangesKt.coerceAtMost(i, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static String dropLast(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        return StringsKt.take(str, RangesKt.coerceAtLeast(str.length() - i, 0));
    }

    public static String take(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        String substring = str.substring(0, RangesKt.coerceAtMost(i, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static CharSequence reversed(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }
}
