package io.intercom.android.sdk.helpcenter.search;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import io.intercom.android.sdk.helpcenter.search.HelpCenterArticleSearchResponse;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ArticleSearchViewModel.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 32\u00020\u0001:\u00013BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0!H\u0007J\u000e\u0010\"\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u001fJ\u0006\u0010%\u001a\u00020\u001fJ\u0019\u0010&\u001a\u00020\u001f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0002\u0010)J\"\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0+H\u0082@¢\u0006\u0002\u0010/J\u000e\u00100\u001a\u000201H\u0082@¢\u0006\u0002\u0010#J\b\u00102\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "isFromSearchBrowse", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "<init>", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;ZLkotlinx/coroutines/CoroutineDispatcher;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "lastSearchedInput", "", "searchInput", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "hasClickedAtLeastOneArticle", "searchForArticles", "", "textChanged", "Lkotlinx/coroutines/flow/Flow;", "updateTeammateHelpRow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addTeammateHelpRow", "sendClickOnSearchResultMetric", "sendFailedSearchMetric", "errorCode", "", "(Ljava/lang/Integer;)V", "transformToUiModel", "", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow;", "searchResponses", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "teammateHelpRow", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchResultRow$TeammateHelpRow;", "shouldAddSendMessageRow", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ArticleSearchViewModel extends ViewModel {
    private final MutableStateFlow<ArticleSearchState> _state;
    private final AppConfig appConfig;
    private final CommonRepository commonRepository;
    private final CoroutineDispatcher dispatcher;
    private boolean hasClickedAtLeastOneArticle;
    private final HelpCenterApi helpCenterApi;
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;
    private String lastSearchedInput;
    private final MetricTracker metricTracker;
    private final MutableSharedFlow<String> searchInput;
    private final StateFlow<ArticleSearchState> state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ArticleSearchViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, boolean z, CoroutineDispatcher coroutineDispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(helpCenterApi, appConfig, metricTracker, (i & 8) != 0 ? false : z, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher, intercomDataLayer, commonRepository);
    }

    public ArticleSearchViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, boolean z, CoroutineDispatcher dispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository) {
        Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.helpCenterApi = helpCenterApi;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = z;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        MutableStateFlow<ArticleSearchState> MutableStateFlow = StateFlowKt.MutableStateFlow(ArticleSearchState.Initial.INSTANCE);
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        this.lastSearchedInput = "";
        this.searchInput = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        ArticleSearchViewModel articleSearchViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(articleSearchViewModel), dispatcher, null, new AnonymousClass1(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(articleSearchViewModel), dispatcher, null, new AnonymousClass2(null), 2, null);
    }

    public final StateFlow<ArticleSearchState> getState() {
        return this.state;
    }

    /* compiled from: ArticleSearchViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1", f = "ArticleSearchViewModel.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ArticleSearchViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow transformLatest = FlowKt.transformLatest(ArticleSearchViewModel.this.searchInput, new ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(null, ArticleSearchViewModel.this));
                final ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
                final Flow<NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>> flow = new Flow<NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ ArticleSearchViewModel this$0;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2", f = "ArticleSearchViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, ArticleSearchViewModel articleSearchViewModel) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = articleSearchViewModel;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        Pair pair = (Pair) obj;
                                        this.this$0.lastSearchedInput = (String) pair.getSecond();
                                        Object first = pair.getFirst();
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(first, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, articleSearchViewModel), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel2 = ArticleSearchViewModel.this;
                Flow<ArticleSearchState> flow2 = new Flow<ArticleSearchState>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ ArticleSearchViewModel this$0;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2", f = "ArticleSearchViewModel.kt", i = {1, 1}, l = {234, 245, 219}, m = "emit", n = {"this", "teamPresenceState"}, s = {"L$0", "L$2"})
                        /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, ArticleSearchViewModel articleSearchViewModel) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = articleSearchViewModel;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:26:0x016f, code lost:
                        
                            if (r1.emit(r4, r2) != r3) goto L56;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x0112  */
                        /* JADX WARN: Removed duplicated region for block: B:23:0x011a  */
                        /* JADX WARN: Removed duplicated region for block: B:28:0x0117  */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            FlowCollector flowCollector;
                            ArticleSearchState articleSearchState;
                            boolean shouldAddSendMessageRow;
                            String str;
                            AppConfig appConfig;
                            boolean z;
                            ArticleViewState.TeamPresenceState computeViewState;
                            CommonRepository commonRepository;
                            FlowCollector flowCollector2;
                            AnonymousClass2<T> anonymousClass2;
                            Object transformToUiModel;
                            FlowCollector flowCollector3;
                            OpenMessengerResponse openMessengerResponse;
                            String str2;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        flowCollector = this.$this_unsafeFlow;
                                        NetworkResponse networkResponse = (NetworkResponse) obj;
                                        if (networkResponse instanceof NetworkResponse.ServerError) {
                                            this.this$0.sendFailedSearchMetric(Boxing.boxInt(((NetworkResponse.ServerError) networkResponse).getCode()));
                                            articleSearchState = ArticleSearchState.Error.INSTANCE;
                                        } else {
                                            if (!(networkResponse instanceof NetworkResponse.ClientError) && !(networkResponse instanceof NetworkResponse.NetworkError)) {
                                                if (!(networkResponse instanceof NetworkResponse.Success)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                List list = (List) ((NetworkResponse.Success) networkResponse).getBody();
                                                if (list.isEmpty()) {
                                                    shouldAddSendMessageRow = this.this$0.shouldAddSendMessageRow();
                                                    if (shouldAddSendMessageRow) {
                                                        ArticleViewState.TeamPresenceState defaultTeamPresenceState = ArticleViewState.TeamPresenceState.INSTANCE.getDefaultTeamPresenceState();
                                                        appConfig = this.this$0.appConfig;
                                                        z = this.this$0.isFromSearchBrowse;
                                                        computeViewState = TeammateHelpKt.computeViewState(null, defaultTeamPresenceState, this.this$0.intercomDataLayer.getTeamPresence().getValue(), appConfig, "search_results", z);
                                                        commonRepository = this.this$0.commonRepository;
                                                        anonymousClass1.L$0 = this;
                                                        anonymousClass1.L$1 = flowCollector;
                                                        anonymousClass1.L$2 = computeViewState;
                                                        anonymousClass1.label = 2;
                                                        Object openMessenger = commonRepository.openMessenger(anonymousClass1);
                                                        if (openMessenger != coroutine_suspended) {
                                                            flowCollector2 = flowCollector;
                                                            obj2 = openMessenger;
                                                            anonymousClass2 = this;
                                                            ArticleViewState.TeamPresenceState teamPresenceState = computeViewState;
                                                            openMessengerResponse = (OpenMessengerResponse) obj2;
                                                            if ((openMessengerResponse == null ? openMessengerResponse.getNewConversationData() : null) != null) {
                                                            }
                                                            str2 = anonymousClass2.this$0.lastSearchedInput;
                                                            articleSearchState = new ArticleSearchState.NoResults(teamPresenceState, str2);
                                                            flowCollector = flowCollector2;
                                                        }
                                                    } else {
                                                        str = this.this$0.lastSearchedInput;
                                                        articleSearchState = new ArticleSearchState.NoResultsNoTeamHelp(str);
                                                    }
                                                } else {
                                                    ArticleSearchViewModel articleSearchViewModel = this.this$0;
                                                    anonymousClass1.L$0 = flowCollector;
                                                    anonymousClass1.label = 1;
                                                    transformToUiModel = articleSearchViewModel.transformToUiModel(list, anonymousClass1);
                                                    if (transformToUiModel != coroutine_suspended) {
                                                        flowCollector3 = flowCollector;
                                                        obj2 = transformToUiModel;
                                                        FlowCollector flowCollector4 = flowCollector3;
                                                        articleSearchState = new ArticleSearchState.Content((List) obj2);
                                                        flowCollector = flowCollector4;
                                                    }
                                                }
                                                return coroutine_suspended;
                                            }
                                            ArticleSearchViewModel.sendFailedSearchMetric$default(this.this$0, null, 1, null);
                                            articleSearchState = ArticleSearchState.Error.INSTANCE;
                                        }
                                    } else if (i == 1) {
                                        flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector42 = flowCollector3;
                                        articleSearchState = new ArticleSearchState.Content((List) obj2);
                                        flowCollector = flowCollector42;
                                    } else {
                                        if (i != 2) {
                                            if (i != 3) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                            return Unit.INSTANCE;
                                        }
                                        computeViewState = (ArticleViewState.TeamPresenceState) anonymousClass1.L$2;
                                        flowCollector2 = (FlowCollector) anonymousClass1.L$1;
                                        anonymousClass2 = (AnonymousClass2) anonymousClass1.L$0;
                                        ResultKt.throwOnFailure(obj2);
                                        ArticleViewState.TeamPresenceState teamPresenceState2 = computeViewState;
                                        openMessengerResponse = (OpenMessengerResponse) obj2;
                                        if ((openMessengerResponse == null ? openMessengerResponse.getNewConversationData() : null) != null) {
                                            teamPresenceState2 = ArticleViewState.TeamPresenceState.copy$default(teamPresenceState2, null, null, null, 0, 0, 0, null, null, false, openMessengerResponse.getNewConversationData().getCta(), 511, null);
                                        }
                                        str2 = anonymousClass2.this$0.lastSearchedInput;
                                        articleSearchState = new ArticleSearchState.NoResults(teamPresenceState2, str2);
                                        flowCollector = flowCollector2;
                                    }
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.label = 3;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.label = 3;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ArticleSearchState> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, articleSearchViewModel2), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel3 = ArticleSearchViewModel.this;
                this.label = 1;
                if (flow2.collect(new FlowCollector() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ArticleSearchState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ArticleSearchState articleSearchState, Continuation<? super Unit> continuation) {
                        ArticleSearchViewModel.this._state.setValue(articleSearchState);
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ArticleSearchViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2", f = "ArticleSearchViewModel.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ArticleSearchViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final SharedFlow<IntercomEvent> event = ArticleSearchViewModel.this.intercomDataLayer.getEvent();
                Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ArticleSearchViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        if (obj instanceof IntercomEvent.NewConversation) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final ArticleSearchViewModel articleSearchViewModel = ArticleSearchViewModel.this;
                this.label = 1;
                if (flow.collect(new FlowCollector() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.2.1
                    public final Object emit(IntercomEvent.NewConversation newConversation, Continuation<? super Unit> continuation) {
                        Object updateTeammateHelpRow = ArticleSearchViewModel.this.updateTeammateHelpRow(continuation);
                        return updateTeammateHelpRow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateTeammateHelpRow : Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((IntercomEvent.NewConversation) obj2, (Continuation<? super Unit>) continuation);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void searchForArticles(Flow<String> textChanged) {
        Intrinsics.checkNotNullParameter(textChanged, "textChanged");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ArticleSearchViewModel$searchForArticles$1(textChanged, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateTeammateHelpRow(Continuation<? super Unit> continuation) {
        ArticleSearchViewModel$updateTeammateHelpRow$1 articleSearchViewModel$updateTeammateHelpRow$1;
        int i;
        ArticleSearchState.Content content;
        MutableStateFlow<ArticleSearchState> mutableStateFlow;
        Collection collection;
        if (continuation instanceof ArticleSearchViewModel$updateTeammateHelpRow$1) {
            articleSearchViewModel$updateTeammateHelpRow$1 = (ArticleSearchViewModel$updateTeammateHelpRow$1) continuation;
            if ((articleSearchViewModel$updateTeammateHelpRow$1.label & Integer.MIN_VALUE) != 0) {
                articleSearchViewModel$updateTeammateHelpRow$1.label -= Integer.MIN_VALUE;
                Object obj = articleSearchViewModel$updateTeammateHelpRow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = articleSearchViewModel$updateTeammateHelpRow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArticleSearchState.NoResultsNoTeamHelp value = this._state.getValue();
                    if (shouldAddSendMessageRow()) {
                        if (value instanceof ArticleSearchState.Content) {
                            content = (ArticleSearchState.Content) value;
                            List<ArticleSearchResultRow> searchResults = content.getSearchResults();
                            if (!(searchResults instanceof Collection) || !searchResults.isEmpty()) {
                                Iterator<T> it = searchResults.iterator();
                                while (it.hasNext()) {
                                    if (((ArticleSearchResultRow) it.next()) instanceof ArticleSearchResultRow.TeammateHelpRow) {
                                        break;
                                    }
                                }
                            }
                            MutableStateFlow<ArticleSearchState> mutableStateFlow2 = this._state;
                            List<ArticleSearchResultRow> searchResults2 = content.getSearchResults();
                            articleSearchViewModel$updateTeammateHelpRow$1.L$0 = mutableStateFlow2;
                            articleSearchViewModel$updateTeammateHelpRow$1.L$1 = content;
                            articleSearchViewModel$updateTeammateHelpRow$1.L$2 = searchResults2;
                            articleSearchViewModel$updateTeammateHelpRow$1.label = 1;
                            Object teammateHelpRow = teammateHelpRow(articleSearchViewModel$updateTeammateHelpRow$1);
                            if (teammateHelpRow == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableStateFlow = mutableStateFlow2;
                            obj = teammateHelpRow;
                            collection = searchResults2;
                        }
                    } else {
                        MutableStateFlow<ArticleSearchState> mutableStateFlow3 = this._state;
                        if (value instanceof ArticleSearchState.Content) {
                            ArticleSearchState.Content content2 = (ArticleSearchState.Content) value;
                            List<ArticleSearchResultRow> searchResults3 = content2.getSearchResults();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : searchResults3) {
                                if (!(((ArticleSearchResultRow) obj2) instanceof ArticleSearchResultRow.TeammateHelpRow)) {
                                    arrayList.add(obj2);
                                }
                            }
                            value = content2.copy(arrayList);
                        } else if (value instanceof ArticleSearchState.NoResults) {
                            value = new ArticleSearchState.NoResultsNoTeamHelp(((ArticleSearchState.NoResults) value).getSearchTerm());
                        }
                        mutableStateFlow3.setValue(value);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collection = (Collection) articleSearchViewModel$updateTeammateHelpRow$1.L$2;
                content = (ArticleSearchState.Content) articleSearchViewModel$updateTeammateHelpRow$1.L$1;
                mutableStateFlow = (MutableStateFlow) articleSearchViewModel$updateTeammateHelpRow$1.L$0;
                ResultKt.throwOnFailure(obj);
                mutableStateFlow.setValue(content.copy(CollectionsKt.plus((Collection<? extends Object>) collection, obj)));
                return Unit.INSTANCE;
            }
        }
        articleSearchViewModel$updateTeammateHelpRow$1 = new ArticleSearchViewModel$updateTeammateHelpRow$1(this, continuation);
        Object obj3 = articleSearchViewModel$updateTeammateHelpRow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = articleSearchViewModel$updateTeammateHelpRow$1.label;
        if (i != 0) {
        }
        mutableStateFlow.setValue(content.copy(CollectionsKt.plus((Collection<? extends Object>) collection, obj3)));
        return Unit.INSTANCE;
    }

    public final void addTeammateHelpRow() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ArticleSearchViewModel$addTeammateHelpRow$1(this, null), 2, null);
    }

    public final void sendClickOnSearchResultMetric() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ArticleSearchViewModel$sendClickOnSearchResultMetric$1(this, null), 2, null);
    }

    static /* synthetic */ void sendFailedSearchMetric$default(ArticleSearchViewModel articleSearchViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        articleSearchViewModel.sendFailedSearchMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedSearchMetric(Integer errorCode) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, "search_results", errorCode != null ? errorCode.toString() : null, this.isFromSearchBrowse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transformToUiModel(List<HelpCenterArticleSearchResponse> list, Continuation<? super List<? extends ArticleSearchResultRow>> continuation) {
        ArticleSearchViewModel$transformToUiModel$1 articleSearchViewModel$transformToUiModel$1;
        int i;
        List list2;
        Collection collection;
        if (continuation instanceof ArticleSearchViewModel$transformToUiModel$1) {
            articleSearchViewModel$transformToUiModel$1 = (ArticleSearchViewModel$transformToUiModel$1) continuation;
            if ((articleSearchViewModel$transformToUiModel$1.label & Integer.MIN_VALUE) != 0) {
                articleSearchViewModel$transformToUiModel$1.label -= Integer.MIN_VALUE;
                Object obj = articleSearchViewModel$transformToUiModel$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = articleSearchViewModel$transformToUiModel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<HelpCenterArticleSearchResponse> list3 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (HelpCenterArticleSearchResponse helpCenterArticleSearchResponse : list3) {
                        HelpCenterArticleSearchResponse.Highlight highlight = helpCenterArticleSearchResponse.getHighlight();
                        String articleId = helpCenterArticleSearchResponse.getArticleId();
                        String title = highlight.getTitle();
                        if (title.length() == 0) {
                            title = helpCenterArticleSearchResponse.getTitle();
                        }
                        arrayList.add(new ArticleSearchResultRow.ArticleResultRow(articleId, title, highlight.getSummary(), highlight.getSummary().length() == 0 ? 8 : 0));
                    }
                    List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                    if (!shouldAddSendMessageRow() || !this.hasClickedAtLeastOneArticle) {
                        return mutableList;
                    }
                    List list4 = mutableList;
                    articleSearchViewModel$transformToUiModel$1.L$0 = mutableList;
                    articleSearchViewModel$transformToUiModel$1.L$1 = list4;
                    articleSearchViewModel$transformToUiModel$1.label = 1;
                    Object teammateHelpRow = teammateHelpRow(articleSearchViewModel$transformToUiModel$1);
                    if (teammateHelpRow == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = mutableList;
                    collection = list4;
                    obj = teammateHelpRow;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) articleSearchViewModel$transformToUiModel$1.L$1;
                    list2 = (List) articleSearchViewModel$transformToUiModel$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                collection.add(obj);
                return list2;
            }
        }
        articleSearchViewModel$transformToUiModel$1 = new ArticleSearchViewModel$transformToUiModel$1(this, continuation);
        Object obj2 = articleSearchViewModel$transformToUiModel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = articleSearchViewModel$transformToUiModel$1.label;
        if (i != 0) {
        }
        collection.add(obj2);
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object teammateHelpRow(Continuation<? super ArticleSearchResultRow.TeammateHelpRow> continuation) {
        ArticleSearchViewModel$teammateHelpRow$1 articleSearchViewModel$teammateHelpRow$1;
        int i;
        ArticleViewState.TeamPresenceState teamPresenceState;
        OpenMessengerResponse openMessengerResponse;
        if (continuation instanceof ArticleSearchViewModel$teammateHelpRow$1) {
            articleSearchViewModel$teammateHelpRow$1 = (ArticleSearchViewModel$teammateHelpRow$1) continuation;
            if ((articleSearchViewModel$teammateHelpRow$1.label & Integer.MIN_VALUE) != 0) {
                articleSearchViewModel$teammateHelpRow$1.label -= Integer.MIN_VALUE;
                Object obj = articleSearchViewModel$teammateHelpRow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = articleSearchViewModel$teammateHelpRow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArticleViewState.TeamPresenceState computeViewState = TeammateHelpKt.computeViewState(null, ArticleViewState.TeamPresenceState.INSTANCE.getDefaultTeamPresenceState(), this.intercomDataLayer.getTeamPresence().getValue(), this.appConfig, "search_results", this.isFromSearchBrowse);
                    CommonRepository commonRepository = this.commonRepository;
                    articleSearchViewModel$teammateHelpRow$1.L$0 = computeViewState;
                    articleSearchViewModel$teammateHelpRow$1.label = 1;
                    Object openMessenger = commonRepository.openMessenger(articleSearchViewModel$teammateHelpRow$1);
                    if (openMessenger == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    teamPresenceState = computeViewState;
                    obj = openMessenger;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    teamPresenceState = (ArticleViewState.TeamPresenceState) articleSearchViewModel$teammateHelpRow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                openMessengerResponse = (OpenMessengerResponse) obj;
                if ((openMessengerResponse == null ? openMessengerResponse.getNewConversationData() : null) != null) {
                    teamPresenceState = ArticleViewState.TeamPresenceState.copy$default(teamPresenceState, null, null, null, 0, 0, 0, null, null, false, openMessengerResponse.getNewConversationData().getCta(), 511, null);
                }
                return new ArticleSearchResultRow.TeammateHelpRow(teamPresenceState);
            }
        }
        articleSearchViewModel$teammateHelpRow$1 = new ArticleSearchViewModel$teammateHelpRow$1(this, continuation);
        Object obj2 = articleSearchViewModel$teammateHelpRow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = articleSearchViewModel$teammateHelpRow$1.label;
        if (i != 0) {
        }
        openMessengerResponse = (OpenMessengerResponse) obj2;
        if ((openMessengerResponse == null ? openMessengerResponse.getNewConversationData() : null) != null) {
        }
        return new ArticleSearchResultRow.TeammateHelpRow(teamPresenceState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig);
    }

    /* compiled from: ArticleSearchViewModel.kt */
    @Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003*\u0001\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "isFromSearchBrowse", "", "factory", "io/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$Companion$factory$1", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Z)Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ArticleSearchViewModel create(ViewModelStoreOwner owner, HelpCenterApi helpCenterApi, boolean isFromSearchBrowse) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
            return (ArticleSearchViewModel) new ViewModelProvider(owner, factory(helpCenterApi, isFromSearchBrowse)).get(ArticleSearchViewModel.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$Companion$factory$1] */
        private final ArticleSearchViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final boolean isFromSearchBrowse) {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$Companion$factory$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    HelpCenterApi helpCenterApi2 = HelpCenterApi.this;
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                    boolean z = isFromSearchBrowse;
                    Intrinsics.checkNotNull(dataLayer);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
                    return new ArticleSearchViewModel(helpCenterApi2, appConfig2, metricTracker, z, null, dataLayer, new CommonRepository(messengerApi, dataLayer), 16, null);
                }
            };
        }
    }
}
