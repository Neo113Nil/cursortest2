package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import android.content.res.Configuration;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import io.ably.lib.transport.Defaults;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: NumericRatingQuestion.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"NumericRatingQuestion", "", "modifier", "Landroidx/compose/ui/Modifier;", "numericRatingQuestionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel;", "answer", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "onAnswer", "Lkotlin/Function1;", "colors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "questionHeader", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/survey/SurveyUiColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "NPSQuestionPreview", "(Landroidx/compose/runtime/Composer;I)V", "StarQuestionPreview", "EmojiRatingQuestionPreview", "GeneratePreview", "start", "", "end", "questionSubType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;", "(IILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;Lio/intercom/android/sdk/survey/ui/models/Answer;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NumericRatingQuestionKt {

    /* compiled from: NumericRatingQuestion.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionData.QuestionSubType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.NPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.UNSUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.STARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiRatingQuestionPreview$lambda$16(int i, Composer composer, int i2) {
        EmojiRatingQuestionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GeneratePreview$lambda$17(int i, int i2, SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, Answer answer, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(questionSubType, "$questionSubType");
        Intrinsics.checkNotNullParameter(answer, "$answer");
        GeneratePreview(i, i2, questionSubType, answer, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NPSQuestionPreview$lambda$14(int i, Composer composer, int i2) {
        NPSQuestionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumericRatingQuestion$lambda$13(Modifier modifier, SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel, Answer answer, Function1 onAnswer, SurveyUiColors colors, Function2 function2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(numericRatingQuestionModel, "$numericRatingQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(colors, "$colors");
        NumericRatingQuestion(modifier, numericRatingQuestionModel, answer, onAnswer, colors, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StarQuestionPreview$lambda$15(int i, Composer composer, int i2) {
        StarQuestionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0608, code lost:
    
        if (r14.changed(r1) == false) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NumericRatingQuestion(Modifier modifier, final SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel, Answer answer, Function1<? super Answer, Unit> function1, final SurveyUiColors surveyUiColors, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        String str;
        String str2;
        Function1<? super Answer, Unit> function12;
        Answer answer2;
        String str3;
        String str4;
        int i3;
        final Function1<? super Answer, Unit> function13;
        boolean z;
        boolean changed;
        Object rememberedValue;
        Composer composer2;
        int i4;
        List listOf;
        String str5;
        float m8401constructorimpl;
        final Function1<? super Answer, Unit> onAnswer = function1;
        Intrinsics.checkNotNullParameter(numericRatingQuestionModel, "numericRatingQuestionModel");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        SurveyUiColors colors = surveyUiColors;
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1325570147);
        Modifier modifier3 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Answer answer3 = (i2 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        Function2<? super Composer, ? super Integer, Unit> m11832getLambda1$intercom_sdk_base_release = (i2 & 32) != 0 ? ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m11832getLambda1$intercom_sdk_base_release() : function2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        String str6 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        String str7 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
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
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
        m11832getLambda1$intercom_sdk_base_release.invoke(startRestartGroup, Integer.valueOf((i >> 15) & 14));
        SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), startRestartGroup, 6);
        int i5 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
        String str8 = "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption";
        String str9 = "C101@5233L9:Row.kt#2w3rfo";
        int i6 = 8;
        String str10 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            modifier2 = modifier3;
            function22 = m11832getLambda1$intercom_sdk_base_release;
            String str11 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            int i7 = 1;
            String str12 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
            String str13 = "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption";
            str = "C101@5233L9:Row.kt#2w3rfo";
            str2 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
            Object obj = null;
            float f = 0.0f;
            startRestartGroup.startReplaceGroup(122317043);
            int size = numericRatingQuestionModel.getOptions().size();
            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Composer composer3 = startRestartGroup;
            for (List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> list : CollectionsKt.chunked(numericRatingQuestionModel.getOptions(), (int) Math.ceil(size / ((int) Math.ceil(r10 / ((((Configuration) consume).screenWidthDp - 60) / 60)))))) {
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i7, obj);
                Arrangement.Horizontal center = Arrangement.Absolute.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer3, 844473419, str2);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer3, 6);
                String str14 = str12;
                ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, str14);
                int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                String str15 = str11;
                ComposerKt.sourceInformationMarkerStart(composer3, -553112988, str15);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                Composer m4976constructorimpl3 = Updater.m4976constructorimpl(composer3);
                Updater.m4983setimpl(m4976constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                    m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                    m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                }
                Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, str);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer3.startReplaceGroup(268602155);
                Composer composer4 = composer3;
                for (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption : list) {
                    Intrinsics.checkNotNull(ratingOption, str13);
                    final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) ratingOption;
                    int i8 = ((answer3 instanceof Answer.SingleAnswer) && Intrinsics.areEqual(((Answer.SingleAnswer) answer3).getAnswer(), String.valueOf(numericRatingOption.getValue()))) ? i7 : 0;
                    composer4.startReplaceGroup(268611605);
                    long m12241getAccessibleColorOnWhiteBackground8_81llA = i8 != 0 ? ColorExtensionsKt.m12241getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors.m11686getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(composer4, IntercomTheme.$stable).m12152getBackground0d7_KjU();
                    composer4.endReplaceGroup();
                    String str16 = str14;
                    long m12239getAccessibleBorderColor8_81llA = ColorExtensionsKt.m12239getAccessibleBorderColor8_81llA(m12241getAccessibleColorOnWhiteBackground8_81llA);
                    float m8401constructorimpl2 = i8 != 0 ? Dp.m8401constructorimpl(2) : Dp.m8401constructorimpl(i7);
                    FontWeight bold = i8 != 0 ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal();
                    String valueOf = String.valueOf(numericRatingOption.getValue());
                    String str17 = str13;
                    Answer answer4 = answer3;
                    float f2 = m8401constructorimpl2;
                    Modifier m837padding3ABfNKs = PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(4));
                    composer4.startReplaceGroup(-1805377699);
                    if (((i & 7168) ^ 3072) > 2048) {
                        function13 = function1;
                    } else {
                        function13 = function1;
                    }
                    if ((i & 3072) != 2048) {
                        z = false;
                        changed = z | composer4.changed(numericRatingOption);
                        rememberedValue = composer4.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0;
                                    NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0 = NumericRatingQuestionKt.NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(Function1.this, numericRatingOption);
                                    return NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0;
                                }
                            };
                            composer4.updateRememberedValue(rememberedValue);
                        }
                        composer4.endReplaceGroup();
                        Composer composer5 = composer4;
                        NumericRatingCellKt.m11837NumericRatingCelljWvj134(valueOf, ClickableKt.m303clickableoSLSa3U$default(m837padding3ABfNKs, false, null, null, null, (Function0) rememberedValue, 15, null), m12239getAccessibleBorderColor8_81llA, f2, m12241getAccessibleColorOnWhiteBackground8_81llA, bold, 0L, 0L, composer5, 0, 192);
                        str14 = str16;
                        composer4 = composer5;
                        str13 = str17;
                        answer3 = answer4;
                        i7 = 1;
                    }
                    z = true;
                    changed = z | composer4.changed(numericRatingOption);
                    rememberedValue = composer4.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0;
                            NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0 = NumericRatingQuestionKt.NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(Function1.this, numericRatingOption);
                            return NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue);
                    composer4.endReplaceGroup();
                    Composer composer52 = composer4;
                    NumericRatingCellKt.m11837NumericRatingCelljWvj134(valueOf, ClickableKt.m303clickableoSLSa3U$default(m837padding3ABfNKs, false, null, null, null, (Function0) rememberedValue, 15, null), m12239getAccessibleBorderColor8_81llA, f2, m12241getAccessibleColorOnWhiteBackground8_81llA, bold, 0L, 0L, composer52, 0, 192);
                    str14 = str16;
                    composer4 = composer52;
                    str13 = str17;
                    answer3 = answer4;
                    i7 = 1;
                }
                composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                str11 = str15;
                str12 = str14;
                str13 = str13;
                answer3 = answer3;
                obj = null;
                i7 = 1;
                f = 0.0f;
                composer3 = composer4;
            }
            function12 = function1;
            answer2 = answer3;
            str3 = str11;
            str4 = str12;
            i3 = 6;
            composer3.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composer2 = composer3;
        } else {
            if (i5 == 4) {
                startRestartGroup.startReplaceGroup(124701005);
                modifier2 = modifier3;
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4976constructorimpl4 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl4.getInserting() || !Intrinsics.areEqual(m4976constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
                    m4976constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
                    m4976constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
                }
                Updater.m4983setimpl(m4976constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-1421319679);
                Iterator it = numericRatingQuestionModel.getOptions().iterator();
                while (it.hasNext()) {
                    SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption2 = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption) it.next();
                    Intrinsics.checkNotNull(ratingOption2, str8);
                    final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption2 = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) ratingOption2;
                    boolean z2 = (answer3 instanceof Answer.SingleAnswer) && numericRatingOption2.getValue() <= Integer.parseInt(((Answer.SingleAnswer) answer3).getAnswer());
                    startRestartGroup.startReplaceGroup(-1421310346);
                    long m12241getAccessibleColorOnWhiteBackground8_81llA2 = z2 ? ColorExtensionsKt.m12241getAccessibleColorOnWhiteBackground8_81llA(colors.m11686getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12152getBackground0d7_KjU();
                    startRestartGroup.endReplaceGroup();
                    String str18 = str9;
                    long m12239getAccessibleBorderColor8_81llA2 = ColorExtensionsKt.m12239getAccessibleBorderColor8_81llA(m12241getAccessibleColorOnWhiteBackground8_81llA2);
                    if (z2) {
                        str5 = str18;
                        m8401constructorimpl = Dp.m8401constructorimpl(2);
                    } else {
                        str5 = str18;
                        m8401constructorimpl = Dp.m8401constructorimpl(1);
                    }
                    Iterator it2 = it;
                    float f3 = 44;
                    Modifier m837padding3ABfNKs2 = PaddingKt.m837padding3ABfNKs(SizeKt.m875height3ABfNKs(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f3)), Dp.m8401constructorimpl(f3)), Dp.m8401constructorimpl(i6));
                    startRestartGroup.startReplaceGroup(268698463);
                    boolean changed2 = startRestartGroup.changed(numericRatingOption2) | ((((i & 7168) ^ 3072) > 2048 && startRestartGroup.changed(onAnswer)) || (i & 3072) == 2048);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5;
                                NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5 = NumericRatingQuestionKt.NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5(SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption.this, onAnswer);
                                return NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    StarRatingKt.m11844StarRatingtAjK0ZQ(ClickableKt.m303clickableoSLSa3U$default(m837padding3ABfNKs2, false, null, null, null, (Function0) rememberedValue2, 15, null), m12241getAccessibleColorOnWhiteBackground8_81llA2, m8401constructorimpl, m12239getAccessibleBorderColor8_81llA2, startRestartGroup, 0, 0);
                    onAnswer = function1;
                    str8 = str8;
                    str9 = str5;
                    str10 = str10;
                    it = it2;
                    m11832getLambda1$intercom_sdk_base_release = m11832getLambda1$intercom_sdk_base_release;
                    str7 = str7;
                    str6 = str6;
                    i6 = 8;
                    colors = surveyUiColors;
                }
                function22 = m11832getLambda1$intercom_sdk_base_release;
                str = str9;
                str2 = str10;
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
                function12 = function1;
                answer2 = answer3;
                str3 = str7;
                str4 = str6;
            } else {
                if (i5 != 5) {
                    startRestartGroup.startReplaceGroup(3944735);
                    startRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(126368681);
                List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options = numericRatingQuestionModel.getOptions();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
                for (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption3 : options) {
                    Intrinsics.checkNotNull(ratingOption3, "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption");
                    arrayList.add((SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption) ratingOption3);
                }
                int i9 = i >> 3;
                EmojiQuestionKt.EmojiQuestion(arrayList, answer3, onAnswer, startRestartGroup, (i9 & 896) | (i9 & 112) | 8);
                startRestartGroup.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
                modifier2 = modifier3;
                answer2 = answer3;
                function12 = onAnswer;
                function22 = m11832getLambda1$intercom_sdk_base_release;
                str3 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                str4 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                str = "C101@5233L9:Row.kt#2w3rfo";
                str2 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
            }
            i3 = 6;
            composer2 = startRestartGroup;
        }
        composer2.startReplaceGroup(4087291);
        Composer composer6 = composer2;
        if ((!StringsKt.isBlank(numericRatingQuestionModel.getLowerLabel())) & (!StringsKt.isBlank(numericRatingQuestionModel.getUpperLabel()))) {
            Modifier m837padding3ABfNKs3 = PaddingKt.m837padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(8));
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer2, 844473419, str2);
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, i3);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str4);
            int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, m837padding3ABfNKs3);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str3);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer m4976constructorimpl5 = Updater.m4976constructorimpl(composer2);
            Updater.m4983setimpl(m4976constructorimpl5, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl5.getInserting() || !Intrinsics.areEqual(m4976constructorimpl5.rememberedValue(), Integer.valueOf(hashCode5))) {
                m4976constructorimpl5.updateRememberedValue(Integer.valueOf(hashCode5));
                m4976constructorimpl5.apply(Integer.valueOf(hashCode5), setCompositeKeyHash5);
            }
            Updater.m4983setimpl(m4976constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, str);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            if (numericRatingQuestionModel.getQuestionSubType() == SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI) {
                listOf = CollectionsKt.listOf((Object[]) new String[]{numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getUpperLabel()});
                i4 = 1;
            } else {
                i4 = 1;
                listOf = CollectionsKt.listOf((Object[]) new String[]{numericRatingQuestionModel.getScaleStart() + " - " + numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getScaleEnd() + " - " + numericRatingQuestionModel.getUpperLabel()});
            }
            String str19 = (String) listOf.get(0);
            String str20 = (String) listOf.get(i4);
            Composer composer7 = composer2;
            TextKt.m3581TextNvy7gAk(str19, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 0, 0, 262142);
            TextKt.m3581TextNvy7gAk(str20, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer7, 0, 0, 262142);
            Composer composer8 = composer7;
            ComposerKt.sourceInformationMarkerEnd(composer8);
            composer8.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            ComposerKt.sourceInformationMarkerEnd(composer8);
            composer6 = composer8;
        }
        composer6.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        composer6.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        composer6.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ComposerKt.sourceInformationMarkerEnd(composer6);
        ScopeUpdateScope endRestartGroup = composer6.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1<? super Answer, Unit> function14 = function12;
            final Modifier modifier4 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
            final Answer answer5 = answer2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit NumericRatingQuestion$lambda$13;
                    NumericRatingQuestion$lambda$13 = NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(Modifier.this, numericRatingQuestionModel, answer5, function14, surveyUiColors, function23, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return NumericRatingQuestion$lambda$13;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(Function1 onAnswer, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption option) {
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        Intrinsics.checkNotNullParameter(option, "$option");
        onAnswer.invoke(new Answer.SingleAnswer(String.valueOf(option.getValue())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5(SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption currentRating, Function1 onAnswer) {
        Intrinsics.checkNotNullParameter(currentRating, "$currentRating");
        Intrinsics.checkNotNullParameter(onAnswer, "$onAnswer");
        onAnswer.invoke(new Answer.SingleAnswer(String.valueOf(currentRating.getValue())));
        return Unit.INSTANCE;
    }

    public static final void NPSQuestionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-752808306);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            GeneratePreview(0, 10, SurveyData.Step.Question.QuestionData.QuestionSubType.NPS, new Answer.SingleAnswer(Defaults.ABLY_PROTOCOL_VERSION), startRestartGroup, 438);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NPSQuestionPreview$lambda$14;
                    NPSQuestionPreview$lambda$14 = NumericRatingQuestionKt.NPSQuestionPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return NPSQuestionPreview$lambda$14;
                }
            });
        }
    }

    public static final void StarQuestionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1791167217);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.STARS, new Answer.MultipleAnswer(SetsKt.setOf((Object[]) new String[]{"1", ExifInterface.GPS_MEASUREMENT_2D}), null, 2, null), startRestartGroup, 4534);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit StarQuestionPreview$lambda$15;
                    StarQuestionPreview$lambda$15 = NumericRatingQuestionKt.StarQuestionPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                    return StarQuestionPreview$lambda$15;
                }
            });
        }
    }

    public static final void EmojiRatingQuestionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1678291132);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI, new Answer.SingleAnswer(Defaults.ABLY_PROTOCOL_VERSION), startRestartGroup, 438);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmojiRatingQuestionPreview$lambda$16;
                    EmojiRatingQuestionPreview$lambda$16 = NumericRatingQuestionKt.EmojiRatingQuestionPreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmojiRatingQuestionPreview$lambda$16;
                }
            });
        }
    }

    private static final void GeneratePreview(final int i, final int i2, final SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, final Answer answer, Composer composer, final int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1397971036);
        if ((i3 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= startRestartGroup.changed(questionSubType) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= startRestartGroup.changed(answer) ? 2048 : 1024;
        }
        if ((i4 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableLambdaKt.rememberComposableLambda(-2103292486, true, new NumericRatingQuestionKt$GeneratePreview$1(questionSubType, i, i2, answer), startRestartGroup, 54), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GeneratePreview$lambda$17;
                    GeneratePreview$lambda$17 = NumericRatingQuestionKt.GeneratePreview$lambda$17(i, i2, questionSubType, answer, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return GeneratePreview$lambda$17;
                }
            });
        }
    }
}
