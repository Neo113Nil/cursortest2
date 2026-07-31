package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WrapReportingText.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aV\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"WrapReportingText", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "color", "Landroidx/compose/ui/graphics/Color;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextWrap", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "textWrapped", "WrapReportingText-T042LqI", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewShortText", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WrapReportingTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewShortText$lambda$7(int i, Composer composer, int i2) {
        PreviewShortText(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrapReportingText_T042LqI$lambda$6(Modifier modifier, String text, long j, TextStyle style, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(style, "$style");
        m11562WrapReportingTextT042LqI(modifier, text, j, style, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrapReportingText_T042LqI$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0072  */
    /* renamed from: WrapReportingText-T042LqI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11562WrapReportingTextT042LqI(Modifier modifier, final String text, final long j, final TextStyle style, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        Function1<? super Boolean, Unit> function12;
        final Function1<? super Boolean, Unit> function13;
        Object rememberedValue;
        final MutableState mutableState;
        Object rememberedValue2;
        boolean z;
        Object rememberedValue3;
        Composer composer2;
        final Modifier modifier3;
        final Function1<? super Boolean, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer startRestartGroup = composer.startRestartGroup(834036955);
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
            i3 |= startRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(style) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    function13 = i4 != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit WrapReportingText_T042LqI$lambda$0;
                            WrapReportingText_T042LqI$lambda$0 = WrapReportingTextKt.WrapReportingText_T042LqI$lambda$0(((Boolean) obj).booleanValue());
                            return WrapReportingText_T042LqI$lambda$0;
                        }
                    } : function12;
                    startRestartGroup.startReplaceGroup(1070301976);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1070306974);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit WrapReportingText_T042LqI$lambda$3$lambda$2;
                                WrapReportingText_T042LqI$lambda$3$lambda$2 = WrapReportingTextKt.WrapReportingText_T042LqI$lambda$3$lambda$2(MutableState.this, (ContentDrawScope) obj);
                                return WrapReportingText_T042LqI$lambda$3$lambda$2;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier drawWithContent = DrawModifierKt.drawWithContent(companion, (Function1) rememberedValue2);
                    startRestartGroup.startReplaceGroup(1070309155);
                    z = (57344 & i3) == 16384;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit WrapReportingText_T042LqI$lambda$5$lambda$4;
                                WrapReportingText_T042LqI$lambda$5$lambda$4 = WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(Function1.this, mutableState, (TextLayoutResult) obj);
                                return WrapReportingText_T042LqI$lambda$5$lambda$4;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    TextKt.m3581TextNvy7gAk(text, drawWithContent, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) rememberedValue3, style, composer2, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
                    modifier3 = companion;
                    function14 = function13;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    modifier3 = modifier2;
                    function14 = function12;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit WrapReportingText_T042LqI$lambda$6;
                            WrapReportingText_T042LqI$lambda$6 = WrapReportingTextKt.WrapReportingText_T042LqI$lambda$6(Modifier.this, text, j, style, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return WrapReportingText_T042LqI$lambda$6;
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if ((46811 & i3) == 9362) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            startRestartGroup.startReplaceGroup(1070301976);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1070306974);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier drawWithContent2 = DrawModifierKt.drawWithContent(companion, (Function1) rememberedValue2);
            startRestartGroup.startReplaceGroup(1070309155);
            if ((57344 & i3) == 16384) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit WrapReportingText_T042LqI$lambda$5$lambda$4;
                    WrapReportingText_T042LqI$lambda$5$lambda$4 = WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(Function1.this, mutableState, (TextLayoutResult) obj);
                    return WrapReportingText_T042LqI$lambda$5$lambda$4;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            TextKt.m3581TextNvy7gAk(text, drawWithContent2, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) rememberedValue3, style, composer2, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
            modifier3 = companion;
            function14 = function13;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((46811 & i3) == 9362) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        startRestartGroup.startReplaceGroup(1070301976);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1070306974);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier drawWithContent22 = DrawModifierKt.drawWithContent(companion, (Function1) rememberedValue2);
        startRestartGroup.startReplaceGroup(1070309155);
        if ((57344 & i3) == 16384) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue3 = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit WrapReportingText_T042LqI$lambda$5$lambda$4;
                WrapReportingText_T042LqI$lambda$5$lambda$4 = WrapReportingTextKt.WrapReportingText_T042LqI$lambda$5$lambda$4(Function1.this, mutableState, (TextLayoutResult) obj);
                return WrapReportingText_T042LqI$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        composer2 = startRestartGroup;
        TextKt.m3581TextNvy7gAk(text, drawWithContent22, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) rememberedValue3, style, composer2, ((i3 >> 3) & 14) | (i3 & 896), (i3 << 12) & 29360128, 65528);
        modifier3 = companion;
        function14 = function13;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrapReportingText_T042LqI$lambda$3$lambda$2(MutableState readyToDraw, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(readyToDraw, "$readyToDraw");
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        if (((Boolean) readyToDraw.getValue()).booleanValue()) {
            drawWithContent.drawContent();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrapReportingText_T042LqI$lambda$5$lambda$4(Function1 function1, MutableState readyToDraw, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(readyToDraw, "$readyToDraw");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        function1.invoke(Boolean.valueOf(textLayoutResult.getLineCount() > 1));
        readyToDraw.setValue(true);
        return Unit.INSTANCE;
    }

    private static final void PreviewShortText(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(381018303);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$WrapReportingTextKt.INSTANCE.m11553getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewShortText$lambda$7;
                    PreviewShortText$lambda$7 = WrapReportingTextKt.PreviewShortText$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewShortText$lambda$7;
                }
            });
        }
    }
}
