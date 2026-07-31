package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpResponsePrintLogFlow.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001aP\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\u00012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"formattedMessage", "", "Lcom/mobilefuse/sdk/network/client/HttpError$ConnectionError;", "getFormattedMessage", "(Lcom/mobilefuse/sdk/network/client/HttpError$ConnectionError;)Ljava/lang/String;", "logHttpResponse", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/network/client/HttpError;", "Lcom/mobilefuse/sdk/network/client/HttpResponse;", "prefix", "extras", "", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes11.dex */
public final class HttpResponsePrintLogFlowKt {
    public static /* synthetic */ Flow logHttpResponse$default(Flow flow, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Http Response";
        }
        if ((i & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        return logHttpResponse(flow, str, map);
    }

    @Nullable
    public static final String getFormattedMessage(@NotNull HttpError.ConnectionError formattedMessage) {
        Intrinsics.checkNotNullParameter(formattedMessage, "$this$formattedMessage");
        if (formattedMessage.getMessage() == null) {
            return null;
        }
        List split$default = StringsKt.split$default((CharSequence) StringsKt.replace$default(formattedMessage.getMessage(), "\r", "", false, 4, (Object) null), new String[]{"\n"}, false, 0, 6, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append("Reasons:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        int i = 0;
        for (Object obj : split$default) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            if (StringsKt.trim(str).toString().length() > 0) {
                sb.append("    " + i2 + ". " + str);
                Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            }
            i = i2;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return StringsKt.trimEnd(sb2).toString();
    }

    @NotNull
    public static final Flow<Either<HttpError, HttpResponse>> logHttpResponse(@NotNull Flow<? extends Either<? extends HttpError, HttpResponse>> logHttpResponse, @NotNull String prefix, @NotNull Map<String, String> extras) {
        Intrinsics.checkNotNullParameter(logHttpResponse, "$this$logHttpResponse");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return FlowKt.flow(new HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1(logHttpResponse, logHttpResponse, extras, prefix));
    }
}
