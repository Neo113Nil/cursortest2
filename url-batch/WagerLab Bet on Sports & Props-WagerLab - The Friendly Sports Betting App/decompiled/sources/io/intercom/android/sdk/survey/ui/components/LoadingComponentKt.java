package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.facebook.shimmer.ShimmerFrameLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingComponent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a)\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"SurveyLoading", "", "state", "Lio/intercom/android/sdk/survey/SurveyState$Loading;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/survey/SurveyState$Loading;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "buildLoadingContainer", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "context", "Landroid/content/Context;", "buildLoadingContent", "Landroid/view/View;", "tintColor", "Landroidx/compose/ui/graphics/Color;", "resId", "", "buildLoadingContent-bw27NRU", "(Landroid/content/Context;JI)Landroid/view/View;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LoadingComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyLoading$lambda$3(SurveyState.Loading state, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(state, "$state");
        SurveyLoading(state, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SurveyLoading(final SurveyState.Loading state, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(913588806);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1496338436);
            boolean z = (i3 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.LoadingComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ShimmerFrameLayout SurveyLoading$lambda$2$lambda$1;
                        SurveyLoading$lambda$2$lambda$1 = LoadingComponentKt.SurveyLoading$lambda$2$lambda$1(SurveyState.Loading.this, (Context) obj);
                        return SurveyLoading$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) rememberedValue, fillMaxSize$default, null, startRestartGroup, 0, 4);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.LoadingComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurveyLoading$lambda$3;
                    SurveyLoading$lambda$3 = LoadingComponentKt.SurveyLoading$lambda$3(SurveyState.Loading.this, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SurveyLoading$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmerFrameLayout SurveyLoading$lambda$2$lambda$1(SurveyState.Loading state, Context context) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(context, "context");
        ShimmerFrameLayout buildLoadingContainer = buildLoadingContainer(context);
        buildLoadingContainer.addView(m11749buildLoadingContentbw27NRU(context, state.getSurveyUiColors().m11689getOnBackground0d7_KjU(), R.drawable.intercom_survey_loading_state));
        return buildLoadingContainer;
    }

    public static final ShimmerFrameLayout buildLoadingContainer(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout(context);
        intercomShimmerLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        intercomShimmerLayout.setClickable(true);
        intercomShimmerLayout.setFocusable(true);
        return intercomShimmerLayout;
    }

    /* renamed from: buildLoadingContent-bw27NRU, reason: not valid java name */
    public static final View m11749buildLoadingContentbw27NRU(Context context, long j, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int m8401constructorimpl = (int) Dp.m8401constructorimpl(Dp.m8401constructorimpl(20) * context.getResources().getDisplayMetrics().density);
        layoutParams.setMarginStart(m8401constructorimpl);
        layoutParams.setMarginEnd(m8401constructorimpl);
        layoutParams.topMargin = m8401constructorimpl;
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), i, null);
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ColorKt.m5711toArgb8_81llA(j));
            DrawableCompat.setAutoMirrored(drawable, true);
            imageView.setImageDrawable(drawable);
        }
        return imageView;
    }
}
