package gatewayprotocol.v1;

import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataKt;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MutableDataKt.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/MutableDataKt$Dsl;", "", "block", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "-initializemutableData", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "mutableData", "copy", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/MutableDataOuterClass$MutableData;", "Lgatewayprotocol/v1/MutableDataOuterClass$MutableDataOrBuilder;", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCountersOrNull", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableDataOrBuilder;)Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "sessionCountersOrNull", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAllowedPiiOrNull", "(Lgatewayprotocol/v1/MutableDataOuterClass$MutableDataOrBuilder;)Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "allowedPiiOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MutableDataKtKt {
    @NotNull
    /* renamed from: -initializemutableData, reason: not valid java name */
    public static final MutableDataOuterClass.MutableData m7496initializemutableData(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.INSTANCE;
        MutableDataOuterClass.MutableData.Builder newBuilder = MutableDataOuterClass.MutableData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        MutableDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final MutableDataOuterClass.MutableData copy(@NotNull MutableDataOuterClass.MutableData mutableData, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(mutableData, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.INSTANCE;
        MutableDataOuterClass.MutableData.Builder builder = mutableData.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        MutableDataKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(@NotNull MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        Intrinsics.checkNotNullParameter(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasSessionCounters()) {
            return mutableDataOrBuilder.getSessionCounters();
        }
        return null;
    }

    @Nullable
    public static final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(@NotNull MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        Intrinsics.checkNotNullParameter(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasAllowedPii()) {
            return mutableDataOrBuilder.getAllowedPii();
        }
        return null;
    }
}
