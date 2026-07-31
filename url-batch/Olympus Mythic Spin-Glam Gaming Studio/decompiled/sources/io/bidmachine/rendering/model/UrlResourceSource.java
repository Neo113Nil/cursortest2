package io.bidmachine.rendering.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/bidmachine/rendering/model/UrlResourceSource;", "Lio/bidmachine/rendering/model/ResourceSource;", "", "", "urls", "<init>", "(Ljava/util/List;)V", "url", "(Ljava/lang/String;)V", "a", "Ljava/util/List;", "getUrls", "()Ljava/util/List;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class UrlResourceSource implements ResourceSource {

    /* renamed from: a, reason: from kotlin metadata */
    private final List urls;

    public UrlResourceSource(@NotNull List<String> urls) {
        Intrinsics.checkNotNullParameter(urls, "urls");
        this.urls = urls;
    }

    @NotNull
    public final List<String> getUrls() {
        return this.urls;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UrlResourceSource(@NotNull String url) {
        this((List<String>) CollectionsKt.listOf(url));
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
