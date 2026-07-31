package yads;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt;

/* loaded from: classes3.dex */
public final class nq2 {
    public final DecimalFormat a;

    public nq2() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    public final String a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!CharsKt.isWhitespace(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return this.a.format(Long.parseLong(sb2));
        } catch (NumberFormatException unused) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            boolean z = ob1.a;
            throw new o12("Native Ad json has not required attributes");
        }
    }
}
