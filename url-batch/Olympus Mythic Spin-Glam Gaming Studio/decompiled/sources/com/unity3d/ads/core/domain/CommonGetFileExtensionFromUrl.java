package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGetFileExtensionFromUrl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetFileExtensionFromUrl;", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "removeUrlQuery", "Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "<init>", "(Lcom/unity3d/ads/core/domain/RemoveUrlQuery;)V", "getRemoveUrlQuery", "()Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "invoke", "", "url", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {

    @NotNull
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(@NotNull RemoveUrlQuery removeUrlQuery) {
        Intrinsics.checkNotNullParameter(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    @NotNull
    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    @Nullable
    public String invoke(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String invoke = this.removeUrlQuery.invoke(url);
        if (invoke == null) {
            return null;
        }
        String substringAfterLast$default = StringsKt.substringAfterLast$default(invoke, '/', (String) null, 2, (Object) null);
        if (!StringsKt.contains$default((CharSequence) substringAfterLast$default, '.', false, 2, (Object) null)) {
            return null;
        }
        String substringAfterLast$default2 = StringsKt.substringAfterLast$default(substringAfterLast$default, '.', (String) null, 2, (Object) null);
        if (substringAfterLast$default2.length() == 0) {
            return null;
        }
        return substringAfterLast$default2;
    }
}
