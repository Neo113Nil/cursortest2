package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import io.branch.referral.BranchError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001a\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u001c\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "<init>", "()V", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Indicator", "height", "Indicator-9IZ8Weo", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material/TabPosition;", "DividerOpacity", "", "DividerThickness", "getDividerThickness-D9Ej5fM", "()F", "F", "IndicatorHeight", "getIndicatorHeight-D9Ej5fM", "ScrollableTabRowPadding", "getScrollableTabRowPadding-D9Ej5fM", "material", "currentTabWidth", "indicatorOffset"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float DividerThickness = Dp.m8401constructorimpl(1);
    private static final float IndicatorHeight = Dp.m8401constructorimpl(2);
    private static final float ScrollableTabRowPadding = Dp.m8401constructorimpl(52);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Divider_9IZ8Weo$lambda$0(TabRowDefaults tabRowDefaults, Modifier modifier, float f, long j, int i, int i2, Composer composer, int i3) {
        tabRowDefaults.m2198Divider9IZ8Weo(modifier, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Indicator_9IZ8Weo$lambda$1(TabRowDefaults tabRowDefaults, Modifier modifier, float f, long j, int i, int i2, Composer composer, int i3) {
        tabRowDefaults.m2199Indicator9IZ8Weo(modifier, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private TabRowDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0086  */
    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2198Divider9IZ8Weo(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        float f2;
        long j2;
        final float f3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        float f4;
        float f5;
        long j4;
        Modifier modifier3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(910934799);
        ComposerKt.sourceInformation(startRestartGroup, "C(Divider)N(modifier,thickness:c#ui.unit.Dp,color:c#ui.graphics.Color)356@16448L66:TabRow.kt#jmzs0o");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                f2 = f;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "354@16368L7");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    f5 = f2;
                    j4 = j2;
                    modifier3 = modifier2;
                } else {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        f4 = DividerThickness;
                        i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 4) != 0) {
                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContentColor);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        j2 = Color.m5656copywmQWz5c$default(((Color) consume).m5667unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -897;
                    }
                    f5 = f4;
                    j4 = j2;
                    modifier3 = companion;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(910934799, i3, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:355)");
                }
                DividerKt.m1987DivideroMI9zvI(modifier3, j4, f5, 0.0f, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j3 = j4;
                f3 = f5;
            } else {
                startRestartGroup.skipToGroupEnd();
                f3 = f2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabRowDefaults$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Divider_9IZ8Weo$lambda$0;
                        Divider_9IZ8Weo$lambda$0 = TabRowDefaults.Divider_9IZ8Weo$lambda$0(TabRowDefaults.this, modifier2, f3, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Divider_9IZ8Weo$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008a  */
    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2199Indicator9IZ8Weo(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long j2;
        TabRowDefaults tabRowDefaults;
        final Modifier.Companion companion;
        final float f3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1499002201);
        ComposerKt.sourceInformation(startRestartGroup, "C(Indicator)N(modifier,height:c#ui.unit.Dp,color:c#ui.graphics.Color)373@16982L69:TabRow.kt#jmzs0o");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (startRestartGroup.changed(f2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                f2 = f;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (startRestartGroup.changed(j2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            tabRowDefaults = this;
            i3 |= startRestartGroup.changed(tabRowDefaults) ? 2048 : 1024;
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "371@16957L7");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    companion = modifier2;
                    f3 = f2;
                } else {
                    companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        f3 = IndicatorHeight;
                        i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 4) != 0) {
                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContentColor);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        j2 = ((Color) consume).m5667unboximpl();
                        i3 &= -897;
                    }
                }
                long j4 = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1499002201, i3, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:372)");
                }
                BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(SizeKt.m875height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f3), j4, null, 2, null), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = j4;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                f3 = f2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final TabRowDefaults tabRowDefaults2 = tabRowDefaults;
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabRowDefaults$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Indicator_9IZ8Weo$lambda$1;
                        Indicator_9IZ8Weo$lambda$1 = TabRowDefaults.Indicator_9IZ8Weo$lambda$1(TabRowDefaults.this, companion, f3, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Indicator_9IZ8Weo$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        tabRowDefaults = this;
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m2200getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m2201getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m2202getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    public final Modifier tabIndicatorOffset(Modifier modifier, final TabPosition tabPosition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(TabPosition.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new TabRowDefaults$tabIndicatorOffset$2(tabPosition));
    }
}
