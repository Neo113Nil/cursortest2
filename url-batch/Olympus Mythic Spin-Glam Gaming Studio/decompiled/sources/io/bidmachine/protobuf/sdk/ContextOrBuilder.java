package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* loaded from: classes15.dex */
public interface ContextOrBuilder extends MessageOrBuilder {
    App getApp();

    AppOrBuilder getAppOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    Device getDevice();

    DeviceOrBuilder getDeviceOrBuilder();

    Regs getRegs();

    RegsOrBuilder getRegsOrBuilder();

    SDK getSdk();

    SDKOrBuilder getSdkOrBuilder();

    Session getSession();

    SessionOrBuilder getSessionOrBuilder();

    User getUser();

    UserOrBuilder getUserOrBuilder();

    boolean hasApp();

    boolean hasDevice();

    boolean hasRegs();

    boolean hasSdk();

    boolean hasSession();

    boolean hasUser();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
