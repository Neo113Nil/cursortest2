package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowDefaults$tabIndicatorOffset$2 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TabPosition $currentTabPosition;

    TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        this.$currentTabPosition = tabPosition;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-398757863);
        ComposerKt.sourceInformation(composer, "C392@17801L190,397@18043L189,403@18340L53:TabRow.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-398757863, i, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:391)");
        }
        State<Dp> m145animateDpAsStateAjpBEmI = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(this.$currentTabPosition.getWidth(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
        final State<Dp> m145animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(this.$currentTabPosition.getLeft(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer, -954198002, "CC(remember):TabRow.kt#9igjgp");
        boolean changed = composer.changed(m145animateDpAsStateAjpBEmI2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    IntOffset invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = TabRowDefaults$tabIndicatorOffset$2.invoke$lambda$3$lambda$2(State.this, (Density) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier m894width3ABfNKs = SizeKt.m894width3ABfNKs(OffsetKt.offset(wrapContentSize$default, (Function1) rememberedValue), invoke$lambda$0(m145animateDpAsStateAjpBEmI));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m894width3ABfNKs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset invoke$lambda$3$lambda$2(State state, Density density) {
        return IntOffset.m8520boximpl(IntOffset.m8523constructorimpl((density.mo418roundToPx0680j_4(invoke$lambda$1(state)) << 32) | (0 & 4294967295L)));
    }

    private static final float invoke$lambda$0(State<Dp> state) {
        return state.getValue().m8415unboximpl();
    }

    private static final float invoke$lambda$1(State<Dp> state) {
        return state.getValue().m8415unboximpl();
    }
}
