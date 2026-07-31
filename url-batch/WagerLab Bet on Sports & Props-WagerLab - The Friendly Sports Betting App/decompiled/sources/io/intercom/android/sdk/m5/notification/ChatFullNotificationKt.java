package io.intercom.android.sdk.m5.notification;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ChatFullNotification.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\"\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a'\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"addChatFullNotificationToView", "", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "ChatFullNotification", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/models/Conversation;Lio/intercom/android/sdk/identity/AppConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChatFullContent", "context", "Landroid/content/Context;", "(Lio/intercom/android/sdk/models/Conversation;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "previewAppConfig", "ChatFullNotificationPreview", "(Landroidx/compose/runtime/Composer;I)V", "ChatFullNotificationShortMessagePreview", "ChatFullNotificationBotPreview", "ChatFullNotificationTicketPreview", "ChatFullNotificationAssignedTicketPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatFullNotificationKt {
    private static final AppConfig previewAppConfig = new AppConfig("", -12627531, -13615201, -15064194, false, false, false, 100, 1000, 1000, 1000, 1000, true, true, "", "", false, true, "", SetsKt.emptySet(), SetsKt.emptySet(), "", "", false, true, false, false, false, null, new NexusConfig(), AttachmentSettings.INSTANCE.getDEFAULT(), true, ConversationStateSyncSettings.INSTANCE.getDEFAULT(), false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullContent$lambda$5(Conversation conversation, Context context, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        Intrinsics.checkNotNullParameter(context, "$context");
        ChatFullContent(conversation, context, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotification$lambda$4(Conversation conversation, AppConfig appConfig, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        Intrinsics.checkNotNullParameter(appConfig, "$appConfig");
        ChatFullNotification(conversation, appConfig, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationAssignedTicketPreview$lambda$10(int i, Composer composer, int i2) {
        ChatFullNotificationAssignedTicketPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationBotPreview$lambda$8(int i, Composer composer, int i2) {
        ChatFullNotificationBotPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationPreview$lambda$6(int i, Composer composer, int i2) {
        ChatFullNotificationPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationShortMessagePreview$lambda$7(int i, Composer composer, int i2) {
        ChatFullNotificationShortMessagePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatFullNotificationTicketPreview$lambda$9(int i, Composer composer, int i2) {
        ChatFullNotificationTicketPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void addChatFullNotificationToView(ComposeView composeView, final Conversation conversation, final AppConfig appConfig) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1805122629, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$addChatFullNotificationToView$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    final Conversation conversation2 = Conversation.this;
                    final AppConfig appConfig2 = appConfig;
                    IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(583177563, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$addChatFullNotificationToView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                ChatFullNotificationKt.ChatFullNotification(Conversation.this, appConfig2, null, composer2, 72, 4);
                            } else {
                                composer2.skipToGroupEnd();
                            }
                        }
                    }, composer, 54), composer, 3072, 7);
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }

    public static final void ChatFullNotification(final Conversation conversation, final AppConfig appConfig, Modifier modifier, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Composer startRestartGroup = composer.startRestartGroup(1263781866);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context = (Context) consume;
        float f = 8;
        final Modifier modifier3 = modifier2;
        Modifier m877heightInVpY3zN4$default = SizeKt.m877heightInVpY3zN4$default(PaddingKt.m837padding3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(ShadowKt.m5260shadows4CzXII$default(modifier2, Dp.m8401constructorimpl(4), RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(Dp.m8401constructorimpl(f)), false, 0L, 0L, 24, null), RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(Dp.m8401constructorimpl(f))), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), Dp.m8401constructorimpl(16)), 0.0f, Dp.m8401constructorimpl(400), 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m877heightInVpY3zN4$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        float f2 = 12;
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f2));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
            m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
            m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
        }
        Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Avatar avatar = conversation.lastAdmin().getAvatar();
        Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
        Boolean isBot = conversation.lastAdmin().isBot();
        Intrinsics.checkNotNullExpressionValue(isBot, "isBot(...)");
        AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(32)), new AvatarWrapper(avatar, isBot.booleanValue()), null, false, 0L, null, startRestartGroup, 70, 60);
        if (conversation.getTicket() != null) {
            startRestartGroup.startReplaceGroup(2114072472);
            TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation.getTicket().getTitle(), conversation.isRead() ? FontWeight.INSTANCE.getNormal() : FontWeight.INSTANCE.getSemiBold()), startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(2114407458);
            String name = conversation.lastAdmin().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            TextKt.m3581TextNvy7gAk(name, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType05(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), startRestartGroup, 0, 24960, 110590);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2)), startRestartGroup, 6);
        ChatFullContent(conversation, context, startRestartGroup, 72);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChatFullNotification$lambda$4;
                    ChatFullNotification$lambda$4 = ChatFullNotificationKt.ChatFullNotification$lambda$4(Conversation.this, appConfig, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ChatFullNotification$lambda$4;
                }
            });
        }
    }

    private static final void ChatFullContent(final Conversation conversation, final Context context, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(649010099);
        Part lastPart = conversation.lastPart();
        String summary = lastPart.getSummary();
        Intrinsics.checkNotNullExpressionValue(summary, "getSummary(...)");
        if (!StringsKt.isBlank(summary)) {
            startRestartGroup.startReplaceGroup(340941240);
            String summary2 = lastPart.getSummary();
            Intrinsics.checkNotNullExpressionValue(summary2, "getSummary(...)");
            TextKt.m3581TextNvy7gAk(summary2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType05(), startRestartGroup, 48, 0, 131068);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(341123830);
            if (conversation.getTicket() != null) {
                Ticket ticket = conversation.getTicket();
                InAppNotificationCardKt.TicketInAppNotificationContent(Intrinsics.areEqual(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED) ? null : ticket.getAssignee().build().getForename(), ticket.getCurrentStatus().getTitle(), "Just now", startRestartGroup, 384, 0);
            }
            startRestartGroup.endReplaceGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChatFullContent$lambda$5;
                    ChatFullContent$lambda$5 = ChatFullNotificationKt.ChatFullContent$lambda$5(Conversation.this, context, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ChatFullContent$lambda$5;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void ChatFullNotificationPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1120680649);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m11650getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChatFullNotificationPreview$lambda$6;
                    ChatFullNotificationPreview$lambda$6 = ChatFullNotificationKt.ChatFullNotificationPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ChatFullNotificationPreview$lambda$6;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void ChatFullNotificationShortMessagePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(735919252);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m11651getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChatFullNotificationShortMessagePreview$lambda$7;
                    ChatFullNotificationShortMessagePreview$lambda$7 = ChatFullNotificationKt.ChatFullNotificationShortMessagePreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ChatFullNotificationShortMessagePreview$lambda$7;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void ChatFullNotificationBotPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1053171888);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m11652getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChatFullNotificationBotPreview$lambda$8;
                    ChatFullNotificationBotPreview$lambda$8 = ChatFullNotificationKt.ChatFullNotificationBotPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ChatFullNotificationBotPreview$lambda$8;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void ChatFullNotificationTicketPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(202840309);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m11653getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChatFullNotificationTicketPreview$lambda$9;
                    ChatFullNotificationTicketPreview$lambda$9 = ChatFullNotificationKt.ChatFullNotificationTicketPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ChatFullNotificationTicketPreview$lambda$9;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void ChatFullNotificationAssignedTicketPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-671495709);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChatFullNotificationKt.INSTANCE.m11654getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.ChatFullNotificationKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChatFullNotificationAssignedTicketPreview$lambda$10;
                    ChatFullNotificationAssignedTicketPreview$lambda$10 = ChatFullNotificationKt.ChatFullNotificationAssignedTicketPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ChatFullNotificationAssignedTicketPreview$lambda$10;
                }
            });
        }
    }
}
