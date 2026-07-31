package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.TimestampOrBuilder;
import com.explorestack.protobuf.adcom.Context;
import java.util.List;

/* loaded from: classes5.dex */
public interface AppOrBuilder extends MessageOrBuilder {
    String getAppName();

    ByteString getAppNameBytes();

    String getAppVer();

    ByteString getAppVerBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    Timestamp getFirstLaunchTime();

    TimestampOrBuilder getFirstLaunchTimeOrBuilder();

    String getFmwname();

    ByteString getFmwnameBytes();

    Timestamp getInstallBeginServerTimestamp();

    TimestampOrBuilder getInstallBeginServerTimestampOrBuilder();

    Timestamp getInstallReferrerClickServerTimestamp();

    TimestampOrBuilder getInstallReferrerClickServerTimestampOrBuilder();

    Timestamp getInstallReferrerClickTimestamp();

    TimestampOrBuilder getInstallReferrerClickTimestampOrBuilder();

    String getInstallReferrerUrl();

    ByteString getInstallReferrerUrlBytes();

    Timestamp getInstallTime();

    TimestampOrBuilder getInstallTimeOrBuilder();

    String getInstallVersion();

    ByteString getInstallVersionBytes();

    boolean getIsGooglePlayInstant();

    Context.App.Release getRelease();

    Context.App.ReleaseOrBuilder getReleaseOrBuilder();

    Timestamp getSdkInstallTime();

    TimestampOrBuilder getSdkInstallTimeOrBuilder();

    String getStorecat();

    ByteString getStorecatBytes();

    String getStoresubcat(int i);

    ByteString getStoresubcatBytes(int i);

    int getStoresubcatCount();

    List<String> getStoresubcatList();

    boolean hasFirstLaunchTime();

    boolean hasInstallBeginServerTimestamp();

    boolean hasInstallReferrerClickServerTimestamp();

    boolean hasInstallReferrerClickTimestamp();

    boolean hasInstallTime();

    boolean hasRelease();

    boolean hasSdkInstallTime();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
