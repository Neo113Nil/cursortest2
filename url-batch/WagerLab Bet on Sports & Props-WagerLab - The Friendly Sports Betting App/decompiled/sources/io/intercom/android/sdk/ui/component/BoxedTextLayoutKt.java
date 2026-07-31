package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.reactcommunity.rndatetimepicker.Common;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoxedTextLayout.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aw\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\r2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"BoxedTextLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", ViewProps.BORDER_COLOR, "Landroidx/compose/ui/graphics/Color;", Common.TEXT_COLOR, "trialingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "leadingIcon", "BoxedTextLayout-Y0xEhic", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BoxedTextLayoutKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoxedTextLayout_Y0xEhic$lambda$1(Modifier modifier, String text, long j, long j2, Function3 function3, Function3 function32, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        m11947BoxedTextLayoutY0xEhic(modifier, text, j, j2, function3, function32, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a1  */
    /* renamed from: BoxedTextLayout-Y0xEhic, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11947BoxedTextLayoutY0xEhic(Modifier modifier, final String text, final long j, long j2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        int i4;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        Modifier.Companion companion;
        long j4;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function35;
        int hashCode;
        Composer m4976constructorimpl;
        Composer composer2;
        final long j5;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function36;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1728859823);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                j3 = j2;
                if (startRestartGroup.changed(j3)) {
                    i6 = 2048;
                    i3 |= i6;
                }
            } else {
                j3 = j2;
            }
            i6 = 1024;
            i3 |= i6;
        } else {
            j3 = j2;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            function33 = function3;
            i3 |= startRestartGroup.changedInstance(function33) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                function34 = function32;
                i3 |= startRestartGroup.changedInstance(function34) ? 131072 : 65536;
                if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            j4 = IntercomTheme.INSTANCE.getColors(startRestartGroup, 6).m12174getPrimaryText0d7_KjU();
                            i3 &= -7169;
                        } else {
                            j4 = j3;
                        }
                        if (i8 != 0) {
                            function33 = null;
                        }
                        i5 = i3;
                        if (i4 != 0) {
                            function34 = null;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        companion = modifier2;
                        i5 = i3;
                        j4 = j3;
                    }
                    function35 = function33;
                    startRestartGroup.endDefaults();
                    float f = 8;
                    Modifier m837padding3ABfNKs = PaddingKt.m837padding3ABfNKs(ClipKt.clip(BorderKt.m274borderxT4_qwU(companion, Dp.m8401constructorimpl(1), j, IntercomTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall()), RoundedCornerShapeKt.RoundedCornerShape(2)), Dp.m8401constructorimpl(f));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
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
                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(581650633);
                    if (function35 != null) {
                        function35.invoke(rowScopeInstance, startRestartGroup, Integer.valueOf(6 | ((i5 >> 9) & 112)));
                    }
                    startRestartGroup.endReplaceGroup();
                    long j6 = j4;
                    Modifier modifier4 = companion;
                    TextKt.m3581TextNvy7gAk(text, rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false), j6, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, 6).getType04(), startRestartGroup, (i5 >> 3) & 910, 24960, 110584);
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(581663143);
                    function34 = function34;
                    if (function34 != null) {
                        function34.invoke(rowScopeInstance, composer2, Integer.valueOf(6 | ((i5 >> 12) & 112)));
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    j5 = j6;
                    function36 = function35;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    modifier3 = modifier2;
                    j5 = j3;
                    function36 = function33;
                }
                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function37 = function34;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.BoxedTextLayoutKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BoxedTextLayout_Y0xEhic$lambda$1;
                            BoxedTextLayout_Y0xEhic$lambda$1 = BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(Modifier.this, text, j, j5, function36, function37, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BoxedTextLayout_Y0xEhic$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            function34 = function32;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i8 != 0) {
            }
            i5 = i3;
            if (i4 != 0) {
            }
            function35 = function33;
            startRestartGroup.endDefaults();
            float f2 = 8;
            Modifier m837padding3ABfNKs2 = PaddingKt.m837padding3ABfNKs(ClipKt.clip(BorderKt.m274borderxT4_qwU(companion, Dp.m8401constructorimpl(1), j, IntercomTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall()), RoundedCornerShapeKt.RoundedCornerShape(2)), Dp.m8401constructorimpl(f2));
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical m696spacedBy0680j_42 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f2));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m696spacedBy0680j_42, centerVertically2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m837padding3ABfNKs2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(581650633);
            if (function35 != null) {
            }
            startRestartGroup.endReplaceGroup();
            long j62 = j4;
            Modifier modifier42 = companion;
            TextKt.m3581TextNvy7gAk(text, rowScopeInstance2.weight(Modifier.INSTANCE, 1.0f, false), j62, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, 6).getType04(), startRestartGroup, (i5 >> 3) & 910, 24960, 110584);
            composer2 = startRestartGroup;
            composer2.startReplaceGroup(581663143);
            function34 = function34;
            if (function34 != null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            j5 = j62;
            function36 = function35;
            modifier3 = modifier42;
            final Function3 function372 = function34;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function33 = function3;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function34 = function32;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i8 != 0) {
        }
        i5 = i3;
        if (i4 != 0) {
        }
        function35 = function33;
        startRestartGroup.endDefaults();
        float f22 = 8;
        Modifier m837padding3ABfNKs22 = PaddingKt.m837padding3ABfNKs(ClipKt.clip(BorderKt.m274borderxT4_qwU(companion, Dp.m8401constructorimpl(1), j, IntercomTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall()), RoundedCornerShapeKt.RoundedCornerShape(2)), Dp.m8401constructorimpl(f22));
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m696spacedBy0680j_422 = Arrangement.INSTANCE.m696spacedBy0680j_4(Dp.m8401constructorimpl(f22));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m696spacedBy0680j_422, centerVertically22, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m837padding3ABfNKs22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash22);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(581650633);
        if (function35 != null) {
        }
        startRestartGroup.endReplaceGroup();
        long j622 = j4;
        Modifier modifier422 = companion;
        TextKt.m3581TextNvy7gAk(text, rowScopeInstance22.weight(Modifier.INSTANCE, 1.0f, false), j622, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, 6).getType04(), startRestartGroup, (i5 >> 3) & 910, 24960, 110584);
        composer2 = startRestartGroup;
        composer2.startReplaceGroup(581663143);
        function34 = function34;
        if (function34 != null) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        j5 = j622;
        function36 = function35;
        modifier3 = modifier422;
        final Function3 function3722 = function34;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
