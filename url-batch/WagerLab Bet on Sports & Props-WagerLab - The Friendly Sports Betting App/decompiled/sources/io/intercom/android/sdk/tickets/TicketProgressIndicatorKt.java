package io.intercom.android.sdk.tickets;

import androidx.compose.animation.TransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketProgressIndicator.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"TicketProgressIndicator", "", "progressSections", "", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState$ProgressSection;", "progressColor", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "TicketProgressIndicator-3IgeMak", "(Ljava/util/List;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TicketProgressIndicatorPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketProgressIndicatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicatorPreview$lambda$9(int i, Composer composer, int i2) {
        TicketProgressIndicatorPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicator_3IgeMak$lambda$8(List progressSections, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(progressSections, "$progressSections");
        m11896TicketProgressIndicator3IgeMak(progressSections, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: TicketProgressIndicator-3IgeMak, reason: not valid java name */
    public static final void m11896TicketProgressIndicator3IgeMak(final List<TicketTimelineCardState.ProgressSection> progressSections, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z;
        float f;
        InfiniteTransition infiniteTransition;
        final float f2;
        long j2;
        long j3;
        final long j4 = j;
        Intrinsics.checkNotNullParameter(progressSections, "progressSections");
        Composer startRestartGroup = composer.startRestartGroup(484493125);
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("Infinite progress animation", startRestartGroup, 6, 0);
        final long m12160getDisabled0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12160getDisabled0d7_KjU();
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(4));
        Modifier clip = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape(50));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clip);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(1767069389);
        for (TicketTimelineCardState.ProgressSection progressSection : progressSections) {
            startRestartGroup.startReplaceGroup(1767070266);
            if (progressSection.isLoading()) {
                z = true;
                f = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1() { // from class: io.intercom.android.sdk.tickets.TicketProgressIndicatorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0;
                        TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0 = TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0((KeyframesSpec.KeyframesSpecConfig) obj);
                        return TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0;
                    }
                }), null, 0L, 6, null), "Progress value animation", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0).getValue().floatValue();
            } else {
                z = true;
                f = progressSection.isDone() ? 1.0f : 0.0f;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1767091849);
            if (progressSection.isLoading()) {
                startRestartGroup.startReplaceGroup(1463860081);
                boolean changed = startRestartGroup.changed(m12160getDisabled0d7_KjU) | (((((i & 112) ^ 48) <= 32 || !startRestartGroup.changed(j4)) && (i & 48) != 32) ? false : z);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: io.intercom.android.sdk.tickets.TicketProgressIndicatorKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1;
                            TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1 = TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1(j4, m12160getDisabled0d7_KjU, (KeyframesSpec.KeyframesSpecConfig) obj);
                            return TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                long j5 = j4;
                InfiniteTransition infiniteTransition2 = rememberInfiniteTransition;
                long j6 = m12160getDisabled0d7_KjU;
                f2 = f;
                infiniteTransition = infiniteTransition2;
                j2 = j6;
                j3 = TransitionKt.m143animateColorDTcfvLk(infiniteTransition2, j6, j5, AnimationSpecKt.m156infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes((Function1) rememberedValue), null, 0L, 6, null), "Color value animation", startRestartGroup, InfiniteTransition.$stable | 24576 | ((i << 3) & 896) | (InfiniteRepeatableSpec.$stable << 9), 0).getValue().m5667unboximpl();
            } else {
                infiniteTransition = rememberInfiniteTransition;
                long j7 = m12160getDisabled0d7_KjU;
                f2 = f;
                j2 = j7;
                j3 = j;
            }
            startRestartGroup.endReplaceGroup();
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            float m8401constructorimpl = Dp.m8401constructorimpl(0);
            int m6029getSquareKaPHkGw = StrokeCap.INSTANCE.m6029getSquareKaPHkGw();
            startRestartGroup.startReplaceGroup(1463876813);
            boolean changed2 = startRestartGroup.changed(f2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.tickets.TicketProgressIndicatorKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3;
                        TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3 = TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3(f2);
                        return Float.valueOf(TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Composer composer2 = startRestartGroup;
            ProgressIndicatorKt.m3164LinearProgressIndicatorGJbTh5U((Function0) rememberedValue2, weight$default, j3, j2, m6029getSquareKaPHkGw, m8401constructorimpl, new Function1() { // from class: io.intercom.android.sdk.tickets.TicketProgressIndicatorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5;
                    TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5 = TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5((DrawScope) obj);
                    return TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5;
                }
            }, composer2, 1769472, 0);
            j4 = j;
            m12160getDisabled0d7_KjU = j2;
            startRestartGroup = composer2;
            rememberInfiniteTransition = infiniteTransition;
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = companion;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketProgressIndicatorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketProgressIndicator_3IgeMak$lambda$8;
                    TicketProgressIndicator_3IgeMak$lambda$8 = TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$8(progressSections, j, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketProgressIndicator_3IgeMak$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0(KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(3200);
        Float valueOf = Float.valueOf(1.0f);
        keyframes.using(keyframes.at((KeyframesSpec.KeyframesSpecConfig) valueOf, 850), EasingKt.getLinearEasing());
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) valueOf, 3200);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1(long j, long j2, KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(3200);
        keyframes.using(keyframes.at((KeyframesSpec.KeyframesSpecConfig) Color.m5647boximpl(j), 850), EasingKt.getLinearEasing());
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) Color.m5647boximpl(j), 1850);
        keyframes.using(keyframes.at((KeyframesSpec.KeyframesSpecConfig) Color.m5647boximpl(j2), 2200), EasingKt.getLinearEasing());
        keyframes.at((KeyframesSpec.KeyframesSpecConfig) Color.m5647boximpl(j2), 3200);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5(DrawScope LinearProgressIndicator) {
        Intrinsics.checkNotNullParameter(LinearProgressIndicator, "$this$LinearProgressIndicator");
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    public static final void TicketProgressIndicatorPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1245553611);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressIndicatorKt.INSTANCE.m11881getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketProgressIndicatorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketProgressIndicatorPreview$lambda$9;
                    TicketProgressIndicatorPreview$lambda$9 = TicketProgressIndicatorKt.TicketProgressIndicatorPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketProgressIndicatorPreview$lambda$9;
                }
            });
        }
    }
}
