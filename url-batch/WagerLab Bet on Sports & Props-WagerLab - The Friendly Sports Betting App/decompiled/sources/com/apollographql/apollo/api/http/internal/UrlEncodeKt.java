package com.apollographql.apollo.api.http.internal;

import com.facebook.appevents.AppEventsConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okio.Buffer;

/* compiled from: UrlEncode.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0004\u001a\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"isUnreserved", "", "", "urlEncode", "", "urlDecode", "percentEncode", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UrlEncodeKt {
    private static final boolean isUnreserved(int i) {
        if (97 <= i && i < 123) {
            return true;
        }
        if (65 > i || i >= 91) {
            return (48 <= i && i < 58) || i == 45 || i == 46 || i == 95 || i == 126;
        }
        return true;
    }

    public static final String urlEncode(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        for (byte b : StringsKt.encodeToByteArray(str)) {
            int i = b & 255;
            if (isUnreserved(i)) {
                sb.append((char) i);
            } else {
                sb.append(percentEncode(i));
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final String urlDecode(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Buffer buffer = new Buffer();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                int i2 = i + 3;
                if (i2 > str.length()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                String substring = str.substring(i + 1, i2);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                buffer.writeByte(Integer.parseInt(substring, CharsKt.checkRadix(16)));
                i = i2;
            } else {
                buffer.writeUtf8CodePoint((int) charAt);
                i++;
            }
        }
        return buffer.readUtf8();
    }

    private static final String percentEncode(int i) {
        String num = Integer.toString(i, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        String upperCase = num.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() == 1) {
            upperCase = AppEventsConstants.EVENT_PARAM_VALUE_NO + upperCase;
        }
        return "%" + upperCase;
    }
}
