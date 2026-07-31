package kotlinx.datetime.format;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalDateFormat.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class DayOfWeekNames$toString$1 extends FunctionReferenceImpl implements Function1<String, String> {
    public static final DayOfWeekNames$toString$1 INSTANCE = new DayOfWeekNames$toString$1();

    DayOfWeekNames$toString$1() {
        super(1, String.class, InAppPurchaseConstants.METHOD_TO_STRING, "toString()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.toString();
    }
}
