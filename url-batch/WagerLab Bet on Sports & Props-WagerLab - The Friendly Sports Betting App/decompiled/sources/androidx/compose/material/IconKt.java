package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: Icon.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000e\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0013\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Icon", "", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "DefaultIconSizeModifier", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon_ww6aTOc$lambda$4(Painter painter, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m2046Iconww6aTOc(painter, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m2047Iconww6aTOc(ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        ComposerKt.sourceInformationMarkerStart(composer, -800853103, "C(Icon)N(imageVector,contentDescription,modifier,tint:c#ui.graphics.Color)65@3157L7,65@3196L7,68@3238L34,67@3214L164:Icon.kt#jmzs0o");
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 8) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m5667unboximpl = ((Color) consume).m5667unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            j2 = Color.m5656copywmQWz5c$default(m5667unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j2 = j;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800853103, i, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        m2046Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composer, i & 14), str, companion, j2, composer, VectorPainter.$stable | (i & 112) | (i & 896) | (i & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m2045Iconww6aTOc(ImageBitmap imageBitmap, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        ComposerKt.sourceInformationMarkerStart(composer, -554892675, "C(Icon)N(bitmap,contentDescription,modifier,tint:c#ui.graphics.Color)99@4818L7,99@4857L7,101@4889L42,102@4936L137:Icon.kt#jmzs0o");
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 8) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m5667unboximpl = ((Color) consume).m5667unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            j2 = Color.m5656copywmQWz5c$default(m5667unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j2 = j;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554892675, i, -1, "androidx.compose.material.Icon (Icon.kt:100)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -675907993, "CC(remember):Icon.kt#9igjgp");
        boolean changed = composer.changed(imageBitmap);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
            composer.updateRememberedValue(bitmapPainter);
            rememberedValue = bitmapPainter;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        m2046Iconww6aTOc((BitmapPainter) rememberedValue, str, companion, j2, composer, i & 8176, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0077  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2046Iconww6aTOc(final Painter painter, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        long j4;
        Modifier modifier4;
        long j5;
        Object m5698tintxETnrds$default;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-1142959010);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)N(painter,contentDescription,modifier,tint:c#ui.graphics.Color)136@6567L82,146@6911L217:Icon.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "133@6484L7,133@6523L7");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    long j6 = j2;
                    modifier4 = modifier2;
                    j4 = j6;
                } else {
                    Modifier.Companion companion2 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContentColor);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        long m5667unboximpl = ((Color) consume).m5667unboximpl();
                        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localContentAlpha);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        j4 = Color.m5656copywmQWz5c$default(m5667unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i3 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    modifier4 = companion2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1142959010, i3, -1, "androidx.compose.material.Icon (Icon.kt:134)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1128026640, "CC(remember):Icon.kt#9igjgp");
                boolean z = (((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j4)) || (i3 & 3072) == 2048;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (Color.m5658equalsimpl0(j4, Color.INSTANCE.m5693getUnspecified0d7_KjU())) {
                        j5 = j4;
                        m5698tintxETnrds$default = null;
                    } else {
                        j5 = j4;
                        m5698tintxETnrds$default = ColorFilter.Companion.m5698tintxETnrds$default(ColorFilter.INSTANCE, j5, 0, 2, null);
                    }
                    startRestartGroup.updateRememberedValue(m5698tintxETnrds$default);
                } else {
                    j5 = j4;
                    m5698tintxETnrds$default = rememberedValue;
                }
                ColorFilter colorFilter = (ColorFilter) m5698tintxETnrds$default;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (str != null) {
                    startRestartGroup.startReplaceGroup(609231686);
                    ComposerKt.sourceInformation(startRestartGroup, "139@6743L115");
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1128032305, "CC(remember):Icon.kt#9igjgp");
                    boolean z2 = (i3 & 112) == 32;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material.IconKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit Icon_ww6aTOc$lambda$3$lambda$2;
                                Icon_ww6aTOc$lambda$3$lambda$2 = IconKt.Icon_ww6aTOc$lambda$3$lambda$2(str, (SemanticsPropertyReceiver) obj);
                                return Icon_ww6aTOc$lambda$3$lambda$2;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    companion = SemanticsModifierKt.semantics$default(companion3, false, (Function1) rememberedValue2, 1, null);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(609390468);
                    startRestartGroup.endReplaceGroup();
                    companion = Modifier.INSTANCE;
                }
                BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier4), painter), painter, false, null, ContentScale.INSTANCE.getFit(), 0.0f, colorFilter, 22, null).then(companion), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j3 = j5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.IconKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Icon_ww6aTOc$lambda$4;
                        Icon_ww6aTOc$lambda$4 = IconKt.Icon_ww6aTOc$lambda$4(Painter.this, str, modifier3, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Icon_ww6aTOc$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon_ww6aTOc$lambda$3$lambda$2(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.m7601setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7586getImageo7Vup1c());
        return Unit.INSTANCE;
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier.Companion companion;
        if (Size.m5478equalsimpl0(painter.getIntrinsicSize(), Size.INSTANCE.m5490getUnspecifiedNHjbRc()) || m2048isInfiniteuvyYCjk(painter.getIntrinsicSize())) {
            companion = DefaultIconSizeModifier;
        } else {
            companion = Modifier.INSTANCE;
        }
        return modifier.then(companion);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m2048isInfiniteuvyYCjk(long j) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
