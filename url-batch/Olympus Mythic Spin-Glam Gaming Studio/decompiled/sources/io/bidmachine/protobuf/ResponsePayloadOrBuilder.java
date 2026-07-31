package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementOrBuilder;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.OpenrtbOrBuilder;
import io.bidmachine.protobuf.ResponsePayload;

/* loaded from: classes5.dex */
public interface ResponsePayloadOrBuilder extends MessageOrBuilder {
    Timestamp getCacheTime();

    TimestampOrBuilder getCacheTimeOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    ResponsePayload.PayloadOneofCase getPayloadOneofCase();

    Placement getRequestItemSpec();

    PlacementOrBuilder getRequestItemSpecOrBuilder();

    Openrtb getResponseCache();

    OpenrtbOrBuilder getResponseCacheOrBuilder();

    String getResponseCacheUrl();

    ByteString getResponseCacheUrlBytes();

    boolean hasCacheTime();

    boolean hasRequestItemSpec();

    boolean hasResponseCache();

    boolean hasResponseCacheUrl();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
