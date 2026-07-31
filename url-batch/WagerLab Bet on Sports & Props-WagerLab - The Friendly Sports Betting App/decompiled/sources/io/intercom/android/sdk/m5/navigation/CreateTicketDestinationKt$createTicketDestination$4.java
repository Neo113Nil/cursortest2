package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketLaunchedFrom;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: CreateTicketDestination.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class CreateTicketDestinationKt$createTicketDestination$4 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ ComponentActivity $rootActivity;

    CreateTicketDestinationKt$createTicketDestination$4(ComponentActivity componentActivity, NavHostController navHostController) {
        this.$rootActivity = componentActivity;
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope composable, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        String str;
        long m12152getBackground0d7_KjU;
        CoroutineScope coroutineScope;
        CreateTicketViewModel createTicketViewModel;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
        Bundle arguments = navBackStackEntry.getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt(CreateTicketDestinationKt.TICKET_TYPE_ID)) : null;
        Bundle arguments2 = navBackStackEntry.getArguments();
        String string = arguments2 != null ? arguments2.getString(CreateTicketDestinationKt.CONVERSATION_ID) : null;
        Bundle arguments3 = navBackStackEntry.getArguments();
        if (arguments3 == null || (str = arguments3.getString("from")) == null) {
            str = "conversation";
        }
        if (valueOf == null) {
            return;
        }
        CreateTicketViewModel.Companion companion = CreateTicketViewModel.INSTANCE;
        ComponentActivity current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            current = this.$rootActivity;
        }
        CreateTicketViewModel create = companion.create(current, valueOf.intValue(), string, Intrinsics.areEqual(str, "conversation") ? CreateTicketLaunchedFrom.Conversation : CreateTicketLaunchedFrom.Home);
        composer.startReplaceGroup(-693655600);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        SheetState rememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composer, 6, 2);
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, 683737348, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue2);
        }
        final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.LaunchedEffect("", new AnonymousClass1(create, this.$navController, coroutineScope2, mutableState, null), composer, 70);
        AnswerClickData answerClickData = (AnswerClickData) mutableState.getValue();
        composer.startReplaceGroup(-693618191);
        if (answerClickData == null) {
            createTicketViewModel = create;
            coroutineScope = coroutineScope2;
        } else {
            composer.startReplaceGroup(-693614197);
            if (answerClickData.getClickedItem().getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                m12152getBackground0d7_KjU = Color.INSTANCE.m5683getBlack0d7_KjU();
            } else {
                m12152getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU();
            }
            composer.endReplaceGroup();
            coroutineScope = coroutineScope2;
            createTicketViewModel = create;
            ModalBottomSheetKt.m2985ModalBottomSheetYbuCTN8(new Function0() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = CreateTicketDestinationKt$createTicketDestination$4.invoke$lambda$2$lambda$1(CoroutineScope.this, mutableState);
                    return invoke$lambda$2$lambda$1;
                }
            }, null, rememberModalBottomSheetState, 0.0f, false, RectangleShapeKt.getRectangleShape(), m12152getBackground0d7_KjU, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-693932488, true, new CreateTicketDestinationKt$createTicketDestination$4$2$2(answerClickData, create, coroutineScope2, mutableState), composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3078, 7066);
            Unit unit = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        final CreateTicketViewModel createTicketViewModel2 = createTicketViewModel;
        final CoroutineScope coroutineScope3 = coroutineScope;
        CreateTicketContentScreenKt.CreateTicketScreen(invoke$lambda$3(SnapshotStateKt.collectAsState(createTicketViewModel.getUiState(), CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE, null, composer, 56, 2)), new AnonymousClass3(this.$navController, this.$rootActivity), new Function0() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$4;
                invoke$lambda$4 = CreateTicketDestinationKt$createTicketDestination$4.invoke$lambda$4(CreateTicketViewModel.this, coroutineScope3);
                return invoke$lambda$4;
            }
        }, new AnonymousClass5(this.$navController, this.$rootActivity), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$5;
                invoke$lambda$5 = CreateTicketDestinationKt$createTicketDestination$4.invoke$lambda$5(CreateTicketViewModel.this, (String) obj);
                return invoke$lambda$5;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$6;
                invoke$lambda$6 = CreateTicketDestinationKt$createTicketDestination$4.invoke$lambda$6(CreateTicketViewModel.this, (AnswerClickData) obj);
                return invoke$lambda$6;
            }
        }, composer, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$showSheet(CoroutineScope coroutineScope, MutableState<AnswerClickData> mutableState, AnswerClickData answerClickData) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CreateTicketDestinationKt$createTicketDestination$4$showSheet$1(mutableState, answerClickData, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$dismissSheet(CoroutineScope coroutineScope, MutableState<AnswerClickData> mutableState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CreateTicketDestinationKt$createTicketDestination$4$dismissSheet$1(mutableState, null), 3, null);
    }

    /* compiled from: CreateTicketDestination.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1", f = "CreateTicketDestination.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<AnswerClickData> $answerClickedData;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ CreateTicketViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CreateTicketViewModel createTicketViewModel, NavHostController navHostController, CoroutineScope coroutineScope, MutableState<AnswerClickData> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$viewModel = createTicketViewModel;
            this.$navController = navHostController;
            this.$scope = coroutineScope;
            this.$answerClickedData = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$viewModel, this.$navController, this.$scope, this.$answerClickedData, continuation);
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
                SharedFlow<CreateTicketViewModel.TicketSideEffect> effect = this.$viewModel.getEffect();
                final NavHostController navHostController = this.$navController;
                final CoroutineScope coroutineScope = this.$scope;
                final MutableState<AnswerClickData> mutableState = this.$answerClickedData;
                this.label = 1;
                if (effect.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt.createTicketDestination.4.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CreateTicketViewModel.TicketSideEffect) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CreateTicketViewModel.TicketSideEffect ticketSideEffect, Continuation<? super Unit> continuation) {
                        if (Intrinsics.areEqual(ticketSideEffect, CreateTicketViewModel.TicketSideEffect.Finish.INSTANCE)) {
                            NavHostController.this.navigateUp();
                            IntercomRouterKt.openTicketDetailScreen$default(NavHostController.this, true, null, false, 6, null);
                        } else if (ticketSideEffect instanceof CreateTicketViewModel.TicketSideEffect.AnswerClicked) {
                            CreateTicketDestinationKt$createTicketDestination$4.invoke$showSheet(coroutineScope, mutableState, ((CreateTicketViewModel.TicketSideEffect.AnswerClicked) ticketSideEffect).getAnswerClickData());
                        } else {
                            throw new NoWhenBranchMatchedException();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(CoroutineScope scope, MutableState answerClickedData) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(answerClickedData, "$answerClickedData");
        invoke$dismissSheet(scope, answerClickedData);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTicketDestination.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ ComponentActivity $rootActivity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(NavHostController navHostController, ComponentActivity componentActivity) {
            super(0, Intrinsics.Kotlin.class, "navigateUp", "createTicketDestination$navigateUp(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
            this.$navController = navHostController;
            this.$rootActivity = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CreateTicketDestinationKt.createTicketDestination$navigateUp(this.$navController, this.$rootActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(CreateTicketViewModel viewModel, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(scope, "$scope");
        viewModel.createTicket(scope);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTicketDestination.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt$createTicketDestination$4$5, reason: invalid class name */
    /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function0<Unit> {
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ ComponentActivity $rootActivity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(NavHostController navHostController, ComponentActivity componentActivity) {
            super(0, Intrinsics.Kotlin.class, "navigateUp", "createTicketDestination$navigateUp(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
            this.$navController = navHostController;
            this.$rootActivity = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CreateTicketDestinationKt.createTicketDestination$navigateUp(this.$navController, this.$rootActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(CreateTicketViewModel viewModel, String it) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        viewModel.onAnswerUpdated(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6(CreateTicketViewModel viewModel, AnswerClickData it) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(it, "it");
        viewModel.onAnswerClicked(it);
        return Unit.INSTANCE;
    }

    private static final CreateTicketViewModel.CreateTicketFormUiState invoke$lambda$3(State<? extends CreateTicketViewModel.CreateTicketFormUiState> state) {
        return state.getValue();
    }
}
