package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldImpl.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3 implements Function6<Float, Color, Color, Float, Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $border;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    TextFieldImplKt$CommonDecorationBox$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, String str, TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, TextFieldType textFieldType, Function2<? super Composer, ? super Integer, Unit> function25, boolean z3, PaddingValues paddingValues, boolean z4, Function2<? super Composer, ? super Integer, Unit> function26) {
        this.$label = function2;
        this.$placeholder = function22;
        this.$transformedText = str;
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$leadingIcon = function23;
        this.$trailingIcon = function24;
        this.$shape = shape;
        this.$type = textFieldType;
        this.$innerTextField = function25;
        this.$singleLine = z3;
        this.$contentPadding = paddingValues;
        this.$shouldOverrideTextStyleColor = z4;
        this.$border = function26;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer, Integer num) {
        m2225invokeRIQooxk(f.floatValue(), color.m5667unboximpl(), color2.m5667unboximpl(), f2.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-RIQooxk, reason: not valid java name */
    public final void m2225invokeRIQooxk(float f, long j, final long j2, final float f2, Composer composer, int i) {
        int i2;
        long j3;
        int i3;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        ComposableLambda composableLambda3;
        final float f3 = f;
        ComposerKt.sourceInformation(composer, "CN(labelProgress,labelTextStyleColor:c#ui.graphics.Color,labelContentColor:c#ui.graphics.Color,placeholderAlphaProgress)161@6500L53,167@6793L54,173@7111L24:TextFieldImpl.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (composer.changed(f3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j;
            i2 |= composer.changed(j3) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composer.changed(f2) ? 2048 : 1024;
        }
        int i4 = i2;
        if (!composer.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(33336375, i4, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:128)");
        }
        final Function2<Composer, Integer, Unit> function2 = this.$label;
        ComposableLambda composableLambda4 = null;
        if (function2 == null) {
            composer.startReplaceGroup(986681709);
            composer.endReplaceGroup();
            i3 = 54;
        } else {
            composer.startReplaceGroup(986681710);
            ComposerKt.sourceInformation(composer, "*130@5046L621");
            final boolean z = this.$shouldOverrideTextStyleColor;
            i3 = 54;
            final long j4 = j3;
            Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C133@5165L10,134@5233L10,142@5594L55:TextFieldImpl.kt#jmzs0o");
                    if (!composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(723429411, i5, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:131)");
                    }
                    TextStyle lerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer2, 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption(), f3);
                    boolean z2 = z;
                    long j5 = j4;
                    if (z2) {
                        lerp = TextStyle.m7848copyp1EtxEg$default(lerp, j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    }
                    TextFieldImplKt.m2224DecorationeuL9pac(j2, lerp, null, function2, composer2, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            };
            f3 = f3;
            composableLambda4 = ComposableLambdaKt.rememberComposableLambda(723429411, true, function22, composer, 54);
            composer.endReplaceGroup();
        }
        ComposableLambda composableLambda5 = composableLambda4;
        if (this.$placeholder != null && this.$transformedText.length() == 0 && f2 > 0.0f) {
            composer.startReplaceGroup(987666549);
            ComposerKt.sourceInformation(composer, "150@6042L394");
            final TextFieldColors textFieldColors = this.$colors;
            final boolean z2 = this.$enabled;
            final Function2<Composer, Integer, Unit> function23 = this.$placeholder;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-426706263, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer2, Integer num) {
                    invoke(modifier, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Modifier modifier, Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "CN(modifier)151@6076L342:TextFieldImpl.kt#jmzs0o");
                    if ((i5 & 6) == 0) {
                        i5 |= composer2.changed(modifier) ? 4 : 2;
                    }
                    if (!composer2.shouldExecute((i5 & 19) != 18, i5 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-426706263, i5, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:151)");
                    }
                    Modifier alpha = AlphaKt.alpha(modifier, f2);
                    TextFieldColors textFieldColors2 = textFieldColors;
                    boolean z3 = z2;
                    Function2<Composer, Integer, Unit> function24 = function23;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, alpha);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1083624968, "C153@6210L25,154@6298L10,152@6148L248:TextFieldImpl.kt#jmzs0o");
                    TextFieldImplKt.m2224DecorationeuL9pac(textFieldColors2.placeholderColor(z3, composer2, 0).getValue().m5667unboximpl(), MaterialTheme.INSTANCE.getTypography(composer2, 6).getSubtitle1(), null, function24, composer2, 0, 4);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, i3);
            composer.endReplaceGroup();
            composableLambda = rememberComposableLambda;
        } else {
            composer.startReplaceGroup(988093542);
            composer.endReplaceGroup();
            composableLambda = null;
        }
        final long m5667unboximpl = this.$colors.leadingIconColor(this.$enabled, this.$isError, this.$interactionSource, composer, 0).getValue().m5667unboximpl();
        final Function2<Composer, Integer, Unit> function24 = this.$leadingIcon;
        if (function24 == null) {
            composer.startReplaceGroup(988282301);
            composer.endReplaceGroup();
            composableLambda2 = null;
        } else {
            composer.startReplaceGroup(988282302);
            ComposerKt.sourceInformation(composer, "*164@6677L61");
            ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-317090443, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C164@6679L57:TextFieldImpl.kt#jmzs0o");
                    if (!composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-317090443, i5, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:164)");
                    }
                    TextFieldImplKt.m2224DecorationeuL9pac(m5667unboximpl, null, null, function24, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, i3);
            composer.endReplaceGroup();
            composableLambda2 = rememberComposableLambda2;
        }
        final long m5667unboximpl2 = this.$colors.trailingIconColor(this.$enabled, this.$isError, this.$interactionSource, composer, 0).getValue().m5667unboximpl();
        final Function2<Composer, Integer, Unit> function25 = this.$trailingIcon;
        if (function25 == null) {
            composer.startReplaceGroup(988575964);
            composer.endReplaceGroup();
            composableLambda3 = null;
        } else {
            composer.startReplaceGroup(988575965);
            ComposerKt.sourceInformation(composer, "*170@6973L62");
            ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(262889693, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C170@6975L58:TextFieldImpl.kt#jmzs0o");
                    if (!composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(262889693, i5, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:170)");
                    }
                    TextFieldImplKt.m2224DecorationeuL9pac(m5667unboximpl2, null, null, function25, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, i3);
            composer.endReplaceGroup();
            composableLambda3 = rememberComposableLambda3;
        }
        Modifier m261backgroundbw27NRU = BackgroundKt.m261backgroundbw27NRU(Modifier.INSTANCE, this.$colors.backgroundColor(this.$enabled, composer, 0).getValue().m5667unboximpl(), this.$shape);
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
        if (i5 == 1) {
            composer.startReplaceGroup(988856360);
            ComposerKt.sourceInformation(composer, "177@7227L483");
            TextFieldKt.TextFieldLayout(m261backgroundbw27NRU, this.$innerTextField, composableLambda5, composableLambda, composableLambda2, composableLambda3, this.$singleLine, f, this.$contentPadding, composer, (i4 << 21) & 29360128);
            composer.endReplaceGroup();
        } else {
            if (i5 != 2) {
                composer.startReplaceGroup(1971561250);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(989436742);
            ComposerKt.sourceInformation(composer, "191@7832L38,192@7928L287,209@8638L453,201@8233L1025");
            ComposerKt.sourceInformationMarkerStart(composer, 1971580701, "CC(remember):TextFieldImpl.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m5470boximpl(Size.INSTANCE.m5491getZeroNHjbRc()), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            final PaddingValues paddingValues = this.$contentPadding;
            final Function2<Composer, Integer, Unit> function26 = this.$border;
            ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-1107746014, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ComposerKt.sourceInformation(composer2, "C193@7950L247:TextFieldImpl.kt#jmzs0o");
                    if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1107746014, i6, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:193)");
                    }
                    Modifier m2091outlineCutout12SF9DM = OutlinedTextFieldKt.m2091outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, OutlinedTextFieldKt.BorderId), mutableState.getValue().m5487unboximpl(), paddingValues);
                    Function2<Composer, Integer, Unit> function27 = function26;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m2091outlineCutout12SF9DM);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1295987369, "C:TextFieldImpl.kt#jmzs0o");
                    if (function27 == null) {
                        composer2.startReplaceGroup(-1295979683);
                    } else {
                        composer2.startReplaceGroup(235288868);
                        ComposerKt.sourceInformation(composer2, "197@8167L8");
                        function27.invoke(composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, i3);
            Function2<Composer, Integer, Unit> function27 = this.$innerTextField;
            boolean z3 = this.$singleLine;
            ComposerKt.sourceInformationMarkerStart(composer, 1971606908, "CC(remember):TextFieldImpl.kt#9igjgp");
            boolean z4 = (i4 & 14) == 4;
            Object rememberedValue2 = composer.rememberedValue();
            if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke_RIQooxk$lambda$5$lambda$4;
                        invoke_RIQooxk$lambda$5$lambda$4 = TextFieldImplKt$CommonDecorationBox$3.invoke_RIQooxk$lambda$5$lambda$4(f3, mutableState, (Size) obj);
                        return invoke_RIQooxk$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextFieldLayout(m261backgroundbw27NRU, function27, composableLambda, composableLambda5, composableLambda2, composableLambda3, z3, f3, (Function1) rememberedValue2, rememberComposableLambda4, this.$contentPadding, composer, ((i4 << 21) & 29360128) | 805306368, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke_RIQooxk$lambda$5$lambda$4(float f, MutableState mutableState, Size size) {
        float intBitsToFloat = Float.intBitsToFloat((int) (size.m5487unboximpl() >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (size.m5487unboximpl() & 4294967295L)) * f;
        if (Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m5487unboximpl() >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m5487unboximpl() & 4294967295L)) != intBitsToFloat2) {
            mutableState.setValue(Size.m5470boximpl(Size.m5473constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L))));
        }
        return Unit.INSTANCE;
    }
}
