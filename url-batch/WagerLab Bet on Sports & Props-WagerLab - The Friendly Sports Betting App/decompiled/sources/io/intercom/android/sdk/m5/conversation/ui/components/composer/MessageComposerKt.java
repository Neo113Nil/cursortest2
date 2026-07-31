package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.res.Configuration;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioPermissionHandlerKt;
import io.intercom.android.sdk.m5.utils.TextFieldSaver;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MessageComposer.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001aë\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u001c\u001a\u001e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002\u001aI\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b0\u00101\u001a\r\u00102\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00103\u001a\r\u00104\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00103\u001a\r\u00105\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00103\u001a\r\u00106\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00103\"\u0016\u0010\u001d\u001a\u00020\u001eX\u0080\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 \"\u0016\u0010\"\u001a\u00020\u001eX\u0080\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 ¨\u00067²\u0006\n\u00108\u001a\u000209X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020%X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020-X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020-X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020>X\u008a\u0084\u0002"}, d2 = {"MessageComposer", "", "modifier", "Landroidx/compose/ui/Modifier;", "onSendMessage", "Lkotlin/Function1;", "", "textInput", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState$TextInput;", "onGifInputSelected", "Lkotlin/Function0;", "onMediaInputSelected", "onInputChange", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "trackMetric", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "onTyping", "composerUiEffect", "Lkotlinx/coroutines/flow/SharedFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect;", "voiceTranscriptionState", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "amplitudeLevel", "Lkotlinx/coroutines/flow/StateFlow;", "", "onStartVoiceRecording", "onStopVoiceRecording", "onCancelVoiceRecording", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/m5/conversation/states/ComposerState$TextInput;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/SharedFlow;Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "ComposerMinSize", "Landroidx/compose/ui/unit/Dp;", "getComposerMinSize", "()F", "F", "ComposerHalfSize", "getComposerHalfSize", "shouldShowButtons", "", "messageText", "buttons", "", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBarButton;", "VoiceNotesComposer", "state", "disabledContainerColor", "Landroidx/compose/ui/graphics/Color;", "onCloseClick", "onStopRecordingClick", "VoiceNotesComposer-cf5BqRc", "(Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;Lkotlinx/coroutines/flow/StateFlow;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TextComposerPreview", "(Landroidx/compose/runtime/Composer;I)V", "TextComposerWithButtonsPreview", "TextComposerWithInitialTextPreview", "VoiceNotesComposerPreview", "intercom-sdk-base_release", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "shouldRequestFocus", ViewProps.BORDER_COLOR, "disableColor", "keyboardAsState", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageComposerKt {
    private static final float ComposerHalfSize;
    private static final float ComposerMinSize;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$32(Modifier modifier, Function1 onSendMessage, ComposerState.TextInput textInput, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function0 function03, SharedFlow sharedFlow, VoiceTranscriptionState voiceTranscriptionState, StateFlow stateFlow, Function0 function04, Function0 function05, Function0 function06, int i, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(onSendMessage, "$onSendMessage");
        Intrinsics.checkNotNullParameter(textInput, "$textInput");
        MessageComposer(modifier, onSendMessage, textInput, function0, function02, function1, function12, function03, sharedFlow, voiceTranscriptionState, stateFlow, function04, function05, function06, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextComposerPreview$lambda$38(int i, Composer composer, int i2) {
        TextComposerPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextComposerWithButtonsPreview$lambda$39(int i, Composer composer, int i2) {
        TextComposerWithButtonsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextComposerWithInitialTextPreview$lambda$40(int i, Composer composer, int i2) {
        TextComposerWithInitialTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VoiceNotesComposerPreview$lambda$41(int i, Composer composer, int i2) {
        VoiceNotesComposerPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VoiceNotesComposer_cf5BqRc$lambda$37(VoiceTranscriptionState state, StateFlow amplitudeLevel, long j, Function0 onCloseClick, Function0 onStopRecordingClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(amplitudeLevel, "$amplitudeLevel");
        Intrinsics.checkNotNullParameter(onCloseClick, "$onCloseClick");
        Intrinsics.checkNotNullParameter(onStopRecordingClick, "$onStopRecordingClick");
        m11366VoiceNotesComposercf5BqRc(state, amplitudeLevel, j, onCloseClick, onStopRecordingClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$2(ComposerInputType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$3(MetricData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0479, code lost:
    
        if (r1.changed(r5) == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MessageComposer(Modifier modifier, final Function1<? super String, Unit> onSendMessage, final ComposerState.TextInput textInput, Function0<Unit> function0, Function0<Unit> function02, Function1<? super ComposerInputType, Unit> function1, Function1<? super MetricData, Unit> function12, Function0<Unit> function03, SharedFlow<? extends ComposerUiEffect> sharedFlow, VoiceTranscriptionState voiceTranscriptionState, StateFlow<Float> stateFlow, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Composer composer, final int i, final int i2, final int i3) {
        StateFlow<Float> stateFlow2;
        long m12147getAction0d7_KjU;
        boolean z;
        Function0<Unit> function07;
        int i4;
        final Function0<Unit> function08;
        boolean z2;
        boolean changed;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onSendMessage, "onSendMessage");
        Intrinsics.checkNotNullParameter(textInput, "textInput");
        Composer startRestartGroup = composer.startRestartGroup(-542978555);
        Modifier.Companion companion = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Function0<Unit> function09 = (i3 & 8) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0;
        Function0<Unit> function010 = (i3 & 16) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02;
        Function1<? super ComposerInputType, Unit> function13 = (i3 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MessageComposer$lambda$2;
                MessageComposer$lambda$2 = MessageComposerKt.MessageComposer$lambda$2((ComposerInputType) obj);
                return MessageComposer$lambda$2;
            }
        } : function1;
        Function1<? super MetricData, Unit> function14 = (i3 & 64) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MessageComposer$lambda$3;
                MessageComposer$lambda$3 = MessageComposerKt.MessageComposer$lambda$3((MetricData) obj);
                return MessageComposer$lambda$3;
            }
        } : function12;
        Function0<Unit> function011 = (i3 & 128) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function03;
        SharedFlow<? extends ComposerUiEffect> sharedFlow2 = (i3 & 256) != 0 ? null : sharedFlow;
        VoiceTranscriptionState.Idle idle = (i3 & 512) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState;
        MutableStateFlow MutableStateFlow = (i3 & 1024) != 0 ? StateFlowKt.MutableStateFlow(Float.valueOf(0.0f)) : stateFlow;
        final Function0<Unit> function012 = (i3 & 2048) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function04;
        Function0<Unit> function013 = (i3 & 4096) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function05;
        Function0<Unit> function014 = (i3 & 8192) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function06;
        Pair pair = new Pair(textInput.getInitialMessage(), textInput.getHintText());
        final String str = (String) pair.component1();
        StringProvider stringProvider = (StringProvider) pair.component2();
        final Function1<? super MetricData, Unit> function15 = function14;
        StateFlow<Float> stateFlow3 = MutableStateFlow;
        final Function0<Unit> function015 = function013;
        boolean isDisabled = textInput.isDisabled();
        Object[] objArr = new Object[0];
        Saver<TextFieldValue, ?> textFieldValueSaver = TextFieldSaver.INSTANCE.getTextFieldValueSaver();
        final Function1<? super ComposerInputType, Unit> function16 = function13;
        startRestartGroup.startReplaceGroup(319554768);
        boolean changed2 = startRestartGroup.changed(str);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2) {
            stateFlow2 = stateFlow3;
        } else {
            stateFlow2 = stateFlow3;
        }
        rememberedValue2 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState MessageComposer$lambda$9$lambda$8;
                MessageComposer$lambda$9$lambda$8 = MessageComposerKt.MessageComposer$lambda$9$lambda$8(str);
                return MessageComposer$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        final MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) textFieldValueSaver, (Function0) rememberedValue2, startRestartGroup, 72);
        startRestartGroup.startReplaceGroup(319562738);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        RoundedCornerShape m1202RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(ComposerHalfSize);
        long m5656copywmQWz5c$default = Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        final long m12158getComposerBorder0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12158getComposerBorder0d7_KjU();
        final Function0<Unit> function016 = function014;
        if (ColorExtensionsKt.m12245isLightColor8_81llA(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12147getAction0d7_KjU())) {
            startRestartGroup.startReplaceGroup(1316814398);
            m12147getAction0d7_KjU = ColorExtensionsKt.m12237darken8_81llA(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12147getAction0d7_KjU());
            startRestartGroup.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(1316871655);
            m12147getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12147getAction0d7_KjU();
            startRestartGroup.endReplaceGroup();
        }
        final VoiceTranscriptionState voiceTranscriptionState2 = idle;
        final long j = m12147getAction0d7_KjU;
        startRestartGroup.startReplaceGroup(319576575);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            z = isDisabled;
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m5647boximpl(m12158getComposerBorder0d7_KjU), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        } else {
            z = isDisabled;
        }
        final MutableState mutableState2 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        final long m12160getDisabled0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12160getDisabled0d7_KjU();
        final long Color = ColorKt.Color(4289901234L);
        startRestartGroup.startReplaceGroup(319582401);
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        final Function0<Unit> function017 = function09;
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            function07 = function010;
            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m5647boximpl(m12160getDisabled0d7_KjU), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        } else {
            function07 = function010;
        }
        final MutableState mutableState3 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(319584813);
        Object rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue6);
        }
        FocusRequester focusRequester = (FocusRequester) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        Boolean valueOf = Boolean.valueOf(MessageComposer$lambda$13(mutableState));
        startRestartGroup.startReplaceGroup(319587124);
        MessageComposerKt$MessageComposer$9$1 rememberedValue7 = startRestartGroup.rememberedValue();
        Function0<Unit> function018 = function011;
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new MessageComposerKt$MessageComposer$9$1(focusRequester, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue7);
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 64);
        State<KeyboardState> keyboardAsState = KeyboardStateKt.keyboardAsState(startRestartGroup, 0);
        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localFocusManager);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.LaunchedEffect(Boolean.valueOf(MessageComposer$lambda$23(keyboardAsState).isDismissed()), new MessageComposerKt$MessageComposer$10((FocusManager) consume, keyboardAsState, null), startRestartGroup, 64);
        startRestartGroup.startReplaceGroup(319599771);
        startRestartGroup.startReplaceGroup(319600157);
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        boolean z3 = ((Configuration) consume2).orientation == 2;
        startRestartGroup.endReplaceGroup();
        if (z3) {
            i4 = 2;
        } else {
            startRestartGroup.startReplaceGroup(319603028);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean z4 = ((double) ((Density) consume3).getFontScale()) > 1.5d;
            startRestartGroup.endReplaceGroup();
            i4 = z4 ? 4 : 5;
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect((Object) null, new MessageComposerKt$MessageComposer$11(sharedFlow2, StringResources_androidKt.stringResource(R.string.intercom_report_ai_answer_message, startRestartGroup, 0), rememberSaveable, null), startRestartGroup, 70);
        startRestartGroup.startReplaceGroup(319632671);
        boolean z5 = (((i2 & 112) ^ 48) > 32 && startRestartGroup.changed(function012)) || (i2 & 48) == 32;
        Object rememberedValue8 = startRestartGroup.rememberedValue();
        if (z5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit MessageComposer$lambda$25$lambda$24;
                    MessageComposer$lambda$25$lambda$24 = MessageComposerKt.MessageComposer$lambda$25$lambda$24(Function0.this);
                    return MessageComposer$lambda$25$lambda$24;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue8);
        }
        startRestartGroup.endReplaceGroup();
        Function0<Unit> rememberAudioPermissionHandler = AudioPermissionHandlerKt.rememberAudioPermissionHandler((Function0) rememberedValue8, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        }, startRestartGroup, 48);
        Modifier m5260shadows4CzXII$default = ShadowKt.m5260shadows4CzXII$default(FocusRequesterModifierKt.focusRequester(SizeKt.m874defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ComposerMinSize, 1, null), focusRequester), Dp.m8401constructorimpl(28), m1202RoundedCornerShape0680j_4, false, Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12177getShadow0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12177getShadow0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null), 4, null);
        startRestartGroup.startReplaceGroup(319652463);
        boolean changed3 = startRestartGroup.changed(j) | startRestartGroup.changed(m12158getComposerBorder0d7_KjU) | startRestartGroup.changed(m12160getDisabled0d7_KjU);
        Object rememberedValue9 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit MessageComposer$lambda$28$lambda$27;
                    MessageComposer$lambda$28$lambda$27 = MessageComposerKt.MessageComposer$lambda$28$lambda$27(j, m12158getComposerBorder0d7_KjU, Color, m12160getDisabled0d7_KjU, mutableState2, mutableState3, (FocusState) obj);
                    return MessageComposer$lambda$28$lambda$27;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue9);
        }
        startRestartGroup.endReplaceGroup();
        Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(m5260shadows4CzXII$default, (Function1) rememberedValue9);
        TextFieldValue MessageComposer$lambda$10 = MessageComposer$lambda$10(rememberSaveable);
        boolean z6 = !z;
        SolidColor solidColor = new SolidColor(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), null);
        TextStyle m7848copyp1EtxEg$default = TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        startRestartGroup.startReplaceGroup(319662450);
        if (((i & 29360128) ^ 12582912) > 8388608) {
            function08 = function018;
        } else {
            function08 = function018;
        }
        if ((i & 12582912) != 8388608) {
            z2 = false;
            changed = z2 | startRestartGroup.changed(rememberSaveable);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MessageComposer$lambda$31$lambda$30;
                        MessageComposer$lambda$31$lambda$30 = MessageComposerKt.MessageComposer$lambda$31$lambda$30(Function0.this, rememberSaveable, (TextFieldValue) obj);
                        return MessageComposer$lambda$31$lambda$30;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            final Function0<Unit> function019 = function07;
            final StateFlow<Float> stateFlow4 = stateFlow2;
            final Modifier modifier2 = companion;
            final Function0<Unit> function020 = function08;
            final SharedFlow<? extends ComposerUiEffect> sharedFlow3 = sharedFlow2;
            final Function0<Unit> function021 = function012;
            BasicTextFieldKt.BasicTextField(MessageComposer$lambda$10, (Function1<? super TextFieldValue, Unit>) rememberedValue, onFocusChanged, z6, false, m7848copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, false, i4, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1470391550, true, new MessageComposerKt$MessageComposer$15(m1202RoundedCornerShape0680j_4, mutableState2, textInput, voiceTranscriptionState2, stateFlow4, function016, rememberSaveable, function16, function015, z, function15, function017, function019, rememberAudioPermissionHandler, onSendMessage, mutableState3, stringProvider, m5656copywmQWz5c$default), startRestartGroup, 54), startRestartGroup, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 15824);
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MessageComposer$lambda$32;
                        MessageComposer$lambda$32 = MessageComposerKt.MessageComposer$lambda$32(Modifier.this, onSendMessage, textInput, function017, function019, function16, function15, function020, sharedFlow3, voiceTranscriptionState2, stateFlow4, function021, function015, function016, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return MessageComposer$lambda$32;
                    }
                });
                return;
            }
            return;
        }
        z2 = true;
        changed = z2 | startRestartGroup.changed(rememberSaveable);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MessageComposer$lambda$31$lambda$30;
                MessageComposer$lambda$31$lambda$30 = MessageComposerKt.MessageComposer$lambda$31$lambda$30(Function0.this, rememberSaveable, (TextFieldValue) obj);
                return MessageComposer$lambda$31$lambda$30;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        final Function0 function0192 = function07;
        final StateFlow stateFlow42 = stateFlow2;
        final Modifier modifier22 = companion;
        final Function0 function0202 = function08;
        final SharedFlow sharedFlow32 = sharedFlow2;
        final Function0 function0212 = function012;
        BasicTextFieldKt.BasicTextField(MessageComposer$lambda$10, (Function1<? super TextFieldValue, Unit>) rememberedValue, onFocusChanged, z6, false, m7848copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, false, i4, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1470391550, true, new MessageComposerKt$MessageComposer$15(m1202RoundedCornerShape0680j_4, mutableState2, textInput, voiceTranscriptionState2, stateFlow42, function016, rememberSaveable, function16, function015, z, function15, function017, function0192, rememberAudioPermissionHandler, onSendMessage, mutableState3, stringProvider, m5656copywmQWz5c$default), startRestartGroup, 54), startRestartGroup, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 15824);
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue MessageComposer$lambda$10(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MessageComposer$lambda$9$lambda$8(String initialMessage) {
        Intrinsics.checkNotNullParameter(initialMessage, "$initialMessage");
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(initialMessage, TextRangeKt.TextRange(initialMessage.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MessageComposer$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageComposer$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MessageComposer$lambda$16(MutableState<Color> mutableState) {
        return mutableState.getValue().m5667unboximpl();
    }

    private static final void MessageComposer$lambda$17(MutableState<Color> mutableState, long j) {
        mutableState.setValue(Color.m5647boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MessageComposer$lambda$19(MutableState<Color> mutableState) {
        return mutableState.getValue().m5667unboximpl();
    }

    private static final void MessageComposer$lambda$20(MutableState<Color> mutableState, long j) {
        mutableState.setValue(Color.m5647boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$25$lambda$24(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$28$lambda$27(long j, long j2, long j3, long j4, MutableState borderColor$delegate, MutableState disableColor$delegate, FocusState focused) {
        Intrinsics.checkNotNullParameter(borderColor$delegate, "$borderColor$delegate");
        Intrinsics.checkNotNullParameter(disableColor$delegate, "$disableColor$delegate");
        Intrinsics.checkNotNullParameter(focused, "focused");
        if (!focused.isFocused()) {
            j = j2;
        }
        MessageComposer$lambda$17(borderColor$delegate, j);
        if (!focused.isFocused()) {
            j3 = j4;
        }
        MessageComposer$lambda$20(disableColor$delegate, j3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposer$lambda$31$lambda$30(Function0 function0, MutableState textFieldValue$delegate, TextFieldValue it) {
        Intrinsics.checkNotNullParameter(textFieldValue$delegate, "$textFieldValue$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        textFieldValue$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final float getComposerMinSize() {
        return ComposerMinSize;
    }

    public static final float getComposerHalfSize() {
        return ComposerHalfSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowButtons(String str, List<? extends BottomBarUiState.BottomBarButton> list) {
        return str.length() == 0 && !list.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VoiceNotesComposer-cf5BqRc, reason: not valid java name */
    public static final void m11366VoiceNotesComposercf5BqRc(final VoiceTranscriptionState voiceTranscriptionState, final StateFlow<Float> stateFlow, final long j, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        boolean z;
        Composer startRestartGroup = composer.startRestartGroup(-103778572);
        float f = 8;
        Modifier m837padding3ABfNKs = PaddingKt.m837padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8401constructorimpl(f));
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, startRestartGroup, 54);
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
        float f2 = 32;
        Modifier m889size3ABfNKs = SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2));
        IconButtonDefaults iconButtonDefaults = IconButtonDefaults.INSTANCE;
        long m5656copywmQWz5c$default = Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12173getPrimaryIcon0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        long m12159getDescriptionText0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU();
        long m12169getOnActionContrastWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12169getOnActionContrastWhite0d7_KjU();
        int i2 = i & 896;
        Composer composer2 = startRestartGroup;
        IconButtonKt.FilledIconButton(function0, m889size3ABfNKs, false, null, iconButtonDefaults.m2847iconButtonColorsro_MJ88(m5656copywmQWz5c$default, m12159getDescriptionText0d7_KjU, j, m12169getOnActionContrastWhite0d7_KjU, startRestartGroup, (IconButtonDefaults.$stable << 12) | i2, 0), null, ComposableSingletons$MessageComposerKt.INSTANCE.m11331getLambda2$intercom_sdk_base_release(), composer2, ((i >> 9) & 14) | 1572912, 44);
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        Alignment center = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
        boolean z2 = voiceTranscriptionState instanceof VoiceTranscriptionState.Recording;
        if (z2) {
            composer2.startReplaceGroup(1107214474);
            z = z2;
            SoundWaveVisualizationKt.m11374SoundWaveVisualizationFNF3uiM(stateFlow, null, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), composer2, 8, 2);
            composer2.endReplaceGroup();
        } else {
            z = z2;
            if (voiceTranscriptionState instanceof VoiceTranscriptionState.Processing) {
                composer2.startReplaceGroup(1107501069);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m696spacedBy0680j_42 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(4));
                ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m696spacedBy0680j_42, centerVertically2, composer2, 54);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                Updater.m4983setimpl(m4976constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                    m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                    m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                }
                Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ProgressIndicatorKt.m3156CircularProgressIndicator4lLiAd8(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), Dp.m8401constructorimpl(2), 0L, 0, 0.0f, composer2, 390, 56);
                TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_transcribing, composer2, 0), null, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131066);
                composer2 = composer2;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
            } else if (voiceTranscriptionState instanceof VoiceTranscriptionState.Error) {
                composer2.startReplaceGroup(1108332675);
                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m696spacedBy0680j_43 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(4));
                ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m696spacedBy0680j_43, centerVertically3, composer2, 54);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                Updater.m4983setimpl(m4976constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl4.getInserting() || !Intrinsics.areEqual(m4976constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
                    m4976constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
                    m4976constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
                }
                Updater.m4983setimpl(m4976constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(io.intercom.android.sdk.ui.R.drawable.intercom_ic_error, composer2, 0), (String) null, (Modifier) null, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12162getError0d7_KjU(), composer2, 56, 4);
                TextKt.m3581TextNvy7gAk(((VoiceTranscriptionState.Error) voiceTranscriptionState).getError().getUserMessage().getText(composer2, StringProvider.$stable), null, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12162getError0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131066);
                composer2 = composer2;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1109094872);
                composer2.endReplaceGroup();
            }
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Composer composer3 = composer2;
        IconButtonKt.FilledIconButton(function02, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2)), z, null, IconButtonDefaults.INSTANCE.m2847iconButtonColorsro_MJ88(IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12148getActionContrastWhite0d7_KjU(), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12169getOnActionContrastWhite0d7_KjU(), j, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12169getOnActionContrastWhite0d7_KjU(), composer3, i2 | (IconButtonDefaults.$stable << 12), 0), null, ComposableLambdaKt.rememberComposableLambda(2001037145, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$VoiceNotesComposer$1$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                invoke(composer4, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer4, int i3) {
                float m8401constructorimpl;
                if ((i3 & 11) != 2 || !composer4.getSkipping()) {
                    int i4 = VoiceTranscriptionState.this instanceof VoiceTranscriptionState.Recording ? io.intercom.android.sdk.ui.R.drawable.intercom_ic_stop : R.drawable.intercom_ic_up_arrow;
                    if (VoiceTranscriptionState.this instanceof VoiceTranscriptionState.Recording) {
                        m8401constructorimpl = Dp.m8401constructorimpl(16);
                    } else {
                        m8401constructorimpl = Dp.m8401constructorimpl(24);
                    }
                    IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(i4, composer4, 0), (String) null, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, m8401constructorimpl), 0L, composer4, 56, 8);
                    return;
                }
                composer4.skipToGroupEnd();
            }
        }, composer3, 54), composer3, ((i >> 12) & 14) | 1572912, 40);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VoiceNotesComposer_cf5BqRc$lambda$37;
                    VoiceNotesComposer_cf5BqRc$lambda$37 = MessageComposerKt.VoiceNotesComposer_cf5BqRc$lambda$37(VoiceTranscriptionState.this, stateFlow, j, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                    return VoiceNotesComposer_cf5BqRc$lambda$37;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TextComposerPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-609144377);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m11332getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextComposerPreview$lambda$38;
                    TextComposerPreview$lambda$38 = MessageComposerKt.TextComposerPreview$lambda$38(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextComposerPreview$lambda$38;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TextComposerWithButtonsPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1468421996);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m11333getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextComposerWithButtonsPreview$lambda$39;
                    TextComposerWithButtonsPreview$lambda$39 = MessageComposerKt.TextComposerWithButtonsPreview$lambda$39(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextComposerWithButtonsPreview$lambda$39;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TextComposerWithInitialTextPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-986390788);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m11334getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextComposerWithInitialTextPreview$lambda$40;
                    TextComposerWithInitialTextPreview$lambda$40 = MessageComposerKt.TextComposerWithInitialTextPreview$lambda$40(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextComposerWithInitialTextPreview$lambda$40;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void VoiceNotesComposerPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1575191241);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageComposerKt.INSTANCE.m11335getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VoiceNotesComposerPreview$lambda$41;
                    VoiceNotesComposerPreview$lambda$41 = MessageComposerKt.VoiceNotesComposerPreview$lambda$41(i, (Composer) obj, ((Integer) obj2).intValue());
                    return VoiceNotesComposerPreview$lambda$41;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState MessageComposer$lambda$23(State<KeyboardState> state) {
        return state.getValue();
    }

    static {
        float m8401constructorimpl = Dp.m8401constructorimpl(48);
        ComposerMinSize = m8401constructorimpl;
        ComposerHalfSize = Dp.m8401constructorimpl(m8401constructorimpl / 2);
    }
}
