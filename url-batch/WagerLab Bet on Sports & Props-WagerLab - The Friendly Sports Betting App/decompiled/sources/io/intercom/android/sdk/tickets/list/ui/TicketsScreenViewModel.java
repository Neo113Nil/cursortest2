package io.intercom.android.sdk.tickets.list.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import androidx.paging.PagingSource;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.list.data.TicketsPagingSource;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenEffects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: TicketsScreenViewModel.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "pager", "Landroidx/paging/Pager;", "", "Lio/intercom/android/sdk/models/Ticket;", "<init>", "(Lio/intercom/android/sdk/tickets/create/data/TicketRepository;Landroidx/paging/Pager;)V", "pagerFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "getPagerFlow", "()Lkotlinx/coroutines/flow/Flow;", "_effect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenEffects;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketsScreenViewModel extends ViewModel {
    private final MutableSharedFlow<TicketsScreenEffects> _effect;
    private final SharedFlow<TicketsScreenEffects> effect;
    private final Flow<PagingData<TicketRowData>> pagerFlow;
    private final TicketRepository repository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsScreenViewModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TicketsScreenViewModel(final TicketRepository ticketRepository, Pager pager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ticketRepository, (i & 2) != 0 ? new Pager(new PagingConfig(10, 0, false, 0, 0, 0, 58, null), null, new Function0() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PagingSource _init_$lambda$0;
                _init_$lambda$0 = TicketsScreenViewModel._init_$lambda$0(TicketRepository.this);
                return _init_$lambda$0;
            }
        }, 2, null) : pager);
        ticketRepository = (i & 1) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource _init_$lambda$0(TicketRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "$repository");
        return new TicketsPagingSource(repository);
    }

    public TicketsScreenViewModel(TicketRepository repository, Pager<Long, Ticket> pager) {
        SharedFlow<TicketsScreenEffects> shareIn$default;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pager, "pager");
        this.repository = repository;
        final Flow<PagingData<Ticket>> flow = pager.getFlow();
        Flow<PagingData<TicketRowData>> flow2 = new Flow<PagingData<TicketRowData>>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2", f = "TicketsScreenViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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
                    PagingData map;
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
                                map = PagingDataTransforms__PagingDataTransformsKt.map((PagingData) obj, TicketsScreenViewModel$pagerFlow$1$1.INSTANCE);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super PagingData<TicketRowData>> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        TicketsScreenViewModel ticketsScreenViewModel = this;
        this.pagerFlow = CachedPagingDataKt.cachedIn(flow2, ViewModelKt.getViewModelScope(ticketsScreenViewModel));
        MutableSharedFlow<TicketsScreenEffects> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._effect = MutableSharedFlow$default;
        shareIn$default = FlowKt__ShareKt.shareIn$default(MutableSharedFlow$default, ViewModelKt.getViewModelScope(ticketsScreenViewModel), SharingStarted.INSTANCE.getEagerly(), 0, 4, null);
        this.effect = shareIn$default;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(ticketsScreenViewModel), null, null, new AnonymousClass2(null), 3, null);
    }

    public final Flow<PagingData<TicketRowData>> getPagerFlow() {
        return this.pagerFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pagerFlow$lambda$1$reduceTicketRowData(Ticket ticket, Continuation continuation) {
        return TicketRowReducerKt.reduceTicketRowData(ticket);
    }

    public final SharedFlow<TicketsScreenEffects> getEffect() {
        return this.effect;
    }

    /* compiled from: TicketsScreenViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2", f = "TicketsScreenViewModel.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TicketsScreenViewModel.this.new AnonymousClass2(continuation);
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
                final Flow<ParsedNexusEvent> realTimeEvents = TicketsScreenViewModel.this.repository.realTimeEvents();
                final Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TicketsScreenViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                Flow<ParsedNexusEvent.ConversationNexusEvent.NewComment> flow2 = new Flow<ParsedNexusEvent.ConversationNexusEvent.NewComment>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "TicketsScreenViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                        String ticketId = ((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj).getTicketId();
                                        if (!(ticketId == null || ticketId.length() == 0)) {
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
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final TicketsScreenViewModel ticketsScreenViewModel = TicketsScreenViewModel.this;
                this.label = 1;
                if (flow2.collect(new FlowCollector() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, Continuation<? super Unit> continuation) {
                        Object emit = TicketsScreenViewModel.this._effect.emit(TicketsScreenEffects.RefreshTickets.INSTANCE, continuation);
                        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
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

    /* compiled from: TicketsScreenViewModel.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\r\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "factory", "io/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel$Companion$factory$1", "()Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TicketsScreenViewModel create(ViewModelStoreOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return (TicketsScreenViewModel) new ViewModelProvider(owner, factory()).get(TicketsScreenViewModel.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$Companion$factory$1] */
        private final TicketsScreenViewModel$Companion$factory$1 factory() {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$Companion$factory$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new TicketsScreenViewModel(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            };
        }
    }
}
