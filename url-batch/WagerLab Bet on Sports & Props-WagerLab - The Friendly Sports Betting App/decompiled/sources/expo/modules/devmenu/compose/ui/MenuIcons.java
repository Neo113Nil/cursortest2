package expo.modules.devmenu.compose.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.composeunstyled.IconKt;
import com.google.common.net.HttpHeaders;
import expo.modules.devmenu.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MenuIcons.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\rJ)\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\rJ)\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\rJ)\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\rJ)\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\rJ)\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\rJ)\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001b\u0010\rJ)\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001d\u0010\rJ)\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lexpo/modules/devmenu/compose/ui/MenuIcons;", "", "<init>", "()V", "Close", "", "size", "Landroidx/compose/ui/unit/Dp;", "tint", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "Close-8s8adOk", "(FJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Copy", "Copy-8s8adOk", "Reload", "Reload-8s8adOk", "Home", "Home-8s8adOk", "Performance", "Performance-8s8adOk", "Inspect", "Inspect-8s8adOk", "Bug", "Bug-8s8adOk", HttpHeaders.REFRESH, "Refresh-8s8adOk", "Fab", "Fab-8s8adOk", HttpHeaders.WARNING, "Warning-8s8adOk", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MenuIcons {
    public static final int $stable = 0;
    public static final MenuIcons INSTANCE = new MenuIcons();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Bug_8s8adOk$lambda$6(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10866Bug8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Close_8s8adOk$lambda$0(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10867Close8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Copy_8s8adOk$lambda$1(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10868Copy8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Fab_8s8adOk$lambda$8(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10869Fab8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Home_8s8adOk$lambda$3(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10870Home8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Inspect_8s8adOk$lambda$5(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10871Inspect8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Performance_8s8adOk$lambda$4(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10872Performance8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Refresh_8s8adOk$lambda$7(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10873Refresh8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Reload_8s8adOk$lambda$2(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10874Reload8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Warning_8s8adOk$lambda$9(MenuIcons menuIcons, float f, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        menuIcons.m10875Warning8s8adOk(f, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private MenuIcons() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Close-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10867Close8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-372528643);
        ComposerKt.sourceInformation(startRestartGroup, "C(Close)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)19@497L35,18@475L189:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-372528643, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Close (MenuIcons.kt:17)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.x_close, startRestartGroup, 0), "Close", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Close_8s8adOk$lambda$0;
                        Close_8s8adOk$lambda$0 = MenuIcons.Close_8s8adOk$lambda$0(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Close_8s8adOk$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.x_close, startRestartGroup, 0), "Close", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Copy-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10868Copy8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1249216124);
        ComposerKt.sourceInformation(startRestartGroup, "C(Copy)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)35@793L32,34@771L185:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249216124, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Copy (MenuIcons.kt:33)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.copy, startRestartGroup, 0), "Copy", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Copy_8s8adOk$lambda$1;
                        Copy_8s8adOk$lambda$1 = MenuIcons.Copy_8s8adOk$lambda$1(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Copy_8s8adOk$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.copy, startRestartGroup, 0), "Copy", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Reload-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10874Reload8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2006297952);
        ComposerKt.sourceInformation(startRestartGroup, "C(Reload)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)51@1087L35,50@1065L190:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2006297952, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Reload (MenuIcons.kt:49)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.refresh, startRestartGroup, 0), "Reload", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Reload_8s8adOk$lambda$2;
                        Reload_8s8adOk$lambda$2 = MenuIcons.Reload_8s8adOk$lambda$2(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Reload_8s8adOk$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.refresh, startRestartGroup, 0), "Reload", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Home-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10870Home8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-263736230);
        ComposerKt.sourceInformation(startRestartGroup, "C(Home)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)67@1384L32,66@1362L185:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263736230, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Home (MenuIcons.kt:65)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.home, startRestartGroup, 0), "Home", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Home_8s8adOk$lambda$3;
                        Home_8s8adOk$lambda$3 = MenuIcons.Home_8s8adOk$lambda$3(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Home_8s8adOk$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.home, startRestartGroup, 0), "Home", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Performance-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10872Performance8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1679386693);
        ComposerKt.sourceInformation(startRestartGroup, "C(Performance)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)83@1683L39,82@1661L207:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1679386693, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Performance (MenuIcons.kt:81)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.performance, startRestartGroup, 0), "Performance monitor", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Performance_8s8adOk$lambda$4;
                        Performance_8s8adOk$lambda$4 = MenuIcons.Performance_8s8adOk$lambda$4(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Performance_8s8adOk$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.performance, startRestartGroup, 0), "Performance monitor", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Inspect-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10871Inspect8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1978451999);
        ComposerKt.sourceInformation(startRestartGroup, "C(Inspect)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)99@2000L35,98@1978L201:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1978451999, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Inspect (MenuIcons.kt:97)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.inspect, startRestartGroup, 0), "Element inspector", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Inspect_8s8adOk$lambda$5;
                        Inspect_8s8adOk$lambda$5 = MenuIcons.Inspect_8s8adOk$lambda$5(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Inspect_8s8adOk$lambda$5;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.inspect, startRestartGroup, 0), "Element inspector", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Bug-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10866Bug8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1915879041);
        ComposerKt.sourceInformation(startRestartGroup, "C(Bug)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)115@2307L31,114@2285L191:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1915879041, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Bug (MenuIcons.kt:113)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.bug, startRestartGroup, 0), "JS debugger", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Bug_8s8adOk$lambda$6;
                        Bug_8s8adOk$lambda$6 = MenuIcons.Bug_8s8adOk$lambda$6(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Bug_8s8adOk$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.bug, startRestartGroup, 0), "JS debugger", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Refresh-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10873Refresh8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-68999046);
        ComposerKt.sourceInformation(startRestartGroup, "C(Refresh)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)131@2608L40,130@2586L201:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-68999046, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Refresh (MenuIcons.kt:129)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.fast_refresh, startRestartGroup, 0), "Fast Refresh", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Refresh_8s8adOk$lambda$7;
                        Refresh_8s8adOk$lambda$7 = MenuIcons.Refresh_8s8adOk$lambda$7(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Refresh_8s8adOk$lambda$7;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.fast_refresh, startRestartGroup, 0), "Fast Refresh", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Fab-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10869Fab8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1074063666);
        ComposerKt.sourceInformation(startRestartGroup, "C(Fab)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)147@2915L45,146@2893L209:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1074063666, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Fab (MenuIcons.kt:145)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.dev_menu_fab_icon, startRestartGroup, 0), "Toggle Dev Menu", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Fab_8s8adOk$lambda$8;
                        Fab_8s8adOk$lambda$8 = MenuIcons.Fab_8s8adOk$lambda$8(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Fab_8s8adOk$lambda$8;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.dev_menu_fab_icon, startRestartGroup, 0), "Toggle Dev Menu", SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* renamed from: Warning-8s8adOk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10875Warning8s8adOk(final float f, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1677953191);
        ComposerKt.sourceInformation(startRestartGroup, "C(Warning)P(1:c#ui.unit.Dp,2:c#ui.graphics.Color)163@3234L33,162@3212L189:MenuIcons.kt#aaq0h9");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1677953191, i3, -1, "expo.modules.devmenu.compose.ui.MenuIcons.Warning (MenuIcons.kt:161)");
                }
                IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.alert, startRestartGroup, 0), HttpHeaders.WARNING, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.ui.MenuIcons$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Warning_8s8adOk$lambda$9;
                        Warning_8s8adOk$lambda$9 = MenuIcons.Warning_8s8adOk$lambda$9(MenuIcons.this, f, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Warning_8s8adOk$lambda$9;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        IconKt.m9519Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.alert, startRestartGroup, 0), HttpHeaders.WARNING, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f).then(companion), j2, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
