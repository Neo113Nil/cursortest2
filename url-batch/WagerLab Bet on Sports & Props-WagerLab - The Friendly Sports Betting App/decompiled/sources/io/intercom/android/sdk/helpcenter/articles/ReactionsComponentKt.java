package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorMatrix;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReactionsComponent.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"ReactionsComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "currentReactionState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;", "sadReactionTapped", "Lkotlin/Function0;", "neutralReactionTapped", "happyReactionTapped", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$ReactionState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ReactionsComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "ReactionComponentSadTappedPreview", "ReactionComponentNeutralTappedPreview", "intercom-sdk-base_release", "sadSize", "Landroidx/compose/ui/unit/Dp;", "happySize", "neutralSize"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReactionsComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionComponentNeutralTappedPreview$lambda$17(int i, Composer composer, int i2) {
        ReactionComponentNeutralTappedPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionComponentSadTappedPreview$lambda$16(int i, Composer composer, int i2) {
        ReactionComponentSadTappedPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponent$lambda$14(Modifier modifier, ArticleViewState.ReactionState currentReactionState, Function0 sadReactionTapped, Function0 neutralReactionTapped, Function0 happyReactionTapped, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(currentReactionState, "$currentReactionState");
        Intrinsics.checkNotNullParameter(sadReactionTapped, "$sadReactionTapped");
        Intrinsics.checkNotNullParameter(neutralReactionTapped, "$neutralReactionTapped");
        Intrinsics.checkNotNullParameter(happyReactionTapped, "$happyReactionTapped");
        ReactionsComponent(modifier, currentReactionState, sadReactionTapped, neutralReactionTapped, happyReactionTapped, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponentPreview$lambda$15(int i, Composer composer, int i2) {
        ReactionsComponentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ReactionsComponent(Modifier modifier, final ArticleViewState.ReactionState currentReactionState, final Function0<Unit> sadReactionTapped, final Function0<Unit> neutralReactionTapped, final Function0<Unit> happyReactionTapped, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        float m8401constructorimpl;
        float m8401constructorimpl2;
        float m8401constructorimpl3;
        boolean z;
        boolean z2;
        char c;
        Intrinsics.checkNotNullParameter(currentReactionState, "currentReactionState");
        Intrinsics.checkNotNullParameter(sadReactionTapped, "sadReactionTapped");
        Intrinsics.checkNotNullParameter(neutralReactionTapped, "neutralReactionTapped");
        Intrinsics.checkNotNullParameter(happyReactionTapped, "happyReactionTapped");
        Composer startRestartGroup = composer.startRestartGroup(-1539407934);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(currentReactionState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(sadReactionTapped) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(neutralReactionTapped) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            i3 |= startRestartGroup.changedInstance(happyReactionTapped) ? 16384 : 8192;
        }
        if ((46811 & i3) != 9362 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(modifier3, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null);
            Modifier modifier4 = modifier3;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m262backgroundbw27NRU$default);
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
            IntercomDividerKt.IntercomDivider(null, startRestartGroup, 0, 1);
            float f = 16;
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), startRestartGroup, 6);
            int i5 = i3;
            TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_article_question, startRestartGroup, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, startRestartGroup, 0, 0, 262142);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.Sad || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                m8401constructorimpl = Dp.m8401constructorimpl(38);
            } else {
                m8401constructorimpl = Dp.m8401constructorimpl(24);
            }
            State<Dp> m145animateDpAsStateAjpBEmI = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl, null, null, null, startRestartGroup, 0, 14);
            if (currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.Happy || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                m8401constructorimpl2 = Dp.m8401constructorimpl(38);
            } else {
                m8401constructorimpl2 = Dp.m8401constructorimpl(24);
            }
            State<Dp> m145animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl2, null, null, null, startRestartGroup, 0, 14);
            if (currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.Neutral || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                m8401constructorimpl3 = Dp.m8401constructorimpl(38);
            } else {
                m8401constructorimpl3 = Dp.m8401constructorimpl(24);
            }
            State<Dp> m145animateDpAsStateAjpBEmI3 = AnimateAsStateKt.m145animateDpAsStateAjpBEmI(m8401constructorimpl3, null, null, null, startRestartGroup, 0, 14);
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(-1674629439);
            boolean z3 = (i5 & 896) == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3;
                        ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3 = ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3(Function0.this);
                        return ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m889size3ABfNKs = SizeKt.m889size3ABfNKs(ClickableKt.m303clickableoSLSa3U$default(companion, false, null, null, null, (Function0) rememberedValue, 15, null), ReactionsComponent$lambda$13$lambda$12$lambda$0(m145animateDpAsStateAjpBEmI));
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.intercom_reaction_sad, startRestartGroup, 0);
            ColorFilter.Companion companion2 = ColorFilter.INSTANCE;
            float[] m5714constructorimpl$default = ColorMatrix.m5714constructorimpl$default(null, 1, null);
            if (currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.Sad || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                z = false;
                ColorMatrix.m5728setToSaturationimpl(m5714constructorimpl$default, 1.0f);
            } else {
                z = false;
                ColorMatrix.m5728setToSaturationimpl(m5714constructorimpl$default, 0.0f);
            }
            ImageKt.Image(painterResource, (String) null, m889size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, companion2.m5699colorMatrixjHGOpc(m5714constructorimpl$default), startRestartGroup, 56, 56);
            SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), startRestartGroup, 6);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(-1674600123);
            boolean z4 = (i5 & 7168) == 2048;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6;
                        ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6 = ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6(Function0.this);
                        return ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m889size3ABfNKs2 = SizeKt.m889size3ABfNKs(ClickableKt.m303clickableoSLSa3U$default(companion3, false, null, null, null, (Function0) rememberedValue2, 15, null), ReactionsComponent$lambda$13$lambda$12$lambda$2(m145animateDpAsStateAjpBEmI3));
            Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.intercom_reaction_neutral, startRestartGroup, 0);
            ColorFilter.Companion companion4 = ColorFilter.INSTANCE;
            float[] m5714constructorimpl$default2 = ColorMatrix.m5714constructorimpl$default(null, 1, null);
            if (currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.Neutral || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                z2 = false;
                c = 0;
                ColorMatrix.m5728setToSaturationimpl(m5714constructorimpl$default2, 1.0f);
            } else {
                z2 = false;
                ColorMatrix.m5728setToSaturationimpl(m5714constructorimpl$default2, 0.0f);
                c = 0;
            }
            ImageKt.Image(painterResource2, (String) null, m889size3ABfNKs2, (Alignment) null, (ContentScale) null, 0.0f, companion4.m5699colorMatrixjHGOpc(m5714constructorimpl$default2), startRestartGroup, 56, 56);
            SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), startRestartGroup, 6);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(-1674570301);
            boolean z5 = (i5 & 57344) == 16384;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9;
                        ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9 = ReactionsComponentKt.ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9(Function0.this);
                        return ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m889size3ABfNKs3 = SizeKt.m889size3ABfNKs(ClickableKt.m303clickableoSLSa3U$default(companion5, false, null, null, null, (Function0) rememberedValue3, 15, null), ReactionsComponent$lambda$13$lambda$12$lambda$1(m145animateDpAsStateAjpBEmI2));
            Painter painterResource3 = PainterResources_androidKt.painterResource(R.drawable.intercom_reaction_happy, startRestartGroup, 0);
            ColorFilter.Companion companion6 = ColorFilter.INSTANCE;
            float[] m5714constructorimpl$default3 = ColorMatrix.m5714constructorimpl$default(null, 1, null);
            if (currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.Happy || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                ColorMatrix.m5728setToSaturationimpl(m5714constructorimpl$default3, 1.0f);
            } else {
                ColorMatrix.m5728setToSaturationimpl(m5714constructorimpl$default3, 0.0f);
            }
            ImageKt.Image(painterResource3, (String) null, m889size3ABfNKs3, (Alignment) null, (ContentScale) null, 0.0f, companion6.m5699colorMatrixjHGOpc(m5714constructorimpl$default3), startRestartGroup, 56, 56);
            startRestartGroup = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ReactionsComponent$lambda$14;
                    ReactionsComponent$lambda$14 = ReactionsComponentKt.ReactionsComponent$lambda$14(Modifier.this, currentReactionState, sadReactionTapped, neutralReactionTapped, happyReactionTapped, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ReactionsComponent$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3(Function0 sadReactionTapped) {
        Intrinsics.checkNotNullParameter(sadReactionTapped, "$sadReactionTapped");
        sadReactionTapped.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6(Function0 neutralReactionTapped) {
        Intrinsics.checkNotNullParameter(neutralReactionTapped, "$neutralReactionTapped");
        neutralReactionTapped.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9(Function0 happyReactionTapped) {
        Intrinsics.checkNotNullParameter(happyReactionTapped, "$happyReactionTapped");
        happyReactionTapped.invoke();
        return Unit.INSTANCE;
    }

    public static final void ReactionsComponentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(913251333);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m11060getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ReactionsComponentPreview$lambda$15;
                    ReactionsComponentPreview$lambda$15 = ReactionsComponentKt.ReactionsComponentPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ReactionsComponentPreview$lambda$15;
                }
            });
        }
    }

    public static final void ReactionComponentSadTappedPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2092315616);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m11062getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ReactionComponentSadTappedPreview$lambda$16;
                    ReactionComponentSadTappedPreview$lambda$16 = ReactionsComponentKt.ReactionComponentSadTappedPreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ReactionComponentSadTappedPreview$lambda$16;
                }
            });
        }
    }

    public static final void ReactionComponentNeutralTappedPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(507405585);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m11064getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.helpcenter.articles.ReactionsComponentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ReactionComponentNeutralTappedPreview$lambda$17;
                    ReactionComponentNeutralTappedPreview$lambda$17 = ReactionsComponentKt.ReactionComponentNeutralTappedPreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ReactionComponentNeutralTappedPreview$lambda$17;
                }
            });
        }
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$0(State<Dp> state) {
        return state.getValue().m8415unboximpl();
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$1(State<Dp> state) {
        return state.getValue().m8415unboximpl();
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$2(State<Dp> state) {
        return state.getValue().m8415unboximpl();
    }
}
