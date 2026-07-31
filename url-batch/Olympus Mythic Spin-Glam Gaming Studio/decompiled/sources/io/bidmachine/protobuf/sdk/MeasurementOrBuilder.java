package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* loaded from: classes14.dex */
public interface MeasurementOrBuilder extends MessageOrBuilder {
    int getCount();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    int getFailureTimeoutMs();

    int getIntervalMs();

    boolean hasFailureTimeoutMs();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
