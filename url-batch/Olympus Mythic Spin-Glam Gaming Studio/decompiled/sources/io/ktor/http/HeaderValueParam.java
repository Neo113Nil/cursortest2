package io.ktor.http;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HttpHeaderValueParser.kt */
/* loaded from: classes4.dex */
public final class HeaderValueParam {
    private final boolean escapeValue;
    private final String name;
    private final String value;

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public String toString() {
        return "HeaderValueParam(name=" + this.name + ", value=" + this.value + ", escapeValue=" + this.escapeValue + ')';
    }

    public HeaderValueParam(String name, String value, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.value = value;
        this.escapeValue = z;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderValueParam(String name, String value) {
        this(name, value, false);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public boolean equals(Object obj) {
        if (obj instanceof HeaderValueParam) {
            HeaderValueParam headerValueParam = (HeaderValueParam) obj;
            if (StringsKt.equals(headerValueParam.name, this.name, true) && StringsKt.equals(headerValueParam.value, this.value, true)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.value.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode();
    }
}
