package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FooterNoticeState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.ActiveBot;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.FooterNotice;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ConversationReducer.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/reducers/ConversationReducer;", "", "config", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "timeProvider", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lio/intercom/android/sdk/utilities/commons/TimeProvider;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "computeUiState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "clientState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "computeUiState$intercom_sdk_base_release", "isBotIntroEmpty", "", "toArticlePart", "Lio/intercom/android/sdk/models/Part;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConversationReducer {
    public static final int $stable = 8;
    private final Function0<AppConfig> config;
    private final IntercomDataLayer intercomDataLayer;
    private final TimeProvider timeProvider;
    private final Function0<UserIdentity> userIdentity;

    public ConversationReducer() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationReducer(Function0<AppConfig> config, Function0<? extends UserIdentity> userIdentity, TimeProvider timeProvider, IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.config = config;
        this.userIdentity = userIdentity;
        this.timeProvider = timeProvider;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ ConversationReducer(Function0 function0, Function0 function02, TimeProvider timeProvider, IntercomDataLayer intercomDataLayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AppConfig _init_$lambda$0;
                _init_$lambda$0 = ConversationReducer._init_$lambda$0();
                return _init_$lambda$0;
            }
        } : function0, (i & 2) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UserIdentity _init_$lambda$1;
                _init_$lambda$1 = ConversationReducer._init_$lambda$1();
                return _init_$lambda$1;
            }
        } : function02, (i & 4) != 0 ? TimeProvider.SYSTEM : timeProvider, (i & 8) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserIdentity _init_$lambda$1() {
        return Injector.get().getUserIdentity();
    }

    public final ConversationUiState computeUiState$intercom_sdk_base_release(ConversationClientState clientState) {
        List<Part> emptyList;
        FooterNotice footerNotice;
        ArrayList emptyList2;
        List<Avatar.Builder> avatars;
        ActiveBot activeBot;
        StreamingPart streamingPart;
        List<Part> parts;
        OpenMessengerResponse openMessengerResponse;
        ComposerSuggestions composerSuggestions;
        ContentRow reduceComposerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Conversation conversation = clientState.getConversation();
        String conversationId = clientState.getConversationId();
        NetworkResponse<Object> lastNetworkCall = clientState.getLastNetworkCall();
        boolean z = conversation == null && conversationId != null;
        boolean z2 = conversation == null && conversationId == null;
        boolean z3 = z2 && (clientState.getArticleMetadata() != null) && isBotIntroEmpty(clientState);
        boolean z4 = z2 && clientState.getOpenMessengerResponse() == null;
        TeamPresenceState reduceTeamPresenceState = TeamPresenceReducerKt.reduceTeamPresenceState(clientState.getConversation(), clientState.getOpenMessengerResponse());
        boolean z5 = !clientState.getPendingMessages().isEmpty();
        Conversation conversation2 = clientState.getConversation();
        OpenMessengerResponse openMessengerResponse2 = clientState.getOpenMessengerResponse();
        boolean z6 = true;
        TopAppBarUiState reduceTopAppBarUiState = HeaderReducerKt.reduceTopAppBarUiState(z2, z5, conversation2, (openMessengerResponse2 == null || (newConversationData = openMessengerResponse2.getNewConversationData()) == null) ? null : newConversationData.getHeader(), this.config.invoke(), clientState.getUnreadConversationsCount(), clientState.getUnreadTicketsCount(), clientState.getLaunchMode(), clientState.getPushNotificationsBannerState());
        if (z && lastNetworkCall != null && !(lastNetworkCall instanceof NetworkResponse.Success)) {
            return ErrorReducerKt.reduceError(lastNetworkCall, reduceTopAppBarUiState);
        }
        if (z || z4) {
            return LoadingStateReducerKt.reduceLoadingState(reduceTopAppBarUiState);
        }
        NetworkState networkState = clientState.getNetworkState();
        BottomSheetState bottomSheetState = clientState.getBottomSheetState();
        BottomBarUiState reduceComposerState = ComposerStateReducerKt.reduceComposerState(clientState, this.config.invoke(), z2);
        List createListBuilder = CollectionsKt.createListBuilder();
        if (!StringsKt.isBlank(reduceTeamPresenceState.getTeamIntro())) {
            createListBuilder.add(new ContentRow.TeamIntroRow(reduceTeamPresenceState.getTeamIntro()));
        }
        if (!StringsKt.isBlank(reduceTeamPresenceState.getSpecialNotice())) {
            createListBuilder.add(new ContentRow.SpecialNoticeRow(reduceTeamPresenceState.getSpecialNotice()));
        }
        if (z3 && clientState.getArticleMetadata() != null) {
            createListBuilder.add(new ContentRow.AskedAboutRow(toArticlePart(clientState.getArticleMetadata())));
        }
        if (z2) {
            createListBuilder.addAll(IntroPartsReducerKt.reduceIntroParts(clientState, this.intercomDataLayer.getBotIntro().getValue(), this.timeProvider));
        }
        createListBuilder.addAll(ConversationPartsReducerKt.reduceMessages(clientState, this.userIdentity.invoke(), this.config.invoke()));
        if (z2 && clientState.getPendingMessages().isEmpty() && (openMessengerResponse = clientState.getOpenMessengerResponse()) != null && (composerSuggestions = openMessengerResponse.getComposerSuggestions()) != null && (reduceComposerSuggestions = ComposerSuggestionsReducerKt.reduceComposerSuggestions(composerSuggestions)) != null) {
            createListBuilder.add(reduceComposerSuggestions);
        }
        Conversation conversation3 = clientState.getConversation();
        if (conversation3 == null || (emptyList = conversation3.parts()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        List<Part> list = emptyList;
        Collection<PendingMessage> values = clientState.getPendingMessages().values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingMessage) it.next()).getPart());
        }
        List plus = CollectionsKt.plus((Collection) list, (Iterable) arrayList);
        Conversation conversation4 = clientState.getConversation();
        int size = (conversation4 == null || (parts = conversation4.parts()) == null) ? 0 : parts.size();
        int i = 0;
        for (Object obj : clientState.getPendingMessages().values()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PendingMessage pendingMessage = (PendingMessage) obj;
            createListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(pendingMessage.getPart(), i == clientState.getPendingMessages().size() + (-1), ConversationPartsReducerKt.isAdminOrAltParticipant(pendingMessage.getPart(), this.userIdentity.invoke()), null, null, 24, null), ConversationPartsReducerKt.getGroupingPosition(plus, size + i), pendingMessage.getFailedImageUploadData(), pendingMessage.isFailed(), true));
            i = i2;
        }
        if (conversation != null) {
            List<Part> parts2 = conversation.parts();
            if (!(parts2 instanceof Collection) || !parts2.isEmpty()) {
                for (Part part : parts2) {
                    String uuid = part.getUuid();
                    Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                    if (!StringsKt.isBlank(uuid) && Intrinsics.areEqual(part.getUuid(), clientState.getFinStreamingData().getClientAssignedUUID())) {
                        break;
                    }
                }
            }
            z6 = false;
            if (clientState.getFinStreamingData().isFinStreaming() && !z6 && (activeBot = this.intercomDataLayer.getTeamPresence().getValue().getActiveBot()) != null && (streamingPart = activeBot.getStreamingPart()) != null) {
                createListBuilder.add(new ContentRow.FinStreamingRow(clientState.getFinStreamingData().getBlocks(), streamingPart));
            }
        }
        if (clientState.getCurrentlyTypingState().getUserType() != TypingIndicatorType.NONE) {
            createListBuilder.add(new ContentRow.TypingIndicatorRow(clientState.getCurrentlyTypingState()));
        }
        if (conversation != null && (footerNotice = conversation.getFooterNotice()) != null) {
            String title = footerNotice.getTitle();
            String subtitle = footerNotice.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            AvatarDetails avatarDetails = footerNotice.getAvatarDetails();
            if (avatarDetails == null || (avatars = avatarDetails.getAvatars()) == null) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                List<Avatar.Builder> list2 = avatars;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    Avatar build = ((Avatar.Builder) it2.next()).build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    arrayList2.add(new AvatarWrapper(build, false, 2, null));
                }
                emptyList2 = arrayList2;
            }
            createListBuilder.add(new ContentRow.FooterNoticeRow(new FooterNoticeState(title, subtitle, emptyList2)));
        }
        return new ConversationUiState.Content(reduceTopAppBarUiState, CollectionsKt.build(createListBuilder), reduceComposerState, networkState, bottomSheetState, clientState.getFloatingIndicatorState(), reduceTeamPresenceState, clientState.getVoiceTranscriptionState());
    }

    private final boolean isBotIntroEmpty(ConversationClientState clientState) {
        ComposerSuggestions composerSuggestions;
        OpenMessengerResponse.NewConversationData newConversationData;
        if (!this.intercomDataLayer.getBotIntro().getValue().getBlocks().isEmpty()) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse = clientState.getOpenMessengerResponse();
        List<ComposerSuggestions.Suggestion> list = null;
        List<Part.Builder> parts = (openMessengerResponse == null || (newConversationData = openMessengerResponse.getNewConversationData()) == null) ? null : newConversationData.getParts();
        if (parts != null && !parts.isEmpty()) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse2 = clientState.getOpenMessengerResponse();
        if (openMessengerResponse2 != null && (composerSuggestions = openMessengerResponse2.getComposerSuggestions()) != null) {
            list = composerSuggestions.getSuggestions();
        }
        List<ComposerSuggestions.Suggestion> list2 = list;
        return list2 == null || list2.isEmpty();
    }

    private final Part toArticlePart(ArticleMetadata articleMetadata) {
        Part build = new Part.Builder().withIsInitialMessage(true).withBlocks(CollectionsKt.listOf(new Block.Builder().withArticleId(articleMetadata.getId()).withTitle(articleMetadata.getTitle()))).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
