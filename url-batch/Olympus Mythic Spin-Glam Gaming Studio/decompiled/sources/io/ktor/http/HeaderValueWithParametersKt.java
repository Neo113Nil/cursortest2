package io.ktor.http;

import com.ironsource.B5;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HeaderValueWithParameters.kt */
/* loaded from: classes14.dex */
public abstract class HeaderValueWithParametersKt {
    private static final Set HeaderFieldValueSeparators = SetsKt.setOf((Object[]) new Character[]{'(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', Character.valueOf(B5.U), '{', '}', ' ', '\t', '\n', '\r'});

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean needQuotes(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (isQuoted(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (HeaderFieldValueSeparators.contains(Character.valueOf(str.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean isQuoted(String str) {
        if (str.length() < 2 || StringsKt.first(str) != '\"' || StringsKt.last(str) != '\"') {
            return false;
        }
        int i = 1;
        do {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '\"', i, false, 4, (Object) null);
            if (indexOf$default == StringsKt.getLastIndex(str)) {
                break;
            }
            int i2 = 0;
            for (int i3 = indexOf$default - 1; str.charAt(i3) == '\\'; i3--) {
                i2++;
            }
            if (i2 % 2 == 0) {
                return false;
            }
            i = indexOf$default + 1;
        } while (i < str.length());
        return true;
    }

    public static final String quote(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        quoteTo(str, sb);
        return sb.toString();
    }

    private static final void quoteTo(String str, StringBuilder sb) {
        sb.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\t') {
                sb.append("\\t");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt == '\\') {
                sb.append("\\\\");
            } else {
                sb.append(charAt);
            }
        }
        sb.append("\"");
    }
}
