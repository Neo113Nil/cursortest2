package io.bidmachine.util.network;

import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ResponseMetadata.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/bidmachine/util/network/ResponseMetadata;", "", "url", "Ljava/net/URL;", "code", "", "headers", "", "", "", "(Ljava/net/URL;ILjava/util/Map;)V", "getCode", "()I", "getHeaders", "()Ljava/util/Map;", "getUrl", "()Ljava/net/URL;", "getHeader", "key", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class ResponseMetadata {
    private final int code;

    @Nullable
    private final Map<String, List<String>> headers;

    @NotNull
    private final URL url;

    /* JADX WARN: Multi-variable type inference failed */
    public ResponseMetadata(@NotNull URL url, int i, @Nullable Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.code = i;
        this.headers = map;
    }

    public /* synthetic */ ResponseMetadata(URL url, int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(url, i, (i2 & 4) != 0 ? null : map);
    }

    @NotNull
    public final URL getUrl() {
        return this.url;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getHeader(@NotNull String key) {
        List<String> list;
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, List<String>> map = this.headers;
        if (map == null || (list = map.get(key)) == null) {
            return null;
        }
        return (String) CollectionsKt.firstOrNull((List) list);
    }
}
