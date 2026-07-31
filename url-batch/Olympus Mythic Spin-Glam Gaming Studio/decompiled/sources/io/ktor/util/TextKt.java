package io.ktor.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Text.kt */
/* loaded from: classes15.dex */
public abstract class TextKt {
    private static final char toLowerCasePreservingASCII(char c) {
        return ('A' > c || c >= '[') ? (c < 0 || c >= 128) ? Character.toLowerCase(c) : c : (char) (c + ' ');
    }

    public static final CaseInsensitiveString caseInsensitive(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new CaseInsensitiveString(str);
    }

    public static final String toLowerCasePreservingASCIIRules(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = str.charAt(i);
            if (toLowerCasePreservingASCII(charAt) != charAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i);
        int lastIndex = StringsKt.getLastIndex(str);
        if (i <= lastIndex) {
            while (true) {
                sb.append(toLowerCasePreservingASCII(str.charAt(i)));
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return sb.toString();
    }
}
