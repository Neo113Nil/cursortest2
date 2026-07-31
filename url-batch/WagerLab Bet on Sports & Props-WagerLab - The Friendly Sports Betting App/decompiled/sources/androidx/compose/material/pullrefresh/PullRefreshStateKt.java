package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PullRefreshState.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"rememberPullRefreshState", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "refreshing", "", "onRefresh", "Lkotlin/Function0;", "", "refreshThreshold", "Landroidx/compose/ui/unit/Dp;", "refreshingOffset", "rememberPullRefreshState-UuyPYSY", "(ZLkotlin/jvm/functions/Function0;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/pullrefresh/PullRefreshState;", "DragMultiplier", "", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshStateKt {
    private static final float DragMultiplier = 0.5f;

    /* renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final PullRefreshState m2264rememberPullRefreshStateUuyPYSY(final boolean z, Function0<Unit> function0, float f, float f2, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -174977512, "C(rememberPullRefreshState)N(refreshing,onRefresh,refreshThreshold:c#ui.unit.Dp,refreshingOffset:c#ui.unit.Dp)64@2637L24,65@2687L31,69@2803L7,75@2944L92,77@3053L141,77@3042L152:PullRefreshState.kt#t44y28");
        if ((i2 & 4) != 0) {
            f = PullRefreshDefaults.INSTANCE.m2254getRefreshThresholdD9Ej5fM();
        }
        if ((i2 & 8) != 0) {
            f2 = PullRefreshDefaults.INSTANCE.m2255getRefreshingOffsetD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-174977512, i, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if (Dp.m8400compareTo0680j_4(f, Dp.m8401constructorimpl(0)) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
        }
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, 683737348, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composer, (i >> 3) & 14);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        floatRef.element = density.mo424toPx0680j_4(f);
        floatRef2.element = density.mo424toPx0680j_4(f2);
        ComposerKt.sourceInformationMarkerStart(composer, -649642476, "CC(remember):PullRefreshState.kt#9igjgp");
        boolean changed = composer.changed(coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new PullRefreshState(coroutineScope, rememberUpdatedState, floatRef2.element, floatRef.element);
            composer.updateRememberedValue(rememberedValue2);
        }
        final PullRefreshState pullRefreshState = (PullRefreshState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -649638939, "CC(remember):PullRefreshState.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(pullRefreshState) | ((((i & 14) ^ 6) > 4 && composer.changed(z)) || (i & 6) == 4) | composer.changed(floatRef.element) | composer.changed(floatRef2.element);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: androidx.compose.material.pullrefresh.PullRefreshStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit rememberPullRefreshState_UuyPYSY$lambda$4$lambda$3;
                    rememberPullRefreshState_UuyPYSY$lambda$4$lambda$3 = PullRefreshStateKt.rememberPullRefreshState_UuyPYSY$lambda$4$lambda$3(PullRefreshState.this, z, floatRef, floatRef2);
                    return rememberPullRefreshState_UuyPYSY$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.SideEffect((Function0) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return pullRefreshState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberPullRefreshState_UuyPYSY$lambda$4$lambda$3(PullRefreshState pullRefreshState, boolean z, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        pullRefreshState.setRefreshing$material(z);
        pullRefreshState.setThreshold$material(floatRef.element);
        pullRefreshState.setRefreshingOffset$material(floatRef2.element);
        return Unit.INSTANCE;
    }
}
