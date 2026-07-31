package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.Waterfall;

/* loaded from: classes15.dex */
public interface WaterfallOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    Waterfall.PayloadCase getPayloadCase();

    Waterfall.Result getRequest();

    Waterfall.ResultOrBuilder getRequestOrBuilder();

    Waterfall.Configuration getResponse();

    Waterfall.ConfigurationOrBuilder getResponseOrBuilder();

    boolean hasRequest();

    boolean hasResponse();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
