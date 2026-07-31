package expo.modules.devmenu.compose.primitives;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.devmenu.compose.newtheme.NewAppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00122\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"NewText", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "color", "Landroidx/compose/ui/graphics/Color;", "maxLines", "", "softWrap", "", ViewProps.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "modifier", "Landroidx/compose/ui/Modifier;", "NewText-nUFttAo", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JIZILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JIZILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewText_nUFttAo$lambda$0(String str, TextStyle textStyle, long j, int i, boolean z, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        m10822NewTextnUFttAo(str, textStyle, j, i, z, i2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewText_nUFttAo$lambda$1(AnnotatedString annotatedString, TextStyle textStyle, long j, int i, boolean z, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        m10821NewTextnUFttAo(annotatedString, textStyle, j, i, z, i2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006c  */
    /* renamed from: NewText-nUFttAo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10822NewTextnUFttAo(final String text, TextStyle textStyle, long j, int i, boolean z, int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        TextStyle textStyle2;
        long j2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        Modifier.Companion companion;
        long j3;
        int i12;
        boolean z3;
        int i13;
        TextStyle textStyle3;
        final boolean z4;
        final int i14;
        final Modifier modifier2;
        final int i15;
        final TextStyle textStyle4;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        int i16;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1605272970);
        ComposerKt.sourceInformation(startRestartGroup, "C(NewText)P(6,5,0:c#ui.graphics.Color!1,4,3:c#ui.text.style.TextOverflow)26@826L4,28@893L4,22@731L283:Text.kt#k98qbf");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i17 = i4 & 2;
        if (i17 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            textStyle2 = textStyle;
            i5 |= startRestartGroup.changed(textStyle2) ? 32 : 16;
            if ((i3 & 384) != 0) {
                if ((i4 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i16 = 256;
                        i5 |= i16;
                    }
                } else {
                    j2 = j;
                }
                i16 = 128;
                i5 |= i16;
            } else {
                j2 = j;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i7 = i;
                i5 |= startRestartGroup.changed(i7) ? 2048 : 1024;
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z2 = z;
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i3) == 0) {
                        i10 = i2;
                        i5 |= startRestartGroup.changed(i10) ? 131072 : 65536;
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
                        }
                        if ((i5 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "16@565L6");
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                TextStyle textStyle5 = i17 != 0 ? null : textStyle2;
                                if ((i4 & 4) != 0) {
                                    i5 &= -897;
                                    j2 = NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getText().getDefault();
                                }
                                if (i6 != 0) {
                                    i7 = Integer.MAX_VALUE;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if (i9 != 0) {
                                    i10 = TextOverflow.INSTANCE.m8308getClipgIe3tQ8();
                                }
                                companion = i11 != 0 ? Modifier.INSTANCE : modifier;
                                j3 = j2;
                                i12 = i7;
                                z3 = z2;
                                i13 = i10;
                                textStyle3 = textStyle5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 4) != 0) {
                                    i5 &= -897;
                                }
                                int i18 = i10;
                                textStyle3 = textStyle2;
                                i13 = i18;
                                companion = modifier;
                                j3 = j2;
                                i12 = i7;
                                z3 = z2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1605272970, i5, -1, "expo.modules.devmenu.compose.primitives.NewText (Text.kt:21)");
                            }
                            Modifier modifier3 = companion;
                            BasicTextKt.m1237BasicTextRWo7tUw(text, modifier3, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j3, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), (Function1<? super TextLayoutResult, Unit>) null, i13, z3, i12, 0, (ColorProducer) null, (TextAutoSize) null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), TypedValues.Custom.TYPE_BOOLEAN);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            int i19 = i12;
                            z4 = z3;
                            i14 = i19;
                            modifier2 = modifier3;
                            i15 = i13;
                            textStyle4 = textStyle3;
                            j4 = j3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            textStyle4 = textStyle2;
                            j4 = j2;
                            i14 = i7;
                            z4 = z2;
                            i15 = i10;
                            modifier2 = modifier;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.primitives.TextKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit NewText_nUFttAo$lambda$0;
                                    NewText_nUFttAo$lambda$0 = TextKt.NewText_nUFttAo$lambda$0(text, textStyle4, j4, i14, z4, i15, modifier2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                    return NewText_nUFttAo$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i2;
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i5 & 599187) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "16@565L6");
                    if ((i3 & 1) != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if ((i4 & 4) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    j3 = j2;
                    i12 = i7;
                    z3 = z2;
                    i13 = i10;
                    textStyle3 = textStyle5;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier32 = companion;
                    BasicTextKt.m1237BasicTextRWo7tUw(text, modifier32, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j3, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), (Function1<? super TextLayoutResult, Unit>) null, i13, z3, i12, 0, (ColorProducer) null, (TextAutoSize) null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), TypedValues.Custom.TYPE_BOOLEAN);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i192 = i12;
                    z4 = z3;
                    i14 = i192;
                    modifier2 = modifier32;
                    i15 = i13;
                    textStyle4 = textStyle3;
                    j4 = j3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                i10 = i2;
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i5 & 599187) == 599186) {
                }
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "16@565L6");
                if ((i3 & 1) != 0) {
                }
                if (i17 != 0) {
                }
                if ((i4 & 4) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                j3 = j2;
                i12 = i7;
                z3 = z2;
                i13 = i10;
                textStyle3 = textStyle5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier322 = companion;
                BasicTextKt.m1237BasicTextRWo7tUw(text, modifier322, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j3, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), (Function1<? super TextLayoutResult, Unit>) null, i13, z3, i12, 0, (ColorProducer) null, (TextAutoSize) null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), TypedValues.Custom.TYPE_BOOLEAN);
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1922 = i12;
                z4 = z3;
                i14 = i1922;
                modifier2 = modifier322;
                i15 = i13;
                textStyle4 = textStyle3;
                j4 = j3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            z2 = z;
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            i10 = i2;
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "16@565L6");
            if ((i3 & 1) != 0) {
            }
            if (i17 != 0) {
            }
            if ((i4 & 4) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            j3 = j2;
            i12 = i7;
            z3 = z2;
            i13 = i10;
            textStyle3 = textStyle5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier3222 = companion;
            BasicTextKt.m1237BasicTextRWo7tUw(text, modifier3222, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j3, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), (Function1<? super TextLayoutResult, Unit>) null, i13, z3, i12, 0, (ColorProducer) null, (TextAutoSize) null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), TypedValues.Custom.TYPE_BOOLEAN);
            if (ComposerKt.isTraceInProgress()) {
            }
            int i19222 = i12;
            z4 = z3;
            i14 = i19222;
            modifier2 = modifier3222;
            i15 = i13;
            textStyle4 = textStyle3;
            j4 = j3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        textStyle2 = textStyle;
        if ((i3 & 384) != 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        z2 = z;
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        ComposerKt.sourceInformation(startRestartGroup, "16@565L6");
        if ((i3 & 1) != 0) {
        }
        if (i17 != 0) {
        }
        if ((i4 & 4) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        j3 = j2;
        i12 = i7;
        z3 = z2;
        i13 = i10;
        textStyle3 = textStyle5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier32222 = companion;
        BasicTextKt.m1237BasicTextRWo7tUw(text, modifier32222, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j3, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), (Function1<? super TextLayoutResult, Unit>) null, i13, z3, i12, 0, (ColorProducer) null, (TextAutoSize) null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), TypedValues.Custom.TYPE_BOOLEAN);
        if (ComposerKt.isTraceInProgress()) {
        }
        int i192222 = i12;
        z4 = z3;
        i14 = i192222;
        modifier2 = modifier32222;
        i15 = i13;
        textStyle4 = textStyle3;
        j4 = j3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006c  */
    /* renamed from: NewText-nUFttAo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10821NewTextnUFttAo(final AnnotatedString text, TextStyle textStyle, long j, int i, boolean z, int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        TextStyle textStyle2;
        long j2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        TextStyle textStyle3;
        Modifier.Companion companion;
        final boolean z3;
        final int i12;
        final Modifier modifier2;
        final int i13;
        final TextStyle textStyle4;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        int i14;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-129161860);
        ComposerKt.sourceInformation(startRestartGroup, "C(NewText)P(6,5,0:c#ui.graphics.Color!1,4,3:c#ui.text.style.TextOverflow)50@1386L4,52@1453L4,46@1291L283:Text.kt#k98qbf");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            textStyle2 = textStyle;
            i5 |= startRestartGroup.changed(textStyle2) ? 32 : 16;
            if ((i3 & 384) != 0) {
                if ((i4 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i14 = 256;
                        i5 |= i14;
                    }
                } else {
                    j2 = j;
                }
                i14 = 128;
                i5 |= i14;
            } else {
                j2 = j;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i7 = i;
                i5 |= startRestartGroup.changed(i7) ? 2048 : 1024;
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    z2 = z;
                    i5 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i3) == 0) {
                        i10 = i2;
                        i5 |= startRestartGroup.changed(i10) ? 131072 : 65536;
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
                        }
                        if ((i5 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "40@1125L6");
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                textStyle3 = i15 != 0 ? null : textStyle2;
                                if ((i4 & 4) != 0) {
                                    i5 &= -897;
                                    j2 = NewAppTheme.INSTANCE.getColors(startRestartGroup, 6).getText().getDefault();
                                }
                                if (i6 != 0) {
                                    i7 = Integer.MAX_VALUE;
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if (i9 != 0) {
                                    i10 = TextOverflow.INSTANCE.m8308getClipgIe3tQ8();
                                }
                                companion = i11 != 0 ? Modifier.INSTANCE : modifier;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 4) != 0) {
                                    i5 &= -897;
                                }
                                companion = modifier;
                                textStyle3 = textStyle2;
                            }
                            long j4 = j2;
                            int i16 = i7;
                            boolean z4 = z2;
                            int i17 = i10;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-129161860, i5, -1, "expo.modules.devmenu.compose.primitives.NewText (Text.kt:45)");
                            }
                            Modifier modifier3 = companion;
                            TextStyle textStyle5 = textStyle3;
                            BasicTextKt.m1235BasicTextCL7eQgs(text, modifier3, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j4, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), null, i17, z4, i16, 0, null, null, null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), 0, 1928);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            i12 = i16;
                            modifier2 = modifier3;
                            i13 = i17;
                            textStyle4 = textStyle5;
                            j3 = j4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            textStyle4 = textStyle2;
                            j3 = j2;
                            i12 = i7;
                            z3 = z2;
                            i13 = i10;
                            modifier2 = modifier;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: expo.modules.devmenu.compose.primitives.TextKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit NewText_nUFttAo$lambda$1;
                                    NewText_nUFttAo$lambda$1 = TextKt.NewText_nUFttAo$lambda$1(AnnotatedString.this, textStyle4, j3, i12, z3, i13, modifier2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                    return NewText_nUFttAo$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 = i2;
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i5 & 599187) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "40@1125L6");
                    if ((i3 & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if ((i4 & 4) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    long j42 = j2;
                    int i162 = i7;
                    boolean z42 = z2;
                    int i172 = i10;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier32 = companion;
                    TextStyle textStyle52 = textStyle3;
                    BasicTextKt.m1235BasicTextCL7eQgs(text, modifier32, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j42, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), null, i172, z42, i162, 0, null, null, null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), 0, 1928);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z42;
                    i12 = i162;
                    modifier2 = modifier32;
                    i13 = i172;
                    textStyle4 = textStyle52;
                    j3 = j42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                i10 = i2;
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i5 & 599187) == 599186) {
                }
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "40@1125L6");
                if ((i3 & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if ((i4 & 4) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                long j422 = j2;
                int i1622 = i7;
                boolean z422 = z2;
                int i1722 = i10;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier322 = companion;
                TextStyle textStyle522 = textStyle3;
                BasicTextKt.m1235BasicTextCL7eQgs(text, modifier322, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j422, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), null, i1722, z422, i1622, 0, null, null, null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), 0, 1928);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z422;
                i12 = i1622;
                modifier2 = modifier322;
                i13 = i1722;
                textStyle4 = textStyle522;
                j3 = j422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            z2 = z;
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            i10 = i2;
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "40@1125L6");
            if ((i3 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if ((i4 & 4) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            long j4222 = j2;
            int i16222 = i7;
            boolean z4222 = z2;
            int i17222 = i10;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier3222 = companion;
            TextStyle textStyle5222 = textStyle3;
            BasicTextKt.m1235BasicTextCL7eQgs(text, modifier3222, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j4222, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), null, i17222, z4222, i16222, 0, null, null, null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), 0, 1928);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4222;
            i12 = i16222;
            modifier2 = modifier3222;
            i13 = i17222;
            textStyle4 = textStyle5222;
            j3 = j4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        textStyle2 = textStyle;
        if ((i3 & 384) != 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        z2 = z;
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        ComposerKt.sourceInformation(startRestartGroup, "40@1125L6");
        if ((i3 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if ((i4 & 4) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        long j42222 = j2;
        int i162222 = i7;
        boolean z42222 = z2;
        int i172222 = i10;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier32222 = companion;
        TextStyle textStyle52222 = textStyle3;
        BasicTextKt.m1235BasicTextCL7eQgs(text, modifier32222, TextStyle.m7855mergedA7vx0o$default(NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getMd(), j42222, 0L, FontWeight.INSTANCE.getNormal(), null, null, NewAppTheme.INSTANCE.getFont(startRestartGroup, 6).getInter(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777178, null).merge(textStyle3), null, i172222, z42222, i162222, 0, null, null, null, startRestartGroup, (i5 & 14) | ((i5 >> 15) & 112) | ((i5 >> 3) & 57344) | (458752 & (i5 << 3)) | ((i5 << 9) & 3670016), 0, 1928);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z42222;
        i12 = i162222;
        modifier2 = modifier32222;
        i13 = i172222;
        textStyle4 = textStyle52222;
        j3 = j42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
