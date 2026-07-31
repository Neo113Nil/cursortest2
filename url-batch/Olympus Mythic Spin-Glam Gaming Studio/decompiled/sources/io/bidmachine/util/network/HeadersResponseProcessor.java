package io.bidmachine.util.network;

import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HeadersResponseProcessor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lio/bidmachine/util/network/HeadersResponseProcessor;", "Lio/bidmachine/util/network/ResponseProcessor;", "", "", "", "()V", "process", "urlConnection", "Ljava/net/URLConnection;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class HeadersResponseProcessor implements ResponseProcessor<Map<String, ? extends List<? extends String>>> {
    @Override // io.bidmachine.util.network.ResponseProcessor
    @NotNull
    public Map<String, ? extends List<? extends String>> process(@NotNull URLConnection urlConnection) throws Throwable {
        Intrinsics.checkNotNullParameter(urlConnection, "urlConnection");
        Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue(headerFields, "urlConnection.headerFields");
        return headerFields;
    }
}
