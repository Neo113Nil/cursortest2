package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;

/* loaded from: classes3.dex */
public interface ExtrasOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    Struct getInternal();

    StructOrBuilder getInternalOrBuilder();

    Struct getPrivate();

    StructOrBuilder getPrivateOrBuilder();

    Struct getPublic();

    StructOrBuilder getPublicOrBuilder();

    boolean hasInternal();

    boolean hasPrivate();

    boolean hasPublic();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
