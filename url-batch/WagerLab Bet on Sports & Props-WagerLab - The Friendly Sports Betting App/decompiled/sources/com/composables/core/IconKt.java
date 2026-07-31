package com.composables.core;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.composeunstyled.UtilsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Icon.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000e\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"Icon", "", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IconKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon_ww6aTOc$lambda$1(Painter painter, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m9379Iconww6aTOc(painter, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon_ww6aTOc$lambda$3(ImageBitmap imageBitmap, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m9378Iconww6aTOc(imageBitmap, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon_ww6aTOc$lambda$5(ImageVector imageVector, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m9380Iconww6aTOc(imageVector, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004c  */
    @Deprecated(message = "Use Icon from the com.composeunstyled package", replaceWith = @ReplaceWith(expression = "com.composeunstyled.Icon(painter,contentDescription,modifier,tint)", imports = {}))
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9379Iconww6aTOc(final Painter painter, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        long j2;
        int i5;
        Modifier modifier3;
        long m5667unboximpl;
        boolean z;
        Object rememberedValue;
        final Modifier modifier4;
        final long j3;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer startRestartGroup = composer.startRestartGroup(-1652282466);
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
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    j2 = j;
                    i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j2)) ? 2048 : 1024;
                } else {
                    j2 = j;
                }
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContentColor);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier modifier5 = companion;
                            i5 = i3 & (-7169);
                            modifier3 = modifier5;
                            m5667unboximpl = ((Color) consume).m5667unboximpl();
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1652282466, i5, -1, "com.composables.core.Icon (Icon.kt:40)");
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            z = (((i5 & 7168) ^ 3072) <= 2048 && startRestartGroup.changed(m5667unboximpl)) || (i5 & 3072) == 2048;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = !Color.m5658equalsimpl0(m5667unboximpl, Color.INSTANCE.m5693getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m5698tintxETnrds$default(ColorFilter.INSTANCE, m5667unboximpl, 0, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            ImageKt.Image(painter, str, modifier3, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) rememberedValue, startRestartGroup, i5 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            j3 = m5667unboximpl;
                        } else {
                            Modifier modifier6 = companion;
                            i5 = i3;
                            modifier3 = modifier6;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                    }
                    m5667unboximpl = j2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    if (((i5 & 7168) ^ 3072) <= 2048) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = !Color.m5658equalsimpl0(m5667unboximpl, Color.INSTANCE.m5693getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m5698tintxETnrds$default(ColorFilter.INSTANCE, m5667unboximpl, 0, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    ImageKt.Image(painter, str, modifier3, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) rememberedValue, startRestartGroup, i5 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 56);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    j3 = m5667unboximpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    j3 = j2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.IconKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Icon_ww6aTOc$lambda$1;
                            Icon_ww6aTOc$lambda$1 = IconKt.Icon_ww6aTOc$lambda$1(Painter.this, str, modifier4, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Icon_ww6aTOc$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004c  */
    @Deprecated(message = "Use Icon from the com.composeunstyled package", replaceWith = @ReplaceWith(expression = "com.composeunstyled.Icon(imageBitmap,contentDescription,modifier,tint)", imports = {}))
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9378Iconww6aTOc(final ImageBitmap imageBitmap, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        long j2;
        int i5;
        Modifier modifier3;
        long m5667unboximpl;
        boolean z;
        Object rememberedValue;
        final Modifier modifier4;
        final long j3;
        Intrinsics.checkNotNullParameter(imageBitmap, "imageBitmap");
        Composer startRestartGroup = composer.startRestartGroup(145516063);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(imageBitmap) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    j2 = j;
                    i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j2)) ? 2048 : 1024;
                } else {
                    j2 = j;
                }
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContentColor);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier modifier5 = companion;
                            i5 = i3 & (-7169);
                            modifier3 = modifier5;
                            m5667unboximpl = ((Color) consume).m5667unboximpl();
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(145516063, i5, -1, "com.composables.core.Icon (Icon.kt:74)");
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            z = (((i5 & 7168) ^ 3072) <= 2048 && startRestartGroup.changed(m5667unboximpl)) || (i5 & 3072) == 2048;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = !Color.m5658equalsimpl0(m5667unboximpl, Color.INSTANCE.m5693getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m5698tintxETnrds$default(ColorFilter.INSTANCE, m5667unboximpl, 0, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            ImageKt.m328Image5hnEew(imageBitmap, str, modifier3, null, null, 0.0f, (ColorFilter) rememberedValue, 0, startRestartGroup, i5 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 184);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            j3 = m5667unboximpl;
                        } else {
                            Modifier modifier6 = companion;
                            i5 = i3;
                            modifier3 = modifier6;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                    }
                    m5667unboximpl = j2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    if (((i5 & 7168) ^ 3072) <= 2048) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = !Color.m5658equalsimpl0(m5667unboximpl, Color.INSTANCE.m5693getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m5698tintxETnrds$default(ColorFilter.INSTANCE, m5667unboximpl, 0, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    ImageKt.m328Image5hnEew(imageBitmap, str, modifier3, null, null, 0.0f, (ColorFilter) rememberedValue, 0, startRestartGroup, i5 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 184);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    j3 = m5667unboximpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    j3 = j2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.IconKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Icon_ww6aTOc$lambda$3;
                            Icon_ww6aTOc$lambda$3 = IconKt.Icon_ww6aTOc$lambda$3(ImageBitmap.this, str, modifier4, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Icon_ww6aTOc$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004c  */
    @Deprecated(message = "Use Icon from the com.composeunstyled package", replaceWith = @ReplaceWith(expression = "com.composeunstyled.Icon(imageVector,contentDescription,modifier,tint)", imports = {}))
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9380Iconww6aTOc(final ImageVector imageVector, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        long j2;
        int i5;
        Modifier modifier3;
        long m5667unboximpl;
        boolean z;
        Object rememberedValue;
        final Modifier modifier4;
        final long j3;
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        Composer startRestartGroup = composer.startRestartGroup(-31450997);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    j2 = j;
                    i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j2)) ? 2048 : 1024;
                } else {
                    j2 = j;
                }
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localContentColor);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier modifier5 = companion;
                            i5 = i3 & (-7169);
                            modifier3 = modifier5;
                            m5667unboximpl = ((Color) consume).m5667unboximpl();
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-31450997, i5, -1, "com.composables.core.Icon (Icon.kt:108)");
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            z = (((i5 & 7168) ^ 3072) <= 2048 && startRestartGroup.changed(m5667unboximpl)) || (i5 & 3072) == 2048;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = !Color.m5658equalsimpl0(m5667unboximpl, Color.INSTANCE.m5693getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m5698tintxETnrds$default(ColorFilter.INSTANCE, m5667unboximpl, 0, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            ImageKt.Image(imageVector, str, modifier3, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) rememberedValue, startRestartGroup, i5 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            j3 = m5667unboximpl;
                        } else {
                            Modifier modifier6 = companion;
                            i5 = i3;
                            modifier3 = modifier6;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                    }
                    m5667unboximpl = j2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    if (((i5 & 7168) ^ 3072) <= 2048) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = !Color.m5658equalsimpl0(m5667unboximpl, Color.INSTANCE.m5693getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m5698tintxETnrds$default(ColorFilter.INSTANCE, m5667unboximpl, 0, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    ImageKt.Image(imageVector, str, modifier3, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) rememberedValue, startRestartGroup, i5 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, 56);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    j3 = m5667unboximpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    j3 = j2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.IconKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Icon_ww6aTOc$lambda$5;
                            Icon_ww6aTOc$lambda$5 = IconKt.Icon_ww6aTOc$lambda$5(ImageVector.this, str, modifier4, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Icon_ww6aTOc$lambda$5;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
    }
}
