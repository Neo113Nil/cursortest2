package io.intercom.android.sdk.survey.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.branch.referral.BranchError;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.survey.ui.components.validation.ValidationErrorComponentKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: QuestionHeaderComponent.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001aj\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0019"}, d2 = {"QuestionHeader", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "description", "Lio/intercom/android/sdk/ui/common/StringProvider;", "isRequired", "", "validationError", "Lio/intercom/android/sdk/survey/ValidationError;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "error", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "titleStringRes", "", "QuestionHeader-n1tc1qA", "(Ljava/util/List;Lio/intercom/android/sdk/ui/common/StringProvider;ZLio/intercom/android/sdk/survey/ValidationError;Landroidx/compose/ui/text/font/FontWeight;JLkotlin/jvm/functions/Function2;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "HeaderWithError", "(Landroidx/compose/runtime/Composer;I)V", "HeaderWithoutError", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QuestionHeaderComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderWithError$lambda$7(int i, Composer composer, int i2) {
        HeaderWithError(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HeaderWithoutError$lambda$9(int i, Composer composer, int i2) {
        HeaderWithoutError(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionHeader_n1tc1qA$lambda$6(List title, StringProvider stringProvider, boolean z, ValidationError validationError, FontWeight fontWeight, long j, Function2 function2, Integer num, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(validationError, "$validationError");
        Intrinsics.checkNotNullParameter(fontWeight, "$fontWeight");
        m11754QuestionHeadern1tc1qA(title, stringProvider, z, validationError, fontWeight, j, function2, num, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: QuestionHeader-n1tc1qA, reason: not valid java name */
    public static final void m11754QuestionHeadern1tc1qA(final List<Block.Builder> title, StringProvider stringProvider, final boolean z, final ValidationError validationError, final FontWeight fontWeight, final long j, Function2<? super Composer, ? super Integer, Unit> function2, Integer num, Composer composer, final int i, final int i2) {
        final StringProvider.ActualString actualString;
        int i3;
        Unit unit;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(validationError, "validationError");
        FontWeight fontWeight2 = fontWeight;
        Intrinsics.checkNotNullParameter(fontWeight2, "fontWeight");
        Composer startRestartGroup = composer.startRestartGroup(224116790);
        if ((i2 & 2) != 0) {
            actualString = new StringProvider.ActualString("");
            i3 = i & BranchError.ERR_BRANCH_NO_CONNECTIVITY;
        } else {
            actualString = stringProvider;
            i3 = i;
        }
        final Function2<? super Composer, ? super Integer, Unit> function22 = (i2 & 64) != 0 ? null : function2;
        final Integer num2 = (i2 & 128) != 0 ? null : num;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
        long m12162getError0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12162getError0d7_KjU();
        startRestartGroup.startReplaceGroup(788845668);
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.addAll(title);
        if (num2 != null) {
            num2.intValue();
            createListBuilder.add(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(StringResources_androidKt.stringResource(num2.intValue(), startRestartGroup, (i3 >> 21) & 14)));
        }
        List<Block.Builder> build = CollectionsKt.build(createListBuilder);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(build, 10));
        for (Block.Builder builder : build) {
            arrayList.add(builder.withText(builder.build().getText()).build());
        }
        int i4 = 0;
        for (Object obj : arrayList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Block block = (Block) obj;
            if (i4 == 0 && z) {
                startRestartGroup.startReplaceGroup(669360671);
                startRestartGroup.startReplaceGroup(-671143347);
                long m12174getPrimaryText0d7_KjU = validationError instanceof ValidationError.ValidationStringError ? m12162getError0d7_KjU : IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU();
                startRestartGroup.endReplaceGroup();
                String stringResource = StringResources_androidKt.stringResource(R.string.intercom_surveys_required_response, startRestartGroup, 0);
                Intrinsics.checkNotNull(block);
                BlockViewKt.BlockView(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, fontWeight2, 0L, null, null, null, 60, null), 14, null), false, new SuffixText(" *", stringResource, m12174getPrimaryText0d7_KjU, null), false, null, null, null, null, false, null, null, startRestartGroup, 64, 0, 4085);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(670259702);
                Intrinsics.checkNotNull(block);
                BlockViewKt.BlockView(null, new BlockRenderData(block, null, null, null, new BlockRenderTextStyle(j, fontWeight, 0L, null, null, null, 60, null), 14, null), false, null, false, null, null, null, null, false, null, null, startRestartGroup, 64, 0, 4093);
                startRestartGroup.endReplaceGroup();
            }
            fontWeight2 = fontWeight;
            i4 = i5;
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(788890949);
        if (validationError instanceof ValidationError.ValidationStringError) {
            startRestartGroup.startReplaceGroup(-1314135158);
            SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(4)), startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(788894911);
            if (function22 == null) {
                unit = null;
            } else {
                function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                unit = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            if (unit == null) {
                ValidationErrorComponentKt.m11762ValidationErrorComponentFNF3uiM(null, (ValidationError.ValidationStringError) validationError, m12162getError0d7_KjU, startRestartGroup, 64, 1);
            }
            startRestartGroup.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(788901884);
            int i6 = (i3 >> 3) & 14;
            boolean isBlank = StringsKt.isBlank(actualString.getText(startRestartGroup, StringProvider.$stable | i6));
            startRestartGroup.endReplaceGroup();
            if (!isBlank) {
                startRestartGroup.startReplaceGroup(-1313820446);
                SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(4)), startRestartGroup, 6);
                TextKt.m3581TextNvy7gAk(actualString.getText(startRestartGroup, i6 | StringProvider.$stable), null, Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, 0, 0, 131066);
                startRestartGroup.endReplaceGroup();
            }
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit QuestionHeader_n1tc1qA$lambda$6;
                    QuestionHeader_n1tc1qA$lambda$6 = QuestionHeaderComponentKt.QuestionHeader_n1tc1qA$lambda$6(title, actualString, z, validationError, fontWeight, j, function22, num2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return QuestionHeader_n1tc1qA$lambda$6;
                }
            });
        }
    }

    public static final void HeaderWithError(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(784176451);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            List listOf = CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?"));
            ValidationError.ValidationStringError validationStringError = new ValidationError.ValidationStringError(R.string.intercom_surveys_required_response, null, 2, null);
            ValidationError.ValidationStringError validationStringError2 = validationStringError;
            m11754QuestionHeadern1tc1qA(listOf, null, true, validationStringError2, FontWeight.INSTANCE.getNormal(), TextUnitKt.getSp(14), null, null, startRestartGroup, 225672, 194);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HeaderWithError$lambda$7;
                    HeaderWithError$lambda$7 = QuestionHeaderComponentKt.HeaderWithError$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HeaderWithError$lambda$7;
                }
            });
        }
    }

    public static final void HeaderWithoutError(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1382338223);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            List listOf = CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("How would your rate your experience?"));
            StringProvider.ActualString actualString = new StringProvider.ActualString("Please select a rating");
            ValidationError.NoValidationError noValidationError = ValidationError.NoValidationError.INSTANCE;
            long sp = TextUnitKt.getSp(16);
            m11754QuestionHeadern1tc1qA(listOf, actualString, true, noValidationError, FontWeight.INSTANCE.getNormal(), sp, null, null, startRestartGroup, (StringProvider.ActualString.$stable << 3) | 224648, 192);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HeaderWithoutError$lambda$9;
                    HeaderWithoutError$lambda$9 = QuestionHeaderComponentKt.HeaderWithoutError$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HeaderWithoutError$lambda$9;
                }
            });
        }
    }
}
