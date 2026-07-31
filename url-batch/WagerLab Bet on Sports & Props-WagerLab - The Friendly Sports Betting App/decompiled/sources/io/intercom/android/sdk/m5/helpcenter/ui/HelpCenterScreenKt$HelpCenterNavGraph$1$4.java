package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class HelpCenterScreenKt$HelpCenterNavGraph$1$4 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    HelpCenterScreenKt$HelpCenterNavGraph$1$4(HelpCenterViewModel helpCenterViewModel, Context context, NavHostController navHostController) {
        this.$viewModel = helpCenterViewModel;
        this.$context = context;
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        String str;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle arguments = it.getArguments();
        if (arguments == null || (str = arguments.getString("id")) == null) {
            str = "";
        }
        String str2 = str;
        final HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        final Context context = this.$context;
        Function1 function1 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterNavGraph$1$4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$0;
                invoke$lambda$0 = HelpCenterScreenKt$HelpCenterNavGraph$1$4.invoke$lambda$0(HelpCenterViewModel.this, context, (String) obj);
                return invoke$lambda$0;
            }
        };
        final NavHostController navHostController = this.$navController;
        HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen(helpCenterViewModel, str2, function1, new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt$HelpCenterNavGraph$1$4$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$1;
                invoke$lambda$1 = HelpCenterScreenKt$HelpCenterNavGraph$1$4.invoke$lambda$1(NavHostController.this, (String) obj);
                return invoke$lambda$1;
            }
        }, composer, 8, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(HelpCenterViewModel viewModel, Context context, String articleId) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        viewModel.onArticleClicked();
        context.startActivity(IntercomArticleActivity.INSTANCE.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, MetricTracker.Place.COLLECTION_LIST, false, false, 8, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(NavHostController navController, String subCollectionId) {
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(subCollectionId, "subCollectionId");
        NavController.navigate$default((NavController) navController, "COLLECTION_DETAILS/" + subCollectionId, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }
}
