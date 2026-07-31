package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RequestUrlFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "", "getRequestUrl", "", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "defaultUrl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface RequestUrlFactory {
    @NotNull
    String getRequestUrl(@NotNull OperationType operationType, @Nullable String defaultUrl);

    /* compiled from: RequestUrlFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ String getRequestUrl$default(RequestUrlFactory requestUrlFactory, OperationType operationType, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequestUrl");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return requestUrlFactory.getRequestUrl(operationType, str);
        }
    }
}
