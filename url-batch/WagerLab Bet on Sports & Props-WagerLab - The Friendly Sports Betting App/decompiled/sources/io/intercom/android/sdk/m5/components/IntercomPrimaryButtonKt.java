package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomPrimaryButton.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\n\u001aM\u0010\u000b\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"IntercomPrimaryButton", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "trailingIconId", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LegacyIntercomPrimaryButton", ViewProps.ENABLED, "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PrimaryButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "PrimaryButtonWithTrailingIconPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomPrimaryButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomPrimaryButton$lambda$0(String text, Modifier modifier, Integer num, Function0 onClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        IntercomPrimaryButton(text, modifier, num, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegacyIntercomPrimaryButton$lambda$1(String text, Modifier modifier, Integer num, Function0 onClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        LegacyIntercomPrimaryButton(text, modifier, num, (Function0<Unit>) onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegacyIntercomPrimaryButton$lambda$2(Function0 onClick, Modifier modifier, boolean z, Function3 content, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        Intrinsics.checkNotNullParameter(content, "$content");
        LegacyIntercomPrimaryButton((Function0<Unit>) onClick, modifier, z, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonPreview$lambda$3(int i, Composer composer, int i2) {
        PrimaryButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonWithTrailingIconPreview$lambda$4(int i, Composer composer, int i2) {
        PrimaryButtonWithTrailingIconPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IntercomPrimaryButton(String text, Modifier modifier, Integer num, Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        final String str;
        final Function0<Unit> function0;
        final Modifier modifier2;
        final Integer num2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-801577387);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        if ((i3 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            function0 = onClick;
            num2 = num;
            modifier2 = modifier;
            str = text;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                num = null;
            }
            Integer num3 = num;
            LegacyIntercomPrimaryButton(text, modifier3, num3, onClick, startRestartGroup, i3 & 8190, 0);
            str = text;
            function0 = onClick;
            modifier2 = modifier3;
            num2 = num3;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IntercomPrimaryButton$lambda$0;
                    IntercomPrimaryButton$lambda$0 = IntercomPrimaryButtonKt.IntercomPrimaryButton$lambda$0(str, modifier2, num2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return IntercomPrimaryButton$lambda$0;
                }
            });
        }
    }

    @Deprecated(message = "Deprecated component", replaceWith = @ReplaceWith(expression = "IntercomPrimaryButton() from ui module", imports = {}))
    private static final void LegacyIntercomPrimaryButton(final String str, Modifier modifier, Integer num, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        final Integer num2;
        Composer startRestartGroup = composer.startRestartGroup(398234558);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
        }
        if ((i3 & 5771) != 1154 || !startRestartGroup.getSkipping()) {
            if ((i2 & 2) != 0) {
                modifier = Modifier.INSTANCE;
            }
            final Integer num3 = i4 != 0 ? null : num;
            LegacyIntercomPrimaryButton(function02, (Modifier) null, false, (Function3<? super RowScope, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(2099872974, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt$LegacyIntercomPrimaryButton$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num4) {
                    invoke(rowScope, composer2, num4.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope LegacyIntercomPrimaryButton, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(LegacyIntercomPrimaryButton, "$this$LegacyIntercomPrimaryButton");
                    if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                        TextKt.m3581TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12168getOnAction0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer2, 0, 0, 131070);
                        Integer num4 = num3;
                        if (num4 == null) {
                            return;
                        }
                        int intValue = num4.intValue();
                        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(6)), composer2, 6);
                        IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(intValue, composer2, 0), (String) null, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m12168getOnAction0d7_KjU(), composer2, 440, 0);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 9) & 14) | 3072, 6);
            num2 = num3;
        } else {
            startRestartGroup.skipToGroupEnd();
            num2 = num;
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LegacyIntercomPrimaryButton$lambda$1;
                    LegacyIntercomPrimaryButton$lambda$1 = IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$1(str, modifier2, num2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return LegacyIntercomPrimaryButton$lambda$1;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LegacyIntercomPrimaryButton(final Function0<Unit> onClick, Modifier modifier, boolean z, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        BorderStroke m292BorderStrokecXLIe8U;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1285013288);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
                }
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (ColorExtensionsKt.m12245isLightColor8_81llA(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12147getAction0d7_KjU())) {
                        m292BorderStrokecXLIe8U = BorderStrokeKt.m292BorderStrokecXLIe8U(Dp.m8401constructorimpl(1), Color.m5656copywmQWz5c$default(Color.INSTANCE.m5683getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        m292BorderStrokecXLIe8U = BorderStrokeKt.m292BorderStrokecXLIe8U(Dp.m8401constructorimpl(1), Color.m5656copywmQWz5c$default(Color.INSTANCE.m5694getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                    }
                    int i6 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | ((i3 << 18) & 1879048192);
                    Modifier modifier4 = companion;
                    boolean z4 = z2;
                    ButtonKt.Button(onClick, modifier4, z4, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), ButtonDefaults.INSTANCE.m2387buttonColorsro_MJ88(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12147getAction0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12168getOnAction0d7_KjU(), Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), startRestartGroup, ButtonDefaults.$stable << 12, 0), null, m292BorderStrokecXLIe8U, PaddingKt.m831PaddingValuesYgX7TsA(Dp.m8401constructorimpl(16), Dp.m8401constructorimpl(12)), null, content, startRestartGroup, i6, 288);
                    z3 = z4;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit LegacyIntercomPrimaryButton$lambda$2;
                            LegacyIntercomPrimaryButton$lambda$2 = IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton$lambda$2(Function0.this, modifier3, z3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return LegacyIntercomPrimaryButton$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 5851) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ColorExtensionsKt.m12245isLightColor8_81llA(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12147getAction0d7_KjU())) {
            }
            int i62 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | ((i3 << 18) & 1879048192);
            Modifier modifier42 = companion;
            boolean z42 = z2;
            ButtonKt.Button(onClick, modifier42, z42, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), ButtonDefaults.INSTANCE.m2387buttonColorsro_MJ88(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12147getAction0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12168getOnAction0d7_KjU(), Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), startRestartGroup, ButtonDefaults.$stable << 12, 0), null, m292BorderStrokecXLIe8U, PaddingKt.m831PaddingValuesYgX7TsA(Dp.m8401constructorimpl(16), Dp.m8401constructorimpl(12)), null, content, startRestartGroup, i62, 288);
            z3 = z42;
            modifier3 = modifier42;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ColorExtensionsKt.m12245isLightColor8_81llA(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12147getAction0d7_KjU())) {
        }
        int i622 = 12582912 | (i3 & 14) | (i3 & 112) | (i3 & 896) | ((i3 << 18) & 1879048192);
        Modifier modifier422 = companion;
        boolean z422 = z2;
        ButtonKt.Button(onClick, modifier422, z422, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), ButtonDefaults.INSTANCE.m2387buttonColorsro_MJ88(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12147getAction0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12168getOnAction0d7_KjU(), Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), startRestartGroup, ButtonDefaults.$stable << 12, 0), null, m292BorderStrokecXLIe8U, PaddingKt.m831PaddingValuesYgX7TsA(Dp.m8401constructorimpl(16), Dp.m8401constructorimpl(12)), null, content, startRestartGroup, i622, 288);
        z3 = z422;
        modifier3 = modifier422;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    @IntercomPreviews
    private static final void PrimaryButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1925294537);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m11134getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PrimaryButtonPreview$lambda$3;
                    PrimaryButtonPreview$lambda$3 = IntercomPrimaryButtonKt.PrimaryButtonPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PrimaryButtonPreview$lambda$3;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void PrimaryButtonWithTrailingIconPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1297682962);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m11135getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PrimaryButtonWithTrailingIconPreview$lambda$4;
                    PrimaryButtonWithTrailingIconPreview$lambda$4 = IntercomPrimaryButtonKt.PrimaryButtonWithTrailingIconPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PrimaryButtonWithTrailingIconPreview$lambda$4;
                }
            });
        }
    }
}
