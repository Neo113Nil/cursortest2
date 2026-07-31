package com.revenuecat.purchases.common;

import com.revenuecat.purchases.common.networking.HTTPResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HTTPResponseOriginalSource.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"originalDataSource", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "getOriginalDataSource", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HTTPResponseOriginalSourceKt {
    public static final HTTPResponseOriginalSource getOriginalDataSource(HTTPResult hTTPResult) {
        Intrinsics.checkNotNullParameter(hTTPResult, "<this>");
        if (hTTPResult.isLoadShedderResponse() && hTTPResult.isFallbackURL()) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Request to fallback URL was handled by load shedder, which should never happen. Defaulting to fallback source.", null);
        }
        return hTTPResult.isFallbackURL() ? HTTPResponseOriginalSource.FALLBACK : hTTPResult.isLoadShedderResponse() ? HTTPResponseOriginalSource.LOAD_SHEDDER : HTTPResponseOriginalSource.MAIN;
    }
}
