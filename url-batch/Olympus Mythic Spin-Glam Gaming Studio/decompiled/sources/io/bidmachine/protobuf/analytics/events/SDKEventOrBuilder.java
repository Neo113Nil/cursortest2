package io.bidmachine.protobuf.analytics.events;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.StringValueOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.ErrorOrBuilder;

/* loaded from: classes15.dex */
public interface SDKEventOrBuilder extends MessageOrBuilder {
    int getAction();

    StringValue getAdType();

    StringValueOrBuilder getAdTypeOrBuilder();

    boolean getBillable();

    String getContext();

    ByteString getContextBytes();

    Struct getCustomParams();

    StructOrBuilder getCustomParamsOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    Error getError();

    ErrorOrBuilder getErrorOrBuilder();

    Timestamp getFinishTime();

    TimestampOrBuilder getFinishTimeOrBuilder();

    StringValue getNetwork();

    StringValueOrBuilder getNetworkOrBuilder();

    double getPrice();

    Timestamp getStartTime();

    TimestampOrBuilder getStartTimeOrBuilder();

    boolean hasAdType();

    boolean hasBillable();

    boolean hasCustomParams();

    boolean hasError();

    boolean hasFinishTime();

    boolean hasNetwork();

    boolean hasStartTime();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
