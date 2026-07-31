package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.composeunstyled.ButtonKt;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.primitives.SpacerKt;
import expo.modules.devmenu.compose.primitives.SurfaceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuButton.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009e\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u00032\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u00032\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\u0004\u0018\u0001`\b¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012* \u0010\u0000\"\r\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u00032\r\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¨\u0006\u0013"}, d2 = {"NewMenuButtonComposable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "NewMenuButton", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lexpo/modules/devmenu/compose/ui/NewMenuButtonComposable;", "content", "rightComponent", "withSurface", "", ViewProps.ENABLED, "spacedBy", "Landroidx/compose/ui/unit/Dp;", ViewProps.ON_CLICK, "NewMenuButton-0vH8DBg", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MenuButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewMenuButton_0vH8DBg$lambda$3(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, boolean z, boolean z2, float f, Function0 function0, int i, int i2, Composer composer, int i3) {
        m10864NewMenuButton0vH8DBg(modifier, function2, function22, function23, z, z2, f, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019f  */
    /* renamed from: NewMenuButton-0vH8DBg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10864NewMenuButton0vH8DBg(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, boolean z, boolean z2, float f, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        Modifier.Companion companion;
        boolean z4;
        float f2;
        Function0<Unit> function02;
        final float f3;
        Composer composer2;
        Modifier modifier3;
        boolean z5;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function0<Unit> function03;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1274812819);
        ComposerKt.sourceInformation(startRestartGroup, "C(NewMenuButton)P(3,2!1,5,7!1,6:c#ui.unit.Dp)31@1156L509:MenuButton.kt#aaq0h9");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function24 = function2;
            i3 |= startRestartGroup.changedInstance(function24) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function25 = function22;
                i3 |= startRestartGroup.changedInstance(function25) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function26 = function23;
                    i3 |= startRestartGroup.changedInstance(function26) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        z3 = z;
                        i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(f)) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i9 = i8;
                            i3 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                            if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "28@1075L7,29@1112L2");
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i11 != 0) {
                                        function24 = null;
                                    }
                                    if (i4 != 0) {
                                        function25 = null;
                                    }
                                    if (i5 != 0) {
                                        function26 = null;
                                    }
                                    if (i6 != 0) {
                                        z3 = true;
                                    }
                                    z4 = i7 == 0 ? true : z2;
                                    if ((i2 & 64) == 0) {
                                        f2 = NewAppTheme.INSTANCE.getSpacing(startRestartGroup, 6).m10807get2D9Ej5fM();
                                        i3 &= -3670017;
                                    } else {
                                        f2 = f;
                                    }
                                    if (i9 == 0) {
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):MenuButton.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new Function0() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit unit;
                                                    unit = Unit.INSTANCE;
                                                    return unit;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        function02 = (Function0) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        function02 = function0;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    f2 = f;
                                    function02 = function0;
                                    companion = modifier2;
                                    z4 = z2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1274812819, i3, -1, "expo.modules.devmenu.compose.ui.NewMenuButton (MenuButton.kt:30)");
                                }
                                final boolean z7 = z4;
                                final float f4 = f2;
                                final Function2<? super Composer, ? super Integer, Unit> function29 = function24;
                                final Function0<Unit> function04 = function02;
                                final Function2<? super Composer, ? super Integer, Unit> function210 = function25;
                                final Function2<? super Composer, ? super Integer, Unit> function211 = function26;
                                f3 = f4;
                                final ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1213582955, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i12) {
                                        ComposerKt.sourceInformation(composer3, "C32@1207L454,32@1162L499:MenuButton.kt#aaq0h9");
                                        if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1213582955, i12, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous> (MenuButton.kt:32)");
                                        }
                                        Function0<Unit> function05 = function04;
                                        boolean z8 = z7;
                                        final float f5 = f4;
                                        final Function2<Composer, Integer, Unit> function212 = function29;
                                        final Function2<Composer, Integer, Unit> function213 = function210;
                                        final Function2<Composer, Integer, Unit> function214 = function211;
                                        ButtonKt.m9489ButtonY0X4mI(function05, z8, null, 0L, 0L, null, 0L, 0.0f, null, 0, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-258172871, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                                invoke(rowScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(RowScope Button, Composer composer4, int i13) {
                                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                                ComposerKt.sourceInformation(composer4, "C37@1402L6,38@1459L7,33@1215L440:MenuButton.kt#aaq0h9");
                                                if ((i13 & 17) == 16 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-258172871, i13, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous>.<anonymous> (MenuButton.kt:33)");
                                                }
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(f5);
                                                Modifier m893sizeInqDBjuR0$default = SizeKt.m893sizeInqDBjuR0$default(PaddingKt.m837padding3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, NewAppTheme.INSTANCE.getColors(composer4, 6).getBackground().getSubtle(), null, 2, null), NewAppTheme.INSTANCE.getSpacing(composer4, 6).m10808get3D9Ej5fM()), 0.0f, Dp.m8401constructorimpl(32), 0.0f, 0.0f, 13, null);
                                                Function2<Composer, Integer, Unit> function215 = function212;
                                                Function2<Composer, Integer, Unit> function216 = function213;
                                                Function2<Composer, Integer, Unit> function217 = function214;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, composer4, 48);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, m893sizeInqDBjuR0$default);
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m4976constructorimpl = Updater.m4976constructorimpl(composer4);
                                                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                                }
                                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer4, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 1255250902, "C43@1576L38:MenuButton.kt#aaq0h9");
                                                composer4.startReplaceGroup(594681373);
                                                ComposerKt.sourceInformation(composer4, "41@1533L8");
                                                if (function215 != null) {
                                                    function215.invoke(composer4, 0);
                                                }
                                                composer4.endReplaceGroup();
                                                composer4.startReplaceGroup(594682205);
                                                ComposerKt.sourceInformation(composer4, "42@1559L8");
                                                if (function216 != null) {
                                                    function216.invoke(composer4, 0);
                                                }
                                                composer4.endReplaceGroup();
                                                SpacerKt.m10818SpacerorJrPs(0.0f, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0, 1);
                                                composer4.startReplaceGroup(594684765);
                                                ComposerKt.sourceInformation(composer4, "44@1639L8");
                                                if (function217 != null) {
                                                    function217.invoke(composer4, 0);
                                                }
                                                composer4.endReplaceGroup();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 0, 24576, 16380);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54);
                                if (!z3) {
                                    startRestartGroup.startReplaceGroup(-1846964439);
                                    ComposerKt.sourceInformation(startRestartGroup, "51@1741L12,53@1790L32,50@1692L130");
                                    modifier3 = companion;
                                    SurfaceKt.m10819RoundedSurfaceOu1YvPQ(modifier3, NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10771getXlD9Ej5fM(), 0L, null, ComposableLambdaKt.rememberComposableLambda(-1451468391, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i12) {
                                            ComposerKt.sourceInformation(composer3, "C54@1798L18:MenuButton.kt#aaq0h9");
                                            if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1451468391, i12, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous> (MenuButton.kt:54)");
                                            }
                                            rememberComposableLambda.invoke(composer3, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 24576, 12);
                                    composer2 = startRestartGroup;
                                    composer2.endReplaceGroup();
                                    z5 = z7;
                                } else {
                                    Modifier modifier5 = companion;
                                    composer2 = startRestartGroup;
                                    composer2.startReplaceGroup(-1846821870);
                                    ComposerKt.sourceInformation(composer2, "57@1838L57");
                                    ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier5);
                                    modifier3 = modifier5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    z5 = z7;
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
                                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -177405638, "C58@1871L18:MenuButton.kt#aaq0h9");
                                    rememberComposableLambda.invoke(composer2, 6);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                function27 = function24;
                                function28 = function25;
                                function03 = function04;
                                z6 = z5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                f3 = f;
                                composer2 = startRestartGroup;
                                modifier4 = modifier2;
                                function27 = function24;
                                function28 = function25;
                                z6 = z2;
                                function03 = function0;
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function212 = function26;
                            final boolean z8 = z3;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit NewMenuButton_0vH8DBg$lambda$3;
                                        NewMenuButton_0vH8DBg$lambda$3 = MenuButtonKt.NewMenuButton_0vH8DBg$lambda$3(Modifier.this, function27, function28, function212, z8, z6, f3, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return NewMenuButton_0vH8DBg$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        if ((i3 & 4793491) == 4793490) {
                        }
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "28@1075L7,29@1112L2");
                        if ((i & 1) != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final boolean z72 = z4;
                        final float f42 = f2;
                        final Function2<? super Composer, ? super Integer, Unit> function292 = function24;
                        final Function0<Unit> function042 = function02;
                        final Function2<? super Composer, ? super Integer, Unit> function2102 = function25;
                        final Function2<? super Composer, ? super Integer, Unit> function2112 = function26;
                        f3 = f42;
                        final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1213582955, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                ComposerKt.sourceInformation(composer3, "C32@1207L454,32@1162L499:MenuButton.kt#aaq0h9");
                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1213582955, i12, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous> (MenuButton.kt:32)");
                                }
                                Function0<Unit> function05 = function042;
                                boolean z82 = z72;
                                final float f5 = f42;
                                final Function2<? super Composer, ? super Integer, Unit> function2122 = function292;
                                final Function2<? super Composer, ? super Integer, Unit> function213 = function2102;
                                final Function2<? super Composer, ? super Integer, Unit> function214 = function2112;
                                ButtonKt.m9489ButtonY0X4mI(function05, z82, null, 0L, 0L, null, 0L, 0.0f, null, 0, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-258172871, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                        invoke(rowScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope Button, Composer composer4, int i13) {
                                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                        ComposerKt.sourceInformation(composer4, "C37@1402L6,38@1459L7,33@1215L440:MenuButton.kt#aaq0h9");
                                        if ((i13 & 17) == 16 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-258172871, i13, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous>.<anonymous> (MenuButton.kt:33)");
                                        }
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(f5);
                                        Modifier m893sizeInqDBjuR0$default = SizeKt.m893sizeInqDBjuR0$default(PaddingKt.m837padding3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, NewAppTheme.INSTANCE.getColors(composer4, 6).getBackground().getSubtle(), null, 2, null), NewAppTheme.INSTANCE.getSpacing(composer4, 6).m10808get3D9Ej5fM()), 0.0f, Dp.m8401constructorimpl(32), 0.0f, 0.0f, 13, null);
                                        Function2<Composer, Integer, Unit> function215 = function2122;
                                        Function2<Composer, Integer, Unit> function216 = function213;
                                        Function2<Composer, Integer, Unit> function217 = function214;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, composer4, 48);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, m893sizeInqDBjuR0$default);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer4);
                                        Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                                        }
                                        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 1255250902, "C43@1576L38:MenuButton.kt#aaq0h9");
                                        composer4.startReplaceGroup(594681373);
                                        ComposerKt.sourceInformation(composer4, "41@1533L8");
                                        if (function215 != null) {
                                            function215.invoke(composer4, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.startReplaceGroup(594682205);
                                        ComposerKt.sourceInformation(composer4, "42@1559L8");
                                        if (function216 != null) {
                                            function216.invoke(composer4, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        SpacerKt.m10818SpacerorJrPs(0.0f, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0, 1);
                                        composer4.startReplaceGroup(594684765);
                                        ComposerKt.sourceInformation(composer4, "44@1639L8");
                                        if (function217 != null) {
                                            function217.invoke(composer4, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 0, 24576, 16380);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54);
                        if (!z3) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        function27 = function24;
                        function28 = function25;
                        function03 = function042;
                        z6 = z5;
                        final Function2 function2122 = function26;
                        final boolean z82 = z3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z3 = z;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "28@1075L7,29@1112L2");
                    if ((i & 1) != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final boolean z722 = z4;
                    final float f422 = f2;
                    final Function2<? super Composer, ? super Integer, Unit> function2922 = function24;
                    final Function0<Unit> function0422 = function02;
                    final Function2<? super Composer, ? super Integer, Unit> function21022 = function25;
                    final Function2<? super Composer, ? super Integer, Unit> function21122 = function26;
                    f3 = f422;
                    final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda22 = ComposableLambdaKt.rememberComposableLambda(1213582955, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i12) {
                            ComposerKt.sourceInformation(composer3, "C32@1207L454,32@1162L499:MenuButton.kt#aaq0h9");
                            if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1213582955, i12, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous> (MenuButton.kt:32)");
                            }
                            Function0<Unit> function05 = function0422;
                            boolean z822 = z722;
                            final float f5 = f422;
                            final Function2<? super Composer, ? super Integer, Unit> function21222 = function2922;
                            final Function2<? super Composer, ? super Integer, Unit> function213 = function21022;
                            final Function2<? super Composer, ? super Integer, Unit> function214 = function21122;
                            ButtonKt.m9489ButtonY0X4mI(function05, z822, null, 0L, 0L, null, 0L, 0.0f, null, 0, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-258172871, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                    invoke(rowScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer4, int i13) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    ComposerKt.sourceInformation(composer4, "C37@1402L6,38@1459L7,33@1215L440:MenuButton.kt#aaq0h9");
                                    if ((i13 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-258172871, i13, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous>.<anonymous> (MenuButton.kt:33)");
                                    }
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(f5);
                                    Modifier m893sizeInqDBjuR0$default = SizeKt.m893sizeInqDBjuR0$default(PaddingKt.m837padding3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, NewAppTheme.INSTANCE.getColors(composer4, 6).getBackground().getSubtle(), null, 2, null), NewAppTheme.INSTANCE.getSpacing(composer4, 6).m10808get3D9Ej5fM()), 0.0f, Dp.m8401constructorimpl(32), 0.0f, 0.0f, 13, null);
                                    Function2<Composer, Integer, Unit> function215 = function21222;
                                    Function2<Composer, Integer, Unit> function216 = function213;
                                    Function2<Composer, Integer, Unit> function217 = function214;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, composer4, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, m893sizeInqDBjuR0$default);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer4);
                                    Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                        m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 1255250902, "C43@1576L38:MenuButton.kt#aaq0h9");
                                    composer4.startReplaceGroup(594681373);
                                    ComposerKt.sourceInformation(composer4, "41@1533L8");
                                    if (function215 != null) {
                                        function215.invoke(composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(594682205);
                                    ComposerKt.sourceInformation(composer4, "42@1559L8");
                                    if (function216 != null) {
                                        function216.invoke(composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    SpacerKt.m10818SpacerorJrPs(0.0f, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0, 1);
                                    composer4.startReplaceGroup(594684765);
                                    ComposerKt.sourceInformation(composer4, "44@1639L8");
                                    if (function217 != null) {
                                        function217.invoke(composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    composer4.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 0, 24576, 16380);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54);
                    if (!z3) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    function27 = function24;
                    function28 = function25;
                    function03 = function0422;
                    z6 = z5;
                    final Function2 function21222 = function26;
                    final boolean z822 = z3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function26 = function23;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z3 = z;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i8;
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "28@1075L7,29@1112L2");
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (i9 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final boolean z7222 = z4;
                final float f4222 = f2;
                final Function2<? super Composer, ? super Integer, Unit> function29222 = function24;
                final Function0<Unit> function04222 = function02;
                final Function2<? super Composer, ? super Integer, Unit> function210222 = function25;
                final Function2<? super Composer, ? super Integer, Unit> function211222 = function26;
                f3 = f4222;
                final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda222 = ComposableLambdaKt.rememberComposableLambda(1213582955, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i12) {
                        ComposerKt.sourceInformation(composer3, "C32@1207L454,32@1162L499:MenuButton.kt#aaq0h9");
                        if ((i12 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1213582955, i12, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous> (MenuButton.kt:32)");
                        }
                        Function0<Unit> function05 = function04222;
                        boolean z8222 = z7222;
                        final float f5 = f4222;
                        final Function2<? super Composer, ? super Integer, Unit> function212222 = function29222;
                        final Function2<? super Composer, ? super Integer, Unit> function213 = function210222;
                        final Function2<? super Composer, ? super Integer, Unit> function214 = function211222;
                        ButtonKt.m9489ButtonY0X4mI(function05, z8222, null, 0L, 0L, null, 0L, 0.0f, null, 0, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-258172871, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                invoke(rowScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer4, int i13) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                ComposerKt.sourceInformation(composer4, "C37@1402L6,38@1459L7,33@1215L440:MenuButton.kt#aaq0h9");
                                if ((i13 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-258172871, i13, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous>.<anonymous> (MenuButton.kt:33)");
                                }
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(f5);
                                Modifier m893sizeInqDBjuR0$default = SizeKt.m893sizeInqDBjuR0$default(PaddingKt.m837padding3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, NewAppTheme.INSTANCE.getColors(composer4, 6).getBackground().getSubtle(), null, 2, null), NewAppTheme.INSTANCE.getSpacing(composer4, 6).m10808get3D9Ej5fM()), 0.0f, Dp.m8401constructorimpl(32), 0.0f, 0.0f, 13, null);
                                Function2<Composer, Integer, Unit> function215 = function212222;
                                Function2<Composer, Integer, Unit> function216 = function213;
                                Function2<Composer, Integer, Unit> function217 = function214;
                                ComposerKt.sourceInformationMarkerStart(composer4, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, composer4, 48);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, m893sizeInqDBjuR0$default);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer4);
                                Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                    m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                                }
                                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer4, 1255250902, "C43@1576L38:MenuButton.kt#aaq0h9");
                                composer4.startReplaceGroup(594681373);
                                ComposerKt.sourceInformation(composer4, "41@1533L8");
                                if (function215 != null) {
                                    function215.invoke(composer4, 0);
                                }
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(594682205);
                                ComposerKt.sourceInformation(composer4, "42@1559L8");
                                if (function216 != null) {
                                    function216.invoke(composer4, 0);
                                }
                                composer4.endReplaceGroup();
                                SpacerKt.m10818SpacerorJrPs(0.0f, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0, 1);
                                composer4.startReplaceGroup(594684765);
                                ComposerKt.sourceInformation(composer4, "44@1639L8");
                                if (function217 != null) {
                                    function217.invoke(composer4, 0);
                                }
                                composer4.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 0, 24576, 16380);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54);
                if (!z3) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                function27 = function24;
                function28 = function25;
                function03 = function04222;
                z6 = z5;
                final Function2 function212222 = function26;
                final boolean z8222 = z3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function25 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function26 = function23;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z3 = z;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i8;
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "28@1075L7,29@1112L2");
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (i9 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final boolean z72222 = z4;
            final float f42222 = f2;
            final Function2<? super Composer, ? super Integer, Unit> function292222 = function24;
            final Function0<Unit> function042222 = function02;
            final Function2<? super Composer, ? super Integer, Unit> function2102222 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function2112222 = function26;
            f3 = f42222;
            final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda2222 = ComposableLambdaKt.rememberComposableLambda(1213582955, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i12) {
                    ComposerKt.sourceInformation(composer3, "C32@1207L454,32@1162L499:MenuButton.kt#aaq0h9");
                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1213582955, i12, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous> (MenuButton.kt:32)");
                    }
                    Function0<Unit> function05 = function042222;
                    boolean z82222 = z72222;
                    final float f5 = f42222;
                    final Function2<? super Composer, ? super Integer, Unit> function2122222 = function292222;
                    final Function2<? super Composer, ? super Integer, Unit> function213 = function2102222;
                    final Function2<? super Composer, ? super Integer, Unit> function214 = function2112222;
                    ButtonKt.m9489ButtonY0X4mI(function05, z82222, null, 0L, 0L, null, 0L, 0.0f, null, 0, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-258172871, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                            invoke(rowScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope Button, Composer composer4, int i13) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            ComposerKt.sourceInformation(composer4, "C37@1402L6,38@1459L7,33@1215L440:MenuButton.kt#aaq0h9");
                            if ((i13 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-258172871, i13, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous>.<anonymous> (MenuButton.kt:33)");
                            }
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(f5);
                            Modifier m893sizeInqDBjuR0$default = SizeKt.m893sizeInqDBjuR0$default(PaddingKt.m837padding3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, NewAppTheme.INSTANCE.getColors(composer4, 6).getBackground().getSubtle(), null, 2, null), NewAppTheme.INSTANCE.getSpacing(composer4, 6).m10808get3D9Ej5fM()), 0.0f, Dp.m8401constructorimpl(32), 0.0f, 0.0f, 13, null);
                            Function2<Composer, Integer, Unit> function215 = function2122222;
                            Function2<Composer, Integer, Unit> function216 = function213;
                            Function2<Composer, Integer, Unit> function217 = function214;
                            ComposerKt.sourceInformationMarkerStart(composer4, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, composer4, 48);
                            ComposerKt.sourceInformationMarkerStart(composer4, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, m893sizeInqDBjuR0$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer4);
                            Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                            }
                            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer4, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer4, 1255250902, "C43@1576L38:MenuButton.kt#aaq0h9");
                            composer4.startReplaceGroup(594681373);
                            ComposerKt.sourceInformation(composer4, "41@1533L8");
                            if (function215 != null) {
                                function215.invoke(composer4, 0);
                            }
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(594682205);
                            ComposerKt.sourceInformation(composer4, "42@1559L8");
                            if (function216 != null) {
                                function216.invoke(composer4, 0);
                            }
                            composer4.endReplaceGroup();
                            SpacerKt.m10818SpacerorJrPs(0.0f, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0, 1);
                            composer4.startReplaceGroup(594684765);
                            ComposerKt.sourceInformation(composer4, "44@1639L8");
                            if (function217 != null) {
                                function217.invoke(composer4, 0);
                            }
                            composer4.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 0, 24576, 16380);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54);
            if (!z3) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            function27 = function24;
            function28 = function25;
            function03 = function042222;
            z6 = z5;
            final Function2 function2122222 = function26;
            final boolean z82222 = z3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function24 = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function25 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function26 = function23;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        ComposerKt.sourceInformation(startRestartGroup, "28@1075L7,29@1112L2");
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (i9 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final boolean z722222 = z4;
        final float f422222 = f2;
        final Function2<? super Composer, ? super Integer, Unit> function2922222 = function24;
        final Function0<Unit> function0422222 = function02;
        final Function2<? super Composer, ? super Integer, Unit> function21022222 = function25;
        final Function2<? super Composer, ? super Integer, Unit> function21122222 = function26;
        f3 = f422222;
        final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda22222 = ComposableLambdaKt.rememberComposableLambda(1213582955, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i12) {
                ComposerKt.sourceInformation(composer3, "C32@1207L454,32@1162L499:MenuButton.kt#aaq0h9");
                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1213582955, i12, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous> (MenuButton.kt:32)");
                }
                Function0<Unit> function05 = function0422222;
                boolean z822222 = z722222;
                final float f5 = f422222;
                final Function2<? super Composer, ? super Integer, Unit> function21222222 = function2922222;
                final Function2<? super Composer, ? super Integer, Unit> function213 = function21022222;
                final Function2<? super Composer, ? super Integer, Unit> function214 = function21122222;
                ButtonKt.m9489ButtonY0X4mI(function05, z822222, null, 0L, 0L, null, 0L, 0.0f, null, 0, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-258172871, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.ui.MenuButtonKt$NewMenuButton$contentComponent$1.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                        invoke(rowScope, composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer4, int i13) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        ComposerKt.sourceInformation(composer4, "C37@1402L6,38@1459L7,33@1215L440:MenuButton.kt#aaq0h9");
                        if ((i13 & 17) == 16 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-258172871, i13, -1, "expo.modules.devmenu.compose.ui.NewMenuButton.<anonymous>.<anonymous> (MenuButton.kt:33)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(f5);
                        Modifier m893sizeInqDBjuR0$default = SizeKt.m893sizeInqDBjuR0$default(PaddingKt.m837padding3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, NewAppTheme.INSTANCE.getColors(composer4, 6).getBackground().getSubtle(), null, 2, null), NewAppTheme.INSTANCE.getSpacing(composer4, 6).m10808get3D9Ej5fM()), 0.0f, Dp.m8401constructorimpl(32), 0.0f, 0.0f, 13, null);
                        Function2<Composer, Integer, Unit> function215 = function21222222;
                        Function2<Composer, Integer, Unit> function216 = function213;
                        Function2<Composer, Integer, Unit> function217 = function214;
                        ComposerKt.sourceInformationMarkerStart(composer4, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, composer4, 48);
                        ComposerKt.sourceInformationMarkerStart(composer4, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, m893sizeInqDBjuR0$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer4.useNode();
                        }
                        Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer4);
                        Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                        }
                        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer4, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer4, 1255250902, "C43@1576L38:MenuButton.kt#aaq0h9");
                        composer4.startReplaceGroup(594681373);
                        ComposerKt.sourceInformation(composer4, "41@1533L8");
                        if (function215 != null) {
                            function215.invoke(composer4, 0);
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(594682205);
                        ComposerKt.sourceInformation(composer4, "42@1559L8");
                        if (function216 != null) {
                            function216.invoke(composer4, 0);
                        }
                        composer4.endReplaceGroup();
                        SpacerKt.m10818SpacerorJrPs(0.0f, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0, 1);
                        composer4.startReplaceGroup(594684765);
                        ComposerKt.sourceInformation(composer4, "44@1639L8");
                        if (function217 != null) {
                            function217.invoke(composer4, 0);
                        }
                        composer4.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 0, 24576, 16380);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54);
        if (!z3) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        function27 = function24;
        function28 = function25;
        function03 = function0422222;
        z6 = z5;
        final Function2 function21222222 = function26;
        final boolean z822222 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
