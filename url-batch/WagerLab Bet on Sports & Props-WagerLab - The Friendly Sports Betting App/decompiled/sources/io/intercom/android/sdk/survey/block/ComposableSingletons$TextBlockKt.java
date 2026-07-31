package io.intercom.android.sdk.survey.block;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextBlock.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$TextBlockKt {
    public static final ComposableSingletons$TextBlockKt INSTANCE = new ComposableSingletons$TextBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f345lambda1 = ComposableLambdaKt.composableLambdaInstance(-222161121, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$TextBlockKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m4976constructorimpl = Updater.m4976constructorimpl(composer);
                Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Block invoke$lambda$0$buildBlock = invoke$lambda$0$buildBlock("left", "Left");
                Intrinsics.checkNotNullExpressionValue(invoke$lambda$0$buildBlock, "invoke$lambda$0$buildBlock(...)");
                BlockRenderTextStyle blockRenderTextStyle = null;
                BlockRenderTextStyle blockRenderTextStyle2 = null;
                TextBlockKt.TextBlock(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new BlockRenderData(invoke$lambda$0$buildBlock, null, null, null, null, 30, null), null, null, false, null, composer, 70, 60);
                Block invoke$lambda$0$buildBlock2 = invoke$lambda$0$buildBlock("center", "Center");
                Intrinsics.checkNotNullExpressionValue(invoke$lambda$0$buildBlock2, "invoke$lambda$0$buildBlock(...)");
                TextBlockKt.TextBlock(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new BlockRenderData(invoke$lambda$0$buildBlock2, null, blockRenderTextStyle, null, blockRenderTextStyle2, 30, null), null, null, false, null, composer, 70, 60);
                Block invoke$lambda$0$buildBlock3 = invoke$lambda$0$buildBlock("right", "Right");
                Intrinsics.checkNotNullExpressionValue(invoke$lambda$0$buildBlock3, "invoke$lambda$0$buildBlock(...)");
                TextBlockKt.TextBlock(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new BlockRenderData(invoke$lambda$0$buildBlock3, null, blockRenderTextStyle, null, blockRenderTextStyle2, 30, null), null, null, false, null, composer, 70, 60);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                return;
            }
            composer.skipToGroupEnd();
        }

        private static final Block invoke$lambda$0$buildBlock(String str, String str2) {
            return new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withAlign(str).withText(str2).build();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f346lambda2 = ComposableLambdaKt.composableLambdaInstance(-895740540, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$TextBlockKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TextBlockKt.INSTANCE.m11725getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11725getLambda1$intercom_sdk_base_release() {
        return f345lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11726getLambda2$intercom_sdk_base_release() {
        return f346lambda2;
    }
}
