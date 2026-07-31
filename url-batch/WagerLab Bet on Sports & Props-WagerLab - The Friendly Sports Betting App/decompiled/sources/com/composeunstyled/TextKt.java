package com.composeunstyled;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.common.C;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u009d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u009d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aU\u0010 \u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0001¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Text", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", ViewProps.LINE_HEIGHT, "Landroidx/compose/ui/unit/TextUnit;", "fontSize", ViewProps.LETTER_SPACING, "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "color", "Landroidx/compose/ui/graphics/Color;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "singleLine", "", "minLines", "", "maxLines", ViewProps.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "Text-4CEPv18", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;IJJJLandroidx/compose/ui/text/font/FontWeight;JLandroidx/compose/ui/text/font/FontFamily;ZIIILandroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "Text-curKjrk", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;IJJLandroidx/compose/ui/text/font/FontWeight;JJLandroidx/compose/ui/text/font/FontFamily;ZIIILandroidx/compose/runtime/Composer;III)V", "mergeThemed", "mergeThemed-UwpzLow", "(Landroidx/compose/ui/text/TextStyle;IJJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_4CEPv18$lambda$0(String str, Modifier modifier, TextStyle textStyle, int i, long j, long j2, long j3, FontWeight fontWeight, long j4, FontFamily fontFamily, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        m9556Text4CEPv18(str, modifier, textStyle, i, j, j2, j3, fontWeight, j4, fontFamily, z, i2, i3, i4, composer, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text_curKjrk$lambda$1(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, int i, long j, long j2, FontWeight fontWeight, long j3, long j4, FontFamily fontFamily, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        m9557TextcurKjrk(annotatedString, modifier, textStyle, i, j, j2, fontWeight, j3, j4, fontFamily, z, i2, i3, i4, composer, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fa  */
    /* renamed from: Text-4CEPv18, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9556Text4CEPv18(final String text, Modifier modifier, TextStyle textStyle, int i, long j, long j2, long j3, FontWeight fontWeight, long j4, FontFamily fontFamily, boolean z, int i2, int i3, int i4, Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        Modifier modifier2;
        TextStyle textStyle2;
        int i9;
        int i10;
        long j5;
        int i11;
        long j6;
        long j7;
        FontWeight fontWeight2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j8;
        FontWeight fontWeight3;
        long m5693getUnspecified0d7_KjU;
        FontFamily fontFamily2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z2;
        FontWeight fontWeight4;
        Composer composer2;
        final long j9;
        final TextStyle textStyle3;
        final int i26;
        final int i27;
        final int i28;
        final FontWeight fontWeight5;
        final Modifier modifier3;
        final long j10;
        final boolean z3;
        final FontFamily fontFamily3;
        final int i29;
        final long j11;
        final long j12;
        ScopeUpdateScope endRestartGroup;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(389445098);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (startRestartGroup.changed(text) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i36 = i7 & 2;
        if (i36 != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            modifier2 = modifier;
            i8 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i5 & 384) != 0) {
                if ((i7 & 4) == 0) {
                    textStyle2 = textStyle;
                    if (startRestartGroup.changed(textStyle2)) {
                        i35 = 256;
                        i8 |= i35;
                    }
                } else {
                    textStyle2 = textStyle;
                }
                i35 = 128;
                i8 |= i35;
            } else {
                textStyle2 = textStyle;
            }
            if ((i5 & 3072) != 0) {
                if ((i7 & 8) == 0) {
                    i9 = i;
                    if (startRestartGroup.changed(i9)) {
                        i34 = 2048;
                        i8 |= i34;
                    }
                } else {
                    i9 = i;
                }
                i34 = 1024;
                i8 |= i34;
            } else {
                i9 = i;
            }
            i10 = i7 & 16;
            if (i10 == 0) {
                i8 |= 24576;
                j5 = j;
            } else {
                j5 = j;
                if ((i5 & 24576) == 0) {
                    i8 |= startRestartGroup.changed(j5) ? 16384 : 8192;
                }
            }
            if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                if ((i7 & 32) == 0) {
                    i11 = i36;
                    j6 = j2;
                    if (startRestartGroup.changed(j6)) {
                        i33 = 131072;
                        i8 |= i33;
                    }
                } else {
                    i11 = i36;
                    j6 = j2;
                }
                i33 = 65536;
                i8 |= i33;
            } else {
                i11 = i36;
                j6 = j2;
            }
            if ((i5 & 1572864) != 0) {
                j7 = j3;
                i8 |= ((i7 & 64) == 0 && startRestartGroup.changed(j7)) ? 1048576 : 524288;
            } else {
                j7 = j3;
            }
            if ((i5 & 12582912) != 0) {
                if ((i7 & 128) == 0) {
                    fontWeight2 = fontWeight;
                    if (startRestartGroup.changed(fontWeight2)) {
                        i32 = 8388608;
                        i8 |= i32;
                    }
                } else {
                    fontWeight2 = fontWeight;
                }
                i32 = 4194304;
                i8 |= i32;
            } else {
                fontWeight2 = fontWeight;
            }
            i12 = i7 & 256;
            if (i12 == 0) {
                i8 |= 100663296;
            } else if ((i5 & 100663296) == 0) {
                i13 = i12;
                i8 |= startRestartGroup.changed(j4) ? 67108864 : 33554432;
                if ((i5 & 805306368) == 0) {
                    if ((i7 & 512) == 0 && startRestartGroup.changed(fontFamily)) {
                        i31 = C.BUFFER_FLAG_LAST_SAMPLE;
                        i8 |= i31;
                    }
                    i31 = 268435456;
                    i8 |= i31;
                }
                i14 = i7 & 1024;
                if (i14 != 0) {
                    i15 = i6 | 6;
                } else if ((i6 & 6) == 0) {
                    i15 = i6 | (startRestartGroup.changed(z) ? 4 : 2);
                } else {
                    i15 = i6;
                }
                i16 = i7 & 2048;
                if (i16 != 0) {
                    i15 |= 48;
                } else if ((i6 & 48) == 0) {
                    i17 = i16;
                    i15 |= startRestartGroup.changed(i2) ? 32 : 16;
                    if ((i6 & 384) == 0) {
                        if ((i7 & 4096) == 0 && startRestartGroup.changed(i3)) {
                            i30 = 256;
                            i15 |= i30;
                        }
                        i30 = 128;
                        i15 |= i30;
                    }
                    int i37 = i15;
                    i18 = i7 & 8192;
                    if (i18 == 0) {
                        i19 = i37 | 3072;
                    } else if ((i6 & 3072) == 0) {
                        i19 = i37 | (startRestartGroup.changed(i4) ? 2048 : 1024);
                    } else {
                        i19 = i37;
                    }
                    if ((i8 & 306783379) == 306783378 || (i19 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i5 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i7 & 4) != 0) {
                                ProvidableCompositionLocal<TextStyle> localTextStyle = UtilsKt.getLocalTextStyle();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localTextStyle);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                i8 &= -897;
                                textStyle2 = (TextStyle) consume;
                            }
                            if ((i7 & 8) == 0) {
                                i20 = TextAlign.INSTANCE.m8263getUnspecifiede0LSkKk();
                                i8 &= -7169;
                            } else {
                                i20 = i9;
                            }
                            if (i10 != 0) {
                                j5 = TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE();
                            }
                            if ((i7 & 32) == 0) {
                                j8 = textStyle2.m7866getFontSizeXSAIIZE();
                                i8 &= -458753;
                            } else {
                                j8 = j6;
                            }
                            if ((i7 & 64) != 0) {
                                j7 = textStyle2.m7871getLetterSpacingXSAIIZE();
                                i8 &= -3670017;
                            }
                            if ((i7 & 128) == 0) {
                                fontWeight3 = textStyle2.getFontWeight();
                                i8 &= -29360129;
                            } else {
                                fontWeight3 = fontWeight2;
                            }
                            m5693getUnspecified0d7_KjU = i13 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j4;
                            if ((i7 & 512) == 0) {
                                fontFamily2 = textStyle2.getFontFamily();
                                i8 &= -1879048193;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            boolean z4 = i14 == 0 ? false : z;
                            i21 = i17 == 0 ? 1 : i2;
                            int i38 = i20;
                            if ((i7 & 4096) == 0) {
                                i22 = z4 ? 1 : Integer.MAX_VALUE;
                                i19 &= -897;
                            } else {
                                i22 = i3;
                            }
                            if (i18 == 0) {
                                i25 = TextOverflow.INSTANCE.m8308getClipgIe3tQ8();
                                int i39 = i8;
                                i23 = i19;
                                i24 = i39;
                            } else {
                                int i40 = i8;
                                i23 = i19;
                                i24 = i40;
                                i25 = i4;
                            }
                            z2 = z4;
                            j6 = j8;
                            i9 = i38;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i7 & 4) != 0) {
                                i8 &= -897;
                            }
                            if ((i7 & 8) != 0) {
                                i8 &= -7169;
                            }
                            if ((i7 & 32) != 0) {
                                i8 &= -458753;
                            }
                            if ((i7 & 64) != 0) {
                                i8 &= -3670017;
                            }
                            if ((i7 & 128) != 0) {
                                i8 &= -29360129;
                            }
                            if ((i7 & 512) != 0) {
                                i8 &= -1879048193;
                            }
                            if ((i7 & 4096) != 0) {
                                i19 &= -897;
                            }
                            int i41 = i8;
                            i23 = i19;
                            i24 = i41;
                            m5693getUnspecified0d7_KjU = j4;
                            i21 = i2;
                            i22 = i3;
                            i25 = i4;
                            fontWeight3 = fontWeight2;
                            fontFamily2 = fontFamily;
                            z2 = z;
                        }
                        startRestartGroup.endDefaults();
                        int i42 = i25;
                        if (ComposerKt.isTraceInProgress()) {
                            fontWeight4 = fontWeight3;
                        } else {
                            fontWeight4 = fontWeight3;
                            ComposerKt.traceEventStart(389445098, i24, i23, "com.composeunstyled.Text (Text.kt:59)");
                        }
                        int i43 = i24 >> 9;
                        int i44 = i24;
                        TextStyle m9558mergeThemedUwpzLow = m9558mergeThemedUwpzLow(textStyle2, i9, j6, m5693getUnspecified0d7_KjU, fontWeight4, fontFamily2, j5, j7, startRestartGroup, (i43 & 896) | ((i24 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | ((i44 >> 15) & 7168) | (57344 & i43) | ((i44 >> 12) & 458752) | (3670016 & (i44 << 6)) | ((i44 << 3) & 29360128), 0);
                        FontWeight fontWeight6 = fontWeight4;
                        composer2 = startRestartGroup;
                        BasicTextKt.m1237BasicTextRWo7tUw(text, modifier2, m9558mergeThemedUwpzLow, (Function1<? super TextLayoutResult, Unit>) null, i42, false, i22, i21, (ColorProducer) null, (TextAutoSize) null, composer2, (i44 & WebSocketProtocol.PAYLOAD_SHORT) | ((i23 << 3) & 57344) | ((i23 << 12) & 3670016) | ((i23 << 18) & 29360128), 808);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j9 = j5;
                        textStyle3 = textStyle2;
                        i26 = i22;
                        i27 = i21;
                        i28 = i42;
                        fontWeight5 = fontWeight6;
                        modifier3 = modifier2;
                        j10 = m5693getUnspecified0d7_KjU;
                        long j13 = j7;
                        z3 = z2;
                        fontFamily3 = fontFamily2;
                        i29 = i9;
                        j11 = j6;
                        j12 = j13;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        i27 = i2;
                        i26 = i3;
                        i28 = i4;
                        composer2 = startRestartGroup;
                        j9 = j5;
                        modifier3 = modifier2;
                        textStyle3 = textStyle2;
                        j10 = j4;
                        fontWeight5 = fontWeight2;
                        i29 = i9;
                        j11 = j6;
                        j12 = j7;
                        fontFamily3 = fontFamily;
                        z3 = z;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.TextKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Text_4CEPv18$lambda$0;
                                Text_4CEPv18$lambda$0 = TextKt.Text_4CEPv18$lambda$0(text, modifier3, textStyle3, i29, j9, j11, j12, fontWeight5, j10, fontFamily3, z3, i27, i26, i28, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                                return Text_4CEPv18$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                i17 = i16;
                if ((i6 & 384) == 0) {
                }
                int i372 = i15;
                i18 = i7 & 8192;
                if (i18 == 0) {
                }
                if ((i8 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i5 & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if ((i7 & 4) != 0) {
                }
                if ((i7 & 8) == 0) {
                }
                if (i10 != 0) {
                }
                if ((i7 & 32) == 0) {
                }
                if ((i7 & 64) != 0) {
                }
                if ((i7 & 128) == 0) {
                }
                if (i13 == 0) {
                }
                if ((i7 & 512) == 0) {
                }
                if (i14 == 0) {
                }
                if (i17 == 0) {
                }
                int i382 = i20;
                if ((i7 & 4096) == 0) {
                }
                if (i18 == 0) {
                }
                z2 = z4;
                j6 = j8;
                i9 = i382;
                startRestartGroup.endDefaults();
                int i422 = i25;
                if (ComposerKt.isTraceInProgress()) {
                }
                int i432 = i24 >> 9;
                int i442 = i24;
                TextStyle m9558mergeThemedUwpzLow2 = m9558mergeThemedUwpzLow(textStyle2, i9, j6, m5693getUnspecified0d7_KjU, fontWeight4, fontFamily2, j5, j7, startRestartGroup, (i432 & 896) | ((i24 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | ((i442 >> 15) & 7168) | (57344 & i432) | ((i442 >> 12) & 458752) | (3670016 & (i442 << 6)) | ((i442 << 3) & 29360128), 0);
                FontWeight fontWeight62 = fontWeight4;
                composer2 = startRestartGroup;
                BasicTextKt.m1237BasicTextRWo7tUw(text, modifier2, m9558mergeThemedUwpzLow2, (Function1<? super TextLayoutResult, Unit>) null, i422, false, i22, i21, (ColorProducer) null, (TextAutoSize) null, composer2, (i442 & WebSocketProtocol.PAYLOAD_SHORT) | ((i23 << 3) & 57344) | ((i23 << 12) & 3670016) | ((i23 << 18) & 29360128), 808);
                if (ComposerKt.isTraceInProgress()) {
                }
                j9 = j5;
                textStyle3 = textStyle2;
                i26 = i22;
                i27 = i21;
                i28 = i422;
                fontWeight5 = fontWeight62;
                modifier3 = modifier2;
                j10 = m5693getUnspecified0d7_KjU;
                long j132 = j7;
                z3 = z2;
                fontFamily3 = fontFamily2;
                i29 = i9;
                j11 = j6;
                j12 = j132;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i13 = i12;
            if ((i5 & 805306368) == 0) {
            }
            i14 = i7 & 1024;
            if (i14 != 0) {
            }
            i16 = i7 & 2048;
            if (i16 != 0) {
            }
            i17 = i16;
            if ((i6 & 384) == 0) {
            }
            int i3722 = i15;
            i18 = i7 & 8192;
            if (i18 == 0) {
            }
            if ((i8 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i5 & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if ((i7 & 4) != 0) {
            }
            if ((i7 & 8) == 0) {
            }
            if (i10 != 0) {
            }
            if ((i7 & 32) == 0) {
            }
            if ((i7 & 64) != 0) {
            }
            if ((i7 & 128) == 0) {
            }
            if (i13 == 0) {
            }
            if ((i7 & 512) == 0) {
            }
            if (i14 == 0) {
            }
            if (i17 == 0) {
            }
            int i3822 = i20;
            if ((i7 & 4096) == 0) {
            }
            if (i18 == 0) {
            }
            z2 = z4;
            j6 = j8;
            i9 = i3822;
            startRestartGroup.endDefaults();
            int i4222 = i25;
            if (ComposerKt.isTraceInProgress()) {
            }
            int i4322 = i24 >> 9;
            int i4422 = i24;
            TextStyle m9558mergeThemedUwpzLow22 = m9558mergeThemedUwpzLow(textStyle2, i9, j6, m5693getUnspecified0d7_KjU, fontWeight4, fontFamily2, j5, j7, startRestartGroup, (i4322 & 896) | ((i24 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | ((i4422 >> 15) & 7168) | (57344 & i4322) | ((i4422 >> 12) & 458752) | (3670016 & (i4422 << 6)) | ((i4422 << 3) & 29360128), 0);
            FontWeight fontWeight622 = fontWeight4;
            composer2 = startRestartGroup;
            BasicTextKt.m1237BasicTextRWo7tUw(text, modifier2, m9558mergeThemedUwpzLow22, (Function1<? super TextLayoutResult, Unit>) null, i4222, false, i22, i21, (ColorProducer) null, (TextAutoSize) null, composer2, (i4422 & WebSocketProtocol.PAYLOAD_SHORT) | ((i23 << 3) & 57344) | ((i23 << 12) & 3670016) | ((i23 << 18) & 29360128), 808);
            if (ComposerKt.isTraceInProgress()) {
            }
            j9 = j5;
            textStyle3 = textStyle2;
            i26 = i22;
            i27 = i21;
            i28 = i4222;
            fontWeight5 = fontWeight622;
            modifier3 = modifier2;
            j10 = m5693getUnspecified0d7_KjU;
            long j1322 = j7;
            z3 = z2;
            fontFamily3 = fontFamily2;
            i29 = i9;
            j11 = j6;
            j12 = j1322;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i5 & 384) != 0) {
        }
        if ((i5 & 3072) != 0) {
        }
        i10 = i7 & 16;
        if (i10 == 0) {
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i5 & 1572864) != 0) {
        }
        if ((i5 & 12582912) != 0) {
        }
        i12 = i7 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i5 & 805306368) == 0) {
        }
        i14 = i7 & 1024;
        if (i14 != 0) {
        }
        i16 = i7 & 2048;
        if (i16 != 0) {
        }
        i17 = i16;
        if ((i6 & 384) == 0) {
        }
        int i37222 = i15;
        i18 = i7 & 8192;
        if (i18 == 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i5 & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i7 & 4) != 0) {
        }
        if ((i7 & 8) == 0) {
        }
        if (i10 != 0) {
        }
        if ((i7 & 32) == 0) {
        }
        if ((i7 & 64) != 0) {
        }
        if ((i7 & 128) == 0) {
        }
        if (i13 == 0) {
        }
        if ((i7 & 512) == 0) {
        }
        if (i14 == 0) {
        }
        if (i17 == 0) {
        }
        int i38222 = i20;
        if ((i7 & 4096) == 0) {
        }
        if (i18 == 0) {
        }
        z2 = z4;
        j6 = j8;
        i9 = i38222;
        startRestartGroup.endDefaults();
        int i42222 = i25;
        if (ComposerKt.isTraceInProgress()) {
        }
        int i43222 = i24 >> 9;
        int i44222 = i24;
        TextStyle m9558mergeThemedUwpzLow222 = m9558mergeThemedUwpzLow(textStyle2, i9, j6, m5693getUnspecified0d7_KjU, fontWeight4, fontFamily2, j5, j7, startRestartGroup, (i43222 & 896) | ((i24 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | ((i44222 >> 15) & 7168) | (57344 & i43222) | ((i44222 >> 12) & 458752) | (3670016 & (i44222 << 6)) | ((i44222 << 3) & 29360128), 0);
        FontWeight fontWeight6222 = fontWeight4;
        composer2 = startRestartGroup;
        BasicTextKt.m1237BasicTextRWo7tUw(text, modifier2, m9558mergeThemedUwpzLow222, (Function1<? super TextLayoutResult, Unit>) null, i42222, false, i22, i21, (ColorProducer) null, (TextAutoSize) null, composer2, (i44222 & WebSocketProtocol.PAYLOAD_SHORT) | ((i23 << 3) & 57344) | ((i23 << 12) & 3670016) | ((i23 << 18) & 29360128), 808);
        if (ComposerKt.isTraceInProgress()) {
        }
        j9 = j5;
        textStyle3 = textStyle2;
        i26 = i22;
        i27 = i21;
        i28 = i42222;
        fontWeight5 = fontWeight6222;
        modifier3 = modifier2;
        j10 = m5693getUnspecified0d7_KjU;
        long j13222 = j7;
        z3 = z2;
        fontFamily3 = fontFamily2;
        i29 = i9;
        j11 = j6;
        j12 = j13222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f4  */
    /* renamed from: Text-curKjrk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9557TextcurKjrk(final AnnotatedString text, Modifier modifier, TextStyle textStyle, int i, long j, long j2, FontWeight fontWeight, long j3, long j4, FontFamily fontFamily, boolean z, int i2, int i3, int i4, Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        Modifier modifier2;
        TextStyle textStyle2;
        int i9;
        long j5;
        int i10;
        long j6;
        FontWeight fontWeight2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j7;
        long m5693getUnspecified0d7_KjU;
        long m8606getUnspecifiedXSAIIZE;
        FontFamily fontFamily2;
        boolean z2;
        int i20;
        int i21;
        int m8308getClipgIe3tQ8;
        FontFamily fontFamily3;
        Composer composer2;
        final boolean z3;
        final int i22;
        final long j8;
        final FontFamily fontFamily4;
        final long j9;
        final TextStyle textStyle3;
        final int i23;
        final long j10;
        final int i24;
        final int i25;
        final FontWeight fontWeight3;
        final Modifier modifier3;
        final long j11;
        ScopeUpdateScope endRestartGroup;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-973058382);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (startRestartGroup.changed(text) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i31 = i7 & 2;
        if (i31 != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            modifier2 = modifier;
            i8 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i5 & 384) != 0) {
                if ((i7 & 4) == 0) {
                    textStyle2 = textStyle;
                    if (startRestartGroup.changed(textStyle2)) {
                        i30 = 256;
                        i8 |= i30;
                    }
                } else {
                    textStyle2 = textStyle;
                }
                i30 = 128;
                i8 |= i30;
            } else {
                textStyle2 = textStyle;
            }
            if ((i5 & 3072) != 0) {
                if ((i7 & 8) == 0) {
                    i9 = i;
                    if (startRestartGroup.changed(i9)) {
                        i29 = 2048;
                        i8 |= i29;
                    }
                } else {
                    i9 = i;
                }
                i29 = 1024;
                i8 |= i29;
            } else {
                i9 = i;
            }
            if ((i5 & 24576) != 0) {
                j5 = j;
                i8 |= ((i7 & 16) == 0 && startRestartGroup.changed(j5)) ? 16384 : 8192;
            } else {
                j5 = j;
            }
            if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                if ((i7 & 32) == 0) {
                    i10 = i31;
                    j6 = j2;
                    if (startRestartGroup.changed(j6)) {
                        i28 = 131072;
                        i8 |= i28;
                    }
                } else {
                    i10 = i31;
                    j6 = j2;
                }
                i28 = 65536;
                i8 |= i28;
            } else {
                i10 = i31;
                j6 = j2;
            }
            if ((i5 & 1572864) != 0) {
                fontWeight2 = fontWeight;
                i8 |= ((i7 & 64) == 0 && startRestartGroup.changed(fontWeight2)) ? 1048576 : 524288;
            } else {
                fontWeight2 = fontWeight;
            }
            i11 = i7 & 128;
            if (i11 == 0) {
                i8 |= 12582912;
            } else if ((i5 & 12582912) == 0) {
                i8 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i12 = i7 & 256;
            if (i12 == 0) {
                i8 |= 100663296;
            } else if ((i5 & 100663296) == 0) {
                i8 |= startRestartGroup.changed(j4) ? 67108864 : 33554432;
            }
            if ((i5 & 805306368) == 0) {
                if ((i7 & 512) == 0 && startRestartGroup.changed(fontFamily)) {
                    i27 = C.BUFFER_FLAG_LAST_SAMPLE;
                    i8 |= i27;
                }
                i27 = 268435456;
                i8 |= i27;
            }
            i13 = i7 & 1024;
            if (i13 == 0) {
                i14 = i6 | 6;
            } else if ((i6 & 6) == 0) {
                i14 = i6 | (startRestartGroup.changed(z) ? 4 : 2);
            } else {
                i14 = i6;
            }
            i15 = i7 & 2048;
            if (i15 == 0) {
                i14 |= 48;
            } else if ((i6 & 48) == 0) {
                i16 = i15;
                i14 |= startRestartGroup.changed(i2) ? 32 : 16;
                if ((i6 & 384) == 0) {
                    if ((i7 & 4096) == 0 && startRestartGroup.changed(i3)) {
                        i26 = 256;
                        i14 |= i26;
                    }
                    i26 = 128;
                    i14 |= i26;
                }
                int i32 = i14;
                i17 = i7 & 8192;
                if (i17 != 0) {
                    i18 = i32 | 3072;
                } else if ((i6 & 3072) == 0) {
                    i18 = i32 | (startRestartGroup.changed(i4) ? 2048 : 1024);
                } else {
                    i18 = i32;
                }
                if ((i8 & 306783379) == 306783378 || (i18 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i5 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i7 & 4) != 0) {
                            ProvidableCompositionLocal<TextStyle> localTextStyle = UtilsKt.getLocalTextStyle();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localTextStyle);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            i8 &= -897;
                            textStyle2 = (TextStyle) consume;
                        }
                        if ((i7 & 8) != 0) {
                            i19 = TextAlign.INSTANCE.m8263getUnspecifiede0LSkKk();
                            i8 &= -7169;
                        } else {
                            i19 = i9;
                        }
                        if ((i7 & 16) != 0) {
                            j5 = textStyle2.m7866getFontSizeXSAIIZE();
                            i8 &= -57345;
                        }
                        if ((i7 & 32) != 0) {
                            j7 = textStyle2.m7871getLetterSpacingXSAIIZE();
                            i8 &= -458753;
                        } else {
                            j7 = j6;
                        }
                        if ((i7 & 64) != 0) {
                            i8 &= -3670017;
                            fontWeight2 = textStyle2.getFontWeight();
                        }
                        m5693getUnspecified0d7_KjU = i11 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
                        m8606getUnspecifiedXSAIIZE = i12 != 0 ? TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE() : j4;
                        if ((i7 & 512) != 0) {
                            fontFamily2 = textStyle2.getFontFamily();
                            i8 = (-1879048193) & i8;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        z2 = i13 != 0 ? false : z;
                        i20 = i16 != 0 ? 1 : i2;
                        if ((i7 & 4096) != 0) {
                            i21 = z2 ? 1 : Integer.MAX_VALUE;
                            i18 &= -897;
                        } else {
                            i21 = i3;
                        }
                        m8308getClipgIe3tQ8 = i17 != 0 ? TextOverflow.INSTANCE.m8308getClipgIe3tQ8() : i4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i7 & 4) != 0) {
                            i8 &= -897;
                        }
                        if ((i7 & 8) != 0) {
                            i8 &= -7169;
                        }
                        if ((i7 & 16) != 0) {
                            i8 &= -57345;
                        }
                        if ((i7 & 32) != 0) {
                            i8 &= -458753;
                        }
                        if ((i7 & 64) != 0) {
                            i8 &= -3670017;
                        }
                        if ((i7 & 512) != 0) {
                            i8 &= -1879048193;
                        }
                        if ((i7 & 4096) != 0) {
                            i18 &= -897;
                        }
                        m5693getUnspecified0d7_KjU = j3;
                        m8606getUnspecifiedXSAIIZE = j4;
                        fontFamily2 = fontFamily;
                        z2 = z;
                        i20 = i2;
                        m8308getClipgIe3tQ8 = i4;
                        i19 = i9;
                        j7 = j6;
                        i21 = i3;
                    }
                    startRestartGroup.endDefaults();
                    int i33 = i19;
                    if (ComposerKt.isTraceInProgress()) {
                        fontFamily3 = fontFamily2;
                        ComposerKt.traceEventStart(-973058382, i8, i18, "com.composeunstyled.Text (Text.kt:123)");
                    } else {
                        fontFamily3 = fontFamily2;
                    }
                    int i34 = i8 >> 6;
                    int i35 = i18;
                    int i36 = i8 >> 12;
                    long j12 = j7;
                    FontWeight fontWeight4 = fontWeight2;
                    long j13 = m5693getUnspecified0d7_KjU;
                    long j14 = m8606getUnspecifiedXSAIIZE;
                    TextStyle m9558mergeThemedUwpzLow = m9558mergeThemedUwpzLow(textStyle2, i33, j5, j13, fontWeight4, fontFamily3, j14, j12, startRestartGroup, (i36 & 458752) | (i36 & 7168) | (i34 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i34 & 57344) | (i34 & 3670016) | (29360128 & (i8 << 6)), 0);
                    FontFamily fontFamily5 = fontFamily3;
                    composer2 = startRestartGroup;
                    BasicTextKt.m1235BasicTextCL7eQgs(text, modifier2, m9558mergeThemedUwpzLow, null, m8308getClipgIe3tQ8, false, i21, i20, null, null, null, composer2, (i8 & WebSocketProtocol.PAYLOAD_SHORT) | ((i35 << 3) & 57344) | ((i35 << 12) & 3670016) | ((i35 << 18) & 29360128), 0, 1832);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z2;
                    i22 = i33;
                    j8 = j12;
                    fontFamily4 = fontFamily5;
                    j9 = j5;
                    textStyle3 = textStyle2;
                    i23 = i20;
                    j10 = j13;
                    i24 = m8308getClipgIe3tQ8;
                    i25 = i21;
                    fontWeight3 = fontWeight4;
                    modifier3 = modifier2;
                    j11 = j14;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z;
                    i23 = i2;
                    i25 = i3;
                    i24 = i4;
                    composer2 = startRestartGroup;
                    i22 = i9;
                    j8 = j6;
                    j9 = j5;
                    modifier3 = modifier2;
                    textStyle3 = textStyle2;
                    fontWeight3 = fontWeight2;
                    j10 = j3;
                    j11 = j4;
                    fontFamily4 = fontFamily;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.TextKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Text_curKjrk$lambda$1;
                            Text_curKjrk$lambda$1 = TextKt.Text_curKjrk$lambda$1(AnnotatedString.this, modifier3, textStyle3, i22, j9, j8, fontWeight3, j10, j11, fontFamily4, z3, i23, i25, i24, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                            return Text_curKjrk$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            i16 = i15;
            if ((i6 & 384) == 0) {
            }
            int i322 = i14;
            i17 = i7 & 8192;
            if (i17 != 0) {
            }
            if ((i8 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i5 & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i7 & 4) != 0) {
            }
            if ((i7 & 8) != 0) {
            }
            if ((i7 & 16) != 0) {
            }
            if ((i7 & 32) != 0) {
            }
            if ((i7 & 64) != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if ((i7 & 512) != 0) {
            }
            if (i13 != 0) {
            }
            if (i16 != 0) {
            }
            if ((i7 & 4096) != 0) {
            }
            if (i17 != 0) {
            }
            startRestartGroup.endDefaults();
            int i332 = i19;
            if (ComposerKt.isTraceInProgress()) {
            }
            int i342 = i8 >> 6;
            int i352 = i18;
            int i362 = i8 >> 12;
            long j122 = j7;
            FontWeight fontWeight42 = fontWeight2;
            long j132 = m5693getUnspecified0d7_KjU;
            long j142 = m8606getUnspecifiedXSAIIZE;
            TextStyle m9558mergeThemedUwpzLow2 = m9558mergeThemedUwpzLow(textStyle2, i332, j5, j132, fontWeight42, fontFamily3, j142, j122, startRestartGroup, (i362 & 458752) | (i362 & 7168) | (i342 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i342 & 57344) | (i342 & 3670016) | (29360128 & (i8 << 6)), 0);
            FontFamily fontFamily52 = fontFamily3;
            composer2 = startRestartGroup;
            BasicTextKt.m1235BasicTextCL7eQgs(text, modifier2, m9558mergeThemedUwpzLow2, null, m8308getClipgIe3tQ8, false, i21, i20, null, null, null, composer2, (i8 & WebSocketProtocol.PAYLOAD_SHORT) | ((i352 << 3) & 57344) | ((i352 << 12) & 3670016) | ((i352 << 18) & 29360128), 0, 1832);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z2;
            i22 = i332;
            j8 = j122;
            fontFamily4 = fontFamily52;
            j9 = j5;
            textStyle3 = textStyle2;
            i23 = i20;
            j10 = j132;
            i24 = m8308getClipgIe3tQ8;
            i25 = i21;
            fontWeight3 = fontWeight42;
            modifier3 = modifier2;
            j11 = j142;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i5 & 384) != 0) {
        }
        if ((i5 & 3072) != 0) {
        }
        if ((i5 & 24576) != 0) {
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i5 & 1572864) != 0) {
        }
        i11 = i7 & 128;
        if (i11 == 0) {
        }
        i12 = i7 & 256;
        if (i12 == 0) {
        }
        if ((i5 & 805306368) == 0) {
        }
        i13 = i7 & 1024;
        if (i13 == 0) {
        }
        i15 = i7 & 2048;
        if (i15 == 0) {
        }
        i16 = i15;
        if ((i6 & 384) == 0) {
        }
        int i3222 = i14;
        i17 = i7 & 8192;
        if (i17 != 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i5 & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i7 & 4) != 0) {
        }
        if ((i7 & 8) != 0) {
        }
        if ((i7 & 16) != 0) {
        }
        if ((i7 & 32) != 0) {
        }
        if ((i7 & 64) != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if ((i7 & 512) != 0) {
        }
        if (i13 != 0) {
        }
        if (i16 != 0) {
        }
        if ((i7 & 4096) != 0) {
        }
        if (i17 != 0) {
        }
        startRestartGroup.endDefaults();
        int i3322 = i19;
        if (ComposerKt.isTraceInProgress()) {
        }
        int i3422 = i8 >> 6;
        int i3522 = i18;
        int i3622 = i8 >> 12;
        long j1222 = j7;
        FontWeight fontWeight422 = fontWeight2;
        long j1322 = m5693getUnspecified0d7_KjU;
        long j1422 = m8606getUnspecifiedXSAIIZE;
        TextStyle m9558mergeThemedUwpzLow22 = m9558mergeThemedUwpzLow(textStyle2, i3322, j5, j1322, fontWeight422, fontFamily3, j1422, j1222, startRestartGroup, (i3622 & 458752) | (i3622 & 7168) | (i3422 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i3422 & 57344) | (i3422 & 3670016) | (29360128 & (i8 << 6)), 0);
        FontFamily fontFamily522 = fontFamily3;
        composer2 = startRestartGroup;
        BasicTextKt.m1235BasicTextCL7eQgs(text, modifier2, m9558mergeThemedUwpzLow22, null, m8308getClipgIe3tQ8, false, i21, i20, null, null, null, composer2, (i8 & WebSocketProtocol.PAYLOAD_SHORT) | ((i3522 << 3) & 57344) | ((i3522 << 12) & 3670016) | ((i3522 << 18) & 29360128), 0, 1832);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z2;
        i22 = i3322;
        j8 = j1222;
        fontFamily4 = fontFamily522;
        j9 = j5;
        textStyle3 = textStyle2;
        i23 = i20;
        j10 = j1322;
        i24 = m8308getClipgIe3tQ8;
        i25 = i21;
        fontWeight3 = fontWeight422;
        modifier3 = modifier2;
        j11 = j1422;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* renamed from: mergeThemed-UwpzLow, reason: not valid java name */
    public static final TextStyle m9558mergeThemedUwpzLow(TextStyle mergeThemed, int i, long j, long j2, FontWeight fontWeight, FontFamily fontFamily, long j3, long j4, Composer composer, int i2, int i3) {
        TextUnit textUnit;
        ?? r37;
        ?? r40;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Intrinsics.checkNotNullParameter(mergeThemed, "$this$mergeThemed");
        composer.startReplaceGroup(-1371911913);
        long m5693getUnspecified0d7_KjU = (i3 & 4) != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j2;
        long m8606getUnspecifiedXSAIIZE = (i3 & 32) != 0 ? TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE() : j3;
        long m8606getUnspecifiedXSAIIZE2 = (i3 & 64) != 0 ? TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371911913, i2, -1, "com.composeunstyled.mergeThemed (Text.kt:154)");
        }
        ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContentColor);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long m5667unboximpl = ((Color) consume).m5667unboximpl();
        boolean z = false;
        boolean z2 = true;
        Iterator it = CollectionsKt.listOf((Object[]) new TextAlign[]{TextAlign.m8250boximpl(i), TextAlign.m8250boximpl(mergeThemed.m7876getTextAligne0LSkKk())}).iterator();
        while (true) {
            textUnit = null;
            if (!it.hasNext()) {
                r37 = z;
                r40 = z2;
                obj = null;
                break;
            }
            obj = it.next();
            r37 = z;
            r40 = z2;
            if (!TextAlign.m8253equalsimpl0(((TextAlign) obj).getValue(), TextAlign.INSTANCE.m8263getUnspecifiede0LSkKk())) {
                break;
            }
            z = r37 == true ? 1 : 0;
            z2 = r40 == true ? 1 : 0;
        }
        TextAlign textAlign = (TextAlign) obj;
        int value = textAlign != null ? textAlign.getValue() : TextAlign.INSTANCE.m8263getUnspecifiede0LSkKk();
        TextUnit[] textUnitArr = new TextUnit[2];
        textUnitArr[r37] = TextUnit.m8585boximpl(j);
        textUnitArr[r40] = TextUnit.m8585boximpl(mergeThemed.m7866getFontSizeXSAIIZE());
        Iterator it2 = CollectionsKt.listOf((Object[]) textUnitArr).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if ((TextUnit.m8593getRawTypeimpl(((TextUnit) obj2).getPackedValue()) == 0 ? r40 : r37) == false) {
                break;
            }
        }
        TextUnit textUnit2 = (TextUnit) obj2;
        long packedValue = textUnit2 != null ? textUnit2.getPackedValue() : TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE();
        Color[] colorArr = new Color[3];
        colorArr[r37] = Color.m5647boximpl(m5693getUnspecified0d7_KjU);
        colorArr[r40] = Color.m5647boximpl(m5667unboximpl);
        colorArr[2] = Color.m5647boximpl(mergeThemed.m7865getColor0d7_KjU());
        Iterator it3 = CollectionsKt.listOf((Object[]) colorArr).iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (((Color) obj3).m5667unboximpl() != 16) {
                break;
            }
        }
        Color color = (Color) obj3;
        long m5667unboximpl2 = color != null ? color.m5667unboximpl() : Color.INSTANCE.m5693getUnspecified0d7_KjU();
        TextUnit[] textUnitArr2 = new TextUnit[2];
        textUnitArr2[r37] = TextUnit.m8585boximpl(m8606getUnspecifiedXSAIIZE);
        textUnitArr2[r40] = TextUnit.m8585boximpl(mergeThemed.m7874getLineHeightXSAIIZE());
        Iterator it4 = CollectionsKt.listOf((Object[]) textUnitArr2).iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            if ((TextUnit.m8593getRawTypeimpl(((TextUnit) obj4).getPackedValue()) == 0 ? r40 : r37) == false) {
                break;
            }
        }
        TextUnit textUnit3 = (TextUnit) obj4;
        long packedValue2 = textUnit3 != null ? textUnit3.getPackedValue() : TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE();
        TextUnit[] textUnitArr3 = new TextUnit[2];
        textUnitArr3[r37] = TextUnit.m8585boximpl(m8606getUnspecifiedXSAIIZE2);
        textUnitArr3[r40] = TextUnit.m8585boximpl(mergeThemed.m7871getLetterSpacingXSAIIZE());
        Iterator it5 = CollectionsKt.listOf((Object[]) textUnitArr3).iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            ?? next = it5.next();
            if ((TextUnit.m8593getRawTypeimpl(((TextUnit) next).getPackedValue()) == 0 ? r40 : r37) == false) {
                textUnit = next;
                break;
            }
        }
        TextUnit textUnit4 = textUnit;
        TextStyle m7855mergedA7vx0o$default = TextStyle.m7855mergedA7vx0o$default(mergeThemed, m5667unboximpl2, packedValue, fontWeight, null, null, fontFamily, null, textUnit4 != null ? textUnit4.getPackedValue() : TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE(), null, null, null, 0L, null, null, null, value, 0, packedValue2, null, null, 0, 0, null, null, 16613208, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m7855mergedA7vx0o$default;
    }
}
