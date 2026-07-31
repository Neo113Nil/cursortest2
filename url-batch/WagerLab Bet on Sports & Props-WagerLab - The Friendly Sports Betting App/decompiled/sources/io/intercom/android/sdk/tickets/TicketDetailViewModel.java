package io.intercom.android.sdk.tickets;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: TicketDetailViewModel.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0015\u0010$\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "launchedFrom", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", Participant.USER_TYPE, "Lio/intercom/android/sdk/identity/UserIdentity;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "repository", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/tickets/create/data/TicketRepository;Lkotlinx/coroutines/CoroutineDispatcher;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "ticketId", "", "metricSent", "", "_stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/tickets/TicketDetailState;", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "activeAdminsAvatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getActiveAdminsAvatars", "()Ljava/util/List;", "markAsReadIfNecessary", "", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "fetchTicketDetail", "fetchTicketDetail$intercom_sdk_base_release", "fireMetricIfNecessary", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketDetailViewModel extends ViewModel {
    private final MutableStateFlow<TicketDetailState> _stateFlow;
    private final CoroutineDispatcher dispatcher;
    private final IntercomDataLayer intercomDataLayer;
    private final TicketLaunchedFrom launchedFrom;
    private boolean metricSent;
    private final MetricTracker metricTracker;
    private final TicketRepository repository;
    private final StateFlow<TicketDetailState> stateFlow;
    private String ticketId;
    private final UserIdentity user;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ TicketDetailViewModel(TicketLaunchedFrom ticketLaunchedFrom, UserIdentity userIdentity, MetricTracker metricTracker, TicketRepository ticketRepository, CoroutineDispatcher coroutineDispatcher, IntercomDataLayer intercomDataLayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ticketLaunchedFrom, (i & 2) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 4) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i & 8) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    public TicketDetailViewModel(TicketLaunchedFrom launchedFrom, UserIdentity user, MetricTracker metricTracker, TicketRepository repository, CoroutineDispatcher dispatcher, IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.launchedFrom = launchedFrom;
        this.user = user;
        this.metricTracker = metricTracker;
        this.repository = repository;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        MutableStateFlow<TicketDetailState> MutableStateFlow = StateFlowKt.MutableStateFlow(TicketDetailState.Initial.INSTANCE);
        this._stateFlow = MutableStateFlow;
        this.stateFlow = MutableStateFlow;
        if (launchedFrom instanceof TicketLaunchedFrom.Conversation) {
            fireMetricIfNecessary(((TicketLaunchedFrom.Conversation) launchedFrom).getTicket());
            markAsReadIfNecessary(((TicketLaunchedFrom.Conversation) launchedFrom).getTicket());
            Ticket ticket = ((TicketLaunchedFrom.Conversation) launchedFrom).getTicket();
            this.ticketId = ticket.getId();
            MutableStateFlow.setValue(TicketDetailReducerKt.computeTicketViewState(ticket, user, getActiveAdminsAvatars(), launchedFrom));
        } else {
            if (!(launchedFrom instanceof TicketLaunchedFrom.Other)) {
                throw new NoWhenBranchMatchedException();
            }
            fetchTicketDetail$intercom_sdk_base_release(((TicketLaunchedFrom.Other) launchedFrom).getTicketId());
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(null), 3, null);
    }

    public final StateFlow<TicketDetailState> getStateFlow() {
        return this.stateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AvatarWrapper> getActiveAdminsAvatars() {
        List<Participant> builtActiveAdmins = this.intercomDataLayer.getTeamPresence().getValue().getBuiltActiveAdmins();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(builtActiveAdmins, 10));
        for (Participant participant : builtActiveAdmins) {
            Avatar avatar = participant.getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
            Boolean isBot = participant.isBot();
            Intrinsics.checkNotNullExpressionValue(isBot, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar, isBot.booleanValue()));
        }
        return arrayList;
    }

    /* compiled from: TicketDetailViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2", f = "TicketDetailViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TicketDetailViewModel.this.new AnonymousClass2(continuation);
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
                final Flow<ParsedNexusEvent> realTimeEvents = TicketDetailViewModel.this.repository.realTimeEvents();
                final Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TicketDetailViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                        if (obj instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) {
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
                final TicketDetailViewModel ticketDetailViewModel = TicketDetailViewModel.this;
                Flow<ParsedNexusEvent.ConversationNexusEvent.NewComment> flow2 = new Flow<ParsedNexusEvent.ConversationNexusEvent.NewComment>() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ TicketDetailViewModel this$0;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "TicketDetailViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, TicketDetailViewModel ticketDetailViewModel) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = ticketDetailViewModel;
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
                                        ParsedNexusEvent.ConversationNexusEvent.NewComment newComment = (ParsedNexusEvent.ConversationNexusEvent.NewComment) obj;
                                        String ticketId = newComment.getTicketId();
                                        if (ticketId != null && !StringsKt.isBlank(ticketId) && Intrinsics.areEqual(newComment.getTicketId(), this.this$0.ticketId)) {
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
                    public Object collect(FlowCollector<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, ticketDetailViewModel), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final TicketDetailViewModel ticketDetailViewModel2 = TicketDetailViewModel.this;
                this.label = 1;
                if (flow2.collect(new FlowCollector() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, Continuation<? super Unit> continuation) {
                        TicketDetailViewModel ticketDetailViewModel3 = TicketDetailViewModel.this;
                        String str = ticketDetailViewModel3.ticketId;
                        Intrinsics.checkNotNull(str);
                        ticketDetailViewModel3.fetchTicketDetail$intercom_sdk_base_release(str);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void markAsReadIfNecessary(Ticket ticket) {
        if (Intrinsics.areEqual((Object) ticket.isRead(), (Object) false)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new TicketDetailViewModel$markAsReadIfNecessary$1(this, ticket, null), 2, null);
        }
    }

    public final void fetchTicketDetail$intercom_sdk_base_release(String ticketId) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        if (!StringsKt.isBlank(ticketId)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new TicketDetailViewModel$fetchTicketDetail$1(this, ticketId, null), 2, null);
        } else {
            this._stateFlow.setValue(new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, Integer.valueOf(R.string.intercom_error_loading_ticket), 3, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireMetricIfNecessary(Ticket ticket) {
        if (this.metricSent) {
            return;
        }
        MetricTracker metricTracker = this.metricTracker;
        Integer valueOf = Integer.valueOf(ticket.getTicketTypeId());
        String conversationId = ticket.getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        metricTracker.viewedTicketDetails(valueOf, conversationId, ticket.getCurrentStatus().getType(), this.launchedFrom.getFrom());
    }

    /* compiled from: TicketDetailViewModel.kt */
    @Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailViewModel$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/tickets/TicketDetailViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "launchedFrom", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", "factory", "io/intercom/android/sdk/tickets/TicketDetailViewModel$Companion$factory$1", "(Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;)Lio/intercom/android/sdk/tickets/TicketDetailViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TicketDetailViewModel create(ViewModelStoreOwner owner, TicketLaunchedFrom launchedFrom) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
            return (TicketDetailViewModel) new ViewModelProvider(owner, factory(launchedFrom)).get(TicketDetailViewModel.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.tickets.TicketDetailViewModel$Companion$factory$1] */
        private final TicketDetailViewModel$Companion$factory$1 factory(final TicketLaunchedFrom launchedFrom) {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$Companion$factory$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new TicketDetailViewModel(TicketLaunchedFrom.this, null, null, null, null, null, 62, null);
                }
            };
        }
    }
}
