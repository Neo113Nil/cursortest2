package io.intercom.android.sdk.views.compose;

import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributeCollectorCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class AttributeCollectorCardKt$AttributeCollectorCard$2 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ List<Attribute> $attributes;
    final /* synthetic */ List<String> $failedAttributeIdentifiers;
    final /* synthetic */ boolean $isFormDisabled;
    final /* synthetic */ List<String> $loadingAttributeIdentifiers;
    final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;
    final /* synthetic */ String $partId;
    final /* synthetic */ Resources $resources;

    /* JADX WARN: Multi-variable type inference failed */
    AttributeCollectorCardKt$AttributeCollectorCard$2(List<Attribute> list, List<String> list2, Resources resources, List<String> list3, String str, boolean z, Function1<? super AttributeData, Unit> function1) {
        this.$attributes = list;
        this.$failedAttributeIdentifiers = list2;
        this.$resources = resources;
        this.$loadingAttributeIdentifiers = list3;
        this.$partId = str;
        this.$isFormDisabled = z;
        this.$onSubmitAttribute = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04ce, code lost:
    
        if (r1.equals("text") == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0511, code lost:
    
        if (r1.equals(io.intercom.android.sdk.models.AttributeType.NUMBER) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x046e, code lost:
    
        if (r1.equals("phone") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x048b, code lost:
    
        r13 = r3;
        r3 = r4;
        r4 = r28;
        r5 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0517, code lost:
    
        r6.startReplaceGroup(672066800);
        r6.startReplaceGroup(672076166);
        r14 = r1;
        r1 = r6.changed(r14);
        r7 = r6.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x052d, code lost:
    
        if (r1 != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0535, code lost:
    
        if (r7 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x053f, code lost:
    
        r6.endReplaceGroup();
        io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector(r3, r2, r4, (kotlin.jvm.functions.Function1) r7, r5, r6, 70, 0);
        r45 = r5;
        r6.endReplaceGroup();
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0537, code lost:
    
        r7 = new io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$AttributeCollectorCard$2$$ExternalSyntheticLambda1(r14);
        r6.updateRememberedValue(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0477, code lost:
    
        if (r1.equals("float") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0480, code lost:
    
        if (r1.equals("email") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0489, code lost:
    
        if (r1.equals(io.intercom.android.sdk.models.AttributeType.WEBSITE) != false) goto L94;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0460. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(ColumnScope IntercomCard, Composer composer, int i) {
        int size;
        String str;
        float f;
        Modifier modifier;
        boolean z;
        Function1<AttributeData, Unit> function1;
        final MutableState mutableState;
        boolean z2;
        String str2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
        if ((i & 81) != 16 || !composer2.getSkipping()) {
            float f2 = 24;
            Modifier m837padding3ABfNKs = PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2));
            List<Attribute> list = this.$attributes;
            List<String> list2 = this.$failedAttributeIdentifiers;
            Resources resources = this.$resources;
            List<String> list3 = this.$loadingAttributeIdentifiers;
            String str3 = this.$partId;
            boolean z3 = this.$isFormDisabled;
            Function1<AttributeData, Unit> function12 = this.$onSubmitAttribute;
            int i2 = 1341605231;
            String str4 = "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            String str5 = str3;
            String str6 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m837padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            boolean z4 = z3;
            Function1<AttributeData, Unit> function13 = function12;
            String str7 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            String str8 = "C89@4557L9:Column.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Iterator<Attribute> it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (!it.next().hasValue()) {
                    break;
                } else {
                    i3++;
                }
            }
            Integer valueOf = Integer.valueOf(i3);
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                size = valueOf.intValue();
            } else {
                size = list.size() - 1;
            }
            composer2.startReplaceGroup(1866899712);
            int i4 = size + 1;
            int i5 = 0;
            while (i5 < i4) {
                List<Attribute> list4 = list;
                Attribute attribute = list.get(i5);
                ComposerKt.sourceInformationMarkerStart(composer2, i2, str4);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str6);
                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                float f3 = f2;
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str7);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer2);
                Updater.m4983setimpl(m4976constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                }
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, str8);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                MutableState mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(new Object[0], new Function0() { // from class: io.intercom.android.sdk.views.compose.AttributeCollectorCardKt$AttributeCollectorCard$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState invoke$lambda$10$lambda$9$lambda$2;
                        invoke$lambda$10$lambda$9$lambda$2 = AttributeCollectorCardKt$AttributeCollectorCard$2.invoke$lambda$10$lambda$9$lambda$2();
                        return invoke$lambda$10$lambda$9$lambda$2;
                    }
                }, composer2, 56);
                if (list2.contains(attribute.getIdentifier())) {
                    str = resources.getString(R.string.intercom_something_went_wrong_try_again);
                } else {
                    str = "";
                }
                String str9 = str;
                Intrinsics.checkNotNull(str9);
                boolean contains = list3.contains(attribute.getIdentifier());
                composer2.startReplaceGroup(672001750);
                if (i5 > 0) {
                    SpacerKt.Spacer(SizeKt.m875height3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f3)), composer2, 6);
                }
                composer2.endReplaceGroup();
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str6);
                int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str7);
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
                Updater.m4983setimpl(m4976constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                    m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                    m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                }
                Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                List<String> list5 = list2;
                Resources resources2 = resources;
                List<String> list6 = list3;
                String str10 = str6;
                String str11 = str8;
                String str12 = str7;
                String str13 = str4;
                int i6 = i4;
                int i7 = i5;
                String str14 = str5;
                boolean z5 = z4;
                Function1<AttributeData, Unit> function14 = function13;
                TextKt.m3581TextNvy7gAk(list4.size() > 1 ? (i5 + 1) + ". " + attribute.getName() : attribute.getName(), RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 2, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer, 0, 24960, 110588);
                Composer composer3 = composer;
                composer3.startReplaceGroup(-86962638);
                if (i7 == 0 && list4.size() > 1) {
                    TextKt.m3581TextNvy7gAk("(" + i6 + " / " + list4.size() + ')', PaddingKt.m841paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8401constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), ColorResources_androidKt.colorResource(R.color.intercom_attribute_input_hint, composer3, 0), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer, 48, 0, 131064);
                    composer3 = composer;
                }
                composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                AttributeData attributeData = new AttributeData(attribute, str14, z5);
                float f4 = 12;
                Modifier m841paddingqDBjuR0$default = PaddingKt.m841paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8401constructorimpl(f4), 0.0f, 0.0f, 13, null);
                String renderType = attribute.getRenderType();
                switch (renderType.hashCode()) {
                    case -1034364087:
                        f = f4;
                        modifier = m841paddingqDBjuR0$default;
                        z = contains;
                        function1 = function14;
                        break;
                    case 3322014:
                        f = f4;
                        function1 = function14;
                        if (renderType.equals(AttributeType.LIST)) {
                            composer3.startReplaceGroup(672092489);
                            ListAttributeCollectorKt.ListAttributeCollector(m841paddingqDBjuR0$default, attributeData, str9.length() > 0, contains, function1, composer3, 70, 0);
                            composer3.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                            function14 = function1;
                            mutableState = mutableState2;
                            break;
                        }
                        function14 = function1;
                        mutableState = mutableState2;
                        composer3.startReplaceGroup(-639614028);
                        composer3.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        break;
                    case 3556653:
                        f = f4;
                        modifier = m841paddingqDBjuR0$default;
                        z = contains;
                        function1 = function14;
                        break;
                    case 64711720:
                        if (renderType.equals("boolean")) {
                            composer3.startReplaceGroup(672079756);
                            f = f4;
                            BooleanAttributeCollectorKt.BooleanAttributeCollector(m841paddingqDBjuR0$default, attributeData, str9.length() > 0, contains, function14, composer3, 70, 0);
                            composer3.endReplaceGroup();
                            Unit unit3 = Unit.INSTANCE;
                            mutableState = mutableState2;
                            break;
                        }
                        f = f4;
                        mutableState = mutableState2;
                        composer3.startReplaceGroup(-639614028);
                        composer3.endReplaceGroup();
                        Unit unit22 = Unit.INSTANCE;
                        break;
                    case 75849770:
                        break;
                    case 96619420:
                        break;
                    case 97526364:
                        break;
                    case 106642798:
                        break;
                    default:
                        f = f4;
                        mutableState = mutableState2;
                        composer3.startReplaceGroup(-639614028);
                        composer3.endReplaceGroup();
                        Unit unit222 = Unit.INSTANCE;
                        break;
                }
                composer3.startReplaceGroup(672105265);
                if (invoke$lambda$10$lambda$9$lambda$3(mutableState).length() <= 0 && str9.length() <= 0) {
                    str2 = str14;
                    z2 = z5;
                } else {
                    Modifier m841paddingqDBjuR0$default2 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8401constructorimpl(f), 0.0f, 0.0f, 13, null);
                    String invoke$lambda$10$lambda$9$lambda$3 = invoke$lambda$10$lambda$9$lambda$3(mutableState);
                    if (invoke$lambda$10$lambda$9$lambda$3.length() != 0) {
                        str9 = invoke$lambda$10$lambda$9$lambda$3;
                    }
                    z2 = z5;
                    str2 = str14;
                    TextKt.m3581TextNvy7gAk(str9, m841paddingqDBjuR0$default2, ColorResources_androidKt.colorResource(R.color.intercom_attribute_collector_error, composer3, 0), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 3, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer, 48, 24960, 110584);
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                i5 = i7 + 1;
                composer2 = composer;
                i2 = 1341605231;
                list2 = list5;
                resources = resources2;
                list3 = list6;
                str6 = str10;
                str8 = str11;
                str7 = str12;
                list = list4;
                str4 = str13;
                i4 = i6;
                z4 = z2;
                function13 = function14;
                f2 = f3;
                str5 = str2;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState invoke$lambda$10$lambda$9$lambda$2() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    private static final String invoke$lambda$10$lambda$9$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$7$lambda$6(MutableState validationError$delegate, String it) {
        Intrinsics.checkNotNullParameter(validationError$delegate, "$validationError$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        validationError$delegate.setValue(it);
        return Unit.INSTANCE;
    }
}
