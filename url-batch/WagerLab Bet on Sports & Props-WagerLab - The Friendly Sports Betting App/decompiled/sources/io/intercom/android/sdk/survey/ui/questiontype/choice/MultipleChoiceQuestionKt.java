package io.intercom.android.sdk.survey.ui.questiontype.choice;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultipleChoiceQuestion.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"MultipleChoiceQuestion", "", "modifier", "Landroidx/compose/ui/Modifier;", "multipleChoiceQuestionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$MultipleChoiceQuestionModel;", "answer", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "onAnswer", "Lkotlin/Function1;", "colors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "questionHeader", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$MultipleChoiceQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/survey/SurveyUiColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "MultipleChoiceQuestionPreview", "(Landroidx/compose/runtime/Composer;I)V", "MultipleChoiceQuestionPreviewDark", "PreviewQuestion", "surveyUiColors", "(Lio/intercom/android/sdk/survey/SurveyUiColors;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MultipleChoiceQuestionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestion$lambda$9(Modifier modifier, SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, Function2 function2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(multipleChoiceQuestionModel, "$multipleChoiceQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        MultipleChoiceQuestion(modifier, multipleChoiceQuestionModel, answer, onAnswer, colors, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestionPreview$lambda$10(int i, Composer composer, int i2) {
        MultipleChoiceQuestionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestionPreviewDark$lambda$11(int i, Composer composer, int i2) {
        MultipleChoiceQuestionPreviewDark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewQuestion$lambda$12(SurveyUiColors surveyUiColors, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(surveyUiColors, "$surveyUiColors");
        PreviewQuestion(surveyUiColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MultipleChoiceQuestion(Modifier modifier, final SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel, Answer answer, final Function1<? super Answer, Unit> onAnswer, final SurveyUiColors colors, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Composer composer2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        Object rememberedValue;
        boolean z4;
        Object rememberedValue2;
        Intrinsics.checkNotNullParameter(multipleChoiceQuestionModel, "multipleChoiceQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(928787358);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final Answer.NoAnswer.InitialNoAnswer initialNoAnswer = (i2 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        final Function2<? super Composer, ? super Integer, Unit> m11786getLambda1$intercom_sdk_base_release = (i2 & 32) != 0 ? ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m11786getLambda1$intercom_sdk_base_release() : function2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        boolean z5 = false;
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
        m11786getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i >> 15) & 14));
        startRestartGroup.startReplaceGroup(1187769308);
        for (final String str : multipleChoiceQuestionModel.getOptions()) {
            boolean contains = initialNoAnswer instanceof Answer.MultipleAnswer ? ((Answer.MultipleAnswer) initialNoAnswer).m11764getAnswers().contains(str) : false;
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(1187778356);
            long m12241getAccessibleColorOnWhiteBackground8_81llA = contains ? ColorExtensionsKt.m12241getAccessibleColorOnWhiteBackground8_81llA(colors.m11686getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU();
            startRestartGroup.endReplaceGroup();
            long m12239getAccessibleBorderColor8_81llA = ColorExtensionsKt.m12239getAccessibleBorderColor8_81llA(m12241getAccessibleColorOnWhiteBackground8_81llA);
            float m8401constructorimpl = Dp.m8401constructorimpl(contains ? 2 : 1);
            FontWeight.Companion companion3 = FontWeight.INSTANCE;
            FontWeight bold = contains ? companion3.getBold() : companion3.getNormal();
            startRestartGroup.startReplaceGroup(-1655251098);
            Modifier modifier2 = companion;
            boolean changed = ((((i & 896) ^ 384) > 256 && startRestartGroup.changed(initialNoAnswer)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && startRestartGroup.changed(onAnswer)) || (i & 3072) == 2048) | startRestartGroup.changed(str);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0;
                        MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0 = MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(Answer.this, onAnswer, str, (String) obj);
                        return MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            Composer composer3 = startRestartGroup;
            ChoicePillKt.m11781ChoicePillUdaoDFU(contains, (Function1) rememberedValue3, str, m12239getAccessibleBorderColor8_81llA, m8401constructorimpl, m12241getAccessibleColorOnWhiteBackground8_81llA, bold, 0L, composer3, 0, 128);
            z5 = false;
            startRestartGroup = composer3;
            companion = modifier2;
        }
        final Modifier modifier3 = companion;
        Composer composer4 = startRestartGroup;
        boolean z6 = z5;
        composer4.endReplaceGroup();
        composer4.startReplaceGroup(1187812115);
        if (multipleChoiceQuestionModel.getIncludeOther()) {
            boolean z7 = initialNoAnswer instanceof Answer.MultipleAnswer;
            final boolean z8 = (!z7 || Intrinsics.areEqual(((Answer.MultipleAnswer) initialNoAnswer).getOtherAnswer(), Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE)) ? z6 : true;
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), composer4, 6);
            composer4.startReplaceGroup(1187840539);
            long m12241getAccessibleColorOnWhiteBackground8_81llA2 = z8 ? ColorExtensionsKt.m12241getAccessibleColorOnWhiteBackground8_81llA(colors.m11686getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(composer4, IntercomTheme.$stable).m12152getBackground0d7_KjU();
            composer4.endReplaceGroup();
            long m12239getAccessibleBorderColor8_81llA2 = ColorExtensionsKt.m12239getAccessibleBorderColor8_81llA(m12241getAccessibleColorOnWhiteBackground8_81llA2);
            float m8401constructorimpl2 = z8 ? Dp.m8401constructorimpl(2) : Dp.m8401constructorimpl(1);
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            FontWeight bold2 = z8 ? companion4.getBold() : companion4.getNormal();
            String otherAnswer = z7 ? ((Answer.MultipleAnswer) initialNoAnswer).getOtherAnswer().toString() : "";
            composer4.startReplaceGroup(1187859972);
            int i6 = (i & 896) ^ 384;
            boolean changed2 = composer4.changed(z8) | ((i6 > 256 && composer4.changed(initialNoAnswer)) || (i & 384) == 256);
            int i7 = (i & 7168) ^ 3072;
            if (i7 <= 2048 || !composer4.changed(onAnswer)) {
                z = changed2;
                if ((i & 3072) != 2048) {
                    z2 = false;
                    z3 = z | z2;
                    rememberedValue = composer4.rememberedValue();
                    if (!z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3;
                                MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3 = MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z8, initialNoAnswer, onAnswer);
                                return MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3;
                            }
                        };
                        composer4.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    composer4.endReplaceGroup();
                    composer4.startReplaceGroup(1187870912);
                    z4 = ((i6 <= 256 && composer4.changed(initialNoAnswer)) || (i & 384) == 256) | ((i7 <= 2048 && composer4.changed(onAnswer)) || (i & 3072) == 2048);
                    rememberedValue2 = composer4.rememberedValue();
                    if (!z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5;
                                MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5 = MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Answer.this, onAnswer, (String) obj);
                                return MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5;
                            }
                        };
                        composer4.updateRememberedValue(rememberedValue2);
                    }
                    composer4.endReplaceGroup();
                    i3 = 6;
                    i4 = 8;
                    String str2 = otherAnswer;
                    i5 = 1;
                    OtherOptionKt.m11794OtherOptionYCJL08c(z8, colors, str2, function0, (Function1) rememberedValue2, m12239getAccessibleBorderColor8_81llA2, m8401constructorimpl2, m12241getAccessibleColorOnWhiteBackground8_81llA2, bold2, 0L, composer4, (i >> 9) & 112, 512);
                    composer2 = composer4;
                }
            } else {
                z = changed2;
            }
            z2 = true;
            z3 = z | z2;
            rememberedValue = composer4.rememberedValue();
            if (!z3) {
            }
            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3;
                    MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3 = MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z8, initialNoAnswer, onAnswer);
                    return MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3;
                }
            };
            composer4.updateRememberedValue(rememberedValue);
            Function0 function02 = (Function0) rememberedValue;
            composer4.endReplaceGroup();
            composer4.startReplaceGroup(1187870912);
            z4 = ((i6 <= 256 && composer4.changed(initialNoAnswer)) || (i & 384) == 256) | ((i7 <= 2048 && composer4.changed(onAnswer)) || (i & 3072) == 2048);
            rememberedValue2 = composer4.rememberedValue();
            if (!z4) {
            }
            rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5;
                    MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5 = MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Answer.this, onAnswer, (String) obj);
                    return MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5;
                }
            };
            composer4.updateRememberedValue(rememberedValue2);
            composer4.endReplaceGroup();
            i3 = 6;
            i4 = 8;
            String str22 = otherAnswer;
            i5 = 1;
            OtherOptionKt.m11794OtherOptionYCJL08c(z8, colors, str22, function02, (Function1) rememberedValue2, m12239getAccessibleBorderColor8_81llA2, m8401constructorimpl2, m12241getAccessibleColorOnWhiteBackground8_81llA2, bold2, 0L, composer4, (i >> 9) & 112, 512);
            composer2 = composer4;
        } else {
            composer2 = composer4;
            i3 = 6;
            i4 = 8;
            i5 = 1;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1187882858);
        if (multipleChoiceQuestionModel.getMinSelection() > i5) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Phrase from = Phrase.from((Context) consume, R.string.intercom_surveys_multi_select_too_few_responses);
            from.put("response_count", multipleChoiceQuestionModel.getMinSelection());
            Composer composer5 = composer2;
            TextKt.m3581TextNvy7gAk(from.format().toString(), PaddingKt.m841paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8401constructorimpl(i4), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5687getGray0d7_KjU(), null, TextUnitKt.getSp(11), null, FontWeight.INSTANCE.getNormal(), null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType05(), composer5, 1597872, 0, 130984);
            composer2 = composer5;
        }
        composer2.endReplaceGroup();
        SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(i4)), composer2, i3);
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
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MultipleChoiceQuestion$lambda$9;
                    MultipleChoiceQuestion$lambda$9 = MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(Modifier.this, multipleChoiceQuestionModel, initialNoAnswer, onAnswer, colors, m11786getLambda1$intercom_sdk_base_release, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MultipleChoiceQuestion$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(Answer answer, Function1 onAnswer, String option, String it) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(option, "$option");
        Intrinsics.checkNotNullParameter(it, "it");
        if (answer instanceof Answer.MultipleAnswer) {
            onAnswer.invoke(((Answer.MultipleAnswer) answer).copyWithAnswerToggled(option));
        } else {
            onAnswer.invoke(new Answer.MultipleAnswer(SetsKt.setOf(option), null, 2, null));
        }
        return Unit.INSTANCE;
    }

    private static final void MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(Answer answer, Function1<? super Answer, Unit> function1, Answer.MultipleAnswer.OtherAnswer otherAnswer) {
        if (answer instanceof Answer.MultipleAnswer) {
            function1.invoke(((Answer.MultipleAnswer) answer).copyWithOther(otherAnswer));
        } else {
            function1.invoke(new Answer.MultipleAnswer(SetsKt.emptySet(), otherAnswer));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(boolean z, Answer answer, Function1 onAnswer) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        if (!z) {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, onAnswer, Answer.MultipleAnswer.OtherAnswer.SelectedNoText.INSTANCE);
        } else {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, onAnswer, Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Answer answer, Function1 onAnswer, String it) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(it, "it");
        MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, onAnswer, new Answer.MultipleAnswer.OtherAnswer.SelectedWithText(it));
        return Unit.INSTANCE;
    }

    public static final void MultipleChoiceQuestionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1537454351);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            PreviewQuestion(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MultipleChoiceQuestionPreview$lambda$10;
                    MultipleChoiceQuestionPreview$lambda$10 = MultipleChoiceQuestionKt.MultipleChoiceQuestionPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MultipleChoiceQuestionPreview$lambda$10;
                }
            });
        }
    }

    public static final void MultipleChoiceQuestionPreviewDark(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(756027931);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            PreviewQuestion(SurveyUiColors.m11678copyqa9m3tE$default(SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), 0L, 0L, Color.INSTANCE.m5684getBlue0d7_KjU(), 0L, null, 27, null), startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MultipleChoiceQuestionPreviewDark$lambda$11;
                    MultipleChoiceQuestionPreviewDark$lambda$11 = MultipleChoiceQuestionKt.MultipleChoiceQuestionPreviewDark$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MultipleChoiceQuestionPreviewDark$lambda$11;
                }
            });
        }
    }

    public static final void PreviewQuestion(final SurveyUiColors surveyUiColors, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        Composer startRestartGroup = composer.startRestartGroup(-1753720526);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(surveyUiColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-245477028, true, new MultipleChoiceQuestionKt$PreviewQuestion$1(surveyUiColors), startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewQuestion$lambda$12;
                    PreviewQuestion$lambda$12 = MultipleChoiceQuestionKt.PreviewQuestion$lambda$12(SurveyUiColors.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewQuestion$lambda$12;
                }
            });
        }
    }
}
