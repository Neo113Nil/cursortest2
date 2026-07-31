package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: CreateTicketViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$createTicket$1$1", f = "CreateTicketViewModel.kt", i = {}, l = {160, 167}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class CreateTicketViewModel$createTicket$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $compositionAwareScope;
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$createTicket$1$1(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, CoroutineScope coroutineScope, Continuation<? super CreateTicketViewModel$createTicket$1$1> continuation) {
        super(2, continuation);
        this.$content = content;
        this.this$0 = createTicketViewModel;
        this.$compositionAwareScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTicketViewModel$createTicket$1$1(this.$content, this.this$0, this.$compositionAwareScope, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTicketViewModel$createTicket$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e4, code lost:
    
        if (r8.emit(io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.TicketSideEffect.Finish.INSTANCE, r7) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r8 == r0) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TicketRepository ticketRepository;
        String str;
        int i;
        List<TicketAttributeRequest> attributeRequest;
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Iterator<T> it = this.$content.getQuestions().iterator();
            while (it.hasNext()) {
                ((QuestionState) it.next()).validate();
            }
            List<QuestionState> questions = this.$content.getQuestions();
            if (!(questions instanceof Collection) || !questions.isEmpty()) {
                Iterator<T> it2 = questions.iterator();
                while (it2.hasNext()) {
                    if (!(((QuestionState) it2.next()).getValidationError() instanceof ValidationError.NoValidationError)) {
                        for (QuestionState questionState : this.$content.getQuestions()) {
                            if (!(questionState.getValidationError() instanceof ValidationError.NoValidationError)) {
                                CoroutineScope coroutineScope = this.$compositionAwareScope;
                                if (coroutineScope != null) {
                                    questionState.bringIntoView(coroutineScope);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
            }
            final CreateTicketViewModel createTicketViewModel = this.this$0;
            createTicketViewModel.withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$createTicket$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$5;
                    invokeSuspend$lambda$5 = CreateTicketViewModel$createTicket$1$1.invokeSuspend$lambda$5(CreateTicketViewModel.this, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj2);
                    return invokeSuspend$lambda$5;
                }
            });
            ticketRepository = this.this$0.ticketRepository;
            str = this.this$0.conversationId;
            i = this.this$0.ticketTypeId;
            attributeRequest = this.this$0.getAttributeRequest();
            this.label = 1;
            obj = ticketRepository.createTicket(str, i, attributeRequest, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((NetworkResponse) obj) instanceof NetworkResponse.Success) {
            mutableSharedFlow = this.this$0._effect;
            this.label = 2;
        } else {
            final CreateTicketViewModel createTicketViewModel2 = this.this$0;
            createTicketViewModel2.withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$createTicket$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$6;
                    invokeSuspend$lambda$6 = CreateTicketViewModel$createTicket$1$1.invokeSuspend$lambda$6(CreateTicketViewModel.this, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj2);
                    return invokeSuspend$lambda$6;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$5(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, null, null, true, false, 11, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(CreateTicketViewModel createTicketViewModel, CreateTicketViewModel.CreateTicketFormUiState.Content content) {
        createTicketViewModel._uiState.setValue(CreateTicketViewModel.CreateTicketFormUiState.Content.copy$default(content, null, null, false, false, 11, null));
        return Unit.INSTANCE;
    }
}
