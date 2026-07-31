package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AndroidMenu.android.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001ac\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001f\"\u0014\u0010 \u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", DiagnosticsEntry.PROPERTIES_KEY, "Landroidx/compose/ui/window/PopupProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "scrollState", "Landroidx/compose/foundation/ScrollState;", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", ViewProps.ON_CLICK, ViewProps.ENABLED, "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DefaultMenuProperties", "getDefaultMenuProperties", "()Landroidx/compose/ui/window/PopupProperties;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt {
    private static final PopupProperties DefaultMenuProperties = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenuItem$lambda$6(Function0 function0, Modifier modifier, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, Composer composer, int i3) {
        DropdownMenuItem(function0, modifier, z, paddingValues, mutableInteractionSource, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenu_4kj__NE$lambda$5(boolean z, Function0 function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1860DropdownMenu4kj_NE(z, function0, modifier, j, scrollState, popupProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenu_ILWXrKs$lambda$0(boolean z, Function0 function0, Modifier modifier, long j, PopupProperties popupProperties, Function3 function3, int i, int i2, Composer composer, int i3) {
        m1861DropdownMenuILWXrKs(z, function0, modifier, j, popupProperties, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006b  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    /* renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1861DropdownMenuILWXrKs(final boolean z, final Function0 function0, Modifier modifier, long j, PopupProperties popupProperties, final Function3 function3, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Function0 function02;
        Modifier modifier2;
        int i4;
        int i5;
        Function3 function32;
        Composer composer2;
        final PopupProperties popupProperties2;
        final Modifier modifier3;
        final long j2;
        ScopeUpdateScope endRestartGroup;
        long j3;
        Composer startRestartGroup = composer.startRestartGroup(-2042390678);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)N(expanded,onDismissRequest,modifier,offset:c#ui.unit.DpOffset,properties,content)61@2359L21,56@2195L252:AndroidMenu.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(j) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(popupProperties) ? 16384 : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        popupProperties2 = popupProperties;
                        modifier3 = modifier2;
                        j2 = j;
                    } else {
                        Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            float m8401constructorimpl = Dp.m8401constructorimpl(0);
                            j3 = DpOffset.m8457constructorimpl((Float.floatToRawIntBits(Dp.m8401constructorimpl(r4)) & 4294967295L) | (Float.floatToRawIntBits(m8401constructorimpl) << 32));
                        } else {
                            j3 = j;
                        }
                        PopupProperties popupProperties3 = i5 != 0 ? new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null) : popupProperties;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2042390678, i3, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:56)");
                        }
                        int i7 = i3 & 8190;
                        int i8 = i3 << 3;
                        composer2 = startRestartGroup;
                        m1860DropdownMenu4kj_NE(z2, function02, modifier4, j3, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), popupProperties3, function32, composer2, i7 | (458752 & i8) | (i8 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        j2 = j3;
                        popupProperties2 = popupProperties3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DropdownMenu_ILWXrKs$lambda$0;
                                DropdownMenu_ILWXrKs$lambda$0 = AndroidMenu_androidKt.DropdownMenu_ILWXrKs$lambda$0(z, function0, modifier3, j2, popupProperties2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return DropdownMenu_ILWXrKs$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                function32 = function3;
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 32) != 0) {
            }
            function32 = function3;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        function32 = function3;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a2  */
    /* renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1860DropdownMenu4kj_NE(boolean z, final Function0<Unit> function0, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        long j2;
        ScrollState scrollState2;
        int i6;
        PopupProperties popupProperties2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        char c;
        int i7;
        final Modifier modifier3;
        final ScrollState scrollState3;
        final PopupProperties popupProperties3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        PopupProperties popupProperties4;
        final Modifier modifier4;
        final ScrollState scrollState4;
        Object rememberedValue;
        final MutableTransitionState mutableTransitionState;
        Object rememberedValue2;
        Object rememberedValue3;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1275450738);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)N(expanded,onDismissRequest,modifier,offset:c#ui.unit.DpOffset,scrollState,properties,content)76@2730L42:AndroidMenu.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    j2 = j;
                    i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            scrollState2 = scrollState;
                            if (startRestartGroup.changed(scrollState2)) {
                                i10 = 16384;
                                i3 |= i10;
                            }
                        } else {
                            scrollState2 = scrollState;
                        }
                        i10 = 8192;
                        i3 |= i10;
                    } else {
                        scrollState2 = scrollState;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        popupProperties2 = popupProperties;
                        i3 |= startRestartGroup.changed(popupProperties2) ? 131072 : 65536;
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                            function32 = function3;
                            c = ' ';
                        } else {
                            function32 = function3;
                            c = ' ';
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                            }
                        }
                        i7 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i7 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "122@5703L21");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    float f = 0;
                                    float m8401constructorimpl = Dp.m8401constructorimpl(f);
                                    float m8401constructorimpl2 = Dp.m8401constructorimpl(f);
                                    long floatToRawIntBits = Float.floatToRawIntBits(m8401constructorimpl);
                                    int floatToRawIntBits2 = Float.floatToRawIntBits(m8401constructorimpl2);
                                    i8 = -57345;
                                    j2 = DpOffset.m8457constructorimpl((floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << c));
                                } else {
                                    i8 = -57345;
                                }
                                if ((i2 & 16) != 0) {
                                    i9 = i7 & i8;
                                    scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                } else {
                                    i9 = i7;
                                }
                                if (i6 != 0) {
                                    popupProperties4 = DefaultMenuProperties;
                                    modifier4 = modifier2;
                                    scrollState4 = scrollState2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1275450738, i9, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:75)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642488892, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new MutableTransitionState(false);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    mutableTransitionState = (MutableTransitionState) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z2));
                                    if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                                        startRestartGroup.startReplaceGroup(-622275818);
                                        ComposerKt.sourceInformation(startRestartGroup, "80@2920L51,81@3007L7,83@3109L139,91@3420L283,87@3258L445");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642494981, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m6052boximpl(TransformOrigin.INSTANCE.m6065getCenterSzJe1aQ()), null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        final MutableState mutableState = (MutableState) rememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        Density density = (Density) consume;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642501117, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit DropdownMenu_4kj__NE$lambda$4$lambda$3;
                                                    DropdownMenu_4kj__NE$lambda$4$lambda$3 = AndroidMenu_androidKt.DropdownMenu_4kj__NE$lambda$4$lambda$3(MutableState.this, (IntRect) obj, (IntRect) obj2);
                                                    return DropdownMenu_4kj__NE$lambda$4$lambda$3;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density, (Function2) rememberedValue3, null), function0, popupProperties4, ComposableLambdaKt.rememberComposableLambda(1788768427, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i11) {
                                                ComposerKt.sourceInformation(composer2, "C92@3434L259:AndroidMenu.android.kt#jmzs0o");
                                                if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1788768427, i11, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:92)");
                                                }
                                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState4, modifier4, function33, composer2, MutableTransitionState.$stable | 48, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-621482032);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    popupProperties3 = popupProperties4;
                                    scrollState3 = scrollState4;
                                    modifier3 = modifier4;
                                }
                                modifier4 = modifier2;
                                scrollState4 = scrollState2;
                                popupProperties4 = popupProperties2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642488892, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableTransitionState = (MutableTransitionState) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z2));
                                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                                }
                                startRestartGroup.startReplaceGroup(-622275818);
                                ComposerKt.sourceInformation(startRestartGroup, "80@2920L51,81@3007L7,83@3109L139,91@3420L283,87@3258L445");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642494981, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                final MutableState<TransformOrigin> mutableState2 = (MutableState) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localDensity2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Density density2 = (Density) consume2;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642501117, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function332 = function32;
                                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density2, (Function2) rememberedValue3, null), function0, popupProperties4, ComposableLambdaKt.rememberComposableLambda(1788768427, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i11) {
                                        ComposerKt.sourceInformation(composer2, "C92@3434L259:AndroidMenu.android.kt#jmzs0o");
                                        if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1788768427, i11, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:92)");
                                        }
                                        MenuKt.DropdownMenuContent(mutableTransitionState, mutableState2, scrollState4, modifier4, function332, composer2, MutableTransitionState.$stable | 48, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                                startRestartGroup.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                popupProperties3 = popupProperties4;
                                scrollState3 = scrollState4;
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i9 = i7 & (-57345);
                                    modifier4 = modifier2;
                                    scrollState4 = scrollState2;
                                    popupProperties4 = popupProperties2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642488892, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    mutableTransitionState = (MutableTransitionState) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z2));
                                    if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                                    }
                                    startRestartGroup.startReplaceGroup(-622275818);
                                    ComposerKt.sourceInformation(startRestartGroup, "80@2920L51,81@3007L7,83@3109L139,91@3420L283,87@3258L445");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642494981, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final MutableState<TransformOrigin> mutableState22 = (MutableState) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume22 = startRestartGroup.consume(localDensity22);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Density density22 = (Density) consume22;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642501117, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3322 = function32;
                                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density22, (Function2) rememberedValue3, null), function0, popupProperties4, ComposableLambdaKt.rememberComposableLambda(1788768427, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i11) {
                                            ComposerKt.sourceInformation(composer2, "C92@3434L259:AndroidMenu.android.kt#jmzs0o");
                                            if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1788768427, i11, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:92)");
                                            }
                                            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState22, scrollState4, modifier4, function3322, composer2, MutableTransitionState.$stable | 48, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                                    startRestartGroup.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    popupProperties3 = popupProperties4;
                                    scrollState3 = scrollState4;
                                    modifier3 = modifier4;
                                } else {
                                    modifier4 = modifier2;
                                    scrollState4 = scrollState2;
                                    popupProperties4 = popupProperties2;
                                    i9 = i7;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642488892, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    mutableTransitionState = (MutableTransitionState) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z2));
                                    if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                                    }
                                    startRestartGroup.startReplaceGroup(-622275818);
                                    ComposerKt.sourceInformation(startRestartGroup, "80@2920L51,81@3007L7,83@3109L139,91@3420L283,87@3258L445");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642494981, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final MutableState<TransformOrigin> mutableState222 = (MutableState) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume222 = startRestartGroup.consume(localDensity222);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Density density222 = (Density) consume222;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1642501117, "CC(remember):AndroidMenu.android.kt#9igjgp");
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33222 = function32;
                                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j2, density222, (Function2) rememberedValue3, null), function0, popupProperties4, ComposableLambdaKt.rememberComposableLambda(1788768427, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i11) {
                                            ComposerKt.sourceInformation(composer2, "C92@3434L259:AndroidMenu.android.kt#jmzs0o");
                                            if (!composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1788768427, i11, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:92)");
                                            }
                                            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState222, scrollState4, modifier4, function33222, composer2, MutableTransitionState.$stable | 48, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                                    startRestartGroup.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    popupProperties3 = popupProperties4;
                                    scrollState3 = scrollState4;
                                    modifier3 = modifier4;
                                }
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            scrollState3 = scrollState2;
                            popupProperties3 = popupProperties2;
                        }
                        final long j3 = j2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final boolean z3 = z2;
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DropdownMenu_4kj__NE$lambda$5;
                                    DropdownMenu_4kj__NE$lambda$5 = AndroidMenu_androidKt.DropdownMenu_4kj__NE$lambda$5(z3, function0, modifier3, j3, scrollState3, popupProperties3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return DropdownMenu_4kj__NE$lambda$5;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    popupProperties2 = popupProperties;
                    if ((i2 & 64) != 0) {
                    }
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i7 & 1)) {
                    }
                    final long j32 = j2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                j2 = j;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                popupProperties2 = popupProperties;
                if ((i2 & 64) != 0) {
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i7 & 1)) {
                }
                final long j322 = j2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            j2 = j;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            popupProperties2 = popupProperties;
            if ((i2 & 64) != 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i7 & 1)) {
            }
            final long j3222 = j2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        j2 = j;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        popupProperties2 = popupProperties;
        if ((i2 & 64) != 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i7 & 1)) {
        }
        final long j32222 = j2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DropdownMenu_4kj__NE$lambda$4$lambda$3(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.m6052boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(final Function0<Unit> function0, Modifier modifier, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        final PaddingValues paddingValues2;
        final Modifier modifier3;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(670540513);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)N(onClick,modifier,enabled,contentPadding,interactionSource,content)112@3970L160:AndroidMenu.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                            }
                        }
                        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            paddingValues2 = paddingValues;
                            modifier3 = modifier2;
                            z3 = z2;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i4 != 0 ? true : z2;
                            PaddingValues dropdownMenuItemContentPadding = i5 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues;
                            MutableInteractionSource mutableInteractionSource3 = i6 != 0 ? null : mutableInteractionSource;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(670540513, i3, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:112)");
                            }
                            MenuKt.DropdownMenuItemContent(function02, modifier4, z4, dropdownMenuItemContentPadding, mutableInteractionSource3, function32, startRestartGroup, i3 & 524286, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            paddingValues2 = dropdownMenuItemContentPadding;
                            mutableInteractionSource2 = mutableInteractionSource3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.AndroidMenu_androidKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DropdownMenuItem$lambda$6;
                                    DropdownMenuItem$lambda$6 = AndroidMenu_androidKt.DropdownMenuItem$lambda$6(Function0.this, modifier3, z3, paddingValues2, mutableInteractionSource2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return DropdownMenuItem$lambda$6;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final PopupProperties getDefaultMenuProperties() {
        return DefaultMenuProperties;
    }
}
