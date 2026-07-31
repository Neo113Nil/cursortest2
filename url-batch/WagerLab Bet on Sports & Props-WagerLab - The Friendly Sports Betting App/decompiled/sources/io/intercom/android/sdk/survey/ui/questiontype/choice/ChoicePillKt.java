package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChoicePill.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0018"}, d2 = {"ChoicePill", "", "selected", "", "onClicked", "Lkotlin/Function1;", "", "text", "strokeColor", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "backgroundColor", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontColor", "ChoicePill-UdaoDFU", "(ZLkotlin/jvm/functions/Function1;Ljava/lang/String;JFJLandroidx/compose/ui/text/font/FontWeight;JLandroidx/compose/runtime/Composer;II)V", "EmptyPill", "(Landroidx/compose/runtime/Composer;I)V", "SelectedPill", "SelectedPillDark", "SelectedPillLongText", "SelectedPillLongBigText", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChoicePillKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChoicePill_UdaoDFU$lambda$4(boolean z, Function1 function1, String text, long j, float f, long j2, FontWeight fontWeight, long j3, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        m11781ChoicePillUdaoDFU(z, function1, text, j, f, j2, fontWeight, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyPill$lambda$5(int i, Composer composer, int i2) {
        EmptyPill(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedPill$lambda$6(int i, Composer composer, int i2) {
        SelectedPill(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedPillDark$lambda$7(int i, Composer composer, int i2) {
        SelectedPillDark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedPillLongBigText$lambda$9(int i, Composer composer, int i2) {
        SelectedPillLongBigText(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedPillLongText$lambda$8(int i, Composer composer, int i2) {
        SelectedPillLongText(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChoicePill_UdaoDFU$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0140  */
    /* renamed from: ChoicePill-UdaoDFU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11781ChoicePillUdaoDFU(final boolean z, Function1<? super String, Unit> function1, final String text, long j, float f, long j2, FontWeight fontWeight, long j3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        long j4;
        int i5;
        float f2;
        int i6;
        long j5;
        int i7;
        FontWeight fontWeight2;
        final Function1<? super String, Unit> function12;
        FontWeight normal;
        long j6;
        int i8;
        float f3;
        boolean z2;
        Object rememberedValue;
        int hashCode;
        Composer m4976constructorimpl;
        Composer composer2;
        final float f4;
        final FontWeight fontWeight3;
        final Function1<? super String, Unit> function13;
        final long j7;
        final long j8;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(418926179);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(text) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                j4 = j;
                i3 |= startRestartGroup.changed(j4) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        j5 = j2;
                    } else {
                        j5 = j2;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(j5) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        fontWeight2 = fontWeight;
                    } else {
                        fontWeight2 = fontWeight;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(fontWeight2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j3)) ? 8388608 : 4194304;
                    }
                    if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            function12 = i9 == 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit ChoicePill_UdaoDFU$lambda$0;
                                    ChoicePill_UdaoDFU$lambda$0 = ChoicePillKt.ChoicePill_UdaoDFU$lambda$0((String) obj);
                                    return ChoicePill_UdaoDFU$lambda$0;
                                }
                            } : function1;
                            if (i4 != 0) {
                                j4 = Color.INSTANCE.m5683getBlack0d7_KjU();
                            }
                            float m8401constructorimpl = i5 == 0 ? Dp.m8401constructorimpl(1) : f2;
                            if (i6 != 0) {
                                j5 = Color.INSTANCE.m5694getWhite0d7_KjU();
                            }
                            normal = i7 == 0 ? FontWeight.INSTANCE.getNormal() : fontWeight2;
                            if ((i2 & 128) == 0) {
                                j6 = ColorExtensionsKt.m12238generateTextColor8_81llA(j5);
                                i3 &= -29360129;
                            } else {
                                j6 = j3;
                            }
                            i8 = i3;
                            f3 = m8401constructorimpl;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            function12 = function1;
                            normal = fontWeight2;
                            f3 = f2;
                            j6 = j3;
                            i8 = i3;
                        }
                        long j10 = j4;
                        startRestartGroup.endDefaults();
                        long j11 = j5;
                        CornerBasedShape small = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
                        Modifier m262backgroundbw27NRU$default = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(BorderKt.border(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BorderStrokeKt.m292BorderStrokecXLIe8U(f3, j10), small), small), j11, null, 2, null);
                        startRestartGroup.startReplaceGroup(-8583674);
                        z2 = ((i8 & 112) != 32) | ((i8 & 896) == 256);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit ChoicePill_UdaoDFU$lambda$2$lambda$1;
                                    ChoicePill_UdaoDFU$lambda$2$lambda$1 = ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(Function1.this, text);
                                    return ChoicePill_UdaoDFU$lambda$2$lambda$1;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m837padding3ABfNKs = PaddingKt.m837padding3ABfNKs(ClickableKt.m303clickableoSLSa3U$default(m262backgroundbw27NRU$default, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8401constructorimpl(16));
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m837padding3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function1<? super String, Unit> function14 = function12;
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
                        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i10 = i8;
                        long j12 = j6;
                        float f5 = f3;
                        TextKt.m3581TextNvy7gAk(text, rowScopeInstance.align(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.85f), Alignment.INSTANCE.getCenterVertically()), j12, null, 0L, null, normal, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, ((i8 >> 6) & 14) | ((i8 >> 15) & 896) | (i8 & 3670016), 0, 131000);
                        startRestartGroup.startReplaceGroup(2120583720);
                        if (z) {
                            composer2 = startRestartGroup;
                        } else {
                            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_attribute_verified_tick, startRestartGroup, 0), StringResources_androidKt.stringResource(androidx.compose.ui.R.string.selected, startRestartGroup, 0), rowScopeInstance.align(SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24)), Alignment.INSTANCE.getCenterVertically()), j12, startRestartGroup, ((i10 >> 12) & 7168) | 8, 0);
                            composer2 = startRestartGroup;
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        f4 = f5;
                        fontWeight3 = normal;
                        function13 = function14;
                        j7 = j11;
                        j8 = j12;
                        j9 = j10;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function13 = function1;
                        composer2 = startRestartGroup;
                        j7 = j5;
                        fontWeight3 = fontWeight2;
                        j9 = j4;
                        f4 = f2;
                        j8 = j3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ChoicePill_UdaoDFU$lambda$4;
                                ChoicePill_UdaoDFU$lambda$4 = ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z, function13, text, j9, f4, j7, fontWeight3, j8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return ChoicePill_UdaoDFU$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                f2 = f;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((23967451 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                i8 = i3;
                f3 = m8401constructorimpl;
                long j102 = j4;
                startRestartGroup.endDefaults();
                long j112 = j5;
                CornerBasedShape small2 = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
                Modifier m262backgroundbw27NRU$default2 = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(BorderKt.border(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BorderStrokeKt.m292BorderStrokecXLIe8U(f3, j102), small2), small2), j112, null, 2, null);
                startRestartGroup.startReplaceGroup(-8583674);
                z2 = ((i8 & 112) != 32) | ((i8 & 896) == 256);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ChoicePill_UdaoDFU$lambda$2$lambda$1;
                        ChoicePill_UdaoDFU$lambda$2$lambda$1 = ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(Function1.this, text);
                        return ChoicePill_UdaoDFU$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m837padding3ABfNKs2 = PaddingKt.m837padding3ABfNKs(ClickableKt.m303clickableoSLSa3U$default(m262backgroundbw27NRU$default2, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8401constructorimpl(16));
                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m837padding3ABfNKs2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function1<? super String, Unit> function142 = function12;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i102 = i8;
                long j122 = j6;
                float f52 = f3;
                TextKt.m3581TextNvy7gAk(text, rowScopeInstance2.align(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.85f), Alignment.INSTANCE.getCenterVertically()), j122, null, 0L, null, normal, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, ((i8 >> 6) & 14) | ((i8 >> 15) & 896) | (i8 & 3670016), 0, 131000);
                startRestartGroup.startReplaceGroup(2120583720);
                if (z) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                f4 = f52;
                fontWeight3 = normal;
                function13 = function142;
                j7 = j112;
                j8 = j122;
                j9 = j102;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            j4 = j;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i8 = i3;
            f3 = m8401constructorimpl;
            long j1022 = j4;
            startRestartGroup.endDefaults();
            long j1122 = j5;
            CornerBasedShape small22 = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
            Modifier m262backgroundbw27NRU$default22 = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(BorderKt.border(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BorderStrokeKt.m292BorderStrokecXLIe8U(f3, j1022), small22), small22), j1122, null, 2, null);
            startRestartGroup.startReplaceGroup(-8583674);
            z2 = ((i8 & 112) != 32) | ((i8 & 896) == 256);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit ChoicePill_UdaoDFU$lambda$2$lambda$1;
                    ChoicePill_UdaoDFU$lambda$2$lambda$1 = ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(Function1.this, text);
                    return ChoicePill_UdaoDFU$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m837padding3ABfNKs22 = PaddingKt.m837padding3ABfNKs(ClickableKt.m303clickableoSLSa3U$default(m262backgroundbw27NRU$default22, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8401constructorimpl(16));
            Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween22, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m837padding3ABfNKs22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            Function1<? super String, Unit> function1422 = function12;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash22);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            int i1022 = i8;
            long j1222 = j6;
            float f522 = f3;
            TextKt.m3581TextNvy7gAk(text, rowScopeInstance22.align(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.85f), Alignment.INSTANCE.getCenterVertically()), j1222, null, 0L, null, normal, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, ((i8 >> 6) & 14) | ((i8 >> 15) & 896) | (i8 & 3670016), 0, 131000);
            startRestartGroup.startReplaceGroup(2120583720);
            if (z) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            f4 = f522;
            fontWeight3 = normal;
            function13 = function1422;
            j7 = j1122;
            j8 = j1222;
            j9 = j1022;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j4 = j;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i8 = i3;
        f3 = m8401constructorimpl;
        long j10222 = j4;
        startRestartGroup.endDefaults();
        long j11222 = j5;
        CornerBasedShape small222 = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
        Modifier m262backgroundbw27NRU$default222 = BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(BorderKt.border(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BorderStrokeKt.m292BorderStrokecXLIe8U(f3, j10222), small222), small222), j11222, null, 2, null);
        startRestartGroup.startReplaceGroup(-8583674);
        z2 = ((i8 & 112) != 32) | ((i8 & 896) == 256);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit ChoicePill_UdaoDFU$lambda$2$lambda$1;
                ChoicePill_UdaoDFU$lambda$2$lambda$1 = ChoicePillKt.ChoicePill_UdaoDFU$lambda$2$lambda$1(Function1.this, text);
                return ChoicePill_UdaoDFU$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m837padding3ABfNKs222 = PaddingKt.m837padding3ABfNKs(ClickableKt.m303clickableoSLSa3U$default(m262backgroundbw27NRU$default222, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8401constructorimpl(16));
        Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceBetween222, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m837padding3ABfNKs222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        Function1<? super String, Unit> function14222 = function12;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m4976constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        int i10222 = i8;
        long j12222 = j6;
        float f5222 = f3;
        TextKt.m3581TextNvy7gAk(text, rowScopeInstance222.align(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.85f), Alignment.INSTANCE.getCenterVertically()), j12222, null, 0L, null, normal, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, ((i8 >> 6) & 14) | ((i8 >> 15) & 896) | (i8 & 3670016), 0, 131000);
        startRestartGroup.startReplaceGroup(2120583720);
        if (z) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        f4 = f5222;
        fontWeight3 = normal;
        function13 = function14222;
        j7 = j11222;
        j8 = j12222;
        j9 = j10222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChoicePill_UdaoDFU$lambda$2$lambda$1(Function1 function1, String text) {
        Intrinsics.checkNotNullParameter(text, "$text");
        function1.invoke(text);
        return Unit.INSTANCE;
    }

    private static final void EmptyPill(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1274080153);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m11782getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmptyPill$lambda$5;
                    EmptyPill$lambda$5 = ChoicePillKt.EmptyPill$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmptyPill$lambda$5;
                }
            });
        }
    }

    private static final void SelectedPill(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1118291055);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m11783getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SelectedPill$lambda$6;
                    SelectedPill$lambda$6 = ChoicePillKt.SelectedPill$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SelectedPill$lambda$6;
                }
            });
        }
    }

    private static final void SelectedPillDark(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-774877671);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m11784getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SelectedPillDark$lambda$7;
                    SelectedPillDark$lambda$7 = ChoicePillKt.SelectedPillDark$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SelectedPillDark$lambda$7;
                }
            });
        }
    }

    private static final void SelectedPillLongText(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(173524454);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m11785getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SelectedPillLongText$lambda$8;
                    SelectedPillLongText$lambda$8 = ChoicePillKt.SelectedPillLongText$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SelectedPillLongText$lambda$8;
                }
            });
        }
    }

    private static final void SelectedPillLongBigText(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1982481602);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SelectedPillLongText(startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SelectedPillLongBigText$lambda$9;
                    SelectedPillLongBigText$lambda$9 = ChoicePillKt.SelectedPillLongBigText$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SelectedPillLongBigText$lambda$9;
                }
            });
        }
    }
}
