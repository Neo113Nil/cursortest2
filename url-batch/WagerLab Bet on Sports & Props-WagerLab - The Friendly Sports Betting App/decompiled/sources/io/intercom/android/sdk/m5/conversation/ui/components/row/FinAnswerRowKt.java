package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinRowStyle;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinAnswerRow.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0015\u001ak\u0010\u0016\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\u0006\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010 ¨\u0006!²\u0006\n\u0010\"\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"FinAnswerRow", "", "conversationPart", "Lio/intercom/android/sdk/models/Part;", "groupingPosition", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "modifier", "Landroidx/compose/ui/Modifier;", "timestamp", "", "onInlineSourcesClick", "Lkotlin/Function1;", "", "Lio/intercom/android/sdk/models/InlineSource;", "showReportAiAnswerButton", "", "onReportAiAnswer", "Lkotlin/Function0;", "(Lio/intercom/android/sdk/models/Part;Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "getFinRowStyle", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/FinRowStyle;", "(Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;Landroidx/compose/runtime/Composer;I)Lio/intercom/android/sdk/m5/conversation/ui/components/row/FinRowStyle;", "FinAnswerMetadata", "avatars", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "title", "suffix", "", "aiAnswerInfo", "Lio/intercom/android/sdk/models/AiAnswerInfo;", "(Ljava/util/List;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Long;Lio/intercom/android/sdk/models/AiAnswerInfo;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FinAnswerRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release", "showDialog"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FinAnswerRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerMetadata$lambda$13(List avatars, String title, Modifier modifier, String str, Long l, AiAnswerInfo aiAnswerInfo, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatars, "$avatars");
        Intrinsics.checkNotNullParameter(title, "$title");
        FinAnswerMetadata(avatars, title, modifier, str, l, aiAnswerInfo, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerRow$lambda$2(Part conversationPart, GroupingPosition groupingPosition, Modifier modifier, String str, Function1 onInlineSourcesClick, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        Intrinsics.checkNotNullParameter(groupingPosition, "$groupingPosition");
        Intrinsics.checkNotNullParameter(onInlineSourcesClick, "$onInlineSourcesClick");
        FinAnswerRow(conversationPart, groupingPosition, modifier, str, onInlineSourcesClick, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerRowPreview$lambda$14(int i, Composer composer, int i2) {
        FinAnswerRowPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FinAnswerRow(final Part conversationPart, final GroupingPosition groupingPosition, Modifier modifier, String str, final Function1<? super List<InlineSource>, Unit> onInlineSourcesClick, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
        Intrinsics.checkNotNullParameter(onInlineSourcesClick, "onInlineSourcesClick");
        Composer startRestartGroup = composer.startRestartGroup(1672821743);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        String str2 = (i2 & 8) != 0 ? null : str;
        final boolean z2 = (i2 & 32) != 0 ? true : z;
        final Function0<Unit> function02 = (i2 & 64) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0;
        int i3 = i >> 3;
        final FinRowStyle finRowStyle = getFinRowStyle(groupingPosition, startRestartGroup, i3 & 14);
        final String str3 = str2;
        ClickableMessageRowKt.ClickableMessageRow(conversationPart, modifier2, str2 != null ? new BottomMetadata(str2, 0.0f, false, 6, null) : null, finRowStyle.getRowAlignment(), finRowStyle.getRowPadding(), null, ComposableLambdaKt.rememberComposableLambda(813335324, true, new Function5<ColumnScope, Part, Function0<? extends Unit>, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt$FinAnswerRow$3
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Part part, Function0<? extends Unit> function03, Composer composer2, Integer num) {
                invoke(columnScope, part, (Function0<Unit>) function03, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope ClickableMessageRow, final Part part, final Function0<Unit> onClick, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(ClickableMessageRow, "$this$ClickableMessageRow");
                Intrinsics.checkNotNullParameter(part, "part");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                Shape shape = FinRowStyle.this.getBubbleStyle().getShape();
                long m11439getColor0d7_KjU = FinRowStyle.this.getBubbleStyle().m11439getColor0d7_KjU();
                BorderStroke borderStroke = FinRowStyle.this.getBubbleStyle().getBorderStroke();
                final FinRowStyle finRowStyle2 = FinRowStyle.this;
                final boolean z3 = z2;
                final Function0<Unit> function03 = function02;
                final Function1<List<InlineSource>, Unit> function1 = onInlineSourcesClick;
                SurfaceKt.m3409SurfaceT9BRK9s(null, shape, m11439getColor0d7_KjU, 0L, 0.0f, 0.0f, borderStroke, ComposableLambdaKt.rememberComposableLambda(1447194679, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt$FinAnswerRow$3.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        Function1<List<InlineSource>, Unit> function12;
                        Composer composer4;
                        Part part2;
                        int i6;
                        if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, FinRowStyle.this.getBubbleStyle().getPadding());
                            Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(16));
                            Part part3 = part;
                            boolean z4 = z3;
                            Function0<Unit> function04 = function03;
                            FinRowStyle finRowStyle3 = FinRowStyle.this;
                            Function0<Unit> function05 = onClick;
                            Function1<List<InlineSource>, Unit> function13 = function1;
                            ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, padding);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer3);
                            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            io.intercom.android.sdk.models.Metadata metadata = part3.getMetadata();
                            composer3.startReplaceGroup(-179725371);
                            if (metadata == null) {
                                part2 = part3;
                                composer4 = composer3;
                                function12 = function13;
                                i6 = 0;
                            } else {
                                List<Avatar> avatars = metadata.getAvatars();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(avatars, 10));
                                Iterator<T> it = avatars.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
                                }
                                String title = metadata.getTitle();
                                String suffix = metadata.getSuffix();
                                Long timestamp = metadata.getTimestamp();
                                AiAnswerInfo aiAnswerInfo = part3.getAiAnswerInfo();
                                function12 = function13;
                                composer4 = composer3;
                                part2 = part3;
                                i6 = 0;
                                FinAnswerRowKt.FinAnswerMetadata(arrayList, title, null, suffix, timestamp, aiAnswerInfo, z4, function04, composer4, 8, 4);
                            }
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(-179706024);
                            List<Block> blocks = part2.getBlocks();
                            Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
                            for (Block block : blocks) {
                                Modifier clip = ClipKt.clip(Modifier.INSTANCE, finRowStyle3.getContentShape());
                                Intrinsics.checkNotNull(block);
                                Function0<Unit> function06 = function05;
                                Function1<List<InlineSource>, Unit> function14 = function12;
                                BlockViewKt.BlockView(clip, new BlockRenderData(block, Color.m5647boximpl(ColorSchemeKt.m2543contentColorForek8zF_U(finRowStyle3.getBubbleStyle().m11439getColor0d7_KjU(), composer4, i6)), null, null, BlockRenderTextStyle.m11701copyZsBm6Y$default(BlockRenderTextStyle.INSTANCE.getParagraphDefault(), 0L, null, 0L, null, Color.m5647boximpl(IntercomTheme.INSTANCE.getColors(composer4, IntercomTheme.$stable).m12148getActionContrastWhite0d7_KjU()), null, 47, null), 12, null), false, null, false, null, null, function06, null, true, function14, null, composer3, 805306432, 0, 2428);
                                composer4 = composer3;
                                function05 = function06;
                                function12 = function14;
                                finRowStyle3 = finRowStyle3;
                                i6 = i6;
                            }
                            composer3.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), composer2, 12582912, 57);
            }
        }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 1572872, 32);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final boolean z3 = z2;
            final Modifier modifier3 = modifier2;
            final Function0<Unit> function03 = function02;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FinAnswerRow$lambda$2;
                    FinAnswerRow$lambda$2 = FinAnswerRowKt.FinAnswerRow$lambda$2(Part.this, groupingPosition, modifier3, str3, onInlineSourcesClick, z3, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FinAnswerRow$lambda$2;
                }
            });
        }
    }

    public static final void FinAnswerMetadata(final List<AvatarWrapper> avatars, final String title, Modifier modifier, String str, Long l, AiAnswerInfo aiAnswerInfo, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        AiAnswerInfo aiAnswerInfo2;
        final boolean z2;
        final Function0<Unit> function02;
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(-93262433);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final String str2 = (i2 & 8) != 0 ? null : str;
        final Long l2 = (i2 & 16) != 0 ? null : l;
        AiAnswerInfo aiAnswerInfo3 = (i2 & 32) != 0 ? null : aiAnswerInfo;
        boolean z3 = (i2 & 64) != 0 ? false : z;
        Function0<Unit> function03 = (i2 & 128) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        final Modifier modifier2 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        MessageMetadataKt.MessageMetadata(avatars, title, RowScopeInstance.INSTANCE.weight(Modifier.INSTANCE, 1.0f, true), str2, l2, startRestartGroup, (i & 112) | 8 | (i & 7168) | (57344 & i), 0);
        startRestartGroup.startReplaceGroup(1671218723);
        if (aiAnswerInfo3 == null) {
            aiAnswerInfo2 = aiAnswerInfo3;
            z2 = z3;
            function02 = function03;
        } else {
            startRestartGroup.startReplaceGroup(1468237645);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1671220792);
            if (FinAnswerMetadata$lambda$12$lambda$11$lambda$5(mutableState)) {
                startRestartGroup.startReplaceGroup(1468242817);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit FinAnswerMetadata$lambda$12$lambda$11$lambda$8$lambda$7;
                            FinAnswerMetadata$lambda$12$lambda$11$lambda$8$lambda$7 = FinAnswerRowKt.FinAnswerMetadata$lambda$12$lambda$11$lambda$8$lambda$7(MutableState.this);
                            return FinAnswerMetadata$lambda$12$lambda$11$lambda$8$lambda$7;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                AiAnswerInfo aiAnswerInfo4 = aiAnswerInfo3;
                boolean z4 = z3;
                Function0<Unit> function04 = function03;
                AnswerInfoDialogKt.AnswerInfoDialog(aiAnswerInfo4, z4, (Function0) rememberedValue2, function04, startRestartGroup, ((i >> 15) & 112) | 384 | ((i >> 12) & 7168), 0);
                aiAnswerInfo2 = aiAnswerInfo4;
                z2 = z4;
                function02 = function04;
            } else {
                aiAnswerInfo2 = aiAnswerInfo3;
                z2 = z3;
                function02 = function03;
            }
            startRestartGroup.endReplaceGroup();
            Modifier m889size3ABfNKs = SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24));
            startRestartGroup.startReplaceGroup(1468251936);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit FinAnswerMetadata$lambda$12$lambda$11$lambda$10$lambda$9;
                        FinAnswerMetadata$lambda$12$lambda$11$lambda$10$lambda$9 = FinAnswerRowKt.FinAnswerMetadata$lambda$12$lambda$11$lambda$10$lambda$9(MutableState.this);
                        return FinAnswerMetadata$lambda$12$lambda$11$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            IconButtonKt.IconButton((Function0) rememberedValue3, m889size3ABfNKs, false, null, null, null, ComposableSingletons$FinAnswerRowKt.INSTANCE.m11407getLambda1$intercom_sdk_base_release(), startRestartGroup, 1572918, 60);
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final AiAnswerInfo aiAnswerInfo5 = aiAnswerInfo2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FinAnswerMetadata$lambda$13;
                    FinAnswerMetadata$lambda$13 = FinAnswerRowKt.FinAnswerMetadata$lambda$13(avatars, title, modifier2, str2, l2, aiAnswerInfo5, z2, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FinAnswerMetadata$lambda$13;
                }
            });
        }
    }

    private static final boolean FinAnswerMetadata$lambda$12$lambda$11$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FinAnswerMetadata$lambda$12$lambda$11$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerMetadata$lambda$12$lambda$11$lambda$8$lambda$7(MutableState showDialog$delegate) {
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        FinAnswerMetadata$lambda$12$lambda$11$lambda$6(showDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAnswerMetadata$lambda$12$lambda$11$lambda$10$lambda$9(MutableState showDialog$delegate) {
        Intrinsics.checkNotNullParameter(showDialog$delegate, "$showDialog$delegate");
        FinAnswerMetadata$lambda$12$lambda$11$lambda$6(showDialog$delegate, true);
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    public static final void FinAnswerRowPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1987882525);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FinAnswerRowKt.INSTANCE.m11408getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FinAnswerRowPreview$lambda$14;
                    FinAnswerRowPreview$lambda$14 = FinAnswerRowKt.FinAnswerRowPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FinAnswerRowPreview$lambda$14;
                }
            });
        }
    }

    public static final FinRowStyle getFinRowStyle(GroupingPosition groupingPosition, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
        composer.startReplaceGroup(1658672574);
        float m8401constructorimpl = Dp.m8401constructorimpl(20);
        float m8401constructorimpl2 = Dp.m8401constructorimpl(4);
        long m12150getAdminBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12150getAdminBackground0d7_KjU();
        float f = 16;
        PaddingValues m831PaddingValuesYgX7TsA = PaddingKt.m831PaddingValuesYgX7TsA(Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(12));
        float f2 = (groupingPosition == GroupingPosition.BOTTOM || groupingPosition == GroupingPosition.MIDDLE) ? m8401constructorimpl2 : m8401constructorimpl;
        if (groupingPosition != GroupingPosition.TOP && groupingPosition != GroupingPosition.MIDDLE) {
            m8401constructorimpl2 = m8401constructorimpl;
        }
        FinRowStyle finRowStyle = new FinRowStyle(new FinRowStyle.BubbleStyle(m12150getAdminBackground0d7_KjU, m831PaddingValuesYgX7TsA, RoundedCornerShapeKt.m1203RoundedCornerShapea9UjIt4(f2, m8401constructorimpl, m8401constructorimpl, m8401constructorimpl2), BorderStrokeKt.m292BorderStrokecXLIe8U(Dp.m8401constructorimpl(1), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12151getAdminBorder0d7_KjU()), null), Alignment.INSTANCE.getStart(), PaddingKt.m834PaddingValuesa9UjIt4$default(Dp.m8401constructorimpl(f), 0.0f, Dp.m8401constructorimpl(f), 0.0f, 10, null), RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(Dp.m8401constructorimpl(8)));
        composer.endReplaceGroup();
        return finRowStyle;
    }
}
