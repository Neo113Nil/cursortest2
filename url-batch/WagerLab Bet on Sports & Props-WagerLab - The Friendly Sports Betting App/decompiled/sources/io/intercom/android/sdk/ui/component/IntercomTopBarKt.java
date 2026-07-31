package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomTopBar.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u001a"}, d2 = {"IntercomTopBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "navIcon", "Lio/intercom/android/sdk/ui/component/IntercomTopBarIcon;", "contentAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "onContentClick", "Lkotlin/Function0;", "menuItems", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "IntercomTopBar-bogVsAg", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lio/intercom/android/sdk/ui/component/IntercomTopBarIcon;Landroidx/compose/ui/Alignment$Horizontal;JJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "IntercomTopBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "IntercomTopBarPreviewWithoutNavIcon", "IntercomTopBarPreviewWithMenuItems", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomTopBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBarPreview$lambda$8(int i, Composer composer, int i2) {
        IntercomTopBarPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBarPreviewWithMenuItems$lambda$10(int i, Composer composer, int i2) {
        IntercomTopBarPreviewWithMenuItems(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBarPreviewWithoutNavIcon$lambda$9(int i, Composer composer, int i2) {
        IntercomTopBarPreviewWithoutNavIcon(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBar_bogVsAg$lambda$7(Modifier modifier, String str, IntercomTopBarIcon intercomTopBarIcon, Alignment.Horizontal horizontal, long j, long j2, Function0 function0, Function3 function3, int i, int i2, Composer composer, int i3) {
        m11988IntercomTopBarbogVsAg(modifier, str, intercomTopBarIcon, horizontal, j, j2, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0411  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* renamed from: IntercomTopBar-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11988IntercomTopBarbogVsAg(Modifier modifier, String str, IntercomTopBarIcon intercomTopBarIcon, Alignment.Horizontal horizontal, long j, long j2, Function0<Unit> function0, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final IntercomTopBarIcon intercomTopBarIcon2;
        int i5;
        Alignment.Horizontal horizontal2;
        long j3;
        long j4;
        int i6;
        Function0<Unit> function02;
        int i7;
        int i8;
        Modifier.Companion companion;
        Alignment.Horizontal start;
        long j5;
        final Function0<Unit> function03;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        String str2;
        int hashCode;
        Composer m4976constructorimpl;
        boolean z;
        Object rememberedValue;
        int hashCode2;
        Composer m4976constructorimpl2;
        int i9;
        float m8401constructorimpl;
        int hashCode3;
        Composer m4976constructorimpl3;
        String str3;
        final long j6;
        Composer composer2;
        ?? r0;
        long j7;
        final IntercomTopBarIcon intercomTopBarIcon3;
        final String str4;
        final long j8;
        final long j9;
        final Modifier modifier2;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final Alignment.Horizontal horizontal3;
        final Function0<Unit> function04;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(832461575);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                intercomTopBarIcon2 = intercomTopBarIcon;
                i3 |= startRestartGroup.changed(intercomTopBarIcon2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        j3 = j;
                        i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                    } else {
                        j3 = j;
                    }
                    if ((458752 & i) != 0) {
                        j4 = j2;
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                    } else {
                        j4 = j2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i8 = i10;
                        i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                        if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i8 != 0 ? Modifier.INSTANCE : modifier;
                                String str5 = i11 != 0 ? null : str;
                                if (i4 != 0) {
                                    intercomTopBarIcon2 = null;
                                }
                                start = i5 != 0 ? Alignment.INSTANCE.getStart() : horizontal;
                                if ((i2 & 16) != 0) {
                                    j3 = IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m12164getHeader0d7_KjU();
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    j4 = IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m12171getOnHeader0d7_KjU();
                                    i3 &= -458753;
                                }
                                Function0<Unit> function05 = i6 != 0 ? new Function0() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit unit;
                                        unit = Unit.INSTANCE;
                                        return unit;
                                    }
                                } : function02;
                                if (i7 != 0) {
                                    j5 = j4;
                                    function03 = function05;
                                    function32 = null;
                                } else {
                                    j5 = j4;
                                    function03 = function05;
                                    function32 = function3;
                                }
                                str2 = str5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                companion = modifier;
                                str2 = str;
                                start = horizontal;
                                j5 = j4;
                                function03 = function02;
                                function32 = function3;
                            }
                            startRestartGroup.endDefaults();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            Modifier modifier3 = companion;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            int i12 = i3;
                            long j10 = j3;
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
                            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            Modifier m839paddingVpY3zN4$default = PaddingKt.m839paddingVpY3zN4$default(SizeKt.m875height3ABfNKs(SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(modifier3, j10, null, 2, null)), 0.0f, 1, null), Dp.m8401constructorimpl(56)), Dp.m8401constructorimpl(4), 0.0f, 2, null);
                            startRestartGroup.startReplaceGroup(86796077);
                            z = (i12 & 3670016) == 1048576;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
                                        IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1 = IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(Function0.this);
                                        return IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier m303clickableoSLSa3U$default = ClickableKt.m303clickableoSLSa3U$default(m839paddingVpY3zN4$default, false, null, null, null, (Function0) rememberedValue, 15, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            Function0<Unit> function06 = function03;
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
                            m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                            Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                            }
                            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (intercomTopBarIcon2 == null && !Intrinsics.areEqual(start, Alignment.INSTANCE.getCenterHorizontally())) {
                                i9 = 16;
                                m8401constructorimpl = Dp.m8401constructorimpl(Dp.m8401constructorimpl(48) + Dp.m8401constructorimpl(16));
                            } else {
                                i9 = 16;
                                m8401constructorimpl = Dp.m8401constructorimpl(16);
                            }
                            Modifier m841paddingqDBjuR0$default = PaddingKt.m841paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m8401constructorimpl, 0.0f, Dp.m8401constructorimpl(i9), 0.0f, 10, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            int i13 = i12 >> 3;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center, start, startRestartGroup, 6 | ((((i13 & 896) | 48) >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m841paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
                            Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                                m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                                m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                            }
                            Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(560412879);
                            if (str2 != null) {
                                int m8309getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8();
                                TextStyle m7848copyp1EtxEg$default = TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, 6).getType03(), j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                j6 = j5;
                                r0 = 1;
                                TextKt.m3581TextNvy7gAk(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, m8309getEllipsisgIe3tQ8, false, 1, 0, null, m7848copyp1EtxEg$default, startRestartGroup, i13 & 14, 24960, 110590);
                                str3 = str2;
                                composer2 = startRestartGroup;
                            } else {
                                str3 = str2;
                                j6 = j5;
                                composer2 = startRestartGroup;
                                r0 = 1;
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.startReplaceGroup(-1319827237);
                            if (intercomTopBarIcon2 != null) {
                                j7 = j6;
                                IconButtonKt.IconButton(intercomTopBarIcon2.getOnClick(), boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-423583748, r0, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        if ((i14 & 11) != 2 || !composer3.getSkipping()) {
                                            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(IntercomTopBarIcon.this.getIconRes(), composer3, 0), IntercomTopBarIcon.this.getContentDescription(), SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24)), j6, composer3, 392, 0);
                                        } else {
                                            composer3.skipToGroupEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 1572864, 60);
                            } else {
                                j7 = j6;
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1319809649);
                            if (function32 != null) {
                                Modifier align = boxScopeInstance.align(SizeKt.wrapContentWidth$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, r0, null), null, false, 3, null), Alignment.INSTANCE.getCenterEnd());
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, align);
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
                                Updater.m4983setimpl(m4976constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4976constructorimpl4.getInserting() || !Intrinsics.areEqual(m4976constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
                                    m4976constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
                                    m4976constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
                                }
                                Updater.m4983setimpl(m4976constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                function32.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(6 | ((i12 >> 18) & 112)));
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            IntercomDividerKt.IntercomDivider(null, composer2, 0, r0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            intercomTopBarIcon3 = intercomTopBarIcon2;
                            str4 = str3;
                            j8 = j7;
                            j9 = j10;
                            modifier2 = modifier3;
                            function33 = function32;
                            horizontal3 = start;
                            function04 = function06;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            str4 = str;
                            composer2 = startRestartGroup;
                            j9 = j3;
                            function04 = function02;
                            j8 = j4;
                            intercomTopBarIcon3 = intercomTopBarIcon2;
                            horizontal3 = horizontal2;
                            function33 = function3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit IntercomTopBar_bogVsAg$lambda$7;
                                    IntercomTopBar_bogVsAg$lambda$7 = IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$7(Modifier.this, str4, intercomTopBarIcon3, horizontal3, j9, j8, function04, function33, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return IntercomTopBar_bogVsAg$lambda$7;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i10;
                    if ((i3 & 23967451) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    str2 = str5;
                    startRestartGroup.endDefaults();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    Modifier modifier32 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    int i122 = i3;
                    long j102 = j3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl.getInserting()) {
                    }
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash5);
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Modifier m839paddingVpY3zN4$default2 = PaddingKt.m839paddingVpY3zN4$default(SizeKt.m875height3ABfNKs(SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(modifier32, j102, null, 2, null)), 0.0f, 1, null), Dp.m8401constructorimpl(56)), Dp.m8401constructorimpl(4), 0.0f, 2, null);
                    startRestartGroup.startReplaceGroup(86796077);
                    if ((i122 & 3670016) == 1048576) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
                            IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1 = IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(Function0.this);
                            return IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    Modifier m303clickableoSLSa3U$default2 = ClickableKt.m303clickableoSLSa3U$default(m839paddingVpY3zN4$default2, false, null, null, null, (Function0) rememberedValue, 15, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default2);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    Function0<Unit> function062 = function03;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl2.getInserting()) {
                    }
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22);
                    Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (intercomTopBarIcon2 == null) {
                    }
                    i9 = 16;
                    m8401constructorimpl = Dp.m8401constructorimpl(16);
                    Modifier m841paddingqDBjuR0$default2 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m8401constructorimpl, 0.0f, Dp.m8401constructorimpl(i9), 0.0f, 10, null);
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    int i132 = i122 >> 3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(center2, start, startRestartGroup, 6 | ((((i132 & 896) | 48) >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m841paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl3.getInserting()) {
                    }
                    m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                    m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash32);
                    Updater.m4983setimpl(m4976constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(560412879);
                    if (str2 != null) {
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.startReplaceGroup(-1319827237);
                    if (intercomTopBarIcon2 != null) {
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1319809649);
                    if (function32 != null) {
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    IntercomDividerKt.IntercomDivider(null, composer2, 0, r0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    intercomTopBarIcon3 = intercomTopBarIcon2;
                    str4 = str3;
                    j8 = j7;
                    j9 = j102;
                    modifier2 = modifier32;
                    function33 = function32;
                    horizontal3 = start;
                    function04 = function062;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                horizontal2 = horizontal;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i10;
                if ((i3 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                str2 = str5;
                startRestartGroup.endDefaults();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier.Companion companion222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                Modifier modifier322 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
                Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                int i1222 = i3;
                long j1022 = j3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash52);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                Modifier m839paddingVpY3zN4$default22 = PaddingKt.m839paddingVpY3zN4$default(SizeKt.m875height3ABfNKs(SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(modifier322, j1022, null, 2, null)), 0.0f, 1, null), Dp.m8401constructorimpl(56)), Dp.m8401constructorimpl(4), 0.0f, 2, null);
                startRestartGroup.startReplaceGroup(86796077);
                if ((i1222 & 3670016) == 1048576) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
                        IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1 = IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(Function0.this);
                        return IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m303clickableoSLSa3U$default22 = ClickableKt.m303clickableoSLSa3U$default(m839paddingVpY3zN4$default22, false, null, null, null, (Function0) rememberedValue, 15, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default22);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                Function0<Unit> function0622 = function03;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl2.getInserting()) {
                }
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash222);
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                if (intercomTopBarIcon2 == null) {
                }
                i9 = 16;
                m8401constructorimpl = Dp.m8401constructorimpl(16);
                Modifier m841paddingqDBjuR0$default22 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m8401constructorimpl, 0.0f, Dp.m8401constructorimpl(i9), 0.0f, 10, null);
                Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
                int i1322 = i1222 >> 3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(center22, start, startRestartGroup, 6 | ((((i1322 & 896) | 48) >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m841paddingqDBjuR0$default22);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl3.getInserting()) {
                }
                m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash322);
                Updater.m4983setimpl(m4976constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(560412879);
                if (str2 != null) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(-1319827237);
                if (intercomTopBarIcon2 != null) {
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1319809649);
                if (function32 != null) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                IntercomDividerKt.IntercomDivider(null, composer2, 0, r0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                intercomTopBarIcon3 = intercomTopBarIcon2;
                str4 = str3;
                j8 = j7;
                j9 = j1022;
                modifier2 = modifier322;
                function33 = function32;
                horizontal3 = start;
                function04 = function0622;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            intercomTopBarIcon2 = intercomTopBarIcon;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i10;
            if ((i3 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            str2 = str5;
            startRestartGroup.endDefaults();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion2222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            Modifier modifier3222 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222);
            Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
            int i12222 = i3;
            long j10222 = j3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash522);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
            Modifier m839paddingVpY3zN4$default222 = PaddingKt.m839paddingVpY3zN4$default(SizeKt.m875height3ABfNKs(SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(modifier3222, j10222, null, 2, null)), 0.0f, 1, null), Dp.m8401constructorimpl(56)), Dp.m8401constructorimpl(4), 0.0f, 2, null);
            startRestartGroup.startReplaceGroup(86796077);
            if ((i12222 & 3670016) == 1048576) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
                    IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1 = IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(Function0.this);
                    return IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m303clickableoSLSa3U$default222 = ClickableKt.m303clickableoSLSa3U$default(m839paddingVpY3zN4$default222, false, null, null, null, (Function0) rememberedValue, 15, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            Function0<Unit> function06222 = function03;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl2.getInserting()) {
            }
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2222);
            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            if (intercomTopBarIcon2 == null) {
            }
            i9 = 16;
            m8401constructorimpl = Dp.m8401constructorimpl(16);
            Modifier m841paddingqDBjuR0$default222 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m8401constructorimpl, 0.0f, Dp.m8401constructorimpl(i9), 0.0f, 10, null);
            Arrangement.HorizontalOrVertical center222 = Arrangement.INSTANCE.getCenter();
            int i13222 = i12222 >> 3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(center222, start, startRestartGroup, 6 | ((((i13222 & 896) | 48) >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, m841paddingqDBjuR0$default222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl3.getInserting()) {
            }
            m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
            m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3222);
            Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(560412879);
            if (str2 != null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.startReplaceGroup(-1319827237);
            if (intercomTopBarIcon2 != null) {
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1319809649);
            if (function32 != null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            IntercomDividerKt.IntercomDivider(null, composer2, 0, r0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            intercomTopBarIcon3 = intercomTopBarIcon2;
            str4 = str3;
            j8 = j7;
            j9 = j10222;
            modifier2 = modifier3222;
            function33 = function32;
            horizontal3 = start;
            function04 = function06222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        intercomTopBarIcon2 = intercomTopBarIcon;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i10;
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        str2 = str5;
        startRestartGroup.endDefaults();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion22222 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        Modifier modifier32222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22222);
        Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
        int i122222 = i3;
        long j102222 = j3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash5222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3222 = ColumnScopeInstance.INSTANCE;
        Modifier m839paddingVpY3zN4$default2222 = PaddingKt.m839paddingVpY3zN4$default(SizeKt.m875height3ABfNKs(SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(modifier32222, j102222, null, 2, null)), 0.0f, 1, null), Dp.m8401constructorimpl(56)), Dp.m8401constructorimpl(4), 0.0f, 2, null);
        startRestartGroup.startReplaceGroup(86796077);
        if ((i122222 & 3670016) == 1048576) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
                IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1 = IntercomTopBarKt.IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(Function0.this);
                return IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m303clickableoSLSa3U$default2222 = ClickableKt.m303clickableoSLSa3U$default(m839paddingVpY3zN4$default2222, false, null, null, null, (Function0) rememberedValue, 15, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default2222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        Function0<Unit> function062222 = function03;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl2.getInserting()) {
        }
        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
        m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22222);
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        if (intercomTopBarIcon2 == null) {
        }
        i9 = 16;
        m8401constructorimpl = Dp.m8401constructorimpl(16);
        Modifier m841paddingqDBjuR0$default2222 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), m8401constructorimpl, 0.0f, Dp.m8401constructorimpl(i9), 0.0f, 10, null);
        Arrangement.HorizontalOrVertical center2222 = Arrangement.INSTANCE.getCenter();
        int i132222 = i122222 >> 3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(center2222, start, startRestartGroup, 6 | ((((i132222 & 896) | 48) >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, m841paddingqDBjuR0$default2222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl3.getInserting()) {
        }
        m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
        m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash32222);
        Updater.m4983setimpl(m4976constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(560412879);
        if (str2 != null) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.startReplaceGroup(-1319827237);
        if (intercomTopBarIcon2 != null) {
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-1319809649);
        if (function32 != null) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        IntercomDividerKt.IntercomDivider(null, composer2, 0, r0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        intercomTopBarIcon3 = intercomTopBarIcon2;
        str4 = str3;
        j8 = j7;
        j9 = j102222;
        modifier2 = modifier32222;
        function33 = function32;
        horizontal3 = start;
        function04 = function062222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-358701081);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m11951getLambda1$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IntercomTopBarPreview$lambda$8;
                    IntercomTopBarPreview$lambda$8 = IntercomTopBarKt.IntercomTopBarPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return IntercomTopBarPreview$lambda$8;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreviewWithoutNavIcon(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-110907621);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m11952getLambda2$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IntercomTopBarPreviewWithoutNavIcon$lambda$9;
                    IntercomTopBarPreviewWithoutNavIcon$lambda$9 = IntercomTopBarKt.IntercomTopBarPreviewWithoutNavIcon$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return IntercomTopBarPreviewWithoutNavIcon$lambda$9;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreviewWithMenuItems(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2022840780);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m11955getLambda5$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomTopBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IntercomTopBarPreviewWithMenuItems$lambda$10;
                    IntercomTopBarPreviewWithMenuItems$lambda$10 = IntercomTopBarKt.IntercomTopBarPreviewWithMenuItems$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return IntercomTopBarPreviewWithMenuItems$lambda$10;
                }
            });
        }
    }
}
