package io.ktor.http;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HttpHeaderValueParser.kt */
/* loaded from: classes10.dex */
public abstract class HttpHeaderValueParserKt {
    public static final List parseHeaderValue(String str) {
        return parseHeaderValue(str, false);
    }

    public static final List parseHeaderValue(String str, boolean z) {
        if (str == null) {
            return CollectionsKt.emptyList();
        }
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: io.ktor.http.HttpHeaderValueParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                ArrayList parseHeaderValue$lambda$4;
                parseHeaderValue$lambda$4 = HttpHeaderValueParserKt.parseHeaderValue$lambda$4();
                return parseHeaderValue$lambda$4;
            }
        });
        int i = 0;
        while (i <= StringsKt.getLastIndex(str)) {
            i = parseHeaderValueItem(str, i, lazy, z);
        }
        return valueOrEmpty(lazy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList parseHeaderValue$lambda$4() {
        return new ArrayList();
    }

    private static final List valueOrEmpty(Lazy lazy) {
        return lazy.isInitialized() ? (List) lazy.getValue() : CollectionsKt.emptyList();
    }

    private static final String subtrim(String str, int i, int i2) {
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return StringsKt.trim(substring).toString();
    }

    private static final int parseHeaderValueItem(String str, int i, Lazy lazy, boolean z) {
        Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: io.ktor.http.HttpHeaderValueParserKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                ArrayList parseHeaderValueItem$lambda$6;
                parseHeaderValueItem$lambda$6 = HttpHeaderValueParserKt.parseHeaderValueItem$lambda$6();
                return parseHeaderValueItem$lambda$6;
            }
        });
        Integer valueOf = z ? Integer.valueOf(i) : null;
        int i2 = i;
        while (i2 <= StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i2);
            if (charAt == ',') {
                ((ArrayList) lazy.getValue()).add(new HeaderValue(subtrim(str, i, valueOf != null ? valueOf.intValue() : i2), valueOrEmpty(lazy2)));
                return i2 + 1;
            }
            if (charAt == ';') {
                if (valueOf == null) {
                    valueOf = Integer.valueOf(i2);
                }
                i2 = parseHeaderValueParameter(str, i2 + 1, lazy2);
            } else {
                i2 = z ? parseHeaderValueParameter(str, i2, lazy2) : i2 + 1;
            }
        }
        ((ArrayList) lazy.getValue()).add(new HeaderValue(subtrim(str, i, valueOf != null ? valueOf.intValue() : i2), valueOrEmpty(lazy2)));
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList parseHeaderValueItem$lambda$6() {
        return new ArrayList();
    }

    private static final void parseHeaderValueParameter$addParam(Lazy lazy, String str, int i, int i2, String str2) {
        String subtrim = subtrim(str, i, i2);
        if (subtrim.length() == 0) {
            return;
        }
        ((ArrayList) lazy.getValue()).add(new HeaderValueParam(subtrim, str2));
    }

    private static final int parseHeaderValueParameter(String str, int i, Lazy lazy) {
        int i2 = i;
        while (i2 <= StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i2);
            if (charAt == ',' || charAt == ';') {
                parseHeaderValueParameter$addParam(lazy, str, i, i2, "");
                return i2;
            }
            if (charAt == '=') {
                Pair parseHeaderValueParameterValue = parseHeaderValueParameterValue(str, i2 + 1);
                int intValue = ((Number) parseHeaderValueParameterValue.component1()).intValue();
                parseHeaderValueParameter$addParam(lazy, str, i, i2, (String) parseHeaderValueParameterValue.component2());
                return intValue;
            }
            i2++;
        }
        parseHeaderValueParameter$addParam(lazy, str, i, i2, "");
        return i2;
    }

    private static final Pair parseHeaderValueParameterValue(String str, int i) {
        if (str.length() == i) {
            return TuplesKt.to(Integer.valueOf(i), "");
        }
        if (str.charAt(i) == '\"') {
            return parseHeaderValueParameterValueQuoted(str, i + 1);
        }
        int i2 = i;
        while (i2 <= StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i2);
            if (charAt == ',' || charAt == ';') {
                return TuplesKt.to(Integer.valueOf(i2), subtrim(str, i, i2));
            }
            i2++;
        }
        return TuplesKt.to(Integer.valueOf(i2), subtrim(str, i, i2));
    }

    private static final Pair parseHeaderValueParameterValueQuoted(String str, int i) {
        StringBuilder sb = new StringBuilder();
        while (i <= StringsKt.getLastIndex(str)) {
            char charAt = str.charAt(i);
            if (charAt == '\"' && nextIsDelimiterOrEnd(str, i)) {
                return TuplesKt.to(Integer.valueOf(i + 1), sb.toString());
            }
            if (charAt == '\\' && i < StringsKt.getLastIndex(str) - 2) {
                sb.append(str.charAt(i + 1));
                i += 2;
            } else {
                sb.append(charAt);
                i++;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return TuplesKt.to(valueOf, '\"' + sb2);
    }

    private static final boolean nextIsDelimiterOrEnd(String str, int i) {
        int i2 = i + 1;
        while (i2 < str.length() && str.charAt(i2) == ' ') {
            i2++;
        }
        return i2 == str.length() || str.charAt(i2) == ';' || str.charAt(i2) == ',';
    }
}
