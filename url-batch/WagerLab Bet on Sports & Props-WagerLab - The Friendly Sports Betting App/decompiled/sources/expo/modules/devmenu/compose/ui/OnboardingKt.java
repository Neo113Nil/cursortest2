package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.composeunstyled.ButtonKt;
import expo.modules.core.utilities.EmulatorUtilities;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.SpacerKt;
import expo.modules.devmenu.compose.primitives.TextKt;
import expo.modules.devmenu.compose.ripple.RippleFactoryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Onboarding.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\t"}, d2 = {"SimulatorMessage", "", "(Landroidx/compose/runtime/Composer;I)V", "DeviceMessage", "Onboarding", "onOnboardingFinished", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "OnboardingPreview", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnboardingKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeviceMessage$lambda$4(int i, Composer composer, int i2) {
        DeviceMessage(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Onboarding$lambda$9(Function0 function0, int i, int i2, Composer composer, int i3) {
        Onboarding(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingPreview$lambda$10(int i, Composer composer, int i2) {
        OnboardingPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimulatorMessage$lambda$3(int i, Composer composer, int i2) {
        SimulatorMessage(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SimulatorMessage(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(875349543);
        ComposerKt.sourceInformation(startRestartGroup, "C(SimulatorMessage)38@1451L24:Onboarding.kt#aaq0h9");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(875349543, i, -1, "expo.modules.devmenu.compose.ui.SimulatorMessage (Onboarding.kt:25)");
            }
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("You can press ");
            int pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
            try {
                builder.append("⌘ + m");
                Unit unit = Unit.INSTANCE;
                builder.pop(pushStyle);
                builder.append(" on macOS or ");
                pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append("Ctrl + m");
                    Unit unit2 = Unit.INSTANCE;
                    builder.pop(pushStyle);
                    builder.append(" on other platforms to get back to it at any time.");
                    TextKt.m10821NewTextnUFttAo(builder.toAnnotatedString(), (TextStyle) null, 0L, 0, false, 0, (Modifier) null, startRestartGroup, 0, WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } finally {
                }
            } finally {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.OnboardingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SimulatorMessage$lambda$3;
                    SimulatorMessage$lambda$3 = OnboardingKt.SimulatorMessage$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SimulatorMessage$lambda$3;
                }
            });
        }
    }

    public static final void DeviceMessage(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-867485547);
        ComposerKt.sourceInformation(startRestartGroup, "C(DeviceMessage)43@1515L123:Onboarding.kt#aaq0h9");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-867485547, i, -1, "expo.modules.devmenu.compose.ui.DeviceMessage (Onboarding.kt:42)");
            }
            TextKt.m10822NewTextnUFttAo("You can shake your device or long press anywhere on the screen with three fingers to get back to it at any time.", (TextStyle) null, 0L, 0, false, 0, (Modifier) null, startRestartGroup, 6, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.OnboardingKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DeviceMessage$lambda$4;
                    DeviceMessage$lambda$4 = OnboardingKt.DeviceMessage$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DeviceMessage$lambda$4;
                }
            });
        }
    }

    public static final void Onboarding(Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Function0<Unit> function03;
        final Function0<Unit> function04;
        Composer startRestartGroup = composer.startRestartGroup(-184766711);
        ComposerKt.sourceInformation(startRestartGroup, "C(Onboarding)47@1704L2,48@1729L52,52@1847L6,53@1914L7,53@1950L7,50@1785L1186:Onboarding.kt#aaq0h9");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = i | (startRestartGroup.changedInstance(function02) ? 4 : 2);
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                startRestartGroup.startReplaceGroup(1849434622);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Onboarding.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.OnboardingKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit;
                            unit = Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                function03 = (Function0) rememberedValue;
            } else {
                function03 = function02;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-184766711, i3, -1, "expo.modules.devmenu.compose.ui.Onboarding (Onboarding.kt:47)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Onboarding.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = Boolean.valueOf(EmulatorUtilities.INSTANCE.isRunningOnEmulator());
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            boolean booleanValue = ((Boolean) rememberedValue2).booleanValue();
            startRestartGroup.endReplaceGroup();
            Modifier m838paddingVpY3zN4 = PaddingKt.m838paddingVpY3zN4(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBackground().getDefault(), null, 2, null), NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10807get2D9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m838paddingVpY3zN4);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1650260242, "C55@1973L114,59@2112L7,59@2093L31,67@2239L7,67@2220L31,71@2348L12,72@2402L6,73@2483L6,69@2257L673,91@2955L7,91@2936L31:Onboarding.kt#aaq0h9");
            int i5 = i3;
            TextKt.m10822NewTextnUFttAo("This is the developer menu. It gives you access to useful tools in your development builds.", (TextStyle) null, 0L, 0, false, 0, (Modifier) null, startRestartGroup, 6, WebSocketProtocol.PAYLOAD_SHORT);
            SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10807get2D9Ej5fM(), null, startRestartGroup, 0, 2);
            if (!booleanValue) {
                startRestartGroup.startReplaceGroup(-1650117550);
                ComposerKt.sourceInformation(startRestartGroup, "62@2155L15");
                DeviceMessage(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1650082737);
                ComposerKt.sourceInformation(startRestartGroup, "64@2190L18");
                SimulatorMessage(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10808get3D9Ej5fM(), null, startRestartGroup, 0, 2);
            function04 = function03;
            ButtonKt.m9489ButtonY0X4mI(function04, false, RoundedCornerShapeKt.m1202RoundedCornerShape0680j_4(NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10768getMdD9Ej5fM()), NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getButtons().getPrimary().m10787getBackground0d7_KjU(), 0L, null, 0L, 0.0f, null, 0, RippleFactoryKt.m10833rippleH2RKhps$default(false, 0.0f, NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getButtons().getPrimary().m10788getForeground0d7_KjU(), 3, null), null, null, null, ComposableSingletons$OnboardingKt.INSTANCE.getLambda$562906401$expo_dev_menu_release(), startRestartGroup, i5 & 14, 24576, 15346);
            startRestartGroup = startRestartGroup;
            SpacerKt.m10818SpacerorJrPs(NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10807get2D9Ej5fM(), null, startRestartGroup, 0, 2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            function04 = function02;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.OnboardingKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Onboarding$lambda$9;
                    Onboarding$lambda$9 = OnboardingKt.Onboarding$lambda$9(Function0.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return Onboarding$lambda$9;
                }
            });
        }
    }

    public static final void OnboardingPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1790909113);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingPreview)98@3047L12:Onboarding.kt#aaq0h9");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1790909113, i, -1, "expo.modules.devmenu.compose.ui.OnboardingPreview (Onboarding.kt:97)");
            }
            Onboarding(null, startRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.OnboardingKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OnboardingPreview$lambda$10;
                    OnboardingPreview$lambda$10 = OnboardingKt.OnboardingPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return OnboardingPreview$lambda$10;
                }
            });
        }
    }
}
