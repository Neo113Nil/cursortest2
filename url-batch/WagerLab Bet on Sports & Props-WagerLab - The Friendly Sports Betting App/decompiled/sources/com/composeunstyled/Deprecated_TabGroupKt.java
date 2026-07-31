package com.composeunstyled;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusRestorerKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: deprecated.TabGroup.kt */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0001j\u0002`\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00050\u0007H\u0007¢\u0006\u0002\u0010\b\u001a=\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001aw\u0010\u0014\u001a\u00020\n*\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b!\u0010\"\u001a\u0084\u0001\u0010#\u001a\u00020\n*\u00020\u00102\n\u0010$\u001a\u00060\u0001j\u0002`\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u001f2\b\b\u0002\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\n0*¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b+\u0010,\u001a0\u0010-\u001a\u00020\n*\u00020\u00102\n\u0010$\u001a\u00060\u0001j\u0002`\u00052\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\n0*¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010.*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006/"}, d2 = {"TabKey", "", "rememberTabGroupState", "Lcom/composeunstyled/TabGroupState;", "selectedTab", "Lcom/composeunstyled/TabKey;", "orderedTabs", "", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lcom/composeunstyled/TabGroupState;", "TabGroup", "", "state", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Lcom/composeunstyled/TabGroupScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/composeunstyled/TabGroupState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabList", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "activateOnFocus", "", "Landroidx/compose/foundation/layout/RowScope;", "TabList-LHOAhiI", "(Lcom/composeunstyled/TabGroupScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Tab", "key", ViewProps.ENABLED, "indication", "Landroidx/compose/foundation/Indication;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Lkotlin/Function0;", "Tab-uPCbpMU", "(Lcom/composeunstyled/TabGroupScope;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/Indication;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/layout/PaddingValues;JJLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TabPanel", "(Lcom/composeunstyled/TabGroupScope;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Deprecated_TabGroupKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabGroup$lambda$4(TabGroupState tabGroupState, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        TabGroup(tabGroupState, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabList_LHOAhiI$lambda$9(TabGroupScope tabGroupScope, Modifier modifier, Shape shape, long j, long j2, PaddingValues paddingValues, Orientation orientation, boolean z, Function3 function3, int i, int i2, Composer composer, int i3) {
        m9503TabListLHOAhiI(tabGroupScope, modifier, shape, j, j2, paddingValues, orientation, z, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabPanel$lambda$25(TabGroupScope tabGroupScope, String str, Function2 function2, int i, Composer composer, int i2) {
        TabPanel(tabGroupScope, str, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tab_uPCbpMU$lambda$19(TabGroupScope tabGroupScope, String str, Modifier modifier, boolean z, Indication indication, MutableInteractionSource mutableInteractionSource, PaddingValues paddingValues, long j, long j2, Shape shape, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        m9502TabuPCbpMU(tabGroupScope, str, modifier, z, indication, mutableInteractionSource, paddingValues, j, j2, shape, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void TabGroup(final TabGroupState state, Modifier modifier, final Function3<? super TabGroupScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1077944342);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1077944342, i3, -1, "com.composeunstyled.TabGroup (deprecated.TabGroup.kt:96)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TabGroupScope(state);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TabGroupScope tabGroupScope = (TabGroupScope) rememberedValue;
            startRestartGroup.endReplaceGroup();
            int i5 = i3 >> 3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-971809971);
            content.invoke(tabGroupScope, startRestartGroup, Integer.valueOf(i5 & 112));
            startRestartGroup.endReplaceGroup();
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
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TabGroup$lambda$4;
                    TabGroup$lambda$4 = Deprecated_TabGroupKt.TabGroup$lambda$4(TabGroupState.this, modifier2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TabGroup$lambda$4;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /* renamed from: TabList-LHOAhiI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9503TabListLHOAhiI(final TabGroupScope TabList, Modifier modifier, Shape shape, long j, long j2, PaddingValues paddingValues, Orientation orientation, boolean z, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Shape shape2;
        int i5;
        long j3;
        int i6;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        int i9;
        final Orientation orientation2;
        final boolean z2;
        long j4;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        final Shape shape3;
        Orientation orientation3;
        final PaddingValues paddingValues3;
        final long j5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(TabList, "$this$TabList");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(721972346);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(TabList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                shape2 = shape;
                i3 |= startRestartGroup.changed(shape2) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    j3 = j;
                    i3 |= startRestartGroup.changed(j3) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    }
                    i7 = i2 & 16;
                    if (i7 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                        }
                    }
                    i8 = i2 & 32;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(orientation == null ? -1 : orientation.ordinal()) ? 1048576 : 524288;
                    }
                    i9 = i2 & 64;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(content) ? 67108864 : 33554432;
                    }
                    if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            shape2 = RectangleShapeKt.getRectangleShape();
                        }
                        if (i5 != 0) {
                            j3 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                        }
                        long m5693getUnspecified0d7_KjU = i6 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j2;
                        PaddingValues m830PaddingValues0680j_4 = i7 == 0 ? PaddingKt.m830PaddingValues0680j_4(Dp.m8401constructorimpl(0)) : paddingValues2;
                        orientation2 = i8 == 0 ? Orientation.Horizontal : orientation;
                        z2 = i9 == 0 ? true : z;
                        if (ComposerKt.isTraceInProgress()) {
                            j4 = m5693getUnspecified0d7_KjU;
                        } else {
                            j4 = m5693getUnspecified0d7_KjU;
                            ComposerKt.traceEventStart(721972346, i3, -1, "com.composeunstyled.TabList (deprecated.TabGroup.kt:126)");
                        }
                        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localFocusManager);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final FocusManager focusManager = (FocusManager) consume;
                        Modifier focusRestorer$default = FocusRestorerKt.focusRestorer$default(SelectableGroupKt.selectableGroup(modifier2), null, 1, null);
                        startRestartGroup.startReplaceGroup(5004770);
                        changedInstance = startRestartGroup.changedInstance(TabList);
                        int i11 = i3;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit TabList_LHOAhiI$lambda$6$lambda$5;
                                    TabList_LHOAhiI$lambda$6$lambda$5 = Deprecated_TabGroupKt.TabList_LHOAhiI$lambda$6$lambda$5(TabGroupScope.this, (FocusState) obj);
                                    return TabList_LHOAhiI$lambda$6$lambda$5;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier focusGroup = FocusableKt.focusGroup(FocusChangedModifierKt.onFocusChanged(focusRestorer$default, (Function1) rememberedValue));
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changedInstance2 = startRestartGroup.changedInstance(TabList) | ((i11 & 29360128) != 8388608) | startRestartGroup.changedInstance(focusManager) | ((i11 & 3670016) != 1048576);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$TabList$2$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m9504invokeZmokQxo(keyEvent.m6792unboximpl());
                                }

                                static /* synthetic */ void invoke_ZmokQxo$moveFocusTo$default(boolean z3, TabGroupScope tabGroupScope, String str, boolean z4, int i12, Object obj) {
                                    if ((i12 & 8) != 0) {
                                        z4 = z3;
                                    }
                                    invoke_ZmokQxo$moveFocusTo(z3, tabGroupScope, str, z4);
                                }

                                private static final void invoke_ZmokQxo$moveFocusTo(boolean z3, TabGroupScope tabGroupScope, String str, boolean z4) {
                                    FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabGroupScope.getTabFocusRequesters$core_release(), str), 0, 1, null);
                                    if (z4) {
                                        tabGroupScope.getState().setSelectedTab(str);
                                    }
                                }

                                private static final void invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope tabGroupScope, boolean z3) {
                                    String str;
                                    int indexOf = CollectionsKt.indexOf((List<? extends String>) tabGroupScope.getState().getTabs$core_release(), tabGroupScope.getState().getFocusedTab());
                                    if (indexOf == 0) {
                                        str = (String) CollectionsKt.last((List) tabGroupScope.getState().getTabs$core_release());
                                    } else {
                                        str = tabGroupScope.getState().getTabs$core_release().get(indexOf - 1);
                                    }
                                    invoke_ZmokQxo$moveFocusTo$default(z3, tabGroupScope, str, false, 8, null);
                                }

                                private static final void invoke_ZmokQxo$moveFocusToNext(TabGroupScope tabGroupScope, boolean z3) {
                                    String str;
                                    int indexOf = CollectionsKt.indexOf((List<? extends String>) tabGroupScope.getState().getTabs$core_release(), tabGroupScope.getState().getFocusedTab());
                                    if (indexOf == CollectionsKt.getLastIndex(tabGroupScope.getState().getTabs$core_release())) {
                                        str = (String) CollectionsKt.first((List) tabGroupScope.getState().getTabs$core_release());
                                    } else {
                                        str = tabGroupScope.getState().getTabs$core_release().get(indexOf + 1);
                                    }
                                    invoke_ZmokQxo$moveFocusTo$default(z3, tabGroupScope, str, false, 8, null);
                                }

                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                public final Boolean m9504invokeZmokQxo(android.view.KeyEvent event) {
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                                    boolean z3 = false;
                                    if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6731getTabEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            if (KeyEvent_androidKt.m6809isShiftPressedZmokQxo(event)) {
                                                boolean z4 = z2;
                                                TabGroupScope tabGroupScope = TabGroupScope.this;
                                                invoke_ZmokQxo$moveFocusTo(z4, tabGroupScope, (String) CollectionsKt.first((List) tabGroupScope.getState().getTabs$core_release()), false);
                                                focusManager.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                                            } else {
                                                boolean z5 = z2;
                                                TabGroupScope tabGroupScope2 = TabGroupScope.this;
                                                invoke_ZmokQxo$moveFocusTo(z5, tabGroupScope2, (String) CollectionsKt.last((List) tabGroupScope2.getState().getTabs$core_release()), false);
                                                focusManager.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                                            }
                                        }
                                    } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            boolean z6 = z2;
                                            TabGroupScope tabGroupScope3 = TabGroupScope.this;
                                            invoke_ZmokQxo$moveFocusTo$default(z6, tabGroupScope3, (String) CollectionsKt.first((List) tabGroupScope3.getState().getTabs$core_release()), false, 8, null);
                                        }
                                    } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            boolean z7 = z2;
                                            TabGroupScope tabGroupScope4 = TabGroupScope.this;
                                            invoke_ZmokQxo$moveFocusTo$default(z7, tabGroupScope4, (String) CollectionsKt.last((List) tabGroupScope4.getState().getTabs$core_release()), false, 8, null);
                                        }
                                    } else {
                                        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                                            if (orientation2 == Orientation.Horizontal) {
                                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                    invoke_ZmokQxo$moveFocusToNext(TabGroupScope.this, z2);
                                                }
                                            }
                                        } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                            if (orientation2 == Orientation.Vertical) {
                                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                    invoke_ZmokQxo$moveFocusToNext(TabGroupScope.this, z2);
                                                }
                                            }
                                        } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                                            if (orientation2 == Orientation.Horizontal) {
                                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                    invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope.this, z2);
                                                }
                                            }
                                        } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ()) && orientation2 == Orientation.Vertical) {
                                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope.this, z2);
                                            }
                                        }
                                        return Boolean.valueOf(z3);
                                    }
                                    z3 = true;
                                    return Boolean.valueOf(z3);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier padding = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(KeyInputModifierKt.onKeyEvent(focusGroup, (Function1) rememberedValue2), shape2), j3, null, 2, null), m830PaddingValues0680j_4);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Modifier modifier3 = modifier2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j4)), ComposableLambdaKt.rememberComposableLambda(-838214498, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$TabList$3$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i12) {
                                if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-838214498, i12, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (deprecated.TabGroup.kt:253)");
                                }
                                content.invoke(rowScopeInstance, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        shape3 = shape2;
                        orientation3 = orientation2;
                        paddingValues3 = m830PaddingValues0680j_4;
                        j5 = j4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        orientation3 = orientation;
                        shape3 = shape2;
                        paddingValues3 = paddingValues2;
                        j5 = j2;
                        z2 = z;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        final long j6 = j3;
                        final Orientation orientation4 = orientation3;
                        final boolean z3 = z2;
                        endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TabList_LHOAhiI$lambda$9;
                                TabList_LHOAhiI$lambda$9 = Deprecated_TabGroupKt.TabList_LHOAhiI$lambda$9(TabGroupScope.this, modifier4, shape3, j6, j5, paddingValues3, orientation4, z3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TabList_LHOAhiI$lambda$9;
                            }
                        });
                        return;
                    }
                    return;
                }
                j3 = j;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                i7 = i2 & 16;
                if (i7 == 0) {
                }
                i8 = i2 & 32;
                if (i8 == 0) {
                }
                i9 = i2 & 64;
                if (i9 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((38347923 & i3) == 38347922) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localFocusManager2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final FocusManager focusManager2 = (FocusManager) consume2;
                Modifier focusRestorer$default2 = FocusRestorerKt.focusRestorer$default(SelectableGroupKt.selectableGroup(modifier2), null, 1, null);
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance = startRestartGroup.changedInstance(TabList);
                int i112 = i3;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TabList_LHOAhiI$lambda$6$lambda$5;
                        TabList_LHOAhiI$lambda$6$lambda$5 = Deprecated_TabGroupKt.TabList_LHOAhiI$lambda$6$lambda$5(TabGroupScope.this, (FocusState) obj);
                        return TabList_LHOAhiI$lambda$6$lambda$5;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier focusGroup2 = FocusableKt.focusGroup(FocusChangedModifierKt.onFocusChanged(focusRestorer$default2, (Function1) rememberedValue));
                startRestartGroup.startReplaceGroup(-1224400529);
                changedInstance2 = startRestartGroup.changedInstance(TabList) | ((i112 & 29360128) != 8388608) | startRestartGroup.changedInstance(focusManager2) | ((i112 & 3670016) != 1048576);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue2 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$TabList$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m9504invokeZmokQxo(keyEvent.m6792unboximpl());
                    }

                    static /* synthetic */ void invoke_ZmokQxo$moveFocusTo$default(boolean z32, TabGroupScope tabGroupScope, String str, boolean z4, int i12, Object obj) {
                        if ((i12 & 8) != 0) {
                            z4 = z32;
                        }
                        invoke_ZmokQxo$moveFocusTo(z32, tabGroupScope, str, z4);
                    }

                    private static final void invoke_ZmokQxo$moveFocusTo(boolean z32, TabGroupScope tabGroupScope, String str, boolean z4) {
                        FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabGroupScope.getTabFocusRequesters$core_release(), str), 0, 1, null);
                        if (z4) {
                            tabGroupScope.getState().setSelectedTab(str);
                        }
                    }

                    private static final void invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope tabGroupScope, boolean z32) {
                        String str;
                        int indexOf = CollectionsKt.indexOf((List<? extends String>) tabGroupScope.getState().getTabs$core_release(), tabGroupScope.getState().getFocusedTab());
                        if (indexOf == 0) {
                            str = (String) CollectionsKt.last((List) tabGroupScope.getState().getTabs$core_release());
                        } else {
                            str = tabGroupScope.getState().getTabs$core_release().get(indexOf - 1);
                        }
                        invoke_ZmokQxo$moveFocusTo$default(z32, tabGroupScope, str, false, 8, null);
                    }

                    private static final void invoke_ZmokQxo$moveFocusToNext(TabGroupScope tabGroupScope, boolean z32) {
                        String str;
                        int indexOf = CollectionsKt.indexOf((List<? extends String>) tabGroupScope.getState().getTabs$core_release(), tabGroupScope.getState().getFocusedTab());
                        if (indexOf == CollectionsKt.getLastIndex(tabGroupScope.getState().getTabs$core_release())) {
                            str = (String) CollectionsKt.first((List) tabGroupScope.getState().getTabs$core_release());
                        } else {
                            str = tabGroupScope.getState().getTabs$core_release().get(indexOf + 1);
                        }
                        invoke_ZmokQxo$moveFocusTo$default(z32, tabGroupScope, str, false, 8, null);
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m9504invokeZmokQxo(android.view.KeyEvent event) {
                        Intrinsics.checkNotNullParameter(event, "event");
                        long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                        boolean z32 = false;
                        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6731getTabEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                if (KeyEvent_androidKt.m6809isShiftPressedZmokQxo(event)) {
                                    boolean z4 = z2;
                                    TabGroupScope tabGroupScope = TabGroupScope.this;
                                    invoke_ZmokQxo$moveFocusTo(z4, tabGroupScope, (String) CollectionsKt.first((List) tabGroupScope.getState().getTabs$core_release()), false);
                                    focusManager2.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                                } else {
                                    boolean z5 = z2;
                                    TabGroupScope tabGroupScope2 = TabGroupScope.this;
                                    invoke_ZmokQxo$moveFocusTo(z5, tabGroupScope2, (String) CollectionsKt.last((List) tabGroupScope2.getState().getTabs$core_release()), false);
                                    focusManager2.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                                }
                            }
                        } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                boolean z6 = z2;
                                TabGroupScope tabGroupScope3 = TabGroupScope.this;
                                invoke_ZmokQxo$moveFocusTo$default(z6, tabGroupScope3, (String) CollectionsKt.first((List) tabGroupScope3.getState().getTabs$core_release()), false, 8, null);
                            }
                        } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                boolean z7 = z2;
                                TabGroupScope tabGroupScope4 = TabGroupScope.this;
                                invoke_ZmokQxo$moveFocusTo$default(z7, tabGroupScope4, (String) CollectionsKt.last((List) tabGroupScope4.getState().getTabs$core_release()), false, 8, null);
                            }
                        } else {
                            if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                                if (orientation2 == Orientation.Horizontal) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        invoke_ZmokQxo$moveFocusToNext(TabGroupScope.this, z2);
                                    }
                                }
                            } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                if (orientation2 == Orientation.Vertical) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        invoke_ZmokQxo$moveFocusToNext(TabGroupScope.this, z2);
                                    }
                                }
                            } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                                if (orientation2 == Orientation.Horizontal) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope.this, z2);
                                    }
                                }
                            } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ()) && orientation2 == Orientation.Vertical) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope.this, z2);
                                }
                            }
                            return Boolean.valueOf(z32);
                        }
                        z32 = true;
                        return Boolean.valueOf(z32);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                Modifier padding2 = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(KeyInputModifierKt.onKeyEvent(focusGroup2, (Function1) rememberedValue2), shape2), j3, null, 2, null), m830PaddingValues0680j_4);
                Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, padding2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier32 = modifier2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                final RowScope rowScopeInstance2 = RowScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j4)), ComposableLambdaKt.rememberComposableLambda(-838214498, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$TabList$3$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        if ((i12 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-838214498, i12, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (deprecated.TabGroup.kt:253)");
                        }
                        content.invoke(rowScopeInstance2, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
                shape3 = shape2;
                orientation3 = orientation2;
                paddingValues3 = m830PaddingValues0680j_4;
                j5 = j4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            shape2 = shape;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            j3 = j;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            i7 = i2 & 16;
            if (i7 == 0) {
            }
            i8 = i2 & 32;
            if (i8 == 0) {
            }
            i9 = i2 & 64;
            if (i9 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager22 = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localFocusManager22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final FocusManager focusManager22 = (FocusManager) consume22;
            Modifier focusRestorer$default22 = FocusRestorerKt.focusRestorer$default(SelectableGroupKt.selectableGroup(modifier2), null, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(TabList);
            int i1122 = i3;
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit TabList_LHOAhiI$lambda$6$lambda$5;
                    TabList_LHOAhiI$lambda$6$lambda$5 = Deprecated_TabGroupKt.TabList_LHOAhiI$lambda$6$lambda$5(TabGroupScope.this, (FocusState) obj);
                    return TabList_LHOAhiI$lambda$6$lambda$5;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier focusGroup22 = FocusableKt.focusGroup(FocusChangedModifierKt.onFocusChanged(focusRestorer$default22, (Function1) rememberedValue));
            startRestartGroup.startReplaceGroup(-1224400529);
            changedInstance2 = startRestartGroup.changedInstance(TabList) | ((i1122 & 29360128) != 8388608) | startRestartGroup.changedInstance(focusManager22) | ((i1122 & 3670016) != 1048576);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$TabList$2$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m9504invokeZmokQxo(keyEvent.m6792unboximpl());
                }

                static /* synthetic */ void invoke_ZmokQxo$moveFocusTo$default(boolean z32, TabGroupScope tabGroupScope, String str, boolean z4, int i12, Object obj) {
                    if ((i12 & 8) != 0) {
                        z4 = z32;
                    }
                    invoke_ZmokQxo$moveFocusTo(z32, tabGroupScope, str, z4);
                }

                private static final void invoke_ZmokQxo$moveFocusTo(boolean z32, TabGroupScope tabGroupScope, String str, boolean z4) {
                    FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabGroupScope.getTabFocusRequesters$core_release(), str), 0, 1, null);
                    if (z4) {
                        tabGroupScope.getState().setSelectedTab(str);
                    }
                }

                private static final void invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope tabGroupScope, boolean z32) {
                    String str;
                    int indexOf = CollectionsKt.indexOf((List<? extends String>) tabGroupScope.getState().getTabs$core_release(), tabGroupScope.getState().getFocusedTab());
                    if (indexOf == 0) {
                        str = (String) CollectionsKt.last((List) tabGroupScope.getState().getTabs$core_release());
                    } else {
                        str = tabGroupScope.getState().getTabs$core_release().get(indexOf - 1);
                    }
                    invoke_ZmokQxo$moveFocusTo$default(z32, tabGroupScope, str, false, 8, null);
                }

                private static final void invoke_ZmokQxo$moveFocusToNext(TabGroupScope tabGroupScope, boolean z32) {
                    String str;
                    int indexOf = CollectionsKt.indexOf((List<? extends String>) tabGroupScope.getState().getTabs$core_release(), tabGroupScope.getState().getFocusedTab());
                    if (indexOf == CollectionsKt.getLastIndex(tabGroupScope.getState().getTabs$core_release())) {
                        str = (String) CollectionsKt.first((List) tabGroupScope.getState().getTabs$core_release());
                    } else {
                        str = tabGroupScope.getState().getTabs$core_release().get(indexOf + 1);
                    }
                    invoke_ZmokQxo$moveFocusTo$default(z32, tabGroupScope, str, false, 8, null);
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m9504invokeZmokQxo(android.view.KeyEvent event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                    boolean z32 = false;
                    if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6731getTabEK5gGoQ())) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            if (KeyEvent_androidKt.m6809isShiftPressedZmokQxo(event)) {
                                boolean z4 = z2;
                                TabGroupScope tabGroupScope = TabGroupScope.this;
                                invoke_ZmokQxo$moveFocusTo(z4, tabGroupScope, (String) CollectionsKt.first((List) tabGroupScope.getState().getTabs$core_release()), false);
                                focusManager22.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                            } else {
                                boolean z5 = z2;
                                TabGroupScope tabGroupScope2 = TabGroupScope.this;
                                invoke_ZmokQxo$moveFocusTo(z5, tabGroupScope2, (String) CollectionsKt.last((List) tabGroupScope2.getState().getTabs$core_release()), false);
                                focusManager22.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                            }
                        }
                    } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            boolean z6 = z2;
                            TabGroupScope tabGroupScope3 = TabGroupScope.this;
                            invoke_ZmokQxo$moveFocusTo$default(z6, tabGroupScope3, (String) CollectionsKt.first((List) tabGroupScope3.getState().getTabs$core_release()), false, 8, null);
                        }
                    } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            boolean z7 = z2;
                            TabGroupScope tabGroupScope4 = TabGroupScope.this;
                            invoke_ZmokQxo$moveFocusTo$default(z7, tabGroupScope4, (String) CollectionsKt.last((List) tabGroupScope4.getState().getTabs$core_release()), false, 8, null);
                        }
                    } else {
                        if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                            if (orientation2 == Orientation.Horizontal) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    invoke_ZmokQxo$moveFocusToNext(TabGroupScope.this, z2);
                                }
                            }
                        } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                            if (orientation2 == Orientation.Vertical) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    invoke_ZmokQxo$moveFocusToNext(TabGroupScope.this, z2);
                                }
                            }
                        } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                            if (orientation2 == Orientation.Horizontal) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope.this, z2);
                                }
                            }
                        } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ()) && orientation2 == Orientation.Vertical) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope.this, z2);
                            }
                        }
                        return Boolean.valueOf(z32);
                    }
                    z32 = true;
                    return Boolean.valueOf(z32);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            Modifier padding22 = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(KeyInputModifierKt.onKeyEvent(focusGroup22, (Function1) rememberedValue2), shape2), j3, null, 2, null), m830PaddingValues0680j_4);
            Arrangement.Horizontal start22 = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(start22, centerVertically22, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, padding22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier322 = modifier2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            final RowScope rowScopeInstance22 = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j4)), ComposableLambdaKt.rememberComposableLambda(-838214498, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$TabList$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    if ((i12 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-838214498, i12, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (deprecated.TabGroup.kt:253)");
                    }
                    content.invoke(rowScopeInstance22, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier322;
            shape3 = shape2;
            orientation3 = orientation2;
            paddingValues3 = m830PaddingValues0680j_4;
            j5 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        shape2 = shape;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        j3 = j;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        i7 = i2 & 16;
        if (i7 == 0) {
        }
        i8 = i2 & 32;
        if (i8 == 0) {
        }
        i9 = i2 & 64;
        if (i9 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<FocusManager> localFocusManager222 = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localFocusManager222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final FocusManager focusManager222 = (FocusManager) consume222;
        Modifier focusRestorer$default222 = FocusRestorerKt.focusRestorer$default(SelectableGroupKt.selectableGroup(modifier2), null, 1, null);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(TabList);
        int i11222 = i3;
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TabList_LHOAhiI$lambda$6$lambda$5;
                TabList_LHOAhiI$lambda$6$lambda$5 = Deprecated_TabGroupKt.TabList_LHOAhiI$lambda$6$lambda$5(TabGroupScope.this, (FocusState) obj);
                return TabList_LHOAhiI$lambda$6$lambda$5;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier focusGroup222 = FocusableKt.focusGroup(FocusChangedModifierKt.onFocusChanged(focusRestorer$default222, (Function1) rememberedValue));
        startRestartGroup.startReplaceGroup(-1224400529);
        changedInstance2 = startRestartGroup.changedInstance(TabList) | ((i11222 & 29360128) != 8388608) | startRestartGroup.changedInstance(focusManager222) | ((i11222 & 3670016) != 1048576);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue2 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$TabList$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m9504invokeZmokQxo(keyEvent.m6792unboximpl());
            }

            static /* synthetic */ void invoke_ZmokQxo$moveFocusTo$default(boolean z32, TabGroupScope tabGroupScope, String str, boolean z4, int i12, Object obj) {
                if ((i12 & 8) != 0) {
                    z4 = z32;
                }
                invoke_ZmokQxo$moveFocusTo(z32, tabGroupScope, str, z4);
            }

            private static final void invoke_ZmokQxo$moveFocusTo(boolean z32, TabGroupScope tabGroupScope, String str, boolean z4) {
                FocusRequester.m5320requestFocus3ESFkO8$default((FocusRequester) MapsKt.getValue(tabGroupScope.getTabFocusRequesters$core_release(), str), 0, 1, null);
                if (z4) {
                    tabGroupScope.getState().setSelectedTab(str);
                }
            }

            private static final void invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope tabGroupScope, boolean z32) {
                String str;
                int indexOf = CollectionsKt.indexOf((List<? extends String>) tabGroupScope.getState().getTabs$core_release(), tabGroupScope.getState().getFocusedTab());
                if (indexOf == 0) {
                    str = (String) CollectionsKt.last((List) tabGroupScope.getState().getTabs$core_release());
                } else {
                    str = tabGroupScope.getState().getTabs$core_release().get(indexOf - 1);
                }
                invoke_ZmokQxo$moveFocusTo$default(z32, tabGroupScope, str, false, 8, null);
            }

            private static final void invoke_ZmokQxo$moveFocusToNext(TabGroupScope tabGroupScope, boolean z32) {
                String str;
                int indexOf = CollectionsKt.indexOf((List<? extends String>) tabGroupScope.getState().getTabs$core_release(), tabGroupScope.getState().getFocusedTab());
                if (indexOf == CollectionsKt.getLastIndex(tabGroupScope.getState().getTabs$core_release())) {
                    str = (String) CollectionsKt.first((List) tabGroupScope.getState().getTabs$core_release());
                } else {
                    str = tabGroupScope.getState().getTabs$core_release().get(indexOf + 1);
                }
                invoke_ZmokQxo$moveFocusTo$default(z32, tabGroupScope, str, false, 8, null);
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m9504invokeZmokQxo(android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                boolean z32 = false;
                if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6731getTabEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        if (KeyEvent_androidKt.m6809isShiftPressedZmokQxo(event)) {
                            boolean z4 = z2;
                            TabGroupScope tabGroupScope = TabGroupScope.this;
                            invoke_ZmokQxo$moveFocusTo(z4, tabGroupScope, (String) CollectionsKt.first((List) tabGroupScope.getState().getTabs$core_release()), false);
                            focusManager222.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                        } else {
                            boolean z5 = z2;
                            TabGroupScope tabGroupScope2 = TabGroupScope.this;
                            invoke_ZmokQxo$moveFocusTo(z5, tabGroupScope2, (String) CollectionsKt.last((List) tabGroupScope2.getState().getTabs$core_release()), false);
                            focusManager222.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                        }
                    }
                } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        boolean z6 = z2;
                        TabGroupScope tabGroupScope3 = TabGroupScope.this;
                        invoke_ZmokQxo$moveFocusTo$default(z6, tabGroupScope3, (String) CollectionsKt.first((List) tabGroupScope3.getState().getTabs$core_release()), false, 8, null);
                    }
                } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        boolean z7 = z2;
                        TabGroupScope tabGroupScope4 = TabGroupScope.this;
                        invoke_ZmokQxo$moveFocusTo$default(z7, tabGroupScope4, (String) CollectionsKt.last((List) tabGroupScope4.getState().getTabs$core_release()), false, 8, null);
                    }
                } else {
                    if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6572getDirectionRightEK5gGoQ())) {
                        if (orientation2 == Orientation.Horizontal) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                invoke_ZmokQxo$moveFocusToNext(TabGroupScope.this, z2);
                            }
                        }
                    } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                        if (orientation2 == Orientation.Vertical) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                invoke_ZmokQxo$moveFocusToNext(TabGroupScope.this, z2);
                            }
                        }
                    } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6571getDirectionLeftEK5gGoQ())) {
                        if (orientation2 == Orientation.Horizontal) {
                            if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope.this, z2);
                            }
                        }
                    } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ()) && orientation2 == Orientation.Vertical) {
                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                            invoke_ZmokQxo$moveFocusToPrevious(TabGroupScope.this, z2);
                        }
                    }
                    return Boolean.valueOf(z32);
                }
                z32 = true;
                return Boolean.valueOf(z32);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        Modifier padding222 = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(KeyInputModifierKt.onKeyEvent(focusGroup222, (Function1) rememberedValue2), shape2), j3, null, 2, null), m830PaddingValues0680j_4);
        Arrangement.Horizontal start222 = Arrangement.INSTANCE.getStart();
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(start222, centerVertically222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, padding222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier3222 = modifier2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        final RowScope rowScopeInstance222 = RowScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j4)), ComposableLambdaKt.rememberComposableLambda(-838214498, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$TabList$3$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i12) {
                if ((i12 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-838214498, i12, -1, "com.composeunstyled.TabList.<anonymous>.<anonymous> (deprecated.TabGroup.kt:253)");
                }
                content.invoke(rowScopeInstance222, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3222;
        shape3 = shape2;
        orientation3 = orientation2;
        paddingValues3 = m830PaddingValues0680j_4;
        j5 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabList_LHOAhiI$lambda$6$lambda$5(TabGroupScope tabGroupScope, FocusState it) {
        FocusRequester focusRequester;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getHasFocus() && (focusRequester = tabGroupScope.getTabFocusRequesters$core_release().get(tabGroupScope.getState().getSelectedTab())) != null) {
            FocusRequester.m5320requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036a  */
    /* renamed from: Tab-uPCbpMU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9502TabuPCbpMU(final TabGroupScope Tab, final String key, Modifier modifier, boolean z, Indication indication, MutableInteractionSource mutableInteractionSource, PaddingValues paddingValues, long j, long j2, Shape shape, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        Indication indication2;
        int i6;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        int i9;
        long j3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier.Companion companion;
        MutableInteractionSource mutableInteractionSource2;
        long m5693getUnspecified0d7_KjU;
        Shape rectangleShape;
        int i15;
        long j4;
        boolean z3;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        boolean changedInstance2;
        Object rememberedValue3;
        boolean changedInstance3;
        Object rememberedValue4;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        final PaddingValues paddingValues3;
        final long j5;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z4;
        final Modifier modifier3;
        final Shape shape2;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i16;
        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2105944827);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(Tab) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(key) ? 32 : 16;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i3 & 8) == 0) {
                        indication2 = indication;
                        if (startRestartGroup.changed(indication2)) {
                            i16 = 16384;
                            i4 |= i16;
                        }
                    } else {
                        indication2 = indication;
                    }
                    i16 = 8192;
                    i4 |= i16;
                } else {
                    indication2 = indication;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 1572864;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(paddingValues2) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 12582912;
                    i9 = i17;
                    j3 = j;
                } else {
                    i9 = i17;
                    j3 = j;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
                    }
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i11 = i4 | (startRestartGroup.changed(j2) ? 67108864 : 33554432);
                    i12 = i3 & 256;
                    if (i12 == 0) {
                        i11 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i13 = i12;
                        i11 |= startRestartGroup.changed(shape) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        if ((i3 & 512) != 0) {
                            i14 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i14 = i2 | (startRestartGroup.changedInstance(content) ? 4 : 2);
                        } else {
                            i14 = i2;
                        }
                        if ((i11 & 306783379) == 306783378 || (i14 & 3) != 2 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i9 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 8) != 0) {
                                    ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localIndication);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    i11 &= -57345;
                                    indication2 = (Indication) consume;
                                }
                                mutableInteractionSource2 = i6 != 0 ? null : mutableInteractionSource;
                                if (i7 != 0) {
                                    paddingValues2 = PaddingKt.m830PaddingValues0680j_4(Dp.m8401constructorimpl(0));
                                }
                                if (i8 != 0) {
                                    j3 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                }
                                m5693getUnspecified0d7_KjU = i10 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j2;
                                rectangleShape = i13 != 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                i15 = i11;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 8) != 0) {
                                    i11 &= -57345;
                                }
                                m5693getUnspecified0d7_KjU = j2;
                                rectangleShape = shape;
                                companion = modifier2;
                                i15 = i11;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                j4 = j3;
                                ComposerKt.traceEventStart(-2105944827, i15, i14, "com.composeunstyled.Tab (deprecated.TabGroup.kt:280)");
                            } else {
                                j4 = j3;
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            int i18 = i15 & 112;
                            z3 = i18 == 32;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new FocusRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final FocusRequester focusRequester = (FocusRequester) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1746271574);
                            changedInstance = startRestartGroup.changedInstance(Tab) | (i18 == 32) | startRestartGroup.changed(focusRequester);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        DisposableEffectResult Tab_uPCbpMU$lambda$13$lambda$12;
                                        Tab_uPCbpMU$lambda$13$lambda$12 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$13$lambda$12(TabGroupScope.this, key, focusRequester, (DisposableEffectScope) obj);
                                        return Tab_uPCbpMU$lambda$13$lambda$12;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(key, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i15 >> 3) & 14);
                            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(companion, focusRequester);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance2 = startRestartGroup.changedInstance(Tab) | (i18 == 32);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit Tab_uPCbpMU$lambda$15$lambda$14;
                                        Tab_uPCbpMU$lambda$15$lambda$14 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$15$lambda$14(TabGroupScope.this, key, (FocusState) obj);
                                        return Tab_uPCbpMU$lambda$15$lambda$14;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusChangedModifierKt.onFocusChanged(focusRequester2, (Function1) rememberedValue3), rectangleShape), j4, null, 2, null);
                            long j7 = j4;
                            boolean areEqual = Intrinsics.areEqual(Tab.getState().getSelectedTab(), key);
                            Role m7575boximpl = Role.m7575boximpl(Role.INSTANCE.m7589getTabo7Vup1c());
                            Modifier modifier4 = companion;
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance3 = startRestartGroup.changedInstance(Tab) | (i18 == 32);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new Function0() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit Tab_uPCbpMU$lambda$17$lambda$16;
                                        Tab_uPCbpMU$lambda$17$lambda$16 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$17$lambda$16(TabGroupScope.this, key);
                                        return Tab_uPCbpMU$lambda$17$lambda$16;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier padding = PaddingKt.padding(SelectableKt.m1164selectableO2vRcR0(m262backgroundbw27NRU$default, areEqual, mutableInteractionSource2, indication2, z2, m7575boximpl, (Function0) rememberedValue4), paddingValues2);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU)), ComposableLambdaKt.rememberComposableLambda(-350312705, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$Tab$4$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i19) {
                                    if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-350312705, i19, -1, "com.composeunstyled.Tab.<anonymous>.<anonymous> (deprecated.TabGroup.kt:310)");
                                    }
                                    content.invoke(composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            paddingValues3 = paddingValues2;
                            j5 = j7;
                            composer2 = startRestartGroup;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z2;
                            modifier3 = modifier4;
                            shape2 = rectangleShape;
                            j6 = m5693getUnspecified0d7_KjU;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            long j8 = j3;
                            paddingValues3 = paddingValues2;
                            j5 = j8;
                            mutableInteractionSource3 = mutableInteractionSource;
                            composer2 = startRestartGroup;
                            modifier3 = modifier2;
                            z4 = z2;
                            j6 = j2;
                            shape2 = shape;
                        }
                        final Indication indication3 = indication2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit Tab_uPCbpMU$lambda$19;
                                    Tab_uPCbpMU$lambda$19 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$19(TabGroupScope.this, key, modifier3, z4, indication3, mutableInteractionSource3, paddingValues3, j5, j6, shape2, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return Tab_uPCbpMU$lambda$19;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i13 = i12;
                    if ((i3 & 512) != 0) {
                    }
                    if ((i11 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    i15 = i11;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    int i182 = i15 & 112;
                    if (i182 == 32) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    rememberedValue = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    final FocusRequester focusRequester3 = (FocusRequester) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changedInstance = startRestartGroup.changedInstance(Tab) | (i182 == 32) | startRestartGroup.changed(focusRequester3);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue2 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DisposableEffectResult Tab_uPCbpMU$lambda$13$lambda$12;
                            Tab_uPCbpMU$lambda$13$lambda$12 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$13$lambda$12(TabGroupScope.this, key, focusRequester3, (DisposableEffectScope) obj);
                            return Tab_uPCbpMU$lambda$13$lambda$12;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(key, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i15 >> 3) & 14);
                    Modifier focusRequester22 = FocusRequesterModifierKt.focusRequester(companion, focusRequester3);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance2 = startRestartGroup.changedInstance(Tab) | (i182 == 32);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue3 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Tab_uPCbpMU$lambda$15$lambda$14;
                            Tab_uPCbpMU$lambda$15$lambda$14 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$15$lambda$14(TabGroupScope.this, key, (FocusState) obj);
                            return Tab_uPCbpMU$lambda$15$lambda$14;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    Modifier m262backgroundbw27NRU$default2 = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusChangedModifierKt.onFocusChanged(focusRequester22, (Function1) rememberedValue3), rectangleShape), j4, null, 2, null);
                    long j72 = j4;
                    boolean areEqual2 = Intrinsics.areEqual(Tab.getState().getSelectedTab(), key);
                    Role m7575boximpl2 = Role.m7575boximpl(Role.INSTANCE.m7589getTabo7Vup1c());
                    Modifier modifier42 = companion;
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance3 = startRestartGroup.changedInstance(Tab) | (i182 == 32);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    rememberedValue4 = new Function0() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit Tab_uPCbpMU$lambda$17$lambda$16;
                            Tab_uPCbpMU$lambda$17$lambda$16 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$17$lambda$16(TabGroupScope.this, key);
                            return Tab_uPCbpMU$lambda$17$lambda$16;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceGroup();
                    Modifier padding2 = PaddingKt.padding(SelectableKt.m1164selectableO2vRcR0(m262backgroundbw27NRU$default2, areEqual2, mutableInteractionSource2, indication2, z2, m7575boximpl2, (Function0) rememberedValue4), paddingValues2);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, padding2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl.getInserting()) {
                    }
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU)), ComposableLambdaKt.rememberComposableLambda(-350312705, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$Tab$4$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i19) {
                            if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350312705, i19, -1, "com.composeunstyled.Tab.<anonymous>.<anonymous> (deprecated.TabGroup.kt:310)");
                            }
                            content.invoke(composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    paddingValues3 = paddingValues2;
                    j5 = j72;
                    composer2 = startRestartGroup;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z2;
                    modifier3 = modifier42;
                    shape2 = rectangleShape;
                    j6 = m5693getUnspecified0d7_KjU;
                    final Indication indication32 = indication2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i11 = i4;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i3 & 512) != 0) {
                }
                if ((i11 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i13 != 0) {
                }
                i15 = i11;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                int i1822 = i15 & 112;
                if (i1822 == 32) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
                final FocusRequester focusRequester32 = (FocusRequester) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1746271574);
                changedInstance = startRestartGroup.changedInstance(Tab) | (i1822 == 32) | startRestartGroup.changed(focusRequester32);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DisposableEffectResult Tab_uPCbpMU$lambda$13$lambda$12;
                        Tab_uPCbpMU$lambda$13$lambda$12 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$13$lambda$12(TabGroupScope.this, key, focusRequester32, (DisposableEffectScope) obj);
                        return Tab_uPCbpMU$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(key, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i15 >> 3) & 14);
                Modifier focusRequester222 = FocusRequesterModifierKt.focusRequester(companion, focusRequester32);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance2 = startRestartGroup.changedInstance(Tab) | (i1822 == 32);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue3 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Tab_uPCbpMU$lambda$15$lambda$14;
                        Tab_uPCbpMU$lambda$15$lambda$14 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$15$lambda$14(TabGroupScope.this, key, (FocusState) obj);
                        return Tab_uPCbpMU$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                Modifier m262backgroundbw27NRU$default22 = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusChangedModifierKt.onFocusChanged(focusRequester222, (Function1) rememberedValue3), rectangleShape), j4, null, 2, null);
                long j722 = j4;
                boolean areEqual22 = Intrinsics.areEqual(Tab.getState().getSelectedTab(), key);
                Role m7575boximpl22 = Role.m7575boximpl(Role.INSTANCE.m7589getTabo7Vup1c());
                Modifier modifier422 = companion;
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance3 = startRestartGroup.changedInstance(Tab) | (i1822 == 32);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue4 = new Function0() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit Tab_uPCbpMU$lambda$17$lambda$16;
                        Tab_uPCbpMU$lambda$17$lambda$16 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$17$lambda$16(TabGroupScope.this, key);
                        return Tab_uPCbpMU$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                Modifier padding22 = PaddingKt.padding(SelectableKt.m1164selectableO2vRcR0(m262backgroundbw27NRU$default22, areEqual22, mutableInteractionSource2, indication2, z2, m7575boximpl22, (Function0) rememberedValue4), paddingValues2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, padding22);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU)), ComposableLambdaKt.rememberComposableLambda(-350312705, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$Tab$4$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i19) {
                        if ((i19 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350312705, i19, -1, "com.composeunstyled.Tab.<anonymous>.<anonymous> (deprecated.TabGroup.kt:310)");
                        }
                        content.invoke(composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                paddingValues3 = paddingValues2;
                j5 = j722;
                composer2 = startRestartGroup;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z2;
                modifier3 = modifier422;
                shape2 = rectangleShape;
                j6 = m5693getUnspecified0d7_KjU;
                final Indication indication322 = indication2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i4;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i3 & 512) != 0) {
            }
            if ((i11 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i13 != 0) {
            }
            i15 = i11;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            int i18222 = i15 & 112;
            if (i18222 == 32) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue = new FocusRequester();
            startRestartGroup.updateRememberedValue(rememberedValue);
            final FocusRequester focusRequester322 = (FocusRequester) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1746271574);
            changedInstance = startRestartGroup.changedInstance(Tab) | (i18222 == 32) | startRestartGroup.changed(focusRequester322);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DisposableEffectResult Tab_uPCbpMU$lambda$13$lambda$12;
                    Tab_uPCbpMU$lambda$13$lambda$12 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$13$lambda$12(TabGroupScope.this, key, focusRequester322, (DisposableEffectScope) obj);
                    return Tab_uPCbpMU$lambda$13$lambda$12;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(key, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i15 >> 3) & 14);
            Modifier focusRequester2222 = FocusRequesterModifierKt.focusRequester(companion, focusRequester322);
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance2 = startRestartGroup.changedInstance(Tab) | (i18222 == 32);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue3 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Tab_uPCbpMU$lambda$15$lambda$14;
                    Tab_uPCbpMU$lambda$15$lambda$14 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$15$lambda$14(TabGroupScope.this, key, (FocusState) obj);
                    return Tab_uPCbpMU$lambda$15$lambda$14;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            Modifier m262backgroundbw27NRU$default222 = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusChangedModifierKt.onFocusChanged(focusRequester2222, (Function1) rememberedValue3), rectangleShape), j4, null, 2, null);
            long j7222 = j4;
            boolean areEqual222 = Intrinsics.areEqual(Tab.getState().getSelectedTab(), key);
            Role m7575boximpl222 = Role.m7575boximpl(Role.INSTANCE.m7589getTabo7Vup1c());
            Modifier modifier4222 = companion;
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance3 = startRestartGroup.changedInstance(Tab) | (i18222 == 32);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue4 = new Function0() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit Tab_uPCbpMU$lambda$17$lambda$16;
                    Tab_uPCbpMU$lambda$17$lambda$16 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$17$lambda$16(TabGroupScope.this, key);
                    return Tab_uPCbpMU$lambda$17$lambda$16;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            Modifier padding222 = PaddingKt.padding(SelectableKt.m1164selectableO2vRcR0(m262backgroundbw27NRU$default222, areEqual222, mutableInteractionSource2, indication2, z2, m7575boximpl222, (Function0) rememberedValue4), paddingValues2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, padding222);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU)), ComposableLambdaKt.rememberComposableLambda(-350312705, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$Tab$4$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i19) {
                    if ((i19 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350312705, i19, -1, "com.composeunstyled.Tab.<anonymous>.<anonymous> (deprecated.TabGroup.kt:310)");
                    }
                    content.invoke(composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            paddingValues3 = paddingValues2;
            j5 = j7222;
            composer2 = startRestartGroup;
            mutableInteractionSource3 = mutableInteractionSource2;
            z4 = z2;
            modifier3 = modifier4222;
            shape2 = rectangleShape;
            j6 = m5693getUnspecified0d7_KjU;
            final Indication indication3222 = indication2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i4;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i3 & 512) != 0) {
        }
        if ((i11 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i13 != 0) {
        }
        i15 = i11;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        int i182222 = i15 & 112;
        if (i182222 == 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue = new FocusRequester();
        startRestartGroup.updateRememberedValue(rememberedValue);
        final FocusRequester focusRequester3222 = (FocusRequester) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1746271574);
        changedInstance = startRestartGroup.changedInstance(Tab) | (i182222 == 32) | startRestartGroup.changed(focusRequester3222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult Tab_uPCbpMU$lambda$13$lambda$12;
                Tab_uPCbpMU$lambda$13$lambda$12 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$13$lambda$12(TabGroupScope.this, key, focusRequester3222, (DisposableEffectScope) obj);
                return Tab_uPCbpMU$lambda$13$lambda$12;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(key, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i15 >> 3) & 14);
        Modifier focusRequester22222 = FocusRequesterModifierKt.focusRequester(companion, focusRequester3222);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance2 = startRestartGroup.changedInstance(Tab) | (i182222 == 32);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue3 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Tab_uPCbpMU$lambda$15$lambda$14;
                Tab_uPCbpMU$lambda$15$lambda$14 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$15$lambda$14(TabGroupScope.this, key, (FocusState) obj);
                return Tab_uPCbpMU$lambda$15$lambda$14;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        Modifier m262backgroundbw27NRU$default2222 = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusChangedModifierKt.onFocusChanged(focusRequester22222, (Function1) rememberedValue3), rectangleShape), j4, null, 2, null);
        long j72222 = j4;
        boolean areEqual2222 = Intrinsics.areEqual(Tab.getState().getSelectedTab(), key);
        Role m7575boximpl2222 = Role.m7575boximpl(Role.INSTANCE.m7589getTabo7Vup1c());
        Modifier modifier42222 = companion;
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance3 = startRestartGroup.changedInstance(Tab) | (i182222 == 32);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue4 = new Function0() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Tab_uPCbpMU$lambda$17$lambda$16;
                Tab_uPCbpMU$lambda$17$lambda$16 = Deprecated_TabGroupKt.Tab_uPCbpMU$lambda$17$lambda$16(TabGroupScope.this, key);
                return Tab_uPCbpMU$lambda$17$lambda$16;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        Modifier padding2222 = PaddingKt.padding(SelectableKt.m1164selectableO2vRcR0(m262backgroundbw27NRU$default2222, areEqual2222, mutableInteractionSource2, indication2, z2, m7575boximpl2222, (Function0) rememberedValue4), paddingValues2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, padding2222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(m5693getUnspecified0d7_KjU)), ComposableLambdaKt.rememberComposableLambda(-350312705, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.Deprecated_TabGroupKt$Tab$4$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i19) {
                if ((i19 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350312705, i19, -1, "com.composeunstyled.Tab.<anonymous>.<anonymous> (deprecated.TabGroup.kt:310)");
                }
                content.invoke(composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        paddingValues3 = paddingValues2;
        j5 = j72222;
        composer2 = startRestartGroup;
        mutableInteractionSource3 = mutableInteractionSource2;
        z4 = z2;
        modifier3 = modifier42222;
        shape2 = rectangleShape;
        j6 = m5693getUnspecified0d7_KjU;
        final Indication indication32222 = indication2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult Tab_uPCbpMU$lambda$13$lambda$12(final TabGroupScope tabGroupScope, final String str, FocusRequester focusRequester, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        tabGroupScope.getTabFocusRequesters$core_release().put(str, focusRequester);
        return new DisposableEffectResult() { // from class: com.composeunstyled.Deprecated_TabGroupKt$Tab_uPCbpMU$lambda$13$lambda$12$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                TabGroupScope.this.getTabFocusRequesters$core_release().remove(str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tab_uPCbpMU$lambda$15$lambda$14(TabGroupScope tabGroupScope, String str, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isFocused()) {
            tabGroupScope.getState().setFocusedTab(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tab_uPCbpMU$lambda$17$lambda$16(TabGroupScope tabGroupScope, String str) {
        tabGroupScope.getState().setSelectedTab(str);
        return Unit.INSTANCE;
    }

    public static final void TabPanel(final TabGroupScope tabGroupScope, final String key, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(tabGroupScope, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-48118581);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(tabGroupScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(key) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-48118581, i2, -1, "com.composeunstyled.TabPanel (deprecated.TabGroup.kt:322)");
            }
            startRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final FocusRequester focusRequester = (FocusRequester) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1746271574);
            boolean changedInstance = startRestartGroup.changedInstance(tabGroupScope) | (i3 == 32) | startRestartGroup.changed(focusRequester);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DisposableEffectResult TabPanel$lambda$23$lambda$22;
                        TabPanel$lambda$23$lambda$22 = Deprecated_TabGroupKt.TabPanel$lambda$23$lambda$22(TabGroupScope.this, key, focusRequester, (DisposableEffectScope) obj);
                        return TabPanel$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(key, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i2 >> 3) & 14);
            if (Intrinsics.areEqual(key, tabGroupScope.getState().getSelectedTab())) {
                Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(Modifier.INSTANCE, focusRequester);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, focusRequester2);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                content.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.Deprecated_TabGroupKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TabPanel$lambda$25;
                    TabPanel$lambda$25 = Deprecated_TabGroupKt.TabPanel$lambda$25(TabGroupScope.this, key, content, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TabPanel$lambda$25;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult TabPanel$lambda$23$lambda$22(final TabGroupScope tabGroupScope, final String str, FocusRequester focusRequester, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        tabGroupScope.getPanelFocusRequesters$core_release().put(str, focusRequester);
        return new DisposableEffectResult() { // from class: com.composeunstyled.Deprecated_TabGroupKt$TabPanel$lambda$23$lambda$22$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                TabGroupScope.this.getPanelFocusRequesters$core_release().remove(str);
            }
        };
    }

    @Deprecated(message = "")
    public static final TabGroupState rememberTabGroupState(String selectedTab, List<String> orderedTabs, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(orderedTabs, "orderedTabs");
        composer.startReplaceGroup(86642736);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(86642736, i, -1, "com.composeunstyled.rememberTabGroupState (deprecated.TabGroup.kt:45)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new TabGroupState(selectedTab, orderedTabs);
            composer.updateRememberedValue(rememberedValue);
        }
        TabGroupState tabGroupState = (TabGroupState) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tabGroupState;
    }
}
