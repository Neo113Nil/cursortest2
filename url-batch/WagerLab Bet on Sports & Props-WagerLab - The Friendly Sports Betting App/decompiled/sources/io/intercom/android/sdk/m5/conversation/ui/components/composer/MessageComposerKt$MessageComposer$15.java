package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MessageComposer.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class MessageComposerKt$MessageComposer$15 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    final /* synthetic */ StateFlow<Float> $amplitudeLevel;
    final /* synthetic */ MutableState<Color> $borderColor$delegate;
    final /* synthetic */ Function0<Unit> $checkAudioPermission;
    final /* synthetic */ long $defaultColor;
    final /* synthetic */ MutableState<Color> $disableColor$delegate;
    final /* synthetic */ StringProvider $hintText;
    final /* synthetic */ boolean $isDisabled;
    final /* synthetic */ Function0<Unit> $onCancelVoiceRecording;
    final /* synthetic */ Function0<Unit> $onGifInputSelected;
    final /* synthetic */ Function1<ComposerInputType, Unit> $onInputChange;
    final /* synthetic */ Function0<Unit> $onMediaInputSelected;
    final /* synthetic */ Function1<String, Unit> $onSendMessage;
    final /* synthetic */ Function0<Unit> $onStopVoiceRecording;
    final /* synthetic */ RoundedCornerShape $shape;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValue$delegate;
    final /* synthetic */ ComposerState.TextInput $textInput;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;
    final /* synthetic */ VoiceTranscriptionState $voiceTranscriptionState;

    /* JADX WARN: Multi-variable type inference failed */
    MessageComposerKt$MessageComposer$15(RoundedCornerShape roundedCornerShape, MutableState<Color> mutableState, ComposerState.TextInput textInput, VoiceTranscriptionState voiceTranscriptionState, StateFlow<Float> stateFlow, Function0<Unit> function0, MutableState<TextFieldValue> mutableState2, Function1<? super ComposerInputType, Unit> function1, Function0<Unit> function02, boolean z, Function1<? super MetricData, Unit> function12, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function1<? super String, Unit> function13, MutableState<Color> mutableState3, StringProvider stringProvider, long j) {
        this.$shape = roundedCornerShape;
        this.$borderColor$delegate = mutableState;
        this.$textInput = textInput;
        this.$voiceTranscriptionState = voiceTranscriptionState;
        this.$amplitudeLevel = stateFlow;
        this.$onCancelVoiceRecording = function0;
        this.$textFieldValue$delegate = mutableState2;
        this.$onInputChange = function1;
        this.$onStopVoiceRecording = function02;
        this.$isDisabled = z;
        this.$trackMetric = function12;
        this.$onGifInputSelected = function03;
        this.$onMediaInputSelected = function04;
        this.$checkAudioPermission = function05;
        this.$onSendMessage = function13;
        this.$disableColor$delegate = mutableState3;
        this.$hintText = stringProvider;
        this.$defaultColor = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i) {
        int i2;
        long MessageComposer$lambda$16;
        long MessageComposer$lambda$19;
        TextFieldValue MessageComposer$lambda$10;
        MutableState<Color> mutableState;
        float f;
        boolean z;
        ComposerState.TextInput textInput;
        final Function1<MetricData, Unit> function1;
        Function0<Unit> function0;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Function1<String, Unit> function12;
        RowScopeInstance rowScopeInstance;
        TextFieldValue MessageComposer$lambda$102;
        boolean shouldShowButtons;
        TextFieldValue MessageComposer$lambda$103;
        long MessageComposer$lambda$192;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i & 14) == 0) {
            i2 = i | (composer2.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer2.getSkipping()) {
            Modifier m261backgroundbw27NRU = BackgroundKt.m261backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), this.$shape);
            float m8401constructorimpl = Dp.m8401constructorimpl((float) 1.5d);
            MessageComposer$lambda$16 = MessageComposerKt.MessageComposer$lambda$16(this.$borderColor$delegate);
            Modifier border = BorderKt.border(m261backgroundbw27NRU, BorderStrokeKt.m292BorderStrokecXLIe8U(m8401constructorimpl, MessageComposer$lambda$16), this.$shape);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerState.TextInput textInput2 = this.$textInput;
            VoiceTranscriptionState.Recording recording = this.$voiceTranscriptionState;
            StateFlow<Float> stateFlow = this.$amplitudeLevel;
            final Function0<Unit> function04 = this.$onCancelVoiceRecording;
            final MutableState<TextFieldValue> mutableState2 = this.$textFieldValue$delegate;
            final Function1<ComposerInputType, Unit> function13 = this.$onInputChange;
            final Function0<Unit> function05 = this.$onStopVoiceRecording;
            boolean z2 = this.$isDisabled;
            Function1<MetricData, Unit> function14 = this.$trackMetric;
            Function0<Unit> function06 = this.$onGifInputSelected;
            Function0<Unit> function07 = this.$onMediaInputSelected;
            Function0<Unit> function08 = this.$checkAudioPermission;
            Function1<String, Unit> function15 = this.$onSendMessage;
            MutableState<Color> mutableState3 = this.$disableColor$delegate;
            StringProvider stringProvider = this.$hintText;
            long j = this.$defaultColor;
            ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, border);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            if ((textInput2.getInputType() instanceof ComposerInputType.VoiceNotes) || !(recording instanceof VoiceTranscriptionState.Idle)) {
                composer2.startReplaceGroup(1077635067);
                if (recording instanceof VoiceTranscriptionState.Idle) {
                    recording = VoiceTranscriptionState.Recording.INSTANCE;
                }
                VoiceTranscriptionState voiceTranscriptionState = recording;
                MessageComposer$lambda$19 = MessageComposerKt.MessageComposer$lambda$19(mutableState3);
                composer2.startReplaceGroup(1697351143);
                boolean changed = composer2.changed(function04) | composer2.changed(mutableState2) | composer2.changed(function13);
                Object rememberedValue = composer2.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$15$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$14$lambda$1$lambda$0;
                            invoke$lambda$14$lambda$1$lambda$0 = MessageComposerKt$MessageComposer$15.invoke$lambda$14$lambda$1$lambda$0(Function0.this, function13, mutableState2);
                            return invoke$lambda$14$lambda$1$lambda$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                Function0 function09 = (Function0) rememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1697359516);
                boolean changed2 = composer2.changed(function05);
                Object rememberedValue2 = composer2.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$15$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$14$lambda$3$lambda$2;
                            invoke$lambda$14$lambda$3$lambda$2 = MessageComposerKt$MessageComposer$15.invoke$lambda$14$lambda$3$lambda$2(Function0.this);
                            return invoke$lambda$14$lambda$3$lambda$2;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                composer2.endReplaceGroup();
                MessageComposerKt.m11366VoiceNotesComposercf5BqRc(voiceTranscriptionState, stateFlow, MessageComposer$lambda$19, function09, (Function0) rememberedValue2, composer2, 64);
                Modifier m889size3ABfNKs = SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(0));
                ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m889size3ABfNKs);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
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
                Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                }
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                innerTextField.invoke(composer2, Integer.valueOf(i2 & 14));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1079026006);
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer2, 6);
                float f2 = 8;
                Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, Dp.m8401constructorimpl(f2), 1, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                Updater.m4983setimpl(m4976constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                    m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                    m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                }
                Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer2.startReplaceGroup(-598917947);
                MessageComposer$lambda$10 = MessageComposerKt.MessageComposer$lambda$10(mutableState2);
                if (MessageComposer$lambda$10.getText().length() == 0) {
                    textInput = textInput2;
                    z = z2;
                    f = f2;
                    mutableState = mutableState3;
                    function1 = function14;
                    rowScopeInstance = rowScopeInstance2;
                    function0 = function06;
                    function02 = function07;
                    function03 = function08;
                    function12 = function15;
                    TextKt.m3581TextNvy7gAk(stringProvider.getText(composer2, StringProvider.$stable), null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer, 0, 0, 131066);
                    composer2 = composer;
                } else {
                    mutableState = mutableState3;
                    f = f2;
                    z = z2;
                    textInput = textInput2;
                    function1 = function14;
                    function0 = function06;
                    function02 = function07;
                    function03 = function08;
                    function12 = function15;
                    rowScopeInstance = rowScopeInstance2;
                }
                composer2.endReplaceGroup();
                innerTextField.invoke(composer2, Integer.valueOf(i2 & 14));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                MessageComposer$lambda$102 = MessageComposerKt.MessageComposer$lambda$10(mutableState2);
                shouldShowButtons = MessageComposerKt.shouldShowButtons(MessageComposer$lambda$102.getText(), textInput.getButtons());
                composer2.startReplaceGroup(1697401850);
                if (shouldShowButtons) {
                    List<BottomBarUiState.BottomBarButton> buttons = textInput.getButtons();
                    boolean z3 = !z;
                    composer2.startReplaceGroup(1697408783);
                    final Function0<Unit> function010 = function0;
                    boolean changed3 = composer2.changed(function1) | composer2.changed(function010);
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$15$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$14$lambda$7$lambda$6;
                                invoke$lambda$14$lambda$7$lambda$6 = MessageComposerKt$MessageComposer$15.invoke$lambda$14$lambda$7$lambda$6(Function1.this, function010);
                                return invoke$lambda$14$lambda$7$lambda$6;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function011 = (Function0) rememberedValue3;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1697416548);
                    final Function0<Unit> function012 = function02;
                    boolean changed4 = composer2.changed(function012);
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$15$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$14$lambda$9$lambda$8;
                                invoke$lambda$14$lambda$9$lambda$8 = MessageComposerKt$MessageComposer$15.invoke$lambda$14$lambda$9$lambda$8(Function0.this);
                                return invoke$lambda$14$lambda$9$lambda$8;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    Function0 function013 = (Function0) rememberedValue4;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1697421238);
                    final Function0<Unit> function014 = function03;
                    boolean changed5 = composer2.changed(function014);
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$15$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$14$lambda$11$lambda$10;
                                invoke$lambda$14$lambda$11$lambda$10 = MessageComposerKt$MessageComposer$15.invoke$lambda$14$lambda$11$lambda$10(Function0.this);
                                return invoke$lambda$14$lambda$11$lambda$10;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    BottomBarButtonComponentKt.BottomBarButtonComponent(null, buttons, z3, function011, function013, (Function0) rememberedValue5, composer, 64, 1);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                if (!shouldShowButtons) {
                    Modifier align = rowScopeInstance.align(SizeKt.m889size3ABfNKs(PaddingKt.m837padding3ABfNKs(TestTagKt.testTag(Modifier.INSTANCE, "send_button"), Dp.m8401constructorimpl(f)), Dp.m8401constructorimpl(32)), Alignment.INSTANCE.getBottom());
                    MessageComposer$lambda$103 = MessageComposerKt.MessageComposer$lambda$10(mutableState2);
                    boolean z4 = (StringsKt.isBlank(MessageComposer$lambda$103.getText()) || z) ? false : true;
                    IconButtonDefaults iconButtonDefaults = IconButtonDefaults.INSTANCE;
                    long m12148getActionContrastWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12148getActionContrastWhite0d7_KjU();
                    long m12169getOnActionContrastWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12169getOnActionContrastWhite0d7_KjU();
                    MessageComposer$lambda$192 = MessageComposerKt.MessageComposer$lambda$19(mutableState);
                    Composer composer3 = composer2;
                    IconButtonColors m2847iconButtonColorsro_MJ88 = iconButtonDefaults.m2847iconButtonColorsro_MJ88(m12148getActionContrastWhite0d7_KjU, m12169getOnActionContrastWhite0d7_KjU, MessageComposer$lambda$192, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12169getOnActionContrastWhite0d7_KjU(), composer3, IconButtonDefaults.$stable << 12, 0);
                    composer2 = composer3;
                    composer2.startReplaceGroup(1697440532);
                    final Function1<String, Unit> function16 = function12;
                    boolean changed6 = composer2.changed(function16) | composer2.changed(mutableState2);
                    Object rememberedValue6 = composer2.rememberedValue();
                    if (changed6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$MessageComposer$15$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$14$lambda$13$lambda$12;
                                invoke$lambda$14$lambda$13$lambda$12 = MessageComposerKt$MessageComposer$15.invoke$lambda$14$lambda$13$lambda$12(Function1.this, mutableState2);
                                return invoke$lambda$14$lambda$13$lambda$12;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    composer2.endReplaceGroup();
                    IconButtonKt.FilledIconButton((Function0) rememberedValue6, align, z4, null, m2847iconButtonColorsro_MJ88, null, ComposableSingletons$MessageComposerKt.INSTANCE.m11330getLambda1$intercom_sdk_base_release(), composer2, 1572864, 40);
                }
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$1$lambda$0(Function0 function0, Function1 function1, MutableState textFieldValue$delegate) {
        Intrinsics.checkNotNullParameter(textFieldValue$delegate, "$textFieldValue$delegate");
        function0.invoke();
        textFieldValue$delegate.setValue(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
        function1.invoke(ComposerInputType.Text.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$7$lambda$6(Function1 function1, Function0 function0) {
        function1.invoke(new MetricData.ComposerInputClicked(MetricTracker.Object.GIF_INPUT));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$9$lambda$8(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$11$lambda$10(Function0 checkAudioPermission) {
        Intrinsics.checkNotNullParameter(checkAudioPermission, "$checkAudioPermission");
        checkAudioPermission.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13$lambda$12(Function1 onSendMessage, MutableState textFieldValue$delegate) {
        TextFieldValue MessageComposer$lambda$10;
        Intrinsics.checkNotNullParameter(onSendMessage, "$onSendMessage");
        Intrinsics.checkNotNullParameter(textFieldValue$delegate, "$textFieldValue$delegate");
        MessageComposer$lambda$10 = MessageComposerKt.MessageComposer$lambda$10(textFieldValue$delegate);
        onSendMessage.invoke(MessageComposer$lambda$10.getText());
        textFieldValue$delegate.setValue(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }
}
