package io.ktor.http;

import io.ktor.util.CharsetKt;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: URLParser.kt */
/* loaded from: classes6.dex */
public abstract class URLParserKt {
    private static final List ROOT_PATH = CollectionsKt.listOf("");

    public static final List getROOT_PATH() {
        return ROOT_PATH;
    }

    public static final URLBuilder takeFrom(URLBuilder uRLBuilder, String urlString) {
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        if (StringsKt.isBlank(urlString)) {
            return uRLBuilder;
        }
        try {
            return takeFromUnsafe(uRLBuilder, urlString);
        } catch (Throwable th) {
            throw new URLParserException(urlString, th);
        }
    }

    private static final void parseFile(URLBuilder uRLBuilder, String str, int i, int i2, int i3) {
        if (i3 == 1) {
            uRLBuilder.setHost("");
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            URLBuilderKt.setEncodedPath(uRLBuilder, substring);
            return;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                uRLBuilder.setHost("");
                StringBuilder sb = new StringBuilder();
                sb.append('/');
                String substring2 = str.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                sb.append(substring2);
                URLBuilderKt.setEncodedPath(uRLBuilder, sb.toString());
                return;
            }
            throw new IllegalArgumentException("Invalid file url: " + str);
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '/', i, false, 4, (Object) null);
        if (indexOf$default == -1 || indexOf$default == i2) {
            String substring3 = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            uRLBuilder.setHost(substring3);
        } else {
            String substring4 = str.substring(i, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
            uRLBuilder.setHost(substring4);
            String substring5 = str.substring(indexOf$default, i2);
            Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
            URLBuilderKt.setEncodedPath(uRLBuilder, substring5);
        }
    }

