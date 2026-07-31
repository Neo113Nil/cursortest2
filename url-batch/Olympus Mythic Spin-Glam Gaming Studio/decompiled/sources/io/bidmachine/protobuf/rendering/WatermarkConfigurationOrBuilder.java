package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* loaded from: classes9.dex */
public interface WatermarkConfigurationOrBuilder extends MessageOrBuilder {
    WatermarkAlgorithm getAlgorithm();

    int getAlgorithmValue();

    String getBaseColorRgb();

    ByteString getBaseColorRgbBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    WatermarkLocation getLocation();

    int getLocationValue();

    WatermarkPayloadType getPayloadType();

    int getPayloadTypeValue();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
