package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.internal.C6025u;
import io.bidmachine.internal.L;
import io.bidmachine.internal.M;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import io.bidmachine.utils.ProtoUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/bidmachine/RequestDataRetriever;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/bidmachine/k;", "bidMachineImpl", "Lio/bidmachine/internal/u;", "privacyContext", "Lio/bidmachine/TargetingParams;", "targetingParams", "Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;", "maskedSignalsBuilder", "Lcom/explorestack/protobuf/adcom/ConnectionType;", "connectionType", "Lio/bidmachine/AdsType;", "adsType", "Lcom/explorestack/protobuf/adcom/Context;", "createContext", "(Landroid/content/Context;Lio/bidmachine/k;Lio/bidmachine/internal/u;Lio/bidmachine/TargetingParams;Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;Lcom/explorestack/protobuf/adcom/ConnectionType;Lio/bidmachine/AdsType;)Lcom/explorestack/protobuf/adcom/Context;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class RequestDataRetriever {

    @NotNull
    public static final RequestDataRetriever INSTANCE = new RequestDataRetriever();

    private RequestDataRetriever() {
    }

    @NotNull
    public static final Context createContext(@NotNull android.content.Context context, @NotNull k bidMachineImpl, @NotNull C6025u privacyContext, @NotNull TargetingParams targetingParams, @NotNull MaskedSignals.Builder maskedSignalsBuilder, @Nullable ConnectionType connectionType, @Nullable AdsType adsType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bidMachineImpl, "bidMachineImpl");
        Intrinsics.checkNotNullParameter(privacyContext, "privacyContext");
        Intrinsics.checkNotNullParameter(targetingParams, "targetingParams");
        Intrinsics.checkNotNullParameter(maskedSignalsBuilder, "maskedSignalsBuilder");
        io.bidmachine.internal.w d = privacyContext.d();
        io.bidmachine.internal.v c = privacyContext.c();
        Context.Builder newBuilder = Context.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        Context.App.Builder newBuilder2 = Context.App.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
        Publisher l = bidMachineImpl.l();
        if (l != null) {
            l.build(newBuilder2);
        }
        bidMachineImpl.e().build(context, newBuilder2);
        M.a(newBuilder2, targetingParams);
        App.Builder newBuilder3 = App.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder3, "newBuilder()");
        M.a(newBuilder3, targetingParams);
        bidMachineImpl.h().fill(newBuilder3);
        long h = bidMachineImpl.h(context);
        if (h > 0) {
            newBuilder3.setFirstLaunchTime(ProtoUtils.msToTimestamp(h));
        }
        long c2 = bidMachineImpl.c(context);
        if (c2 > 0) {
            newBuilder3.setSdkInstallTime(ProtoUtils.msToTimestamp(c2));
        }
        newBuilder2.addExtProto(Any.pack(newBuilder3.build()));
        newBuilder.setApp(newBuilder2);
        BlockedParams blockedParams = targetingParams.getBlockedParams();
        if (blockedParams != null) {
            Context.Restrictions.Builder newBuilder4 = Context.Restrictions.newBuilder();
            blockedParams.build(newBuilder4);
            newBuilder.setRestrictions(newBuilder4);
        }
        Context.User.Builder newBuilder5 = Context.User.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder5, "newBuilder()");
        L.a(targetingParams, newBuilder5, maskedSignalsBuilder, d, c);
        bidMachineImpl.o().a(context, newBuilder5, privacyContext.h(), adsType);
        newBuilder.setUser(newBuilder5);
        bidMachineImpl.f().build(context, newBuilder, d, maskedSignalsBuilder, c, connectionType);
        Context.Regs.Builder newBuilder6 = Context.Regs.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder6, "newBuilder()");
        RequestDataRetrieverKt.fill(newBuilder6, privacyContext, maskedSignalsBuilder);
        newBuilder.setRegs(newBuilder6);
        Context build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "contextBuilder.build()");
        return build;
    }
}
