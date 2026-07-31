package com.yandex.div.evaluable.internal;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: LiteralsEscaper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\nH\u0002J+\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0002\u0010\u000fJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\nH\u0002J#\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/evaluable/internal/LiteralsEscaper;", "", "()V", "BACKSLASH", "", "ESCAPE_LITERALS", "", "", "[Ljava/lang/String;", "countConsecutiveBackslashes", "", "string", "index", "escapeLiteral", "possibleLiterals", "(Ljava/lang/String;I[Ljava/lang/String;)Ljava/lang/String;", "isPossibleEscapeLiteral", "", "literal", "from", "process", "escapingLiterals", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiteralsEscaper {
    private static final char BACKSLASH = '\\';

    @NotNull
    public static final LiteralsEscaper INSTANCE = new LiteralsEscaper();

    @NotNull
    private static final String[] ESCAPE_LITERALS = {"'", "@{"};

    private LiteralsEscaper() {
    }

    public static /* synthetic */ String process$default(LiteralsEscaper literalsEscaper, String str, String[] strArr, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr = ESCAPE_LITERALS;
        }
        return literalsEscaper.process(str, strArr);
    }

    @NotNull
    public final String process(@NotNull String string, @NotNull String[] escapingLiterals) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(escapingLiterals, "escapingLiterals");
        if (!StringsKt.contains$default((CharSequence) string, BACKSLASH, false, 2, (Object) null)) {
            return string;
        }
        StringBuilder sb = new StringBuilder(string.length());
        int i = 0;
        while (i < string.length()) {
            if (string.charAt(i) != '\\') {
                sb.append(string.charAt(i));
                i++;
            } else {
                int countConsecutiveBackslashes = countConsecutiveBackslashes(string, i);
                i += countConsecutiveBackslashes;
                int i2 = countConsecutiveBackslashes / 2;
                for (int i3 = 0; i3 < i2; i3++) {
                    sb.append(BACKSLASH);
                }
                if (countConsecutiveBackslashes % 2 == 1) {
                    String escapeLiteral = escapeLiteral(string, i, escapingLiterals);
                    sb.append(escapeLiteral);
                    i += escapeLiteral.length();
                }
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "literalBuilder.toString()");
        return sb2;
    }

    private final int countConsecutiveBackslashes(String string, int index) {
        int i = index;
        while (i < string.length() && string.charAt(i) == '\\') {
            i++;
        }
        return i - index;
    }

    private final String escapeLiteral(String string, int index, String[] possibleLiterals) {
        if (index == string.length() || string.charAt(index) == ' ') {
            String str = "Error tokenizing '" + string + "'.";
            StringBuilder sb = new StringBuilder();
            sb.append("Alone backslash at ");
            sb.append(index - 1);
            throw new EvaluableException(str, new TokenizingException(sb.toString(), null, 2, null));
        }
        for (String str2 : possibleLiterals) {
            if (isPossibleEscapeLiteral(str2, string, index)) {
                return str2;
            }
        }
        throw new EvaluableException("Incorrect string escape", null, 2, null);
    }

    private final boolean isPossibleEscapeLiteral(String literal, String string, int from) {
        int length = literal.length();
        for (int i = 0; i < length; i++) {
            int i2 = from + i;
            if (i2 >= string.length() || string.charAt(i2) != literal.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
