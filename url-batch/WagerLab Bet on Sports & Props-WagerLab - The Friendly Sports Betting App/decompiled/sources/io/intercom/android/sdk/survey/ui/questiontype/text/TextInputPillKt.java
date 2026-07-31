package io.intercom.android.sdk.survey.ui.questiontype.text;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusEventModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextInputPill.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aÃ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\r2\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010!\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010\"\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f\u001a\r\u0010#\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001f¨\u0006$"}, d2 = {"TextInputPill", "", "text", "", "placeholderText", "onTextChanged", "Lkotlin/Function1;", "strokeColor", "Landroidx/compose/ui/graphics/Color;", "cursorColor", "maxLines", "", "singleLine", "", "onImeActionNext", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Lkotlin/ExtensionFunctionType;", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "showTrailingIcon", "leadingIcon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ViewProps.ENABLED, ViewProps.MIN_HEIGHT, "Landroidx/compose/ui/unit/Dp;", "TextInputPill-g5ZjG94", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Color;JIZLkotlin/jvm/functions/Function1;IIZLkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;III)V", "TextInputPillPlaceholder", "(Landroidx/compose/runtime/Composer;I)V", "TextInputPillUnchecked", "TextInputPillValidated", "TextInputPillError", "TextInputPillDisabled", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextInputPillKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillDisabled$lambda$8(int i, Composer composer, int i2) {
        TextInputPillDisabled(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillError$lambda$7(int i, Composer composer, int i2) {
        TextInputPillError(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillPlaceholder$lambda$4(int i, Composer composer, int i2) {
        TextInputPillPlaceholder(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillUnchecked$lambda$5(int i, Composer composer, int i2) {
        TextInputPillUnchecked(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPillValidated$lambda$6(int i, Composer composer, int i2) {
        TextInputPillValidated(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPill_g5ZjG94$lambda$3(String str, String str2, Function1 onTextChanged, Color color, long j, int i, boolean z, Function1 function1, int i2, int i3, boolean z2, Function2 function2, boolean z3, float f, int i4, int i5, int i6, Composer composer, int i7) {
        Intrinsics.checkNotNullParameter(onTextChanged, "$onTextChanged");
        m11867TextInputPillg5ZjG94(str, str2, onTextChanged, color, j, i, z, function1, i2, i3, z2, function2, z3, f, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPill_g5ZjG94$lambda$0(KeyboardActionScope keyboardActionScope) {
        Intrinsics.checkNotNullParameter(keyboardActionScope, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0257  */
    /* renamed from: TextInputPill-g5ZjG94, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m11867TextInputPillg5ZjG94(String str, String str2, final Function1<? super String, Unit> onTextChanged, Color color, final long j, int i, boolean z, Function1<? super KeyboardActionScope, Unit> function1, int i2, int i3, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, float f, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        String str3;
        int i8;
        Color color2;
        int i9;
        int i10;
        int i11;
        boolean z4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        float f2;
        Object rememberedValue;
        Object rememberedValue2;
        Composer composer2;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final String str4;
        final boolean z6;
        final int i27;
        final int i28;
        final int i29;
        final Function1<? super KeyboardActionScope, Unit> function12;
        final String str5;
        final float f3;
        final boolean z7;
        final Color color3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Composer startRestartGroup = composer.startRestartGroup(701760197);
        int i30 = i6 & 1;
        if (i30 != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i31 = i6 & 2;
        if (i31 != 0) {
            i7 |= 48;
        } else if ((i4 & 112) == 0) {
            str3 = str2;
            i7 |= startRestartGroup.changed(str3) ? 32 : 16;
            if ((i6 & 4) == 0) {
                i7 |= 384;
            } else if ((i4 & 896) == 0) {
                i7 |= startRestartGroup.changedInstance(onTextChanged) ? 256 : 128;
            }
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i4 & 7168) == 0) {
                color2 = color;
                i7 |= startRestartGroup.changed(color2) ? 2048 : 1024;
                if ((i6 & 16) != 0) {
                    i7 |= 24576;
                } else if ((i4 & 57344) == 0) {
                    i7 |= startRestartGroup.changed(j) ? 16384 : 8192;
                }
                i9 = i6 & 32;
                if (i9 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i10 = i;
                } else {
                    i10 = i;
                    if ((i4 & 458752) == 0) {
                        i7 |= startRestartGroup.changed(i10) ? 131072 : 65536;
                    }
                }
                i11 = i6 & 64;
                if (i11 != 0) {
                    i7 |= 1572864;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i4 & 3670016) == 0) {
                        i7 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 29360128) == 0) {
                    i7 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                }
                i13 = i6 & 256;
                if (i13 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 234881024) == 0) {
                    i14 = i13;
                    i7 |= startRestartGroup.changed(i2) ? 67108864 : 33554432;
                    i15 = i6 & 512;
                    if (i15 == 0) {
                        i7 |= 805306368;
                    } else if ((i4 & 1879048192) == 0) {
                        i16 = i15;
                        i7 |= startRestartGroup.changed(i3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        i17 = i6 & 1024;
                        if (i17 != 0) {
                            i19 = i5 | 6;
                            i18 = i17;
                        } else if ((i5 & 14) == 0) {
                            i18 = i17;
                            i19 = i5 | (startRestartGroup.changed(z2) ? 4 : 2);
                        } else {
                            i18 = i17;
                            i19 = i5;
                        }
                        i20 = i6 & 2048;
                        if (i20 != 0) {
                            i19 |= 48;
                            i21 = i20;
                        } else if ((i5 & 112) == 0) {
                            i21 = i20;
                            i19 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
                        } else {
                            i21 = i20;
                        }
                        int i32 = i19;
                        i22 = i6 & 4096;
                        if (i22 != 0) {
                            i23 = i32 | 384;
                        } else if ((i5 & 896) == 0) {
                            i23 = i32 | (startRestartGroup.changed(z3) ? 256 : 128);
                        } else {
                            i23 = i32;
                        }
                        i24 = i6 & 8192;
                        if (i24 != 0) {
                            i25 = i23 | 3072;
                        } else {
                            int i33 = i23;
                            if ((i5 & 7168) == 0) {
                                i25 = i33 | (startRestartGroup.changed(f) ? 2048 : 1024);
                            } else {
                                i25 = i33;
                            }
                        }
                        if ((i7 & 1533916891) == 306783378 || (i25 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                            String str6 = i30 != 0 ? "" : str;
                            final String str7 = i31 != 0 ? "" : str3;
                            Color color4 = i8 != 0 ? null : color2;
                            int i34 = i9 != 0 ? Integer.MAX_VALUE : i10;
                            boolean z8 = i11 != 0 ? false : z4;
                            Function1<? super KeyboardActionScope, Unit> function13 = i12 != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit TextInputPill_g5ZjG94$lambda$0;
                                    TextInputPill_g5ZjG94$lambda$0 = TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((KeyboardActionScope) obj);
                                    return TextInputPill_g5ZjG94$lambda$0;
                                }
                            } : function1;
                            int m8078getTextPjHm6EE = i14 != 0 ? KeyboardType.INSTANCE.m8078getTextPjHm6EE() : i2;
                            int m8017getDefaulteUduSuo = i16 != 0 ? ImeAction.INSTANCE.m8017getDefaulteUduSuo() : i3;
                            final boolean z9 = i18 != 0 ? false : z2;
                            Function2<? super Composer, ? super Integer, Unit> function23 = i21 != 0 ? null : function2;
                            boolean z10 = i22 != 0 ? true : z3;
                            if (i24 != 0) {
                                i26 = i34;
                                f2 = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
                            } else {
                                i26 = i34;
                                f2 = f;
                            }
                            startRestartGroup.startReplaceGroup(-652105429);
                            int i35 = i25;
                            String str8 = str6;
                            long m5656copywmQWz5c$default = color4 == null ? Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : color4.m5667unboximpl();
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-652099794);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = BringIntoViewRequesterKt.BringIntoViewRequester();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i36 = i7;
                            Function1<? super KeyboardActionScope, Unit> function14 = function13;
                            int i37 = m8078getTextPjHm6EE;
                            int i38 = m8017getDefaulteUduSuo;
                            int i39 = 817889280 | (i36 & 14) | ((i36 >> 3) & 112) | ((i35 << 3) & 7168) | ((i35 << 21) & 234881024);
                            int i40 = ((i36 << 3) & 29360128) | ((i36 << 9) & 234881024);
                            composer2 = startRestartGroup;
                            boolean z11 = z9;
                            Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                            boolean z12 = z10;
                            TextFieldKt.TextField(str8, onTextChanged, FocusEventModifierKt.onFocusEvent(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clip(BorderKt.m274borderxT4_qwU(SizeKt.m874defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, f2, 1, null), Dp.m8401constructorimpl(1), m5656copywmQWz5c$default, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), bringIntoViewRequester), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit TextInputPill_g5ZjG94$lambda$2;
                                    TextInputPill_g5ZjG94$lambda$2 = TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(CoroutineScope.this, bringIntoViewRequester, (FocusState) obj);
                                    return TextInputPill_g5ZjG94$lambda$2;
                                }
                            }), z12, false, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-712506390, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i41) {
                                    if ((i41 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        TextKt.m3581TextNvy7gAk(str7, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer3, 0, 0, 131070);
                                    }
                                }
                            }, startRestartGroup, 54), function24, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(583948524, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i41) {
                                    if ((i41 & 11) != 2 || !composer3.getSkipping()) {
                                        if (z9) {
                                            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_attribute_verified_tick, composer3, 0), "Looks good!", SizeKt.m889size3ABfNKs(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), Dp.m8401constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12149getActive0d7_KjU(), composer3, 440, 0);
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, new KeyboardOptions(0, (Boolean) null, i37, i38, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null), new KeyboardActions(null, null, function14, null, null, null, 59, null), z8, i26, 0, (MutableInteractionSource) null, (Shape) IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), TextFieldColors.m3484copyejIjP34$default(TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6), 0L, 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12155getBubbleBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), j, 0L, null, Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -14837, 2047, null), composer2, i39, i40, 0, 1604688);
                            z5 = z12;
                            function22 = function24;
                            str4 = str8;
                            z6 = z8;
                            i27 = i26;
                            i28 = i37;
                            i29 = i38;
                            function12 = function14;
                            str5 = str7;
                            f3 = f2;
                            z7 = z11;
                            color3 = color4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            str4 = str;
                            function12 = function1;
                            i28 = i2;
                            z5 = z3;
                            f3 = f;
                            composer2 = startRestartGroup;
                            color3 = color2;
                            i27 = i10;
                            z6 = z4;
                            str5 = str3;
                            i29 = i3;
                            z7 = z2;
                            function22 = function2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit TextInputPill_g5ZjG94$lambda$3;
                                    TextInputPill_g5ZjG94$lambda$3 = TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str4, str5, onTextChanged, color3, j, i27, z6, function12, i28, i29, z7, function22, z5, f3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                    return TextInputPill_g5ZjG94$lambda$3;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i16 = i15;
                    i17 = i6 & 1024;
                    if (i17 != 0) {
                    }
                    i20 = i6 & 2048;
                    if (i20 != 0) {
                    }
                    int i322 = i19;
                    i22 = i6 & 4096;
                    if (i22 != 0) {
                    }
                    i24 = i6 & 8192;
                    if (i24 != 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    if (i30 != 0) {
                    }
                    if (i31 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    startRestartGroup.startReplaceGroup(-652105429);
                    int i352 = i25;
                    String str82 = str6;
                    long m5656copywmQWz5c$default2 = color4 == null ? Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : color4.m5667unboximpl();
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-652099794);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    int i362 = i7;
                    Function1<? super KeyboardActionScope, Unit> function142 = function13;
                    int i372 = m8078getTextPjHm6EE;
                    int i382 = m8017getDefaulteUduSuo;
                    int i392 = 817889280 | (i362 & 14) | ((i362 >> 3) & 112) | ((i352 << 3) & 7168) | ((i352 << 21) & 234881024);
                    int i402 = ((i362 << 3) & 29360128) | ((i362 << 9) & 234881024);
                    composer2 = startRestartGroup;
                    boolean z112 = z9;
                    Function2<? super Composer, ? super Integer, Unit> function242 = function23;
                    boolean z122 = z10;
                    TextFieldKt.TextField(str82, onTextChanged, FocusEventModifierKt.onFocusEvent(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clip(BorderKt.m274borderxT4_qwU(SizeKt.m874defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, f2, 1, null), Dp.m8401constructorimpl(1), m5656copywmQWz5c$default2, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), bringIntoViewRequester2), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit TextInputPill_g5ZjG94$lambda$2;
                            TextInputPill_g5ZjG94$lambda$2 = TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(CoroutineScope.this, bringIntoViewRequester2, (FocusState) obj);
                            return TextInputPill_g5ZjG94$lambda$2;
                        }
                    }), z122, false, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-712506390, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i41) {
                            if ((i41 & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                TextKt.m3581TextNvy7gAk(str7, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer3, 0, 0, 131070);
                            }
                        }
                    }, startRestartGroup, 54), function242, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(583948524, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i41) {
                            if ((i41 & 11) != 2 || !composer3.getSkipping()) {
                                if (z9) {
                                    IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_attribute_verified_tick, composer3, 0), "Looks good!", SizeKt.m889size3ABfNKs(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), Dp.m8401constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12149getActive0d7_KjU(), composer3, 440, 0);
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, new KeyboardOptions(0, (Boolean) null, i372, i382, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null), new KeyboardActions(null, null, function142, null, null, null, 59, null), z8, i26, 0, (MutableInteractionSource) null, (Shape) IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), TextFieldColors.m3484copyejIjP34$default(TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6), 0L, 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12155getBubbleBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), j, 0L, null, Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -14837, 2047, null), composer2, i392, i402, 0, 1604688);
                    z5 = z122;
                    function22 = function242;
                    str4 = str82;
                    z6 = z8;
                    i27 = i26;
                    i28 = i372;
                    i29 = i382;
                    function12 = function142;
                    str5 = str7;
                    f3 = f2;
                    z7 = z112;
                    color3 = color4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i13;
                i15 = i6 & 512;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i6 & 1024;
                if (i17 != 0) {
                }
                i20 = i6 & 2048;
                if (i20 != 0) {
                }
                int i3222 = i19;
                i22 = i6 & 4096;
                if (i22 != 0) {
                }
                i24 = i6 & 8192;
                if (i24 != 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                if (i30 != 0) {
                }
                if (i31 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i14 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if (i24 != 0) {
                }
                startRestartGroup.startReplaceGroup(-652105429);
                int i3522 = i25;
                String str822 = str6;
                long m5656copywmQWz5c$default22 = color4 == null ? Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : color4.m5667unboximpl();
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-652099794);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final BringIntoViewRequester bringIntoViewRequester22 = (BringIntoViewRequester) rememberedValue;
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i3622 = i7;
                Function1<? super KeyboardActionScope, Unit> function1422 = function13;
                int i3722 = m8078getTextPjHm6EE;
                int i3822 = m8017getDefaulteUduSuo;
                int i3922 = 817889280 | (i3622 & 14) | ((i3622 >> 3) & 112) | ((i3522 << 3) & 7168) | ((i3522 << 21) & 234881024);
                int i4022 = ((i3622 << 3) & 29360128) | ((i3622 << 9) & 234881024);
                composer2 = startRestartGroup;
                boolean z1122 = z9;
                Function2<? super Composer, ? super Integer, Unit> function2422 = function23;
                boolean z1222 = z10;
                TextFieldKt.TextField(str822, onTextChanged, FocusEventModifierKt.onFocusEvent(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clip(BorderKt.m274borderxT4_qwU(SizeKt.m874defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, f2, 1, null), Dp.m8401constructorimpl(1), m5656copywmQWz5c$default22, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), bringIntoViewRequester22), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit TextInputPill_g5ZjG94$lambda$2;
                        TextInputPill_g5ZjG94$lambda$2 = TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(CoroutineScope.this, bringIntoViewRequester22, (FocusState) obj);
                        return TextInputPill_g5ZjG94$lambda$2;
                    }
                }), z1222, false, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-712506390, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i41) {
                        if ((i41 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                        } else {
                            TextKt.m3581TextNvy7gAk(str7, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer3, 0, 0, 131070);
                        }
                    }
                }, startRestartGroup, 54), function2422, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(583948524, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i41) {
                        if ((i41 & 11) != 2 || !composer3.getSkipping()) {
                            if (z9) {
                                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_attribute_verified_tick, composer3, 0), "Looks good!", SizeKt.m889size3ABfNKs(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), Dp.m8401constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12149getActive0d7_KjU(), composer3, 440, 0);
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, new KeyboardOptions(0, (Boolean) null, i3722, i3822, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null), new KeyboardActions(null, null, function1422, null, null, null, 59, null), z8, i26, 0, (MutableInteractionSource) null, (Shape) IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), TextFieldColors.m3484copyejIjP34$default(TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6), 0L, 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12155getBubbleBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), j, 0L, null, Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -14837, 2047, null), composer2, i3922, i4022, 0, 1604688);
                z5 = z1222;
                function22 = function2422;
                str4 = str822;
                z6 = z8;
                i27 = i26;
                i28 = i3722;
                i29 = i3822;
                function12 = function1422;
                str5 = str7;
                f3 = f2;
                z7 = z1122;
                color3 = color4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            color2 = color;
            if ((i6 & 16) != 0) {
            }
            i9 = i6 & 32;
            if (i9 != 0) {
            }
            i11 = i6 & 64;
            if (i11 != 0) {
            }
            i12 = i6 & 128;
            if (i12 != 0) {
            }
            i13 = i6 & 256;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i6 & 512;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i6 & 1024;
            if (i17 != 0) {
            }
            i20 = i6 & 2048;
            if (i20 != 0) {
            }
            int i32222 = i19;
            i22 = i6 & 4096;
            if (i22 != 0) {
            }
            i24 = i6 & 8192;
            if (i24 != 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
            }
            if (i30 != 0) {
            }
            if (i31 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if (i24 != 0) {
            }
            startRestartGroup.startReplaceGroup(-652105429);
            int i35222 = i25;
            String str8222 = str6;
            long m5656copywmQWz5c$default222 = color4 == null ? Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : color4.m5667unboximpl();
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-652099794);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final BringIntoViewRequester bringIntoViewRequester222 = (BringIntoViewRequester) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final CoroutineScope coroutineScope222 = (CoroutineScope) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i36222 = i7;
            Function1<? super KeyboardActionScope, Unit> function14222 = function13;
            int i37222 = m8078getTextPjHm6EE;
            int i38222 = m8017getDefaulteUduSuo;
            int i39222 = 817889280 | (i36222 & 14) | ((i36222 >> 3) & 112) | ((i35222 << 3) & 7168) | ((i35222 << 21) & 234881024);
            int i40222 = ((i36222 << 3) & 29360128) | ((i36222 << 9) & 234881024);
            composer2 = startRestartGroup;
            boolean z11222 = z9;
            Function2<? super Composer, ? super Integer, Unit> function24222 = function23;
            boolean z12222 = z10;
            TextFieldKt.TextField(str8222, onTextChanged, FocusEventModifierKt.onFocusEvent(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clip(BorderKt.m274borderxT4_qwU(SizeKt.m874defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, f2, 1, null), Dp.m8401constructorimpl(1), m5656copywmQWz5c$default222, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), bringIntoViewRequester222), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit TextInputPill_g5ZjG94$lambda$2;
                    TextInputPill_g5ZjG94$lambda$2 = TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(CoroutineScope.this, bringIntoViewRequester222, (FocusState) obj);
                    return TextInputPill_g5ZjG94$lambda$2;
                }
            }), z12222, false, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-712506390, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i41) {
                    if ((i41 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        TextKt.m3581TextNvy7gAk(str7, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer3, 0, 0, 131070);
                    }
                }
            }, startRestartGroup, 54), function24222, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(583948524, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i41) {
                    if ((i41 & 11) != 2 || !composer3.getSkipping()) {
                        if (z9) {
                            IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_attribute_verified_tick, composer3, 0), "Looks good!", SizeKt.m889size3ABfNKs(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), Dp.m8401constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12149getActive0d7_KjU(), composer3, 440, 0);
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, new KeyboardOptions(0, (Boolean) null, i37222, i38222, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null), new KeyboardActions(null, null, function14222, null, null, null, 59, null), z8, i26, 0, (MutableInteractionSource) null, (Shape) IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), TextFieldColors.m3484copyejIjP34$default(TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6), 0L, 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12155getBubbleBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), j, 0L, null, Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -14837, 2047, null), composer2, i39222, i40222, 0, 1604688);
            z5 = z12222;
            function22 = function24222;
            str4 = str8222;
            z6 = z8;
            i27 = i26;
            i28 = i37222;
            i29 = i38222;
            function12 = function14222;
            str5 = str7;
            f3 = f2;
            z7 = z11222;
            color3 = color4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str2;
        if ((i6 & 4) == 0) {
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        color2 = color;
        if ((i6 & 16) != 0) {
        }
        i9 = i6 & 32;
        if (i9 != 0) {
        }
        i11 = i6 & 64;
        if (i11 != 0) {
        }
        i12 = i6 & 128;
        if (i12 != 0) {
        }
        i13 = i6 & 256;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i6 & 512;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i6 & 1024;
        if (i17 != 0) {
        }
        i20 = i6 & 2048;
        if (i20 != 0) {
        }
        int i322222 = i19;
        i22 = i6 & 4096;
        if (i22 != 0) {
        }
        i24 = i6 & 8192;
        if (i24 != 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        if (i30 != 0) {
        }
        if (i31 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if (i24 != 0) {
        }
        startRestartGroup.startReplaceGroup(-652105429);
        int i352222 = i25;
        String str82222 = str6;
        long m5656copywmQWz5c$default2222 = color4 == null ? Color.m5656copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null) : color4.m5667unboximpl();
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-652099794);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final BringIntoViewRequester bringIntoViewRequester2222 = (BringIntoViewRequester) rememberedValue;
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final CoroutineScope coroutineScope2222 = (CoroutineScope) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i362222 = i7;
        Function1<? super KeyboardActionScope, Unit> function142222 = function13;
        int i372222 = m8078getTextPjHm6EE;
        int i382222 = m8017getDefaulteUduSuo;
        int i392222 = 817889280 | (i362222 & 14) | ((i362222 >> 3) & 112) | ((i352222 << 3) & 7168) | ((i352222 << 21) & 234881024);
        int i402222 = ((i362222 << 3) & 29360128) | ((i362222 << 9) & 234881024);
        composer2 = startRestartGroup;
        boolean z112222 = z9;
        Function2<? super Composer, ? super Integer, Unit> function242222 = function23;
        boolean z122222 = z10;
        TextFieldKt.TextField(str82222, onTextChanged, FocusEventModifierKt.onFocusEvent(BringIntoViewRequesterKt.bringIntoViewRequester(ClipKt.clip(BorderKt.m274borderxT4_qwU(SizeKt.m874defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, f2, 1, null), Dp.m8401constructorimpl(1), m5656copywmQWz5c$default2222, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall()), bringIntoViewRequester2222), new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TextInputPill_g5ZjG94$lambda$2;
                TextInputPill_g5ZjG94$lambda$2 = TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(CoroutineScope.this, bringIntoViewRequester2222, (FocusState) obj);
                return TextInputPill_g5ZjG94$lambda$2;
            }
        }), z122222, false, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-712506390, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i41) {
                if ((i41 & 11) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    TextKt.m3581TextNvy7gAk(str7, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer3, 0, 0, 131070);
                }
            }
        }, startRestartGroup, 54), function242222, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(583948524, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i41) {
                if ((i41 & 11) != 2 || !composer3.getSkipping()) {
                    if (z9) {
                        IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_attribute_verified_tick, composer3, 0), "Looks good!", SizeKt.m889size3ABfNKs(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(16)), Dp.m8401constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m12149getActive0d7_KjU(), composer3, 440, 0);
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, new KeyboardOptions(0, (Boolean) null, i372222, i382222, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null), new KeyboardActions(null, null, function142222, null, null, null, 59, null), z8, i26, 0, (MutableInteractionSource) null, (Shape) IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), TextFieldColors.m3484copyejIjP34$default(TextFieldDefaults.INSTANCE.colors(startRestartGroup, 6), 0L, 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12155getBubbleBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12166getInputAlt0d7_KjU(), j, 0L, null, Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), Color.INSTANCE.m5692getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -14837, 2047, null), composer2, i392222, i402222, 0, 1604688);
        z5 = z122222;
        function22 = function242222;
        str4 = str82222;
        z6 = z8;
        i27 = i26;
        i28 = i372222;
        i29 = i382222;
        function12 = function142222;
        str5 = str7;
        f3 = f2;
        z7 = z112222;
        color3 = color4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputPill_g5ZjG94$lambda$2(CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester, FocusState it) {
        Intrinsics.checkNotNullParameter(coroutineScope, "$coroutineScope");
        Intrinsics.checkNotNullParameter(bringIntoViewRequester, "$bringIntoViewRequester");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isFocused()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TextInputPillKt$TextInputPill$2$1(bringIntoViewRequester, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final void TextInputPillPlaceholder(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1437391364);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m11852getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextInputPillPlaceholder$lambda$4;
                    TextInputPillPlaceholder$lambda$4 = TextInputPillKt.TextInputPillPlaceholder$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextInputPillPlaceholder$lambda$4;
                }
            });
        }
    }

    public static final void TextInputPillUnchecked(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-869352961);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m11853getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextInputPillUnchecked$lambda$5;
                    TextInputPillUnchecked$lambda$5 = TextInputPillKt.TextInputPillUnchecked$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextInputPillUnchecked$lambda$5;
                }
            });
        }
    }

    public static final void TextInputPillValidated(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(559292703);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m11854getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextInputPillValidated$lambda$6;
                    TextInputPillValidated$lambda$6 = TextInputPillKt.TextInputPillValidated$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextInputPillValidated$lambda$6;
                }
            });
        }
    }

    public static final void TextInputPillError(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-175520743);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m11855getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextInputPillError$lambda$7;
                    TextInputPillError$lambda$7 = TextInputPillKt.TextInputPillError$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextInputPillError$lambda$7;
                }
            });
        }
    }

    public static final void TextInputPillDisabled(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1100722979);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m11856getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TextInputPillDisabled$lambda$8;
                    TextInputPillDisabled$lambda$8 = TextInputPillKt.TextInputPillDisabled$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TextInputPillDisabled$lambda$8;
                }
            });
        }
    }
}
