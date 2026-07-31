package io.intercom.android.sdk.m5.navigation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomTransitions.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"+\u0010\u0000\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"+\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\b\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"slideUpEnterTransition", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/ExtensionFunctionType;", "getSlideUpEnterTransition", "()Lkotlin/jvm/functions/Function1;", "slideDownExitTransition", "Landroidx/compose/animation/ExitTransition;", "getSlideDownExitTransition", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomTransitionsKt {
    private static final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> slideUpEnterTransition = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.IntercomTransitionsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            EnterTransition slideUpEnterTransition$lambda$0;
            slideUpEnterTransition$lambda$0 = IntercomTransitionsKt.slideUpEnterTransition$lambda$0((AnimatedContentTransitionScope) obj);
            return slideUpEnterTransition$lambda$0;
        }
    };
    private static final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> slideDownExitTransition = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.IntercomTransitionsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ExitTransition slideDownExitTransition$lambda$1;
            slideDownExitTransition$lambda$1 = IntercomTransitionsKt.slideDownExitTransition$lambda$1((AnimatedContentTransitionScope) obj);
            return slideDownExitTransition$lambda$1;
        }
    };

    public static final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getSlideUpEnterTransition() {
        return slideUpEnterTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition slideUpEnterTransition$lambda$0(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "<this>");
        return AnimatedContentTransitionScope.m48slideIntoContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m64getUpDKzdypw(), AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 4, null);
    }

    public static final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getSlideDownExitTransition() {
        return slideDownExitTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition slideDownExitTransition$lambda$1(AnimatedContentTransitionScope animatedContentTransitionScope) {
        Intrinsics.checkNotNullParameter(animatedContentTransitionScope, "<this>");
        return AnimatedContentTransitionScope.m49slideOutOfContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m59getDownDKzdypw(), AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 4, null);
    }
}
