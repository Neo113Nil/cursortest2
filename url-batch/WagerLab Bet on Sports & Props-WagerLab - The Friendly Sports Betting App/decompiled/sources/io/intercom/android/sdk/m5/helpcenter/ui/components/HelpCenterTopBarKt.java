package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterTopBar.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"HelpCenterTopBar", "", "onBackClick", "Lkotlin/Function0;", "onSearchClick", "navIcon", "", "title", "Lio/intercom/android/sdk/ui/common/StringProvider;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILio/intercom/android/sdk/ui/common/StringProvider;Landroidx/compose/runtime/Composer;II)V", "HelpCenterTopBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpCenterTopBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterTopBar$lambda$0(Function0 onBackClick, Function0 onSearchClick, int i, StringProvider stringProvider, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(onBackClick, "$onBackClick");
        Intrinsics.checkNotNullParameter(onSearchClick, "$onSearchClick");
        HelpCenterTopBar(onBackClick, onSearchClick, i, stringProvider, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterTopBarPreview$lambda$1(int i, Composer composer, int i2) {
        HelpCenterTopBarPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if ((r28 & 8) != 0) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HelpCenterTopBar(final Function0<Unit> onBackClick, final Function0<Unit> onSearchClick, int i, StringProvider stringProvider, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        StringProvider.StringRes stringRes;
        Composer composer2;
        final int i6;
        final StringProvider stringProvider2;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onSearchClick, "onSearchClick");
        Composer startRestartGroup = composer.startRestartGroup(644687815);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changedInstance(onBackClick) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(onSearchClick) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                i5 = i;
                if (startRestartGroup.changed(i5)) {
                    i8 = 256;
                    i4 |= i8;
                }
            } else {
                i5 = i;
            }
            i8 = 128;
            i4 |= i8;
        } else {
            i5 = i;
        }
        if ((i2 & 7168) == 0) {
            if ((i3 & 8) == 0) {
                stringRes = stringProvider;
                if (startRestartGroup.changed(stringRes)) {
                    i7 = 2048;
                    i4 |= i7;
                }
            } else {
                stringRes = stringProvider;
            }
            i7 = 1024;
            i4 |= i7;
        } else {
            stringRes = stringProvider;
        }
        if ((i4 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            } else {
                if ((i3 & 4) != 0) {
                    i5 = R.drawable.intercom_ic_back;
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    stringRes = new StringProvider.StringRes(io.intercom.android.sdk.R.string.intercom_get_help, null, 2, null);
                    i4 &= -7169;
                }
                int i9 = i4;
                int i10 = i5;
                StringProvider stringProvider3 = stringRes;
                startRestartGroup.endDefaults();
                long m12164getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12164getHeader0d7_KjU();
                final long m12171getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12171getOnHeader0d7_KjU();
                composer2 = startRestartGroup;
                TopActionBarKt.m11189TopActionBarNpQZenA(null, stringProvider3.getText(startRestartGroup, StringProvider.$stable | ((i9 >> 9) & 14)), null, null, null, onBackClick, Integer.valueOf(i10), false, m12164getHeader0d7_KjU, m12171getOnHeader0d7_KjU, 0L, null, ComposableLambdaKt.rememberComposableLambda(736282477, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt$HelpCenterTopBar$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope TopActionBar, Composer composer3, int i11) {
                        Intrinsics.checkNotNullParameter(TopActionBar, "$this$TopActionBar");
                        if ((i11 & 81) != 16 || !composer3.getSkipping()) {
                            Function0<Unit> function0 = onSearchClick;
                            final long j = m12171getOnHeader0d7_KjU;
                            IconButtonKt.IconButton(function0, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(1957925771, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt$HelpCenterTopBar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i12) {
                                    if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                        IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(io.intercom.android.sdk.R.drawable.intercom_gif_search_icon, composer4, 0), StringResources_androidKt.stringResource(io.intercom.android.sdk.R.string.intercom_search_help_articles, composer4, 0), (Modifier) null, j, composer4, 8, 4);
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 1572864, 62);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), composer2, ((i9 << 15) & 458752) | ((i9 << 12) & 3670016), 384, 3229);
                i6 = i10;
                stringProvider2 = stringProvider3;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
            i6 = i5;
            stringProvider2 = stringRes;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HelpCenterTopBar$lambda$0;
                    HelpCenterTopBar$lambda$0 = HelpCenterTopBarKt.HelpCenterTopBar$lambda$0(Function0.this, onSearchClick, i6, stringProvider2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return HelpCenterTopBar$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void HelpCenterTopBarPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-536592516);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterTopBarKt.INSTANCE.m11515getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HelpCenterTopBarPreview$lambda$1;
                    HelpCenterTopBarPreview$lambda$1 = HelpCenterTopBarKt.HelpCenterTopBarPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HelpCenterTopBarPreview$lambda$1;
                }
            });
        }
    }
}
