package expo.modules.devmenu.compose.primitives;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.graphics.drawable.DrawableKt;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import expo.modules.devmenu.compose.utils.IsRunningInPreviewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppIcon.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"AppIcon", "", "size", "Landroidx/compose/ui/unit/Dp;", "AppIcon-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppIconKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppIcon_kHDZbjc$lambda$0(float f, int i, int i2, Composer composer, int i3) {
        m10816AppIconkHDZbjc(f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: AppIcon-kHDZbjc, reason: not valid java name */
    public static final void m10816AppIconkHDZbjc(final float f, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-313625831);
        ComposerKt.sourceInformation(startRestartGroup, "C(AppIcon)P(0:c#ui.unit.Dp)28@1080L7,29@1117L7,32@1175L12,33@1195L1329,31@1128L1396:AppIcon.kt#k98qbf");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                f = Dp.m8401constructorimpl(44);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-313625831, i3, -1, "expo.modules.devmenu.compose.primitives.AppIcon (AppIcon.kt:27)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density = (Density) consume2;
            SurfaceKt.m10819RoundedSurfaceOu1YvPQ(null, NewAppTheme.INSTANCE.getBorderRadius(startRestartGroup, 6).m10771getXlD9Ej5fM(), 0L, null, ComposableLambdaKt.rememberComposableLambda(-1143678230, true, new Function2<Composer, Integer, Unit>() { // from class: expo.modules.devmenu.compose.primitives.AppIconKt$AppIcon$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C37@1284L6,34@1201L1319:AppIcon.kt#k98qbf");
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1143678230, i5, -1, "expo.modules.devmenu.compose.primitives.AppIcon.<anonymous> (AppIcon.kt:34)");
                    }
                    Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, f), NewAppTheme.INSTANCE.getColors(composer2, 6).getBackground().getElement(), null, 2, null);
                    Density density2 = density;
                    Context context2 = context;
                    float f2 = f;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m262backgroundbw27NRU$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-1377741426);
                    ComposerKt.sourceInformation(composer2, "C43@1397L986,74@2391L123:AppIcon.kt#k98qbf");
                    if (IsRunningInPreviewKt.getIsRunningInPreview()) {
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1849434622);
                        ComposerKt.sourceInformation(composer2, "CC(remember):AppIcon.kt#9igjgp");
                        Object rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            int mo424toPx0680j_4 = (int) density2.mo424toPx0680j_4(f2);
                            Drawable applicationIcon = context2.getPackageManager().getApplicationIcon(context2.getApplicationInfo());
                            Intrinsics.checkNotNullExpressionValue(applicationIcon, "getApplicationIcon(...)");
                            if (Build.VERSION.SDK_INT >= 26 && (applicationIcon instanceof AdaptiveIconDrawable)) {
                                AdaptiveIconDrawable adaptiveIconDrawable = (AdaptiveIconDrawable) applicationIcon;
                                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{adaptiveIconDrawable.getBackground(), adaptiveIconDrawable.getForeground()});
                                int mo424toPx0680j_42 = (int) density2.mo424toPx0680j_4(f2);
                                rememberedValue = AndroidImageBitmap_androidKt.asImageBitmap(DrawableKt.toBitmap$default(layerDrawable, mo424toPx0680j_42, mo424toPx0680j_42, null, 4, null));
                            } else if (applicationIcon instanceof BitmapDrawable) {
                                Bitmap bitmap = ((BitmapDrawable) applicationIcon).getBitmap();
                                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
                                rememberedValue = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
                            } else {
                                rememberedValue = AndroidImageBitmap_androidKt.asImageBitmap(DrawableKt.toBitmap$default(applicationIcon, mo424toPx0680j_4, mo424toPx0680j_4, null, 4, null));
                            }
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        composer2.endReplaceGroup();
                        ImageKt.m328Image5hnEew((ImageBitmap) rememberedValue, "App Icon", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0.0f, null, 0, composer2, 432, 248);
                        composer2.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 24576, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.primitives.AppIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppIcon_kHDZbjc$lambda$0;
                    AppIcon_kHDZbjc$lambda$0 = AppIconKt.AppIcon_kHDZbjc$lambda$0(f, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AppIcon_kHDZbjc$lambda$0;
                }
            });
        }
    }
}
