package io.bidmachine;

import android.util.Pair;
import io.bidmachine.internal.InterfaceC6006a;
import io.bidmachine.internal.InterfaceC6014i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lio/bidmachine/AdResponseCacheParamsAdapter;", "Lio/bidmachine/internal/i;", "Lio/bidmachine/AdResponse;", "Lio/bidmachine/internal/a;", "cacheParamsAccessor", "<init>", "(Lio/bidmachine/internal/a;)V", "input", "", "", "", "getCacheParams", "(Lio/bidmachine/AdResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/bidmachine/internal/a;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class AdResponseCacheParamsAdapter implements InterfaceC6014i {

    @NotNull
    private final InterfaceC6006a cacheParamsAccessor;

    public AdResponseCacheParamsAdapter(@NotNull InterfaceC6006a cacheParamsAccessor) {
        Intrinsics.checkNotNullParameter(cacheParamsAccessor, "cacheParamsAccessor");
        this.cacheParamsAccessor = cacheParamsAccessor;
    }

    @Override // io.bidmachine.internal.InterfaceC6014i
    @Nullable
    public Object getCacheParams(@NotNull AdResponse adResponse, @NotNull Continuation continuation) {
        try {
            InterfaceC6006a interfaceC6006a = this.cacheParamsAccessor;
            AdRequestParameters adRequestParameters = adResponse.getAdRequestParameters();
            Intrinsics.checkNotNullExpressionValue(adRequestParameters, "adRequestParameters");
            List<Pair> a = interfaceC6006a.a(adRequestParameters);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
            for (Pair pair : a) {
                arrayList.add(MapsKt.mapOf(TuplesKt.to("price", pair.first), TuplesKt.to("request_id", pair.second)));
            }
            Map createMapBuilder = MapsKt.createMapBuilder();
            String responseId = adResponse.responseId;
            Intrinsics.checkNotNullExpressionValue(responseId, "responseId");
            createMapBuilder.put("request_id", responseId);
            createMapBuilder.put("is_bid_cached", Boxing.boxBoolean(adResponse.isCached()));
            createMapBuilder.put("price", Boxing.boxDouble(adResponse.getPrice()));
            if (!arrayList.isEmpty()) {
                createMapBuilder.put("cache", arrayList);
            }
            return MapsKt.mapOf(TuplesKt.to("ad_response_cache", MapsKt.build(createMapBuilder)));
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
    }
}
