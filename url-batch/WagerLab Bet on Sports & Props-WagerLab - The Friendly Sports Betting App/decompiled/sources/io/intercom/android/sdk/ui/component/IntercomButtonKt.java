package io.intercom.android.sdk.ui.component;

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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomButton.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"IntercomButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "text", "", "trailingIconId", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/ui/component/IntercomButton$Style;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PrimaryButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "PrimaryButtonWithTrailingIconPreview", "OutlinedButtonPreview", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomButton$lambda$0(Modifier modifier, IntercomButton.Style style, String text, Integer num, Function0 onClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(style, "$style");
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        IntercomButton(modifier, style, text, num, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedButtonPreview$lambda$3(int i, Composer composer, int i2) {
        OutlinedButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonPreview$lambda$1(int i, Composer composer, int i2) {
        PrimaryButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonWithTrailingIconPreview$lambda$2(int i, Composer composer, int i2) {
        PrimaryButtonWithTrailingIconPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IntercomButton(Modifier modifier, final IntercomButton.Style style, final String text, Integer num, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Integer num2;
        int i4;
        final Integer num3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1819808567);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= startRestartGroup.changed(style) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(text) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            num2 = num;
            i3 |= startRestartGroup.changed(num2) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(onClick) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 46811) == 9362 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (i6 != 0) {
                    num2 = null;
                }
                final Integer num4 = num2;
                modifier2 = companion;
                ButtonKt.OutlinedButton(onClick, modifier2, false, IntercomTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall(), ButtonDefaults.INSTANCE.m2397outlinedButtonColorsro_MJ88(style.m11970getBackgroundColor0d7_KjU(), style.m11971getContentColor0d7_KjU(), 0L, 0L, startRestartGroup, ButtonDefaults.$stable << 12, 12), null, style.getBorder(), PaddingKt.m831PaddingValuesYgX7TsA(Dp.m8401constructorimpl(12), Dp.m8401constructorimpl(10)), null, ComposableLambdaKt.rememberComposableLambda(905924137, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt$IntercomButton$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num5) {
                        invoke(rowScope, composer2, num5.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope OutlinedButton, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                        if ((i7 & 81) != 16 || !composer2.getSkipping()) {
                            TextKt.m3581TextNvy7gAk(text, null, IntercomButton.Style.this.m11971getContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, 6).getType04(), composer2, 0, 0, 131066);
                            Integer num5 = num4;
                            if (num5 == null) {
                                return;
                            }
                            IntercomButton.Style style2 = IntercomButton.Style.this;
                            int intValue = num5.intValue();
                            SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(6)), composer2, 6);
                            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(intValue, composer2, 0), (String) null, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), style2.m11971getContentColor0d7_KjU(), composer2, 440, 0);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i4 >> 12) & 14) | 817889280 | ((i4 << 3) & 112), 292);
                num3 = num4;
            } else {
                startRestartGroup.skipToGroupEnd();
                num3 = num2;
            }
            final Modifier modifier3 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit IntercomButton$lambda$0;
                        IntercomButton$lambda$0 = IntercomButtonKt.IntercomButton$lambda$0(Modifier.this, style, text, num3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return IntercomButton$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        num2 = num;
        if ((i2 & 16) == 0) {
        }
        i4 = i3;
        if ((i4 & 46811) == 9362) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        final Integer num42 = num2;
        modifier2 = companion;
        ButtonKt.OutlinedButton(onClick, modifier2, false, IntercomTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall(), ButtonDefaults.INSTANCE.m2397outlinedButtonColorsro_MJ88(style.m11970getBackgroundColor0d7_KjU(), style.m11971getContentColor0d7_KjU(), 0L, 0L, startRestartGroup, ButtonDefaults.$stable << 12, 12), null, style.getBorder(), PaddingKt.m831PaddingValuesYgX7TsA(Dp.m8401constructorimpl(12), Dp.m8401constructorimpl(10)), null, ComposableLambdaKt.rememberComposableLambda(905924137, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt$IntercomButton$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num5) {
                invoke(rowScope, composer2, num5.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope OutlinedButton, Composer composer2, int i7) {
                Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                if ((i7 & 81) != 16 || !composer2.getSkipping()) {
                    TextKt.m3581TextNvy7gAk(text, null, IntercomButton.Style.this.m11971getContentColor0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, 6).getType04(), composer2, 0, 0, 131066);
                    Integer num5 = num42;
                    if (num5 == null) {
                        return;
                    }
                    IntercomButton.Style style2 = IntercomButton.Style.this;
                    int intValue = num5.intValue();
                    SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(6)), composer2, 6);
                    IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(intValue, composer2, 0), (String) null, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), style2.m11971getContentColor0d7_KjU(), composer2, 440, 0);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i4 >> 12) & 14) | 817889280 | ((i4 << 3) & 112), 292);
        num3 = num42;
        final Modifier modifier32 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @IntercomPreviews
    private static final void PrimaryButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1818981662);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m11948getLambda1$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PrimaryButtonPreview$lambda$1;
                    PrimaryButtonPreview$lambda$1 = IntercomButtonKt.PrimaryButtonPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PrimaryButtonPreview$lambda$1;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void PrimaryButtonWithTrailingIconPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-340414909);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m11949getLambda2$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PrimaryButtonWithTrailingIconPreview$lambda$2;
                    PrimaryButtonWithTrailingIconPreview$lambda$2 = IntercomButtonKt.PrimaryButtonWithTrailingIconPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PrimaryButtonWithTrailingIconPreview$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void OutlinedButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2065130974);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$IntercomButtonKt.INSTANCE.m11950getLambda3$intercom_sdk_ui_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.component.IntercomButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OutlinedButtonPreview$lambda$3;
                    OutlinedButtonPreview$lambda$3 = IntercomButtonKt.OutlinedButtonPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return OutlinedButtonPreview$lambda$3;
                }
            });
        }
    }
}
