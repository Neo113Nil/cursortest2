package io.intercom.android.sdk.helpcenter.articles;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: ArticleViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$sadReactionTapped$1", f = "ArticleViewModel.kt", i = {0, 0, 0, 0, 0}, l = {198}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "teamPresenceState", "transitionState", "teamHelpVisibility", "shouldScrollToBottom"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2"})
/* loaded from: classes8.dex */
final class ArticleViewModel$sadReactionTapped$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ArticleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleViewModel$sadReactionTapped$1(ArticleViewModel articleViewModel, Continuation<? super ArticleViewModel$sadReactionTapped$1> continuation) {
        super(2, continuation);
        this.this$0 = articleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArticleViewModel$sadReactionTapped$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ArticleViewModel$sadReactionTapped$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MetricTracker metricTracker;
        AppConfig appConfig;
        boolean z;
        String str;
        String str2;
        boolean shouldAddSendMessageRow;
        AppConfig appConfig2;
        boolean z2;
        CommonRepository commonRepository;
        Object openMessenger;
        int i;
        ArticleViewState.Content content;
        ArticleViewState.TeamPresenceState teamPresenceState;
        int i2;
        int i3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._state;
            ArticleViewState articleViewState = (ArticleViewState) mutableStateFlow.getValue();
            if (articleViewState instanceof ArticleViewState.Content) {
                mutableStateFlow2 = this.this$0._state;
                ArticleViewModel articleViewModel = this.this$0;
                ArticleViewState.Content content2 = (ArticleViewState.Content) articleViewState;
                metricTracker = articleViewModel.metricTracker;
                appConfig = articleViewModel.appConfig;
                Boolean boxBoolean = Boxing.boxBoolean(appConfig.isInboundMessages());
                z = articleViewModel.isFromSearchBrowse;
                metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_SAD, boxBoolean, z);
                str = articleViewModel.articleId;
                str2 = articleViewModel.articleContentId;
                articleViewModel.sendReactionToServer(str, str2, 2);
                int i5 = R.id.sad_end;
                shouldAddSendMessageRow = articleViewModel.shouldAddSendMessageRow();
                int i6 = shouldAddSendMessageRow ? 0 : 8;
                ArticleMetadata articleMetadata = content2.getArticleMetadata();
                ArticleViewState.TeamPresenceState teamPresenceState2 = content2.getTeamPresenceState();
                appConfig2 = articleViewModel.appConfig;
                z2 = articleViewModel.isFromSearchBrowse;
                ArticleViewState.TeamPresenceState computeViewState = TeammateHelpKt.computeViewState(articleMetadata, teamPresenceState2, articleViewModel.intercomDataLayer.getTeamPresence().getValue(), appConfig2, "article", z2);
                commonRepository = articleViewModel.commonRepository;
                this.L$0 = content2;
                this.L$1 = computeViewState;
                this.L$2 = mutableStateFlow2;
                this.I$0 = i5;
                this.I$1 = i6;
                this.I$2 = shouldAddSendMessageRow ? 1 : 0;
                this.label = 1;
                openMessenger = commonRepository.openMessenger(this);
                if (openMessenger == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = shouldAddSendMessageRow ? 1 : 0;
                content = content2;
                teamPresenceState = computeViewState;
                i2 = i5;
                i3 = i6;
            } else {
                if (!Intrinsics.areEqual(articleViewState, ArticleViewState.Initial.INSTANCE) && !(articleViewState instanceof ArticleViewState.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$2;
            int i7 = this.I$1;
            int i8 = this.I$0;
            mutableStateFlow2 = (MutableStateFlow) this.L$2;
            ArticleViewState.TeamPresenceState teamPresenceState3 = (ArticleViewState.TeamPresenceState) this.L$1;
            ArticleViewState.Content content3 = (ArticleViewState.Content) this.L$0;
            ResultKt.throwOnFailure(obj);
            i3 = i7;
            teamPresenceState = teamPresenceState3;
            content = content3;
            i2 = i8;
            openMessenger = obj;
        }
        MutableStateFlow mutableStateFlow3 = mutableStateFlow2;
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) openMessenger;
        if ((openMessengerResponse != null ? openMessengerResponse.getNewConversationData() : null) != null) {
            teamPresenceState = ArticleViewState.TeamPresenceState.copy$default(teamPresenceState, null, null, null, 0, 0, 0, null, null, false, openMessengerResponse.getNewConversationData().getCta(), 511, null);
        }
        mutableStateFlow3.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, i2, ArticleViewState.Reaction.Sad, i3, i != 0, 1, null), teamPresenceState, 7, null));
        return Unit.INSTANCE;
    }
}
