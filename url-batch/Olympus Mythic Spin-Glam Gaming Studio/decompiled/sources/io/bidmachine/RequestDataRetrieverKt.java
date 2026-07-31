package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.internal.C6025u;
import io.bidmachine.protobuf.sdk.MaskedSignals;
import io.bidmachine.protobuf.sdk.Regs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/explorestack/protobuf/adcom/Context$Regs$Builder;", "Lio/bidmachine/internal/u;", "privacyContext", "Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;", "maskedSignalsBuilder", "", "fill", "(Lcom/explorestack/protobuf/adcom/Context$Regs$Builder;Lio/bidmachine/internal/u;Lio/bidmachine/protobuf/sdk/MaskedSignals$Builder;)V", "bidmachine-android-sdk_ba_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class RequestDataRetrieverKt {
    public static final void fill(@NotNull Context.Regs.Builder builder, @NotNull C6025u privacyContext, @NotNull MaskedSignals.Builder maskedSignalsBuilder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(privacyContext, "privacyContext");
        Intrinsics.checkNotNullParameter(maskedSignalsBuilder, "maskedSignalsBuilder");
        Regs.Builder regsBuilder = Regs.newBuilder();
        Intrinsics.checkNotNullExpressionValue(regsBuilder, "regsBuilder");
        io.bidmachine.internal.B.a(regsBuilder, maskedSignalsBuilder, privacyContext);
        builder.addExtProto(Any.pack(regsBuilder.build()));
    }
}
