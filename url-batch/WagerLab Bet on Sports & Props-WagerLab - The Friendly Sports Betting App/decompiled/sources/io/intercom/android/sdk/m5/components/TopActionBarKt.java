package io.intercom.android.sdk.m5.components;

import android.app.Activity;
import android.view.Window;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.WindowCompat;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TopActionBar.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aÃ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\r2 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010 \u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010!\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010\"\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010#\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010$\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001e¨\u0006%"}, d2 = {"TopActionBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "subtitle", "subtitleIcon", "", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "onBackClick", "Lkotlin/Function0;", "navIcon", "isActive", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "subtitleColor", "onTitleClicked", "menuItems", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "TopActionBar-NpQZenA", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;ZJJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "TopActionBarAvatarPreview", "(Landroidx/compose/runtime/Composer;I)V", "TopActionBarGroupChatPreview", "TopActionBarTeamReplyTimePreview", "TopActionBarMultipleAvatarsPreview", "TopActionBarBackButtonPreview", "TopActionBarTitlePreview", "TopActionBarEndContentPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TopActionBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarAvatarPreview$lambda$11(int i, Composer composer, int i2) {
        TopActionBarAvatarPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarBackButtonPreview$lambda$15(int i, Composer composer, int i2) {
        TopActionBarBackButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarEndContentPreview$lambda$17(int i, Composer composer, int i2) {
        TopActionBarEndContentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarGroupChatPreview$lambda$12(int i, Composer composer, int i2) {
        TopActionBarGroupChatPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarMultipleAvatarsPreview$lambda$14(int i, Composer composer, int i2) {
        TopActionBarMultipleAvatarsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarTeamReplyTimePreview$lambda$13(int i, Composer composer, int i2) {
        TopActionBarTeamReplyTimePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBarTitlePreview$lambda$16(int i, Composer composer, int i2) {
        TopActionBarTitlePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBar_NpQZenA$lambda$10(Modifier modifier, String str, String str2, Integer num, List list, Function0 function0, Integer num2, boolean z, long j, long j2, long j3, Function0 function02, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        m11189TopActionBarNpQZenA(modifier, str, str2, num, list, function0, num2, z, j, j2, j3, function02, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bc  */
    /* renamed from: TopActionBar-NpQZenA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11189TopActionBarNpQZenA(Modifier modifier, String str, String str2, Integer num, List<AvatarWrapper> list, Function0<Unit> function0, Integer num2, boolean z, long j, long j2, long j3, Function0<Unit> function02, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        String str3;
        int i5;
        int i6;
        Integer num3;
        int i7;
        int i8;
        Function0<Unit> function03;
        final Integer num4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i17;
        Modifier.Companion companion;
        boolean z2;
        long j4;
        long j5;
        long j6;
        int i18;
        String str4;
        int i19;
        List<AvatarWrapper> list2;
        Integer num5;
        final long j7;
        long j8;
        final Function0<Unit> function04;
        String str5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final Window window;
        String str6;
        Function0<Unit> function05;
        int hashCode;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        Composer m4976constructorimpl;
        boolean z3;
        Object rememberedValue;
        int hashCode2;
        Composer m4976constructorimpl2;
        Function0<Unit> function06;
        boolean z4;
        int hashCode3;
        Composer m4976constructorimpl3;
        String str7;
        String str8;
        String str9;
        long j9;
        int i20;
        final Integer num6;
        final String str10;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function35;
        final long j10;
        final List<AvatarWrapper> list3;
        final Modifier modifier3;
        final long j11;
        final String str11;
        final Function0<Unit> function07;
        final long j12;
        final Function0<Unit> function08;
        final boolean z5;
        Composer composer2;
        final Integer num7;
        long j13;
        int i21;
        ScopeUpdateScope endRestartGroup;
        int i22;
        Composer startRestartGroup = composer.startRestartGroup(-1160200926);
        int i23 = i3 & 1;
        if (i23 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        int i24 = i3 & 2;
        if (i24 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            str3 = str;
            i4 |= startRestartGroup.changed(str3) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                i4 |= startRestartGroup.changed(str2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 7168) == 0) {
                    num3 = num;
                    i4 |= startRestartGroup.changed(num3) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 != 0) {
                        i4 |= 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function03 = function0;
                    } else {
                        function03 = function0;
                        if ((i & 458752) == 0) {
                            i4 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
                        }
                    }
                    if ((i & 3670016) != 0) {
                        num4 = num2;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(num4)) ? 1048576 : 524288;
                    } else {
                        num4 = num2;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                    }
                    if ((i & 234881024) != 0) {
                        if ((i3 & 256) == 0) {
                            i10 = i23;
                            if (startRestartGroup.changed(j)) {
                                i22 = 67108864;
                                i4 |= i22;
                            }
                        } else {
                            i10 = i23;
                        }
                        i22 = 33554432;
                        i4 |= i22;
                    } else {
                        i10 = i23;
                    }
                    if ((i & 1879048192) != 0) {
                        i11 = i10;
                        i4 |= ((i3 & 512) == 0 && startRestartGroup.changed(j2)) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    } else {
                        i11 = i10;
                    }
                    if ((i2 & 14) != 0) {
                        i12 = (((i3 & 1024) == 0 && startRestartGroup.changed(j3)) ? 4 : 2) | i2;
                    } else {
                        i12 = i2;
                    }
                    int i25 = i12;
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                        i14 = i13;
                        i15 = i25 | 48;
                    } else if ((i2 & 112) == 0) {
                        i14 = i13;
                        i15 = i25 | (startRestartGroup.changedInstance(function02) ? 32 : 16);
                    } else {
                        i14 = i13;
                        i15 = i25;
                    }
                    i16 = i3 & 4096;
                    if (i16 == 0) {
                        i15 |= 384;
                    } else if ((i2 & 896) == 0) {
                        function32 = function3;
                        i15 |= startRestartGroup.changedInstance(function32) ? 256 : 128;
                        if (i7 == 16) {
                            i17 = i16;
                            if ((1533916891 & i4) == 306783378 && (i15 & 731) == 146 && startRestartGroup.getSkipping()) {
                                startRestartGroup.skipToGroupEnd();
                                z5 = z;
                                function07 = function02;
                                composer2 = startRestartGroup;
                                function35 = function32;
                                modifier3 = modifier2;
                                str11 = str3;
                                num7 = num3;
                                str10 = str2;
                                list3 = list;
                                j11 = j2;
                                j10 = j3;
                                num6 = num4;
                                function08 = function03;
                                j12 = j;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit TopActionBar_NpQZenA$lambda$10;
                                            TopActionBar_NpQZenA$lambda$10 = TopActionBarKt.TopActionBar_NpQZenA$lambda$10(Modifier.this, str11, str10, num7, list3, function08, num6, z5, j12, j11, j10, function07, function35, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return TopActionBar_NpQZenA$lambda$10;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        } else {
                            i17 = i16;
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i11 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i24 != 0) {
                                str3 = "";
                            }
                            String str12 = i5 != 0 ? null : str2;
                            if (i6 != 0) {
                                num3 = null;
                            }
                            List<AvatarWrapper> emptyList = i7 != 0 ? CollectionsKt.emptyList() : list;
                            if (i8 != 0) {
                                function03 = null;
                            }
                            if ((i3 & 64) != 0) {
                                num4 = Integer.valueOf(R.drawable.intercom_ic_back);
                                i4 &= -3670017;
                            }
                            z2 = i9 != 0 ? false : z;
                            if ((i3 & 256) != 0) {
                                j4 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12164getHeader0d7_KjU();
                                i4 &= -234881025;
                            } else {
                                j4 = j;
                            }
                            if ((i3 & 512) != 0) {
                                j5 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12171getOnHeader0d7_KjU();
                                i4 = (-1879048193) & i4;
                            } else {
                                j5 = j2;
                            }
                            if ((i3 & 1024) != 0) {
                                j6 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12171getOnHeader0d7_KjU();
                                i15 &= -15;
                            } else {
                                j6 = j3;
                            }
                            i18 = i15;
                            str4 = str12;
                            i19 = i4;
                            list2 = emptyList;
                            num5 = num3;
                            j7 = j5;
                            j8 = j6;
                            function04 = i14 != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit unit;
                                    unit = Unit.INSTANCE;
                                    return unit;
                                }
                            } : function02;
                            str5 = str3;
                            if (i17 != 0) {
                                function33 = null;
                                startRestartGroup.endDefaults();
                                ProvidableCompositionLocal<Activity> localActivity = LocalActivityKt.getLocalActivity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localActivity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Activity activity = (Activity) consume;
                                window = activity == null ? activity.getWindow() : null;
                                startRestartGroup.startReplaceGroup(-1152542544);
                                if (window != null) {
                                    EffectsKt.SideEffect(new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit TopActionBar_NpQZenA$lambda$2$lambda$1;
                                            TopActionBar_NpQZenA$lambda$2$lambda$1 = TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, j7);
                                            return TopActionBar_NpQZenA$lambda$2$lambda$1;
                                        }
                                    }, startRestartGroup, 0);
                                    Unit unit = Unit.INSTANCE;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                startRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                str6 = str4;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                function05 = function03;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                boolean z6 = z2;
                                function34 = function33;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
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
                                long j14 = j4;
                                float f = 4;
                                Modifier m841paddingqDBjuR0$default = PaddingKt.m841paddingqDBjuR0$default(SizeKt.m875height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j14, null, 2, null)), Dp.m8401constructorimpl(56)), 0.0f, 0.0f, Dp.m8401constructorimpl(f), 0.0f, 11, null);
                                startRestartGroup.startReplaceGroup(369281761);
                                z3 = (i18 & 112) != 32;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                                            TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3 = TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(Function0.this);
                                            return TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier m303clickableoSLSa3U$default = ClickableKt.m303clickableoSLSa3U$default(m841paddingqDBjuR0$default, false, null, null, null, (Function0) rememberedValue, 15, null);
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor2);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                                Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                    m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                                }
                                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), startRestartGroup, 6);
                                startRestartGroup.startReplaceGroup(-1851697424);
                                if (function05 != null || num4 == null) {
                                    function06 = function05;
                                } else {
                                    IconButtonKt.IconButton(function05, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1893533585, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$TopActionBar$3$2$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num8) {
                                            invoke(composer3, num8.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i26) {
                                            if ((i26 & 11) != 2 || !composer3.getSkipping()) {
                                                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(num4.intValue(), composer3, 0), StringResources_androidKt.stringResource(io.intercom.android.sdk.R.string.intercom_navigation_back, composer3, 0), SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24)), j7, composer3, 392, 0);
                                            } else {
                                                composer3.skipToGroupEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ((i19 >> 15) & 14) | 1572864, 62);
                                    function06 = function05;
                                }
                                startRestartGroup.endReplaceGroup();
                                float m8401constructorimpl = function06 == null ? Dp.m8401constructorimpl(8) : Dp.m8401constructorimpl(16);
                                if (list2.size() != 1) {
                                    startRestartGroup.startReplaceGroup(-1567458464);
                                    SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, m8401constructorimpl), startRestartGroup, 0);
                                    AvatarIconKt.m11192AvatarIconRd90Nhg(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24)), (AvatarWrapper) CollectionsKt.first((List) list2), null, z6, 0L, null, startRestartGroup, ((i19 >> 12) & 7168) | 70, 52);
                                    z4 = z6;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    z4 = z6;
                                    if (list2.size() > 1) {
                                        startRestartGroup.startReplaceGroup(-1567156741);
                                        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, m8401constructorimpl), startRestartGroup, 0);
                                        AvatarGroupKt.m11082AvatarGroupJ8mCjc(CollectionsKt.take(list2, 3), null, Dp.m8401constructorimpl(24), 0L, startRestartGroup, 392, 10);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-1566946282);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                }
                                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), startRestartGroup, 6);
                                Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                Alignment.Horizontal start = Alignment.INSTANCE.getStart();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, startRestartGroup, 48);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
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
                                long j15 = j7;
                                Function0<Unit> function09 = function04;
                                Integer num8 = num4;
                                Modifier modifier4 = companion;
                                TextKt.m3581TextNvy7gAk(str5, null, j15, null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8262getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType03(), j15, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, ((i19 >> 3) & 14) | ((i19 >> 21) & 896), 24960, 109562);
                                str7 = str5;
                                Composer composer3 = startRestartGroup;
                                composer3.startReplaceGroup(1212142532);
                                str8 = str6;
                                if (str8 != null || str8.length() == 0) {
                                    str9 = str6;
                                    j9 = j8;
                                    i20 = 6;
                                } else {
                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer3, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                    int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion3);
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m4976constructorimpl4 = Updater.m4976constructorimpl(composer3);
                                    Updater.m4983setimpl(m4976constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4976constructorimpl4.getInserting() || !Intrinsics.areEqual(m4976constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
                                        m4976constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
                                        m4976constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    composer3.startReplaceGroup(559058220);
                                    if (num5 == null) {
                                        j13 = j8;
                                        i21 = 6;
                                    } else {
                                        num5.intValue();
                                        long j16 = j8;
                                        IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(num5.intValue(), composer3, (i19 >> 9) & 14), (String) null, (Modifier) null, j16, composer3, ((i18 << 9) & 7168) | 56, 4);
                                        j13 = j16;
                                        i21 = 6;
                                        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f)), composer3, 6);
                                        Unit unit3 = Unit.INSTANCE;
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceGroup();
                                    i20 = i21;
                                    TextKt.m3581TextNvy7gAk(str6, null, j13, null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8262getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType05(), composer3, ((i19 >> 6) & 14) | ((i18 << 6) & 896), 24960, 109562);
                                    str9 = str6;
                                    composer3 = composer3;
                                    j9 = j13;
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                }
                                composer3.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer3, i20);
                                composer3.startReplaceGroup(-1851613512);
                                if (function34 != null) {
                                    function34.invoke(rowScopeInstance, composer3, Integer.valueOf(i20 | ((i18 >> 3) & 112)));
                                    Unit unit5 = Unit.INSTANCE;
                                }
                                composer3.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.startReplaceGroup(369372238);
                                if (!StringsKt.isBlank(str7)) {
                                    IntercomDividerKt.IntercomDivider(null, composer3, 0, 1);
                                }
                                composer3.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                String str13 = str9;
                                num6 = num8;
                                str10 = str13;
                                function35 = function34;
                                j10 = j9;
                                list3 = list2;
                                modifier3 = modifier4;
                                j11 = j15;
                                str11 = str7;
                                function07 = function09;
                                j12 = j14;
                                function08 = function06;
                                z5 = z4;
                                composer2 = composer3;
                                num7 = num5;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            if ((i3 & 1024) != 0) {
                                i15 &= -15;
                            }
                            list2 = list;
                            z2 = z;
                            j4 = j;
                            j8 = j3;
                            function04 = function02;
                            i18 = i15;
                            companion = modifier2;
                            i19 = i4;
                            str5 = str3;
                            num5 = num3;
                            str4 = str2;
                            j7 = j2;
                        }
                        function33 = function3;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Activity> localActivity2 = LocalActivityKt.getLocalActivity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localActivity2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Activity activity2 = (Activity) consume2;
                        if (activity2 == null) {
                        }
                        startRestartGroup.startReplaceGroup(-1152542544);
                        if (window != null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        str6 = str4;
                        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        function05 = function03;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        boolean z62 = z2;
                        function34 = function33;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        long j142 = j4;
                        float f2 = 4;
                        Modifier m841paddingqDBjuR0$default2 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.m875height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j142, null, 2, null)), Dp.m8401constructorimpl(56)), 0.0f, 0.0f, Dp.m8401constructorimpl(f2), 0.0f, 11, null);
                        startRestartGroup.startReplaceGroup(369281761);
                        if ((i18 & 112) != 32) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z3) {
                        }
                        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                                TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3 = TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(Function0.this);
                                return TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        Modifier m303clickableoSLSa3U$default2 = ClickableKt.m303clickableoSLSa3U$default(m841paddingqDBjuR0$default2, false, null, null, null, (Function0) rememberedValue, 15, null);
                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default2);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl2.getInserting()) {
                        }
                        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                        m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22);
                        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2)), startRestartGroup, 6);
                        startRestartGroup.startReplaceGroup(-1851697424);
                        if (function05 != null) {
                        }
                        function06 = function05;
                        startRestartGroup.endReplaceGroup();
                        if (function06 == null) {
                        }
                        if (list2.size() != 1) {
                        }
                        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), startRestartGroup, 6);
                        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null);
                        Alignment.Horizontal start2 = Alignment.INSTANCE.getStart();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start2, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
                        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        long j152 = j7;
                        Function0<Unit> function092 = function04;
                        Integer num82 = num4;
                        Modifier modifier42 = companion;
                        TextKt.m3581TextNvy7gAk(str5, null, j152, null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8262getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType03(), j152, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, ((i19 >> 3) & 14) | ((i19 >> 21) & 896), 24960, 109562);
                        str7 = str5;
                        Composer composer32 = startRestartGroup;
                        composer32.startReplaceGroup(1212142532);
                        str8 = str6;
                        if (str8 != null) {
                        }
                        str9 = str6;
                        j9 = j8;
                        i20 = 6;
                        composer32.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        composer32.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer32, i20);
                        composer32.startReplaceGroup(-1851613512);
                        if (function34 != null) {
                        }
                        composer32.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        composer32.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        composer32.startReplaceGroup(369372238);
                        if (!StringsKt.isBlank(str7)) {
                        }
                        composer32.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        composer32.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        ComposerKt.sourceInformationMarkerEnd(composer32);
                        String str132 = str9;
                        num6 = num82;
                        str10 = str132;
                        function35 = function34;
                        j10 = j9;
                        list3 = list2;
                        modifier3 = modifier42;
                        j11 = j152;
                        str11 = str7;
                        function07 = function092;
                        j12 = j142;
                        function08 = function06;
                        z5 = z4;
                        composer2 = composer32;
                        num7 = num5;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    function32 = function3;
                    if (i7 == 16) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i3 & 512) != 0) {
                    }
                    if ((i3 & 1024) != 0) {
                    }
                    i18 = i15;
                    str4 = str12;
                    i19 = i4;
                    list2 = emptyList;
                    num5 = num3;
                    j7 = j5;
                    j8 = j6;
                    function04 = i14 != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit unit6;
                            unit6 = Unit.INSTANCE;
                            return unit6;
                        }
                    } : function02;
                    str5 = str3;
                    if (i17 != 0) {
                    }
                    function33 = function3;
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Activity> localActivity22 = LocalActivityKt.getLocalActivity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localActivity22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Activity activity22 = (Activity) consume22;
                    if (activity22 == null) {
                    }
                    startRestartGroup.startReplaceGroup(-1152542544);
                    if (window != null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier.Companion companion222 = Modifier.INSTANCE;
                    str6 = str4;
                    MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    function05 = function03;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
                    Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                    boolean z622 = z2;
                    function34 = function33;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
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
                    long j1422 = j4;
                    float f22 = 4;
                    Modifier m841paddingqDBjuR0$default22 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.m875height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j1422, null, 2, null)), Dp.m8401constructorimpl(56)), 0.0f, 0.0f, Dp.m8401constructorimpl(f22), 0.0f, 11, null);
                    startRestartGroup.startReplaceGroup(369281761);
                    if ((i18 & 112) != 32) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                            TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3 = TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(Function0.this);
                            return TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    Modifier m303clickableoSLSa3U$default22 = ClickableKt.m303clickableoSLSa3U$default(m841paddingqDBjuR0$default22, false, null, null, null, (Function0) rememberedValue, 15, null);
                    Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default22);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl2.getInserting()) {
                    }
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash222);
                    Updater.m4983setimpl(m4976constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f22)), startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(-1851697424);
                    if (function05 != null) {
                    }
                    function06 = function05;
                    startRestartGroup.endReplaceGroup();
                    if (function06 == null) {
                    }
                    if (list2.size() != 1) {
                    }
                    SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), startRestartGroup, 6);
                    Modifier weight$default22 = RowScope.weight$default(rowScopeInstance32, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Alignment.Horizontal start22 = Alignment.INSTANCE.getStart();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start22, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22);
                    Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
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
                    long j1522 = j7;
                    Function0<Unit> function0922 = function04;
                    Integer num822 = num4;
                    Modifier modifier422 = companion;
                    TextKt.m3581TextNvy7gAk(str5, null, j1522, null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8262getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType03(), j1522, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, ((i19 >> 3) & 14) | ((i19 >> 21) & 896), 24960, 109562);
                    str7 = str5;
                    Composer composer322 = startRestartGroup;
                    composer322.startReplaceGroup(1212142532);
                    str8 = str6;
                    if (str8 != null) {
                    }
                    str9 = str6;
                    j9 = j8;
                    i20 = 6;
                    composer322.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    composer322.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer322, i20);
                    composer322.startReplaceGroup(-1851613512);
                    if (function34 != null) {
                    }
                    composer322.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    composer322.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    composer322.startReplaceGroup(369372238);
                    if (!StringsKt.isBlank(str7)) {
                    }
                    composer322.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    composer322.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    ComposerKt.sourceInformationMarkerEnd(composer322);
                    String str1322 = str9;
                    num6 = num822;
                    str10 = str1322;
                    function35 = function34;
                    j10 = j9;
                    list3 = list2;
                    modifier3 = modifier422;
                    j11 = j1522;
                    str11 = str7;
                    function07 = function0922;
                    j12 = j1422;
                    function08 = function06;
                    z5 = z4;
                    composer2 = composer322;
                    num7 = num5;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                num3 = num;
                i7 = i3 & 16;
                if (i7 != 0) {
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                if ((i & 3670016) != 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 234881024) != 0) {
                }
                if ((i & 1879048192) != 0) {
                }
                if ((i2 & 14) != 0) {
                }
                int i252 = i12;
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                i16 = i3 & 4096;
                if (i16 == 0) {
                }
                function32 = function3;
                if (i7 == 16) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i24 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if ((i3 & 1024) != 0) {
                }
                i18 = i15;
                str4 = str12;
                i19 = i4;
                list2 = emptyList;
                num5 = num3;
                j7 = j5;
                j8 = j6;
                function04 = i14 != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit6;
                        unit6 = Unit.INSTANCE;
                        return unit6;
                    }
                } : function02;
                str5 = str3;
                if (i17 != 0) {
                }
                function33 = function3;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Activity> localActivity222 = LocalActivityKt.getLocalActivity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localActivity222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Activity activity222 = (Activity) consume222;
                if (activity222 == null) {
                }
                startRestartGroup.startReplaceGroup(-1152542544);
                if (window != null) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier.Companion companion2222 = Modifier.INSTANCE;
                str6 = str4;
                MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                function05 = function03;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222);
                Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                boolean z6222 = z2;
                function34 = function33;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                long j14222 = j4;
                float f222 = 4;
                Modifier m841paddingqDBjuR0$default222 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.m875height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j14222, null, 2, null)), Dp.m8401constructorimpl(56)), 0.0f, 0.0f, Dp.m8401constructorimpl(f222), 0.0f, 11, null);
                startRestartGroup.startReplaceGroup(369281761);
                if ((i18 & 112) != 32) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                        TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3 = TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(Function0.this);
                        return TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m303clickableoSLSa3U$default222 = ClickableKt.m303clickableoSLSa3U$default(m841paddingqDBjuR0$default222, false, null, null, null, (Function0) rememberedValue, 15, null);
                Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl2.getInserting()) {
                }
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2222);
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f222)), startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(-1851697424);
                if (function05 != null) {
                }
                function06 = function05;
                startRestartGroup.endReplaceGroup();
                if (function06 == null) {
                }
                if (list2.size() != 1) {
                }
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), startRestartGroup, 6);
                Modifier weight$default222 = RowScope.weight$default(rowScopeInstance322, Modifier.INSTANCE, 1.0f, false, 2, null);
                Alignment.Horizontal start222 = Alignment.INSTANCE.getStart();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start222, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default222);
                Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                long j15222 = j7;
                Function0<Unit> function09222 = function04;
                Integer num8222 = num4;
                Modifier modifier4222 = companion;
                TextKt.m3581TextNvy7gAk(str5, null, j15222, null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8262getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType03(), j15222, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, ((i19 >> 3) & 14) | ((i19 >> 21) & 896), 24960, 109562);
                str7 = str5;
                Composer composer3222 = startRestartGroup;
                composer3222.startReplaceGroup(1212142532);
                str8 = str6;
                if (str8 != null) {
                }
                str9 = str6;
                j9 = j8;
                i20 = 6;
                composer3222.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                composer3222.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer3222, i20);
                composer3222.startReplaceGroup(-1851613512);
                if (function34 != null) {
                }
                composer3222.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                composer3222.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                composer3222.startReplaceGroup(369372238);
                if (!StringsKt.isBlank(str7)) {
                }
                composer3222.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                composer3222.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                ComposerKt.sourceInformationMarkerEnd(composer3222);
                String str13222 = str9;
                num6 = num8222;
                str10 = str13222;
                function35 = function34;
                j10 = j9;
                list3 = list2;
                modifier3 = modifier4222;
                j11 = j15222;
                str11 = str7;
                function07 = function09222;
                j12 = j14222;
                function08 = function06;
                z5 = z4;
                composer2 = composer3222;
                num7 = num5;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            num3 = num;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            if ((i & 3670016) != 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 234881024) != 0) {
            }
            if ((i & 1879048192) != 0) {
            }
            if ((i2 & 14) != 0) {
            }
            int i2522 = i12;
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            i16 = i3 & 4096;
            if (i16 == 0) {
            }
            function32 = function3;
            if (i7 == 16) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i24 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            i18 = i15;
            str4 = str12;
            i19 = i4;
            list2 = emptyList;
            num5 = num3;
            j7 = j5;
            j8 = j6;
            function04 = i14 != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit6;
                    unit6 = Unit.INSTANCE;
                    return unit6;
                }
            } : function02;
            str5 = str3;
            if (i17 != 0) {
            }
            function33 = function3;
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Activity> localActivity2222 = LocalActivityKt.getLocalActivity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localActivity2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Activity activity2222 = (Activity) consume2222;
            if (activity2222 == null) {
            }
            startRestartGroup.startReplaceGroup(-1152542544);
            if (window != null) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion22222 = Modifier.INSTANCE;
            str6 = str4;
            MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            function05 = function03;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22222);
            Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
            boolean z62222 = z2;
            function34 = function33;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
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
            long j142222 = j4;
            float f2222 = 4;
            Modifier m841paddingqDBjuR0$default2222 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.m875height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j142222, null, 2, null)), Dp.m8401constructorimpl(56)), 0.0f, 0.0f, Dp.m8401constructorimpl(f2222), 0.0f, 11, null);
            startRestartGroup.startReplaceGroup(369281761);
            if ((i18 & 112) != 32) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                    TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3 = TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(Function0.this);
                    return TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m303clickableoSLSa3U$default2222 = ClickableKt.m303clickableoSLSa3U$default(m841paddingqDBjuR0$default2222, false, null, null, null, (Function0) rememberedValue, 15, null);
            Alignment.Vertical centerVertically3222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy3222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default2222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl2.getInserting()) {
            }
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22222);
            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3222 = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f2222)), startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(-1851697424);
            if (function05 != null) {
            }
            function06 = function05;
            startRestartGroup.endReplaceGroup();
            if (function06 == null) {
            }
            if (list2.size() != 1) {
            }
            SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), startRestartGroup, 6);
            Modifier weight$default2222 = RowScope.weight$default(rowScopeInstance3222, Modifier.INSTANCE, 1.0f, false, 2, null);
            Alignment.Horizontal start2222 = Alignment.INSTANCE.getStart();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start2222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2222);
            Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
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
            long j152222 = j7;
            Function0<Unit> function092222 = function04;
            Integer num82222 = num4;
            Modifier modifier42222 = companion;
            TextKt.m3581TextNvy7gAk(str5, null, j152222, null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8262getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType03(), j152222, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, ((i19 >> 3) & 14) | ((i19 >> 21) & 896), 24960, 109562);
            str7 = str5;
            Composer composer32222 = startRestartGroup;
            composer32222.startReplaceGroup(1212142532);
            str8 = str6;
            if (str8 != null) {
            }
            str9 = str6;
            j9 = j8;
            i20 = 6;
            composer32222.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            composer32222.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer32222, i20);
            composer32222.startReplaceGroup(-1851613512);
            if (function34 != null) {
            }
            composer32222.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            composer32222.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            composer32222.startReplaceGroup(369372238);
            if (!StringsKt.isBlank(str7)) {
            }
            composer32222.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            composer32222.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            ComposerKt.sourceInformationMarkerEnd(composer32222);
            String str132222 = str9;
            num6 = num82222;
            str10 = str132222;
            function35 = function34;
            j10 = j9;
            list3 = list2;
            modifier3 = modifier42222;
            j11 = j152222;
            str11 = str7;
            function07 = function092222;
            j12 = j142222;
            function08 = function06;
            z5 = z4;
            composer2 = composer32222;
            num7 = num5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        num3 = num;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        if ((i & 3670016) != 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 234881024) != 0) {
        }
        if ((i & 1879048192) != 0) {
        }
        if ((i2 & 14) != 0) {
        }
        int i25222 = i12;
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        i16 = i3 & 4096;
        if (i16 == 0) {
        }
        function32 = function3;
        if (i7 == 16) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i24 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        i18 = i15;
        str4 = str12;
        i19 = i4;
        list2 = emptyList;
        num5 = num3;
        j7 = j5;
        j8 = j6;
        function04 = i14 != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit6;
                unit6 = Unit.INSTANCE;
                return unit6;
            }
        } : function02;
        str5 = str3;
        if (i17 != 0) {
        }
        function33 = function3;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Activity> localActivity22222 = LocalActivityKt.getLocalActivity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localActivity22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Activity activity22222 = (Activity) consume22222;
        if (activity22222 == null) {
        }
        startRestartGroup.startReplaceGroup(-1152542544);
        if (window != null) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion222222 = Modifier.INSTANCE;
        str6 = str4;
        MeasurePolicy columnMeasurePolicy32222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        function05 = function03;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap52222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222222);
        Function0<ComposeUiNode> constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
        boolean z622222 = z2;
        function34 = function33;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, columnMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash52222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance32222 = ColumnScopeInstance.INSTANCE;
        long j1422222 = j4;
        float f22222 = 4;
        Modifier m841paddingqDBjuR0$default22222 = PaddingKt.m841paddingqDBjuR0$default(SizeKt.m875height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m262backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j1422222, null, 2, null)), Dp.m8401constructorimpl(56)), 0.0f, 0.0f, Dp.m8401constructorimpl(f22222), 0.0f, 11, null);
        startRestartGroup.startReplaceGroup(369281761);
        if ((i18 & 112) != 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
                TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3 = TopActionBarKt.TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(Function0.this);
                return TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m303clickableoSLSa3U$default22222 = ClickableKt.m303clickableoSLSa3U$default(m841paddingqDBjuR0$default22222, false, null, null, null, (Function0) rememberedValue, 15, null);
        Alignment.Vertical centerVertically32222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy32222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, m303clickableoSLSa3U$default22222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl2, rowMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl2.getInserting()) {
        }
        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
        m4976constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash222222);
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance32222 = RowScopeInstance.INSTANCE;
        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(f22222)), startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(-1851697424);
        if (function05 != null) {
        }
        function06 = function05;
        startRestartGroup.endReplaceGroup();
        if (function06 == null) {
        }
        if (list2.size() != 1) {
        }
        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), startRestartGroup, 6);
        Modifier weight$default22222 = RowScope.weight$default(rowScopeInstance32222, Modifier.INSTANCE, 1.0f, false, 2, null);
        Alignment.Horizontal start22222 = Alignment.INSTANCE.getStart();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start22222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22222);
        Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl3, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl3.getInserting()) {
        }
        m4976constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
        m4976constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash322222);
        Updater.m4983setimpl(m4976constructorimpl3, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
        long j1522222 = j7;
        Function0<Unit> function0922222 = function04;
        Integer num822222 = num4;
        Modifier modifier422222 = companion;
        TextKt.m3581TextNvy7gAk(str5, null, j1522222, null, 0L, null, null, null, 0L, null, TextAlign.m8250boximpl(TextAlign.INSTANCE.m8262getStarte0LSkKk()), 0L, TextOverflow.INSTANCE.m8309getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m7848copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType03(), j1522222, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, ((i19 >> 3) & 14) | ((i19 >> 21) & 896), 24960, 109562);
        str7 = str5;
        Composer composer322222 = startRestartGroup;
        composer322222.startReplaceGroup(1212142532);
        str8 = str6;
        if (str8 != null) {
        }
        str9 = str6;
        j9 = j8;
        i20 = 6;
        composer322222.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        composer322222.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        SpacerKt.Spacer(SizeKt.m894width3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), composer322222, i20);
        composer322222.startReplaceGroup(-1851613512);
        if (function34 != null) {
        }
        composer322222.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        composer322222.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        composer322222.startReplaceGroup(369372238);
        if (!StringsKt.isBlank(str7)) {
        }
        composer322222.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        composer322222.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        ComposerKt.sourceInformationMarkerEnd(composer322222);
        String str1322222 = str9;
        num6 = num822222;
        str10 = str1322222;
        function35 = function34;
        j10 = j9;
        list3 = list2;
        modifier3 = modifier422222;
        j11 = j1522222;
        str11 = str7;
        function07 = function0922222;
        j12 = j1422222;
        function08 = function06;
        z5 = z4;
        composer2 = composer322222;
        num7 = num5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBar_NpQZenA$lambda$2$lambda$1(Window it, long j) {
        Intrinsics.checkNotNullParameter(it, "$it");
        WindowCompat.getInsetsController(it, it.getDecorView()).setAppearanceLightStatusBars(ColorExtensionsKt.m12244isDarkColor8_81llA(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    public static final void TopActionBarAvatarPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-876643721);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m11150getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopActionBarAvatarPreview$lambda$11;
                    TopActionBarAvatarPreview$lambda$11 = TopActionBarKt.TopActionBarAvatarPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TopActionBarAvatarPreview$lambda$11;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TopActionBarGroupChatPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(86306281);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m11151getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopActionBarGroupChatPreview$lambda$12;
                    TopActionBarGroupChatPreview$lambda$12 = TopActionBarKt.TopActionBarGroupChatPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TopActionBarGroupChatPreview$lambda$12;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TopActionBarTeamReplyTimePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(500144364);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m11152getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopActionBarTeamReplyTimePreview$lambda$13;
                    TopActionBarTeamReplyTimePreview$lambda$13 = TopActionBarKt.TopActionBarTeamReplyTimePreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TopActionBarTeamReplyTimePreview$lambda$13;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TopActionBarMultipleAvatarsPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1436789380);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m11153getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopActionBarMultipleAvatarsPreview$lambda$14;
                    TopActionBarMultipleAvatarsPreview$lambda$14 = TopActionBarKt.TopActionBarMultipleAvatarsPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TopActionBarMultipleAvatarsPreview$lambda$14;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TopActionBarBackButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1611748073);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m11154getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopActionBarBackButtonPreview$lambda$15;
                    TopActionBarBackButtonPreview$lambda$15 = TopActionBarKt.TopActionBarBackButtonPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TopActionBarBackButtonPreview$lambda$15;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TopActionBarTitlePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1648201034);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m11155getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopActionBarTitlePreview$lambda$16;
                    TopActionBarTitlePreview$lambda$16 = TopActionBarKt.TopActionBarTitlePreview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TopActionBarTitlePreview$lambda$16;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TopActionBarEndContentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1992822204);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m11158getLambda9$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TopActionBarEndContentPreview$lambda$17;
                    TopActionBarEndContentPreview$lambda$17 = TopActionBarKt.TopActionBarEndContentPreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TopActionBarEndContentPreview$lambda$17;
                }
            });
        }
    }
}
