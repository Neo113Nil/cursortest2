package io.intercom.android.sdk.m5.home.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.ConversationHistoryCardKt;
import io.intercom.android.sdk.m5.components.SearchBrowseCardKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SpaceItemType;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt;
import io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt;
import io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt;
import io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt;
import io.intercom.android.sdk.m5.home.ui.components.TicketLinksCardKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.tickets.RecentTicketsCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HomeContentScreen.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a¡\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"HomeContentScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content;", "onMessagesClicked", "Lkotlin/Function0;", "onHelpClicked", "onTicketsClicked", "onTicketItemClicked", "Lkotlin/Function1;", "", "onNewConversationClicked", "onConversationClicked", "Lio/intercom/android/sdk/models/Conversation;", "onTicketLinkClicked", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HomeContentScreenKt {

    /* compiled from: HomeContentScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpaceItemType.values().length];
            try {
                iArr[SpaceItemType.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpaceItemType.HELP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpaceItemType.TICKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$13(Modifier modifier, HomeUiState.Content content, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function0 function04, Function1 function12, Function1 function13, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(content, "$content");
        HomeContentScreen(modifier, content, function0, function02, function03, function1, function04, function12, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$5(Conversation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$6(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void HomeContentScreen(Modifier modifier, final HomeUiState.Content content, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super String, Unit> function1, Function0<Unit> function04, Function1<? super Conversation, Unit> function12, Function1<? super TicketType, Unit> function13, Composer composer, final int i, final int i2) {
        Function1<? super String, Unit> function14;
        Iterator it;
        Composer composer2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1476773966);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final Function0<Unit> function05 = (i2 & 4) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0;
        final Function0<Unit> function06 = (i2 & 8) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02;
        final Function0<Unit> function07 = (i2 & 16) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function03;
        Function1<? super String, Unit> function15 = (i2 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HomeContentScreen$lambda$3;
                HomeContentScreen$lambda$3 = HomeContentScreenKt.HomeContentScreen$lambda$3((String) obj);
                return HomeContentScreen$lambda$3;
            }
        } : function1;
        final Function0<Unit> function08 = (i2 & 64) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function04;
        final Function1<? super Conversation, Unit> function16 = (i2 & 128) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HomeContentScreen$lambda$5;
                HomeContentScreen$lambda$5 = HomeContentScreenKt.HomeContentScreen$lambda$5((Conversation) obj);
                return HomeContentScreen$lambda$5;
            }
        } : function12;
        final Function1<? super TicketType, Unit> function17 = (i2 & 256) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HomeContentScreen$lambda$6;
                HomeContentScreen$lambda$6 = HomeContentScreenKt.HomeContentScreen$lambda$6((TicketType) obj);
                return HomeContentScreen$lambda$6;
            }
        } : function13;
        Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(companion, Dp.m8401constructorimpl(16), 0.0f, 2, null);
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(10));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m839paddingVpY3zN4$default);
        final Modifier modifier2 = companion;
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function1<? super String, Unit> function18 = function15;
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
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1359903615);
        Iterator it2 = content.getCards().iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            HomeCards homeCards = (HomeCards) next;
            boolean z = true;
            if (homeCards instanceof HomeCards.HomeSpacesData) {
                startRestartGroup.startReplaceGroup(1732177237);
                HomeCards.HomeSpacesData homeSpacesData = (HomeCards.HomeSpacesData) homeCards;
                startRestartGroup.startReplaceGroup(55880488);
                boolean z2 = ((((i & 896) ^ 384) > 256 && startRestartGroup.changed(function05)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && startRestartGroup.changed(function06)) || (i & 3072) == 2048);
                if ((((57344 & i) ^ 24576) <= 16384 || !startRestartGroup.changed(function07)) && (i & 24576) != 16384) {
                    z = false;
                }
                boolean z3 = z2 | z;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7;
                            HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7 = HomeContentScreenKt.HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7(Function0.this, function06, function07, (SpaceItemType) obj);
                            return HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                SpacesCardKt.SpacesCard(homeSpacesData, (Function1) rememberedValue, startRestartGroup, 8);
                startRestartGroup.endReplaceGroup();
                function14 = function18;
            } else if (homeCards instanceof HomeCards.HomeRecentTicketsData) {
                startRestartGroup.startReplaceGroup(1732700610);
                HomeCards.HomeRecentTicketsData homeRecentTicketsData = (HomeCards.HomeRecentTicketsData) homeCards;
                if (!homeRecentTicketsData.getTickets().isEmpty()) {
                    RecentTicketsCardKt.RecentTicketsCard(null, homeCards.getCardTitle(), homeRecentTicketsData.getTickets(), function18, startRestartGroup, ((i >> 6) & 7168) | 512, 1);
                }
                function14 = function18;
                startRestartGroup.endReplaceGroup();
            } else {
                function14 = function18;
                if (homeCards instanceof HomeCards.HomeRecentConversationData) {
                    startRestartGroup.startReplaceGroup(1733094620);
                    HomeCards.HomeRecentConversationData homeRecentConversationData = (HomeCards.HomeRecentConversationData) homeCards;
                    if (!homeRecentConversationData.getConversations().isEmpty()) {
                        ConversationHistoryCardKt.ConversationHistoryCard(null, homeCards.getCardTitle(), homeRecentConversationData.getConversations(), function16, startRestartGroup, ((i >> 12) & 7168) | 512, 1);
                    }
                    startRestartGroup.endReplaceGroup();
                } else if (homeCards instanceof HomeCards.HomeNewConversationData) {
                    startRestartGroup.startReplaceGroup(1733520498);
                    NewConversationCardKt.NewConversationCard((HomeCards.HomeNewConversationData) homeCards, content.getAdminsAvatars(), content.getBotAvatar(), function08, startRestartGroup, ((i >> 9) & 7168) | 584, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (homeCards instanceof HomeCards.HomeHelpCenterData) {
                    startRestartGroup.startReplaceGroup(1733905797);
                    startRestartGroup.startReplaceGroup(55935065);
                    boolean changed = startRestartGroup.changed(i3);
                    HomeContentScreenKt$HomeContentScreen$8$1$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new HomeContentScreenKt$HomeContentScreen$8$1$2$1(i3, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect("", (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 70);
                    HomeCards.HomeHelpCenterData homeHelpCenterData = (HomeCards.HomeHelpCenterData) homeCards;
                    boolean isHelpCenterRequireSearchEnabled = Injector.get().getAppConfigProvider().get().isHelpCenterRequireSearchEnabled();
                    List<Participant> builtActiveAdmins = Injector.get().getDataLayer().getTeamPresence().getValue().getBuiltActiveAdmins();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(builtActiveAdmins, 10));
                    for (Participant participant : builtActiveAdmins) {
                        Composer composer3 = startRestartGroup;
                        Avatar avatar = participant.getAvatar();
                        Iterator it3 = it2;
                        Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                        Boolean isBot = participant.isBot();
                        Intrinsics.checkNotNullExpressionValue(isBot, "isBot(...)");
                        arrayList.add(new AvatarWrapper(avatar, isBot.booleanValue()));
                        startRestartGroup = composer3;
                        it2 = it3;
                    }
                    Composer composer4 = startRestartGroup;
                    it = it2;
                    boolean isAccessToTeammateEnabled = Injector.get().getAppConfigProvider().get().isAccessToTeammateEnabled();
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                    SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, isHelpCenterRequireSearchEnabled, arrayList, isAccessToTeammateEnabled, metricTracker, composer4, 33288);
                    composer4.endReplaceGroup();
                    composer2 = composer4;
                    startRestartGroup = composer2;
                    i3 = i4;
                    function18 = function14;
                    it2 = it;
                } else {
                    it = it2;
                    if (homeCards instanceof HomeCards.HomeExternalLinkData) {
                        startRestartGroup.startReplaceGroup(1734773921);
                        ExternalLinkCardKt.ExternalLinkCard((HomeCards.HomeExternalLinkData) homeCards, startRestartGroup, 8);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                        startRestartGroup = composer2;
                        i3 = i4;
                        function18 = function14;
                        it2 = it;
                    } else {
                        if (homeCards instanceof HomeCards.HomeMessengerAppData) {
                            startRestartGroup.startReplaceGroup(1734912770);
                            Composer composer5 = startRestartGroup;
                            composer2 = composer5;
                            LegacyMessengerAppCardKt.LegacyMessengerAppCard(((HomeCards.HomeMessengerAppData) homeCards).getFallbackUrl(), IntercomCardStyle.INSTANCE.m11976defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, composer5, IntercomCardStyle.$stable << 18, 63), true, composer2, (IntercomCardStyle.Style.$stable << 3) | 384);
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = startRestartGroup;
                            if (homeCards instanceof HomeCards.HomeTicketLinksData) {
                                composer2.startReplaceGroup(1735201845);
                                TicketLinksCardKt.TicketLinksCard((HomeCards.HomeTicketLinksData) homeCards, function17, composer2, ((i >> 21) & 112) | 8);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(1735406011);
                                composer2.endReplaceGroup();
                            }
                        }
                        startRestartGroup = composer2;
                        i3 = i4;
                        function18 = function14;
                        it2 = it;
                    }
                }
            }
            composer2 = startRestartGroup;
            it = it2;
            startRestartGroup = composer2;
            i3 = i4;
            function18 = function14;
            it2 = it;
        }
        final Function1<? super String, Unit> function19 = function18;
        Composer composer6 = startRestartGroup;
        composer6.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        composer6.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ScopeUpdateScope endRestartGroup = composer6.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeContentScreen$lambda$13;
                    HomeContentScreen$lambda$13 = HomeContentScreenKt.HomeContentScreen$lambda$13(Modifier.this, content, function05, function06, function07, function19, function08, function16, function17, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeContentScreen$lambda$13;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7(Function0 function0, Function0 function02, Function0 function03, SpaceItemType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
        if (i == 1) {
            function0.invoke();
        } else if (i == 2) {
            function02.invoke();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            function03.invoke();
        }
        return Unit.INSTANCE;
    }
}
