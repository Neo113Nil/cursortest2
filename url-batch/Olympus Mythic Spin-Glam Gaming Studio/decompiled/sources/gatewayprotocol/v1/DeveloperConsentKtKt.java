package gatewayprotocol.v1;

import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeveloperConsentKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/DeveloperConsentKt$Dsl;", "", "block", "Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "-initializedeveloperConsent", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "developerConsent", "copy", "(Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/DeveloperConsentOuterClass$DeveloperConsent;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeveloperConsentKtKt {
    @NotNull
    /* renamed from: -initializedeveloperConsent, reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsent m7469initializedeveloperConsent(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.INSTANCE;
        DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        DeveloperConsentKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final DeveloperConsentOuterClass.DeveloperConsent copy(@NotNull DeveloperConsentOuterClass.DeveloperConsent developerConsent, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(developerConsent, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.INSTANCE;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builder = developerConsent.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        DeveloperConsentKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
