package com.composeunstyled;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.common.C;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferStatusCodes;
import com.reactcommunity.rndatetimepicker.Common;
import io.branch.referral.BranchError;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001aÏ\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010.\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u000202H\u0007¢\u0006\u0004\b3\u00104\u001a\u0083\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u00107\u001a\u00020\u001f2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u00108\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u00109\u001a\u00020\u00122\u001c\u0010:\u001a\u0018\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u000e¢\u0006\u0002\b<H\u0007¢\u0006\u0004\b=\u0010>\u001a \u0001\u0010?\u001a\u00020\u0001*\u00020;2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010A\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010B\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u00101\u001a\u000202H\u0007¢\u0006\u0004\bC\u0010D¨\u0006E²\u0006\n\u0010F\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010G\u001a\u00020HX\u008a\u008e\u0002²\u0006\n\u0010I\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010J\u001a\u00020KX\u008a\u0084\u0002²\u0006\n\u0010G\u001a\u00020HX\u008a\u008e\u0002²\u0006\n\u0010J\u001a\u00020KX\u008a\u0084\u0002"}, d2 = {"TextField", "", "value", "", "onValueChange", "Lkotlin/Function1;", "editable", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "leadingIcon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "trailingIcon", ReactTextInputShadowNode.PROP_PLACEHOLDER, "contentColor", "Landroidx/compose/ui/graphics/Color;", "disabledColor", "backgroundColor", ViewProps.BORDER_WIDTH, "Landroidx/compose/ui/unit/Dp;", ViewProps.BORDER_COLOR, "shape", "Landroidx/compose/ui/graphics/Shape;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "singleLine", "minLines", "", "maxLines", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "spacing", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "TextField-RM0IcR4", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/lang/String;JJJFJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;IJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;ZIILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/interaction/MutableInteractionSource;FLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;IIII)V", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", ViewProps.LINE_HEIGHT, ViewProps.LETTER_SPACING, Common.TEXT_COLOR, "content", "Lcom/composeunstyled/TextFieldScope;", "Lkotlin/ExtensionFunctionType;", "TextField-PNcJ320", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/text/TextStyle;IJJJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;ZIILandroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "TextInput", "label", "leading", "trailing", "TextInput-pfExLkk", "(Lcom/composeunstyled/TextFieldScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/layout/PaddingValues;JLjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;III)V", "core_release", "wasEditable", "textRange", "Landroidx/compose/ui/text/TextRange;", "isFocusedOnIcon", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextFieldKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField_PNcJ320$lambda$26(String str, Function1 function1, Modifier modifier, boolean z, Brush brush, TextStyle textStyle, int i, long j, long j2, long j3, FontWeight fontWeight, FontFamily fontFamily, boolean z2, int i2, int i3, KeyboardActions keyboardActions, KeyboardOptions keyboardOptions, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, long j4, Function3 function3, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        m9547TextFieldPNcJ320(str, function1, modifier, z, brush, textStyle, i, j, j2, j3, fontWeight, fontFamily, z2, i2, i3, keyboardActions, keyboardOptions, visualTransformation, mutableInteractionSource, j4, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField_RM0IcR4$lambda$18(String str, Function1 function1, boolean z, Modifier modifier, PaddingValues paddingValues, Function2 function2, Function2 function22, String str2, long j, long j2, long j3, float f, long j4, Shape shape, TextStyle textStyle, int i, long j5, FontWeight fontWeight, FontFamily fontFamily, boolean z2, int i2, int i3, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, MutableInteractionSource mutableInteractionSource, float f2, VisualTransformation visualTransformation, Alignment.Vertical vertical, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        m9548TextFieldRM0IcR4(str, function1, z, modifier, paddingValues, function2, function22, str2, j, j2, j3, f, j4, shape, textStyle, i, j5, fontWeight, fontFamily, z2, i2, i3, keyboardOptions, keyboardActions, mutableInteractionSource, f2, visualTransformation, vertical, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInput_pfExLkk$lambda$31(TextFieldScope textFieldScope, Modifier modifier, Shape shape, long j, PaddingValues paddingValues, long j2, String str, Function2 function2, Function2 function22, Function2 function23, Alignment.Vertical vertical, int i, int i2, int i3, Composer composer, int i4) {
        m9549TextInputpfExLkk(textFieldScope, modifier, shape, j, paddingValues, j2, str, function2, function22, function23, vertical, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ad  */
    @Deprecated(message = "Use the overload of TextField that provides slots for better styling capabilities")
    /* renamed from: TextField-RM0IcR4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9548TextFieldRM0IcR4(final String value, final Function1<? super String, Unit> onValueChange, boolean z, Modifier modifier, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, String str, long j, long j2, long j3, float f, long j4, Shape shape, TextStyle textStyle, int i, long j5, FontWeight fontWeight, FontFamily fontFamily, boolean z2, int i2, int i3, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, MutableInteractionSource mutableInteractionSource, float f2, VisualTransformation visualTransformation, Alignment.Vertical vertical, Composer composer, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        boolean z3;
        int i9;
        Modifier modifier2;
        int i10;
        PaddingValues paddingValues2;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i12;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i13;
        String str2;
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
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        long j6;
        long j7;
        long j8;
        long m5693getUnspecified0d7_KjU;
        float m8401constructorimpl;
        long m5693getUnspecified0d7_KjU2;
        Shape rectangleShape;
        String str3;
        TextStyle textStyle2;
        int i39;
        long m8606getUnspecifiedXSAIIZE;
        FontFamily fontFamily2;
        final boolean z4;
        int i40;
        int i41;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        VisualTransformation none;
        Alignment.Vertical centerVertically;
        long j9;
        int i42;
        float f3;
        FontWeight fontWeight2;
        int i43;
        TextStyle textStyle3;
        int i44;
        int i45;
        Composer composer2;
        Object rememberedValue;
        Object rememberedValue2;
        MutableState mutableState;
        Object rememberedValue3;
        MutableState mutableState2;
        boolean z5;
        TextStyle textStyle4;
        final String str4;
        final MutableState mutableState3;
        int i46;
        TextFieldKt$TextField$1$1 textFieldKt$TextField$1$1;
        String str5;
        FontWeight fontWeight3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        boolean z6;
        float f4;
        Alignment.Vertical vertical2;
        long j10;
        Shape shape2;
        long j11;
        MutableInteractionSource mutableInteractionSource3;
        long j12;
        Function2<? super Composer, ? super Integer, Unit> function26;
        final FontWeight fontWeight4;
        final Alignment.Vertical vertical3;
        final Modifier modifier3;
        final PaddingValues paddingValues3;
        float f5;
        final long j13;
        final MutableInteractionSource mutableInteractionSource4;
        final VisualTransformation visualTransformation2;
        final KeyboardActions keyboardActions3;
        final FontFamily fontFamily3;
        final int i47;
        final long j14;
        final int i48;
        final KeyboardOptions keyboardOptions3;
        final TextStyle textStyle5;
        final int i49;
        final String str6;
        final float f6;
        final Shape shape3;
        final long j15;
        final long j16;
        final long j17;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        ScopeUpdateScope endRestartGroup;
        int i50;
        int i51;
        int i52;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(1028492947);
        if ((i7 & 1) != 0) {
            i8 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i8 = (startRestartGroup.changed(value) ? 4 : 2) | i4;
        } else {
            i8 = i4;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i4 & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i53 = i7 & 4;
        if (i53 != 0) {
            i8 |= 384;
        } else if ((i4 & 384) == 0) {
            z3 = z;
            i8 |= startRestartGroup.changed(z3) ? 256 : 128;
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else if ((i4 & 3072) == 0) {
                modifier2 = modifier;
                i8 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    paddingValues2 = paddingValues;
                    i8 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function23 = function2;
                    } else {
                        function23 = function2;
                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i8 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                        }
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                        function24 = function22;
                    } else {
                        function24 = function22;
                        if ((i4 & 1572864) == 0) {
                            i8 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
                        }
                    }
                    i13 = i7 & 128;
                    if (i13 == 0) {
                        i8 |= 12582912;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i4 & 12582912) == 0) {
                            i8 |= startRestartGroup.changed(str2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i4 & 100663296) == 0) {
                        if ((i7 & 256) == 0 && startRestartGroup.changed(j)) {
                            i52 = 67108864;
                            i8 |= i52;
                        }
                        i52 = 33554432;
                        i8 |= i52;
                    }
                    if ((i4 & 805306368) == 0) {
                        if ((i7 & 512) == 0 && startRestartGroup.changed(j2)) {
                            i51 = C.BUFFER_FLAG_LAST_SAMPLE;
                            i8 |= i51;
                        }
                        i51 = 268435456;
                        i8 |= i51;
                    }
                    i14 = i7 & 1024;
                    if (i14 == 0) {
                        i15 = i14;
                        i16 = i5 | 6;
                    } else {
                        i15 = i14;
                        if ((i5 & 6) == 0) {
                            i16 = i5 | (startRestartGroup.changed(j3) ? 4 : 2);
                        } else {
                            i16 = i5;
                        }
                    }
                    i17 = i7 & 2048;
                    if (i17 == 0) {
                        i16 |= 48;
                    } else if ((i5 & 48) == 0) {
                        i16 |= startRestartGroup.changed(f) ? 32 : 16;
                        int i54 = i16;
                        i18 = i7 & 4096;
                        if (i18 != 0) {
                            i20 = i54 | 384;
                            i19 = i18;
                        } else {
                            int i55 = i54;
                            i19 = i18;
                            if ((i5 & 384) == 0) {
                                i55 |= startRestartGroup.changed(j4) ? 256 : 128;
                            }
                            i20 = i55;
                        }
                        i21 = i7 & 8192;
                        if (i21 != 0) {
                            i22 = i20 | 3072;
                        } else {
                            i22 = i20;
                            if ((i5 & 3072) == 0) {
                                i22 |= startRestartGroup.changed(shape) ? 2048 : 1024;
                                if ((i5 & 24576) == 0) {
                                    if ((i7 & 16384) == 0 && startRestartGroup.changed(textStyle)) {
                                        i50 = 16384;
                                        i22 |= i50;
                                    }
                                    i50 = 8192;
                                    i22 |= i50;
                                }
                                if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i22 |= ((i7 & 32768) == 0 && startRestartGroup.changed(i)) ? 131072 : 65536;
                                }
                                i23 = i7 & 65536;
                                if (i23 == 0) {
                                    i22 |= 1572864;
                                } else if ((i5 & 1572864) == 0) {
                                    i24 = i21;
                                    i22 |= startRestartGroup.changed(j5) ? 1048576 : 524288;
                                    i25 = i7 & 131072;
                                    if (i25 != 0) {
                                        i22 |= 12582912;
                                    } else if ((i5 & 12582912) == 0) {
                                        i22 |= startRestartGroup.changed(fontWeight) ? 8388608 : 4194304;
                                    }
                                    i26 = 262144 & i7;
                                    if (i26 != 0) {
                                        i22 |= 100663296;
                                    } else if ((i5 & 100663296) == 0) {
                                        i22 |= startRestartGroup.changed(fontFamily) ? 67108864 : 33554432;
                                    }
                                    i27 = i7 & 524288;
                                    if (i27 != 0) {
                                        i22 |= 805306368;
                                    } else if ((i5 & 805306368) == 0) {
                                        i22 |= startRestartGroup.changed(z2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                    }
                                    i28 = i7 & 1048576;
                                    if (i28 != 0) {
                                        i29 = i6 | 6;
                                    } else if ((i6 & 6) == 0) {
                                        i29 = i6 | (startRestartGroup.changed(i2) ? 4 : 2);
                                    } else {
                                        i29 = i6;
                                    }
                                    if ((i6 & 48) == 0) {
                                        i29 |= ((i7 & 2097152) == 0 && startRestartGroup.changed(i3)) ? 32 : 16;
                                    }
                                    int i56 = i29;
                                    i30 = i7 & 4194304;
                                    if (i30 != 0) {
                                        i31 = i56 | 384;
                                    } else if ((i6 & 384) == 0) {
                                        i31 = i56 | (startRestartGroup.changed(keyboardOptions) ? 256 : 128);
                                    } else {
                                        i31 = i56;
                                    }
                                    i32 = i7 & 8388608;
                                    if (i32 != 0) {
                                        i33 = i31 | 3072;
                                    } else {
                                        int i57 = i31;
                                        if ((i6 & 3072) == 0) {
                                            i33 = i57 | (startRestartGroup.changed(keyboardActions) ? 2048 : 1024);
                                        } else {
                                            i33 = i57;
                                        }
                                    }
                                    i34 = i7 & 16777216;
                                    if (i34 != 0) {
                                        i35 = i33 | 24576;
                                    } else {
                                        i35 = i33;
                                        if ((i6 & 24576) == 0) {
                                            i35 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                                            i36 = i7 & 33554432;
                                            if (i36 == 0) {
                                                i35 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                            } else if ((i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                i35 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                                            }
                                            i37 = i7 & 67108864;
                                            if (i37 == 0) {
                                                i35 |= 1572864;
                                            } else if ((i6 & 1572864) == 0) {
                                                i35 |= startRestartGroup.changed(visualTransformation) ? 1048576 : 524288;
                                            }
                                            i38 = i7 & C.BUFFER_FLAG_FIRST_SAMPLE;
                                            if (i38 == 0) {
                                                i35 |= 12582912;
                                            } else if ((i6 & 12582912) == 0) {
                                                i35 |= startRestartGroup.changed(vertical) ? 8388608 : 4194304;
                                            }
                                            if ((i8 & 306783379) == 306783378 || (i22 & 306783379) != 306783378 || (i35 & 4793491) != 4793490 || !startRestartGroup.getSkipping()) {
                                                startRestartGroup.startDefaults();
                                                if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                    if (i53 != 0) {
                                                        z3 = true;
                                                    }
                                                    if (i9 != 0) {
                                                        modifier2 = Modifier.INSTANCE;
                                                    }
                                                    if (i10 != 0) {
                                                        paddingValues2 = UtilsKt.getNoPadding();
                                                    }
                                                    if (i11 != 0) {
                                                        function23 = null;
                                                    }
                                                    if (i12 != 0) {
                                                        function24 = null;
                                                    }
                                                    String str7 = i13 == 0 ? "" : str2;
                                                    if ((i7 & 256) == 0) {
                                                        ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                        Object consume = startRestartGroup.consume(localContentColor);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        j6 = ((Color) consume).m5667unboximpl();
                                                        i8 &= -234881025;
                                                    } else {
                                                        j6 = j;
                                                    }
                                                    if ((i7 & 512) == 0) {
                                                        long j18 = j6;
                                                        j8 = Color.m5656copywmQWz5c$default(j18, 0.66f, 0.0f, 0.0f, 0.0f, 14, null);
                                                        j7 = j18;
                                                        i8 &= -1879048193;
                                                    } else {
                                                        j7 = j6;
                                                        j8 = j2;
                                                    }
                                                    m5693getUnspecified0d7_KjU = i15 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
                                                    m8401constructorimpl = i17 == 0 ? Dp.m8401constructorimpl(1) : f;
                                                    m5693getUnspecified0d7_KjU2 = i19 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j4;
                                                    rectangleShape = i24 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                                    if ((i7 & 16384) == 0) {
                                                        ProvidableCompositionLocal<TextStyle> localTextStyle = UtilsKt.getLocalTextStyle();
                                                        str3 = str7;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                        Object consume2 = startRestartGroup.consume(localTextStyle);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        textStyle2 = (TextStyle) consume2;
                                                        i22 &= -57345;
                                                    } else {
                                                        str3 = str7;
                                                        textStyle2 = textStyle;
                                                    }
                                                    if ((32768 & i7) == 0) {
                                                        i39 = TextAlign.INSTANCE.m8263getUnspecifiede0LSkKk();
                                                        i22 &= -458753;
                                                    } else {
                                                        i39 = i;
                                                    }
                                                    m8606getUnspecifiedXSAIIZE = i23 == 0 ? TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE() : j5;
                                                    FontWeight fontWeight5 = i25 == 0 ? null : fontWeight;
                                                    fontFamily2 = i26 == 0 ? null : fontFamily;
                                                    z4 = i27 == 0 ? false : z2;
                                                    i40 = i28 == 0 ? 1 : i2;
                                                    if ((i7 & 2097152) == 0) {
                                                        i41 = z4 ? 1 : Integer.MAX_VALUE;
                                                        i35 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                                    } else {
                                                        i41 = i3;
                                                    }
                                                    keyboardOptions2 = i30 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                    keyboardActions2 = i32 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                    mutableInteractionSource2 = i34 == 0 ? null : mutableInteractionSource;
                                                    TextStyle textStyle6 = textStyle2;
                                                    float m8401constructorimpl2 = i36 == 0 ? Dp.m8401constructorimpl(8) : f2;
                                                    none = i37 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                    centerVertically = i38 == 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
                                                    j9 = j8;
                                                    i42 = i35;
                                                    str2 = str3;
                                                    f3 = m8401constructorimpl2;
                                                    fontWeight2 = fontWeight5;
                                                    i43 = i8;
                                                    textStyle3 = textStyle6;
                                                    i44 = i39;
                                                    i45 = i22;
                                                } else {
                                                    startRestartGroup.skipToGroupEnd();
                                                    if ((i7 & 256) != 0) {
                                                        i8 &= -234881025;
                                                    }
                                                    if ((i7 & 512) != 0) {
                                                        i8 &= -1879048193;
                                                    }
                                                    if ((i7 & 16384) != 0) {
                                                        i22 &= -57345;
                                                    }
                                                    if ((32768 & i7) != 0) {
                                                        i22 &= -458753;
                                                    }
                                                    if ((2097152 & i7) != 0) {
                                                        i35 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                                    }
                                                    j7 = j;
                                                    m5693getUnspecified0d7_KjU = j3;
                                                    m8401constructorimpl = f;
                                                    m5693getUnspecified0d7_KjU2 = j4;
                                                    rectangleShape = shape;
                                                    textStyle3 = textStyle;
                                                    m8606getUnspecifiedXSAIIZE = j5;
                                                    fontWeight2 = fontWeight;
                                                    fontFamily2 = fontFamily;
                                                    z4 = z2;
                                                    i40 = i2;
                                                    i41 = i3;
                                                    keyboardOptions2 = keyboardOptions;
                                                    keyboardActions2 = keyboardActions;
                                                    mutableInteractionSource2 = mutableInteractionSource;
                                                    none = visualTransformation;
                                                    centerVertically = vertical;
                                                    i43 = i8;
                                                    i42 = i35;
                                                    i45 = i22;
                                                    j9 = j2;
                                                    i44 = i;
                                                    f3 = f2;
                                                }
                                                startRestartGroup.endDefaults();
                                                TextStyle textStyle7 = textStyle3;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1028492947, i43, i45, "com.composeunstyled.TextField (TextField.kt:115)");
                                                }
                                                int i58 = i43 >> 15;
                                                int i59 = i45;
                                                int i60 = i59 >> 9;
                                                TextStyle m9558mergeThemedUwpzLow = TextKt.m9558mergeThemedUwpzLow(textStyle7, i44, m8606getUnspecifiedXSAIIZE, j7, fontWeight2, fontFamily2, 0L, 0L, startRestartGroup, (i58 & 7168) | ((i45 >> 12) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i60 & 57344) | (i60 & 458752), 96);
                                                composer2 = startRestartGroup;
                                                composer2.startReplaceGroup(1849434622);
                                                rememberedValue = composer2.rememberedValue();
                                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z3), null, 2, null);
                                                    composer2.updateRememberedValue(rememberedValue);
                                                }
                                                MutableState mutableState4 = (MutableState) rememberedValue;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(1849434622);
                                                rememberedValue2 = composer2.rememberedValue();
                                                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                                    mutableState = mutableState4;
                                                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m7823boximpl(TextRangeKt.TextRange(value.length(), value.length())), null, 2, null);
                                                    composer2.updateRememberedValue(rememberedValue2);
                                                } else {
                                                    mutableState = mutableState4;
                                                }
                                                MutableState mutableState5 = (MutableState) rememberedValue2;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(1849434622);
                                                rememberedValue3 = composer2.rememberedValue();
                                                if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                                    mutableState2 = mutableState5;
                                                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                                    composer2.updateRememberedValue(rememberedValue3);
                                                } else {
                                                    mutableState2 = mutableState5;
                                                }
                                                final MutableState mutableState6 = (MutableState) rememberedValue3;
                                                composer2.endReplaceGroup();
                                                Boolean valueOf = Boolean.valueOf(z3);
                                                composer2.startReplaceGroup(-1224400529);
                                                int i61 = i43;
                                                int i62 = i61 & 14;
                                                z5 = ((i43 & 896) != 256) | (i62 != 4);
                                                Object rememberedValue4 = composer2.rememberedValue();
                                                if (z5) {
                                                    textStyle4 = textStyle7;
                                                    if (rememberedValue4 != Composer.INSTANCE.getEmpty()) {
                                                        mutableState3 = mutableState2;
                                                        i46 = i44;
                                                        textFieldKt$TextField$1$1 = rememberedValue4;
                                                        str4 = value;
                                                        composer2.endReplaceGroup();
                                                        Function2<? super Composer, ? super Integer, Unit> function29 = function24;
                                                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) textFieldKt$TextField$1$1, composer2, (i61 >> 6) & 14);
                                                        if (z3) {
                                                            composer2.startReplaceGroup(-461192129);
                                                            composer2.startReplaceGroup(-1633490746);
                                                            boolean z7 = i62 == 4;
                                                            Object rememberedValue5 = composer2.rememberedValue();
                                                            if (z7 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue5 = new Function0() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda2
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        TextFieldValue TextField_RM0IcR4$lambda$11$lambda$10;
                                                                        TextField_RM0IcR4$lambda$11$lambda$10 = TextFieldKt.TextField_RM0IcR4$lambda$11$lambda$10(str4, mutableState3);
                                                                        return TextField_RM0IcR4$lambda$11$lambda$10;
                                                                    }
                                                                };
                                                                composer2.updateRememberedValue(rememberedValue5);
                                                            }
                                                            composer2.endReplaceGroup();
                                                            TextFieldValue TextField_RM0IcR4$lambda$12 = TextField_RM0IcR4$lambda$12(SnapshotStateKt.derivedStateOf((Function0) rememberedValue5));
                                                            composer2.startReplaceGroup(-1746271574);
                                                            boolean z8 = (i61 & 112) == 32;
                                                            Object rememberedValue6 = composer2.rememberedValue();
                                                            if (z8 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue6 = new Function1() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda3
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        Unit TextField_RM0IcR4$lambda$14$lambda$13;
                                                                        TextField_RM0IcR4$lambda$14$lambda$13 = TextFieldKt.TextField_RM0IcR4$lambda$14$lambda$13(Function1.this, mutableState6, mutableState3, (TextFieldValue) obj);
                                                                        return TextField_RM0IcR4$lambda$14$lambda$13;
                                                                    }
                                                                };
                                                                composer2.updateRememberedValue(rememberedValue6);
                                                            }
                                                            composer2.endReplaceGroup();
                                                            String str8 = str2;
                                                            Function2<? super Composer, ? super Integer, Unit> function210 = function23;
                                                            Shape shape4 = rectangleShape;
                                                            float f7 = f3;
                                                            Alignment.Vertical vertical4 = centerVertically;
                                                            long j19 = m5693getUnspecified0d7_KjU2;
                                                            long j20 = m5693getUnspecified0d7_KjU;
                                                            TextFieldKt$TextField$3 textFieldKt$TextField$3 = new TextFieldKt$TextField$3(f7, vertical4, m8401constructorimpl, j19, shape4, j20, z3, paddingValues2, function210, function29, mutableState6, str4, m9558mergeThemedUwpzLow, str8, i40, i41);
                                                            f4 = f7;
                                                            vertical2 = vertical4;
                                                            j10 = j19;
                                                            function25 = function210;
                                                            str5 = str8;
                                                            fontWeight3 = fontWeight2;
                                                            Modifier modifier4 = modifier2;
                                                            z6 = z3;
                                                            int i63 = i42 << 12;
                                                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                                                            BasicTextFieldKt.BasicTextField(TextField_RM0IcR4$lambda$12, (Function1<? super TextFieldValue, Unit>) rememberedValue6, modifier4, false, false, m9558mergeThemedUwpzLow, keyboardOptions2, keyboardActions2, z4, i41, i40, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1016516949, true, textFieldKt$TextField$3, composer2, 54), composer2, ((i61 >> 3) & 896) | (3670016 & i63) | (i63 & 29360128) | (234881024 & (i59 >> 3)) | ((i42 << 24) & 1879048192), (i42 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i42 >> 15) & 112) | ((i42 >> 3) & 7168), AccountTransferStatusCodes.SESSION_INACTIVE);
                                                            modifier2 = modifier4;
                                                            composer2.endReplaceGroup();
                                                            mutableInteractionSource3 = mutableInteractionSource5;
                                                            shape2 = shape4;
                                                            j11 = j20;
                                                            function26 = function29;
                                                            j12 = j9;
                                                        } else {
                                                            str5 = str2;
                                                            fontWeight3 = fontWeight2;
                                                            function25 = function23;
                                                            z6 = z3;
                                                            Shape shape5 = rectangleShape;
                                                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                                                            f4 = f3;
                                                            vertical2 = centerVertically;
                                                            j10 = m5693getUnspecified0d7_KjU2;
                                                            long j21 = m5693getUnspecified0d7_KjU;
                                                            composer2.startReplaceGroup(-458831014);
                                                            List createListBuilder = CollectionsKt.createListBuilder();
                                                            if (!Float.isNaN(m8401constructorimpl) && Dp.m8400compareTo0680j_4(m8401constructorimpl, Dp.m8401constructorimpl(0)) > 0 && j10 != 16) {
                                                                createListBuilder.add(BorderKt.m274borderxT4_qwU(Modifier.INSTANCE, m8401constructorimpl, j10, shape5));
                                                            }
                                                            createListBuilder.add(BackgroundKt.m261backgroundbw27NRU(Modifier.INSTANCE, j21, shape5));
                                                            List build = CollectionsKt.build(createListBuilder);
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            Intrinsics.checkNotNull(companion, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                                                            Modifier.Companion companion2 = companion;
                                                            Iterator it = build.iterator();
                                                            while (it.hasNext()) {
                                                                companion2 = companion2.then((Modifier) it.next());
                                                            }
                                                            shape2 = shape5;
                                                            j11 = j21;
                                                            Modifier then = modifier2.then(PaddingKt.padding(FocusableKt.focusable$default(SizeKt.m896widthInVpY3zN4$default(companion2, Dp.m8401constructorimpl(2), 0.0f, 2, null), false, mutableInteractionSource6, 1, null), paddingValues2));
                                                            Arrangement.HorizontalOrVertical m696spacedBy0680j_4 = Arrangement.INSTANCE.m696spacedBy0680j_4(f4);
                                                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m696spacedBy0680j_4, vertical2, composer2, (((i42 >> 15) & 896) >> 3) & 112);
                                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, then);
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            mutableInteractionSource3 = mutableInteractionSource6;
                                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                                                            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                            composer2.startReplaceGroup(876317921);
                                                            if (function25 != null) {
                                                                function25.invoke(composer2, Integer.valueOf(i58 & 14));
                                                            }
                                                            composer2.endReplaceGroup();
                                                            String str9 = value;
                                                            if (StringsKt.isBlank(str9)) {
                                                                str9 = str5;
                                                            }
                                                            long j22 = j9;
                                                            TextKt.m9556Text4CEPv18(str9, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), m9558mergeThemedUwpzLow, 0, 0L, 0L, 0L, null, j22, null, false, i40, i41, 0, composer2, (i61 >> 3) & 234881024, (i42 << 3) & 1008, 9976);
                                                            j12 = j22;
                                                            composer2.startReplaceGroup(876329795);
                                                            if (function29 != null) {
                                                                function26 = function29;
                                                                function26.invoke(composer2, Integer.valueOf((i61 >> 18) & 14));
                                                            } else {
                                                                function26 = function29;
                                                            }
                                                            composer2.endReplaceGroup();
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            composer2.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                            composer2.endReplaceGroup();
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        fontWeight4 = fontWeight3;
                                                        z3 = z6;
                                                        vertical3 = vertical2;
                                                        modifier3 = modifier2;
                                                        paddingValues3 = paddingValues2;
                                                        f5 = m8401constructorimpl;
                                                        j13 = j11;
                                                        mutableInteractionSource4 = mutableInteractionSource3;
                                                        visualTransformation2 = none;
                                                        keyboardActions3 = keyboardActions2;
                                                        fontFamily3 = fontFamily2;
                                                        i47 = i40;
                                                        j14 = m8606getUnspecifiedXSAIIZE;
                                                        i48 = i41;
                                                        keyboardOptions3 = keyboardOptions2;
                                                        textStyle5 = textStyle4;
                                                        i49 = i46;
                                                        str6 = str5;
                                                        f6 = f4;
                                                        shape3 = shape2;
                                                        j15 = j10;
                                                        j16 = j12;
                                                        j17 = j7;
                                                        function27 = function26;
                                                        function28 = function25;
                                                    }
                                                } else {
                                                    textStyle4 = textStyle7;
                                                }
                                                str4 = value;
                                                mutableState3 = mutableState2;
                                                i46 = i44;
                                                textFieldKt$TextField$1$1 = new TextFieldKt$TextField$1$1(z3, value, mutableState, mutableState2, null);
                                                composer2.updateRememberedValue(textFieldKt$TextField$1$1);
                                                composer2.endReplaceGroup();
                                                Function2<? super Composer, ? super Integer, Unit> function292 = function24;
                                                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) textFieldKt$TextField$1$1, composer2, (i61 >> 6) & 14);
                                                if (z3) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                fontWeight4 = fontWeight3;
                                                z3 = z6;
                                                vertical3 = vertical2;
                                                modifier3 = modifier2;
                                                paddingValues3 = paddingValues2;
                                                f5 = m8401constructorimpl;
                                                j13 = j11;
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                visualTransformation2 = none;
                                                keyboardActions3 = keyboardActions2;
                                                fontFamily3 = fontFamily2;
                                                i47 = i40;
                                                j14 = m8606getUnspecifiedXSAIIZE;
                                                i48 = i41;
                                                keyboardOptions3 = keyboardOptions2;
                                                textStyle5 = textStyle4;
                                                i49 = i46;
                                                str6 = str5;
                                                f6 = f4;
                                                shape3 = shape2;
                                                j15 = j10;
                                                j16 = j12;
                                                j17 = j7;
                                                function27 = function26;
                                                function28 = function25;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                f5 = f;
                                                j15 = j4;
                                                shape3 = shape;
                                                textStyle5 = textStyle;
                                                i49 = i;
                                                j14 = j5;
                                                fontWeight4 = fontWeight;
                                                fontFamily3 = fontFamily;
                                                z4 = z2;
                                                i47 = i2;
                                                i48 = i3;
                                                keyboardOptions3 = keyboardOptions;
                                                keyboardActions3 = keyboardActions;
                                                mutableInteractionSource4 = mutableInteractionSource;
                                                f6 = f2;
                                                visualTransformation2 = visualTransformation;
                                                vertical3 = vertical;
                                                composer2 = startRestartGroup;
                                                function27 = function24;
                                                str6 = str2;
                                                modifier3 = modifier2;
                                                function28 = function23;
                                                paddingValues3 = paddingValues2;
                                                j17 = j;
                                                j16 = j2;
                                                j13 = j3;
                                            }
                                            endRestartGroup = composer2.endRestartGroup();
                                            if (endRestartGroup == null) {
                                                final boolean z9 = z3;
                                                final float f8 = f5;
                                                endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        Unit TextField_RM0IcR4$lambda$18;
                                                        TextField_RM0IcR4$lambda$18 = TextFieldKt.TextField_RM0IcR4$lambda$18(value, onValueChange, z9, modifier3, paddingValues3, function28, function27, str6, j17, j16, j13, f8, j15, shape3, textStyle5, i49, j14, fontWeight4, fontFamily3, z4, i47, i48, keyboardOptions3, keyboardActions3, mutableInteractionSource4, f6, visualTransformation2, vertical3, i4, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                                                        return TextField_RM0IcR4$lambda$18;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    i36 = i7 & 33554432;
                                    if (i36 == 0) {
                                    }
                                    i37 = i7 & 67108864;
                                    if (i37 == 0) {
                                    }
                                    i38 = i7 & C.BUFFER_FLAG_FIRST_SAMPLE;
                                    if (i38 == 0) {
                                    }
                                    if ((i8 & 306783379) == 306783378) {
                                    }
                                    startRestartGroup.startDefaults();
                                    if ((i4 & 1) != 0) {
                                    }
                                    if (i53 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if ((i7 & 256) == 0) {
                                    }
                                    if ((i7 & 512) == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if ((i7 & 16384) == 0) {
                                    }
                                    if ((32768 & i7) == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (i27 == 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if ((i7 & 2097152) == 0) {
                                    }
                                    if (i30 == 0) {
                                    }
                                    if (i32 == 0) {
                                    }
                                    if (i34 == 0) {
                                    }
                                    TextStyle textStyle62 = textStyle2;
                                    if (i36 == 0) {
                                    }
                                    if (i37 == 0) {
                                    }
                                    if (i38 == 0) {
                                    }
                                    j9 = j8;
                                    i42 = i35;
                                    str2 = str3;
                                    f3 = m8401constructorimpl2;
                                    fontWeight2 = fontWeight5;
                                    i43 = i8;
                                    textStyle3 = textStyle62;
                                    i44 = i39;
                                    i45 = i22;
                                    startRestartGroup.endDefaults();
                                    TextStyle textStyle72 = textStyle3;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i582 = i43 >> 15;
                                    int i592 = i45;
                                    int i602 = i592 >> 9;
                                    TextStyle m9558mergeThemedUwpzLow2 = TextKt.m9558mergeThemedUwpzLow(textStyle72, i44, m8606getUnspecifiedXSAIIZE, j7, fontWeight2, fontFamily2, 0L, 0L, startRestartGroup, (i582 & 7168) | ((i45 >> 12) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i602 & 57344) | (i602 & 458752), 96);
                                    composer2 = startRestartGroup;
                                    composer2.startReplaceGroup(1849434622);
                                    rememberedValue = composer2.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableState mutableState42 = (MutableState) rememberedValue;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(1849434622);
                                    rememberedValue2 = composer2.rememberedValue();
                                    if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableState mutableState52 = (MutableState) rememberedValue2;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(1849434622);
                                    rememberedValue3 = composer2.rememberedValue();
                                    if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                    }
                                    final MutableState mutableState62 = (MutableState) rememberedValue3;
                                    composer2.endReplaceGroup();
                                    Boolean valueOf2 = Boolean.valueOf(z3);
                                    composer2.startReplaceGroup(-1224400529);
                                    int i612 = i43;
                                    int i622 = i612 & 14;
                                    z5 = ((i43 & 896) != 256) | (i622 != 4);
                                    Object rememberedValue42 = composer2.rememberedValue();
                                    if (z5) {
                                    }
                                    str4 = value;
                                    mutableState3 = mutableState2;
                                    i46 = i44;
                                    textFieldKt$TextField$1$1 = new TextFieldKt$TextField$1$1(z3, value, mutableState, mutableState2, null);
                                    composer2.updateRememberedValue(textFieldKt$TextField$1$1);
                                    composer2.endReplaceGroup();
                                    Function2<? super Composer, ? super Integer, Unit> function2922 = function24;
                                    EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) textFieldKt$TextField$1$1, composer2, (i612 >> 6) & 14);
                                    if (z3) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    fontWeight4 = fontWeight3;
                                    z3 = z6;
                                    vertical3 = vertical2;
                                    modifier3 = modifier2;
                                    paddingValues3 = paddingValues2;
                                    f5 = m8401constructorimpl;
                                    j13 = j11;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    visualTransformation2 = none;
                                    keyboardActions3 = keyboardActions2;
                                    fontFamily3 = fontFamily2;
                                    i47 = i40;
                                    j14 = m8606getUnspecifiedXSAIIZE;
                                    i48 = i41;
                                    keyboardOptions3 = keyboardOptions2;
                                    textStyle5 = textStyle4;
                                    i49 = i46;
                                    str6 = str5;
                                    f6 = f4;
                                    shape3 = shape2;
                                    j15 = j10;
                                    j16 = j12;
                                    j17 = j7;
                                    function27 = function26;
                                    function28 = function25;
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                    }
                                }
                                i24 = i21;
                                i25 = i7 & 131072;
                                if (i25 != 0) {
                                }
                                i26 = 262144 & i7;
                                if (i26 != 0) {
                                }
                                i27 = i7 & 524288;
                                if (i27 != 0) {
                                }
                                i28 = i7 & 1048576;
                                if (i28 != 0) {
                                }
                                if ((i6 & 48) == 0) {
                                }
                                int i562 = i29;
                                i30 = i7 & 4194304;
                                if (i30 != 0) {
                                }
                                i32 = i7 & 8388608;
                                if (i32 != 0) {
                                }
                                i34 = i7 & 16777216;
                                if (i34 != 0) {
                                }
                                i36 = i7 & 33554432;
                                if (i36 == 0) {
                                }
                                i37 = i7 & 67108864;
                                if (i37 == 0) {
                                }
                                i38 = i7 & C.BUFFER_FLAG_FIRST_SAMPLE;
                                if (i38 == 0) {
                                }
                                if ((i8 & 306783379) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i4 & 1) != 0) {
                                }
                                if (i53 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i12 != 0) {
                                }
                                if (i13 == 0) {
                                }
                                if ((i7 & 256) == 0) {
                                }
                                if ((i7 & 512) == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                if ((i7 & 16384) == 0) {
                                }
                                if ((32768 & i7) == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                if (i28 == 0) {
                                }
                                if ((i7 & 2097152) == 0) {
                                }
                                if (i30 == 0) {
                                }
                                if (i32 == 0) {
                                }
                                if (i34 == 0) {
                                }
                                TextStyle textStyle622 = textStyle2;
                                if (i36 == 0) {
                                }
                                if (i37 == 0) {
                                }
                                if (i38 == 0) {
                                }
                                j9 = j8;
                                i42 = i35;
                                str2 = str3;
                                f3 = m8401constructorimpl2;
                                fontWeight2 = fontWeight5;
                                i43 = i8;
                                textStyle3 = textStyle622;
                                i44 = i39;
                                i45 = i22;
                                startRestartGroup.endDefaults();
                                TextStyle textStyle722 = textStyle3;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i5822 = i43 >> 15;
                                int i5922 = i45;
                                int i6022 = i5922 >> 9;
                                TextStyle m9558mergeThemedUwpzLow22 = TextKt.m9558mergeThemedUwpzLow(textStyle722, i44, m8606getUnspecifiedXSAIIZE, j7, fontWeight2, fontFamily2, 0L, 0L, startRestartGroup, (i5822 & 7168) | ((i45 >> 12) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i6022 & 57344) | (i6022 & 458752), 96);
                                composer2 = startRestartGroup;
                                composer2.startReplaceGroup(1849434622);
                                rememberedValue = composer2.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableState mutableState422 = (MutableState) rememberedValue;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                rememberedValue2 = composer2.rememberedValue();
                                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                }
                                MutableState mutableState522 = (MutableState) rememberedValue2;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                rememberedValue3 = composer2.rememberedValue();
                                if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                }
                                final MutableState mutableState622 = (MutableState) rememberedValue3;
                                composer2.endReplaceGroup();
                                Boolean valueOf22 = Boolean.valueOf(z3);
                                composer2.startReplaceGroup(-1224400529);
                                int i6122 = i43;
                                int i6222 = i6122 & 14;
                                z5 = ((i43 & 896) != 256) | (i6222 != 4);
                                Object rememberedValue422 = composer2.rememberedValue();
                                if (z5) {
                                }
                                str4 = value;
                                mutableState3 = mutableState2;
                                i46 = i44;
                                textFieldKt$TextField$1$1 = new TextFieldKt$TextField$1$1(z3, value, mutableState, mutableState2, null);
                                composer2.updateRememberedValue(textFieldKt$TextField$1$1);
                                composer2.endReplaceGroup();
                                Function2<? super Composer, ? super Integer, Unit> function29222 = function24;
                                EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) textFieldKt$TextField$1$1, composer2, (i6122 >> 6) & 14);
                                if (z3) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                fontWeight4 = fontWeight3;
                                z3 = z6;
                                vertical3 = vertical2;
                                modifier3 = modifier2;
                                paddingValues3 = paddingValues2;
                                f5 = m8401constructorimpl;
                                j13 = j11;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                visualTransformation2 = none;
                                keyboardActions3 = keyboardActions2;
                                fontFamily3 = fontFamily2;
                                i47 = i40;
                                j14 = m8606getUnspecifiedXSAIIZE;
                                i48 = i41;
                                keyboardOptions3 = keyboardOptions2;
                                textStyle5 = textStyle4;
                                i49 = i46;
                                str6 = str5;
                                f6 = f4;
                                shape3 = shape2;
                                j15 = j10;
                                j16 = j12;
                                j17 = j7;
                                function27 = function26;
                                function28 = function25;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                        }
                        if ((i5 & 24576) == 0) {
                        }
                        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        i23 = i7 & 65536;
                        if (i23 == 0) {
                        }
                        i24 = i21;
                        i25 = i7 & 131072;
                        if (i25 != 0) {
                        }
                        i26 = 262144 & i7;
                        if (i26 != 0) {
                        }
                        i27 = i7 & 524288;
                        if (i27 != 0) {
                        }
                        i28 = i7 & 1048576;
                        if (i28 != 0) {
                        }
                        if ((i6 & 48) == 0) {
                        }
                        int i5622 = i29;
                        i30 = i7 & 4194304;
                        if (i30 != 0) {
                        }
                        i32 = i7 & 8388608;
                        if (i32 != 0) {
                        }
                        i34 = i7 & 16777216;
                        if (i34 != 0) {
                        }
                        i36 = i7 & 33554432;
                        if (i36 == 0) {
                        }
                        i37 = i7 & 67108864;
                        if (i37 == 0) {
                        }
                        i38 = i7 & C.BUFFER_FLAG_FIRST_SAMPLE;
                        if (i38 == 0) {
                        }
                        if ((i8 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i4 & 1) != 0) {
                        }
                        if (i53 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if ((i7 & 256) == 0) {
                        }
                        if ((i7 & 512) == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        if ((i7 & 16384) == 0) {
                        }
                        if ((32768 & i7) == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if (i26 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        if (i28 == 0) {
                        }
                        if ((i7 & 2097152) == 0) {
                        }
                        if (i30 == 0) {
                        }
                        if (i32 == 0) {
                        }
                        if (i34 == 0) {
                        }
                        TextStyle textStyle6222 = textStyle2;
                        if (i36 == 0) {
                        }
                        if (i37 == 0) {
                        }
                        if (i38 == 0) {
                        }
                        j9 = j8;
                        i42 = i35;
                        str2 = str3;
                        f3 = m8401constructorimpl2;
                        fontWeight2 = fontWeight5;
                        i43 = i8;
                        textStyle3 = textStyle6222;
                        i44 = i39;
                        i45 = i22;
                        startRestartGroup.endDefaults();
                        TextStyle textStyle7222 = textStyle3;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i58222 = i43 >> 15;
                        int i59222 = i45;
                        int i60222 = i59222 >> 9;
                        TextStyle m9558mergeThemedUwpzLow222 = TextKt.m9558mergeThemedUwpzLow(textStyle7222, i44, m8606getUnspecifiedXSAIIZE, j7, fontWeight2, fontFamily2, 0L, 0L, startRestartGroup, (i58222 & 7168) | ((i45 >> 12) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i60222 & 57344) | (i60222 & 458752), 96);
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(1849434622);
                        rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState4222 = (MutableState) rememberedValue;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        rememberedValue2 = composer2.rememberedValue();
                        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState5222 = (MutableState) rememberedValue2;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        rememberedValue3 = composer2.rememberedValue();
                        if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState mutableState6222 = (MutableState) rememberedValue3;
                        composer2.endReplaceGroup();
                        Boolean valueOf222 = Boolean.valueOf(z3);
                        composer2.startReplaceGroup(-1224400529);
                        int i61222 = i43;
                        int i62222 = i61222 & 14;
                        z5 = ((i43 & 896) != 256) | (i62222 != 4);
                        Object rememberedValue4222 = composer2.rememberedValue();
                        if (z5) {
                        }
                        str4 = value;
                        mutableState3 = mutableState2;
                        i46 = i44;
                        textFieldKt$TextField$1$1 = new TextFieldKt$TextField$1$1(z3, value, mutableState, mutableState2, null);
                        composer2.updateRememberedValue(textFieldKt$TextField$1$1);
                        composer2.endReplaceGroup();
                        Function2<? super Composer, ? super Integer, Unit> function292222 = function24;
                        EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) textFieldKt$TextField$1$1, composer2, (i61222 >> 6) & 14);
                        if (z3) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        fontWeight4 = fontWeight3;
                        z3 = z6;
                        vertical3 = vertical2;
                        modifier3 = modifier2;
                        paddingValues3 = paddingValues2;
                        f5 = m8401constructorimpl;
                        j13 = j11;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        visualTransformation2 = none;
                        keyboardActions3 = keyboardActions2;
                        fontFamily3 = fontFamily2;
                        i47 = i40;
                        j14 = m8606getUnspecifiedXSAIIZE;
                        i48 = i41;
                        keyboardOptions3 = keyboardOptions2;
                        textStyle5 = textStyle4;
                        i49 = i46;
                        str6 = str5;
                        f6 = f4;
                        shape3 = shape2;
                        j15 = j10;
                        j16 = j12;
                        j17 = j7;
                        function27 = function26;
                        function28 = function25;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    int i542 = i16;
                    i18 = i7 & 4096;
                    if (i18 != 0) {
                    }
                    i21 = i7 & 8192;
                    if (i21 != 0) {
                    }
                    if ((i5 & 24576) == 0) {
                    }
                    if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i23 = i7 & 65536;
                    if (i23 == 0) {
                    }
                    i24 = i21;
                    i25 = i7 & 131072;
                    if (i25 != 0) {
                    }
                    i26 = 262144 & i7;
                    if (i26 != 0) {
                    }
                    i27 = i7 & 524288;
                    if (i27 != 0) {
                    }
                    i28 = i7 & 1048576;
                    if (i28 != 0) {
                    }
                    if ((i6 & 48) == 0) {
                    }
                    int i56222 = i29;
                    i30 = i7 & 4194304;
                    if (i30 != 0) {
                    }
                    i32 = i7 & 8388608;
                    if (i32 != 0) {
                    }
                    i34 = i7 & 16777216;
                    if (i34 != 0) {
                    }
                    i36 = i7 & 33554432;
                    if (i36 == 0) {
                    }
                    i37 = i7 & 67108864;
                    if (i37 == 0) {
                    }
                    i38 = i7 & C.BUFFER_FLAG_FIRST_SAMPLE;
                    if (i38 == 0) {
                    }
                    if ((i8 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i4 & 1) != 0) {
                    }
                    if (i53 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if ((i7 & 256) == 0) {
                    }
                    if ((i7 & 512) == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    if ((i7 & 16384) == 0) {
                    }
                    if ((32768 & i7) == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if (i26 == 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i28 == 0) {
                    }
                    if ((i7 & 2097152) == 0) {
                    }
                    if (i30 == 0) {
                    }
                    if (i32 == 0) {
                    }
                    if (i34 == 0) {
                    }
                    TextStyle textStyle62222 = textStyle2;
                    if (i36 == 0) {
                    }
                    if (i37 == 0) {
                    }
                    if (i38 == 0) {
                    }
                    j9 = j8;
                    i42 = i35;
                    str2 = str3;
                    f3 = m8401constructorimpl2;
                    fontWeight2 = fontWeight5;
                    i43 = i8;
                    textStyle3 = textStyle62222;
                    i44 = i39;
                    i45 = i22;
                    startRestartGroup.endDefaults();
                    TextStyle textStyle72222 = textStyle3;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i582222 = i43 >> 15;
                    int i592222 = i45;
                    int i602222 = i592222 >> 9;
                    TextStyle m9558mergeThemedUwpzLow2222 = TextKt.m9558mergeThemedUwpzLow(textStyle72222, i44, m8606getUnspecifiedXSAIIZE, j7, fontWeight2, fontFamily2, 0L, 0L, startRestartGroup, (i582222 & 7168) | ((i45 >> 12) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i602222 & 57344) | (i602222 & 458752), 96);
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(1849434622);
                    rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState42222 = (MutableState) rememberedValue;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    rememberedValue2 = composer2.rememberedValue();
                    if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState52222 = (MutableState) rememberedValue2;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    rememberedValue3 = composer2.rememberedValue();
                    if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState62222 = (MutableState) rememberedValue3;
                    composer2.endReplaceGroup();
                    Boolean valueOf2222 = Boolean.valueOf(z3);
                    composer2.startReplaceGroup(-1224400529);
                    int i612222 = i43;
                    int i622222 = i612222 & 14;
                    z5 = ((i43 & 896) != 256) | (i622222 != 4);
                    Object rememberedValue42222 = composer2.rememberedValue();
                    if (z5) {
                    }
                    str4 = value;
                    mutableState3 = mutableState2;
                    i46 = i44;
                    textFieldKt$TextField$1$1 = new TextFieldKt$TextField$1$1(z3, value, mutableState, mutableState2, null);
                    composer2.updateRememberedValue(textFieldKt$TextField$1$1);
                    composer2.endReplaceGroup();
                    Function2<? super Composer, ? super Integer, Unit> function2922222 = function24;
                    EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) textFieldKt$TextField$1$1, composer2, (i612222 >> 6) & 14);
                    if (z3) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    fontWeight4 = fontWeight3;
                    z3 = z6;
                    vertical3 = vertical2;
                    modifier3 = modifier2;
                    paddingValues3 = paddingValues2;
                    f5 = m8401constructorimpl;
                    j13 = j11;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    visualTransformation2 = none;
                    keyboardActions3 = keyboardActions2;
                    fontFamily3 = fontFamily2;
                    i47 = i40;
                    j14 = m8606getUnspecifiedXSAIIZE;
                    i48 = i41;
                    keyboardOptions3 = keyboardOptions2;
                    textStyle5 = textStyle4;
                    i49 = i46;
                    str6 = str5;
                    f6 = f4;
                    shape3 = shape2;
                    j15 = j10;
                    j16 = j12;
                    j17 = j7;
                    function27 = function26;
                    function28 = function25;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                paddingValues2 = paddingValues;
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                i13 = i7 & 128;
                if (i13 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                i14 = i7 & 1024;
                if (i14 == 0) {
                }
                i17 = i7 & 2048;
                if (i17 == 0) {
                }
                int i5422 = i16;
                i18 = i7 & 4096;
                if (i18 != 0) {
                }
                i21 = i7 & 8192;
                if (i21 != 0) {
                }
                if ((i5 & 24576) == 0) {
                }
                if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i23 = i7 & 65536;
                if (i23 == 0) {
                }
                i24 = i21;
                i25 = i7 & 131072;
                if (i25 != 0) {
                }
                i26 = 262144 & i7;
                if (i26 != 0) {
                }
                i27 = i7 & 524288;
                if (i27 != 0) {
                }
                i28 = i7 & 1048576;
                if (i28 != 0) {
                }
                if ((i6 & 48) == 0) {
                }
                int i562222 = i29;
                i30 = i7 & 4194304;
                if (i30 != 0) {
                }
                i32 = i7 & 8388608;
                if (i32 != 0) {
                }
                i34 = i7 & 16777216;
                if (i34 != 0) {
                }
                i36 = i7 & 33554432;
                if (i36 == 0) {
                }
                i37 = i7 & 67108864;
                if (i37 == 0) {
                }
                i38 = i7 & C.BUFFER_FLAG_FIRST_SAMPLE;
                if (i38 == 0) {
                }
                if ((i8 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                }
                if (i53 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 == 0) {
                }
                if ((i7 & 256) == 0) {
                }
                if ((i7 & 512) == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i19 == 0) {
                }
                if (i24 == 0) {
                }
                if ((i7 & 16384) == 0) {
                }
                if ((32768 & i7) == 0) {
                }
                if (i23 == 0) {
                }
                if (i25 == 0) {
                }
                if (i26 == 0) {
                }
                if (i27 == 0) {
                }
                if (i28 == 0) {
                }
                if ((i7 & 2097152) == 0) {
                }
                if (i30 == 0) {
                }
                if (i32 == 0) {
                }
                if (i34 == 0) {
                }
                TextStyle textStyle622222 = textStyle2;
                if (i36 == 0) {
                }
                if (i37 == 0) {
                }
                if (i38 == 0) {
                }
                j9 = j8;
                i42 = i35;
                str2 = str3;
                f3 = m8401constructorimpl2;
                fontWeight2 = fontWeight5;
                i43 = i8;
                textStyle3 = textStyle622222;
                i44 = i39;
                i45 = i22;
                startRestartGroup.endDefaults();
                TextStyle textStyle722222 = textStyle3;
                if (ComposerKt.isTraceInProgress()) {
                }
                int i5822222 = i43 >> 15;
                int i5922222 = i45;
                int i6022222 = i5922222 >> 9;
                TextStyle m9558mergeThemedUwpzLow22222 = TextKt.m9558mergeThemedUwpzLow(textStyle722222, i44, m8606getUnspecifiedXSAIIZE, j7, fontWeight2, fontFamily2, 0L, 0L, startRestartGroup, (i5822222 & 7168) | ((i45 >> 12) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i6022222 & 57344) | (i6022222 & 458752), 96);
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(1849434622);
                rememberedValue = composer2.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState422222 = (MutableState) rememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                rememberedValue2 = composer2.rememberedValue();
                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState522222 = (MutableState) rememberedValue2;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                rememberedValue3 = composer2.rememberedValue();
                if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState622222 = (MutableState) rememberedValue3;
                composer2.endReplaceGroup();
                Boolean valueOf22222 = Boolean.valueOf(z3);
                composer2.startReplaceGroup(-1224400529);
                int i6122222 = i43;
                int i6222222 = i6122222 & 14;
                z5 = ((i43 & 896) != 256) | (i6222222 != 4);
                Object rememberedValue422222 = composer2.rememberedValue();
                if (z5) {
                }
                str4 = value;
                mutableState3 = mutableState2;
                i46 = i44;
                textFieldKt$TextField$1$1 = new TextFieldKt$TextField$1$1(z3, value, mutableState, mutableState2, null);
                composer2.updateRememberedValue(textFieldKt$TextField$1$1);
                composer2.endReplaceGroup();
                Function2<? super Composer, ? super Integer, Unit> function29222222 = function24;
                EffectsKt.LaunchedEffect(valueOf22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) textFieldKt$TextField$1$1, composer2, (i6122222 >> 6) & 14);
                if (z3) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                fontWeight4 = fontWeight3;
                z3 = z6;
                vertical3 = vertical2;
                modifier3 = modifier2;
                paddingValues3 = paddingValues2;
                f5 = m8401constructorimpl;
                j13 = j11;
                mutableInteractionSource4 = mutableInteractionSource3;
                visualTransformation2 = none;
                keyboardActions3 = keyboardActions2;
                fontFamily3 = fontFamily2;
                i47 = i40;
                j14 = m8606getUnspecifiedXSAIIZE;
                i48 = i41;
                keyboardOptions3 = keyboardOptions2;
                textStyle5 = textStyle4;
                i49 = i46;
                str6 = str5;
                f6 = f4;
                shape3 = shape2;
                j15 = j10;
                j16 = j12;
                j17 = j7;
                function27 = function26;
                function28 = function25;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            paddingValues2 = paddingValues;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            i13 = i7 & 128;
            if (i13 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            i14 = i7 & 1024;
            if (i14 == 0) {
            }
            i17 = i7 & 2048;
            if (i17 == 0) {
            }
            int i54222 = i16;
            i18 = i7 & 4096;
            if (i18 != 0) {
            }
            i21 = i7 & 8192;
            if (i21 != 0) {
            }
            if ((i5 & 24576) == 0) {
            }
            if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i23 = i7 & 65536;
            if (i23 == 0) {
            }
            i24 = i21;
            i25 = i7 & 131072;
            if (i25 != 0) {
            }
            i26 = 262144 & i7;
            if (i26 != 0) {
            }
            i27 = i7 & 524288;
            if (i27 != 0) {
            }
            i28 = i7 & 1048576;
            if (i28 != 0) {
            }
            if ((i6 & 48) == 0) {
            }
            int i5622222 = i29;
            i30 = i7 & 4194304;
            if (i30 != 0) {
            }
            i32 = i7 & 8388608;
            if (i32 != 0) {
            }
            i34 = i7 & 16777216;
            if (i34 != 0) {
            }
            i36 = i7 & 33554432;
            if (i36 == 0) {
            }
            i37 = i7 & 67108864;
            if (i37 == 0) {
            }
            i38 = i7 & C.BUFFER_FLAG_FIRST_SAMPLE;
            if (i38 == 0) {
            }
            if ((i8 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i4 & 1) != 0) {
            }
            if (i53 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 == 0) {
            }
            if ((i7 & 256) == 0) {
            }
            if ((i7 & 512) == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i19 == 0) {
            }
            if (i24 == 0) {
            }
            if ((i7 & 16384) == 0) {
            }
            if ((32768 & i7) == 0) {
            }
            if (i23 == 0) {
            }
            if (i25 == 0) {
            }
            if (i26 == 0) {
            }
            if (i27 == 0) {
            }
            if (i28 == 0) {
            }
            if ((i7 & 2097152) == 0) {
            }
            if (i30 == 0) {
            }
            if (i32 == 0) {
            }
            if (i34 == 0) {
            }
            TextStyle textStyle6222222 = textStyle2;
            if (i36 == 0) {
            }
            if (i37 == 0) {
            }
            if (i38 == 0) {
            }
            j9 = j8;
            i42 = i35;
            str2 = str3;
            f3 = m8401constructorimpl2;
            fontWeight2 = fontWeight5;
            i43 = i8;
            textStyle3 = textStyle6222222;
            i44 = i39;
            i45 = i22;
            startRestartGroup.endDefaults();
            TextStyle textStyle7222222 = textStyle3;
            if (ComposerKt.isTraceInProgress()) {
            }
            int i58222222 = i43 >> 15;
            int i59222222 = i45;
            int i60222222 = i59222222 >> 9;
            TextStyle m9558mergeThemedUwpzLow222222 = TextKt.m9558mergeThemedUwpzLow(textStyle7222222, i44, m8606getUnspecifiedXSAIIZE, j7, fontWeight2, fontFamily2, 0L, 0L, startRestartGroup, (i58222222 & 7168) | ((i45 >> 12) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i60222222 & 57344) | (i60222222 & 458752), 96);
            composer2 = startRestartGroup;
            composer2.startReplaceGroup(1849434622);
            rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState4222222 = (MutableState) rememberedValue;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            rememberedValue2 = composer2.rememberedValue();
            if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState5222222 = (MutableState) rememberedValue2;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            rememberedValue3 = composer2.rememberedValue();
            if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState6222222 = (MutableState) rememberedValue3;
            composer2.endReplaceGroup();
            Boolean valueOf222222 = Boolean.valueOf(z3);
            composer2.startReplaceGroup(-1224400529);
            int i61222222 = i43;
            int i62222222 = i61222222 & 14;
            z5 = ((i43 & 896) != 256) | (i62222222 != 4);
            Object rememberedValue4222222 = composer2.rememberedValue();
            if (z5) {
            }
            str4 = value;
            mutableState3 = mutableState2;
            i46 = i44;
            textFieldKt$TextField$1$1 = new TextFieldKt$TextField$1$1(z3, value, mutableState, mutableState2, null);
            composer2.updateRememberedValue(textFieldKt$TextField$1$1);
            composer2.endReplaceGroup();
            Function2<? super Composer, ? super Integer, Unit> function292222222 = function24;
            EffectsKt.LaunchedEffect(valueOf222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) textFieldKt$TextField$1$1, composer2, (i61222222 >> 6) & 14);
            if (z3) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fontWeight4 = fontWeight3;
            z3 = z6;
            vertical3 = vertical2;
            modifier3 = modifier2;
            paddingValues3 = paddingValues2;
            f5 = m8401constructorimpl;
            j13 = j11;
            mutableInteractionSource4 = mutableInteractionSource3;
            visualTransformation2 = none;
            keyboardActions3 = keyboardActions2;
            fontFamily3 = fontFamily2;
            i47 = i40;
            j14 = m8606getUnspecifiedXSAIIZE;
            i48 = i41;
            keyboardOptions3 = keyboardOptions2;
            textStyle5 = textStyle4;
            i49 = i46;
            str6 = str5;
            f6 = f4;
            shape3 = shape2;
            j15 = j10;
            j16 = j12;
            j17 = j7;
            function27 = function26;
            function28 = function25;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        modifier2 = modifier;
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        paddingValues2 = paddingValues;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        i13 = i7 & 128;
        if (i13 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        i14 = i7 & 1024;
        if (i14 == 0) {
        }
        i17 = i7 & 2048;
        if (i17 == 0) {
        }
        int i542222 = i16;
        i18 = i7 & 4096;
        if (i18 != 0) {
        }
        i21 = i7 & 8192;
        if (i21 != 0) {
        }
        if ((i5 & 24576) == 0) {
        }
        if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i23 = i7 & 65536;
        if (i23 == 0) {
        }
        i24 = i21;
        i25 = i7 & 131072;
        if (i25 != 0) {
        }
        i26 = 262144 & i7;
        if (i26 != 0) {
        }
        i27 = i7 & 524288;
        if (i27 != 0) {
        }
        i28 = i7 & 1048576;
        if (i28 != 0) {
        }
        if ((i6 & 48) == 0) {
        }
        int i56222222 = i29;
        i30 = i7 & 4194304;
        if (i30 != 0) {
        }
        i32 = i7 & 8388608;
        if (i32 != 0) {
        }
        i34 = i7 & 16777216;
        if (i34 != 0) {
        }
        i36 = i7 & 33554432;
        if (i36 == 0) {
        }
        i37 = i7 & 67108864;
        if (i37 == 0) {
        }
        i38 = i7 & C.BUFFER_FLAG_FIRST_SAMPLE;
        if (i38 == 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i53 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 == 0) {
        }
        if ((i7 & 256) == 0) {
        }
        if ((i7 & 512) == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i19 == 0) {
        }
        if (i24 == 0) {
        }
        if ((i7 & 16384) == 0) {
        }
        if ((32768 & i7) == 0) {
        }
        if (i23 == 0) {
        }
        if (i25 == 0) {
        }
        if (i26 == 0) {
        }
        if (i27 == 0) {
        }
        if (i28 == 0) {
        }
        if ((i7 & 2097152) == 0) {
        }
        if (i30 == 0) {
        }
        if (i32 == 0) {
        }
        if (i34 == 0) {
        }
        TextStyle textStyle62222222 = textStyle2;
        if (i36 == 0) {
        }
        if (i37 == 0) {
        }
        if (i38 == 0) {
        }
        j9 = j8;
        i42 = i35;
        str2 = str3;
        f3 = m8401constructorimpl2;
        fontWeight2 = fontWeight5;
        i43 = i8;
        textStyle3 = textStyle62222222;
        i44 = i39;
        i45 = i22;
        startRestartGroup.endDefaults();
        TextStyle textStyle72222222 = textStyle3;
        if (ComposerKt.isTraceInProgress()) {
        }
        int i582222222 = i43 >> 15;
        int i592222222 = i45;
        int i602222222 = i592222222 >> 9;
        TextStyle m9558mergeThemedUwpzLow2222222 = TextKt.m9558mergeThemedUwpzLow(textStyle72222222, i44, m8606getUnspecifiedXSAIIZE, j7, fontWeight2, fontFamily2, 0L, 0L, startRestartGroup, (i582222222 & 7168) | ((i45 >> 12) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i602222222 & 57344) | (i602222222 & 458752), 96);
        composer2 = startRestartGroup;
        composer2.startReplaceGroup(1849434622);
        rememberedValue = composer2.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState42222222 = (MutableState) rememberedValue;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1849434622);
        rememberedValue2 = composer2.rememberedValue();
        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState52222222 = (MutableState) rememberedValue2;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1849434622);
        rememberedValue3 = composer2.rememberedValue();
        if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState62222222 = (MutableState) rememberedValue3;
        composer2.endReplaceGroup();
        Boolean valueOf2222222 = Boolean.valueOf(z3);
        composer2.startReplaceGroup(-1224400529);
        int i612222222 = i43;
        int i622222222 = i612222222 & 14;
        z5 = ((i43 & 896) != 256) | (i622222222 != 4);
        Object rememberedValue42222222 = composer2.rememberedValue();
        if (z5) {
        }
        str4 = value;
        mutableState3 = mutableState2;
        i46 = i44;
        textFieldKt$TextField$1$1 = new TextFieldKt$TextField$1$1(z3, value, mutableState, mutableState2, null);
        composer2.updateRememberedValue(textFieldKt$TextField$1$1);
        composer2.endReplaceGroup();
        Function2<? super Composer, ? super Integer, Unit> function2922222222 = function24;
        EffectsKt.LaunchedEffect(valueOf2222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) textFieldKt$TextField$1$1, composer2, (i612222222 >> 6) & 14);
        if (z3) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        fontWeight4 = fontWeight3;
        z3 = z6;
        vertical3 = vertical2;
        modifier3 = modifier2;
        paddingValues3 = paddingValues2;
        f5 = m8401constructorimpl;
        j13 = j11;
        mutableInteractionSource4 = mutableInteractionSource3;
        visualTransformation2 = none;
        keyboardActions3 = keyboardActions2;
        fontFamily3 = fontFamily2;
        i47 = i40;
        j14 = m8606getUnspecifiedXSAIIZE;
        i48 = i41;
        keyboardOptions3 = keyboardOptions2;
        textStyle5 = textStyle4;
        i49 = i46;
        str6 = str5;
        f6 = f4;
        shape3 = shape2;
        j15 = j10;
        j16 = j12;
        j17 = j7;
        function27 = function26;
        function28 = function25;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TextField_RM0IcR4$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextField_RM0IcR4$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final long TextField_RM0IcR4$lambda$4(MutableState<TextRange> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextField_RM0IcR4$lambda$5(MutableState<TextRange> mutableState, long j) {
        mutableState.setValue(TextRange.m7823boximpl(j));
    }

    private static final boolean TextField_RM0IcR4$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextField_RM0IcR4$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TextField_RM0IcR4$lambda$11$lambda$10(String str, MutableState mutableState) {
        return new TextFieldValue(str, TextField_RM0IcR4$lambda$4(mutableState), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField_RM0IcR4$lambda$14$lambda$13(Function1 function1, MutableState mutableState, MutableState mutableState2, TextFieldValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!TextField_RM0IcR4$lambda$7(mutableState)) {
            function1.invoke(it.getText());
            TextField_RM0IcR4$lambda$5(mutableState2, it.getSelection());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0576  */
    /* renamed from: TextField-PNcJ320, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9547TextFieldPNcJ320(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, Brush brush, TextStyle textStyle, int i, long j, long j2, long j3, FontWeight fontWeight, FontFamily fontFamily, boolean z2, int i2, int i3, KeyboardActions keyboardActions, KeyboardOptions keyboardOptions, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, long j4, final Function3<? super TextFieldScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        boolean z3;
        int i10;
        Brush brush2;
        TextStyle textStyle2;
        int i11;
        int i12;
        int i13;
        long j5;
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
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        long m8606getUnspecifiedXSAIIZE;
        long m8606getUnspecifiedXSAIIZE2;
        FontFamily fontFamily2;
        final boolean z4;
        int i35;
        KeyboardActions keyboardActions2;
        KeyboardOptions keyboardOptions2;
        VisualTransformation none;
        MutableInteractionSource mutableInteractionSource2;
        long m5693getUnspecified0d7_KjU;
        FontWeight fontWeight2;
        long j6;
        int i36;
        int i37;
        int i38;
        int i39;
        Object rememberedValue;
        Composer composer2;
        Object rememberedValue2;
        TextFieldScope textFieldScope;
        boolean z5;
        Object rememberedValue3;
        final KeyboardActions keyboardActions3;
        final int i40;
        FontFamily fontFamily3;
        final boolean z6;
        final TextStyle textStyle3;
        final int i41;
        final MutableInteractionSource mutableInteractionSource3;
        final FontWeight fontWeight3;
        final long j7;
        final Brush brush3;
        final VisualTransformation visualTransformation2;
        final long j8;
        final long j9;
        final long j10;
        final KeyboardOptions keyboardOptions3;
        final int i42;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1476771151);
        if ((i7 & 1) != 0) {
            i8 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i8 = (startRestartGroup.changed(value) ? 4 : 2) | i4;
        } else {
            i8 = i4;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i4 & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i43 = i7 & 4;
        if (i43 != 0) {
            i8 |= 384;
        } else if ((i4 & 384) == 0) {
            modifier2 = modifier;
            i8 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else if ((i4 & 3072) == 0) {
                z3 = z;
                i8 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i10 = i7 & 16;
                int i44 = 8192;
                if (i10 != 0) {
                    i8 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    brush2 = brush;
                    i8 |= startRestartGroup.changed(brush2) ? 16384 : 8192;
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        textStyle2 = textStyle;
                        i8 |= ((i7 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    if ((i4 & 1572864) != 0) {
                        i11 = i;
                        i8 |= ((i7 & 64) == 0 && startRestartGroup.changed(i11)) ? 1048576 : 524288;
                    } else {
                        i11 = i;
                    }
                    i12 = i7 & 128;
                    if (i12 == 0) {
                        i8 |= 12582912;
                        i13 = i43;
                        j5 = j;
                    } else {
                        i13 = i43;
                        j5 = j;
                        if ((i4 & 12582912) == 0) {
                            i8 |= startRestartGroup.changed(j5) ? 8388608 : 4194304;
                        }
                    }
                    i14 = i7 & 256;
                    if (i14 == 0) {
                        i8 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i15 = i14;
                        i8 |= startRestartGroup.changed(j2) ? 67108864 : 33554432;
                        i16 = i7 & 512;
                        if (i16 != 0) {
                            i8 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            i17 = 805306368;
                            i8 |= startRestartGroup.changed(j3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            i18 = i7 & 1024;
                            if (i18 == 0) {
                                i20 = i5 | 6;
                                i19 = i18;
                            } else if ((i5 & 6) == 0) {
                                i19 = i18;
                                i20 = i5 | (startRestartGroup.changed(fontWeight) ? 4 : 2);
                            } else {
                                i19 = i18;
                                i20 = i5;
                            }
                            i21 = i7 & 2048;
                            if (i21 == 0) {
                                i20 |= 48;
                                i22 = i21;
                            } else if ((i5 & 48) == 0) {
                                i22 = i21;
                                i20 |= startRestartGroup.changed(fontFamily) ? 32 : 16;
                            } else {
                                i22 = i21;
                            }
                            int i45 = i20;
                            i23 = i7 & 4096;
                            if (i23 == 0) {
                                i25 = i45 | 384;
                                i24 = i5;
                            } else {
                                i24 = i5;
                                int i46 = i45;
                                if ((i24 & 384) == 0) {
                                    i46 |= startRestartGroup.changed(z2) ? 256 : 128;
                                }
                                i25 = i46;
                            }
                            i26 = i7 & 8192;
                            if (i26 == 0) {
                                i27 = i25 | 3072;
                            } else {
                                i27 = i25;
                                if ((i24 & 3072) == 0) {
                                    i27 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                                    if ((i24 & 24576) == 0) {
                                        if ((i7 & 16384) == 0 && startRestartGroup.changed(i3)) {
                                            i44 = 16384;
                                        }
                                        i27 |= i44;
                                    }
                                    i28 = i7 & 32768;
                                    if (i28 != 0) {
                                        i27 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i24 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i27 |= startRestartGroup.changed(keyboardActions) ? 131072 : 65536;
                                    }
                                    i29 = i7 & 65536;
                                    if (i29 != 0) {
                                        i27 |= 1572864;
                                    } else if ((i24 & 1572864) == 0) {
                                        i27 |= startRestartGroup.changed(keyboardOptions) ? 1048576 : 524288;
                                    }
                                    i30 = i7 & 131072;
                                    if (i30 != 0) {
                                        i27 |= 12582912;
                                    } else if ((i24 & 12582912) == 0) {
                                        i27 |= startRestartGroup.changed(visualTransformation) ? 8388608 : 4194304;
                                    }
                                    i31 = i7 & 262144;
                                    if (i31 != 0) {
                                        i27 |= 100663296;
                                    } else if ((i24 & 100663296) == 0) {
                                        i27 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : 33554432;
                                    }
                                    i32 = i7 & 524288;
                                    if (i32 != 0) {
                                        i27 |= i17;
                                    } else if ((i24 & i17) == 0) {
                                        i33 = i26;
                                        i27 |= startRestartGroup.changed(j4) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                        if ((i7 & 1048576) == 0) {
                                            i34 = i6 | 6;
                                        } else if ((i6 & 6) == 0) {
                                            i34 = i6 | (startRestartGroup.changedInstance(content) ? 4 : 2);
                                        } else {
                                            i34 = i6;
                                        }
                                        if ((i8 & 306783379) == 306783378 || (i27 & 306783379) != 306783378 || (i34 & 3) != 2 || !startRestartGroup.getSkipping()) {
                                            startRestartGroup.startDefaults();
                                            if ((i4 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                                if (i13 != 0) {
                                                    modifier2 = Modifier.INSTANCE;
                                                }
                                                if (i9 != 0) {
                                                    z3 = true;
                                                }
                                                if (i10 != 0) {
                                                    brush2 = new SolidColor(Color.INSTANCE.m5683getBlack0d7_KjU(), null);
                                                }
                                                if ((i7 & 32) != 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = UtilsKt.getLocalTextStyle();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    i8 &= -458753;
                                                    textStyle2 = (TextStyle) consume;
                                                }
                                                if ((i7 & 64) != 0) {
                                                    i11 = TextAlign.INSTANCE.m8263getUnspecifiede0LSkKk();
                                                    i8 = (-3670017) & i8;
                                                }
                                                long m8606getUnspecifiedXSAIIZE3 = i12 == 0 ? TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE() : j5;
                                                m8606getUnspecifiedXSAIIZE = i15 == 0 ? TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE() : j2;
                                                m8606getUnspecifiedXSAIIZE2 = i16 == 0 ? TextUnit.INSTANCE.m8606getUnspecifiedXSAIIZE() : j3;
                                                FontWeight fontWeight4 = i19 == 0 ? null : fontWeight;
                                                fontFamily2 = i22 == 0 ? null : fontFamily;
                                                z4 = i23 == 0 ? false : z2;
                                                int i47 = i33 == 0 ? 1 : i2;
                                                if ((i7 & 16384) == 0) {
                                                    i35 = z4 ? 1 : Integer.MAX_VALUE;
                                                    i27 &= -57345;
                                                } else {
                                                    i35 = i3;
                                                }
                                                keyboardActions2 = i28 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                keyboardOptions2 = i29 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                none = i30 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                mutableInteractionSource2 = i31 == 0 ? null : mutableInteractionSource;
                                                m5693getUnspecified0d7_KjU = i32 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j4;
                                                fontWeight2 = fontWeight4;
                                                j6 = m8606getUnspecifiedXSAIIZE3;
                                                i36 = i8;
                                                i37 = i27;
                                                i38 = i35;
                                                i39 = i47;
                                            } else {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i7 & 32) != 0) {
                                                    i8 &= -458753;
                                                }
                                                if ((i7 & 64) != 0) {
                                                    i8 &= -3670017;
                                                }
                                                if ((i7 & 16384) != 0) {
                                                    i27 &= -57345;
                                                }
                                                m8606getUnspecifiedXSAIIZE2 = j3;
                                                fontWeight2 = fontWeight;
                                                z4 = z2;
                                                i39 = i2;
                                                keyboardActions2 = keyboardActions;
                                                keyboardOptions2 = keyboardOptions;
                                                none = visualTransformation;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                m5693getUnspecified0d7_KjU = j4;
                                                i36 = i8;
                                                i37 = i27;
                                                i38 = i3;
                                                fontFamily2 = fontFamily;
                                                m8606getUnspecifiedXSAIIZE = j2;
                                                j6 = j5;
                                            }
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1476771151, i36, i37, "com.composeunstyled.TextField (TextField.kt:249)");
                                            }
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new TextFieldScope();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            TextFieldScope textFieldScope2 = (TextFieldScope) rememberedValue;
                                            startRestartGroup.endReplaceGroup();
                                            textFieldScope2.setText$core_release(value);
                                            textFieldScope2.setEditable$core_release(z3);
                                            int i48 = i36;
                                            int i49 = ((i48 >> 18) & 896) | ((i36 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i37 >> 18) & 7168);
                                            int i50 = i37 << 12;
                                            TextStyle m9558mergeThemedUwpzLow = TextKt.m9558mergeThemedUwpzLow(textStyle2, i11, m8606getUnspecifiedXSAIIZE, m5693getUnspecified0d7_KjU, fontWeight2, fontFamily2, j6, m8606getUnspecifiedXSAIIZE2, startRestartGroup, i49 | (57344 & i50) | (i50 & 458752) | ((i48 >> 3) & 3670016) | (29360128 & (i48 >> 6)), 0);
                                            FontWeight fontWeight5 = fontWeight2;
                                            long j11 = j6;
                                            composer2 = startRestartGroup;
                                            textFieldScope2.m9554setTextAlignmentaXe7zB0$core_release(m9558mergeThemedUwpzLow.m7876getTextAligne0LSkKk());
                                            textFieldScope2.setMinLines$core_release(i39);
                                            textFieldScope2.setMaxLines$core_release(i38);
                                            composer2.startReplaceGroup(1849434622);
                                            rememberedValue2 = composer2.rememberedValue();
                                            int i51 = i39;
                                            if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                                textFieldScope = textFieldScope2;
                                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m7823boximpl(TextRangeKt.TextRange(value.length(), value.length())), null, 2, null);
                                                composer2.updateRememberedValue(rememberedValue2);
                                            } else {
                                                textFieldScope = textFieldScope2;
                                            }
                                            final MutableState mutableState = (MutableState) rememberedValue2;
                                            composer2.endReplaceGroup();
                                            composer2.startReplaceGroup(-1633490746);
                                            z5 = (i48 & 14) != 4;
                                            rememberedValue3 = composer2.rememberedValue();
                                            if (!z5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = new Function0() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        TextFieldValue TextField_PNcJ320$lambda$24$lambda$23;
                                                        TextField_PNcJ320$lambda$24$lambda$23 = TextFieldKt.TextField_PNcJ320$lambda$24$lambda$23(value, mutableState);
                                                        return TextField_PNcJ320$lambda$24$lambda$23;
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue3);
                                            }
                                            composer2.endReplaceGroup();
                                            int i52 = i38;
                                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalTextStyle().provides(m9558mergeThemedUwpzLow), ComposableLambdaKt.rememberComposableLambda(1850143247, true, new TextFieldKt$TextField$7(z3, modifier2, textFieldScope, onValueChange, m9558mergeThemedUwpzLow, keyboardOptions2, keyboardActions2, z4, i52, i51, none, mutableInteractionSource2, brush2, SnapshotStateKt.derivedStateOf((Function0) rememberedValue3), mutableState, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            keyboardActions3 = keyboardActions2;
                                            i40 = i51;
                                            fontFamily3 = fontFamily2;
                                            z6 = z3;
                                            textStyle3 = textStyle2;
                                            i41 = i11;
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            fontWeight3 = fontWeight5;
                                            j7 = m8606getUnspecifiedXSAIIZE;
                                            brush3 = brush2;
                                            visualTransformation2 = none;
                                            j8 = j11;
                                            j9 = m5693getUnspecified0d7_KjU;
                                            j10 = m8606getUnspecifiedXSAIIZE2;
                                            keyboardOptions3 = keyboardOptions2;
                                            i42 = i52;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            fontFamily3 = fontFamily;
                                            z4 = z2;
                                            i40 = i2;
                                            i42 = i3;
                                            keyboardActions3 = keyboardActions;
                                            keyboardOptions3 = keyboardOptions;
                                            visualTransformation2 = visualTransformation;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            j9 = j4;
                                            composer2 = startRestartGroup;
                                            j8 = j5;
                                            z6 = z3;
                                            brush3 = brush2;
                                            textStyle3 = textStyle2;
                                            i41 = i11;
                                            j7 = j2;
                                            j10 = j3;
                                            fontWeight3 = fontWeight;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            final Modifier modifier3 = modifier2;
                                            final FontFamily fontFamily4 = fontFamily3;
                                            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit TextField_PNcJ320$lambda$26;
                                                    TextField_PNcJ320$lambda$26 = TextFieldKt.TextField_PNcJ320$lambda$26(value, onValueChange, modifier3, z6, brush3, textStyle3, i41, j8, j7, j10, fontWeight3, fontFamily4, z4, i40, i42, keyboardActions3, keyboardOptions3, visualTransformation2, mutableInteractionSource3, j9, content, i4, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                                                    return TextField_PNcJ320$lambda$26;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i33 = i26;
                                    if ((i7 & 1048576) == 0) {
                                    }
                                    if ((i8 & 306783379) == 306783378) {
                                    }
                                    startRestartGroup.startDefaults();
                                    if ((i4 & 1) != 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if ((i7 & 32) != 0) {
                                    }
                                    if ((i7 & 64) != 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i33 == 0) {
                                    }
                                    if ((i7 & 16384) == 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if (i29 == 0) {
                                    }
                                    if (i30 == 0) {
                                    }
                                    if (i31 == 0) {
                                    }
                                    if (i32 == 0) {
                                    }
                                    fontWeight2 = fontWeight4;
                                    j6 = m8606getUnspecifiedXSAIIZE3;
                                    i36 = i8;
                                    i37 = i27;
                                    i38 = i35;
                                    i39 = i47;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    TextFieldScope textFieldScope22 = (TextFieldScope) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                    textFieldScope22.setText$core_release(value);
                                    textFieldScope22.setEditable$core_release(z3);
                                    int i482 = i36;
                                    int i492 = ((i482 >> 18) & 896) | ((i36 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i37 >> 18) & 7168);
                                    int i502 = i37 << 12;
                                    TextStyle m9558mergeThemedUwpzLow2 = TextKt.m9558mergeThemedUwpzLow(textStyle2, i11, m8606getUnspecifiedXSAIIZE, m5693getUnspecified0d7_KjU, fontWeight2, fontFamily2, j6, m8606getUnspecifiedXSAIIZE2, startRestartGroup, i492 | (57344 & i502) | (i502 & 458752) | ((i482 >> 3) & 3670016) | (29360128 & (i482 >> 6)), 0);
                                    FontWeight fontWeight52 = fontWeight2;
                                    long j112 = j6;
                                    composer2 = startRestartGroup;
                                    textFieldScope22.m9554setTextAlignmentaXe7zB0$core_release(m9558mergeThemedUwpzLow2.m7876getTextAligne0LSkKk());
                                    textFieldScope22.setMinLines$core_release(i39);
                                    textFieldScope22.setMaxLines$core_release(i38);
                                    composer2.startReplaceGroup(1849434622);
                                    rememberedValue2 = composer2.rememberedValue();
                                    int i512 = i39;
                                    if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                    }
                                    final MutableState mutableState2 = (MutableState) rememberedValue2;
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(-1633490746);
                                    if ((i482 & 14) != 4) {
                                    }
                                    rememberedValue3 = composer2.rememberedValue();
                                    if (!z5) {
                                    }
                                    rememberedValue3 = new Function0() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            TextFieldValue TextField_PNcJ320$lambda$24$lambda$23;
                                            TextField_PNcJ320$lambda$24$lambda$23 = TextFieldKt.TextField_PNcJ320$lambda$24$lambda$23(value, mutableState2);
                                            return TextField_PNcJ320$lambda$24$lambda$23;
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue3);
                                    composer2.endReplaceGroup();
                                    int i522 = i38;
                                    CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalTextStyle().provides(m9558mergeThemedUwpzLow2), ComposableLambdaKt.rememberComposableLambda(1850143247, true, new TextFieldKt$TextField$7(z3, modifier2, textFieldScope, onValueChange, m9558mergeThemedUwpzLow2, keyboardOptions2, keyboardActions2, z4, i522, i512, none, mutableInteractionSource2, brush2, SnapshotStateKt.derivedStateOf((Function0) rememberedValue3), mutableState2, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    keyboardActions3 = keyboardActions2;
                                    i40 = i512;
                                    fontFamily3 = fontFamily2;
                                    z6 = z3;
                                    textStyle3 = textStyle2;
                                    i41 = i11;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    fontWeight3 = fontWeight52;
                                    j7 = m8606getUnspecifiedXSAIIZE;
                                    brush3 = brush2;
                                    visualTransformation2 = none;
                                    j8 = j112;
                                    j9 = m5693getUnspecified0d7_KjU;
                                    j10 = m8606getUnspecifiedXSAIIZE2;
                                    keyboardOptions3 = keyboardOptions2;
                                    i42 = i522;
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                    }
                                }
                            }
                            if ((i24 & 24576) == 0) {
                            }
                            i28 = i7 & 32768;
                            if (i28 != 0) {
                            }
                            i29 = i7 & 65536;
                            if (i29 != 0) {
                            }
                            i30 = i7 & 131072;
                            if (i30 != 0) {
                            }
                            i31 = i7 & 262144;
                            if (i31 != 0) {
                            }
                            i32 = i7 & 524288;
                            if (i32 != 0) {
                            }
                            i33 = i26;
                            if ((i7 & 1048576) == 0) {
                            }
                            if ((i8 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i4 & 1) != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if ((i7 & 32) != 0) {
                            }
                            if ((i7 & 64) != 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i23 == 0) {
                            }
                            if (i33 == 0) {
                            }
                            if ((i7 & 16384) == 0) {
                            }
                            if (i28 == 0) {
                            }
                            if (i29 == 0) {
                            }
                            if (i30 == 0) {
                            }
                            if (i31 == 0) {
                            }
                            if (i32 == 0) {
                            }
                            fontWeight2 = fontWeight4;
                            j6 = m8606getUnspecifiedXSAIIZE3;
                            i36 = i8;
                            i37 = i27;
                            i38 = i35;
                            i39 = i47;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            TextFieldScope textFieldScope222 = (TextFieldScope) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            textFieldScope222.setText$core_release(value);
                            textFieldScope222.setEditable$core_release(z3);
                            int i4822 = i36;
                            int i4922 = ((i4822 >> 18) & 896) | ((i36 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i37 >> 18) & 7168);
                            int i5022 = i37 << 12;
                            TextStyle m9558mergeThemedUwpzLow22 = TextKt.m9558mergeThemedUwpzLow(textStyle2, i11, m8606getUnspecifiedXSAIIZE, m5693getUnspecified0d7_KjU, fontWeight2, fontFamily2, j6, m8606getUnspecifiedXSAIIZE2, startRestartGroup, i4922 | (57344 & i5022) | (i5022 & 458752) | ((i4822 >> 3) & 3670016) | (29360128 & (i4822 >> 6)), 0);
                            FontWeight fontWeight522 = fontWeight2;
                            long j1122 = j6;
                            composer2 = startRestartGroup;
                            textFieldScope222.m9554setTextAlignmentaXe7zB0$core_release(m9558mergeThemedUwpzLow22.m7876getTextAligne0LSkKk());
                            textFieldScope222.setMinLines$core_release(i39);
                            textFieldScope222.setMaxLines$core_release(i38);
                            composer2.startReplaceGroup(1849434622);
                            rememberedValue2 = composer2.rememberedValue();
                            int i5122 = i39;
                            if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                            }
                            final MutableState mutableState22 = (MutableState) rememberedValue2;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(-1633490746);
                            if ((i4822 & 14) != 4) {
                            }
                            rememberedValue3 = composer2.rememberedValue();
                            if (!z5) {
                            }
                            rememberedValue3 = new Function0() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    TextFieldValue TextField_PNcJ320$lambda$24$lambda$23;
                                    TextField_PNcJ320$lambda$24$lambda$23 = TextFieldKt.TextField_PNcJ320$lambda$24$lambda$23(value, mutableState22);
                                    return TextField_PNcJ320$lambda$24$lambda$23;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                            composer2.endReplaceGroup();
                            int i5222 = i38;
                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalTextStyle().provides(m9558mergeThemedUwpzLow22), ComposableLambdaKt.rememberComposableLambda(1850143247, true, new TextFieldKt$TextField$7(z3, modifier2, textFieldScope, onValueChange, m9558mergeThemedUwpzLow22, keyboardOptions2, keyboardActions2, z4, i5222, i5122, none, mutableInteractionSource2, brush2, SnapshotStateKt.derivedStateOf((Function0) rememberedValue3), mutableState22, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            keyboardActions3 = keyboardActions2;
                            i40 = i5122;
                            fontFamily3 = fontFamily2;
                            z6 = z3;
                            textStyle3 = textStyle2;
                            i41 = i11;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            fontWeight3 = fontWeight522;
                            j7 = m8606getUnspecifiedXSAIIZE;
                            brush3 = brush2;
                            visualTransformation2 = none;
                            j8 = j1122;
                            j9 = m5693getUnspecified0d7_KjU;
                            j10 = m8606getUnspecifiedXSAIIZE2;
                            keyboardOptions3 = keyboardOptions2;
                            i42 = i5222;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i17 = 805306368;
                        i18 = i7 & 1024;
                        if (i18 == 0) {
                        }
                        i21 = i7 & 2048;
                        if (i21 == 0) {
                        }
                        int i452 = i20;
                        i23 = i7 & 4096;
                        if (i23 == 0) {
                        }
                        i26 = i7 & 8192;
                        if (i26 == 0) {
                        }
                        if ((i24 & 24576) == 0) {
                        }
                        i28 = i7 & 32768;
                        if (i28 != 0) {
                        }
                        i29 = i7 & 65536;
                        if (i29 != 0) {
                        }
                        i30 = i7 & 131072;
                        if (i30 != 0) {
                        }
                        i31 = i7 & 262144;
                        if (i31 != 0) {
                        }
                        i32 = i7 & 524288;
                        if (i32 != 0) {
                        }
                        i33 = i26;
                        if ((i7 & 1048576) == 0) {
                        }
                        if ((i8 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i4 & 1) != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if ((i7 & 32) != 0) {
                        }
                        if ((i7 & 64) != 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i33 == 0) {
                        }
                        if ((i7 & 16384) == 0) {
                        }
                        if (i28 == 0) {
                        }
                        if (i29 == 0) {
                        }
                        if (i30 == 0) {
                        }
                        if (i31 == 0) {
                        }
                        if (i32 == 0) {
                        }
                        fontWeight2 = fontWeight4;
                        j6 = m8606getUnspecifiedXSAIIZE3;
                        i36 = i8;
                        i37 = i27;
                        i38 = i35;
                        i39 = i47;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        TextFieldScope textFieldScope2222 = (TextFieldScope) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        textFieldScope2222.setText$core_release(value);
                        textFieldScope2222.setEditable$core_release(z3);
                        int i48222 = i36;
                        int i49222 = ((i48222 >> 18) & 896) | ((i36 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i37 >> 18) & 7168);
                        int i50222 = i37 << 12;
                        TextStyle m9558mergeThemedUwpzLow222 = TextKt.m9558mergeThemedUwpzLow(textStyle2, i11, m8606getUnspecifiedXSAIIZE, m5693getUnspecified0d7_KjU, fontWeight2, fontFamily2, j6, m8606getUnspecifiedXSAIIZE2, startRestartGroup, i49222 | (57344 & i50222) | (i50222 & 458752) | ((i48222 >> 3) & 3670016) | (29360128 & (i48222 >> 6)), 0);
                        FontWeight fontWeight5222 = fontWeight2;
                        long j11222 = j6;
                        composer2 = startRestartGroup;
                        textFieldScope2222.m9554setTextAlignmentaXe7zB0$core_release(m9558mergeThemedUwpzLow222.m7876getTextAligne0LSkKk());
                        textFieldScope2222.setMinLines$core_release(i39);
                        textFieldScope2222.setMaxLines$core_release(i38);
                        composer2.startReplaceGroup(1849434622);
                        rememberedValue2 = composer2.rememberedValue();
                        int i51222 = i39;
                        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState mutableState222 = (MutableState) rememberedValue2;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        if ((i48222 & 14) != 4) {
                        }
                        rememberedValue3 = composer2.rememberedValue();
                        if (!z5) {
                        }
                        rememberedValue3 = new Function0() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                TextFieldValue TextField_PNcJ320$lambda$24$lambda$23;
                                TextField_PNcJ320$lambda$24$lambda$23 = TextFieldKt.TextField_PNcJ320$lambda$24$lambda$23(value, mutableState222);
                                return TextField_PNcJ320$lambda$24$lambda$23;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                        composer2.endReplaceGroup();
                        int i52222 = i38;
                        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalTextStyle().provides(m9558mergeThemedUwpzLow222), ComposableLambdaKt.rememberComposableLambda(1850143247, true, new TextFieldKt$TextField$7(z3, modifier2, textFieldScope, onValueChange, m9558mergeThemedUwpzLow222, keyboardOptions2, keyboardActions2, z4, i52222, i51222, none, mutableInteractionSource2, brush2, SnapshotStateKt.derivedStateOf((Function0) rememberedValue3), mutableState222, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        keyboardActions3 = keyboardActions2;
                        i40 = i51222;
                        fontFamily3 = fontFamily2;
                        z6 = z3;
                        textStyle3 = textStyle2;
                        i41 = i11;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        fontWeight3 = fontWeight5222;
                        j7 = m8606getUnspecifiedXSAIIZE;
                        brush3 = brush2;
                        visualTransformation2 = none;
                        j8 = j11222;
                        j9 = m5693getUnspecified0d7_KjU;
                        j10 = m8606getUnspecifiedXSAIIZE2;
                        keyboardOptions3 = keyboardOptions2;
                        i42 = i52222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i7 & 512;
                    if (i16 != 0) {
                    }
                    i17 = 805306368;
                    i18 = i7 & 1024;
                    if (i18 == 0) {
                    }
                    i21 = i7 & 2048;
                    if (i21 == 0) {
                    }
                    int i4522 = i20;
                    i23 = i7 & 4096;
                    if (i23 == 0) {
                    }
                    i26 = i7 & 8192;
                    if (i26 == 0) {
                    }
                    if ((i24 & 24576) == 0) {
                    }
                    i28 = i7 & 32768;
                    if (i28 != 0) {
                    }
                    i29 = i7 & 65536;
                    if (i29 != 0) {
                    }
                    i30 = i7 & 131072;
                    if (i30 != 0) {
                    }
                    i31 = i7 & 262144;
                    if (i31 != 0) {
                    }
                    i32 = i7 & 524288;
                    if (i32 != 0) {
                    }
                    i33 = i26;
                    if ((i7 & 1048576) == 0) {
                    }
                    if ((i8 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i4 & 1) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i7 & 32) != 0) {
                    }
                    if ((i7 & 64) != 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i19 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i33 == 0) {
                    }
                    if ((i7 & 16384) == 0) {
                    }
                    if (i28 == 0) {
                    }
                    if (i29 == 0) {
                    }
                    if (i30 == 0) {
                    }
                    if (i31 == 0) {
                    }
                    if (i32 == 0) {
                    }
                    fontWeight2 = fontWeight4;
                    j6 = m8606getUnspecifiedXSAIIZE3;
                    i36 = i8;
                    i37 = i27;
                    i38 = i35;
                    i39 = i47;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    TextFieldScope textFieldScope22222 = (TextFieldScope) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    textFieldScope22222.setText$core_release(value);
                    textFieldScope22222.setEditable$core_release(z3);
                    int i482222 = i36;
                    int i492222 = ((i482222 >> 18) & 896) | ((i36 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i37 >> 18) & 7168);
                    int i502222 = i37 << 12;
                    TextStyle m9558mergeThemedUwpzLow2222 = TextKt.m9558mergeThemedUwpzLow(textStyle2, i11, m8606getUnspecifiedXSAIIZE, m5693getUnspecified0d7_KjU, fontWeight2, fontFamily2, j6, m8606getUnspecifiedXSAIIZE2, startRestartGroup, i492222 | (57344 & i502222) | (i502222 & 458752) | ((i482222 >> 3) & 3670016) | (29360128 & (i482222 >> 6)), 0);
                    FontWeight fontWeight52222 = fontWeight2;
                    long j112222 = j6;
                    composer2 = startRestartGroup;
                    textFieldScope22222.m9554setTextAlignmentaXe7zB0$core_release(m9558mergeThemedUwpzLow2222.m7876getTextAligne0LSkKk());
                    textFieldScope22222.setMinLines$core_release(i39);
                    textFieldScope22222.setMaxLines$core_release(i38);
                    composer2.startReplaceGroup(1849434622);
                    rememberedValue2 = composer2.rememberedValue();
                    int i512222 = i39;
                    if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState2222 = (MutableState) rememberedValue2;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1633490746);
                    if ((i482222 & 14) != 4) {
                    }
                    rememberedValue3 = composer2.rememberedValue();
                    if (!z5) {
                    }
                    rememberedValue3 = new Function0() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            TextFieldValue TextField_PNcJ320$lambda$24$lambda$23;
                            TextField_PNcJ320$lambda$24$lambda$23 = TextFieldKt.TextField_PNcJ320$lambda$24$lambda$23(value, mutableState2222);
                            return TextField_PNcJ320$lambda$24$lambda$23;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                    composer2.endReplaceGroup();
                    int i522222 = i38;
                    CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalTextStyle().provides(m9558mergeThemedUwpzLow2222), ComposableLambdaKt.rememberComposableLambda(1850143247, true, new TextFieldKt$TextField$7(z3, modifier2, textFieldScope, onValueChange, m9558mergeThemedUwpzLow2222, keyboardOptions2, keyboardActions2, z4, i522222, i512222, none, mutableInteractionSource2, brush2, SnapshotStateKt.derivedStateOf((Function0) rememberedValue3), mutableState2222, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    keyboardActions3 = keyboardActions2;
                    i40 = i512222;
                    fontFamily3 = fontFamily2;
                    z6 = z3;
                    textStyle3 = textStyle2;
                    i41 = i11;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    fontWeight3 = fontWeight52222;
                    j7 = m8606getUnspecifiedXSAIIZE;
                    brush3 = brush2;
                    visualTransformation2 = none;
                    j8 = j112222;
                    j9 = m5693getUnspecified0d7_KjU;
                    j10 = m8606getUnspecifiedXSAIIZE2;
                    keyboardOptions3 = keyboardOptions2;
                    i42 = i522222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                brush2 = brush;
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i4 & 1572864) != 0) {
                }
                i12 = i7 & 128;
                if (i12 == 0) {
                }
                i14 = i7 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i7 & 512;
                if (i16 != 0) {
                }
                i17 = 805306368;
                i18 = i7 & 1024;
                if (i18 == 0) {
                }
                i21 = i7 & 2048;
                if (i21 == 0) {
                }
                int i45222 = i20;
                i23 = i7 & 4096;
                if (i23 == 0) {
                }
                i26 = i7 & 8192;
                if (i26 == 0) {
                }
                if ((i24 & 24576) == 0) {
                }
                i28 = i7 & 32768;
                if (i28 != 0) {
                }
                i29 = i7 & 65536;
                if (i29 != 0) {
                }
                i30 = i7 & 131072;
                if (i30 != 0) {
                }
                i31 = i7 & 262144;
                if (i31 != 0) {
                }
                i32 = i7 & 524288;
                if (i32 != 0) {
                }
                i33 = i26;
                if ((i7 & 1048576) == 0) {
                }
                if ((i8 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i4 & 1) != 0) {
                }
                if (i13 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if ((i7 & 32) != 0) {
                }
                if ((i7 & 64) != 0) {
                }
                if (i12 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i19 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (i33 == 0) {
                }
                if ((i7 & 16384) == 0) {
                }
                if (i28 == 0) {
                }
                if (i29 == 0) {
                }
                if (i30 == 0) {
                }
                if (i31 == 0) {
                }
                if (i32 == 0) {
                }
                fontWeight2 = fontWeight4;
                j6 = m8606getUnspecifiedXSAIIZE3;
                i36 = i8;
                i37 = i27;
                i38 = i35;
                i39 = i47;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                TextFieldScope textFieldScope222222 = (TextFieldScope) rememberedValue;
                startRestartGroup.endReplaceGroup();
                textFieldScope222222.setText$core_release(value);
                textFieldScope222222.setEditable$core_release(z3);
                int i4822222 = i36;
                int i4922222 = ((i4822222 >> 18) & 896) | ((i36 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i37 >> 18) & 7168);
                int i5022222 = i37 << 12;
                TextStyle m9558mergeThemedUwpzLow22222 = TextKt.m9558mergeThemedUwpzLow(textStyle2, i11, m8606getUnspecifiedXSAIIZE, m5693getUnspecified0d7_KjU, fontWeight2, fontFamily2, j6, m8606getUnspecifiedXSAIIZE2, startRestartGroup, i4922222 | (57344 & i5022222) | (i5022222 & 458752) | ((i4822222 >> 3) & 3670016) | (29360128 & (i4822222 >> 6)), 0);
                FontWeight fontWeight522222 = fontWeight2;
                long j1122222 = j6;
                composer2 = startRestartGroup;
                textFieldScope222222.m9554setTextAlignmentaXe7zB0$core_release(m9558mergeThemedUwpzLow22222.m7876getTextAligne0LSkKk());
                textFieldScope222222.setMinLines$core_release(i39);
                textFieldScope222222.setMaxLines$core_release(i38);
                composer2.startReplaceGroup(1849434622);
                rememberedValue2 = composer2.rememberedValue();
                int i5122222 = i39;
                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState22222 = (MutableState) rememberedValue2;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1633490746);
                if ((i4822222 & 14) != 4) {
                }
                rememberedValue3 = composer2.rememberedValue();
                if (!z5) {
                }
                rememberedValue3 = new Function0() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        TextFieldValue TextField_PNcJ320$lambda$24$lambda$23;
                        TextField_PNcJ320$lambda$24$lambda$23 = TextFieldKt.TextField_PNcJ320$lambda$24$lambda$23(value, mutableState22222);
                        return TextField_PNcJ320$lambda$24$lambda$23;
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
                composer2.endReplaceGroup();
                int i5222222 = i38;
                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalTextStyle().provides(m9558mergeThemedUwpzLow22222), ComposableLambdaKt.rememberComposableLambda(1850143247, true, new TextFieldKt$TextField$7(z3, modifier2, textFieldScope, onValueChange, m9558mergeThemedUwpzLow22222, keyboardOptions2, keyboardActions2, z4, i5222222, i5122222, none, mutableInteractionSource2, brush2, SnapshotStateKt.derivedStateOf((Function0) rememberedValue3), mutableState22222, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                keyboardActions3 = keyboardActions2;
                i40 = i5122222;
                fontFamily3 = fontFamily2;
                z6 = z3;
                textStyle3 = textStyle2;
                i41 = i11;
                mutableInteractionSource3 = mutableInteractionSource2;
                fontWeight3 = fontWeight522222;
                j7 = m8606getUnspecifiedXSAIIZE;
                brush3 = brush2;
                visualTransformation2 = none;
                j8 = j1122222;
                j9 = m5693getUnspecified0d7_KjU;
                j10 = m8606getUnspecifiedXSAIIZE2;
                keyboardOptions3 = keyboardOptions2;
                i42 = i5222222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i10 = i7 & 16;
            int i442 = 8192;
            if (i10 != 0) {
            }
            brush2 = brush;
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i4 & 1572864) != 0) {
            }
            i12 = i7 & 128;
            if (i12 == 0) {
            }
            i14 = i7 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i7 & 512;
            if (i16 != 0) {
            }
            i17 = 805306368;
            i18 = i7 & 1024;
            if (i18 == 0) {
            }
            i21 = i7 & 2048;
            if (i21 == 0) {
            }
            int i452222 = i20;
            i23 = i7 & 4096;
            if (i23 == 0) {
            }
            i26 = i7 & 8192;
            if (i26 == 0) {
            }
            if ((i24 & 24576) == 0) {
            }
            i28 = i7 & 32768;
            if (i28 != 0) {
            }
            i29 = i7 & 65536;
            if (i29 != 0) {
            }
            i30 = i7 & 131072;
            if (i30 != 0) {
            }
            i31 = i7 & 262144;
            if (i31 != 0) {
            }
            i32 = i7 & 524288;
            if (i32 != 0) {
            }
            i33 = i26;
            if ((i7 & 1048576) == 0) {
            }
            if ((i8 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i4 & 1) != 0) {
            }
            if (i13 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if ((i7 & 32) != 0) {
            }
            if ((i7 & 64) != 0) {
            }
            if (i12 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i19 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (i33 == 0) {
            }
            if ((i7 & 16384) == 0) {
            }
            if (i28 == 0) {
            }
            if (i29 == 0) {
            }
            if (i30 == 0) {
            }
            if (i31 == 0) {
            }
            if (i32 == 0) {
            }
            fontWeight2 = fontWeight4;
            j6 = m8606getUnspecifiedXSAIIZE3;
            i36 = i8;
            i37 = i27;
            i38 = i35;
            i39 = i47;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            TextFieldScope textFieldScope2222222 = (TextFieldScope) rememberedValue;
            startRestartGroup.endReplaceGroup();
            textFieldScope2222222.setText$core_release(value);
            textFieldScope2222222.setEditable$core_release(z3);
            int i48222222 = i36;
            int i49222222 = ((i48222222 >> 18) & 896) | ((i36 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i37 >> 18) & 7168);
            int i50222222 = i37 << 12;
            TextStyle m9558mergeThemedUwpzLow222222 = TextKt.m9558mergeThemedUwpzLow(textStyle2, i11, m8606getUnspecifiedXSAIIZE, m5693getUnspecified0d7_KjU, fontWeight2, fontFamily2, j6, m8606getUnspecifiedXSAIIZE2, startRestartGroup, i49222222 | (57344 & i50222222) | (i50222222 & 458752) | ((i48222222 >> 3) & 3670016) | (29360128 & (i48222222 >> 6)), 0);
            FontWeight fontWeight5222222 = fontWeight2;
            long j11222222 = j6;
            composer2 = startRestartGroup;
            textFieldScope2222222.m9554setTextAlignmentaXe7zB0$core_release(m9558mergeThemedUwpzLow222222.m7876getTextAligne0LSkKk());
            textFieldScope2222222.setMinLines$core_release(i39);
            textFieldScope2222222.setMaxLines$core_release(i38);
            composer2.startReplaceGroup(1849434622);
            rememberedValue2 = composer2.rememberedValue();
            int i51222222 = i39;
            if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState222222 = (MutableState) rememberedValue2;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1633490746);
            if ((i48222222 & 14) != 4) {
            }
            rememberedValue3 = composer2.rememberedValue();
            if (!z5) {
            }
            rememberedValue3 = new Function0() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    TextFieldValue TextField_PNcJ320$lambda$24$lambda$23;
                    TextField_PNcJ320$lambda$24$lambda$23 = TextFieldKt.TextField_PNcJ320$lambda$24$lambda$23(value, mutableState222222);
                    return TextField_PNcJ320$lambda$24$lambda$23;
                }
            };
            composer2.updateRememberedValue(rememberedValue3);
            composer2.endReplaceGroup();
            int i52222222 = i38;
            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalTextStyle().provides(m9558mergeThemedUwpzLow222222), ComposableLambdaKt.rememberComposableLambda(1850143247, true, new TextFieldKt$TextField$7(z3, modifier2, textFieldScope, onValueChange, m9558mergeThemedUwpzLow222222, keyboardOptions2, keyboardActions2, z4, i52222222, i51222222, none, mutableInteractionSource2, brush2, SnapshotStateKt.derivedStateOf((Function0) rememberedValue3), mutableState222222, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            keyboardActions3 = keyboardActions2;
            i40 = i51222222;
            fontFamily3 = fontFamily2;
            z6 = z3;
            textStyle3 = textStyle2;
            i41 = i11;
            mutableInteractionSource3 = mutableInteractionSource2;
            fontWeight3 = fontWeight5222222;
            j7 = m8606getUnspecifiedXSAIIZE;
            brush3 = brush2;
            visualTransformation2 = none;
            j8 = j11222222;
            j9 = m5693getUnspecified0d7_KjU;
            j10 = m8606getUnspecifiedXSAIIZE2;
            keyboardOptions3 = keyboardOptions2;
            i42 = i52222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        z3 = z;
        i10 = i7 & 16;
        int i4422 = 8192;
        if (i10 != 0) {
        }
        brush2 = brush;
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i4 & 1572864) != 0) {
        }
        i12 = i7 & 128;
        if (i12 == 0) {
        }
        i14 = i7 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i7 & 512;
        if (i16 != 0) {
        }
        i17 = 805306368;
        i18 = i7 & 1024;
        if (i18 == 0) {
        }
        i21 = i7 & 2048;
        if (i21 == 0) {
        }
        int i4522222 = i20;
        i23 = i7 & 4096;
        if (i23 == 0) {
        }
        i26 = i7 & 8192;
        if (i26 == 0) {
        }
        if ((i24 & 24576) == 0) {
        }
        i28 = i7 & 32768;
        if (i28 != 0) {
        }
        i29 = i7 & 65536;
        if (i29 != 0) {
        }
        i30 = i7 & 131072;
        if (i30 != 0) {
        }
        i31 = i7 & 262144;
        if (i31 != 0) {
        }
        i32 = i7 & 524288;
        if (i32 != 0) {
        }
        i33 = i26;
        if ((i7 & 1048576) == 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i4 & 1) != 0) {
        }
        if (i13 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if ((i7 & 32) != 0) {
        }
        if ((i7 & 64) != 0) {
        }
        if (i12 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i19 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (i33 == 0) {
        }
        if ((i7 & 16384) == 0) {
        }
        if (i28 == 0) {
        }
        if (i29 == 0) {
        }
        if (i30 == 0) {
        }
        if (i31 == 0) {
        }
        if (i32 == 0) {
        }
        fontWeight2 = fontWeight4;
        j6 = m8606getUnspecifiedXSAIIZE3;
        i36 = i8;
        i37 = i27;
        i38 = i35;
        i39 = i47;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        TextFieldScope textFieldScope22222222 = (TextFieldScope) rememberedValue;
        startRestartGroup.endReplaceGroup();
        textFieldScope22222222.setText$core_release(value);
        textFieldScope22222222.setEditable$core_release(z3);
        int i482222222 = i36;
        int i492222222 = ((i482222222 >> 18) & 896) | ((i36 >> 15) & WebSocketProtocol.PAYLOAD_SHORT) | ((i37 >> 18) & 7168);
        int i502222222 = i37 << 12;
        TextStyle m9558mergeThemedUwpzLow2222222 = TextKt.m9558mergeThemedUwpzLow(textStyle2, i11, m8606getUnspecifiedXSAIIZE, m5693getUnspecified0d7_KjU, fontWeight2, fontFamily2, j6, m8606getUnspecifiedXSAIIZE2, startRestartGroup, i492222222 | (57344 & i502222222) | (i502222222 & 458752) | ((i482222222 >> 3) & 3670016) | (29360128 & (i482222222 >> 6)), 0);
        FontWeight fontWeight52222222 = fontWeight2;
        long j112222222 = j6;
        composer2 = startRestartGroup;
        textFieldScope22222222.m9554setTextAlignmentaXe7zB0$core_release(m9558mergeThemedUwpzLow2222222.m7876getTextAligne0LSkKk());
        textFieldScope22222222.setMinLines$core_release(i39);
        textFieldScope22222222.setMaxLines$core_release(i38);
        composer2.startReplaceGroup(1849434622);
        rememberedValue2 = composer2.rememberedValue();
        int i512222222 = i39;
        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState2222222 = (MutableState) rememberedValue2;
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-1633490746);
        if ((i482222222 & 14) != 4) {
        }
        rememberedValue3 = composer2.rememberedValue();
        if (!z5) {
        }
        rememberedValue3 = new Function0() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextFieldValue TextField_PNcJ320$lambda$24$lambda$23;
                TextField_PNcJ320$lambda$24$lambda$23 = TextFieldKt.TextField_PNcJ320$lambda$24$lambda$23(value, mutableState2222222);
                return TextField_PNcJ320$lambda$24$lambda$23;
            }
        };
        composer2.updateRememberedValue(rememberedValue3);
        composer2.endReplaceGroup();
        int i522222222 = i38;
        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalTextStyle().provides(m9558mergeThemedUwpzLow2222222), ComposableLambdaKt.rememberComposableLambda(1850143247, true, new TextFieldKt$TextField$7(z3, modifier2, textFieldScope, onValueChange, m9558mergeThemedUwpzLow2222222, keyboardOptions2, keyboardActions2, z4, i522222222, i512222222, none, mutableInteractionSource2, brush2, SnapshotStateKt.derivedStateOf((Function0) rememberedValue3), mutableState2222222, content), composer2, 54), composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
        }
        keyboardActions3 = keyboardActions2;
        i40 = i512222222;
        fontFamily3 = fontFamily2;
        z6 = z3;
        textStyle3 = textStyle2;
        i41 = i11;
        mutableInteractionSource3 = mutableInteractionSource2;
        fontWeight3 = fontWeight52222222;
        j7 = m8606getUnspecifiedXSAIIZE;
        brush3 = brush2;
        visualTransformation2 = none;
        j8 = j112222222;
        j9 = m5693getUnspecified0d7_KjU;
        j10 = m8606getUnspecifiedXSAIIZE2;
        keyboardOptions3 = keyboardOptions2;
        i42 = i522222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final long TextField_PNcJ320$lambda$21(MutableState<TextRange> mutableState) {
        return mutableState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextField_PNcJ320$lambda$22(MutableState<TextRange> mutableState, long j) {
        mutableState.setValue(TextRange.m7823boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TextField_PNcJ320$lambda$24$lambda$23(String str, MutableState mutableState) {
        return new TextFieldValue(str, TextField_PNcJ320$lambda$21(mutableState), (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0287 A[LOOP:0: B:89:0x0281->B:91:0x0287, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f6  */
    /* renamed from: TextInput-pfExLkk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9549TextInputpfExLkk(final TextFieldScope TextInput, Modifier modifier, Shape shape, long j, PaddingValues paddingValues, long j2, String str, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Alignment.Vertical vertical, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Shape shape2;
        int i6;
        long j3;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        int i9;
        long j4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final String str2;
        long j5;
        Iterator it;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        Composer composer2;
        final Alignment.Vertical vertical2;
        final Shape shape3;
        final long j6;
        final PaddingValues paddingValues3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final long j7;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final String str3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(TextInput, "$this$TextInput");
        Composer startRestartGroup = composer.startRestartGroup(99038477);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(TextInput) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i19 = i3 & 1;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 2;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                shape2 = shape;
                i4 |= startRestartGroup.changed(shape2) ? 256 : 128;
                i6 = i3 & 4;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    j3 = j;
                    i4 |= startRestartGroup.changed(j3) ? 2048 : 1024;
                    i7 = i3 & 8;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        paddingValues2 = paddingValues;
                        i4 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                        i8 = i3 & 16;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            i9 = i19;
                            j4 = j2;
                        } else {
                            i9 = i19;
                            j4 = j2;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i4 |= startRestartGroup.changed(j4) ? 131072 : 65536;
                            }
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(str) ? 1048576 : 524288;
                        }
                        i11 = i3 & 64;
                        if (i11 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                        }
                        i12 = i3 & 128;
                        if (i12 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i13 = i12;
                            i4 |= startRestartGroup.changedInstance(function22) ? 67108864 : 33554432;
                            i14 = i3 & 256;
                            if (i14 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i15 = i14;
                                i4 |= startRestartGroup.changedInstance(function23) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                i16 = i3 & 512;
                                if (i16 != 0) {
                                    i18 = i2 | 6;
                                } else {
                                    if ((i2 & 6) != 0) {
                                        i17 = i2;
                                        if ((i4 & 306783379) == 306783378 || (i17 & 3) != 2 || !startRestartGroup.getSkipping()) {
                                            Modifier.Companion companion = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                            Shape rectangleShape = i5 == 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                            long m5693getUnspecified0d7_KjU = i6 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
                                            if (i7 != 0) {
                                                paddingValues2 = PaddingKt.m830PaddingValues0680j_4(Dp.m8401constructorimpl(0));
                                            }
                                            if (i8 != 0) {
                                                j4 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
                                            }
                                            str2 = i10 == 0 ? null : str;
                                            Function2<? super Composer, ? super Integer, Unit> function27 = i11 == 0 ? null : function2;
                                            Function2<? super Composer, ? super Integer, Unit> function28 = i13 == 0 ? null : function22;
                                            Function2<? super Composer, ? super Integer, Unit> function29 = i15 == 0 ? null : function23;
                                            Alignment.Vertical centerVertically = i16 == 0 ? Alignment.INSTANCE.getCenterVertically() : vertical;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(99038477, i4, i17, "com.composeunstyled.TextInput (TextField.kt:339)");
                                            }
                                            long j8 = m5693getUnspecified0d7_KjU;
                                            int i20 = i17;
                                            Modifier modifier4 = companion;
                                            Shape shape4 = rectangleShape;
                                            Modifier pointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(companion, rectangleShape), j8, null, 2, null), PointerIcon.INSTANCE.getText(), false, 2, null);
                                            startRestartGroup.startReplaceGroup(686717340);
                                            List createListBuilder = CollectionsKt.createListBuilder();
                                            startRestartGroup.startReplaceGroup(686718198);
                                            if (str2 == null) {
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                startRestartGroup.startReplaceGroup(5004770);
                                                boolean z = (i4 & 3670016) == 1048576;
                                                Object rememberedValue = startRestartGroup.rememberedValue();
                                                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = new Function1() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda5
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            Unit TextInput_pfExLkk$lambda$29$lambda$28$lambda$27;
                                                            TextInput_pfExLkk$lambda$29$lambda$28$lambda$27 = TextFieldKt.TextInput_pfExLkk$lambda$29$lambda$28$lambda$27(str2, (SemanticsPropertyReceiver) obj);
                                                            return TextInput_pfExLkk$lambda$29$lambda$28$lambda$27;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                j5 = j4;
                                                createListBuilder.add(SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, 1, null));
                                            } else {
                                                j5 = j4;
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            List build = CollectionsKt.build(createListBuilder);
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            Intrinsics.checkNotNull(companion3, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                                            Modifier.Companion companion4 = companion3;
                                            it = build.iterator();
                                            while (it.hasNext()) {
                                                companion4 = companion4.then((Modifier) it.next());
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            Modifier then = pointerHoverIcon$default.then(PaddingKt.padding(companion4, paddingValues2));
                                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            Alignment.Vertical vertical3 = centerVertically;
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, vertical3, startRestartGroup, 6 | (((((i20 << 6) & 896) | 48) >> 3) & 112));
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                                            if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            Function2<? super Composer, ? super Integer, Unit> function210 = function27;
                                            Function2<? super Composer, ? super Integer, Unit> function211 = function28;
                                            Function2<? super Composer, ? super Integer, Unit> function212 = function29;
                                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j5)), ComposableLambdaKt.rememberComposableLambda(-1847335063, true, new TextFieldKt$TextInput$2$1(function211, TextInput, RowScopeInstance.INSTANCE, function212, function210), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer2 = startRestartGroup;
                                            vertical2 = vertical3;
                                            shape3 = shape4;
                                            j6 = j5;
                                            paddingValues3 = paddingValues2;
                                            function24 = function211;
                                            modifier3 = modifier4;
                                            String str4 = str2;
                                            function25 = function212;
                                            j7 = j8;
                                            function26 = function210;
                                            str3 = str4;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            str3 = str;
                                            function24 = function22;
                                            composer2 = startRestartGroup;
                                            modifier3 = modifier2;
                                            shape3 = shape2;
                                            function26 = function2;
                                            j6 = j4;
                                            paddingValues3 = paddingValues2;
                                            j7 = j3;
                                            function25 = function23;
                                            vertical2 = vertical;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.TextFieldKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit TextInput_pfExLkk$lambda$31;
                                                    TextInput_pfExLkk$lambda$31 = TextFieldKt.TextInput_pfExLkk$lambda$31(TextFieldScope.this, modifier3, shape3, j7, paddingValues3, j6, str3, function26, function24, function25, vertical2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                    return TextInput_pfExLkk$lambda$31;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i18 = i2 | (startRestartGroup.changed(vertical) ? 4 : 2);
                                }
                                i17 = i18;
                                if ((i4 & 306783379) == 306783378) {
                                }
                                if (i9 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                long j82 = m5693getUnspecified0d7_KjU;
                                int i202 = i17;
                                Modifier modifier42 = companion;
                                Shape shape42 = rectangleShape;
                                Modifier pointerHoverIcon$default2 = PointerIconKt.pointerHoverIcon$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(companion, rectangleShape), j82, null, 2, null), PointerIcon.INSTANCE.getText(), false, 2, null);
                                startRestartGroup.startReplaceGroup(686717340);
                                List createListBuilder2 = CollectionsKt.createListBuilder();
                                startRestartGroup.startReplaceGroup(686718198);
                                if (str2 == null) {
                                }
                                startRestartGroup.endReplaceGroup();
                                List build2 = CollectionsKt.build(createListBuilder2);
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                Intrinsics.checkNotNull(companion32, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                                Modifier.Companion companion42 = companion32;
                                it = build2.iterator();
                                while (it.hasNext()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier then2 = pointerHoverIcon$default2.then(PaddingKt.padding(companion42, paddingValues2));
                                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                Alignment.Vertical vertical32 = centerVertically;
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, vertical32, startRestartGroup, 6 | (((((i202 << 6) & 896) | 48) >> 3) & 112));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                Function2<? super Composer, ? super Integer, Unit> function2102 = function27;
                                Function2<? super Composer, ? super Integer, Unit> function2112 = function28;
                                Function2<? super Composer, ? super Integer, Unit> function2122 = function29;
                                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j5)), ComposableLambdaKt.rememberComposableLambda(-1847335063, true, new TextFieldKt$TextInput$2$1(function2112, TextInput, RowScopeInstance.INSTANCE, function2122, function2102), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer2 = startRestartGroup;
                                vertical2 = vertical32;
                                shape3 = shape42;
                                j6 = j5;
                                paddingValues3 = paddingValues2;
                                function24 = function2112;
                                modifier3 = modifier42;
                                String str42 = str2;
                                function25 = function2122;
                                j7 = j82;
                                function26 = function2102;
                                str3 = str42;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i15 = i14;
                            i16 = i3 & 512;
                            if (i16 != 0) {
                            }
                            i17 = i18;
                            if ((i4 & 306783379) == 306783378) {
                            }
                            if (i9 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            long j822 = m5693getUnspecified0d7_KjU;
                            int i2022 = i17;
                            Modifier modifier422 = companion;
                            Shape shape422 = rectangleShape;
                            Modifier pointerHoverIcon$default22 = PointerIconKt.pointerHoverIcon$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(companion, rectangleShape), j822, null, 2, null), PointerIcon.INSTANCE.getText(), false, 2, null);
                            startRestartGroup.startReplaceGroup(686717340);
                            List createListBuilder22 = CollectionsKt.createListBuilder();
                            startRestartGroup.startReplaceGroup(686718198);
                            if (str2 == null) {
                            }
                            startRestartGroup.endReplaceGroup();
                            List build22 = CollectionsKt.build(createListBuilder22);
                            Modifier.Companion companion322 = Modifier.INSTANCE;
                            Intrinsics.checkNotNull(companion322, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                            Modifier.Companion companion422 = companion322;
                            it = build22.iterator();
                            while (it.hasNext()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier then22 = pointerHoverIcon$default22.then(PaddingKt.padding(companion422, paddingValues2));
                            Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                            Alignment.Vertical vertical322 = centerVertically;
                            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween22, vertical322, startRestartGroup, 6 | (((((i2022 << 6) & 896) | 48) >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            Function2<? super Composer, ? super Integer, Unit> function21022 = function27;
                            Function2<? super Composer, ? super Integer, Unit> function21122 = function28;
                            Function2<? super Composer, ? super Integer, Unit> function21222 = function29;
                            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j5)), ComposableLambdaKt.rememberComposableLambda(-1847335063, true, new TextFieldKt$TextInput$2$1(function21122, TextInput, RowScopeInstance.INSTANCE, function21222, function21022), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            vertical2 = vertical322;
                            shape3 = shape422;
                            j6 = j5;
                            paddingValues3 = paddingValues2;
                            function24 = function21122;
                            modifier3 = modifier422;
                            String str422 = str2;
                            function25 = function21222;
                            j7 = j822;
                            function26 = function21022;
                            str3 = str422;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i13 = i12;
                        i14 = i3 & 256;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i3 & 512;
                        if (i16 != 0) {
                        }
                        i17 = i18;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        if (i9 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        long j8222 = m5693getUnspecified0d7_KjU;
                        int i20222 = i17;
                        Modifier modifier4222 = companion;
                        Shape shape4222 = rectangleShape;
                        Modifier pointerHoverIcon$default222 = PointerIconKt.pointerHoverIcon$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(companion, rectangleShape), j8222, null, 2, null), PointerIcon.INSTANCE.getText(), false, 2, null);
                        startRestartGroup.startReplaceGroup(686717340);
                        List createListBuilder222 = CollectionsKt.createListBuilder();
                        startRestartGroup.startReplaceGroup(686718198);
                        if (str2 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        List build222 = CollectionsKt.build(createListBuilder222);
                        Modifier.Companion companion3222 = Modifier.INSTANCE;
                        Intrinsics.checkNotNull(companion3222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                        Modifier.Companion companion4222 = companion3222;
                        it = build222.iterator();
                        while (it.hasNext()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier then222 = pointerHoverIcon$default222.then(PaddingKt.padding(companion4222, paddingValues2));
                        Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        Alignment.Vertical vertical3222 = centerVertically;
                        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceBetween222, vertical3222, startRestartGroup, 6 | (((((i20222 << 6) & 896) | 48) >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222);
                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
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
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        Function2<? super Composer, ? super Integer, Unit> function210222 = function27;
                        Function2<? super Composer, ? super Integer, Unit> function211222 = function28;
                        Function2<? super Composer, ? super Integer, Unit> function212222 = function29;
                        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j5)), ComposableLambdaKt.rememberComposableLambda(-1847335063, true, new TextFieldKt$TextInput$2$1(function211222, TextInput, RowScopeInstance.INSTANCE, function212222, function210222), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = startRestartGroup;
                        vertical2 = vertical3222;
                        shape3 = shape4222;
                        j6 = j5;
                        paddingValues3 = paddingValues2;
                        function24 = function211222;
                        modifier3 = modifier4222;
                        String str4222 = str2;
                        function25 = function212222;
                        j7 = j8222;
                        function26 = function210222;
                        str3 = str4222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    paddingValues2 = paddingValues;
                    i8 = i3 & 16;
                    if (i8 != 0) {
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 256;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i3 & 512;
                    if (i16 != 0) {
                    }
                    i17 = i18;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    if (i9 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    long j82222 = m5693getUnspecified0d7_KjU;
                    int i202222 = i17;
                    Modifier modifier42222 = companion;
                    Shape shape42222 = rectangleShape;
                    Modifier pointerHoverIcon$default2222 = PointerIconKt.pointerHoverIcon$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(companion, rectangleShape), j82222, null, 2, null), PointerIcon.INSTANCE.getText(), false, 2, null);
                    startRestartGroup.startReplaceGroup(686717340);
                    List createListBuilder2222 = CollectionsKt.createListBuilder();
                    startRestartGroup.startReplaceGroup(686718198);
                    if (str2 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    List build2222 = CollectionsKt.build(createListBuilder2222);
                    Modifier.Companion companion32222 = Modifier.INSTANCE;
                    Intrinsics.checkNotNull(companion32222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                    Modifier.Companion companion42222 = companion32222;
                    it = build2222.iterator();
                    while (it.hasNext()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier then2222 = pointerHoverIcon$default2222.then(PaddingKt.padding(companion42222, paddingValues2));
                    Arrangement.HorizontalOrVertical spaceBetween2222 = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Alignment.Vertical vertical32222 = centerVertically;
                    MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(spaceBetween2222, vertical32222, startRestartGroup, 6 | (((((i202222 << 6) & 896) | 48) >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222);
                    Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl.getInserting()) {
                    }
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    Function2<? super Composer, ? super Integer, Unit> function2102222 = function27;
                    Function2<? super Composer, ? super Integer, Unit> function2112222 = function28;
                    Function2<? super Composer, ? super Integer, Unit> function2122222 = function29;
                    CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j5)), ComposableLambdaKt.rememberComposableLambda(-1847335063, true, new TextFieldKt$TextInput$2$1(function2112222, TextInput, RowScopeInstance.INSTANCE, function2122222, function2102222), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    vertical2 = vertical32222;
                    shape3 = shape42222;
                    j6 = j5;
                    paddingValues3 = paddingValues2;
                    function24 = function2112222;
                    modifier3 = modifier42222;
                    String str42222 = str2;
                    function25 = function2122222;
                    j7 = j82222;
                    function26 = function2102222;
                    str3 = str42222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                j3 = j;
                i7 = i3 & 8;
                if (i7 == 0) {
                }
                paddingValues2 = paddingValues;
                i8 = i3 & 16;
                if (i8 != 0) {
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                i11 = i3 & 64;
                if (i11 != 0) {
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i3 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i3 & 512;
                if (i16 != 0) {
                }
                i17 = i18;
                if ((i4 & 306783379) == 306783378) {
                }
                if (i9 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                long j822222 = m5693getUnspecified0d7_KjU;
                int i2022222 = i17;
                Modifier modifier422222 = companion;
                Shape shape422222 = rectangleShape;
                Modifier pointerHoverIcon$default22222 = PointerIconKt.pointerHoverIcon$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(companion, rectangleShape), j822222, null, 2, null), PointerIcon.INSTANCE.getText(), false, 2, null);
                startRestartGroup.startReplaceGroup(686717340);
                List createListBuilder22222 = CollectionsKt.createListBuilder();
                startRestartGroup.startReplaceGroup(686718198);
                if (str2 == null) {
                }
                startRestartGroup.endReplaceGroup();
                List build22222 = CollectionsKt.build(createListBuilder22222);
                Modifier.Companion companion322222 = Modifier.INSTANCE;
                Intrinsics.checkNotNull(companion322222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                Modifier.Companion companion422222 = companion322222;
                it = build22222.iterator();
                while (it.hasNext()) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier then22222 = pointerHoverIcon$default22222.then(PaddingKt.padding(companion422222, paddingValues2));
                Arrangement.HorizontalOrVertical spaceBetween22222 = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Alignment.Vertical vertical322222 = centerVertically;
                MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(spaceBetween22222, vertical322222, startRestartGroup, 6 | (((((i2022222 << 6) & 896) | 48) >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, then22222);
                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                Function2<? super Composer, ? super Integer, Unit> function21022222 = function27;
                Function2<? super Composer, ? super Integer, Unit> function21122222 = function28;
                Function2<? super Composer, ? super Integer, Unit> function21222222 = function29;
                CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j5)), ComposableLambdaKt.rememberComposableLambda(-1847335063, true, new TextFieldKt$TextInput$2$1(function21122222, TextInput, RowScopeInstance.INSTANCE, function21222222, function21022222), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                vertical2 = vertical322222;
                shape3 = shape422222;
                j6 = j5;
                paddingValues3 = paddingValues2;
                function24 = function21122222;
                modifier3 = modifier422222;
                String str422222 = str2;
                function25 = function21222222;
                j7 = j822222;
                function26 = function21022222;
                str3 = str422222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            shape2 = shape;
            i6 = i3 & 4;
            if (i6 != 0) {
            }
            j3 = j;
            i7 = i3 & 8;
            if (i7 == 0) {
            }
            paddingValues2 = paddingValues;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            i11 = i3 & 64;
            if (i11 != 0) {
            }
            i12 = i3 & 128;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i3 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i3 & 512;
            if (i16 != 0) {
            }
            i17 = i18;
            if ((i4 & 306783379) == 306783378) {
            }
            if (i9 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            long j8222222 = m5693getUnspecified0d7_KjU;
            int i20222222 = i17;
            Modifier modifier4222222 = companion;
            Shape shape4222222 = rectangleShape;
            Modifier pointerHoverIcon$default222222 = PointerIconKt.pointerHoverIcon$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(companion, rectangleShape), j8222222, null, 2, null), PointerIcon.INSTANCE.getText(), false, 2, null);
            startRestartGroup.startReplaceGroup(686717340);
            List createListBuilder222222 = CollectionsKt.createListBuilder();
            startRestartGroup.startReplaceGroup(686718198);
            if (str2 == null) {
            }
            startRestartGroup.endReplaceGroup();
            List build222222 = CollectionsKt.build(createListBuilder222222);
            Modifier.Companion companion3222222 = Modifier.INSTANCE;
            Intrinsics.checkNotNull(companion3222222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
            Modifier.Companion companion4222222 = companion3222222;
            it = build222222.iterator();
            while (it.hasNext()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier then222222 = pointerHoverIcon$default222222.then(PaddingKt.padding(companion4222222, paddingValues2));
            Arrangement.HorizontalOrVertical spaceBetween222222 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Alignment.Vertical vertical3222222 = centerVertically;
            MeasurePolicy rowMeasurePolicy222222 = RowKt.rowMeasurePolicy(spaceBetween222222, vertical3222222, startRestartGroup, 6 | (((((i20222222 << 6) & 896) | 48) >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222222);
            Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            Function2<? super Composer, ? super Integer, Unit> function210222222 = function27;
            Function2<? super Composer, ? super Integer, Unit> function211222222 = function28;
            Function2<? super Composer, ? super Integer, Unit> function212222222 = function29;
            CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j5)), ComposableLambdaKt.rememberComposableLambda(-1847335063, true, new TextFieldKt$TextInput$2$1(function211222222, TextInput, RowScopeInstance.INSTANCE, function212222222, function210222222), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            vertical2 = vertical3222222;
            shape3 = shape4222222;
            j6 = j5;
            paddingValues3 = paddingValues2;
            function24 = function211222222;
            modifier3 = modifier4222222;
            String str4222222 = str2;
            function25 = function212222222;
            j7 = j8222222;
            function26 = function210222222;
            str3 = str4222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 2;
        if (i5 == 0) {
        }
        shape2 = shape;
        i6 = i3 & 4;
        if (i6 != 0) {
        }
        j3 = j;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        paddingValues2 = paddingValues;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        i11 = i3 & 64;
        if (i11 != 0) {
        }
        i12 = i3 & 128;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i3 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i3 & 512;
        if (i16 != 0) {
        }
        i17 = i18;
        if ((i4 & 306783379) == 306783378) {
        }
        if (i9 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        long j82222222 = m5693getUnspecified0d7_KjU;
        int i202222222 = i17;
        Modifier modifier42222222 = companion;
        Shape shape42222222 = rectangleShape;
        Modifier pointerHoverIcon$default2222222 = PointerIconKt.pointerHoverIcon$default(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(companion, rectangleShape), j82222222, null, 2, null), PointerIcon.INSTANCE.getText(), false, 2, null);
        startRestartGroup.startReplaceGroup(686717340);
        List createListBuilder2222222 = CollectionsKt.createListBuilder();
        startRestartGroup.startReplaceGroup(686718198);
        if (str2 == null) {
        }
        startRestartGroup.endReplaceGroup();
        List build2222222 = CollectionsKt.build(createListBuilder2222222);
        Modifier.Companion companion32222222 = Modifier.INSTANCE;
        Intrinsics.checkNotNull(companion32222222, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
        Modifier.Companion companion42222222 = companion32222222;
        it = build2222222.iterator();
        while (it.hasNext()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier then2222222 = pointerHoverIcon$default2222222.then(PaddingKt.padding(companion42222222, paddingValues2));
        Arrangement.HorizontalOrVertical spaceBetween2222222 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Alignment.Vertical vertical32222222 = centerVertically;
        MeasurePolicy rowMeasurePolicy2222222 = RowKt.rowMeasurePolicy(spaceBetween2222222, vertical32222222, startRestartGroup, 6 | (((((i202222222 << 6) & 896) | 48) >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222222);
        Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, rowMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        Function2<? super Composer, ? super Integer, Unit> function2102222222 = function27;
        Function2<? super Composer, ? super Integer, Unit> function2112222222 = function28;
        Function2<? super Composer, ? super Integer, Unit> function2122222222 = function29;
        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j5)), ComposableLambdaKt.rememberComposableLambda(-1847335063, true, new TextFieldKt$TextInput$2$1(function2112222222, TextInput, RowScopeInstance.INSTANCE, function2122222222, function2102222222), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        vertical2 = vertical32222222;
        shape3 = shape42222222;
        j6 = j5;
        paddingValues3 = paddingValues2;
        function24 = function2112222222;
        modifier3 = modifier42222222;
        String str42222222 = str2;
        function25 = function2122222222;
        j7 = j82222222;
        function26 = function2102222222;
        str3 = str42222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInput_pfExLkk$lambda$29$lambda$28$lambda$27(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }

    private static final TextFieldValue TextField_RM0IcR4$lambda$12(State<TextFieldValue> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue TextField_PNcJ320$lambda$25(State<TextFieldValue> state) {
        return state.getValue();
    }
}
