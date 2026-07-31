package io.intercom.android.sdk.tickets;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TicketDetailContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002"}, d2 = {"TicketDetailContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "ticketDetailContentState", "Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "onConversationCTAClicked", "Lkotlin/Function1;", "", "showSubmissionCard", "", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "TicketSubmissionCard", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TicketSubmissionCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "TicketPreview", "TicketPreviewSubmittedCard", "sampleTicketDetailState", "getSampleTicketDetailState", "()Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "intercom-sdk-base_release", "cardState", "Lio/intercom/android/sdk/tickets/CardState;", "submissionCardOffset", "Landroidx/compose/ui/unit/Dp;", "submissionCardAlpha", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketDetailContentKt {
    private static final TicketDetailState.TicketDetailContentState sampleTicketDetailState;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailContent$lambda$16(Modifier modifier, TicketDetailState.TicketDetailContentState ticketDetailContentState, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(ticketDetailContentState, "$ticketDetailContentState");
        TicketDetailContent(modifier, ticketDetailContentState, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketPreview$lambda$20(int i, Composer composer, int i2) {
        TicketPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketPreviewSubmittedCard$lambda$21(int i, Composer composer, int i2) {
        TicketPreviewSubmittedCard(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketSubmissionCard$lambda$18(Modifier modifier, int i, int i2, Composer composer, int i3) {
        TicketSubmissionCard(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketSubmissionCardPreview$lambda$19(int i, Composer composer, int i2) {
        TicketSubmissionCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailContent$lambda$0(String str) {
        return Unit.INSTANCE;
    }

    public static final void TicketDetailContent(Modifier modifier, final TicketDetailState.TicketDetailContentState ticketDetailContentState, Function1<? super String, Unit> function1, boolean z, Composer composer, final int i, final int i2) {
        SpringSpec spring$default;
        Intrinsics.checkNotNullParameter(ticketDetailContentState, "ticketDetailContentState");
        Composer startRestartGroup = composer.startRestartGroup(-872031756);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final Function1<? super String, Unit> function12 = (i2 & 4) != 0 ? new Function1() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TicketDetailContent$lambda$0;
                TicketDetailContent$lambda$0 = TicketDetailContentKt.TicketDetailContent$lambda$0((String) obj);
                return TicketDetailContent$lambda$0;
            }
        } : function1;
        final boolean z2 = (i2 & 8) != 0 ? false : z;
        Object[] objArr = new Object[0];
        startRestartGroup.startReplaceGroup(1639443041);
        boolean z3 = (((i & 7168) ^ 3072) > 2048 && startRestartGroup.changed(z2)) || (i & 3072) == 2048;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    MutableState TicketDetailContent$lambda$2$lambda$1;
                    TicketDetailContent$lambda$2$lambda$1 = TicketDetailContentKt.TicketDetailContent$lambda$2$lambda$1(z2);
                    return TicketDetailContent$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceGroup();
        MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (Function0) rememberedValue, startRestartGroup, 8);
        startRestartGroup.startReplaceGroup(1639447110);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m8399boximpl(Dp.m8401constructorimpl(-56)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1639449312);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1639450743);
        if (TicketDetailContent$lambda$3(mutableState) == CardState.SubmissionCard) {
            startRestartGroup.startReplaceGroup(1639454260);
            boolean changed = startRestartGroup.changed(mutableState);
            TicketDetailContentKt$TicketDetailContent$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new TicketDetailContentKt$TicketDetailContent$2$1(mutableState2, mutableState3, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect((Object) null, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 70);
        }
        startRestartGroup.endReplaceGroup();
        Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(modifier2, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier animateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.m877heightInVpY3zN4$default(SizeKt.fillMaxSize$default(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), 0.0f, 1, null), Dp.m8401constructorimpl(194), 0.0f, 2, null), AnimationSpecKt.tween$default(0, 0, null, 7, null), null, 2, null);
        Alignment center = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, animateContentSize$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        final boolean z4 = z2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        final Modifier modifier3 = modifier2;
        TicketTimelineCardKt.TicketTimelineCard(ticketDetailContentState.getTicketTimelineCardState(), AlphaKt.alpha(Modifier.INSTANCE, AnimateAsStateKt.animateFloatAsState(TicketDetailContent$lambda$3(mutableState) == CardState.TimelineCard ? 1.0f : 0.0f, AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28).getValue().floatValue()), startRestartGroup, 8, 0);
        Modifier.Companion companion = Modifier.INSTANCE;
        float TicketDetailContent$lambda$9 = TicketDetailContent$lambda$3(mutableState) == CardState.SubmissionCard ? TicketDetailContent$lambda$9(mutableState3) : 0.0f;
        if (TicketDetailContent$lambda$3(mutableState) == CardState.SubmissionCard) {
            spring$default = AnimationSpecKt.tween$default(1000, 0, null, 6, null);
        } else {
            spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        TicketSubmissionCard(OffsetKt.m792offsetVpY3zN4$default(AlphaKt.alpha(companion, AnimateAsStateKt.animateFloatAsState(TicketDetailContent$lambda$9, spring$default, 0.0f, null, null, startRestartGroup, 64, 28).getValue().floatValue()), 0.0f, AnimateAsStateKt.m145animateDpAsStateAjpBEmI(TicketDetailContent$lambda$6(mutableState2), AnimationSpecKt.tween$default(1000, 0, null, 6, null), null, null, startRestartGroup, 48, 12).getValue().m8415unboximpl(), 1, null), startRestartGroup, 0, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SurfaceKt.m3409SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(925724611, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                char c;
                Object obj;
                boolean z5;
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    float f = 16;
                    Modifier m837padding3ABfNKs = PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f));
                    TicketDetailState.TicketDetailContentState ticketDetailContentState2 = TicketDetailState.TicketDetailContentState.this;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m837padding3ABfNKs);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer2);
                    Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                        m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                        m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                    }
                    Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    float f2 = 12;
                    Modifier m837padding3ABfNKs2 = PaddingKt.m837padding3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(Dp.m8401constructorimpl(8))), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12155getBubbleBackground0d7_KjU(), null, 2, null), 0.0f, 1, null), Dp.m8401constructorimpl(f2));
                    ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m837padding3ABfNKs2);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4976constructorimpl4 = Updater.m4976constructorimpl(composer2);
                    Updater.m4983setimpl(m4976constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4976constructorimpl4.getInserting() || !Intrinsics.areEqual(m4976constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
                        m4976constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
                        m4976constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
                    }
                    Updater.m4983setimpl(m4976constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ticket_notification, composer2, 0), (String) null, SizeKt.m889size3ABfNKs(PaddingKt.m841paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8401constructorimpl(4), 0.0f, 0.0f, 13, null), Dp.m8401constructorimpl(f)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12173getPrimaryIcon0d7_KjU(), composer2, 440, 0);
                    SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer2, 6);
                    TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04();
                    composer2.startReplaceGroup(1807110670);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    composer2.startReplaceGroup(1807112154);
                    int pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(R.string.intercom_youll_be_notified_here_and_by_email, composer2, 0));
                        builder.append(" ");
                        Unit unit = Unit.INSTANCE;
                        builder.pop(pushStyle);
                        composer2.endReplaceGroup();
                        builder.append(ticketDetailContentState2.getUserEmail());
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer2.endReplaceGroup();
                        TextKt.m3582TextZ58ophY(annotatedString, null, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, TextUnitKt.getSp(22), 0, false, 0, 0, null, null, type04, composer2, 0, 48, 260090);
                        Composer composer3 = composer2;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        char c2 = 6;
                        SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24)), composer3, 6);
                        composer3.startReplaceGroup(-711350793);
                        if (!ticketDetailContentState2.getTicketAttributes().isEmpty()) {
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            float m8401constructorimpl = Dp.m8401constructorimpl(f2);
                            Object obj2 = null;
                            char c3 = 2;
                            Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(companion2, m8401constructorimpl, 0.0f, 2, null);
                            boolean z6 = true;
                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(m839paddingVpY3zN4$default, 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default);
                            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor5);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4976constructorimpl5 = Updater.m4976constructorimpl(composer3);
                            Updater.m4983setimpl(m4976constructorimpl5, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl5.getInserting() || !Intrinsics.areEqual(m4976constructorimpl5.rememberedValue(), Integer.valueOf(hashCode5))) {
                                m4976constructorimpl5.updateRememberedValue(Integer.valueOf(hashCode5));
                                m4976constructorimpl5.apply(Integer.valueOf(hashCode5), setCompositeKeyHash5);
                            }
                            Updater.m4983setimpl(m4976constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                            composer3.startReplaceGroup(1807143465);
                            for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState2.getTicketAttributes()) {
                                TextKt.m3581TextNvy7gAk(ticketAttribute.getName(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04SemiBold(), composer2, 0, 0, 131070);
                                composer3 = composer2;
                                SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(2)), composer3, 6);
                                if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                    composer3.startReplaceGroup(2134715913);
                                    c = 2;
                                    TextKt.m3581TextNvy7gAk(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                                    composer3 = composer2;
                                    composer3.endReplaceGroup();
                                } else {
                                    c = 2;
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                        composer3.startReplaceGroup(2135020457);
                                        TextKt.m3581TextNvy7gAk(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                                        composer3 = composer2;
                                        composer3.endReplaceGroup();
                                    } else if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                        composer3.startReplaceGroup(2135335386);
                                        String formatTimeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * 1000, "dd-MM-yyy, HH:mm");
                                        Intrinsics.checkNotNullExpressionValue(formatTimeInMillisAsDate, "formatTimeInMillisAsDate(...)");
                                        TextKt.m3581TextNvy7gAk(formatTimeInMillisAsDate, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                                        composer3 = composer2;
                                        composer3.endReplaceGroup();
                                    } else {
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                            composer3.startReplaceGroup(2135835354);
                                            FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), composer3, 64, 1);
                                            composer3.endReplaceGroup();
                                            z5 = true;
                                            obj = null;
                                        } else {
                                            if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                composer3.startReplaceGroup(1592882332);
                                                composer3.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer3.startReplaceGroup(2136019990);
                                            obj = null;
                                            z5 = true;
                                            TextKt.m3581TextNvy7gAk(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                                            composer3 = composer2;
                                            composer3.endReplaceGroup();
                                        }
                                        c2 = 6;
                                        SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer3, 6);
                                        z6 = z5;
                                        obj2 = obj;
                                        c3 = c;
                                    }
                                }
                                z5 = true;
                                obj = null;
                                c2 = 6;
                                SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer3, 6);
                                z6 = z5;
                                obj2 = obj;
                                c3 = c;
                            }
                            composer3.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                        }
                        composer3.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        return;
                    } catch (Throwable th) {
                        builder.pop(pushStyle);
                        throw th;
                    }
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, 12582918, 122);
        Composer composer2 = startRestartGroup;
        composer2.startReplaceGroup(1933740147);
        if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
            float f = 16;
            Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8401constructorimpl(f), 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m839paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer2);
            Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
            }
            Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_tickets_cta_text, composer2, 0), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8257getCentere0LSkKk()), 0L, 0, false, 0, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04Point5(), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer2, 48, 0, 130044);
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), composer2, 6);
            ConversationButtonState conversationButtonState = ticketDetailContentState.getConversationButtonState();
            IntercomButton.Style m11965primaryStyleKlgxPg = IntercomButton.INSTANCE.m11965primaryStyleKlgxPg(0L, 0L, null, composer2, IntercomButton.$stable << 9, 7);
            composer2 = composer2;
            IntercomButtonKt.IntercomButton(null, m11965primaryStyleKlgxPg, conversationButtonState.getText().getText(composer2, StringProvider.$stable), conversationButtonState.getIconRes(), new Function0() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TicketDetailContent$lambda$15$lambda$14$lambda$13;
                    TicketDetailContent$lambda$15$lambda$14$lambda$13 = TicketDetailContentKt.TicketDetailContent$lambda$15$lambda$14$lambda$13(Function1.this, ticketDetailContentState);
                    return TicketDetailContent$lambda$15$lambda$14$lambda$13;
                }
            }, composer2, IntercomButton.Style.$stable << 3, 1);
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer2, 6);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketDetailContent$lambda$16;
                    TicketDetailContent$lambda$16 = TicketDetailContentKt.TicketDetailContent$lambda$16(Modifier.this, ticketDetailContentState, function12, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketDetailContent$lambda$16;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TicketDetailContent$lambda$2$lambda$1(boolean z) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(z ? CardState.SubmissionCard : CardState.TimelineCard, null, 2, null);
    }

    private static final CardState TicketDetailContent$lambda$3(MutableState<CardState> mutableState) {
        return mutableState.getValue();
    }

    private static final float TicketDetailContent$lambda$6(MutableState<Dp> mutableState) {
        return mutableState.getValue().m8415unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$7(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m8399boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$10(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    private static final float TicketDetailContent$lambda$9(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketDetailContent$lambda$15$lambda$14$lambda$13(Function1 function1, TicketDetailState.TicketDetailContentState ticketDetailContentState) {
        Intrinsics.checkNotNullParameter(ticketDetailContentState, "$ticketDetailContentState");
        function1.invoke(ticketDetailContentState.getConversationId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketSubmissionCard(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-2022209692);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
            float f = 16;
            Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier m837padding3ABfNKs = PaddingKt.m837padding3ABfNKs(companion, Dp.m8401constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m696spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m837padding3ABfNKs);
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
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_submitted, startRestartGroup, 0), (String) null, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(48)), ColorKt.Color(4279072050L), startRestartGroup, 3512, 0);
            composer2 = startRestartGroup;
            TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_tickets_created_confirmation_header, startRestartGroup, 0), null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8257getCentere0LSkKk()), 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), composer2, 0, 0, 130042);
            TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_tickets_submitted_confirmation_paragraph, composer2, 0), null, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8257getCentere0LSkKk()), 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 130042);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            modifier2 = companion;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketSubmissionCard$lambda$18;
                    TicketSubmissionCard$lambda$18 = TicketDetailContentKt.TicketSubmissionCard$lambda$18(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketSubmissionCard$lambda$18;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TicketSubmissionCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-981393609);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m11873getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketSubmissionCardPreview$lambda$19;
                    TicketSubmissionCardPreview$lambda$19 = TicketDetailContentKt.TicketSubmissionCardPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketSubmissionCardPreview$lambda$19;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TicketPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1759013677);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m11874getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketPreview$lambda$20;
                    TicketPreview$lambda$20 = TicketDetailContentKt.TicketPreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketPreview$lambda$20;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TicketPreviewSubmittedCard(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2122497154);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m11875getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketPreviewSubmittedCard$lambda$21;
                    TicketPreviewSubmittedCard$lambda$21 = TicketDetailContentKt.TicketPreviewSubmittedCard$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketPreviewSubmittedCard$lambda$21;
                }
            });
        }
    }

    static {
        Avatar create = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", "");
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        sampleTicketDetailState = new TicketDetailState.TicketDetailContentState("API issue", new TicketTimelineCardState(CollectionsKt.listOf(new AvatarWrapper(create, false, 2, null)), "Hannah will pick this up soon", "🕑  Estimated to be resolved today at 4pm", Color.INSTANCE.m5684getBlue0d7_KjU(), CollectionsKt.listOf((Object[]) new TicketTimelineCardState.ProgressSection[]{new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(false, true), new TicketTimelineCardState.ProgressSection(false, false)}), "Submitted", Long.valueOf(System.currentTimeMillis()), null), CollectionsKt.listOf((Object[]) new Ticket.TicketAttribute[]{new Ticket.TicketAttribute.PrimitiveAttribute(null, null, "Description", false, null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Et, ut hendrerit et lacus, dictumst ridiculus morbi elementum.", 27, null), new Ticket.TicketAttribute.PrimitiveAttribute(null, null, "API Version", false, null, "1.2", 27, null), new Ticket.TicketAttribute.DateTimeAttribute(null, null, "When did the issue occur?", false, null, "1676555323", 27, null)}), "test@gmail.com", "123", new ConversationButtonState(true, Integer.valueOf(R.drawable.intercom_send_message_icon), new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null)));
    }

    public static final TicketDetailState.TicketDetailContentState getSampleTicketDetailState() {
        return sampleTicketDetailState;
    }
}
