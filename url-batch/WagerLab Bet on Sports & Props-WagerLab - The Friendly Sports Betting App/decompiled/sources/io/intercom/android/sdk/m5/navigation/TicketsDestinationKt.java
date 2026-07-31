package io.intercom.android.sdk.m5.navigation;

import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.compose.NavGraphBuilderKt;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketsDestination.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"ticketsDestination", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "rootActivity", "Landroidx/activity/ComponentActivity;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketsDestinationKt {
    public static final void ticketsDestination(NavGraphBuilder navGraphBuilder, NavHostController navController, ComponentActivity rootActivity) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        NavGraphBuilderKt.composable$default(navGraphBuilder, "TICKETS?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketsDestination$lambda$0;
                ticketsDestination$lambda$0 = TicketsDestinationKt.ticketsDestination$lambda$0((NavArgumentBuilder) obj);
                return ticketsDestination$lambda$0;
            }
        }), NamedNavArgumentKt.navArgument("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ticketsDestination$lambda$1;
                ticketsDestination$lambda$1 = TicketsDestinationKt.ticketsDestination$lambda$1((NavArgumentBuilder) obj);
                return ticketsDestination$lambda$1;
            }
        })}), (List) null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition ticketsDestination$lambda$2;
                ticketsDestination$lambda$2 = TicketsDestinationKt.ticketsDestination$lambda$2((AnimatedContentTransitionScope) obj);
                return ticketsDestination$lambda$2;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition ticketsDestination$lambda$3;
                ticketsDestination$lambda$3 = TicketsDestinationKt.ticketsDestination$lambda$3((AnimatedContentTransitionScope) obj);
                return ticketsDestination$lambda$3;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition ticketsDestination$lambda$4;
                ticketsDestination$lambda$4 = TicketsDestinationKt.ticketsDestination$lambda$4((AnimatedContentTransitionScope) obj);
                return ticketsDestination$lambda$4;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketsDestinationKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition ticketsDestination$lambda$5;
                ticketsDestination$lambda$5 = TicketsDestinationKt.ticketsDestination$lambda$5((AnimatedContentTransitionScope) obj);
                return ticketsDestination$lambda$5;
            }
        }, (Function1) null, ComposableLambdaKt.composableLambdaInstance(655582181, true, new TicketsDestinationKt$ticketsDestination$7(rootActivity, navController)), 132, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketsDestination$lambda$0(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(TransitionStyleKt.getTransitionArgNavType());
        navArgument.setDefaultValue(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ticketsDestination$lambda$1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        navArgument.setDefaultValue(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition ticketsDestination$lambda$2(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition ticketsDestination$lambda$3(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition ticketsDestination$lambda$4(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition ticketsDestination$lambda$5(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }
}
