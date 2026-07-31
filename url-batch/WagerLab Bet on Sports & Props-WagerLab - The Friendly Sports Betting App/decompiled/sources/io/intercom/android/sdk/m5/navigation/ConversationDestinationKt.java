package io.intercom.android.sdk.m5.navigation;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.compose.NavGraphBuilderKt;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationDestination.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a=\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"conversationDestination", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "rootActivity", "Landroidx/activity/ComponentActivity;", "getConversationViewModel", "Lio/intercom/android/sdk/m5/conversation/ConversationViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "conversationId", "", "initialMessage", "isLaunchedProgrammatically", "", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Landroidx/compose/runtime/Composer;II)Lio/intercom/android/sdk/m5/conversation/ConversationViewModel;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConversationDestinationKt {

    /* compiled from: ConversationDestination.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void conversationDestination(NavGraphBuilder navGraphBuilder, NavHostController navController, ComponentActivity rootActivity) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        NavGraphBuilderKt.composable$default(navGraphBuilder, "CONVERSATION?conversationId={conversationId}&initialMessage={initialMessage}&articleId={articleId}&articleTitle={articleTitle}&isLaunchedProgrammatically={isLaunchedProgrammatically}&transitionArgs={transitionArgs}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("conversationId", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit conversationDestination$lambda$0;
                conversationDestination$lambda$0 = ConversationDestinationKt.conversationDestination$lambda$0((NavArgumentBuilder) obj);
                return conversationDestination$lambda$0;
            }
        }), NamedNavArgumentKt.navArgument("initialMessage", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit conversationDestination$lambda$1;
                conversationDestination$lambda$1 = ConversationDestinationKt.conversationDestination$lambda$1((NavArgumentBuilder) obj);
                return conversationDestination$lambda$1;
            }
        }), NamedNavArgumentKt.navArgument("articleId", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit conversationDestination$lambda$2;
                conversationDestination$lambda$2 = ConversationDestinationKt.conversationDestination$lambda$2((NavArgumentBuilder) obj);
                return conversationDestination$lambda$2;
            }
        }), NamedNavArgumentKt.navArgument("articleTitle", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit conversationDestination$lambda$3;
                conversationDestination$lambda$3 = ConversationDestinationKt.conversationDestination$lambda$3((NavArgumentBuilder) obj);
                return conversationDestination$lambda$3;
            }
        }), NamedNavArgumentKt.navArgument("isLaunchedProgrammatically", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit conversationDestination$lambda$4;
                conversationDestination$lambda$4 = ConversationDestinationKt.conversationDestination$lambda$4((NavArgumentBuilder) obj);
                return conversationDestination$lambda$4;
            }
        }), NamedNavArgumentKt.navArgument("transitionArgs", new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit conversationDestination$lambda$5;
                conversationDestination$lambda$5 = ConversationDestinationKt.conversationDestination$lambda$5((NavArgumentBuilder) obj);
                return conversationDestination$lambda$5;
            }
        })}), (List) null, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition conversationDestination$lambda$6;
                conversationDestination$lambda$6 = ConversationDestinationKt.conversationDestination$lambda$6((AnimatedContentTransitionScope) obj);
                return conversationDestination$lambda$6;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition conversationDestination$lambda$7;
                conversationDestination$lambda$7 = ConversationDestinationKt.conversationDestination$lambda$7((AnimatedContentTransitionScope) obj);
                return conversationDestination$lambda$7;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EnterTransition conversationDestination$lambda$8;
                conversationDestination$lambda$8 = ConversationDestinationKt.conversationDestination$lambda$8((AnimatedContentTransitionScope) obj);
                return conversationDestination$lambda$8;
            }
        }, new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ExitTransition conversationDestination$lambda$9;
                conversationDestination$lambda$9 = ConversationDestinationKt.conversationDestination$lambda$9((AnimatedContentTransitionScope) obj);
                return conversationDestination$lambda$9;
            }
        }, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1198092933, true, new ConversationDestinationKt$conversationDestination$11(rootActivity, navController)), 132, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$0(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        navArgument.setNullable(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        navArgument.setNullable(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        navArgument.setNullable(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$3(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        navArgument.setNullable(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$4(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        navArgument.setNullable(false);
        navArgument.setDefaultValue(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conversationDestination$lambda$5(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(TransitionStyleKt.getTransitionArgNavType());
        navArgument.setNullable(false);
        navArgument.setDefaultValue(new TransitionArgs(null, null, null, null, 15, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition conversationDestination$lambda$6(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition conversationDestination$lambda$7(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition conversationDestination$lambda$8(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getTargetState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition conversationDestination$lambda$9(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((NavBackStackEntry) composable.getInitialState(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationViewModel getConversationViewModel(ViewModelStoreOwner viewModelStoreOwner, String str, String str2, boolean z, ArticleMetadata articleMetadata, Composer composer, int i, int i2) {
        LaunchMode launchMode;
        composer.startReplaceGroup(-1203114984);
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            articleMetadata = null;
        }
        ArticleMetadata articleMetadata2 = articleMetadata;
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) consume;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Context context = (Context) consume2;
        ConversationViewModel.Companion companion = ConversationViewModel.INSTANCE;
        if (z) {
            launchMode = LaunchMode.PROGRAMMATIC;
        } else {
            launchMode = LaunchMode.CLASSIC;
        }
        final ConversationViewModel create = companion.create(viewModelStoreOwner, str, str3, articleMetadata2, launchMode);
        EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new Function1() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult conversationViewModel$lambda$12;
                conversationViewModel$lambda$12 = ConversationDestinationKt.getConversationViewModel$lambda$12(LifecycleOwner.this, create, context, (DisposableEffectScope) obj);
                return conversationViewModel$lambda$12;
            }
        }, composer, 8);
        composer.endReplaceGroup();
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult getConversationViewModel$lambda$12(final LifecycleOwner lifecycleOwner, final ConversationViewModel viewModel, final Context context, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                ConversationDestinationKt.getConversationViewModel$lambda$12$lambda$10(ConversationViewModel.this, context, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt$getConversationViewModel$lambda$12$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getConversationViewModel$lambda$12$lambda$10(ConversationViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            viewModel.onResume(context);
        } else {
            if (i != 2) {
                return;
            }
            viewModel.onPause(context);
        }
    }
}
