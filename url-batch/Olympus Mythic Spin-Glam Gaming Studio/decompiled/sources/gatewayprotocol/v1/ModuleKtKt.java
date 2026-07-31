package gatewayprotocol.v1;

import gatewayprotocol.v1.ModuleKt;
import gatewayprotocol.v1.ModuleOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModuleKt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/ModuleKt$Dsl;", "", "block", "Lgatewayprotocol/v1/ModuleOuterClass$Module;", "-initializemodule", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/ModuleOuterClass$Module;", "module", "copy", "(Lgatewayprotocol/v1/ModuleOuterClass$Module;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/ModuleOuterClass$Module;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ModuleKtKt {
    @NotNull
    /* renamed from: -initializemodule, reason: not valid java name */
    public static final ModuleOuterClass.Module m7493initializemodule(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ModuleKt.Dsl.Companion companion = ModuleKt.Dsl.INSTANCE;
        ModuleOuterClass.Module.Builder newBuilder = ModuleOuterClass.Module.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        ModuleKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final ModuleOuterClass.Module copy(@NotNull ModuleOuterClass.Module module, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ModuleKt.Dsl.Companion companion = ModuleKt.Dsl.INSTANCE;
        ModuleOuterClass.Module.Builder builder = module.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        ModuleKt.Dsl _create = companion._create(builder);
        block.invoke(_create);
        return _create._build();
    }
}
