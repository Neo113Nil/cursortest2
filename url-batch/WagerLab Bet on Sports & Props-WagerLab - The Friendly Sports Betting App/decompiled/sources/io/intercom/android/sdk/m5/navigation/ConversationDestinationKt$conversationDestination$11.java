package io.intercom.android.sdk.m5.navigation;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilderKt;
import androidx.navigation.PopUpToBuilder;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: ConversationDestination.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class ConversationDestinationKt$conversationDestination$11 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ ComponentActivity $rootActivity;

    ConversationDestinationKt$conversationDestination$11(ComponentActivity componentActivity, NavHostController navHostController) {
        this.$rootActivity = componentActivity;
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer composer, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        final ConversationViewModel conversationViewModel;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Intent intent = this.$rootActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
        IntercomRootActivityArgs.ConversationScreenArgs conversationScreenArgs = argsForIntent instanceof IntercomRootActivityArgs.ConversationScreenArgs ? (IntercomRootActivityArgs.ConversationScreenArgs) argsForIntent : null;
        Bundle arguments = backStackEntry.getArguments();
        if (arguments != null && arguments.containsKey("conversationId")) {
            Bundle arguments2 = backStackEntry.getArguments();
            String string = arguments2 != null ? arguments2.getString("conversationId") : null;
            Bundle arguments3 = backStackEntry.getArguments();
            str4 = arguments3 != null ? arguments3.getString("initialMessage") : null;
            Bundle arguments4 = backStackEntry.getArguments();
            str = arguments4 != null ? arguments4.getString("articleId") : null;
            Bundle arguments5 = backStackEntry.getArguments();
            str2 = arguments5 != null ? arguments5.getString("articleTitle") : null;
            Bundle arguments6 = backStackEntry.getArguments();
            booleanRef.element = arguments6 != null ? arguments6.getBoolean("isLaunchedProgrammatically") : false;
            str3 = string;
        } else if (conversationScreenArgs != null) {
            String conversationId = conversationScreenArgs.getConversationId();
            str4 = conversationScreenArgs.getEncodedInitialMessage();
            booleanRef.element = conversationScreenArgs.isLaunchedProgrammatically();
            str = conversationScreenArgs.getArticleId();
            str2 = conversationScreenArgs.getArticleTitle();
            str3 = conversationId;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = "";
        }
        ComponentActivity current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            current = this.$rootActivity;
        }
        conversationViewModel = ConversationDestinationKt.getConversationViewModel(current, str3, str4 == null ? "" : str4, booleanRef.element, str != null ? new ArticleMetadata(str, str2) : null, composer, 8, 0);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        final NavHostController navHostController = this.$navController;
        final ComponentActivity componentActivity = this.$rootActivity;
        Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$1;
                invoke$lambda$1 = ConversationDestinationKt$conversationDestination$11.invoke$lambda$1(NavHostController.this, componentActivity);
                return invoke$lambda$1;
            }
        };
        final NavHostController navHostController2 = this.$navController;
        Function0 function02 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$2;
                invoke$lambda$2 = ConversationDestinationKt$conversationDestination$11.invoke$lambda$2(NavHostController.this);
                return invoke$lambda$2;
            }
        };
        final NavHostController navHostController3 = this.$navController;
        Function0 function03 = new Function0() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$3;
                invoke$lambda$3 = ConversationDestinationKt$conversationDestination$11.invoke$lambda$3(NavHostController.this, booleanRef);
                return invoke$lambda$3;
            }
        };
        final NavHostController navHostController4 = this.$navController;
        Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$4;
                invoke$lambda$4 = ConversationDestinationKt$conversationDestination$11.invoke$lambda$4(NavHostController.this, booleanRef, (String) obj);
                return invoke$lambda$4;
            }
        };
        final NavHostController navHostController5 = this.$navController;
        Function1 function12 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$5;
                invoke$lambda$5 = ConversationDestinationKt$conversationDestination$11.invoke$lambda$5(NavHostController.this, conversationViewModel, (TicketType) obj);
                return invoke$lambda$5;
            }
        };
        final NavHostController navHostController6 = this.$navController;
        Function1 function13 = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$6;
                invoke$lambda$6 = ConversationDestinationKt$conversationDestination$11.invoke$lambda$6(NavHostController.this, booleanRef, (HeaderMenuItem) obj);
                return invoke$lambda$6;
            }
        };
        final NavHostController navHostController7 = this.$navController;
        ConversationScreenKt.ConversationScreen(conversationViewModel, fillMaxSize$default, function0, function02, function03, function1, function12, function13, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$9;
                invoke$lambda$9 = ConversationDestinationKt$conversationDestination$11.invoke$lambda$9(NavHostController.this, booleanRef, (String) obj);
                return invoke$lambda$9;
            }
        }, composer, 56, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(NavHostController navController, ComponentActivity rootActivity) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
        if (navController.getPreviousBackStackEntry() == null) {
            rootActivity.getOnBackPressedDispatcher().onBackPressed();
        } else {
            navController.navigateUp();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(NavHostController navController) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Injector.get().getMetricTracker().viewedNewConversation(MetricTracker.Context.FROM_CONVERSATION);
        IntercomRouterKt.openNewConversation$default(navController, false, null, null, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(NavHostController navController, Ref.BooleanRef isLaunchedProgrammatically) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
        IntercomRouterKt.openTicketDetailScreen$default(navController, false, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), isLaunchedProgrammatically.element, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4(NavHostController navController, Ref.BooleanRef isLaunchedProgrammatically, String ticketId) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        IntercomRouterKt.openTicketDetailScreen(navController, ticketId, MetricTracker.Context.HOME_SCREEN, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), isLaunchedProgrammatically.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6(NavHostController navController, Ref.BooleanRef isLaunchedProgrammatically, HeaderMenuItem headerMenuItem) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
        Intrinsics.checkNotNullParameter(headerMenuItem, "headerMenuItem");
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            IntercomRouterKt.openMessages(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), isLaunchedProgrammatically.element);
        } else if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            IntercomRouterKt.openNewConversation$default(navController, isLaunchedProgrammatically.element, null, null, 6, null);
        } else if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            IntercomRouterKt.openTicketList(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_OUT_LEFT, EnterTransitionStyle.SLIDE_IN_RIGHT, ExitTransitionStyle.SLIDE_DOWN), true);
        } else {
            if (!(headerMenuItem instanceof HeaderMenuItem.Help)) {
                throw new NoWhenBranchMatchedException();
            }
            IntercomRouterKt.openHelpCenter(navController, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, null, null, 12, null), true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(NavHostController navController, ConversationViewModel conversationViewModel, TicketType ticketType) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(conversationViewModel, "$conversationViewModel");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        IntercomRouterKt.openCreateTicketsScreen(navController, ticketType, conversationViewModel.getConversationId(), MetricTracker.Context.FROM_CONVERSATION);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9(NavHostController navController, Ref.BooleanRef isLaunchedProgrammatically, String it) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(isLaunchedProgrammatically, "$isLaunchedProgrammatically");
        Intrinsics.checkNotNullParameter(it, "it");
        IntercomRouterKt.openConversation$default(navController, it, null, isLaunchedProgrammatically.element, null, isLaunchedProgrammatically.element ? NavOptionsBuilderKt.navOptions(new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$9$lambda$8;
                invoke$lambda$9$lambda$8 = ConversationDestinationKt$conversationDestination$11.invoke$lambda$9$lambda$8((NavOptionsBuilder) obj);
                return invoke$lambda$9$lambda$8;
            }
        }) : null, null, 42, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(NavOptionsBuilder navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.popUpTo("CONVERSATION", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$conversationDestination$11$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$9$lambda$8$lambda$7;
                invoke$lambda$9$lambda$8$lambda$7 = ConversationDestinationKt$conversationDestination$11.invoke$lambda$9$lambda$8$lambda$7((PopUpToBuilder) obj);
                return invoke$lambda$9$lambda$8$lambda$7;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(true);
        return Unit.INSTANCE;
    }
}
