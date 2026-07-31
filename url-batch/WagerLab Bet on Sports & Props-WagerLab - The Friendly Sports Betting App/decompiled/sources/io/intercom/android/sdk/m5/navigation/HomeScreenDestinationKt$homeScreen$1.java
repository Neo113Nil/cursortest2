package io.intercom.android.sdk.m5.navigation;

import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.PopUpToBuilder;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HomeScreenDestination.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class HomeScreenDestinationKt$homeScreen$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ ComponentActivity $rootActivity;
    final /* synthetic */ CoroutineScope $scope;

    HomeScreenDestinationKt$homeScreen$1(ComponentActivity componentActivity, NavHostController navHostController, CoroutineScope coroutineScope) {
        this.$rootActivity = componentActivity;
        this.$navController = navHostController;
        this.$scope = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) consume;
        ComponentActivity current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            current = this.$rootActivity;
        }
        HomeViewModel create = HomeViewModel.INSTANCE.create(current, lifecycleOwner.getLifecycle());
        final NavHostController navHostController = this.$navController;
        Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$0;
                invoke$lambda$0 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$0(NavHostController.this);
                return invoke$lambda$0;
            }
        };
        final NavHostController navHostController2 = this.$navController;
        Function0 function02 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$1;
                invoke$lambda$1 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$1(NavHostController.this);
                return invoke$lambda$1;
            }
        };
        final NavHostController navHostController3 = this.$navController;
        Function0 function03 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$2;
                invoke$lambda$2 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$2(NavHostController.this);
                return invoke$lambda$2;
            }
        };
        final NavHostController navHostController4 = this.$navController;
        Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$3;
                invoke$lambda$3 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$3(NavHostController.this, (String) obj);
                return invoke$lambda$3;
            }
        };
        final NavHostController navHostController5 = this.$navController;
        Function0 function04 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$6;
                invoke$lambda$6 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$6(NavHostController.this);
                return invoke$lambda$6;
            }
        };
        final NavHostController navHostController6 = this.$navController;
        Function0 function05 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$9;
                invoke$lambda$9 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$9(NavHostController.this);
                return invoke$lambda$9;
            }
        };
        final NavHostController navHostController7 = this.$navController;
        Function1 function12 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$12;
                invoke$lambda$12 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$12(NavHostController.this, (String) obj);
                return invoke$lambda$12;
            }
        };
        final NavHostController navHostController8 = this.$navController;
        Function0 function06 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$13;
                invoke$lambda$13 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$13(NavHostController.this);
                return invoke$lambda$13;
            }
        };
        final NavHostController navHostController9 = this.$navController;
        Function1 function13 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$14;
                invoke$lambda$14 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$14(NavHostController.this, (Conversation) obj);
                return invoke$lambda$14;
            }
        };
        final CoroutineScope coroutineScope = this.$scope;
        final ComponentActivity componentActivity = this.$rootActivity;
        Function0 function07 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$15;
                invoke$lambda$15 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$15(CoroutineScope.this, componentActivity);
                return invoke$lambda$15;
            }
        };
        final NavHostController navHostController10 = this.$navController;
        HomeScreenKt.HomeScreen(create, function0, function02, function03, function1, function04, function05, function12, function06, function13, function07, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$16;
                invoke$lambda$16 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$16(NavHostController.this, (TicketType) obj);
                return invoke$lambda$16;
            }
        }, composer, 8, 0);
        EffectsKt.LaunchedEffect("", new AnonymousClass12(null), composer, 70);
    }

    static /* synthetic */ void invoke$openConversation$default(NavHostController navHostController, String str, NavOptions navOptions, TransitionArgs transitionArgs, int i, Object obj) {
        if ((i & 4) != 0) {
            navOptions = null;
        }
        if ((i & 8) != 0) {
            transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT);
        }
        invoke$openConversation(navHostController, str, navOptions, transitionArgs);
    }

    private static final void invoke$openConversation(NavHostController navHostController, String str, NavOptions navOptions, TransitionArgs transitionArgs) {
        Injector.get().getMetricTracker().viewedConversation("home", str);
        IntercomRouterKt.openConversation$default(navHostController, str, null, false, null, navOptions, transitionArgs, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(NavHostController navController) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Injector.get().getMetricTracker().clickedSpace("messages");
        IntercomRouterKt.openMessages$default(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(NavHostController navController) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Injector.get().getMetricTracker().clickedSpace("help");
        IntercomRouterKt.openHelpCenter$default(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null), false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(NavHostController navController) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        IntercomRouterKt.openTicketList$default(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(NavHostController navController, String ticketId) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        IntercomRouterKt.openTicketDetailScreen$default(navController, ticketId, "home", new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), false, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6(NavHostController navController) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        navController.navigate("MESSAGES", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$6$lambda$5;
                invoke$lambda$6$lambda$5 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$6$lambda$5((NavOptionsBuilder) obj);
                return invoke$lambda$6$lambda$5;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo("HOME", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$6$lambda$5$lambda$4;
                invoke$lambda$6$lambda$5$lambda$4 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$6$lambda$5$lambda$4((PopUpToBuilder) obj);
                return invoke$lambda$6$lambda$5$lambda$4;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9(NavHostController navController) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        IntercomRouterKt.openNewConversation(navController, false, NavOptionsBuilderKt.navOptions(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$9$lambda$8;
                invoke$lambda$9$lambda$8 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$9$lambda$8((NavOptionsBuilder) obj);
                return invoke$lambda$9$lambda$8;
            }
        }), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(NavOptionsBuilder navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.popUpTo("HOME", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$9$lambda$8$lambda$7;
                invoke$lambda$9$lambda$8$lambda$7 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$9$lambda$8$lambda$7((PopUpToBuilder) obj);
                return invoke$lambda$9$lambda$8$lambda$7;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15(CoroutineScope scope, ComponentActivity rootActivity) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new HomeScreenDestinationKt$homeScreen$1$10$1(rootActivity, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13(NavHostController navController) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Injector.get().getMetricTracker().viewedNewConversation("home");
        IntercomRouterKt.openNewConversation$default(navController, false, null, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14(NavHostController navController, Conversation it) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(it, "it");
        invoke$openConversation$default(navController, it.getId(), null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12(NavHostController navController, String conversationId) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        invoke$openConversation(navController, conversationId, NavOptionsBuilderKt.navOptions(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$12$lambda$11;
                invoke$lambda$12$lambda$11 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$12$lambda$11((NavOptionsBuilder) obj);
                return invoke$lambda$12$lambda$11;
            }
        }), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, null, null, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(NavOptionsBuilder navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.popUpTo("HOME", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$12$lambda$11$lambda$10;
                invoke$lambda$12$lambda$11$lambda$10 = HomeScreenDestinationKt$homeScreen$1.invoke$lambda$12$lambda$11$lambda$10((PopUpToBuilder) obj);
                return invoke$lambda$12$lambda$11$lambda$10;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16(NavHostController navController, TicketType it) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(it, "it");
        IntercomRouterKt.openCreateTicketsScreen(navController, it, null, MetricTracker.Context.HOME_SCREEN);
        return Unit.INSTANCE;
    }

    /* compiled from: HomeScreenDestination.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$12", f = "HomeScreenDestination.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$12, reason: invalid class name */
    static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass12(Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass12(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Injector.get().getMetricTracker().viewedSpace("home");
            return Unit.INSTANCE;
        }
    }
}
