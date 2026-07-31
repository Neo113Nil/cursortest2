package com.composeunstyled;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.composeunstyled.DropdownPanelAnchor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DropdownMenu.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0093\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\u0007¢\u0006\u0002\b\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"DropdownMenu", "", "onExpandRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuPanel", "expanded", "", "onDismissRequest", "anchor", "Lcom/composeunstyled/DropdownPanelAnchor;", "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DropdownMenuPanel--qGb434", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/composeunstyled/DropdownPanelAnchor;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropdownMenuKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenu$lambda$2(Function0 function0, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        DropdownMenu(function0, modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuPanel__qGb434$lambda$5(boolean z, Function0 function0, Modifier modifier, DropdownPanelAnchor dropdownPanelAnchor, Shape shape, long j, long j2, PaddingValues paddingValues, EnterTransition enterTransition, ExitTransition exitTransition, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m9513DropdownMenuPanelqGb434(z, function0, modifier, dropdownPanelAnchor, shape, j, j2, paddingValues, enterTransition, exitTransition, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void DropdownMenu(final Function0<Unit> onExpandRequest, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onExpandRequest, "onExpandRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-372051061);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(onExpandRequest) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-372051061, i3, -1, "com.composeunstyled.DropdownMenu (DropdownMenu.kt:26)");
            }
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i3 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenu$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                        return m9514invokeZmokQxo(keyEvent.m6792unboximpl());
                    }

                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                    public final Boolean m9514invokeZmokQxo(android.view.KeyEvent event) {
                        boolean z2;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                            if (KeyEventType.m6796equalsimpl0(KeyEvent_androidKt.m6804getTypeZmokQxo(event), KeyEventType.INSTANCE.m6800getKeyDownCS__XNY())) {
                                onExpandRequest.invoke();
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(modifier, (Function1) rememberedValue);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onKeyEvent);
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
            content.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
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
            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.DropdownMenuKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DropdownMenu$lambda$2;
                    DropdownMenu$lambda$2 = DropdownMenuKt.DropdownMenu$lambda$2(Function0.this, modifier2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return DropdownMenu$lambda$2;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0206  */
    /* renamed from: DropdownMenuPanel--qGb434, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9513DropdownMenuPanelqGb434(final boolean z, final Function0<Unit> onDismissRequest, Modifier modifier, DropdownPanelAnchor dropdownPanelAnchor, Shape shape, long j, long j2, PaddingValues paddingValues, EnterTransition enterTransition, ExitTransition exitTransition, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Shape shape2;
        int i7;
        long j3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final long j4;
        EnterTransition appearInstantly;
        ExitTransition exitTransition2;
        int i13;
        final Shape shape3;
        final PaddingValues paddingValues2;
        Modifier modifier3;
        DropdownPanelAnchor dropdownPanelAnchor2;
        final long j5;
        ExitTransition exitTransition3;
        Modifier modifier4;
        Object rememberedValue;
        final MutableTransitionState mutableTransitionState;
        Object rememberedValue2;
        final Modifier modifier5;
        Composer composer2;
        DropdownPanelAnchor dropdownPanelAnchor3;
        final EnterTransition enterTransition2;
        final ExitTransition exitTransition4;
        final EnterTransition enterTransition3;
        final Modifier modifier6;
        final Shape shape4;
        final long j6;
        final long j7;
        final ExitTransition exitTransition5;
        final DropdownPanelAnchor dropdownPanelAnchor4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1907629826);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= (i & 4096) == 0 ? startRestartGroup.changed(dropdownPanelAnchor) : startRestartGroup.changedInstance(dropdownPanelAnchor) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                shape2 = shape;
                i4 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    j3 = j;
                } else {
                    j3 = j;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(j3) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(paddingValues) ? 8388608 : 4194304;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(enterTransition) ? 67108864 : 33554432;
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i11 = i10;
                    i4 |= startRestartGroup.changed(exitTransition) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    if ((i3 & 1024) == 0) {
                        i12 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i12 = i2 | (startRestartGroup.changedInstance(content) ? 4 : 2);
                    } else {
                        i12 = i2;
                    }
                    if ((i4 & 306783379) == 306783378 || (i12 & 3) != 2 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i14 == 0 ? Modifier.INSTANCE : modifier2;
                            DropdownPanelAnchor.BottomStart bottomStart = i5 == 0 ? DropdownPanelAnchor.BottomStart.INSTANCE : dropdownPanelAnchor;
                            Shape rectangleShape = i6 == 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                            if (i7 != 0) {
                                j3 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                            }
                            if ((i3 & 64) == 0) {
                                ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localContentColor);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j4 = ((Color) consume).m5667unboximpl();
                                i4 &= -3670017;
                            } else {
                                j4 = j2;
                            }
                            PaddingValues noPadding = i8 == 0 ? UtilsKt.getNoPadding() : paddingValues;
                            appearInstantly = i9 == 0 ? UtilsKt.getAppearInstantly() : enterTransition;
                            if (i11 == 0) {
                                i13 = i4;
                                shape3 = rectangleShape;
                                paddingValues2 = noPadding;
                                exitTransition2 = UtilsKt.getDisappearInstantly();
                            } else {
                                exitTransition2 = exitTransition;
                                i13 = i4;
                                shape3 = rectangleShape;
                                paddingValues2 = noPadding;
                            }
                            long j8 = j3;
                            modifier3 = companion;
                            dropdownPanelAnchor2 = bottomStart;
                            j5 = j8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            long j9 = j3;
                            modifier3 = modifier2;
                            j5 = j9;
                            dropdownPanelAnchor2 = dropdownPanelAnchor;
                            paddingValues2 = paddingValues;
                            appearInstantly = enterTransition;
                            exitTransition2 = exitTransition;
                            i13 = i4;
                            shape3 = shape2;
                            j4 = j2;
                        }
                        startRestartGroup.endDefaults();
                        exitTransition3 = exitTransition2;
                        if (ComposerKt.isTraceInProgress()) {
                            modifier4 = modifier3;
                        } else {
                            modifier4 = modifier3;
                            ComposerKt.traceEventStart(-1907629826, i13, i12, "com.composeunstyled.DropdownMenuPanel (DropdownMenu.kt:66)");
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        MenuContentPositionProvider menuContentPositionProvider = new MenuContentPositionProvider((Density) consume2, dropdownPanelAnchor2);
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new MutableTransitionState(Boolean.valueOf(z));
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        mutableTransitionState = (MutableTransitionState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
                        if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() && !((Boolean) mutableTransitionState.getTargetState()).booleanValue() && mutableTransitionState.isIdle()) {
                            exitTransition4 = exitTransition3;
                            modifier5 = modifier4;
                            composer2 = startRestartGroup;
                            dropdownPanelAnchor3 = dropdownPanelAnchor2;
                            enterTransition2 = appearInstantly;
                        } else {
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new FocusRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final FocusRequester focusRequester = (FocusRequester) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            modifier5 = modifier4;
                            composer2 = startRestartGroup;
                            dropdownPanelAnchor3 = dropdownPanelAnchor2;
                            enterTransition2 = appearInstantly;
                            exitTransition4 = exitTransition3;
                            AndroidPopup_androidKt.Popup(menuContentPositionProvider, onDismissRequest, new PopupProperties(true, true, true, false, 8, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1372539255, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i15) {
                                    if ((i15 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1372539255, i15, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous> (DropdownMenu.kt:81)");
                                    }
                                    ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer3.consume(localFocusManager);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    final FocusManager focusManager = (FocusManager) consume3;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    composer3.startReplaceGroup(-1633490746);
                                    boolean changedInstance = composer3.changedInstance(focusManager) | composer3.changed(onDismissRequest);
                                    final Function0<Unit> function0 = onDismissRequest;
                                    Object rememberedValue3 = composer3.rememberedValue();
                                    if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                                return m9515invokeZmokQxo(keyEvent.m6792unboximpl());
                                            }

                                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                            public final Boolean m9515invokeZmokQxo(android.view.KeyEvent event) {
                                                Intrinsics.checkNotNullParameter(event, "event");
                                                long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                                                boolean z2 = true;
                                                if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                        FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                                                    }
                                                } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                        FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                                                    }
                                                } else if (!Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6584getEscapeEK5gGoQ())) {
                                                    z2 = false;
                                                } else if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                                    function0.invoke();
                                                }
                                                return Boolean.valueOf(z2);
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue3);
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (Function1) rememberedValue3);
                                    MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                    EnterTransition enterTransition4 = enterTransition2;
                                    ExitTransition exitTransition6 = exitTransition4;
                                    final Modifier modifier7 = modifier5;
                                    final FocusRequester focusRequester2 = focusRequester;
                                    final Shape shape5 = shape3;
                                    final long j10 = j5;
                                    final PaddingValues paddingValues3 = paddingValues2;
                                    final MutableTransitionState<Boolean> mutableTransitionState3 = mutableTransitionState;
                                    final long j11 = j4;
                                    final Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                    AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState2, onKeyEvent, enterTransition4, exitTransition6, (String) null, ComposableLambdaKt.rememberComposableLambda(1329129375, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                            invoke(animatedVisibilityScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i16) {
                                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1329129375, i16, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous>.<anonymous> (DropdownMenu.kt:114)");
                                            }
                                            Modifier padding = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusRequesterModifierKt.focusRequester(Modifier.this, focusRequester2), shape5), j10, null, 2, null), paddingValues3);
                                            MutableTransitionState<Boolean> mutableTransitionState4 = mutableTransitionState3;
                                            long j12 = j11;
                                            FocusRequester focusRequester3 = focusRequester2;
                                            final Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, padding);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                                            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            composer4.startReplaceGroup(93162377);
                                            if (mutableTransitionState4.getCurrentState().booleanValue()) {
                                                Unit unit = Unit.INSTANCE;
                                                composer4.startReplaceGroup(5004770);
                                                DropdownMenuKt$DropdownMenuPanel$1$2$1$1$1 rememberedValue4 = composer4.rememberedValue();
                                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue4 = new DropdownMenuKt$DropdownMenuPanel$1$2$1$1$1(focusRequester3, null);
                                                    composer4.updateRememberedValue(rememberedValue4);
                                                }
                                                composer4.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer4, 6);
                                            }
                                            composer4.endReplaceGroup();
                                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j12)), ComposableLambdaKt.rememberComposableLambda(-921634519, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1$2$1$2
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i17) {
                                                    if ((i17 & 3) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-921634519, i17, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DropdownMenu.kt:128)");
                                                    }
                                                    function32.invoke(columnScopeInstance, composer5, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            composer4.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, (i13 & 112) | 3456, 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        long j10 = j4;
                        enterTransition3 = enterTransition2;
                        modifier6 = modifier5;
                        shape4 = shape3;
                        j6 = j5;
                        j7 = j10;
                        exitTransition5 = exitTransition4;
                        dropdownPanelAnchor4 = dropdownPanelAnchor3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        dropdownPanelAnchor4 = dropdownPanelAnchor;
                        paddingValues2 = paddingValues;
                        enterTransition3 = enterTransition;
                        composer2 = startRestartGroup;
                        j6 = j3;
                        modifier6 = modifier2;
                        shape4 = shape2;
                        j7 = j2;
                        exitTransition5 = exitTransition;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.DropdownMenuKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DropdownMenuPanel__qGb434$lambda$5;
                                DropdownMenuPanel__qGb434$lambda$5 = DropdownMenuKt.DropdownMenuPanel__qGb434$lambda$5(z, onDismissRequest, modifier6, dropdownPanelAnchor4, shape4, j6, j7, paddingValues2, enterTransition3, exitTransition5, content, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return DropdownMenuPanel__qGb434$lambda$5;
                            }
                        });
                        return;
                    }
                    return;
                }
                i11 = i10;
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i14 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i11 == 0) {
                }
                long j82 = j3;
                modifier3 = companion;
                dropdownPanelAnchor2 = bottomStart;
                j5 = j82;
                startRestartGroup.endDefaults();
                exitTransition3 = exitTransition2;
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                MenuContentPositionProvider menuContentPositionProvider2 = new MenuContentPositionProvider((Density) consume22, dropdownPanelAnchor2);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                mutableTransitionState = (MutableTransitionState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final FocusRequester focusRequester2 = (FocusRequester) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                modifier5 = modifier4;
                composer2 = startRestartGroup;
                dropdownPanelAnchor3 = dropdownPanelAnchor2;
                enterTransition2 = appearInstantly;
                exitTransition4 = exitTransition3;
                AndroidPopup_androidKt.Popup(menuContentPositionProvider2, onDismissRequest, new PopupProperties(true, true, true, false, 8, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1372539255, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i15) {
                        if ((i15 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1372539255, i15, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous> (DropdownMenu.kt:81)");
                        }
                        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localFocusManager);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        final FocusManager focusManager = (FocusManager) consume3;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composer3.startReplaceGroup(-1633490746);
                        boolean changedInstance = composer3.changedInstance(focusManager) | composer3.changed(onDismissRequest);
                        final Function0<Unit> function0 = onDismissRequest;
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m9515invokeZmokQxo(keyEvent.m6792unboximpl());
                                }

                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                public final Boolean m9515invokeZmokQxo(android.view.KeyEvent event) {
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                                    boolean z2 = true;
                                    if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                                        }
                                    } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                                        if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                            FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                                        }
                                    } else if (!Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6584getEscapeEK5gGoQ())) {
                                        z2 = false;
                                    } else if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        function0.invoke();
                                    }
                                    return Boolean.valueOf(z2);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        composer3.endReplaceGroup();
                        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (Function1) rememberedValue3);
                        MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                        EnterTransition enterTransition4 = enterTransition2;
                        ExitTransition exitTransition6 = exitTransition4;
                        final Modifier modifier7 = modifier5;
                        final FocusRequester focusRequester22 = focusRequester2;
                        final Shape shape5 = shape3;
                        final long j102 = j5;
                        final PaddingValues paddingValues3 = paddingValues2;
                        final MutableTransitionState<Boolean> mutableTransitionState3 = mutableTransitionState;
                        final long j11 = j4;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3 = content;
                        AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState2, onKeyEvent, enterTransition4, exitTransition6, (String) null, ComposableLambdaKt.rememberComposableLambda(1329129375, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                invoke(animatedVisibilityScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i16) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1329129375, i16, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous>.<anonymous> (DropdownMenu.kt:114)");
                                }
                                Modifier padding = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusRequesterModifierKt.focusRequester(Modifier.this, focusRequester22), shape5), j102, null, 2, null), paddingValues3);
                                MutableTransitionState<Boolean> mutableTransitionState4 = mutableTransitionState3;
                                long j12 = j11;
                                FocusRequester focusRequester3 = focusRequester22;
                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, padding);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                                Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                final ColumnScope columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer4.startReplaceGroup(93162377);
                                if (mutableTransitionState4.getCurrentState().booleanValue()) {
                                    Unit unit = Unit.INSTANCE;
                                    composer4.startReplaceGroup(5004770);
                                    DropdownMenuKt$DropdownMenuPanel$1$2$1$1$1 rememberedValue4 = composer4.rememberedValue();
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new DropdownMenuKt$DropdownMenuPanel$1$2$1$1$1(focusRequester3, null);
                                        composer4.updateRememberedValue(rememberedValue4);
                                    }
                                    composer4.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer4, 6);
                                }
                                composer4.endReplaceGroup();
                                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j12)), ComposableLambdaKt.rememberComposableLambda(-921634519, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1$2$1$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i17) {
                                        if ((i17 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-921634519, i17, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DropdownMenu.kt:128)");
                                        }
                                        function32.invoke(columnScopeInstance, composer5, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, (i13 & 112) | 3456, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                long j102 = j4;
                enterTransition3 = enterTransition2;
                modifier6 = modifier5;
                shape4 = shape3;
                j6 = j5;
                j7 = j102;
                exitTransition5 = exitTransition4;
                dropdownPanelAnchor4 = dropdownPanelAnchor3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            shape2 = shape;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i14 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i11 == 0) {
            }
            long j822 = j3;
            modifier3 = companion;
            dropdownPanelAnchor2 = bottomStart;
            j5 = j822;
            startRestartGroup.endDefaults();
            exitTransition3 = exitTransition2;
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MenuContentPositionProvider menuContentPositionProvider22 = new MenuContentPositionProvider((Density) consume222, dropdownPanelAnchor2);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableTransitionState = (MutableTransitionState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final FocusRequester focusRequester22 = (FocusRequester) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            modifier5 = modifier4;
            composer2 = startRestartGroup;
            dropdownPanelAnchor3 = dropdownPanelAnchor2;
            enterTransition2 = appearInstantly;
            exitTransition4 = exitTransition3;
            AndroidPopup_androidKt.Popup(menuContentPositionProvider22, onDismissRequest, new PopupProperties(true, true, true, false, 8, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1372539255, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i15) {
                    if ((i15 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1372539255, i15, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous> (DropdownMenu.kt:81)");
                    }
                    ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localFocusManager);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    final FocusManager focusManager = (FocusManager) consume3;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composer3.startReplaceGroup(-1633490746);
                    boolean changedInstance = composer3.changedInstance(focusManager) | composer3.changed(onDismissRequest);
                    final Function0<Unit> function0 = onDismissRequest;
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                return m9515invokeZmokQxo(keyEvent.m6792unboximpl());
                            }

                            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                            public final Boolean m9515invokeZmokQxo(android.view.KeyEvent event) {
                                Intrinsics.checkNotNullParameter(event, "event");
                                long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                                boolean z2 = true;
                                if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                                    }
                                } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                        FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                                    }
                                } else if (!Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6584getEscapeEK5gGoQ())) {
                                    z2 = false;
                                } else if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    function0.invoke();
                                }
                                return Boolean.valueOf(z2);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (Function1) rememberedValue3);
                    MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                    EnterTransition enterTransition4 = enterTransition2;
                    ExitTransition exitTransition6 = exitTransition4;
                    final Modifier modifier7 = modifier5;
                    final FocusRequester focusRequester222 = focusRequester22;
                    final Shape shape5 = shape3;
                    final long j1022 = j5;
                    final PaddingValues paddingValues3 = paddingValues2;
                    final MutableTransitionState<Boolean> mutableTransitionState3 = mutableTransitionState;
                    final long j11 = j4;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3 = content;
                    AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState2, onKeyEvent, enterTransition4, exitTransition6, (String) null, ComposableLambdaKt.rememberComposableLambda(1329129375, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                            invoke(animatedVisibilityScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i16) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1329129375, i16, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous>.<anonymous> (DropdownMenu.kt:114)");
                            }
                            Modifier padding = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusRequesterModifierKt.focusRequester(Modifier.this, focusRequester222), shape5), j1022, null, 2, null), paddingValues3);
                            MutableTransitionState<Boolean> mutableTransitionState4 = mutableTransitionState3;
                            long j12 = j11;
                            FocusRequester focusRequester3 = focusRequester222;
                            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                            ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, padding);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                            Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            final ColumnScope columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer4.startReplaceGroup(93162377);
                            if (mutableTransitionState4.getCurrentState().booleanValue()) {
                                Unit unit = Unit.INSTANCE;
                                composer4.startReplaceGroup(5004770);
                                DropdownMenuKt$DropdownMenuPanel$1$2$1$1$1 rememberedValue4 = composer4.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new DropdownMenuKt$DropdownMenuPanel$1$2$1$1$1(focusRequester3, null);
                                    composer4.updateRememberedValue(rememberedValue4);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer4, 6);
                            }
                            composer4.endReplaceGroup();
                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j12)), ComposableLambdaKt.rememberComposableLambda(-921634519, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1$2$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i17) {
                                    if ((i17 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-921634519, i17, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DropdownMenu.kt:128)");
                                    }
                                    function32.invoke(columnScopeInstance, composer5, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer4.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, (i13 & 112) | 3456, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            long j1022 = j4;
            enterTransition3 = enterTransition2;
            modifier6 = modifier5;
            shape4 = shape3;
            j6 = j5;
            j7 = j1022;
            exitTransition5 = exitTransition4;
            dropdownPanelAnchor4 = dropdownPanelAnchor3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        shape2 = shape;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i11 == 0) {
        }
        long j8222 = j3;
        modifier3 = companion;
        dropdownPanelAnchor2 = bottomStart;
        j5 = j8222;
        startRestartGroup.endDefaults();
        exitTransition3 = exitTransition2;
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        MenuContentPositionProvider menuContentPositionProvider222 = new MenuContentPositionProvider((Density) consume2222, dropdownPanelAnchor2);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableTransitionState = (MutableTransitionState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
        if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final FocusRequester focusRequester222 = (FocusRequester) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        modifier5 = modifier4;
        composer2 = startRestartGroup;
        dropdownPanelAnchor3 = dropdownPanelAnchor2;
        enterTransition2 = appearInstantly;
        exitTransition4 = exitTransition3;
        AndroidPopup_androidKt.Popup(menuContentPositionProvider222, onDismissRequest, new PopupProperties(true, true, true, false, 8, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1372539255, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i15) {
                if ((i15 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1372539255, i15, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous> (DropdownMenu.kt:81)");
                }
                ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume3 = composer3.consume(localFocusManager);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                final FocusManager focusManager = (FocusManager) consume3;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer3.startReplaceGroup(-1633490746);
                boolean changedInstance = composer3.changedInstance(focusManager) | composer3.changed(onDismissRequest);
                final Function0<Unit> function0 = onDismissRequest;
                Object rememberedValue3 = composer3.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                            return m9515invokeZmokQxo(keyEvent.m6792unboximpl());
                        }

                        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                        public final Boolean m9515invokeZmokQxo(android.view.KeyEvent event) {
                            Intrinsics.checkNotNullParameter(event, "event");
                            long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                            boolean z2 = true;
                            if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5300getNextdhqQ8s());
                                }
                            } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                                if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                    FocusManager.this.mo5306moveFocus3ESFkO8(FocusDirection.INSTANCE.m5301getPreviousdhqQ8s());
                                }
                            } else if (!Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6584getEscapeEK5gGoQ())) {
                                z2 = false;
                            } else if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                                function0.invoke();
                            }
                            return Boolean.valueOf(z2);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue3);
                }
                composer3.endReplaceGroup();
                Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, (Function1) rememberedValue3);
                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                EnterTransition enterTransition4 = enterTransition2;
                ExitTransition exitTransition6 = exitTransition4;
                final Modifier modifier7 = modifier5;
                final FocusRequester focusRequester2222 = focusRequester222;
                final Shape shape5 = shape3;
                final long j10222 = j5;
                final PaddingValues paddingValues3 = paddingValues2;
                final MutableTransitionState<Boolean> mutableTransitionState3 = mutableTransitionState;
                final long j11 = j4;
                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3 = content;
                AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState2, onKeyEvent, enterTransition4, exitTransition6, (String) null, ComposableLambdaKt.rememberComposableLambda(1329129375, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                        invoke(animatedVisibilityScope, composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i16) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1329129375, i16, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous>.<anonymous> (DropdownMenu.kt:114)");
                        }
                        Modifier padding = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(FocusRequesterModifierKt.focusRequester(Modifier.this, focusRequester2222), shape5), j10222, null, 2, null), paddingValues3);
                        MutableTransitionState<Boolean> mutableTransitionState4 = mutableTransitionState3;
                        long j12 = j11;
                        FocusRequester focusRequester3 = focusRequester2222;
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, padding);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        final ColumnScope columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer4.startReplaceGroup(93162377);
                        if (mutableTransitionState4.getCurrentState().booleanValue()) {
                            Unit unit = Unit.INSTANCE;
                            composer4.startReplaceGroup(5004770);
                            DropdownMenuKt$DropdownMenuPanel$1$2$1$1$1 rememberedValue4 = composer4.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new DropdownMenuKt$DropdownMenuPanel$1$2$1$1$1(focusRequester3, null);
                                composer4.updateRememberedValue(rememberedValue4);
                            }
                            composer4.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer4, 6);
                        }
                        composer4.endReplaceGroup();
                        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j12)), ComposableLambdaKt.rememberComposableLambda(-921634519, true, new Function2<Composer, Integer, Unit>() { // from class: com.composeunstyled.DropdownMenuKt$DropdownMenuPanel$1$2$1$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i17) {
                                if ((i17 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-921634519, i17, -1, "com.composeunstyled.DropdownMenuPanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DropdownMenu.kt:128)");
                                }
                                function32.invoke(columnScopeInstance, composer5, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), composer2, (i13 & 112) | 3456, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        long j10222 = j4;
        enterTransition3 = enterTransition2;
        modifier6 = modifier5;
        shape4 = shape3;
        j6 = j5;
        j7 = j10222;
        exitTransition5 = exitTransition4;
        dropdownPanelAnchor4 = dropdownPanelAnchor3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
