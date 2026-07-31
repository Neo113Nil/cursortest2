package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.ColorSchemeKt;
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
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageMetadataKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MessageStyle;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.Collection;
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

/* compiled from: BubbleMessageRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class BubbleMessageRowKt$BubbleMessageRow$6 implements Function5<ColumnScope, Part, Function0<? extends Unit>, Composer, Integer, Unit> {
    final /* synthetic */ Part $conversationPart;
    final /* synthetic */ List<String> $failedAttributeIdentifiers;
    final /* synthetic */ PendingMessage.FailedImageUploadData $failedImageUploadData;
    final /* synthetic */ FailedMessage $failedMessage;
    final /* synthetic */ GroupingPosition $groupingPosition;
    final /* synthetic */ boolean $isAdminOrAltParticipant;
    final /* synthetic */ List<String> $loadingAttributeIdentifiers;
    final /* synthetic */ MessageStyle $messageStyle;
    final /* synthetic */ Function1<TicketType, Unit> $onCreateTicket;
    final /* synthetic */ Function1<PendingMessage.FailedImageUploadData, Unit> $onRetryImageClicked;
    final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;

    /* JADX WARN: Multi-variable type inference failed */
    BubbleMessageRowKt$BubbleMessageRow$6(FailedMessage failedMessage, MessageStyle messageStyle, GroupingPosition groupingPosition, Part part, List<String> list, List<String> list2, Function1<? super AttributeData, Unit> function1, Function1<? super TicketType, Unit> function12, boolean z, PendingMessage.FailedImageUploadData failedImageUploadData, Function1<? super PendingMessage.FailedImageUploadData, Unit> function13) {
        this.$failedMessage = failedMessage;
        this.$messageStyle = messageStyle;
        this.$groupingPosition = groupingPosition;
        this.$conversationPart = part;
        this.$failedAttributeIdentifiers = list;
        this.$loadingAttributeIdentifiers = list2;
        this.$onSubmitAttribute = function1;
        this.$onCreateTicket = function12;
        this.$isAdminOrAltParticipant = z;
        this.$failedImageUploadData = failedImageUploadData;
        this.$onRetryImageClicked = function13;
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Part part, Function0<? extends Unit> function0, Composer composer, Integer num) {
        invoke(columnScope, part, (Function0<Unit>) function0, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope ClickableMessageRow, final Part part, final Function0<Unit> onClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(ClickableMessageRow, "$this$ClickableMessageRow");
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(8));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        FailedMessage failedMessage = this.$failedMessage;
        final MessageStyle messageStyle = this.$messageStyle;
        final GroupingPosition groupingPosition = this.$groupingPosition;
        final Part part2 = this.$conversationPart;
        final List<String> list = this.$failedAttributeIdentifiers;
        final List<String> list2 = this.$loadingAttributeIdentifiers;
        final Function1<AttributeData, Unit> function1 = this.$onSubmitAttribute;
        final Function1<TicketType, Unit> function12 = this.$onCreateTicket;
        final boolean z = this.$isAdminOrAltParticipant;
        final PendingMessage.FailedImageUploadData failedImageUploadData = this.$failedImageUploadData;
        final Function1<PendingMessage.FailedImageUploadData, Unit> function13 = this.$onRetryImageClicked;
        ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceGroup(-737205930);
        if (failedMessage != null) {
            BubbleMessageRowKt.FailedMessageIcon(null, composer, 0, 1);
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(-737202638);
        final MessageStyle.BubbleStyle bubbleStyle = messageStyle.getBubbleStyle();
        SurfaceKt.m3409SurfaceT9BRK9s(null, bubbleStyle.getShape(), bubbleStyle.m11445getColor0d7_KjU(), 0L, 0.0f, 0.0f, bubbleStyle.getBorderStroke(), ComposableLambdaKt.rememberComposableLambda(722028815, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$BubbleMessageRow$6$1$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    BubbleMessageRowKt$BubbleMessageRow$6.invoke$lambda$5$Content(groupingPosition, part2, part, list, list2, function1, messageStyle, onClick, function12, z, failedImageUploadData, function13, ColorSchemeKt.m2543contentColorForek8zF_U(MessageStyle.BubbleStyle.this.m11445getColor0d7_KjU(), composer2, 0), PaddingKt.padding(Modifier.INSTANCE, MessageStyle.BubbleStyle.this.getPadding()), composer2, 0, 0);
                } else {
                    composer2.skipToGroupEnd();
                }
            }
        }, composer, 54), composer, 12582912, 57);
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0177, code lost:
    
        if (r19.getParentConversation().getTicket() == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void invoke$lambda$5$Content(GroupingPosition groupingPosition, Part part, Part part2, List<String> list, List<String> list2, Function1<? super AttributeData, Unit> function1, MessageStyle messageStyle, Function0<Unit> function0, Function1<? super TicketType, Unit> function12, boolean z, PendingMessage.FailedImageUploadData failedImageUploadData, Function1<? super PendingMessage.FailedImageUploadData, Unit> function13, long j, Modifier modifier, Composer composer, int i, int i2) {
        io.intercom.android.sdk.models.Metadata metadata;
        composer.startReplaceGroup(1340766378);
        long m12174getPrimaryText0d7_KjU = (i2 & 1) != 0 ? IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU() : j;
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        boolean z2 = false;
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
        composer.startReplaceGroup(301232828);
        if ((groupingPosition == GroupingPosition.STANDALONE || groupingPosition == GroupingPosition.TOP) && (metadata = part.getMetadata()) != null) {
            List<Avatar> avatars = metadata.getAvatars();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(avatars, 10));
            Iterator<T> it = avatars.iterator();
            while (it.hasNext()) {
                arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
            }
            MessageMetadataKt.MessageMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), composer, 8, 4);
        }
        composer.endReplaceGroup();
        List<Block> blocks = part.getBlocks();
        Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
        List<Block> list3 = blocks;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((Block) it2.next()).getType() == BlockType.CREATETICKETCARD) {
                }
            }
        }
        z2 = true;
        BubbleMessageRowKt.m11388MessageContent993knro(part2, list, list2, function1, m12174getPrimaryText0d7_KjU, z2, messageStyle.getContentShape(), function0, function12, z, failedImageUploadData, function13, Dp.m8401constructorimpl(12), composer, ((i << 12) & 57344) | 584, 384, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endReplaceGroup();
    }
}
