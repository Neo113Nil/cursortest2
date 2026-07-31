package io.intercom.android.sdk.m5.home.ui;

import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1", f = "HomeScreen.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class HomeScreenKt$HomeScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ Function1<String, Unit> $navigateToExistingConversation;
    final /* synthetic */ Function0<Unit> $navigateToMessages;
    final /* synthetic */ Function0<Unit> $navigateToNewConversation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$1(HomeViewModel homeViewModel, Function0<Unit> function0, Function0<Unit> function02, Function1<? super String, Unit> function1, Continuation<? super HomeScreenKt$HomeScreen$1> continuation) {
        super(2, continuation);
        this.$homeViewModel = homeViewModel;
        this.$navigateToMessages = function0;
        this.$navigateToNewConversation = function02;
        this.$navigateToExistingConversation = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$HomeScreen$1(this.$homeViewModel, this.$navigateToMessages, this.$navigateToNewConversation, this.$navigateToExistingConversation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$HomeScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<HomeUiEffects> effect = this.$homeViewModel.getEffect();
            final Function0<Unit> function0 = this.$navigateToMessages;
            final Function0<Unit> function02 = this.$navigateToNewConversation;
            final Function1<String, Unit> function1 = this.$navigateToExistingConversation;
            this.label = 1;
            if (effect.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((HomeUiEffects) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(HomeUiEffects homeUiEffects, Continuation<? super Unit> continuation) {
                    if (Intrinsics.areEqual(homeUiEffects, HomeUiEffects.NavigateToMessages.INSTANCE)) {
                        function0.invoke();
                    } else if (Intrinsics.areEqual(homeUiEffects, HomeUiEffects.NavigateToNewConversation.INSTANCE)) {
                        function02.invoke();
                    } else {
                        if (!(homeUiEffects instanceof HomeUiEffects.NavigateToConversation)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function1.invoke(((HomeUiEffects.NavigateToConversation) homeUiEffects).getConversationId());
                    }
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
        throw new KotlinNothingValueException();
    }
}
