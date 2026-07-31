package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleChoiceQuestion.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"SingleChoiceQuestion", "", "modifier", "Landroidx/compose/ui/Modifier;", "singleChoiceQuestionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$SingleChoiceQuestionModel;", "answer", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "onAnswer", "Lkotlin/Function1;", "colors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "questionHeader", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$SingleChoiceQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/survey/SurveyUiColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "getTranslatedOption", "", "unParsedOption", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "SingleChoiceQuestionPreviewLight", "(Landroidx/compose/runtime/Composer;I)V", "SingleChoiceQuestionPreviewDark", "SingleChoiceQuestionPreview", "surveyUiColors", "(Lio/intercom/android/sdk/survey/SurveyUiColors;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SingleChoiceQuestionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestion$lambda$9(Modifier modifier, SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, Function2 function2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(singleChoiceQuestionModel, "$singleChoiceQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        SingleChoiceQuestion(modifier, singleChoiceQuestionModel, answer, onAnswer, colors, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestionPreview$lambda$12(SurveyUiColors surveyUiColors, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(surveyUiColors, "$surveyUiColors");
        SingleChoiceQuestionPreview(surveyUiColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestionPreviewDark$lambda$11(int i, Composer composer, int i2) {
        SingleChoiceQuestionPreviewDark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestionPreviewLight$lambda$10(int i, Composer composer, int i2) {
        SingleChoiceQuestionPreviewLight(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SingleChoiceQuestion(Modifier modifier, final SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, Answer answer, final Function1<? super Answer, Unit> onAnswer, final SurveyUiColors colors, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(singleChoiceQuestionModel, "singleChoiceQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-538592394);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final Answer.NoAnswer.InitialNoAnswer initialNoAnswer = (i2 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        final Function2<? super Composer, ? super Integer, Unit> m11790getLambda1$intercom_sdk_base_release = (i2 & 32) != 0 ? ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m11790getLambda1$intercom_sdk_base_release() : function2;
        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localFocusManager);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final FocusManager focusManager = (FocusManager) consume;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        final Modifier modifier2 = companion;
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
        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(924114601);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
        Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        m11790getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i >> 15) & 14));
        startRestartGroup.startReplaceGroup(891864023);
        Iterator it = singleChoiceQuestionModel.getOptions().iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), startRestartGroup, 6);
            boolean z = (initialNoAnswer instanceof Answer.SingleAnswer) && Intrinsics.areEqual(((Answer.SingleAnswer) initialNoAnswer).getAnswer(), str);
            startRestartGroup.startReplaceGroup(891870284);
            long m12241getAccessibleColorOnWhiteBackground8_81llA = z ? ColorExtensionsKt.m12241getAccessibleColorOnWhiteBackground8_81llA(colors.m11686getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU();
            startRestartGroup.endReplaceGroup();
            long m5656copywmQWz5c$default = Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
            float m8401constructorimpl = Dp.m8401constructorimpl(1);
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            Composer composer3 = startRestartGroup;
            ChoicePillKt.m11781ChoicePillUdaoDFU(z, new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1;
                    SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1 = SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1(FocusManager.this, mutableState, onAnswer, str, (String) obj);
                    return SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1;
                }
            }, getTranslatedOption(str, startRestartGroup, 0), m5656copywmQWz5c$default, m8401constructorimpl, m12241getAccessibleColorOnWhiteBackground8_81llA, z ? companion3.getBold() : companion3.getNormal(), Color.m5656copywmQWz5c$default(ColorExtensionsKt.m12238generateTextColor8_81llA(m12241getAccessibleColorOnWhiteBackground8_81llA), DatePickerQuestionKt.contentAlpha(z, startRestartGroup, 0), 0.0f, 0.0f, 0.0f, 14, null), composer3, 24576, 0);
            it = it;
            startRestartGroup = composer3;
        }
        Composer composer4 = startRestartGroup;
        composer4.endReplaceGroup();
        composer4.startReplaceGroup(891905968);
        if (singleChoiceQuestionModel.getIncludeOther()) {
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), composer4, 6);
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            composer4.startReplaceGroup(891911980);
            long m12241getAccessibleColorOnWhiteBackground8_81llA2 = booleanValue ? ColorExtensionsKt.m12241getAccessibleColorOnWhiteBackground8_81llA(colors.m11686getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(composer4, IntercomTheme.$stable).m12152getBackground0d7_KjU();
            composer4.endReplaceGroup();
            long m12239getAccessibleBorderColor8_81llA = ColorExtensionsKt.m12239getAccessibleBorderColor8_81llA(m12241getAccessibleColorOnWhiteBackground8_81llA2);
            float m8401constructorimpl2 = Dp.m8401constructorimpl(booleanValue ? 2 : 1);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            FontWeight bold = booleanValue ? companion4.getBold() : companion4.getNormal();
            String answer2 = initialNoAnswer instanceof Answer.SingleAnswer ? ((Answer.SingleAnswer) initialNoAnswer).getAnswer() : "";
            composer4.startReplaceGroup(891929809);
            int i3 = (i & 7168) ^ 3072;
            boolean z2 = (i3 > 2048 && composer4.changed(onAnswer)) || (i & 3072) == 2048;
            Object rememberedValue2 = composer4.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3;
                        SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3 = SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(Function1.this, mutableState);
                        return SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3;
                    }
                };
                composer4.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            composer4.endReplaceGroup();
            composer4.startReplaceGroup(891936400);
            boolean z3 = (i3 > 2048 && composer4.changed(onAnswer)) || (i & 3072) == 2048;
            Object rememberedValue3 = composer4.rememberedValue();
            if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5;
                        SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5 = SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Function1.this, (String) obj);
                        return SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5;
                    }
                };
                composer4.updateRememberedValue(rememberedValue3);
            }
            composer4.endReplaceGroup();
            composer2 = composer4;
            OtherOptionKt.m11794OtherOptionYCJL08c(booleanValue, colors, answer2, function0, (Function1) rememberedValue3, m12239getAccessibleBorderColor8_81llA, m8401constructorimpl2, m12241getAccessibleColorOnWhiteBackground8_81llA2, bold, 0L, composer2, (i >> 9) & 112, 512);
        } else {
            composer2 = composer4;
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleChoiceQuestion$lambda$9;
                    SingleChoiceQuestion$lambda$9 = SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9(Modifier.this, singleChoiceQuestionModel, initialNoAnswer, onAnswer, colors, m11790getLambda1$intercom_sdk_base_release, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleChoiceQuestion$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1(FocusManager focusManager, MutableState otherOptionSelectionState, Function1 onAnswer, String unparsedOption, String it) {
        Intrinsics.checkNotNullParameter(focusManager, "$focusManager");
        Intrinsics.checkNotNullParameter(otherOptionSelectionState, "$otherOptionSelectionState");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(unparsedOption, "$unparsedOption");
        Intrinsics.checkNotNullParameter(it, "it");
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        otherOptionSelectionState.setValue(false);
        onAnswer.invoke(new Answer.SingleAnswer(unparsedOption));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(Function1 onAnswer, MutableState otherOptionSelectionState) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(otherOptionSelectionState, "$otherOptionSelectionState");
        onAnswer.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        otherOptionSelectionState.setValue(Boolean.valueOf(!((Boolean) otherOptionSelectionState.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Function1 onAnswer, String it) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(it, "it");
        onAnswer.invoke(new Answer.SingleAnswer(it));
        return Unit.INSTANCE;
    }

    private static final String getTranslatedOption(String str, Composer composer, int i) {
        composer.startReplaceGroup(-1189227411);
        if (Intrinsics.areEqual(str, "true")) {
            composer.startReplaceGroup(-1210053749);
            str = StringResources_androidKt.stringResource(R.string.intercom_attribute_collector_positive, composer, 0);
            composer.endReplaceGroup();
        } else if (Intrinsics.areEqual(str, "false")) {
            composer.startReplaceGroup(-1210051093);
            str = StringResources_androidKt.stringResource(R.string.intercom_attribute_collector_negative, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1210048586);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        return str;
    }

    public static final void SingleChoiceQuestionPreviewLight(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1626655857);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SingleChoiceQuestionPreview(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleChoiceQuestionPreviewLight$lambda$10;
                    SingleChoiceQuestionPreviewLight$lambda$10 = SingleChoiceQuestionKt.SingleChoiceQuestionPreviewLight$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleChoiceQuestionPreviewLight$lambda$10;
                }
            });
        }
    }

    public static final void SingleChoiceQuestionPreviewDark(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(567326043);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SingleChoiceQuestionPreview(SurveyUiColors.m11678copyqa9m3tE$default(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), 0L, 0L, Color.INSTANCE.m5684getBlue0d7_KjU(), 0L, null, 27, null), startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleChoiceQuestionPreviewDark$lambda$11;
                    SingleChoiceQuestionPreviewDark$lambda$11 = SingleChoiceQuestionKt.SingleChoiceQuestionPreviewDark$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleChoiceQuestionPreviewDark$lambda$11;
                }
            });
        }
    }

    public static final void SingleChoiceQuestionPreview(final SurveyUiColors surveyUiColors, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        Composer startRestartGroup = composer.startRestartGroup(1547860655);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(surveyUiColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(1452787289, true, new SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1(surveyUiColors), startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleChoiceQuestionPreview$lambda$12;
                    SingleChoiceQuestionPreview$lambda$12 = SingleChoiceQuestionKt.SingleChoiceQuestionPreview$lambda$12(SurveyUiColors.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleChoiceQuestionPreview$lambda$12;
                }
            });
        }
    }
}
