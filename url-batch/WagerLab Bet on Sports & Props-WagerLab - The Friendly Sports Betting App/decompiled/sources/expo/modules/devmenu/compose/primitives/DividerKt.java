package expo.modules.devmenu.compose.primitives;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import io.branch.referral.BranchError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Divider.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Divider", "", "thickness", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-kbKKJSQ", "(FJLandroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DividerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Divider_kbKKJSQ$lambda$2(float f, long j, int i, int i2, Composer composer, int i3) {
        m10817DividerkbKKJSQ(f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if ((r12 & 2) != 0) goto L42;
     */
    /* renamed from: Divider-kbKKJSQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10817DividerkbKKJSQ(final float f, final long j, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1102915138);
        ComposerKt.sourceInformation(startRestartGroup, "C(Divider)P(1:c#ui.unit.Dp,0:c#ui.graphics.Color)17@615L185,17@565L235:Divider.kt#k98qbf");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j)) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "15@537L6");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    f = Dp.INSTANCE.m8419getHairlineD9Ej5fM();
                }
                if ((i2 & 2) != 0) {
                    j = NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getBorder().getDefault();
                    i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1102915138, i3, -1, "expo.modules.devmenu.compose.primitives.Divider (Divider.kt:16)");
                }
                boolean z = true;
                Modifier m875height3ABfNKs = SizeKt.m875height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), f);
                startRestartGroup.startReplaceGroup(-1633490746);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Divider.kt#9igjgp");
                boolean z2 = (i3 & 14) == 4;
                if ((((i3 & 112) ^ 48) <= 32 || !startRestartGroup.changed(j)) && (i3 & 48) != 32) {
                    z = false;
                }
                boolean z3 = z2 | z;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: expo.modules.devmenu.compose.primitives.DividerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Divider_kbKKJSQ$lambda$1$lambda$0;
                            Divider_kbKKJSQ$lambda$1$lambda$0 = DividerKt.Divider_kbKKJSQ$lambda$1$lambda$0(f, j, (DrawScope) obj);
                            return Divider_kbKKJSQ$lambda$1$lambda$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(m875height3ABfNKs, (Function1) rememberedValue, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        }
        final float f2 = f;
        final long j2 = j;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.primitives.DividerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit Divider_kbKKJSQ$lambda$2;
                    Divider_kbKKJSQ$lambda$2 = DividerKt.Divider_kbKKJSQ$lambda$2(f2, j2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return Divider_kbKKJSQ$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Divider_kbKKJSQ$lambda$1$lambda$0(float f, long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f2 = Canvas.mo424toPx0680j_4(f);
        float f3 = 2;
        float f4 = Canvas.mo424toPx0680j_4(f) / f3;
        long m5405constructorimpl = Offset.m5405constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6236getSizeNHjbRc() >> 32));
        float f5 = Canvas.mo424toPx0680j_4(f) / f3;
        DrawScope.m6222drawLineNGM6Ib0$default(Canvas, j, m5405constructorimpl, Offset.m5405constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L)), f2, 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }
}
