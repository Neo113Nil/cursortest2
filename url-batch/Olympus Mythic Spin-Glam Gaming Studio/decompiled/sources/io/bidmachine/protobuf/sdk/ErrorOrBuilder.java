package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.sdk.Error;

/* loaded from: classes5.dex */
public interface ErrorOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    Error.Data getError();

    Error.DataOrBuilder getErrorOrBuilder();

    String getName();

    ByteString getNameBytes();

    Error.Data getReason();

    Error.DataOrBuilder getReasonOrBuilder();

    boolean hasError();

    boolean hasReason();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
