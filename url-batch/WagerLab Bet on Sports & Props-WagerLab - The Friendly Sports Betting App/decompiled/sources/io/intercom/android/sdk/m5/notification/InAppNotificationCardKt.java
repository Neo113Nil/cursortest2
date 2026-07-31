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
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.m5.components.TicketStatusHeaderArgs;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.overlay.ComposeCompatibilityUtilKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppNotificationCard.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u0006\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a)\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"addTicketHeaderToCompose", "", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "addInappNotificationCardToView", "InAppNotificationCard", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/models/Conversation;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TicketInAppNotificationContent", "name", "", "ticketStatus", "timestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "InAppNotificationCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "InAppNotificationCardTicketPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InAppNotificationCardKt {

    /* compiled from: InAppNotificationCard.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStyle.values().length];
            try {
                iArr[MessageStyle.TICKET_STATE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageStyle.CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InAppNotificationCard$lambda$5(Conversation conversation, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        InAppNotificationCard(conversation, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InAppNotificationCardPreview$lambda$7(int i, Composer composer, int i2) {
        InAppNotificationCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InAppNotificationCardTicketPreview$lambda$8(int i, Composer composer, int i2) {
        InAppNotificationCardTicketPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketInAppNotificationContent$lambda$6(String str, String ticketStatus, String str2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(ticketStatus, "$ticketStatus");
        TicketInAppNotificationContent(str, ticketStatus, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void addTicketHeaderToCompose(ComposeView composeView, final Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-744078063, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addTicketHeaderToCompose$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    final Conversation conversation2 = Conversation.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-1860903769, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addTicketHeaderToCompose$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                if (Conversation.this.getTicket() != null) {
                                    TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(Conversation.this.getTicket().getTitle(), Conversation.this.isRead() ? FontWeight.INSTANCE.getNormal() : FontWeight.INSTANCE.getSemiBold()), composer2, 0, 1);
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composer, 54), composer, 3072, 7);
                } else {
                    composer.skipToGroupEnd();
                }
            }
        }));
    }

    public static final void addInappNotificationCardToView(ComposeView composeView, final Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        if (composeView == null || ComposeCompatibilityUtilKt.isLegacyActivity(composeView)) {
            return;
        }
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1448950486, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addInappNotificationCardToView$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    final Conversation conversation2 = Conversation.this;
                    IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-395652032, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$addInappNotificationCardToView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                                InAppNotificationCardKt.InAppNotificationCard(Conversation.this, null, composer2, 8, 2);
                            } else {
                                composer2.skipToGroupEnd();
                            }
                        }
                    }, composer, 54), composer, 3072, 7);
                } else {
                    composer.skipToGroupEnd();
                }
            }
        }));
    }

    public static final void InAppNotificationCard(final Conversation conversation, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Composer startRestartGroup = composer.startRestartGroup(-320085669);
        Modifier modifier3 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context = (Context) consume;
        Modifier modifier4 = modifier3;
        float f = 16;
        Modifier m838paddingVpY3zN4 = PaddingKt.m838paddingVpY3zN4(BackgroundKt.m261backgroundbw27NRU(ShadowKt.m5260shadows4CzXII$default(modifier3, Dp.m8401constructorimpl(2), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), false, 0L, 0L, 24, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getBackground(), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m838paddingVpY3zN4);
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
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(8));
        Alignment.Vertical top = Alignment.INSTANCE.getTop();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, top, startRestartGroup, 54);
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
        Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Avatar avatar = conversation.lastAdmin().getAvatar();
        Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
        Boolean isBot = conversation.lastAdmin().isBot();
        Intrinsics.checkNotNullExpressionValue(isBot, "isBot(...)");
        AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(32)), new AvatarWrapper(avatar, isBot.booleanValue()), null, false, 0L, null, startRestartGroup, 70, 60);
        Composer composer2 = startRestartGroup;
        Arrangement.HorizontalOrVertical m696spacedBy0680j_42 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(4));
        ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer2, 6);
        ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor3);
        } else {
            composer2.useNode();
        }
        Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer2);
        Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
            m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
            m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
        }
        Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer2.startReplaceGroup(110719758);
        if (conversation.getTicket() != null) {
            i3 = 1;
            str = null;
            TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation.getTicket().getTitle(), conversation.isRead() ? FontWeight.INSTANCE.getNormal() : FontWeight.INSTANCE.getSemiBold()), composer2, 0, 1);
        } else {
            i3 = 1;
            str = null;
        }
        composer2.endReplaceGroup();
        if (!conversation.parts().isEmpty()) {
            composer2.startReplaceGroup(-862185704);
            Part part = conversation.parts().get(0);
            MessageStyle messageStyle = part.getMessageStyle();
            int i4 = messageStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStyle.ordinal()];
            if (i4 == i3) {
                modifier2 = modifier4;
                composer2.startReplaceGroup(-862033928);
                String forename = Intrinsics.areEqual(part.getEventData().getStatus(), MetricTracker.Action.SUBMITTED) ? str : part.getParticipant().getForename();
                String eventAsPlainText = part.getEventData().getEventAsPlainText();
                String string = context.getString(R.string.intercom_time_just_now);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                TicketInAppNotificationContent(forename, eventAsPlainText, string, composer2, 0, 0);
                composer2.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else if (i4 == 2) {
                composer2.startReplaceGroup(-861473324);
                String summary = part.getSummary();
                Intrinsics.checkNotNullExpressionValue(summary, "getSummary(...)");
                modifier2 = modifier4;
                TextKt.m3581TextNvy7gAk(summary, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 2, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04Point5(), composer2, 0, 24960, 110590);
                composer2 = composer2;
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            } else {
                composer2.startReplaceGroup(-861083964);
                composer2.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
                modifier2 = modifier4;
            }
            composer2.endReplaceGroup();
        } else {
            modifier2 = modifier4;
            if (conversation.getTicket() != null) {
                composer2.startReplaceGroup(-860880263);
                Ticket ticket = conversation.getTicket();
                String forename2 = Intrinsics.areEqual(ticket.getCurrentStatus().getType(), MetricTracker.Action.SUBMITTED) ? str : ticket.getAssignee().build().getForename();
                String title = ticket.getCurrentStatus().getTitle();
                String string2 = context.getString(R.string.intercom_time_just_now);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                TicketInAppNotificationContent(forename2, title, string2, composer2, 0, 0);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-860364609);
                composer2.endReplaceGroup();
            }
        }
        composer2.startReplaceGroup(110794746);
        if (conversation.getTicket() == null) {
            Composer composer3 = composer2;
            TextKt.m3581TextNvy7gAk(Phrase.from(context, R.string.intercom_reply_from_admin).put("name", conversation.lastAdmin().getName()).format().toString(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04Point5(), ColorKt.Color(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer3, 0, 24576, 114686);
            composer2 = composer3;
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InAppNotificationCard$lambda$5;
                    InAppNotificationCard$lambda$5 = InAppNotificationCardKt.InAppNotificationCard$lambda$5(Conversation.this, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return InAppNotificationCard$lambda$5;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TicketInAppNotificationContent(final String str, final String ticketStatus, String str2, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        final String stringResource;
        AnnotatedString annotatedString;
        Composer composer2;
        int i4;
        Intrinsics.checkNotNullParameter(ticketStatus, "ticketStatus");
        Composer startRestartGroup = composer.startRestartGroup(818896879);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(ticketStatus) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                str3 = str2;
                if (startRestartGroup.changed(str3)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                str3 = str2;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            str3 = str2;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else if ((i2 & 4) != 0) {
                stringResource = StringResources_androidKt.stringResource(R.string.intercom_time_just_now, startRestartGroup, 0);
                startRestartGroup.endDefaults();
                if (str == null) {
                    startRestartGroup.startReplaceGroup(856513646);
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    AnnotatedString annotatedString2 = new AnnotatedString(Phrase.from((Context) consume, R.string.intercom_tickets_status_event_moved).put("teammate", str).put("status", ticketStatus).put("timestamp", stringResource).format().toString(), null, 2, null);
                    startRestartGroup.endReplaceGroup();
                    annotatedString = annotatedString2;
                } else {
                    startRestartGroup.startReplaceGroup(856837162);
                    AnnotatedString annotatedString3 = new AnnotatedString(StringResources_androidKt.stringResource(R.string.intercom_tickets_status_description_prefix_when_submitted, startRestartGroup, 0) + ' ' + ticketStatus, null, 2, null);
                    startRestartGroup.endReplaceGroup();
                    annotatedString = annotatedString3;
                }
                composer2 = startRestartGroup;
                TextKt.m3582TextZ58ophY(annotatedString, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 2, 0, null, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType05(), composer2, 0, 24960, 241662);
            }
            stringResource = str3;
            startRestartGroup.endDefaults();
            if (str == null) {
            }
            composer2 = startRestartGroup;
            TextKt.m3582TextZ58ophY(annotatedString, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 2, 0, null, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType05(), composer2, 0, 24960, 241662);
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
            stringResource = str3;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketInAppNotificationContent$lambda$6;
                    TicketInAppNotificationContent$lambda$6 = InAppNotificationCardKt.TicketInAppNotificationContent$lambda$6(str, ticketStatus, stringResource, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketInAppNotificationContent$lambda$6;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void InAppNotificationCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2144100909);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m11655getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InAppNotificationCardPreview$lambda$7;
                    InAppNotificationCardPreview$lambda$7 = InAppNotificationCardKt.InAppNotificationCardPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return InAppNotificationCardPreview$lambda$7;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void InAppNotificationCardTicketPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-186124313);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InAppNotificationCardKt.INSTANCE.m11656getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.notification.InAppNotificationCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InAppNotificationCardTicketPreview$lambda$8;
                    InAppNotificationCardTicketPreview$lambda$8 = InAppNotificationCardKt.InAppNotificationCardTicketPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return InAppNotificationCardTicketPreview$lambda$8;
                }
            });
        }
    }
}