    public static final URLBuilder takeFromUnsafe(URLBuilder uRLBuilder, String urlString) {
        int i;
        List emptyList;
        List emptyList2;
        int i2;
        Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        int length = urlString.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (!CharsKt.isWhitespace(urlString.charAt(i3))) {
                break;
            }
            i3++;
        }
        int length2 = urlString.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i4 = length2 - 1;
                if (!CharsKt.isWhitespace(urlString.charAt(length2))) {
                    i = length2;
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length2 = i4;
            }
        }
        i = -1;
        int i5 = i + 1;
        int findScheme = findScheme(urlString, i3, i5);
        if (findScheme > 0) {
            String substring = urlString.substring(i3, i3 + findScheme);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            uRLBuilder.setProtocol(URLProtocol.INSTANCE.createOrDefault(substring));
            i3 += findScheme + 1;
        }
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "data")) {
            String substring2 = urlString.substring(i3, i5);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            uRLBuilder.setHost(substring2);
            return uRLBuilder;
        }
        int count = count(urlString, i3, i5, '/');
        int i6 = i3 + count;
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "file")) {
            parseFile(uRLBuilder, urlString, i6, i5, count);
            return uRLBuilder;
        }
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "mailto")) {
            if (count != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            parseMailto(uRLBuilder, urlString, i6, i5);
            return uRLBuilder;
        }
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "about")) {
            if (count != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String substring3 = urlString.substring(i6, i5);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            uRLBuilder.setHost(substring3);
            return uRLBuilder;
        }
        if (Intrinsics.areEqual(uRLBuilder.getProtocol().getName(), "tel")) {
            if (count != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String substring4 = urlString.substring(i6, i5);
            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
            uRLBuilder.setHost(substring4);
            return uRLBuilder;
        }
        if (count >= 2) {
            int i7 = i6;
            while (true) {
                i2 = i7;
                Integer valueOf = Integer.valueOf(StringsKt.indexOfAny$default(urlString, CharsetKt.toCharArray("@/\\?#"), i7, false, 4, null));
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                i6 = valueOf != null ? valueOf.intValue() : i5;
                if (i6 >= i5 || urlString.charAt(i6) != '@') {
                    break;
                }
                int indexOfColonInHostPort = indexOfColonInHostPort(urlString, i2, i6);
                if (indexOfColonInHostPort != -1) {
                    String substring5 = urlString.substring(i2, indexOfColonInHostPort);
                    Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
                    uRLBuilder.setEncodedUser(substring5);
                    String substring6 = urlString.substring(indexOfColonInHostPort + 1, i6);
                    Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
                    uRLBuilder.setEncodedPassword(substring6);
                } else {
                    String substring7 = urlString.substring(i2, i6);
                    Intrinsics.checkNotNullExpressionValue(substring7, "substring(...)");
                    uRLBuilder.setEncodedUser(substring7);
                }
                i7 = i6 + 1;
            }
            fillHost(uRLBuilder, urlString, i2, i6);
        }
        int i8 = i6;
        if (i8 >= i5) {
            uRLBuilder.setEncodedPathSegments(urlString.charAt(i) == '/' ? ROOT_PATH : CollectionsKt.emptyList());
            return uRLBuilder;
        }
        if (count == 0) {
            emptyList = CollectionsKt.dropLast(uRLBuilder.getEncodedPathSegments(), 1);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        uRLBuilder.setEncodedPathSegments(emptyList);
        Integer valueOf2 = Integer.valueOf(StringsKt.indexOfAny$default(urlString, CharsetKt.toCharArray("?#"), i8, false, 4, null));
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        int intValue = num != null ? num.intValue() : i5;
        if (intValue > i8) {
            String substring8 = urlString.substring(i8, intValue);
            Intrinsics.checkNotNullExpressionValue(substring8, "substring(...)");
            List emptyList3 = (uRLBuilder.getEncodedPathSegments().size() == 1 && ((CharSequence) CollectionsKt.first(uRLBuilder.getEncodedPathSegments())).length() == 0) ? CollectionsKt.emptyList() : uRLBuilder.getEncodedPathSegments();
            List split$default = Intrinsics.areEqual(substring8, "/") ? ROOT_PATH : StringsKt.split$default((CharSequence) substring8, new char[]{'/'}, false, 0, 6, (Object) null);
            if (count == 1) {
                emptyList2 = ROOT_PATH;
            } else {
                emptyList2 = CollectionsKt.emptyList();
            }
            uRLBuilder.setEncodedPathSegments(CollectionsKt.plus((Collection) emptyList3, (Iterable) CollectionsKt.plus((Collection) emptyList2, (Iterable) split$default)));
            i8 = intValue;
        }
        if (i8 < i5 && urlString.charAt(i8) == '?') {
            i8 = parseQuery(uRLBuilder, urlString, i8, i5);
        }
        parseFragment(uRLBuilder, urlString, i8, i5);
        return uRLBuilder;
    }

    private static final void parseMailto(URLBuilder uRLBuilder, String str, int i, int i2) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, "@", i, false, 4, (Object) null);
        if (indexOf$default == -1) {
            throw new IllegalArgumentException("Invalid mailto url: " + str + ", it should contain '@'.");
        }
        String substring = str.substring(i, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        uRLBuilder.setUser(CodecsKt.decodeURLPart$default(substring, 0, 0, null, 7, null));
        String substring2 = str.substring(indexOf$default + 1, i2);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        uRLBuilder.setHost(substring2);
    }

    private static final int parseQuery(final URLBuilder uRLBuilder, String str, int i, int i2) {
        int i3 = i + 1;
        if (i3 == i2) {
            uRLBuilder.setTrailingQuery(true);
            return i2;
        }
        Integer valueOf = Integer.valueOf(StringsKt.indexOf$default((CharSequence) str, '#', i3, false, 4, (Object) null));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        }
        String substring = str.substring(i3, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        QueryKt.parseQueryString$default(substring, 0, 0, false, 6, null).forEach(new Function2() { // from class: io.ktor.http.URLParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit parseQuery$lambda$5;
                parseQuery$lambda$5 = URLParserKt.parseQuery$lambda$5(URLBuilder.this, (String) obj, (List) obj2);
                return parseQuery$lambda$5;
            }
        });
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit parseQuery$lambda$5(URLBuilder uRLBuilder, String key, List values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        uRLBuilder.getEncodedParameters().appendAll(key, values);
        return Unit.INSTANCE;
    }

    private static final void parseFragment(URLBuilder uRLBuilder, String str, int i, int i2) {
        if (i >= i2 || str.charAt(i) != '#') {
            return;
        }
        String substring = str.substring(i + 1, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        uRLBuilder.setEncodedFragment(substring);
    }

    private static final void fillHost(URLBuilder uRLBuilder, String str, int i, int i2) {
        int i3;
        Integer valueOf = Integer.valueOf(indexOfColonInHostPort(str, i, i2));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : i2;
        String substring = str.substring(i, intValue);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        uRLBuilder.setHost(substring);
        int i4 = intValue + 1;
        if (i4 < i2) {
            String substring2 = str.substring(i4, i2);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            i3 = Integer.parseInt(substring2);
        } else {
            i3 = 0;
        }
        uRLBuilder.setPort(i3);
    }

    private static final int findScheme(String str, int i, int i2) {
        int i3;
        int i4;
        char charAt = str.charAt(i);
        if (('a' > charAt || charAt >= '{') && ('A' > charAt || charAt >= '[')) {
            i3 = i;
            i4 = i3;
        } else {
            i3 = i;
            i4 = -1;
        }
        while (i3 < i2) {
            char charAt2 = str.charAt(i3);
            if (charAt2 != ':') {
                if (charAt2 == '#' || charAt2 == '/' || charAt2 == '?') {
                    break;
                }
                if (i4 == -1 && (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')))) {
                    i4 = i3;
                }
                i3++;
            } else {
                if (i4 == -1) {
                    return i3 - i;
                }
                throw new IllegalArgumentException("Illegal character in scheme at position " + i4);
            }
        }
        return -1;
    }

    private static final int count(String str, int i, int i2, char c) {
        int i3 = 0;
        while (true) {
            int i4 = i + i3;
            if (i4 >= i2 || str.charAt(i4) != c) {
                break;
            }
            i3++;
        }
        return i3;
    }

    private static final int indexOfColonInHostPort(String str, int i, int i2) {
        boolean z = false;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if (charAt == '[') {
                    z = true;
                } else if (charAt == ']') {
                    z = false;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
