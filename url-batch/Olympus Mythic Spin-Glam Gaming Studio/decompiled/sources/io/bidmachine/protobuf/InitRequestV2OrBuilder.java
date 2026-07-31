package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.ContextOrBuilder;

/* loaded from: classes12.dex */
public interface InitRequestV2OrBuilder extends MessageOrBuilder {
    Context getContext();

    ContextOrBuilder getContextOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    Struct getExt();

    StructOrBuilder getExtOrBuilder();

    boolean hasContext();

    boolean hasExt();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
