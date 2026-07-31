package io.bidmachine.rendering.utils;

import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u00052\u001a\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0004\u0012\u00020\u000f0\u000eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lio/bidmachine/rendering/utils/NetworkRequestBuilder;", "", "createRequestPermissionRequest", "Lio/bidmachine/util/network/NetworkRequest;", "sourceName", "", "eventType", "Lio/bidmachine/rendering/model/EventType;", "eventValue", "eventTaskParamsList", "", "Lio/bidmachine/rendering/model/EventTaskParams;", "url", "callback", "Lkotlin/Function1;", "", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public interface NetworkRequestBuilder {
    @NotNull
    io.bidmachine.util.network.NetworkRequest<?> createRequestPermissionRequest(@NotNull String sourceName, @NotNull EventType eventType, @Nullable String eventValue, @NotNull List<EventTaskParams> eventTaskParamsList, @NotNull String url, @NotNull Function1 callback);
}
