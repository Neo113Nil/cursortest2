package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.reactcommunity.rndatetimepicker.Common;
import io.branch.referral.BranchError;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%JM\u0010&\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u0005H\u0007¢\u0006\u0004\b+\u0010,J5\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u0005¢\u0006\u0004\b3\u00104J5\u00105\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u0005¢\u0006\u0004\b6\u00104J5\u00107\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u0005¢\u0006\u0004\b8\u00104Já\u0001\u00109\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u00020;2\b\b\u0002\u0010B\u001a\u00020;2\b\b\u0002\u0010C\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007¢\u0006\u0004\bP\u0010QJá\u0001\u0010R\u001a\u00020!2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010S\u001a\u00020;2\b\b\u0002\u0010T\u001a\u00020;2\b\b\u0002\u0010U\u001a\u00020;2\b\b\u0002\u0010V\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007¢\u0006\u0004\bW\u0010QJÌ\u0001\u0010X\u001a\u00020'2\u0006\u0010Y\u001a\u00020Z2\u0011\u0010[\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020`2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0015\b\u0002\u0010a\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010b\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010e\u001a\u00020.H\u0007¢\u0006\u0002\u0010fJá\u0001\u0010g\u001a\u00020'2\u0006\u0010Y\u001a\u00020Z2\u0011\u0010[\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020`2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0015\b\u0002\u0010a\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010b\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010e\u001a\u00020.2\u0013\b\u0002\u0010h\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]H\u0007¢\u0006\u0002\u0010iJÂ\u0001\u0010X\u001a\u00020'2\u0006\u0010Y\u001a\u00020Z2\u0011\u0010[\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020`2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0015\b\u0002\u0010a\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010b\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010e\u001a\u00020.H\u0007¢\u0006\u0002\u0010jJ×\u0001\u0010g\u001a\u00020'2\u0006\u0010Y\u001a\u00020Z2\u0011\u0010[\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020\u001c2\u0006\u0010_\u001a\u00020`2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0015\b\u0002\u0010a\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010b\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010c\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\u0015\b\u0002\u0010d\u001a\u000f\u0012\u0004\u0012\u00020'\u0018\u00010\\¢\u0006\u0002\b]2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010e\u001a\u00020.2\u0013\b\u0002\u0010h\u001a\r\u0012\u0004\u0012\u00020'0\\¢\u0006\u0002\b]H\u0007¢\u0006\u0002\u0010kR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007R\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0016\u0010\u0007R\u000e\u0010\u0017\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "<init>", "()V", "MinHeight", "Landroidx/compose/ui/unit/Dp;", "getMinHeight-D9Ej5fM", "()F", "F", "MinWidth", "getMinWidth-D9Ej5fM", "IconOpacity", "", "TextFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "OutlinedTextFieldShape", "getOutlinedTextFieldShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "BackgroundOpacity", "UnfocusedIndicatorLineOpacity", "indicatorLine", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "BorderBox", "", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "textFieldWithLabelPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "start", "end", "top", "bottom", "textFieldWithLabelPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "textFieldColors", Common.TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "outlinedTextFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-dx8h9Zs", "TextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "contentPadding", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldDecorationBox", OutlinedTextFieldKt.BorderId, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m8401constructorimpl(56);
    private static final float MinWidth = Dp.m8401constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m8401constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m8401constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BorderBox_nbWgWpA$lambda$1(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, Composer composer, int i3) {
        textFieldDefaults.m2211BorderBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextFieldDecorationBox$lambda$3(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, int i, int i2, int i3, Composer composer, int i4) {
        textFieldDefaults.OutlinedTextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z3, function22, function23, function24, function25, shape, textFieldColors, paddingValues, function26, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextFieldDecorationBox$lambda$5(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, int i, int i2, int i3, Composer composer, int i4) {
        textFieldDefaults.OutlinedTextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z3, function22, function23, function24, function25, textFieldColors, paddingValues, function26, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldDecorationBox$lambda$2(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, int i, int i2, int i3, Composer composer, int i4) {
        textFieldDefaults.TextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z3, function22, function23, function24, function25, shape, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldDecorationBox$lambda$4(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, int i, int i2, int i3, Composer composer, int i4) {
        textFieldDefaults.TextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z3, function22, function23, function24, function25, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    private TextFieldDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2213getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2214getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getTextFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1117199624, "C(<get-TextFieldShape>)221@8326L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:221)");
        }
        CornerBasedShape copy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return copy$default;
    }

    public final Shape getOutlinedTextFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1899109048, "C(<get-OutlinedTextFieldShape>)228@8634L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:228)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return small;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2215getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2212getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2207indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        if ((i & 16) != 0) {
            f = FocusedBorderThickness;
        }
        return textFieldDefaults.m2216indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f, (i & 32) != 0 ? UnfocusedBorderThickness : f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
    
        if ((r29 & 64) != 0) goto L115;
     */
    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2211BorderBoxnbWgWpA(final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        final float f5;
        final float f6;
        State m2223animateBorderStrokeAsStateNuRrP5Q;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(943754022);
        ComposerKt.sourceInformation(startRestartGroup, "C(BorderBox)N(enabled,isError,interactionSource,colors,shape,focusedBorderThickness:c#ui.unit.Dp,unfocusedBorderThickness:c#ui.unit.Dp)326@12897L333,334@13239L47:TextFieldDefaults.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(z4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            interactionSource2 = interactionSource;
        } else {
            interactionSource2 = interactionSource;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(interactionSource2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            textFieldColors2 = textFieldColors;
        } else {
            textFieldColors2 = textFieldColors;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(textFieldColors2) ? 2048 : 1024;
            }
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                shape2 = shape;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                if (startRestartGroup.changed(f3)) {
                    i5 = 131072;
                    i3 |= i5;
                }
            } else {
                f3 = f;
            }
            i5 = 65536;
            i3 |= i5;
        } else {
            f3 = f;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                if (startRestartGroup.changed(f4)) {
                    i4 = 1048576;
                    i3 |= i4;
                }
            } else {
                f4 = f2;
            }
            i4 = 524288;
            i3 |= i4;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "321@12700L22");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    shape2 = getOutlinedTextFieldShape(startRestartGroup, (i3 >> 21) & 14);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    f3 = FocusedBorderThickness;
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    f4 = UnfocusedBorderThickness;
                    i3 &= -3670017;
                }
                float f7 = f3;
                float f8 = f4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(943754022, i3, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:324)");
                }
                int i7 = i3 & 8190;
                int i8 = i3 >> 3;
                m2223animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m2223animateBorderStrokeAsStateNuRrP5Q(z3, z4, interactionSource2, textFieldColors2, f7, f8, startRestartGroup, i7 | (57344 & i8) | (i8 & 458752));
                BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) m2223animateBorderStrokeAsStateNuRrP5Q.getValue(), shape2), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f6 = f7;
                f5 = f8;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            f5 = f4;
            f6 = f3;
        }
        final Shape shape3 = shape2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BorderBox_nbWgWpA$lambda$1;
                    BorderBox_nbWgWpA$lambda$1 = TextFieldDefaults.BorderBox_nbWgWpA$lambda$1(TextFieldDefaults.this, z, z2, interactionSource, textFieldColors, shape3, f6, f5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BorderBox_nbWgWpA$lambda$1;
                }
            });
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2209textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m2220textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2220textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m833PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2210textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2221textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2221textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m833PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2208outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2218outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2218outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m833PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m2219textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        ComposerKt.sourceInformationMarkerStart(composer, 231892599, "C(textFieldColors)N(textColor:c#ui.graphics.Color,disabledTextColor:c#ui.graphics.Color,backgroundColor:c#ui.graphics.Color,cursorColor:c#ui.graphics.Color,errorCursorColor:c#ui.graphics.Color,focusedIndicatorColor:c#ui.graphics.Color,unfocusedIndicatorColor:c#ui.graphics.Color,disabledIndicatorColor:c#ui.graphics.Color,errorIndicatorColor:c#ui.graphics.Color,leadingIconColor:c#ui.graphics.Color,disabledLeadingIconColor:c#ui.graphics.Color,errorLeadingIconColor:c#ui.graphics.Color,trailingIconColor:c#ui.graphics.Color,disabledTrailingIconColor:c#ui.graphics.Color,errorTrailingIconColor:c#ui.graphics.Color,focusedLabelColor:c#ui.graphics.Color,unfocusedLabelColor:c#ui.graphics.Color,disabledLabelColor:c#ui.graphics.Color,errorLabelColor:c#ui.graphics.Color,placeholderColor:c#ui.graphics.Color,disabledPlaceholderColor:c#ui.graphics.Color)374@14935L7,374@14966L7,375@15039L8,376@15097L6,377@15190L6,378@15254L6,379@15321L6,379@15362L4,381@15436L6,382@15588L8,383@15650L6,384@15712L6,385@15841L8,387@15958L6,388@16089L8,389@16154L6,390@16217L6,390@16258L4,391@16316L6,391@16351L6,392@16434L8,393@16492L6,394@16554L6,394@16589L6,395@16675L8:TextFieldDefaults.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m5667unboximpl = ((Color) consume).m5667unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            j22 = Color.m5656copywmQWz5c$default(m5667unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j;
        }
        long m5656copywmQWz5c$default = (i4 & 2) != 0 ? Color.m5656copywmQWz5c$default(j22, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m5656copywmQWz5c$default2 = (i4 & 4) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1953getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1953getPrimary0d7_KjU() : j4;
        long m1947getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1947getError0d7_KjU() : j5;
        long m5656copywmQWz5c$default3 = (i4 & 32) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1953getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m5656copywmQWz5c$default4 = (i4 & 64) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j31 = m5656copywmQWz5c$default4;
            j23 = j31;
            j24 = Color.m5656copywmQWz5c$default(j31, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = m5656copywmQWz5c$default4;
            j24 = j8;
        }
        long m1947getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1947getError0d7_KjU() : j9;
        long m5656copywmQWz5c$default5 = (i4 & 512) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j32 = m5656copywmQWz5c$default5;
            j26 = Color.m5656copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j32;
        } else {
            j25 = m5656copywmQWz5c$default5;
            j26 = j11;
        }
        long j33 = (i4 & 2048) != 0 ? j25 : j12;
        long m5656copywmQWz5c$default6 = (i4 & 4096) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i4 & 8192) != 0) {
            long j34 = m5656copywmQWz5c$default6;
            j28 = Color.m5656copywmQWz5c$default(j34, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j34;
        } else {
            j27 = m5656copywmQWz5c$default6;
            j28 = j14;
        }
        long m1947getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1947getError0d7_KjU() : j15;
        long m5656copywmQWz5c$default7 = (32768 & i4) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1953getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m5656copywmQWz5c$default8 = (65536 & i4) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((131072 & i4) != 0) {
            long j35 = m5656copywmQWz5c$default8;
            j30 = Color.m5656copywmQWz5c$default(j35, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j29 = j35;
        } else {
            j29 = m5656copywmQWz5c$default8;
            j30 = j18;
        }
        long m1947getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1947getError0d7_KjU() : j19;
        long m5656copywmQWz5c$default9 = (524288 & i4) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m5656copywmQWz5c$default10 = (i4 & 1048576) != 0 ? Color.m5656copywmQWz5c$default(m5656copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:397)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(j22, m5656copywmQWz5c$default, m1953getPrimary0d7_KjU, m1947getError0d7_KjU, m5656copywmQWz5c$default3, j23, m1947getError0d7_KjU2, j24, j25, j26, j33, j27, j28, m1947getError0d7_KjU3, m5656copywmQWz5c$default2, m5656copywmQWz5c$default7, j29, j30, m1947getError0d7_KjU4, m5656copywmQWz5c$default9, m5656copywmQWz5c$default10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColors;
    }

    /* renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m2217outlinedTextFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        ComposerKt.sourceInformationMarkerStart(composer, 1762667317, "C(outlinedTextFieldColors)N(textColor:c#ui.graphics.Color,disabledTextColor:c#ui.graphics.Color,backgroundColor:c#ui.graphics.Color,cursorColor:c#ui.graphics.Color,errorCursorColor:c#ui.graphics.Color,focusedBorderColor:c#ui.graphics.Color,unfocusedBorderColor:c#ui.graphics.Color,disabledBorderColor:c#ui.graphics.Color,errorBorderColor:c#ui.graphics.Color,leadingIconColor:c#ui.graphics.Color,disabledLeadingIconColor:c#ui.graphics.Color,errorLeadingIconColor:c#ui.graphics.Color,trailingIconColor:c#ui.graphics.Color,disabledTrailingIconColor:c#ui.graphics.Color,errorTrailingIconColor:c#ui.graphics.Color,focusedLabelColor:c#ui.graphics.Color,unfocusedLabelColor:c#ui.graphics.Color,disabledLabelColor:c#ui.graphics.Color,errorLabelColor:c#ui.graphics.Color,placeholderColor:c#ui.graphics.Color,disabledPlaceholderColor:c#ui.graphics.Color)428@18205L7,428@18236L7,429@18309L8,431@18415L6,432@18479L6,433@18543L6,433@18584L4,435@18655L6,435@18698L8,436@18793L8,437@18852L6,438@18914L6,439@19043L8,441@19160L6,442@19291L8,443@19356L6,444@19419L6,444@19460L4,445@19518L6,445@19553L6,446@19636L8,447@19694L6,448@19756L6,448@19791L6,449@19877L8:TextFieldDefaults.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m5667unboximpl = ((Color) consume).m5667unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            j22 = Color.m5656copywmQWz5c$default(m5667unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j;
        }
        long m5656copywmQWz5c$default = (i4 & 2) != 0 ? Color.m5656copywmQWz5c$default(j22, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m5692getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m5692getTransparent0d7_KjU() : j3;
        long m1953getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1953getPrimary0d7_KjU() : j4;
        long m1947getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1947getError0d7_KjU() : j5;
        long m5656copywmQWz5c$default2 = (i4 & 32) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1953getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m5656copywmQWz5c$default3 = (i4 & 64) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j31 = m5656copywmQWz5c$default3;
            j23 = j31;
            j24 = Color.m5656copywmQWz5c$default(j31, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = m5656copywmQWz5c$default3;
            j24 = j8;
        }
        long m1947getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1947getError0d7_KjU() : j9;
        long m5656copywmQWz5c$default4 = (i4 & 512) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j32 = m5656copywmQWz5c$default4;
            j26 = Color.m5656copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j32;
        } else {
            j25 = m5656copywmQWz5c$default4;
            j26 = j11;
        }
        long j33 = (i4 & 2048) != 0 ? j25 : j12;
        long m5656copywmQWz5c$default5 = (i4 & 4096) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i4 & 8192) != 0) {
            long j34 = m5656copywmQWz5c$default5;
            j28 = Color.m5656copywmQWz5c$default(j34, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j34;
        } else {
            j27 = m5656copywmQWz5c$default5;
            j28 = j14;
        }
        long m1947getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1947getError0d7_KjU() : j15;
        long m5656copywmQWz5c$default6 = (32768 & i4) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1953getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m5656copywmQWz5c$default7 = (65536 & i4) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((131072 & i4) != 0) {
            long j35 = m5656copywmQWz5c$default7;
            j30 = Color.m5656copywmQWz5c$default(j35, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j29 = j35;
        } else {
            j29 = m5656copywmQWz5c$default7;
            j30 = j18;
        }
        long m1947getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1947getError0d7_KjU() : j19;
        long m5656copywmQWz5c$default8 = (524288 & i4) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m5656copywmQWz5c$default9 = (i4 & 1048576) != 0 ? Color.m5656copywmQWz5c$default(m5656copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, i, i2, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:451)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(j22, m5656copywmQWz5c$default, m1953getPrimary0d7_KjU, m1947getError0d7_KjU, m5656copywmQWz5c$default2, j23, m1947getError0d7_KjU2, j24, j25, j26, j33, j27, j28, m1947getError0d7_KjU3, m5692getTransparent0d7_KjU, m5656copywmQWz5c$default6, j29, j30, m1947getError0d7_KjU4, m5656copywmQWz5c$default8, m5656copywmQWz5c$default9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextFieldDecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i, final int i2, int i3) {
        int i4;
        int i5;
        final boolean z4;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        int i14;
        Shape shape3;
        Shape shape4;
        int i15;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        Shape shape5;
        TextFieldColors textFieldColors4;
        boolean z5;
        PaddingValues m2209textFieldWithLabelPaddinga9UjIt4$default;
        int i16;
        int i17;
        int i18;
        int i19 = i3;
        Composer startRestartGroup = composer.startRestartGroup(2088762355);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldDecorationBox)N(value,innerTextField,enabled,singleLine,visualTransformation,interactionSource,isError,label,placeholder,leadingIcon,trailingIcon,shape,colors,contentPadding)548@25578L624:TextFieldDefaults.kt#jmzs0o");
        if ((i19 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i19 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
            if ((i19 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                int i20 = 1024;
                if ((i19 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if ((i19 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                        if ((i19 & 32) != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                        }
                        i5 = i19 & 64;
                        if (i5 != 0) {
                            i4 |= 1572864;
                            z4 = z3;
                        } else {
                            z4 = z3;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                            }
                        }
                        i6 = i19 & 128;
                        if (i6 != 0) {
                            i4 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i & 12582912) == 0) {
                                i4 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i7 = i19 & 256;
                        if (i7 != 0) {
                            i4 |= 100663296;
                            function27 = function23;
                        } else {
                            function27 = function23;
                            if ((i & 100663296) == 0) {
                                i4 |= startRestartGroup.changedInstance(function27) ? 67108864 : 33554432;
                            }
                        }
                        i8 = i19 & 512;
                        if (i8 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= startRestartGroup.changedInstance(function24) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            i10 = i19 & 1024;
                            if (i10 == 0) {
                                i12 = i2 | 6;
                                i11 = i10;
                            } else if ((i2 & 6) == 0) {
                                i11 = i10;
                                i12 = i2 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i11 = i10;
                                i12 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                if ((i19 & 2048) == 0 && startRestartGroup.changed(shape)) {
                                    i18 = 32;
                                    i12 |= i18;
                                }
                                i18 = 16;
                                i12 |= i18;
                            }
                            if ((i2 & 384) == 0) {
                                if ((i19 & 4096) == 0 && startRestartGroup.changed(textFieldColors)) {
                                    i17 = 256;
                                    i12 |= i17;
                                }
                                i17 = 128;
                                i12 |= i17;
                            }
                            if ((i2 & 3072) == 0) {
                                if ((i19 & 8192) == 0 && startRestartGroup.changed(paddingValues)) {
                                    i20 = 2048;
                                }
                                i12 |= i20;
                            }
                            i13 = i12;
                            if ((i19 & 16384) == 0) {
                                i13 |= 24576;
                            } else if ((i2 & 24576) == 0) {
                                i13 |= startRestartGroup.changed(this) ? 16384 : 8192;
                            }
                            if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 9363) != 9362, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "539@25293L14,540@25343L17");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i5 != 0 ? false : z4;
                                    Function2<? super Composer, ? super Integer, Unit> function212 = i6 != 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function213 = i7 != 0 ? null : function27;
                                    Function2<? super Composer, ? super Integer, Unit> function214 = i9 != 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function215 = i11 != 0 ? null : function25;
                                    if ((i19 & 2048) != 0) {
                                        Shape textFieldShape = getTextFieldShape(startRestartGroup, (i13 >> 12) & 14);
                                        i14 = i13 & BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                        shape3 = textFieldShape;
                                    } else {
                                        i14 = i13;
                                        shape3 = shape;
                                    }
                                    if ((i19 & 4096) != 0) {
                                        int i21 = i14;
                                        shape4 = shape3;
                                        i15 = i4;
                                        textFieldColors3 = m2219textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i14 >> 9) & 112, 2097151);
                                        composer2 = startRestartGroup;
                                        i13 = i21 & (-897);
                                    } else {
                                        shape4 = shape3;
                                        i13 = i14;
                                        composer2 = startRestartGroup;
                                        i15 = i4;
                                        textFieldColors3 = textFieldColors;
                                    }
                                    i19 = i3;
                                    if ((i19 & 8192) != 0) {
                                        if (function212 == null) {
                                            m2209textFieldWithLabelPaddinga9UjIt4$default = m2210textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            m2209textFieldWithLabelPaddinga9UjIt4$default = m2209textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i13 &= -7169;
                                        shape5 = shape4;
                                        paddingValues3 = m2209textFieldWithLabelPaddinga9UjIt4$default;
                                    } else {
                                        paddingValues3 = paddingValues;
                                        shape5 = shape4;
                                    }
                                    textFieldColors4 = textFieldColors3;
                                    z5 = z6;
                                    function29 = function212;
                                    function210 = function213;
                                    function28 = function214;
                                    function211 = function215;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i19 & 2048) != 0) {
                                        i13 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                    }
                                    if ((i19 & 4096) != 0) {
                                        i13 &= -897;
                                    }
                                    if ((i19 & 8192) != 0) {
                                        i13 &= -7169;
                                    }
                                    function28 = function24;
                                    shape5 = shape;
                                    textFieldColors4 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    composer2 = startRestartGroup;
                                    i15 = i4;
                                    function29 = function26;
                                    function210 = function27;
                                    function211 = function25;
                                    z5 = z4;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i16 = i15;
                                    ComposerKt.traceEventStart(2088762355, i16, i13, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:547)");
                                } else {
                                    i16 = i15;
                                }
                                TextFieldType textFieldType = TextFieldType.Filled;
                                int i22 = i16 << 3;
                                int i23 = i16 >> 9;
                                int i24 = (i22 & 896) | (i22 & 112) | 6 | ((i16 >> 3) & 7168) | (57344 & i23) | (458752 & i23) | (i23 & 3670016) | ((i13 << 21) & 29360128) | ((i16 << 15) & 234881024) | ((i16 << 21) & 1879048192);
                                int i25 = ((i16 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i16 >> 12) & 112) | ((i13 >> 3) & 896);
                                int i26 = i13 << 6;
                                TextFieldImplKt.CommonDecorationBox(textFieldType, str, function2, visualTransformation, function29, function210, function28, function211, z2, z, z5, interactionSource, paddingValues3, shape5, textFieldColors4, null, composer2, i24, i25 | (i26 & 7168) | (i26 & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z4 = z5;
                                paddingValues2 = paddingValues3;
                                shape2 = shape5;
                                textFieldColors2 = textFieldColors4;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                function28 = function24;
                                shape2 = shape;
                                textFieldColors2 = textFieldColors;
                                function29 = function26;
                                function210 = function27;
                                function211 = function25;
                                paddingValues2 = paddingValues;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                final int i27 = i19;
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit TextFieldDecorationBox$lambda$2;
                                        TextFieldDecorationBox$lambda$2 = TextFieldDefaults.TextFieldDecorationBox$lambda$2(TextFieldDefaults.this, str, function2, z, z2, visualTransformation, interactionSource, z4, function29, function210, function28, function211, shape2, textFieldColors2, paddingValues2, i, i2, i27, (Composer) obj, ((Integer) obj2).intValue());
                                        return TextFieldDecorationBox$lambda$2;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        i10 = i19 & 1024;
                        if (i10 == 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & 384) == 0) {
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        i13 = i12;
                        if ((i19 & 16384) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 9363) != 9362, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i19 & 32) != 0) {
                    }
                    i5 = i19 & 64;
                    if (i5 != 0) {
                    }
                    i6 = i19 & 128;
                    if (i6 != 0) {
                    }
                    i7 = i19 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i19 & 512;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i19 & 1024;
                    if (i10 == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    i13 = i12;
                    if ((i19 & 16384) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 9363) != 9362, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i19 & 16) == 0) {
                }
                if ((i19 & 32) != 0) {
                }
                i5 = i19 & 64;
                if (i5 != 0) {
                }
                i6 = i19 & 128;
                if (i6 != 0) {
                }
                i7 = i19 & 256;
                if (i7 != 0) {
                }
                i8 = i19 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i19 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                i13 = i12;
                if ((i19 & 16384) == 0) {
                }
                if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 9363) != 9362, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            int i202 = 1024;
            if ((i19 & 8) != 0) {
            }
            if ((i19 & 16) == 0) {
            }
            if ((i19 & 32) != 0) {
            }
            i5 = i19 & 64;
            if (i5 != 0) {
            }
            i6 = i19 & 128;
            if (i6 != 0) {
            }
            i7 = i19 & 256;
            if (i7 != 0) {
            }
            i8 = i19 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i19 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            i13 = i12;
            if ((i19 & 16384) == 0) {
            }
            if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i19 & 4) == 0) {
        }
        int i2022 = 1024;
        if ((i19 & 8) != 0) {
        }
        if ((i19 & 16) == 0) {
        }
        if ((i19 & 32) != 0) {
        }
        i5 = i19 & 64;
        if (i5 != 0) {
        }
        i6 = i19 & 128;
        if (i6 != 0) {
        }
        i7 = i19 & 256;
        if (i7 != 0) {
        }
        i8 = i19 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i19 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i13 = i12;
        if ((i19 & 16384) == 0) {
        }
        if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTextFieldDecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function26, Composer composer, final int i, final int i2, int i3) {
        int i4;
        int i5;
        final boolean z4;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        boolean z5;
        Composer composer3;
        int i15;
        int i16;
        int i17;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        boolean z6;
        TextFieldColors textFieldColors4;
        Shape shape4;
        Function2<? super Composer, ? super Integer, Unit> function214;
        PaddingValues paddingValues4;
        TextFieldColors textFieldColors5;
        Shape shape5;
        boolean z7;
        int i18;
        int i19;
        int i20;
        int i21 = i3;
        Composer startRestartGroup = composer.startRestartGroup(1154925202);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldDecorationBox)N(value,innerTextField,enabled,singleLine,visualTransformation,interactionSource,isError,label,placeholder,leadingIcon,trailingIcon,shape,colors,contentPadding,border)641@30953L628:TextFieldDefaults.kt#jmzs0o");
        if ((i21 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i21 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
            if ((i21 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                int i22 = 1024;
                if ((i21 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if ((i21 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                        if ((i21 & 32) != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                        }
                        i5 = i21 & 64;
                        if (i5 != 0) {
                            i4 |= 1572864;
                            z4 = z3;
                        } else {
                            z4 = z3;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                            }
                        }
                        i6 = i21 & 128;
                        if (i6 != 0) {
                            i4 |= 12582912;
                            function27 = function22;
                        } else {
                            function27 = function22;
                            if ((i & 12582912) == 0) {
                                i4 |= startRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                            }
                        }
                        i7 = i21 & 256;
                        if (i7 != 0) {
                            i4 |= 100663296;
                            function28 = function23;
                        } else {
                            function28 = function23;
                            if ((i & 100663296) == 0) {
                                i4 |= startRestartGroup.changedInstance(function28) ? 67108864 : 33554432;
                            }
                        }
                        i8 = i21 & 512;
                        if (i8 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= startRestartGroup.changedInstance(function24) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            i10 = i21 & 1024;
                            if (i10 == 0) {
                                i12 = i2 | 6;
                                i11 = i10;
                            } else if ((i2 & 6) == 0) {
                                i11 = i10;
                                i12 = i2 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i11 = i10;
                                i12 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                if ((i21 & 2048) == 0 && startRestartGroup.changed(shape)) {
                                    i20 = 32;
                                    i12 |= i20;
                                }
                                i20 = 16;
                                i12 |= i20;
                            }
                            if ((i2 & 384) == 0) {
                                if ((i21 & 4096) == 0 && startRestartGroup.changed(textFieldColors)) {
                                    i19 = 256;
                                    i12 |= i19;
                                }
                                i19 = 128;
                                i12 |= i19;
                            }
                            if ((i2 & 3072) == 0) {
                                if ((i21 & 8192) == 0 && startRestartGroup.changed(paddingValues)) {
                                    i22 = 2048;
                                }
                                i12 |= i22;
                            }
                            int i23 = i12;
                            i13 = i21 & 16384;
                            if (i13 == 0) {
                                i14 = i23 | 24576;
                            } else {
                                i14 = i23;
                                if ((i2 & 24576) == 0) {
                                    i14 |= startRestartGroup.changedInstance(function26) ? 16384 : 8192;
                                    if ((i21 & 32768) != 0) {
                                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i14 |= startRestartGroup.changed(this) ? 131072 : 65536;
                                    }
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 74899) != 74898, i4 & 1)) {
                                        startRestartGroup.startDefaults();
                                        ComposerKt.sourceInformation(startRestartGroup, "634@30656L22,635@30714L25,637@30850L85");
                                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                            boolean z8 = i5 != 0 ? false : z4;
                                            Function2<? super Composer, ? super Integer, Unit> function215 = i6 != 0 ? null : function27;
                                            Function2<? super Composer, ? super Integer, Unit> function216 = i7 != 0 ? null : function28;
                                            Function2<? super Composer, ? super Integer, Unit> function217 = i9 != 0 ? null : function24;
                                            Function2<? super Composer, ? super Integer, Unit> function218 = i11 != 0 ? null : function25;
                                            if ((i21 & 2048) != 0) {
                                                Shape outlinedTextFieldShape = getOutlinedTextFieldShape(startRestartGroup, (i14 >> 15) & 14);
                                                i14 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                                shape3 = outlinedTextFieldShape;
                                            } else {
                                                shape3 = shape;
                                            }
                                            if ((i21 & 4096) != 0) {
                                                i17 = i13;
                                                z5 = z8;
                                                i15 = i4;
                                                textFieldColors3 = m2217outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i14 >> 12) & 112, 2097151);
                                                composer3 = startRestartGroup;
                                                i16 = i14 & (-897);
                                            } else {
                                                z5 = z8;
                                                composer3 = startRestartGroup;
                                                i15 = i4;
                                                i16 = i14;
                                                i17 = i13;
                                                textFieldColors3 = textFieldColors;
                                            }
                                            i21 = i3;
                                            if ((i21 & 8192) != 0) {
                                                paddingValues3 = m2208outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                                i16 &= -7169;
                                            } else {
                                                paddingValues3 = paddingValues;
                                            }
                                            if (i17 != 0) {
                                                final boolean z9 = z5;
                                                final TextFieldColors textFieldColors6 = textFieldColors3;
                                                final Shape shape6 = shape3;
                                                z6 = z9;
                                                textFieldColors4 = textFieldColors6;
                                                shape4 = shape6;
                                                function214 = ComposableLambdaKt.rememberComposableLambda(1212923596, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i24) {
                                                        ComposerKt.sourceInformation(composer4, "C638@30864L61:TextFieldDefaults.kt#jmzs0o");
                                                        if (!composer4.shouldExecute((i24 & 3) != 2, i24 & 1)) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1212923596, i24, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:638)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.m2211BorderBoxnbWgWpA(z, z9, interactionSource, textFieldColors6, shape6, 0.0f, 0.0f, composer4, 12582912, 96);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54);
                                            } else {
                                                z6 = z5;
                                                textFieldColors4 = textFieldColors3;
                                                shape4 = shape3;
                                                function214 = function26;
                                            }
                                            paddingValues4 = paddingValues3;
                                            textFieldColors5 = textFieldColors4;
                                            shape5 = shape4;
                                            z7 = z6;
                                            function211 = function215;
                                            function212 = function216;
                                            function29 = function217;
                                            function213 = function218;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i21 & 2048) != 0) {
                                                i14 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                            }
                                            i16 = i14;
                                            if ((i21 & 4096) != 0) {
                                                i16 &= -897;
                                            }
                                            if ((i21 & 8192) != 0) {
                                                i16 &= -7169;
                                            }
                                            function29 = function24;
                                            shape5 = shape;
                                            textFieldColors5 = textFieldColors;
                                            paddingValues4 = paddingValues;
                                            function214 = function26;
                                            composer3 = startRestartGroup;
                                            i15 = i4;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function25;
                                            z7 = z4;
                                        }
                                        composer3.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            i18 = i15;
                                            ComposerKt.traceEventStart(1154925202, i18, i16, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:640)");
                                        } else {
                                            i18 = i15;
                                        }
                                        int i24 = i18 << 3;
                                        int i25 = i18 >> 9;
                                        int i26 = i16 << 6;
                                        Composer composer4 = composer3;
                                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function211, function212, function29, function213, z2, z, z7, interactionSource, paddingValues4, shape5, textFieldColors5, function214, composer4, (i24 & 896) | (i24 & 112) | 6 | ((i18 >> 3) & 7168) | (57344 & i25) | (458752 & i25) | (i25 & 3670016) | ((i16 << 21) & 29360128) | ((i18 << 15) & 234881024) | ((i18 << 21) & 1879048192), ((i18 >> 18) & 14) | ((i18 >> 12) & 112) | ((i16 >> 3) & 896) | (i26 & 7168) | (i26 & 57344) | ((i16 << 3) & 458752));
                                        composer2 = composer4;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z4 = z7;
                                        paddingValues2 = paddingValues4;
                                        shape2 = shape5;
                                        textFieldColors2 = textFieldColors5;
                                        function210 = function214;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        function29 = function24;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        function210 = function26;
                                        function211 = function27;
                                        function212 = function28;
                                        function213 = function25;
                                        paddingValues2 = paddingValues;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final int i27 = i21;
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit OutlinedTextFieldDecorationBox$lambda$3;
                                                OutlinedTextFieldDecorationBox$lambda$3 = TextFieldDefaults.OutlinedTextFieldDecorationBox$lambda$3(TextFieldDefaults.this, str, function2, z, z2, visualTransformation, interactionSource, z4, function211, function212, function29, function213, shape2, textFieldColors2, paddingValues2, function210, i, i2, i27, (Composer) obj, ((Integer) obj2).intValue());
                                                return OutlinedTextFieldDecorationBox$lambda$3;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            if ((i21 & 32768) != 0) {
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 74899) != 74898, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i9 = i8;
                        i10 = i21 & 1024;
                        if (i10 == 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & 384) == 0) {
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        int i232 = i12;
                        i13 = i21 & 16384;
                        if (i13 == 0) {
                        }
                        if ((i21 & 32768) != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 74899) != 74898, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i21 & 32) != 0) {
                    }
                    i5 = i21 & 64;
                    if (i5 != 0) {
                    }
                    i6 = i21 & 128;
                    if (i6 != 0) {
                    }
                    i7 = i21 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i21 & 512;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i21 & 1024;
                    if (i10 == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    int i2322 = i12;
                    i13 = i21 & 16384;
                    if (i13 == 0) {
                    }
                    if ((i21 & 32768) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 74899) != 74898, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i21 & 16) == 0) {
                }
                if ((i21 & 32) != 0) {
                }
                i5 = i21 & 64;
                if (i5 != 0) {
                }
                i6 = i21 & 128;
                if (i6 != 0) {
                }
                i7 = i21 & 256;
                if (i7 != 0) {
                }
                i8 = i21 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i21 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                int i23222 = i12;
                i13 = i21 & 16384;
                if (i13 == 0) {
                }
                if ((i21 & 32768) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 74899) != 74898, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            int i222 = 1024;
            if ((i21 & 8) != 0) {
            }
            if ((i21 & 16) == 0) {
            }
            if ((i21 & 32) != 0) {
            }
            i5 = i21 & 64;
            if (i5 != 0) {
            }
            i6 = i21 & 128;
            if (i6 != 0) {
            }
            i7 = i21 & 256;
            if (i7 != 0) {
            }
            i8 = i21 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i21 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i232222 = i12;
            i13 = i21 & 16384;
            if (i13 == 0) {
            }
            if ((i21 & 32768) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i21 & 4) == 0) {
        }
        int i2222 = 1024;
        if ((i21 & 8) != 0) {
        }
        if ((i21 & 16) == 0) {
        }
        if ((i21 & 32) != 0) {
        }
        i5 = i21 & 64;
        if (i5 != 0) {
        }
        i6 = i21 & 128;
        if (i6 != 0) {
        }
        i7 = i21 & 256;
        if (i7 != 0) {
        }
        i8 = i21 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i21 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i2322222 = i12;
        i13 = i21 & 16384;
        if (i13 == 0) {
        }
        if ((i21 & 32768) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void TextFieldDecorationBox(final String str, final Function2 function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z4;
        int i6;
        Function2 function26;
        int i7;
        Function2 function27;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final Function2 function28;
        final TextFieldColors textFieldColors2;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        int i14;
        int i15;
        TextFieldColors textFieldColors3;
        int i16;
        TextFieldDefaults textFieldDefaults;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        Function2 function215;
        PaddingValues m2209textFieldWithLabelPaddinga9UjIt4$default;
        int i17;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(-380568);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldDecorationBox)N(value,innerTextField,enabled,singleLine,visualTransformation,interactionSource,isError,label,placeholder,leadingIcon,trailingIcon,colors,contentPadding)699@33036L14,687@32567L568:TextFieldDefaults.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                        if ((i3 & 32) != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                        }
                        i5 = i3 & 64;
                        if (i5 != 0) {
                            i4 |= 1572864;
                            z4 = z3;
                        } else {
                            z4 = z3;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                            }
                        }
                        i6 = i3 & 128;
                        if (i6 != 0) {
                            i4 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i & 12582912) == 0) {
                                i4 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i7 = i3 & 256;
                        if (i7 != 0) {
                            i4 |= 100663296;
                            function27 = function23;
                        } else {
                            function27 = function23;
                            if ((i & 100663296) == 0) {
                                i4 |= startRestartGroup.changedInstance(function27) ? 67108864 : 33554432;
                            }
                        }
                        i8 = i3 & 512;
                        if (i8 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= startRestartGroup.changedInstance(function24) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            i10 = i3 & 1024;
                            if (i10 == 0) {
                                i12 = i2 | 6;
                                i11 = i10;
                            } else if ((i2 & 6) == 0) {
                                i11 = i10;
                                i12 = i2 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i11 = i10;
                                i12 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                if ((i3 & 2048) == 0 && startRestartGroup.changed(textFieldColors)) {
                                    i19 = 32;
                                    i12 |= i19;
                                }
                                i19 = 16;
                                i12 |= i19;
                            }
                            if ((i2 & 384) == 0) {
                                if ((i3 & 4096) == 0 && startRestartGroup.changed(paddingValues)) {
                                    i18 = 256;
                                    i12 |= i18;
                                }
                                i18 = 128;
                                i12 |= i18;
                            }
                            i13 = i12;
                            if ((i3 & 8192) == 0) {
                                i13 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i13 |= startRestartGroup.changed(this) ? 2048 : 1024;
                            }
                            if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 1171) != 1170, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "679@32332L17");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z5 = i5 != 0 ? false : z4;
                                    Function2 function216 = i6 != 0 ? null : function26;
                                    Function2 function217 = i7 != 0 ? null : function27;
                                    Function2 function218 = i9 != 0 ? null : function24;
                                    Function2 function219 = i11 != 0 ? null : function25;
                                    if ((i3 & 2048) != 0) {
                                        int i20 = (i13 >> 6) & 112;
                                        int i21 = i13;
                                        i15 = i4;
                                        i14 = i3;
                                        textFieldColors3 = m2219textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, i20, 2097151);
                                        startRestartGroup = startRestartGroup;
                                        i16 = i21 & BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                    } else {
                                        int i22 = i13;
                                        i14 = i3;
                                        i15 = i4;
                                        textFieldColors3 = textFieldColors;
                                        i16 = i22;
                                    }
                                    if ((i14 & 4096) != 0) {
                                        if (function216 == null) {
                                            m2209textFieldWithLabelPaddinga9UjIt4$default = m2210textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            textFieldDefaults = this;
                                        } else {
                                            m2209textFieldWithLabelPaddinga9UjIt4$default = m2209textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            textFieldDefaults = this;
                                        }
                                        i16 &= -897;
                                        textFieldColors2 = textFieldColors3;
                                        paddingValues2 = m2209textFieldWithLabelPaddinga9UjIt4$default;
                                    } else {
                                        textFieldDefaults = this;
                                        paddingValues2 = paddingValues;
                                        textFieldColors2 = textFieldColors3;
                                    }
                                    z4 = z5;
                                    function212 = function216;
                                    function213 = function217;
                                    function214 = function218;
                                    function215 = function219;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 2048) != 0) {
                                        i13 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i13 &= -897;
                                    }
                                    textFieldDefaults = this;
                                    function214 = function24;
                                    textFieldColors2 = textFieldColors;
                                    i16 = i13;
                                    i15 = i4;
                                    function212 = function26;
                                    function213 = function27;
                                    function215 = function25;
                                    paddingValues2 = paddingValues;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i17 = i15;
                                    ComposerKt.traceEventStart(-380568, i17, i16, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:687)");
                                } else {
                                    i17 = i15;
                                }
                                int i23 = i16 & 14;
                                int i24 = i16 << 3;
                                textFieldDefaults.TextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z4, function212, function213, function214, function215, textFieldDefaults.getTextFieldShape(startRestartGroup, (i16 >> 9) & 14), textFieldColors2, paddingValues2, startRestartGroup, i17 & 2147483646, i23 | (i24 & 896) | (i24 & 7168) | (i24 & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function28 = function215;
                                function211 = function214;
                                function210 = function213;
                                function29 = function212;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function28 = function25;
                                textFieldColors2 = textFieldColors;
                                function29 = function26;
                                function210 = function27;
                                function211 = function24;
                                paddingValues2 = paddingValues;
                            }
                            final boolean z6 = z4;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit TextFieldDecorationBox$lambda$4;
                                        TextFieldDecorationBox$lambda$4 = TextFieldDefaults.TextFieldDecorationBox$lambda$4(TextFieldDefaults.this, str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function210, function211, function28, textFieldColors2, paddingValues2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return TextFieldDecorationBox$lambda$4;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i9 = i8;
                        i10 = i3 & 1024;
                        if (i10 == 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & 384) == 0) {
                        }
                        i13 = i12;
                        if ((i3 & 8192) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 1171) != 1170, i4 & 1)) {
                        }
                        final boolean z62 = z4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & 32) != 0) {
                    }
                    i5 = i3 & 64;
                    if (i5 != 0) {
                    }
                    i6 = i3 & 128;
                    if (i6 != 0) {
                    }
                    i7 = i3 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    i13 = i12;
                    if ((i3 & 8192) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 1171) != 1170, i4 & 1)) {
                    }
                    final boolean z622 = z4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) != 0) {
                }
                i5 = i3 & 64;
                if (i5 != 0) {
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                i13 = i12;
                if ((i3 & 8192) == 0) {
                }
                if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 1171) != 1170, i4 & 1)) {
                }
                final boolean z6222 = z4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i5 = i3 & 64;
            if (i5 != 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            i13 = i12;
            if ((i3 & 8192) == 0) {
            }
            if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 1171) != 1170, i4 & 1)) {
            }
            final boolean z62222 = z4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        i13 = i12;
        if ((i3 & 8192) == 0) {
        }
        if (!startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i13 & 1171) != 1170, i4 & 1)) {
        }
        final boolean z622222 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0199, code lost:
    
        if (r7.changed(r74) == false) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(final String str, final Function2 function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        final boolean z4;
        int i6;
        Function2 function27;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Function2 function28;
        final Function2 function29;
        final Function2 function210;
        final PaddingValues paddingValues2;
        final Function2 function211;
        final boolean z5;
        final Function2 function212;
        final TextFieldColors textFieldColors2;
        ScopeUpdateScope endRestartGroup;
        Function2 function213;
        boolean z6;
        int i15;
        Composer composer3;
        int i16;
        int i17;
        final TextFieldColors textFieldColors3;
        int i18;
        TextFieldDefaults textFieldDefaults;
        PaddingValues paddingValues3;
        final boolean z7;
        Function2 function214;
        Function2 function215;
        Function2 function216;
        int i19;
        int i20;
        Composer startRestartGroup = composer.startRestartGroup(-2141154809);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldDecorationBox)N(value,innerTextField,enabled,singleLine,visualTransformation,interactionSource,isError,label,placeholder,leadingIcon,trailingIcon,colors,contentPadding,border)738@34577L22,726@34100L613:TextFieldDefaults.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
            int i21 = 256;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                    if ((i3 & 32) == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i5 = i3 & 64;
                    if (i5 == 0) {
                        i4 |= 1572864;
                        z4 = z3;
                    } else {
                        z4 = z3;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                        function27 = function22;
                    } else {
                        function27 = function22;
                        if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                        }
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changedInstance(function24) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i12 = i2 | 6;
                            i11 = i10;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            if ((i3 & 2048) == 0 && startRestartGroup.changed(textFieldColors)) {
                                i20 = 32;
                                i12 |= i20;
                            }
                            i20 = 16;
                            i12 |= i20;
                        }
                        if ((i2 & 384) == 0) {
                            if ((i3 & 4096) != 0) {
                            }
                            i21 = 128;
                            i12 |= i21;
                        }
                        int i22 = i12;
                        i13 = i3 & 8192;
                        if (i13 != 0) {
                            i14 = i22 | 3072;
                        } else {
                            int i23 = i22;
                            if ((i2 & 3072) == 0) {
                                i23 |= startRestartGroup.changedInstance(function26) ? 2048 : 1024;
                            }
                            i14 = i23;
                        }
                        if ((i3 & 16384) != 0) {
                            i14 |= 24576;
                        } else if ((i2 & 24576) == 0) {
                            i14 |= startRestartGroup.changed(this) ? 16384 : 8192;
                        }
                        if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i14 & 9363) != 9362, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "722@33888L25,724@34024L58");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                boolean z8 = i5 != 0 ? false : z4;
                                Function2 function217 = i6 != 0 ? null : function27;
                                function213 = i7 != 0 ? null : function23;
                                Function2 function218 = i9 != 0 ? null : function24;
                                Function2 function219 = i11 != 0 ? null : function25;
                                if ((i3 & 2048) != 0) {
                                    int i24 = i14;
                                    i17 = i13;
                                    i15 = i3;
                                    z6 = z8;
                                    i16 = i4;
                                    textFieldColors3 = m2217outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i14 >> 9) & 112, 2097151);
                                    composer3 = startRestartGroup;
                                    i18 = i24 & BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                } else {
                                    z6 = z8;
                                    int i25 = i14;
                                    i15 = i3;
                                    composer3 = startRestartGroup;
                                    i16 = i4;
                                    i17 = i13;
                                    textFieldColors3 = textFieldColors;
                                    i18 = i25;
                                }
                                if ((i15 & 4096) != 0) {
                                    paddingValues3 = m2208outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    textFieldDefaults = this;
                                    i18 &= -897;
                                } else {
                                    textFieldDefaults = this;
                                    paddingValues3 = paddingValues;
                                }
                                if (i17 != 0) {
                                    z7 = z;
                                    z4 = z6;
                                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1922186815, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i26) {
                                            ComposerKt.sourceInformation(composer4, "C724@34026L54:TextFieldDefaults.kt#jmzs0o");
                                            if (!composer4.shouldExecute((i26 & 3) != 2, i26 & 1)) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1922186815, i26, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:724)");
                                            }
                                            TextFieldDefaults.INSTANCE.m2211BorderBoxnbWgWpA(z7, z4, interactionSource, textFieldColors3, null, 0.0f, 0.0f, composer4, 12582912, 112);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    textFieldColors2 = textFieldColors3;
                                    i14 = i18;
                                    paddingValues2 = paddingValues3;
                                    function211 = rememberComposableLambda;
                                } else {
                                    z7 = z;
                                    z4 = z6;
                                    function211 = function26;
                                    textFieldColors2 = textFieldColors3;
                                    i14 = i18;
                                    paddingValues2 = paddingValues3;
                                }
                                function214 = function217;
                                function215 = function218;
                                function216 = function219;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 2048) != 0) {
                                    i14 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                                }
                                if ((i3 & 4096) != 0) {
                                    i14 &= -897;
                                }
                                function213 = function23;
                                function215 = function24;
                                paddingValues2 = paddingValues;
                                function211 = function26;
                                composer3 = startRestartGroup;
                                i16 = i4;
                                function214 = function27;
                                function216 = function25;
                                textFieldColors2 = textFieldColors;
                                z7 = z;
                                textFieldDefaults = this;
                            }
                            composer3.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                i19 = i16;
                                ComposerKt.traceEventStart(-2141154809, i19, i14, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:726)");
                            } else {
                                i19 = i16;
                            }
                            int i26 = i14 & 14;
                            int i27 = i14 << 3;
                            int i28 = i26 | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (i27 & 458752);
                            Composer composer4 = composer3;
                            boolean z9 = z7;
                            boolean z10 = z4;
                            Function2 function220 = function213;
                            textFieldDefaults.OutlinedTextFieldDecorationBox(str, function2, z9, z2, visualTransformation, interactionSource, z10, function214, function220, function215, function216, textFieldDefaults.getOutlinedTextFieldShape(composer3, (i14 >> 12) & 14), textFieldColors2, paddingValues2, function211, composer4, i19 & 2147483646, i28, 0);
                            composer2 = composer4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function210 = function216;
                            function29 = function215;
                            function28 = function220;
                            function212 = function214;
                            z5 = z10;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            function28 = function23;
                            function29 = function24;
                            function210 = function25;
                            paddingValues2 = paddingValues;
                            function211 = function26;
                            z5 = z4;
                            function212 = function27;
                            textFieldColors2 = textFieldColors;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit OutlinedTextFieldDecorationBox$lambda$5;
                                    OutlinedTextFieldDecorationBox$lambda$5 = TextFieldDefaults.OutlinedTextFieldDecorationBox$lambda$5(TextFieldDefaults.this, str, function2, z, z2, visualTransformation, interactionSource, z5, function212, function28, function29, function210, textFieldColors2, paddingValues2, function211, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return OutlinedTextFieldDecorationBox$lambda$5;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    int i222 = i12;
                    i13 = i3 & 8192;
                    if (i13 != 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i14 & 9363) != 9362, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i3 & 32) == 0) {
                }
                i5 = i3 & 64;
                if (i5 == 0) {
                }
                i6 = i3 & 128;
                if (i6 == 0) {
                }
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                int i2222 = i12;
                i13 = i3 & 8192;
                if (i13 != 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i14 & 9363) != 9362, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            i5 = i3 & 64;
            if (i5 == 0) {
            }
            i6 = i3 & 128;
            if (i6 == 0) {
            }
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            int i22222 = i12;
            i13 = i3 & 8192;
            if (i13 != 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i14 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        int i212 = 256;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        int i222222 = i12;
        i13 = i3 & 8192;
        if (i13 != 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i14 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m2216indicatorLinegv0btCI(Modifier modifier, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f, final float f2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set(ViewProps.ENABLED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m8399boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m8399boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                State m2223animateBorderStrokeAsStateNuRrP5Q;
                composer.startReplaceGroup(1398930845);
                ComposerKt.sourceInformation(composer, "C289@11188L375:TextFieldDefaults.kt#jmzs0o");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1398930845, i, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:288)");
                }
                m2223animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m2223animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f, f2, composer, 0);
                Modifier drawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) m2223animateBorderStrokeAsStateNuRrP5Q.getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return drawIndicatorLine;
            }
        });
    }
}
