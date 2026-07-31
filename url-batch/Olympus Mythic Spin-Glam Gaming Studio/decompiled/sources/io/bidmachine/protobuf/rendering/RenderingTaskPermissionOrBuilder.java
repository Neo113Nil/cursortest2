package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.rendering.RenderingTaskPermission;

/* loaded from: classes5.dex */
public interface RenderingTaskPermissionOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    RenderingTaskPermission.PayloadOneofCase getPayloadOneofCase();

    RenderingTaskPermission.Request getRequest();

    RenderingTaskPermission.RequestOrBuilder getRequestOrBuilder();

    RenderingTaskPermission.Response getResponse();

    RenderingTaskPermission.ResponseOrBuilder getResponseOrBuilder();

    boolean hasRequest();

    boolean hasResponse();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
