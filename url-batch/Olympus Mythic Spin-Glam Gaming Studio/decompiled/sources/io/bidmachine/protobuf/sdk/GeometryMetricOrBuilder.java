package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* loaded from: classes4.dex */
public interface GeometryMetricOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    double getMinAlpha();

    int getMinHeight();

    int getMinWidth();

    boolean getVisible();

    boolean hasMinAlpha();

    boolean hasMinHeight();

    boolean hasMinWidth();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
