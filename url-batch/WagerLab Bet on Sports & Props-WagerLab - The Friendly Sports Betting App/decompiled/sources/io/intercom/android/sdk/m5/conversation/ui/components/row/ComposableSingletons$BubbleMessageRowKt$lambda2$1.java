package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BubbleMessageRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$BubbleMessageRowKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$BubbleMessageRowKt$lambda2$1 INSTANCE = new ComposableSingletons$BubbleMessageRowKt$lambda2$1();

    ComposableSingletons$BubbleMessageRowKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m262backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = 16;
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer, 6);
            Part build = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf((Object[]) new Block.Builder[]{BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock()})).withMetadata(new io.intercom.android.sdk.models.Metadata("Bot", "AI Agent", 1726738186L, CollectionsKt.listOf(new Avatar.Builder().withInitials("BB").withShape(AvatarShape.SQUIRCLE)))).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            BubbleMessageRowKt.BubbleMessageRow(build, GroupingPosition.TOP, true, null, "10:08 AM", null, null, null, null, null, null, null, composer, 25016, 0, 4072);
            float f2 = 4;
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2)), composer, 6);
            Part build2 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            BubbleMessageRowKt.BubbleMessageRow(build2, GroupingPosition.MIDDLE, true, null, "11:08 AM", null, null, null, null, null, null, null, composer, 25016, 0, 4072);
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2)), composer, 6);
            Part build3 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getLongParagraphBlock())).build();
            Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
            BubbleMessageRowKt.BubbleMessageRow(build3, GroupingPosition.BOTTOM, true, null, "11:10 AM", null, null, null, null, null, null, null, composer, 25016, 0, 4072);
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer, 6);
            Part build4 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).withMetadata(new io.intercom.android.sdk.models.Metadata("Bob", null, 1726738186L, CollectionsKt.listOf(new Avatar.Builder().withInitials("SK")), 2, null)).build();
            Intrinsics.checkNotNullExpressionValue(build4, "build(...)");
            BubbleMessageRowKt.BubbleMessageRow(build4, GroupingPosition.STANDALONE, true, null, "11:10 AM", null, null, null, null, null, null, null, composer, 25016, 0, 4072);
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer, 6);
            Part build5 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).build();
            Intrinsics.checkNotNullExpressionValue(build5, "build(...)");
            BubbleMessageRowKt.BubbleMessageRow(build5, GroupingPosition.TOP, false, null, "11:10 AM", null, null, null, null, null, null, null, composer, 25016, 0, 4072);
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2)), composer, 6);
            Part build6 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getLongParagraphBlock())).build();
            Intrinsics.checkNotNullExpressionValue(build6, "build(...)");
            BubbleMessageRowKt.BubbleMessageRow(build6, GroupingPosition.BOTTOM, false, null, "11:08 AM", null, null, null, null, null, null, null, composer, 25016, 0, 4072);
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer, 6);
            Part build7 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getLongParagraphBlock())).build();
            Intrinsics.checkNotNullExpressionValue(build7, "build(...)");
            BubbleMessageRowKt.BubbleMessageRow(build7, GroupingPosition.STANDALONE, false, null, "11:08 AM", null, null, null, null, null, new FailedMessage("Error message", new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BubbleMessageRowKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }), null, composer, 25016, 0, 3048);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            return;
        }
        composer.skipToGroupEnd();
    }
}
