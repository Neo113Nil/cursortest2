package io.ktor.http;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HttpHeaderValueParser.kt */
/* loaded from: classes4.dex */
public final class HeaderValue {
    private final List params;
    private final double quality;
    private final String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderValue)) {
            return false;
        }
        HeaderValue headerValue = (HeaderValue) obj;
        return Intrinsics.areEqual(this.value, headerValue.value) && Intrinsics.areEqual(this.params, headerValue.params);
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.params.hashCode();
    }

    public String toString() {
        return "HeaderValue(value=" + this.value + ", params=" + this.params + ')';
    }

    public HeaderValue(String value, List params) {
        Double d;
        Object obj;
        String value2;
        Double doubleOrNull;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(params, "params");
        this.value = value;
        this.params = params;
        Iterator it = params.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((HeaderValueParam) obj).getName(), CampaignEx.JSON_KEY_AD_Q)) {
                    break;
                }
            }
        }
        HeaderValueParam headerValueParam = (HeaderValueParam) obj;
        double d2 = 1.0d;
        if (headerValueParam != null && (value2 = headerValueParam.getValue()) != null && (doubleOrNull = StringsKt.toDoubleOrNull(value2)) != null) {
            double doubleValue = doubleOrNull.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d = doubleOrNull;
            }
            if (d != null) {
                d2 = d.doubleValue();
            }
        }
        this.quality = d2;
    }

    public final List getParams() {
        return this.params;
    }

    public final String getValue() {
        return this.value;
    }
}
