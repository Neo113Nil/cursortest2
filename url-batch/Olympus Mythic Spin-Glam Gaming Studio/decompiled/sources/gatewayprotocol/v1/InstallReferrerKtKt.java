package gatewayprotocol.v1;

import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InstallReferrerKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/InstallReferrerKt$Dsl;", "", "block", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "-initializeinstallReferrer", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "installReferrer", "copy", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InstallReferrerKtKt {
    @NotNull
    /* renamed from: -initializeinstallReferrer, reason: not valid java name */
    public static final InitializationRequestOuterClass.InstallReferrer m7489initializeinstallReferrer(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        InstallReferrerKt.Dsl.Companion companion = InstallReferrerKt.Dsl.INSTANCE;
        InitializationRequestOuterClass.InstallReferrer.Builder newBuilder = InitializationRequestOuterClass.InstallReferrer.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        InstallReferrerKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final InitializationRequestOuterClass.InstallReferrer copy(@NotNull InitializationRequestOuterClass.InstallReferrer installReferrer, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(installReferrer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        InstallReferrerKt.Dsl.Companion companion = InstallReferrerKt.Dsl.INSTANCE;
        InitializationRequestOuterClass.InstallReferrer.Builder builder = installReferrer.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        InstallReferrerKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
