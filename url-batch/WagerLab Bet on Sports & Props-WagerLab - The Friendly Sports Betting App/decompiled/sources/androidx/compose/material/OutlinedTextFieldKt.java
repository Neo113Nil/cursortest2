package androidx.compose.material;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
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
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0085\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0002\u0010$\u001a\u0093\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00101\u001a\u0087\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00102\u001a\u0093\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u0002032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00104\u001a\u0087\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010%\u001a\u0002032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u00105\u001aÁ\u0001\u00106\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\r2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010(¢\u0006\u0002\b\r2\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u00108\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u00109\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010:\u001a\u00020;2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00010(2\u0011\u0010>\u001a\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\r2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\u0010A\u001aW\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020;2\u0006\u0010?\u001a\u00020@H\u0002¢\u0006\u0004\bK\u0010L\u001aW\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020/2\u0006\u0010O\u001a\u00020/2\u0006\u0010P\u001a\u00020/2\u0006\u0010Q\u001a\u00020/2\u0006\u0010R\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020;2\u0006\u0010?\u001a\u00020@H\u0002¢\u0006\u0004\bS\u0010L\u001a|\u0010T\u001a\u00020\u0001*\u00020U2\u0006\u0010V\u001a\u00020/2\u0006\u0010W\u001a\u00020/2\b\u0010X\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010[\u001a\u00020Y2\b\u0010\\\u001a\u0004\u0018\u00010Y2\b\u0010]\u001a\u0004\u0018\u00010Y2\u0006\u0010^\u001a\u00020Y2\u0006\u0010:\u001a\u00020;2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010J\u001a\u00020;2\u0006\u0010_\u001a\u00020`2\u0006\u0010?\u001a\u00020@H\u0002\u001a#\u0010a\u001a\u00020\u0005*\u00020\u00052\u0006\u0010b\u001a\u00020=2\u0006\u0010?\u001a\u00020@H\u0000¢\u0006\u0004\bc\u0010d\"\u0010\u0010e\u001a\u00020fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010g\"\u0016\u0010h\u001a\u00020iX\u0080\u0004¢\u0006\n\n\u0002\u0010l\u001a\u0004\bj\u0010k\"\u000e\u0010m\u001a\u00020&X\u0080T¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"OutlinedTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "value", "", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", OutlinedTextFieldKt.BorderId, "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateWidth-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "calculateHeight-O3s9Psw", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "Landroidx/compose/ui/unit/TextUnit;", "getOutlinedTextFieldTopPadding", "()J", "J", "BorderId", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m8401constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding = TextUnitKt.getSp(8);

    /* compiled from: OutlinedTextField.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$11(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, Composer composer, int i6) {
        OutlinedTextField(str, (Function1<? super String, Unit>) function1, modifier, z, z2, textStyle, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$13(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i2, int i3, int i4, Composer composer, int i5) {
        OutlinedTextField(str, function1, modifier, z, z2, textStyle, function2, function22, function23, function24, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$19(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, Composer composer, int i6) {
        OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier, z, z2, textStyle, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$21(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i2, int i3, int i4, Composer composer, int i5) {
        OutlinedTextField(textFieldValue, function1, modifier, z, z2, textStyle, function2, function22, function23, function24, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$5(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, Composer composer, int i4) {
        OutlinedTextField(textFieldState, modifier, z, z2, textStyle, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, z3, inputTransformation, outputTransformation, keyboardOptions, keyboardActionHandler, textFieldLineLimits, scrollState, shape, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextFieldLayout$lambda$28(Modifier modifier, Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function2 function24, boolean z, float f, Function1 function1, Function2 function25, PaddingValues paddingValues, int i, int i2, Composer composer, int i3) {
        OutlinedTextFieldLayout(modifier, function2, function3, function22, function23, function24, z, f, function1, function25, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i10;
        int i11;
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
        Composer composer2;
        final boolean z5;
        final TextStyle textStyle2;
        final OutputTransformation outputTransformation2;
        final KeyboardOptions keyboardOptions2;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final boolean z7;
        final InputTransformation inputTransformation2;
        final KeyboardActionHandler keyboardActionHandler2;
        final TextFieldLineLimits textFieldLineLimits2;
        ScopeUpdateScope endRestartGroup;
        boolean z8;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        InputTransformation inputTransformation3;
        OutputTransformation outputTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler keyboardActionHandler3;
        TextFieldLineLimits textFieldLineLimits3;
        ScrollState scrollState3;
        Shape shape3;
        Composer composer3;
        TextFieldColors textFieldColors3;
        int i24;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColors4;
        int i25;
        TextStyle textStyle4;
        int i26;
        boolean z9;
        MutableInteractionSource mutableInteractionSource4;
        Modifier.Companion companion;
        int i27;
        Composer startRestartGroup = composer.startRestartGroup(1708163690);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)N(state,modifier,enabled,readOnly,textStyle,label,placeholder,leadingIcon,trailingIcon,isError,inputTransformation,outputTransformation,keyboardOptions,onKeyboardAction,lineLimits,scrollState,shape,colors,interactionSource)185@10504L7,202@11180L38,210@11525L20,187@10517L2817:OutlinedTextField.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i28 = i3 & 2;
        if (i28 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                z4 = z;
                i4 |= startRestartGroup.changed(z4) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    int i29 = 8192;
                    if ((i & 24576) == 0) {
                        if ((i3 & 16) == 0 && startRestartGroup.changed(textStyle)) {
                            i27 = 16384;
                            i4 |= i27;
                        }
                        i27 = 8192;
                        i4 |= i27;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function25 = function2;
                    } else {
                        function25 = function2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(function26) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        function27 = function23;
                    } else {
                        function27 = function23;
                        if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changedInstance(function24) ? 67108864 : 33554432;
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i13 = i12;
                            i4 |= startRestartGroup.changed(z3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (startRestartGroup.changed(inputTransformation) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            i17 = i3 & 2048;
                            if (i17 == 0) {
                                i16 |= 48;
                                i18 = i17;
                            } else if ((i2 & 48) == 0) {
                                i18 = i17;
                                i16 |= startRestartGroup.changed(outputTransformation) ? 32 : 16;
                            } else {
                                i18 = i17;
                            }
                            int i30 = i16;
                            i19 = i3 & 4096;
                            if (i19 == 0) {
                                i20 = i30 | 384;
                            } else {
                                int i31 = i30;
                                if ((i2 & 384) == 0) {
                                    i31 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                }
                                i20 = i31;
                            }
                            i21 = i3 & 8192;
                            if (i21 == 0) {
                                i22 = i20 | 3072;
                            } else {
                                i22 = i20;
                                if ((i2 & 3072) == 0) {
                                    i22 |= startRestartGroup.changed(keyboardActionHandler) ? 2048 : 1024;
                                    if ((i2 & 24576) == 0) {
                                        if ((i3 & 16384) == 0 && startRestartGroup.changed(textFieldLineLimits)) {
                                            i29 = 16384;
                                        }
                                        i22 |= i29;
                                    }
                                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i22 |= ((i3 & 32768) == 0 && startRestartGroup.changed(scrollState)) ? 131072 : 65536;
                                    }
                                    if ((i2 & 1572864) == 0) {
                                        i22 |= ((i3 & 65536) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                                    }
                                    if ((i2 & 12582912) == 0) {
                                        i22 |= ((i3 & 131072) == 0 && startRestartGroup.changed(textFieldColors)) ? 8388608 : 4194304;
                                    }
                                    i23 = i3 & 262144;
                                    if (i23 != 0) {
                                        i22 |= 100663296;
                                    } else if ((i2 & 100663296) == 0) {
                                        i22 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : 33554432;
                                    }
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i4 & 1)) {
                                        startRestartGroup.startDefaults();
                                        ComposerKt.sourceInformation(startRestartGroup, "163@9330L7,174@9893L21,175@9953L22,176@10025L25");
                                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i3 & 16) != 0) {
                                                i4 &= -57345;
                                            }
                                            if ((i3 & 16384) != 0) {
                                                i22 &= -57345;
                                            }
                                            if ((32768 & i3) != 0) {
                                                i22 &= -458753;
                                            }
                                            if ((i3 & 65536) != 0) {
                                                i22 &= -3670017;
                                            }
                                            if ((i3 & 131072) != 0) {
                                                i22 &= -29360129;
                                            }
                                            composer3 = startRestartGroup;
                                            z8 = z2;
                                            textStyle4 = textStyle;
                                            function213 = function24;
                                            z9 = z3;
                                            inputTransformation3 = inputTransformation;
                                            outputTransformation3 = outputTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActionHandler3 = keyboardActionHandler;
                                            textFieldLineLimits3 = textFieldLineLimits;
                                            scrollState3 = scrollState;
                                            shape3 = shape;
                                            textFieldColors4 = textFieldColors;
                                            i26 = i4;
                                            function212 = function27;
                                            i25 = i22;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                        } else {
                                            Modifier.Companion companion2 = i28 != 0 ? Modifier.INSTANCE : modifier2;
                                            boolean z10 = i5 != 0 ? true : z4;
                                            z8 = i6 != 0 ? false : z2;
                                            if ((i3 & 16) != 0) {
                                                ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                Object consume = startRestartGroup.consume(localTextStyle);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                i4 &= -57345;
                                                textStyle3 = (TextStyle) consume;
                                            } else {
                                                textStyle3 = textStyle;
                                            }
                                            int i32 = i4;
                                            Function2<? super Composer, ? super Integer, Unit> function214 = i7 != 0 ? null : function25;
                                            Function2<? super Composer, ? super Integer, Unit> function215 = i8 != 0 ? null : function26;
                                            function212 = i9 != 0 ? null : function27;
                                            function213 = i11 != 0 ? null : function24;
                                            boolean z11 = i13 != 0 ? false : z3;
                                            inputTransformation3 = i15 != 0 ? null : inputTransformation;
                                            outputTransformation3 = i18 != 0 ? null : outputTransformation;
                                            keyboardOptions3 = i19 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            keyboardActionHandler3 = i21 != 0 ? null : keyboardActionHandler;
                                            if ((i3 & 16384) != 0) {
                                                i22 &= -57345;
                                                textFieldLineLimits3 = TextFieldLineLimits.INSTANCE.getDefault();
                                            } else {
                                                textFieldLineLimits3 = textFieldLineLimits;
                                            }
                                            if ((32768 & i3) != 0) {
                                                i22 &= -458753;
                                                scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                            } else {
                                                scrollState3 = scrollState;
                                            }
                                            if ((i3 & 65536) != 0) {
                                                i22 &= -3670017;
                                                shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                                            } else {
                                                shape3 = shape;
                                            }
                                            int i33 = i22;
                                            if ((i3 & 131072) != 0) {
                                                textFieldColors3 = TextFieldDefaults.INSTANCE.m2217outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                                composer3 = startRestartGroup;
                                                i24 = i33 & (-29360129);
                                            } else {
                                                composer3 = startRestartGroup;
                                                textFieldColors3 = textFieldColors;
                                                i24 = i33;
                                            }
                                            if (i23 != 0) {
                                                modifier2 = companion2;
                                                textFieldColors4 = textFieldColors3;
                                                i25 = i24;
                                                z4 = z10;
                                                textStyle4 = textStyle3;
                                                i26 = i32;
                                                function25 = function214;
                                                function26 = function215;
                                                z9 = z11;
                                                mutableInteractionSource3 = null;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource;
                                                modifier2 = companion2;
                                                textFieldColors4 = textFieldColors3;
                                                i25 = i24;
                                                z4 = z10;
                                                textStyle4 = textStyle3;
                                                i26 = i32;
                                                function25 = function214;
                                                function26 = function215;
                                                z9 = z11;
                                            }
                                        }
                                        composer3.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1708163690, i26, i25, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:178)");
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            composer3.startReplaceGroup(1133021489);
                                            ComposerKt.sourceInformation(composer3, "180@10194L39");
                                            ComposerKt.sourceInformationMarkerStart(composer3, 867833073, "CC(remember):OutlinedTextField.kt#9igjgp");
                                            Object rememberedValue = composer3.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                composer3.updateRememberedValue(rememberedValue);
                                            }
                                            mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(867832422);
                                            composer3.endReplaceGroup();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        composer3.startReplaceGroup(867838168);
                                        ComposerKt.sourceInformation(composer3, "*182@10373L18");
                                        long m7865getColor0d7_KjU = textStyle4.m7865getColor0d7_KjU();
                                        if (m7865getColor0d7_KjU == 16) {
                                            m7865getColor0d7_KjU = textFieldColors4.textColor(z4, composer3, ((i26 >> 6) & 14) | ((i25 >> 18) & 112)).getValue().m5667unboximpl();
                                        }
                                        composer3.endReplaceGroup();
                                        TextStyle merge = textStyle4.merge(new TextStyle(m7865getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        TextStyle textStyle5 = textStyle4;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer3.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume2;
                                        if (function25 != null) {
                                            composer3.startReplaceGroup(1133492751);
                                            ComposerKt.sourceInformation(composer3, "196@10930L2");
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 867856588, "CC(remember):OutlinedTextField.kt#9igjgp");
                                            Object rememberedValue2 = composer3.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = new Function1() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        Unit OutlinedTextField$lambda$3$lambda$2;
                                                        OutlinedTextField$lambda$3$lambda$2 = OutlinedTextFieldKt.OutlinedTextField$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
                                                        return OutlinedTextField$lambda$3$lambda$2;
                                                    }
                                                };
                                                composer3.updateRememberedValue(rememberedValue2);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            companion = PaddingKt.m841paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion3, true, (Function1) rememberedValue2), 0.0f, density.mo419toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(1133878112);
                                            composer3.endReplaceGroup();
                                            companion = Modifier.INSTANCE;
                                        }
                                        boolean z12 = z9;
                                        TextFieldColors textFieldColors5 = textFieldColors4;
                                        int i34 = i25 << 12;
                                        Composer composer4 = composer3;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                        boolean z13 = z4;
                                        boolean z14 = z8;
                                        InputTransformation inputTransformation4 = inputTransformation3;
                                        KeyboardOptions keyboardOptions4 = keyboardOptions3;
                                        KeyboardActionHandler keyboardActionHandler4 = keyboardActionHandler3;
                                        TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits3;
                                        BasicTextFieldKt.BasicTextField(textFieldState, SizeKt.m873defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2.then(companion), z9, Strings_androidKt.m2167getString4foXLRw(Strings.INSTANCE.m2161getDefaultErrorMessageUdPEhr4(), composer3, 6)), TextFieldDefaults.INSTANCE.m2214getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2213getMinHeightD9Ej5fM()), z13, z14, inputTransformation4, merge, keyboardOptions4, keyboardActionHandler4, textFieldLineLimits4, (Function2<? super Density, ? super Function0<TextLayoutResult>, Unit>) null, mutableInteractionSource5, new SolidColor(textFieldColors4.cursorColor(z9, composer3, ((i26 >> 27) & 14) | ((i25 >> 18) & 112)).getValue().m5667unboximpl(), null), outputTransformation3, new OutlinedTextFieldKt$OutlinedTextField$3(outputTransformation3, textFieldState, textFieldLineLimits3, z4, mutableInteractionSource4, z12, function25, function26, function212, function213, shape3, textFieldColors5), scrollState3, composer4, (i26 & 8078) | (57344 & i34) | (3670016 & i34) | (29360128 & i34) | (i34 & 234881024), ((i25 << 3) & 896) | ((i25 >> 3) & 57344), 512);
                                        composer2 = composer4;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        textFieldColors2 = textFieldColors5;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        function28 = function25;
                                        function29 = function26;
                                        modifier3 = modifier2;
                                        z6 = z4;
                                        textStyle2 = textStyle5;
                                        z5 = z8;
                                        function210 = function212;
                                        function211 = function213;
                                        z7 = z12;
                                        inputTransformation2 = inputTransformation3;
                                        outputTransformation2 = outputTransformation3;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActionHandler2 = keyboardActionHandler3;
                                        textFieldLineLimits2 = textFieldLineLimits3;
                                        scrollState2 = scrollState3;
                                        shape2 = shape3;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        z5 = z2;
                                        textStyle2 = textStyle;
                                        outputTransformation2 = outputTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        scrollState2 = scrollState;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        function28 = function25;
                                        function29 = function26;
                                        modifier3 = modifier2;
                                        function210 = function27;
                                        z6 = z4;
                                        function211 = function24;
                                        z7 = z3;
                                        inputTransformation2 = inputTransformation;
                                        keyboardActionHandler2 = keyboardActionHandler;
                                        textFieldLineLimits2 = textFieldLineLimits;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit OutlinedTextField$lambda$5;
                                                OutlinedTextField$lambda$5 = OutlinedTextFieldKt.OutlinedTextField$lambda$5(TextFieldState.this, modifier3, z6, z5, textStyle2, function28, function29, function210, function211, z7, inputTransformation2, outputTransformation2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, scrollState2, shape2, textFieldColors2, mutableInteractionSource2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                return OutlinedTextField$lambda$5;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                            }
                            if ((i2 & 24576) == 0) {
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if ((i2 & 1572864) == 0) {
                            }
                            if ((i2 & 12582912) == 0) {
                            }
                            i23 = i3 & 262144;
                            if (i23 != 0) {
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        i17 = i3 & 2048;
                        if (i17 == 0) {
                        }
                        int i302 = i16;
                        i19 = i3 & 4096;
                        if (i19 == 0) {
                        }
                        i21 = i3 & 8192;
                        if (i21 == 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if ((i2 & 1572864) == 0) {
                        }
                        if ((i2 & 12582912) == 0) {
                        }
                        i23 = i3 & 262144;
                        if (i23 != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    i17 = i3 & 2048;
                    if (i17 == 0) {
                    }
                    int i3022 = i16;
                    i19 = i3 & 4096;
                    if (i19 == 0) {
                    }
                    i21 = i3 & 8192;
                    if (i21 == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i23 = i3 & 262144;
                    if (i23 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                int i292 = 8192;
                if ((i & 24576) == 0) {
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                i17 = i3 & 2048;
                if (i17 == 0) {
                }
                int i30222 = i16;
                i19 = i3 & 4096;
                if (i19 == 0) {
                }
                i21 = i3 & 8192;
                if (i21 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i23 = i3 & 262144;
                if (i23 != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            int i2922 = 8192;
            if ((i & 24576) == 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            i17 = i3 & 2048;
            if (i17 == 0) {
            }
            int i302222 = i16;
            i19 = i3 & 4096;
            if (i19 == 0) {
            }
            i21 = i3 & 8192;
            if (i21 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i23 = i3 & 262144;
            if (i23 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        int i29222 = 8192;
        if ((i & 24576) == 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        i17 = i3 & 2048;
        if (i17 == 0) {
        }
        int i3022222 = i16;
        i19 = i3 & 4096;
        if (i19 == 0) {
        }
        i21 = i3 & 8192;
        if (i21 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i23 = i3 & 262144;
        if (i23 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i22 & 38347923) != 38347922, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$3$lambda$2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        boolean z5;
        TextStyle textStyle2;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function26;
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
        int i27;
        int i28;
        Composer composer2;
        final boolean z6;
        final boolean z7;
        final VisualTransformation visualTransformation2;
        final boolean z8;
        final int i29;
        final int i30;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final boolean z9;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        TextStyle textStyle4;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        KeyboardOptions keyboardOptions3;
        int i31;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        int i32;
        Composer composer3;
        TextFieldColors textFieldColors3;
        boolean z10;
        boolean z11;
        TextStyle textStyle5;
        int i33;
        boolean z12;
        VisualTransformation visualTransformation3;
        KeyboardActions keyboardActions3;
        boolean z13;
        int i34;
        int i35;
        int i36;
        boolean z14;
        MutableInteractionSource mutableInteractionSource4;
        TextStyle textStyle6;
        Modifier.Companion companion2;
        Composer startRestartGroup = composer.startRestartGroup(801000036);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)N(value,onValueChange,modifier,enabled,readOnly,textStyle,label,placeholder,leadingIcon,trailingIcon,isError,visualTransformation,keyboardOptions,keyboardActions,singleLine,maxLines,minLines,interactionSource,shape,colors)346@19208L7,363@19884L38,372@20268L20,381@20622L1027,348@19221L2435:OutlinedTextField.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i6 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        z5 = z2;
                        i6 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            textStyle2 = textStyle;
                            i6 |= ((i5 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i10 = i5 & 64;
                        if (i10 != 0) {
                            i6 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i3 & 1572864) == 0) {
                                i6 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                            }
                        }
                        i11 = i5 & 128;
                        if (i11 != 0) {
                            i6 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i3 & 12582912) == 0) {
                                i6 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i6 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i13 = i12;
                            i6 |= startRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                            i14 = i5 & 512;
                            if (i14 == 0) {
                                i6 |= 805306368;
                            } else if ((i3 & 805306368) == 0) {
                                i15 = i14;
                                i6 |= startRestartGroup.changedInstance(function24) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                i16 = i5 & 1024;
                                if (i16 != 0) {
                                    i18 = i4 | 6;
                                    i17 = i16;
                                } else if ((i4 & 6) == 0) {
                                    i17 = i16;
                                    i18 = i4 | (startRestartGroup.changed(z3) ? 4 : 2);
                                } else {
                                    i17 = i16;
                                    i18 = i4;
                                }
                                i19 = i5 & 2048;
                                if (i19 != 0) {
                                    i18 |= 48;
                                    i20 = i19;
                                } else if ((i4 & 48) == 0) {
                                    i20 = i19;
                                    i18 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                                } else {
                                    i20 = i19;
                                }
                                int i37 = i18;
                                i21 = i5 & 4096;
                                if (i21 != 0) {
                                    i22 = i37 | 384;
                                } else {
                                    int i38 = i37;
                                    if ((i4 & 384) == 0) {
                                        i38 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                    }
                                    i22 = i38;
                                }
                                i23 = i5 & 8192;
                                if (i23 != 0) {
                                    i24 = i22 | 3072;
                                } else {
                                    int i39 = i22;
                                    if ((i4 & 3072) == 0) {
                                        i24 = i39 | (startRestartGroup.changed(keyboardActions) ? 2048 : 1024);
                                    } else {
                                        i24 = i39;
                                    }
                                }
                                i25 = i5 & 16384;
                                if (i25 != 0) {
                                    i26 = i24 | 24576;
                                } else {
                                    i26 = i24;
                                    if ((i4 & 24576) == 0) {
                                        i26 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i26 |= ((i5 & 32768) == 0 && startRestartGroup.changed(i)) ? 131072 : 65536;
                                        }
                                        i27 = i5 & 65536;
                                        if (i27 == 0) {
                                            i26 |= 1572864;
                                        } else if ((i4 & 1572864) == 0) {
                                            i26 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                                        }
                                        i28 = i5 & 131072;
                                        if (i28 == 0) {
                                            i26 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i26 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                        }
                                        if ((i4 & 100663296) == 0) {
                                            i26 |= ((i5 & 262144) == 0 && startRestartGroup.changed(shape)) ? 67108864 : 33554432;
                                        }
                                        if ((i4 & 805306368) == 0) {
                                            i26 |= ((i5 & 524288) == 0 && startRestartGroup.changed(textFieldColors)) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                        }
                                        if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i26 & 306783379) != 306783378, i6 & 1)) {
                                            startRestartGroup.startDefaults();
                                            ComposerKt.sourceInformation(startRestartGroup, "324@18064L7,337@18714L22,338@18786L25");
                                            if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i5 & 32) != 0) {
                                                    i6 &= -458753;
                                                }
                                                if ((32768 & i5) != 0) {
                                                    i26 &= -458753;
                                                }
                                                if ((262144 & i5) != 0) {
                                                    i26 &= -234881025;
                                                }
                                                if ((i5 & 524288) != 0) {
                                                    i26 &= -1879048193;
                                                }
                                                function212 = function23;
                                                function213 = function24;
                                                visualTransformation3 = visualTransformation;
                                                keyboardOptions3 = keyboardOptions;
                                                keyboardActions3 = keyboardActions;
                                                z13 = z4;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                                shape3 = shape;
                                                composer3 = startRestartGroup;
                                                z11 = z5;
                                                i33 = i6;
                                                textStyle5 = textStyle2;
                                                function211 = function26;
                                                companion = modifier2;
                                                i36 = i26;
                                                z10 = z;
                                                z12 = z3;
                                                i34 = i;
                                                i35 = i2;
                                                textFieldColors3 = textFieldColors;
                                            } else {
                                                companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z15 = i8 != 0 ? true : z;
                                                boolean z16 = i9 != 0 ? false : z5;
                                                if ((i5 & 32) != 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    i6 &= -458753;
                                                    textStyle4 = (TextStyle) consume;
                                                } else {
                                                    textStyle4 = textStyle2;
                                                }
                                                int i40 = i6;
                                                Function2<? super Composer, ? super Integer, Unit> function214 = i10 != 0 ? null : function25;
                                                function211 = i11 != 0 ? null : function26;
                                                function212 = i13 != 0 ? null : function23;
                                                function213 = i15 != 0 ? null : function24;
                                                boolean z17 = i17 != 0 ? false : z3;
                                                VisualTransformation none = i20 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                keyboardOptions3 = i21 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                KeyboardActions keyboardActions4 = i23 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                boolean z18 = i25 != 0 ? false : z4;
                                                if ((32768 & i5) != 0) {
                                                    i26 &= -458753;
                                                    i31 = z18 ? 1 : Integer.MAX_VALUE;
                                                } else {
                                                    i31 = i;
                                                }
                                                int i41 = i27 != 0 ? 1 : i2;
                                                mutableInteractionSource3 = i28 != 0 ? null : mutableInteractionSource;
                                                if ((262144 & i5) != 0) {
                                                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                                                    i32 = i26 & (-234881025);
                                                } else {
                                                    shape3 = shape;
                                                    i32 = i26;
                                                }
                                                if ((i5 & 524288) != 0) {
                                                    composer3 = startRestartGroup;
                                                    textFieldColors3 = TextFieldDefaults.INSTANCE.m2217outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                                    i36 = i32 & (-1879048193);
                                                    z10 = z15;
                                                    z11 = z16;
                                                    textStyle5 = textStyle4;
                                                    i33 = i40;
                                                    function25 = function214;
                                                    z12 = z17;
                                                    visualTransformation3 = none;
                                                    keyboardActions3 = keyboardActions4;
                                                    z13 = z18;
                                                    i34 = i31;
                                                    i35 = i41;
                                                } else {
                                                    composer3 = startRestartGroup;
                                                    textFieldColors3 = textFieldColors;
                                                    z10 = z15;
                                                    z11 = z16;
                                                    textStyle5 = textStyle4;
                                                    i33 = i40;
                                                    function25 = function214;
                                                    z12 = z17;
                                                    visualTransformation3 = none;
                                                    keyboardActions3 = keyboardActions4;
                                                    z13 = z18;
                                                    i34 = i31;
                                                    i35 = i41;
                                                    i36 = i32;
                                                }
                                            }
                                            composer3.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                z14 = z11;
                                                ComposerKt.traceEventStart(801000036, i33, i36, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:339)");
                                            } else {
                                                z14 = z11;
                                            }
                                            if (mutableInteractionSource3 == null) {
                                                composer3.startReplaceGroup(-245169385);
                                                ComposerKt.sourceInformation(composer3, "341@18898L39");
                                                ComposerKt.sourceInformationMarkerStart(composer3, 961922635, "CC(remember):OutlinedTextField.kt#9igjgp");
                                                Object rememberedValue = composer3.rememberedValue();
                                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    composer3.updateRememberedValue(rememberedValue);
                                                }
                                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                composer3.endReplaceGroup();
                                            } else {
                                                composer3.startReplaceGroup(961921984);
                                                composer3.endReplaceGroup();
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                            }
                                            composer3.startReplaceGroup(961927730);
                                            ComposerKt.sourceInformation(composer3, "*343@19077L18");
                                            long m7865getColor0d7_KjU = textStyle5.m7865getColor0d7_KjU();
                                            if (m7865getColor0d7_KjU == 16) {
                                                m7865getColor0d7_KjU = textFieldColors3.textColor(z10, composer3, ((i33 >> 9) & 14) | ((i36 >> 24) & 112)).getValue().m5667unboximpl();
                                            }
                                            composer3.endReplaceGroup();
                                            TextStyle merge = textStyle5.merge(new TextStyle(m7865getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            int i42 = i33;
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            int i43 = i36;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer3.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Density density = (Density) consume2;
                                            if (function25 != null) {
                                                composer3.startReplaceGroup(-244698123);
                                                ComposerKt.sourceInformation(composer3, "357@19634L2");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                textStyle6 = textStyle5;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 961946150, "CC(remember):OutlinedTextField.kt#9igjgp");
                                                Object rememberedValue2 = composer3.rememberedValue();
                                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue2 = new Function1() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda4
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            Unit OutlinedTextField$lambda$9$lambda$8;
                                                            OutlinedTextField$lambda$9$lambda$8 = OutlinedTextFieldKt.OutlinedTextField$lambda$9$lambda$8((SemanticsPropertyReceiver) obj);
                                                            return OutlinedTextField$lambda$9$lambda$8;
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(rememberedValue2);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                companion2 = PaddingKt.m841paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion3, true, (Function1) rememberedValue2), 0.0f, density.mo419toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null);
                                                composer3.endReplaceGroup();
                                            } else {
                                                textStyle6 = textStyle5;
                                                composer3.startReplaceGroup(-244312762);
                                                composer3.endReplaceGroup();
                                                companion2 = Modifier.INSTANCE;
                                            }
                                            Modifier modifier4 = companion;
                                            final boolean z19 = z12;
                                            final boolean z20 = z10;
                                            final TextFieldColors textFieldColors4 = textFieldColors3;
                                            final Function2<? super Composer, ? super Integer, Unit> function215 = function25;
                                            final boolean z21 = z13;
                                            final VisualTransformation visualTransformation4 = visualTransformation3;
                                            final Function2<? super Composer, ? super Integer, Unit> function216 = function211;
                                            final Function2<? super Composer, ? super Integer, Unit> function217 = function212;
                                            final Function2<? super Composer, ? super Integer, Unit> function218 = function213;
                                            final Shape shape4 = shape3;
                                            int i44 = i43 << 12;
                                            TextStyle textStyle7 = textStyle6;
                                            Composer composer4 = composer3;
                                            KeyboardOptions keyboardOptions4 = keyboardOptions3;
                                            boolean z22 = z14;
                                            BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m873defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(companion.then(companion2), z12, Strings_androidKt.m2167getString4foXLRw(Strings.INSTANCE.m2161getDefaultErrorMessageUdPEhr4(), composer3, 6)), TextFieldDefaults.INSTANCE.m2214getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2213getMinHeightD9Ej5fM()), z10, z22, merge, keyboardOptions4, keyboardActions3, z13, i34, i35, visualTransformation3, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, new SolidColor(textFieldColors3.cursorColor(z12, composer3, (i43 & 14) | ((i43 >> 24) & 112)).getValue().m5667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(-591103097, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$7
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i45) {
                                                    int i46;
                                                    ComposerKt.sourceInformation(composer5, "CN(innerTextField)396@21322L294,382@20676L959:OutlinedTextField.kt#jmzs0o");
                                                    if ((i45 & 6) == 0) {
                                                        i46 = i45 | (composer5.changedInstance(function219) ? 4 : 2);
                                                    } else {
                                                        i46 = i45;
                                                    }
                                                    if (!composer5.shouldExecute((i46 & 19) != 18, i46 & 1)) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-591103097, i46, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    int i47 = i46;
                                                    String str2 = str;
                                                    boolean z23 = z20;
                                                    boolean z24 = z21;
                                                    VisualTransformation visualTransformation5 = visualTransformation4;
                                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                                    boolean z25 = z19;
                                                    Function2<Composer, Integer, Unit> function220 = function215;
                                                    Function2<Composer, Integer, Unit> function221 = function216;
                                                    Function2<Composer, Integer, Unit> function222 = function217;
                                                    Function2<Composer, Integer, Unit> function223 = function218;
                                                    Shape shape5 = shape4;
                                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                                    final boolean z26 = z20;
                                                    final boolean z27 = z19;
                                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource5;
                                                    final TextFieldColors textFieldColors6 = textFieldColors4;
                                                    final Shape shape6 = shape4;
                                                    textFieldDefaults.OutlinedTextFieldDecorationBox(str2, function219, z23, z24, visualTransformation5, mutableInteractionSource6, z25, function220, function221, function222, function223, shape5, textFieldColors5, null, ComposableLambdaKt.rememberComposableLambda(-1118701585, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$7.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer6, int i48) {
                                                            ComposerKt.sourceInformation(composer6, "C397@21366L228:OutlinedTextField.kt#jmzs0o");
                                                            if (!composer6.shouldExecute((i48 & 3) != 2, i48 & 1)) {
                                                                composer6.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1118701585, i48, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:397)");
                                                            }
                                                            TextFieldDefaults.INSTANCE.m2211BorderBoxnbWgWpA(z26, z27, mutableInteractionSource7, textFieldColors6, shape6, 0.0f, 0.0f, composer6, 12582912, 96);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer5, 54), composer5, (i47 << 3) & 112, 221184, 8192);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54), composer4, (i42 & 64638) | (3670016 & i44) | (29360128 & i44) | (234881024 & i44) | (i44 & 1879048192), ((i43 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i43 & 112), 4096);
                                            composer2 = composer4;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            VisualTransformation visualTransformation5 = visualTransformation3;
                                            z8 = z13;
                                            visualTransformation2 = visualTransformation5;
                                            textFieldColors2 = textFieldColors4;
                                            z6 = z10;
                                            z9 = z22;
                                            i29 = i34;
                                            i30 = i35;
                                            modifier3 = modifier4;
                                            textStyle3 = textStyle7;
                                            function27 = function215;
                                            function28 = function211;
                                            function29 = function212;
                                            mutableInteractionSource2 = mutableInteractionSource3;
                                            shape2 = shape3;
                                            keyboardOptions2 = keyboardOptions4;
                                            keyboardActions2 = keyboardActions3;
                                            function210 = function213;
                                            z7 = z19;
                                        } else {
                                            composer2 = startRestartGroup;
                                            composer2.skipToGroupEnd();
                                            z6 = z;
                                            z7 = z3;
                                            visualTransformation2 = visualTransformation;
                                            z8 = z4;
                                            i29 = i;
                                            i30 = i2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColors2 = textFieldColors;
                                            z9 = z5;
                                            textStyle3 = textStyle2;
                                            function27 = function25;
                                            function28 = function26;
                                            modifier3 = modifier2;
                                            function29 = function23;
                                            function210 = function24;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit OutlinedTextField$lambda$11;
                                                    OutlinedTextField$lambda$11 = OutlinedTextFieldKt.OutlinedTextField$lambda$11(str, function1, modifier3, z6, z9, textStyle3, function27, function28, function29, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i29, i30, mutableInteractionSource2, shape2, textFieldColors2, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                                    return OutlinedTextField$lambda$11;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                }
                                i27 = i5 & 65536;
                                if (i27 == 0) {
                                }
                                i28 = i5 & 131072;
                                if (i28 == 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                if ((i4 & 805306368) == 0) {
                                }
                                if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i26 & 306783379) != 306783378, i6 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i15 = i14;
                            i16 = i5 & 1024;
                            if (i16 != 0) {
                            }
                            i19 = i5 & 2048;
                            if (i19 != 0) {
                            }
                            int i372 = i18;
                            i21 = i5 & 4096;
                            if (i21 != 0) {
                            }
                            i23 = i5 & 8192;
                            if (i23 != 0) {
                            }
                            i25 = i5 & 16384;
                            if (i25 != 0) {
                            }
                            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            i27 = i5 & 65536;
                            if (i27 == 0) {
                            }
                            i28 = i5 & 131072;
                            if (i28 == 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i26 & 306783379) != 306783378, i6 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i13 = i12;
                        i14 = i5 & 512;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i5 & 1024;
                        if (i16 != 0) {
                        }
                        i19 = i5 & 2048;
                        if (i19 != 0) {
                        }
                        int i3722 = i18;
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                        }
                        i23 = i5 & 8192;
                        if (i23 != 0) {
                        }
                        i25 = i5 & 16384;
                        if (i25 != 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        i27 = i5 & 65536;
                        if (i27 == 0) {
                        }
                        i28 = i5 & 131072;
                        if (i28 == 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i26 & 306783379) != 306783378, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z5 = z2;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i10 = i5 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 1024;
                    if (i16 != 0) {
                    }
                    i19 = i5 & 2048;
                    if (i19 != 0) {
                    }
                    int i37222 = i18;
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    i23 = i5 & 8192;
                    if (i23 != 0) {
                    }
                    i25 = i5 & 16384;
                    if (i25 != 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i27 = i5 & 65536;
                    if (i27 == 0) {
                    }
                    i28 = i5 & 131072;
                    if (i28 == 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i26 & 306783379) != 306783378, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                z5 = z2;
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i5 & 1024;
                if (i16 != 0) {
                }
                i19 = i5 & 2048;
                if (i19 != 0) {
                }
                int i372222 = i18;
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                i23 = i5 & 8192;
                if (i23 != 0) {
                }
                i25 = i5 & 16384;
                if (i25 != 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i27 = i5 & 65536;
                if (i27 == 0) {
                }
                i28 = i5 & 131072;
                if (i28 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i26 & 306783379) != 306783378, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            z5 = z2;
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i5 & 1024;
            if (i16 != 0) {
            }
            i19 = i5 & 2048;
            if (i19 != 0) {
            }
            int i3722222 = i18;
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            i23 = i5 & 8192;
            if (i23 != 0) {
            }
            i25 = i5 & 16384;
            if (i25 != 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i27 = i5 & 65536;
            if (i27 == 0) {
            }
            i28 = i5 & 131072;
            if (i28 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i26 & 306783379) != 306783378, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        z5 = z2;
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i5 & 1024;
        if (i16 != 0) {
        }
        i19 = i5 & 2048;
        if (i19 != 0) {
        }
        int i37222222 = i18;
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        i23 = i5 & 8192;
        if (i23 != 0) {
        }
        i25 = i5 & 16384;
        if (i25 != 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i27 = i5 & 65536;
        if (i27 == 0) {
        }
        i28 = i5 & 131072;
        if (i28 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (i26 & 306783379) != 306783378, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$9$lambda$8(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029a  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void OutlinedTextField(final String str, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        TextStyle textStyle2;
        int i9;
        Function2 function25;
        int i10;
        Function2 function26;
        int i11;
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
        int i27;
        Composer composer2;
        final boolean z7;
        final VisualTransformation visualTransformation2;
        final boolean z8;
        final int i28;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final boolean z9;
        final boolean z10;
        final TextStyle textStyle3;
        final Function2 function27;
        final Function2 function28;
        final Modifier modifier3;
        final Function2 function29;
        final Function2 function210;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        ScopeUpdateScope endRestartGroup;
        TextStyle textStyle4;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        TextFieldColors textFieldColors3;
        Modifier modifier4;
        boolean z11;
        boolean z12;
        int i29;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        boolean z13;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z14;
        int i30;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape4;
        int i31;
        Composer startRestartGroup = composer.startRestartGroup(1453565505);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)N(value,onValueChange,modifier,enabled,readOnly,textStyle,label,placeholder,leadingIcon,trailingIcon,isError,visualTransformation,keyboardOptions,keyboardActions,singleLine,maxLines,interactionSource,shape,colors)436@22763L417:OutlinedTextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    z5 = z;
                    i5 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        z6 = z2;
                        i5 |= startRestartGroup.changed(z6) ? 16384 : 8192;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            textStyle2 = textStyle;
                            i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i9 = i4 & 64;
                        if (i9 != 0) {
                            i5 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                            }
                        }
                        i10 = i4 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i2 & 12582912) == 0) {
                                i5 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i11 = i4 & 256;
                        if (i11 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= startRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                            i13 = i4 & 512;
                            if (i13 == 0) {
                                i5 |= 805306368;
                            } else if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changedInstance(function24) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                i15 = i4 & 1024;
                                if (i15 != 0) {
                                    i17 = i3 | 6;
                                    i16 = i15;
                                } else if ((i3 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i3;
                                }
                                i18 = i4 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i3 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i32 = i17;
                                i20 = i4 & 4096;
                                if (i20 != 0) {
                                    i21 = i32 | 384;
                                } else {
                                    int i33 = i32;
                                    if ((i3 & 384) == 0) {
                                        i33 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                    }
                                    i21 = i33;
                                }
                                i22 = i4 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i34 = i21;
                                    if ((i3 & 3072) == 0) {
                                        i23 = i34 | (startRestartGroup.changed(keyboardActions) ? 2048 : 1024);
                                    } else {
                                        i23 = i34;
                                    }
                                }
                                i24 = i4 & 16384;
                                if (i24 != 0) {
                                    i25 = i23 | 24576;
                                } else {
                                    i25 = i23;
                                    if ((i3 & 24576) == 0) {
                                        i25 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                                        i26 = i4 & 32768;
                                        if (i26 == 0) {
                                            i25 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i25 |= startRestartGroup.changed(i) ? 131072 : 65536;
                                        }
                                        i27 = i4 & 65536;
                                        if (i27 == 0) {
                                            i25 |= 1572864;
                                        } else if ((i3 & 1572864) == 0) {
                                            i25 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                                        }
                                        if ((i3 & 12582912) == 0) {
                                            i25 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                                        }
                                        if ((i3 & 100663296) == 0) {
                                            i25 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? 67108864 : 33554432;
                                        }
                                        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i25 & 38347923) != 38347922, i5 & 1)) {
                                            startRestartGroup.startDefaults();
                                            ComposerKt.sourceInformation(startRestartGroup, "421@22018L7,432@22578L39,433@22656L22,434@22728L25");
                                            if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                startRestartGroup.skipToGroupEnd();
                                                if ((i4 & 32) != 0) {
                                                    i5 &= -458753;
                                                }
                                                if ((i4 & 131072) != 0) {
                                                    i25 &= -29360129;
                                                }
                                                if ((262144 & i4) != 0) {
                                                    i25 &= -234881025;
                                                }
                                                function212 = function23;
                                                visualTransformation3 = visualTransformation;
                                                keyboardOptions3 = keyboardOptions;
                                                z14 = z4;
                                                i30 = i;
                                                mutableInteractionSource4 = mutableInteractionSource;
                                                shape4 = shape;
                                                textFieldColors3 = textFieldColors;
                                                composer2 = startRestartGroup;
                                                z12 = z6;
                                                i29 = i5;
                                                function211 = function26;
                                                modifier4 = modifier2;
                                                i31 = i25;
                                                function213 = function24;
                                                z13 = z3;
                                                keyboardActions3 = keyboardActions;
                                                z11 = z5;
                                            } else {
                                                Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z15 = i7 != 0 ? true : z5;
                                                boolean z16 = i8 != 0 ? false : z6;
                                                if ((i4 & 32) != 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                    Object consume = startRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    i5 &= -458753;
                                                    textStyle4 = (TextStyle) consume;
                                                } else {
                                                    textStyle4 = textStyle2;
                                                }
                                                int i35 = i5;
                                                Function2 function214 = i9 != 0 ? null : function25;
                                                Function2 function215 = i10 != 0 ? null : function26;
                                                Function2 function216 = i12 != 0 ? null : function23;
                                                Function2 function217 = i14 != 0 ? null : function24;
                                                boolean z17 = i16 != 0 ? false : z3;
                                                VisualTransformation none = i19 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i20 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                KeyboardActions keyboardActions4 = i22 != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                                boolean z18 = i24 != 0 ? false : z4;
                                                int i36 = i26 != 0 ? Integer.MAX_VALUE : i;
                                                if (i27 != 0) {
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1012108520, "CC(remember):OutlinedTextField.kt#9igjgp");
                                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                                } else {
                                                    mutableInteractionSource3 = mutableInteractionSource;
                                                }
                                                if ((i4 & 131072) != 0) {
                                                    i25 &= -29360129;
                                                    shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                                                } else {
                                                    shape3 = shape;
                                                }
                                                int i37 = i25;
                                                if ((262144 & i4) != 0) {
                                                    composer2 = startRestartGroup;
                                                    modifier4 = companion;
                                                    z11 = z15;
                                                    textFieldColors3 = TextFieldDefaults.INSTANCE.m2217outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
                                                    i31 = i37 & (-234881025);
                                                    z12 = z16;
                                                    textStyle2 = textStyle4;
                                                    i29 = i35;
                                                    function25 = function214;
                                                    function211 = function215;
                                                    function212 = function216;
                                                    function213 = function217;
                                                    z13 = z17;
                                                    visualTransformation3 = none;
                                                    keyboardOptions3 = keyboardOptions4;
                                                    keyboardActions3 = keyboardActions4;
                                                    z14 = z18;
                                                    i30 = i36;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape4 = shape3;
                                                } else {
                                                    composer2 = startRestartGroup;
                                                    textFieldColors3 = textFieldColors;
                                                    modifier4 = companion;
                                                    z11 = z15;
                                                    z12 = z16;
                                                    textStyle2 = textStyle4;
                                                    i29 = i35;
                                                    function25 = function214;
                                                    function211 = function215;
                                                    function212 = function216;
                                                    function213 = function217;
                                                    z13 = z17;
                                                    visualTransformation3 = none;
                                                    keyboardOptions3 = keyboardOptions4;
                                                    keyboardActions3 = keyboardActions4;
                                                    z14 = z18;
                                                    i30 = i36;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape4 = shape3;
                                                    i31 = i37;
                                                }
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1453565505, i29, i31, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:435)");
                                            }
                                            int i38 = i29 & 2147483646;
                                            int i39 = (i31 & 14) | 1572864 | (i31 & 112) | (i31 & 896) | (i31 & 7168) | (57344 & i31) | (458752 & i31);
                                            int i40 = i31 << 3;
                                            OutlinedTextField(str, (Function1<? super String, Unit>) function1, modifier4, z11, z12, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function212, (Function2<? super Composer, ? super Integer, Unit>) function213, z13, visualTransformation3, keyboardOptions3, keyboardActions3, z14, i30, 1, mutableInteractionSource4, shape4, textFieldColors3, composer2, i38, i39 | (29360128 & i40) | (234881024 & i40) | (i40 & 1879048192), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier3 = modifier4;
                                            z9 = z11;
                                            z10 = z12;
                                            textStyle3 = textStyle2;
                                            function27 = function25;
                                            function28 = function211;
                                            function29 = function212;
                                            function210 = function213;
                                            z7 = z13;
                                            visualTransformation2 = visualTransformation3;
                                            keyboardOptions2 = keyboardOptions3;
                                            keyboardActions2 = keyboardActions3;
                                            z8 = z14;
                                            i28 = i30;
                                            mutableInteractionSource2 = mutableInteractionSource4;
                                            shape2 = shape4;
                                            textFieldColors2 = textFieldColors3;
                                        } else {
                                            composer2 = startRestartGroup;
                                            composer2.skipToGroupEnd();
                                            z7 = z3;
                                            visualTransformation2 = visualTransformation;
                                            z8 = z4;
                                            i28 = i;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColors2 = textFieldColors;
                                            z9 = z5;
                                            z10 = z6;
                                            textStyle3 = textStyle2;
                                            function27 = function25;
                                            function28 = function26;
                                            modifier3 = modifier2;
                                            function29 = function23;
                                            function210 = function24;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup == null) {
                                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    Unit OutlinedTextField$lambda$13;
                                                    OutlinedTextField$lambda$13 = OutlinedTextFieldKt.OutlinedTextField$lambda$13(str, function1, modifier3, z9, z10, textStyle3, function27, function28, function29, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i28, mutableInteractionSource2, shape2, textFieldColors2, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                    return OutlinedTextField$lambda$13;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i26 = i4 & 32768;
                                if (i26 == 0) {
                                }
                                i27 = i4 & 65536;
                                if (i27 == 0) {
                                }
                                if ((i3 & 12582912) == 0) {
                                }
                                if ((i3 & 100663296) == 0) {
                                }
                                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i25 & 38347923) != 38347922, i5 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i14 = i13;
                            i15 = i4 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i4 & 2048;
                            if (i18 != 0) {
                            }
                            int i322 = i17;
                            i20 = i4 & 4096;
                            if (i20 != 0) {
                            }
                            i22 = i4 & 8192;
                            if (i22 != 0) {
                            }
                            i24 = i4 & 16384;
                            if (i24 != 0) {
                            }
                            i26 = i4 & 32768;
                            if (i26 == 0) {
                            }
                            i27 = i4 & 65536;
                            if (i27 == 0) {
                            }
                            if ((i3 & 12582912) == 0) {
                            }
                            if ((i3 & 100663296) == 0) {
                            }
                            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i25 & 38347923) != 38347922, i5 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i12 = i11;
                        i13 = i4 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i4 & 2048;
                        if (i18 != 0) {
                        }
                        int i3222 = i17;
                        i20 = i4 & 4096;
                        if (i20 != 0) {
                        }
                        i22 = i4 & 8192;
                        if (i22 != 0) {
                        }
                        i24 = i4 & 16384;
                        if (i24 != 0) {
                        }
                        i26 = i4 & 32768;
                        if (i26 == 0) {
                        }
                        i27 = i4 & 65536;
                        if (i27 == 0) {
                        }
                        if ((i3 & 12582912) == 0) {
                        }
                        if ((i3 & 100663296) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i25 & 38347923) != 38347922, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z6 = z2;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i9 = i4 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 != 0) {
                    }
                    int i32222 = i17;
                    i20 = i4 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i4 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i4 & 16384;
                    if (i24 != 0) {
                    }
                    i26 = i4 & 32768;
                    if (i26 == 0) {
                    }
                    i27 = i4 & 65536;
                    if (i27 == 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i3 & 100663296) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i25 & 38347923) != 38347922, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z5 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                z6 = z2;
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 != 0) {
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                }
                int i322222 = i17;
                i20 = i4 & 4096;
                if (i20 != 0) {
                }
                i22 = i4 & 8192;
                if (i22 != 0) {
                }
                i24 = i4 & 16384;
                if (i24 != 0) {
                }
                i26 = i4 & 32768;
                if (i26 == 0) {
                }
                i27 = i4 & 65536;
                if (i27 == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i25 & 38347923) != 38347922, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z5 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            z6 = z2;
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 != 0) {
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
            }
            int i3222222 = i17;
            i20 = i4 & 4096;
            if (i20 != 0) {
            }
            i22 = i4 & 8192;
            if (i22 != 0) {
            }
            i24 = i4 & 16384;
            if (i24 != 0) {
            }
            i26 = i4 & 32768;
            if (i26 == 0) {
            }
            i27 = i4 & 65536;
            if (i27 == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i25 & 38347923) != 38347922, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z5 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        z6 = z2;
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 != 0) {
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
        }
        int i32222222 = i17;
        i20 = i4 & 4096;
        if (i20 != 0) {
        }
        i22 = i4 & 8192;
        if (i22 != 0) {
        }
        i24 = i4 & 16384;
        if (i24 != 0) {
        }
        i26 = i4 & 32768;
        if (i26 == 0) {
        }
        i27 = i4 & 65536;
        if (i27 == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i25 & 38347923) != 38347922, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c5, code lost:
    
        if (r3.changed(r86) == false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        boolean z5;
        TextStyle textStyle2;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function26;
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
        int i27;
        Composer composer2;
        final boolean z6;
        final boolean z7;
        final VisualTransformation visualTransformation2;
        final boolean z8;
        final int i28;
        final int i29;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final boolean z9;
        final TextStyle textStyle3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        TextStyle textStyle4;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        int i30;
        KeyboardActions keyboardActions3;
        int i31;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        Composer composer3;
        TextFieldColors textFieldColors3;
        KeyboardActions keyboardActions4;
        boolean z10;
        boolean z11;
        TextStyle textStyle5;
        int i32;
        boolean z12;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean z13;
        int i33;
        int i34;
        int i35;
        boolean z14;
        MutableInteractionSource mutableInteractionSource4;
        int i36;
        Modifier.Companion companion2;
        Composer startRestartGroup = composer.startRestartGroup(-365650761);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)N(value,onValueChange,modifier,enabled,readOnly,textStyle,label,placeholder,leadingIcon,trailingIcon,isError,visualTransformation,keyboardOptions,keyboardActions,singleLine,maxLines,minLines,interactionSource,shape,colors)553@29149L7,570@29825L38,579@30209L20,588@30563L1032,555@29162L2440:OutlinedTextField.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i6 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i8 = i5 & 8;
                int i37 = 2048;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        z5 = z2;
                        i6 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            textStyle2 = textStyle;
                            i6 |= ((i5 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i10 = i5 & 64;
                        if (i10 != 0) {
                            i6 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i3 & 1572864) == 0) {
                                i6 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                            }
                        }
                        i11 = i5 & 128;
                        if (i11 != 0) {
                            i6 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i3 & 12582912) == 0) {
                                i6 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i6 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i13 = i12;
                            i6 |= startRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                            i14 = i5 & 512;
                            if (i14 == 0) {
                                i6 |= 805306368;
                            } else if ((i3 & 805306368) == 0) {
                                i15 = i14;
                                i6 |= startRestartGroup.changedInstance(function24) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                i16 = i5 & 1024;
                                if (i16 != 0) {
                                    i18 = i4 | 6;
                                    i17 = i16;
                                } else if ((i4 & 6) == 0) {
                                    i17 = i16;
                                    i18 = i4 | (startRestartGroup.changed(z3) ? 4 : 2);
                                } else {
                                    i17 = i16;
                                    i18 = i4;
                                }
                                i19 = i5 & 2048;
                                if (i19 != 0) {
                                    i18 |= 48;
                                    i20 = i19;
                                } else if ((i4 & 48) == 0) {
                                    i20 = i19;
                                    i18 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                                } else {
                                    i20 = i19;
                                }
                                int i38 = i18;
                                i21 = i5 & 4096;
                                if (i21 != 0) {
                                    i22 = i38 | 384;
                                } else {
                                    i22 = i38;
                                    if ((i4 & 384) == 0) {
                                        i22 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                        if ((i4 & 3072) == 0) {
                                            if ((i5 & 8192) != 0) {
                                            }
                                            i37 = 1024;
                                            i22 |= i37;
                                        }
                                        int i39 = i22;
                                        i23 = i5 & 16384;
                                        if (i23 == 0) {
                                            i24 = i39 | 24576;
                                        } else {
                                            i24 = i39;
                                            if ((i4 & 24576) == 0) {
                                                i24 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                                                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                    i24 |= ((i5 & 32768) == 0 && startRestartGroup.changed(i)) ? 131072 : 65536;
                                                }
                                                i25 = i5 & 65536;
                                                if (i25 != 0) {
                                                    i24 |= 1572864;
                                                } else if ((i4 & 1572864) == 0) {
                                                    i24 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                                                }
                                                i26 = i5 & 131072;
                                                if (i26 != 0) {
                                                    i24 |= 12582912;
                                                } else if ((i4 & 12582912) == 0) {
                                                    i24 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                                }
                                                if ((i4 & 100663296) == 0) {
                                                    i24 |= ((i5 & 262144) == 0 && startRestartGroup.changed(shape)) ? 67108864 : 33554432;
                                                }
                                                if ((i4 & 805306368) == 0) {
                                                    i24 |= ((i5 & 524288) == 0 && startRestartGroup.changed(textFieldColors)) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                                }
                                                i27 = i24;
                                                if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (306783379 & i27) != 306783378, i6 & 1)) {
                                                    startRestartGroup.startDefaults();
                                                    ComposerKt.sourceInformation(startRestartGroup, "531@28011L7,544@28655L22,545@28727L25");
                                                    if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                        startRestartGroup.skipToGroupEnd();
                                                        if ((i5 & 32) != 0) {
                                                            i6 &= -458753;
                                                        }
                                                        if ((i5 & 8192) != 0) {
                                                            i27 &= -7169;
                                                        }
                                                        if ((32768 & i5) != 0) {
                                                            i27 &= -458753;
                                                        }
                                                        if ((262144 & i5) != 0) {
                                                            i27 &= -234881025;
                                                        }
                                                        if ((i5 & 524288) != 0) {
                                                            i27 &= -1879048193;
                                                        }
                                                        TextStyle textStyle6 = textStyle2;
                                                        i35 = i27;
                                                        textStyle5 = textStyle6;
                                                        function213 = function23;
                                                        function214 = function24;
                                                        z12 = z3;
                                                        visualTransformation3 = visualTransformation;
                                                        keyboardActions4 = keyboardActions;
                                                        z13 = z4;
                                                        mutableInteractionSource3 = mutableInteractionSource;
                                                        shape3 = shape;
                                                        composer3 = startRestartGroup;
                                                        z11 = z5;
                                                        i32 = i6;
                                                        function211 = function25;
                                                        function212 = function26;
                                                        companion = modifier2;
                                                        z10 = z;
                                                        keyboardOptions3 = keyboardOptions;
                                                        i33 = i;
                                                        i34 = i2;
                                                        textFieldColors3 = textFieldColors;
                                                    } else {
                                                        companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                                                        boolean z15 = i8 != 0 ? true : z;
                                                        boolean z16 = i9 != 0 ? false : z5;
                                                        if ((i5 & 32) != 0) {
                                                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                            Object consume = startRestartGroup.consume(localTextStyle);
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            i6 &= -458753;
                                                            textStyle4 = (TextStyle) consume;
                                                        } else {
                                                            textStyle4 = textStyle2;
                                                        }
                                                        int i40 = i6;
                                                        function211 = i10 != 0 ? null : function25;
                                                        function212 = i11 != 0 ? null : function26;
                                                        function213 = i13 != 0 ? null : function23;
                                                        function214 = i15 != 0 ? null : function24;
                                                        boolean z17 = i17 != 0 ? false : z3;
                                                        VisualTransformation none = i20 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                        KeyboardOptions keyboardOptions4 = i21 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                        if ((i5 & 8192) != 0) {
                                                            i30 = i27 & (-7169);
                                                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                        } else {
                                                            i30 = i27;
                                                            keyboardActions3 = keyboardActions;
                                                        }
                                                        boolean z18 = i23 != 0 ? false : z4;
                                                        if ((32768 & i5) != 0) {
                                                            i30 &= -458753;
                                                            i31 = z18 ? 1 : Integer.MAX_VALUE;
                                                        } else {
                                                            i31 = i;
                                                        }
                                                        int i41 = i25 != 0 ? 1 : i2;
                                                        mutableInteractionSource3 = i26 != 0 ? null : mutableInteractionSource;
                                                        if ((262144 & i5) != 0) {
                                                            i30 &= -234881025;
                                                            shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                                                        } else {
                                                            shape3 = shape;
                                                        }
                                                        int i42 = i30;
                                                        if ((i5 & 524288) != 0) {
                                                            TextFieldColors m2217outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2217outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                                            composer3 = startRestartGroup;
                                                            keyboardActions4 = keyboardActions3;
                                                            i35 = i42 & (-1879048193);
                                                            z10 = z15;
                                                            z11 = z16;
                                                            textStyle5 = textStyle4;
                                                            i32 = i40;
                                                            visualTransformation3 = none;
                                                            keyboardOptions3 = keyboardOptions4;
                                                            z13 = z18;
                                                            i33 = i31;
                                                            i34 = i41;
                                                            textFieldColors3 = m2217outlinedTextFieldColorsdx8h9Zs;
                                                            z12 = z17;
                                                        } else {
                                                            composer3 = startRestartGroup;
                                                            textFieldColors3 = textFieldColors;
                                                            keyboardActions4 = keyboardActions3;
                                                            z10 = z15;
                                                            z11 = z16;
                                                            textStyle5 = textStyle4;
                                                            i32 = i40;
                                                            z12 = z17;
                                                            visualTransformation3 = none;
                                                            keyboardOptions3 = keyboardOptions4;
                                                            z13 = z18;
                                                            i33 = i31;
                                                            i34 = i41;
                                                            i35 = i42;
                                                        }
                                                    }
                                                    composer3.endDefaults();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        z14 = z11;
                                                        ComposerKt.traceEventStart(-365650761, i32, i35, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:546)");
                                                    } else {
                                                        z14 = z11;
                                                    }
                                                    if (mutableInteractionSource3 == null) {
                                                        composer3.startReplaceGroup(-1063693660);
                                                        ComposerKt.sourceInformation(composer3, "548@28839L39");
                                                        ComposerKt.sourceInformationMarkerStart(composer3, 796971294, "CC(remember):OutlinedTextField.kt#9igjgp");
                                                        Object rememberedValue = composer3.rememberedValue();
                                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                            composer3.updateRememberedValue(rememberedValue);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        composer3.endReplaceGroup();
                                                        mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                                    } else {
                                                        composer3.startReplaceGroup(796970643);
                                                        composer3.endReplaceGroup();
                                                        mutableInteractionSource4 = mutableInteractionSource3;
                                                    }
                                                    composer3.startReplaceGroup(796976389);
                                                    ComposerKt.sourceInformation(composer3, "*550@29018L18");
                                                    long m7865getColor0d7_KjU = textStyle5.m7865getColor0d7_KjU();
                                                    if (m7865getColor0d7_KjU == 16) {
                                                        m7865getColor0d7_KjU = textFieldColors3.textColor(z10, composer3, ((i32 >> 9) & 14) | ((i35 >> 24) & 112)).getValue().m5667unboximpl();
                                                    }
                                                    composer3.endReplaceGroup();
                                                    TextStyle merge = textStyle5.merge(new TextStyle(m7865getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                    TextStyle textStyle7 = textStyle5;
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                    Object consume2 = composer3.consume(localDensity);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    Density density = (Density) consume2;
                                                    if (function211 != null) {
                                                        composer3.startReplaceGroup(-1063222398);
                                                        ComposerKt.sourceInformation(composer3, "564@29575L2");
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        i36 = i32;
                                                        ComposerKt.sourceInformationMarkerStart(composer3, 796994809, "CC(remember):OutlinedTextField.kt#9igjgp");
                                                        Object rememberedValue2 = composer3.rememberedValue();
                                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue2 = new Function1() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda8
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    Unit OutlinedTextField$lambda$17$lambda$16;
                                                                    OutlinedTextField$lambda$17$lambda$16 = OutlinedTextFieldKt.OutlinedTextField$lambda$17$lambda$16((SemanticsPropertyReceiver) obj);
                                                                    return OutlinedTextField$lambda$17$lambda$16;
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(rememberedValue2);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        companion2 = PaddingKt.m841paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion3, true, (Function1) rememberedValue2), 0.0f, density.mo419toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null);
                                                        composer3.endReplaceGroup();
                                                    } else {
                                                        i36 = i32;
                                                        composer3.startReplaceGroup(-1062837037);
                                                        composer3.endReplaceGroup();
                                                        companion2 = Modifier.INSTANCE;
                                                    }
                                                    Modifier modifier4 = companion;
                                                    final boolean z19 = z12;
                                                    final TextFieldColors textFieldColors4 = textFieldColors3;
                                                    final boolean z20 = z10;
                                                    final boolean z21 = z13;
                                                    final VisualTransformation visualTransformation4 = visualTransformation3;
                                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                                    final Function2<? super Composer, ? super Integer, Unit> function215 = function211;
                                                    final Function2<? super Composer, ? super Integer, Unit> function216 = function212;
                                                    final Function2<? super Composer, ? super Integer, Unit> function217 = function213;
                                                    final Function2<? super Composer, ? super Integer, Unit> function218 = function214;
                                                    final Shape shape4 = shape3;
                                                    int i43 = i35 << 12;
                                                    boolean z22 = z14;
                                                    Composer composer4 = composer3;
                                                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m873defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(companion.then(companion2), z12, Strings_androidKt.m2167getString4foXLRw(Strings.INSTANCE.m2161getDefaultErrorMessageUdPEhr4(), composer3, 6)), TextFieldDefaults.INSTANCE.m2214getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2213getMinHeightD9Ej5fM()), z10, z22, merge, keyboardOptions3, keyboardActions4, z13, i33, i34, visualTransformation3, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, new SolidColor(textFieldColors3.cursorColor(z12, composer3, (i35 & 14) | ((i35 >> 24) & 112)).getValue().m5667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(-1881867558, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$13
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i44) {
                                                            int i45;
                                                            ComposerKt.sourceInformation(composer5, "CN(innerTextField)603@31268L294,589@30617L964:OutlinedTextField.kt#jmzs0o");
                                                            if ((i44 & 6) == 0) {
                                                                i45 = i44 | (composer5.changedInstance(function219) ? 4 : 2);
                                                            } else {
                                                                i45 = i44;
                                                            }
                                                            if (!composer5.shouldExecute((i45 & 19) != 18, i45 & 1)) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1881867558, i45, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:589)");
                                                            }
                                                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                            String text = TextFieldValue.this.getText();
                                                            boolean z23 = z20;
                                                            int i46 = i45;
                                                            boolean z24 = z21;
                                                            VisualTransformation visualTransformation5 = visualTransformation4;
                                                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                                            boolean z25 = z19;
                                                            Function2<Composer, Integer, Unit> function220 = function215;
                                                            Function2<Composer, Integer, Unit> function221 = function216;
                                                            Function2<Composer, Integer, Unit> function222 = function217;
                                                            Function2<Composer, Integer, Unit> function223 = function218;
                                                            Shape shape5 = shape4;
                                                            TextFieldColors textFieldColors5 = textFieldColors4;
                                                            final boolean z26 = z20;
                                                            final boolean z27 = z19;
                                                            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource5;
                                                            final TextFieldColors textFieldColors6 = textFieldColors4;
                                                            final Shape shape6 = shape4;
                                                            textFieldDefaults.OutlinedTextFieldDecorationBox(text, function219, z23, z24, visualTransformation5, mutableInteractionSource6, z25, function220, function221, function222, function223, shape5, textFieldColors5, null, ComposableLambdaKt.rememberComposableLambda(-185364670, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$13.1
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                    invoke(composer6, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer6, int i47) {
                                                                    ComposerKt.sourceInformation(composer6, "C604@31312L228:OutlinedTextField.kt#jmzs0o");
                                                                    if (!composer6.shouldExecute((i47 & 3) != 2, i47 & 1)) {
                                                                        composer6.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-185364670, i47, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:604)");
                                                                    }
                                                                    TextFieldDefaults.INSTANCE.m2211BorderBoxnbWgWpA(z26, z27, mutableInteractionSource7, textFieldColors6, shape6, 0.0f, 0.0f, composer6, 12582912, 96);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }, composer5, 54), composer5, (i46 << 3) & 112, 221184, 8192);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer3, 54), composer4, (i36 & 64638) | (3670016 & i43) | (29360128 & i43) | (234881024 & i43) | (i43 & 1879048192), ((i35 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i35 & 112), 4096);
                                                    composer2 = composer4;
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    VisualTransformation visualTransformation5 = visualTransformation3;
                                                    z8 = z13;
                                                    visualTransformation2 = visualTransformation5;
                                                    textStyle3 = textStyle7;
                                                    textFieldColors2 = textFieldColors4;
                                                    z6 = z10;
                                                    z9 = z22;
                                                    i28 = i33;
                                                    i29 = i34;
                                                    modifier3 = modifier4;
                                                    function27 = function211;
                                                    function28 = function212;
                                                    function29 = function213;
                                                    mutableInteractionSource2 = mutableInteractionSource3;
                                                    shape2 = shape3;
                                                    keyboardOptions2 = keyboardOptions3;
                                                    keyboardActions2 = keyboardActions4;
                                                    function210 = function214;
                                                    z7 = z19;
                                                } else {
                                                    composer2 = startRestartGroup;
                                                    composer2.skipToGroupEnd();
                                                    z6 = z;
                                                    z7 = z3;
                                                    visualTransformation2 = visualTransformation;
                                                    z8 = z4;
                                                    i28 = i;
                                                    i29 = i2;
                                                    mutableInteractionSource2 = mutableInteractionSource;
                                                    shape2 = shape;
                                                    textFieldColors2 = textFieldColors;
                                                    z9 = z5;
                                                    textStyle3 = textStyle2;
                                                    function27 = function25;
                                                    function28 = function26;
                                                    modifier3 = modifier2;
                                                    function29 = function23;
                                                    function210 = function24;
                                                    keyboardOptions2 = keyboardOptions;
                                                    keyboardActions2 = keyboardActions;
                                                }
                                                endRestartGroup = composer2.endRestartGroup();
                                                if (endRestartGroup != null) {
                                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda9
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit OutlinedTextField$lambda$19;
                                                            OutlinedTextField$lambda$19 = OutlinedTextFieldKt.OutlinedTextField$lambda$19(TextFieldValue.this, function1, modifier3, z6, z9, textStyle3, function27, function28, function29, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i28, i29, mutableInteractionSource2, shape2, textFieldColors2, i3, i4, i5, (Composer) obj, ((Integer) obj2).intValue());
                                                            return OutlinedTextField$lambda$19;
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        }
                                        i25 = i5 & 65536;
                                        if (i25 != 0) {
                                        }
                                        i26 = i5 & 131072;
                                        if (i26 != 0) {
                                        }
                                        if ((i4 & 100663296) == 0) {
                                        }
                                        if ((i4 & 805306368) == 0) {
                                        }
                                        i27 = i24;
                                        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (306783379 & i27) != 306783378, i6 & 1)) {
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup != null) {
                                        }
                                    }
                                }
                                if ((i4 & 3072) == 0) {
                                }
                                int i392 = i22;
                                i23 = i5 & 16384;
                                if (i23 == 0) {
                                }
                                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                }
                                i25 = i5 & 65536;
                                if (i25 != 0) {
                                }
                                i26 = i5 & 131072;
                                if (i26 != 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                if ((i4 & 805306368) == 0) {
                                }
                                i27 = i24;
                                if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (306783379 & i27) != 306783378, i6 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i15 = i14;
                            i16 = i5 & 1024;
                            if (i16 != 0) {
                            }
                            i19 = i5 & 2048;
                            if (i19 != 0) {
                            }
                            int i382 = i18;
                            i21 = i5 & 4096;
                            if (i21 != 0) {
                            }
                            if ((i4 & 3072) == 0) {
                            }
                            int i3922 = i22;
                            i23 = i5 & 16384;
                            if (i23 == 0) {
                            }
                            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            i25 = i5 & 65536;
                            if (i25 != 0) {
                            }
                            i26 = i5 & 131072;
                            if (i26 != 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            i27 = i24;
                            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (306783379 & i27) != 306783378, i6 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i5 & 512;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i5 & 1024;
                        if (i16 != 0) {
                        }
                        i19 = i5 & 2048;
                        if (i19 != 0) {
                        }
                        int i3822 = i18;
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                        }
                        if ((i4 & 3072) == 0) {
                        }
                        int i39222 = i22;
                        i23 = i5 & 16384;
                        if (i23 == 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        i25 = i5 & 65536;
                        if (i25 != 0) {
                        }
                        i26 = i5 & 131072;
                        if (i26 != 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        i27 = i24;
                        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (306783379 & i27) != 306783378, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    z5 = z2;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i10 = i5 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 1024;
                    if (i16 != 0) {
                    }
                    i19 = i5 & 2048;
                    if (i19 != 0) {
                    }
                    int i38222 = i18;
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    if ((i4 & 3072) == 0) {
                    }
                    int i392222 = i22;
                    i23 = i5 & 16384;
                    if (i23 == 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i25 = i5 & 65536;
                    if (i25 != 0) {
                    }
                    i26 = i5 & 131072;
                    if (i26 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    i27 = i24;
                    if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (306783379 & i27) != 306783378, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                z5 = z2;
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i5 & 1024;
                if (i16 != 0) {
                }
                i19 = i5 & 2048;
                if (i19 != 0) {
                }
                int i382222 = i18;
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                if ((i4 & 3072) == 0) {
                }
                int i3922222 = i22;
                i23 = i5 & 16384;
                if (i23 == 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i25 = i5 & 65536;
                if (i25 != 0) {
                }
                i26 = i5 & 131072;
                if (i26 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                i27 = i24;
                if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (306783379 & i27) != 306783378, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i8 = i5 & 8;
            int i372 = 2048;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            z5 = z2;
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i5 & 1024;
            if (i16 != 0) {
            }
            i19 = i5 & 2048;
            if (i19 != 0) {
            }
            int i3822222 = i18;
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            if ((i4 & 3072) == 0) {
            }
            int i39222222 = i22;
            i23 = i5 & 16384;
            if (i23 == 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i25 = i5 & 65536;
            if (i25 != 0) {
            }
            i26 = i5 & 131072;
            if (i26 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            i27 = i24;
            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (306783379 & i27) != 306783378, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        int i3722 = 2048;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        z5 = z2;
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i5 & 1024;
        if (i16 != 0) {
        }
        i19 = i5 & 2048;
        if (i19 != 0) {
        }
        int i38222222 = i18;
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        int i392222222 = i22;
        i23 = i5 & 16384;
        if (i23 == 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i25 = i5 & 65536;
        if (i25 != 0) {
        }
        i26 = i5 & 131072;
        if (i26 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        i27 = i24;
        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378 || (306783379 & i27) != 306783378, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedTextField$lambda$17$lambda$16(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c9, code lost:
    
        if (r3.changed(r84) == false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0296  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void OutlinedTextField(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        TextStyle textStyle2;
        int i9;
        Function2 function25;
        int i10;
        Function2 function26;
        int i11;
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
        Composer composer2;
        final boolean z7;
        final VisualTransformation visualTransformation2;
        final boolean z8;
        final int i27;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final boolean z9;
        final boolean z10;
        final TextStyle textStyle3;
        final Function2 function27;
        final Function2 function28;
        final Modifier modifier3;
        final Function2 function29;
        final Function2 function210;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        ScopeUpdateScope endRestartGroup;
        TextStyle textStyle4;
        int i28;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        TextFieldColors textFieldColors3;
        KeyboardActions keyboardActions4;
        Modifier modifier4;
        boolean z11;
        boolean z12;
        int i29;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        boolean z13;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean z14;
        int i30;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape4;
        Composer startRestartGroup = composer.startRestartGroup(1710103060);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextField)N(value,onValueChange,modifier,enabled,readOnly,textStyle,label,placeholder,leadingIcon,trailingIcon,isError,visualTransformation,keyboardOptions,keyboardActions,singleLine,maxLines,interactionSource,shape,colors)643@32719L417:OutlinedTextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(textFieldValue) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i7 = i4 & 8;
                int i31 = 2048;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    z5 = z;
                    i5 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        z6 = z2;
                        i5 |= startRestartGroup.changed(z6) ? 16384 : 8192;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            textStyle2 = textStyle;
                            i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i9 = i4 & 64;
                        if (i9 != 0) {
                            i5 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i2 & 1572864) == 0) {
                                i5 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                            }
                        }
                        i10 = i4 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i2 & 12582912) == 0) {
                                i5 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i11 = i4 & 256;
                        if (i11 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= startRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                            i13 = i4 & 512;
                            if (i13 == 0) {
                                i5 |= 805306368;
                            } else if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changedInstance(function24) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                i15 = i4 & 1024;
                                if (i15 != 0) {
                                    i17 = i3 | 6;
                                    i16 = i15;
                                } else if ((i3 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i3;
                                }
                                i18 = i4 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i3 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i32 = i17;
                                i20 = i4 & 4096;
                                if (i20 != 0) {
                                    i21 = i32 | 384;
                                } else {
                                    i21 = i32;
                                    if ((i3 & 384) == 0) {
                                        i21 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                        if ((i3 & 3072) == 0) {
                                            if ((i4 & 8192) != 0) {
                                            }
                                            i31 = 1024;
                                            i21 |= i31;
                                        }
                                        int i33 = i21;
                                        i22 = i4 & 16384;
                                        if (i22 == 0) {
                                            i23 = i33 | 24576;
                                        } else {
                                            i23 = i33;
                                            if ((i3 & 24576) == 0) {
                                                i23 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                                                i24 = i4 & 32768;
                                                if (i24 != 0) {
                                                    i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                    i23 |= startRestartGroup.changed(i) ? 131072 : 65536;
                                                }
                                                i25 = i4 & 65536;
                                                if (i25 != 0) {
                                                    i23 |= 1572864;
                                                } else if ((i3 & 1572864) == 0) {
                                                    i23 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                                                }
                                                if ((i3 & 12582912) == 0) {
                                                    i23 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                                                }
                                                if ((i3 & 100663296) == 0) {
                                                    i23 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? 67108864 : 33554432;
                                                }
                                                i26 = i23;
                                                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i5 & 1)) {
                                                    startRestartGroup.startDefaults();
                                                    ComposerKt.sourceInformation(startRestartGroup, "628@31980L7,639@32534L39,640@32612L22,641@32684L25");
                                                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                                        startRestartGroup.skipToGroupEnd();
                                                        if ((i4 & 32) != 0) {
                                                            i5 &= -458753;
                                                        }
                                                        if ((i4 & 8192) != 0) {
                                                            i26 &= -7169;
                                                        }
                                                        if ((i4 & 131072) != 0) {
                                                            i26 &= -29360129;
                                                        }
                                                        if ((262144 & i4) != 0) {
                                                            i26 &= -234881025;
                                                        }
                                                        function212 = function23;
                                                        visualTransformation3 = visualTransformation;
                                                        keyboardOptions3 = keyboardOptions;
                                                        keyboardActions4 = keyboardActions;
                                                        z14 = z4;
                                                        i30 = i;
                                                        mutableInteractionSource4 = mutableInteractionSource;
                                                        shape4 = shape;
                                                        textFieldColors3 = textFieldColors;
                                                        composer2 = startRestartGroup;
                                                        z12 = z6;
                                                        i29 = i5;
                                                        function211 = function26;
                                                        modifier4 = modifier2;
                                                        function213 = function24;
                                                        z13 = z3;
                                                        z11 = z5;
                                                    } else {
                                                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                                                        boolean z15 = i7 != 0 ? true : z5;
                                                        boolean z16 = i8 != 0 ? false : z6;
                                                        if ((i4 & 32) != 0) {
                                                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                                            Object consume = startRestartGroup.consume(localTextStyle);
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            i5 &= -458753;
                                                            textStyle4 = (TextStyle) consume;
                                                        } else {
                                                            textStyle4 = textStyle2;
                                                        }
                                                        int i34 = i5;
                                                        Function2 function214 = i9 != 0 ? null : function25;
                                                        Function2 function215 = i10 != 0 ? null : function26;
                                                        Function2 function216 = i12 != 0 ? null : function23;
                                                        Function2 function217 = i14 != 0 ? null : function24;
                                                        boolean z17 = i16 != 0 ? false : z3;
                                                        VisualTransformation none = i19 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                        KeyboardOptions keyboardOptions4 = i20 != 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                        if ((i4 & 8192) != 0) {
                                                            i28 = i26 & (-7169);
                                                            keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                        } else {
                                                            i28 = i26;
                                                            keyboardActions3 = keyboardActions;
                                                        }
                                                        boolean z18 = i22 != 0 ? false : z4;
                                                        int i35 = i24 != 0 ? Integer.MAX_VALUE : i;
                                                        if (i25 != 0) {
                                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1563403973, "CC(remember):OutlinedTextField.kt#9igjgp");
                                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                                        } else {
                                                            mutableInteractionSource3 = mutableInteractionSource;
                                                        }
                                                        if ((i4 & 131072) != 0) {
                                                            i28 &= -29360129;
                                                            shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                                                        } else {
                                                            shape3 = shape;
                                                        }
                                                        int i36 = i28;
                                                        if ((262144 & i4) != 0) {
                                                            composer2 = startRestartGroup;
                                                            keyboardActions4 = keyboardActions3;
                                                            modifier4 = companion;
                                                            textFieldColors3 = TextFieldDefaults.INSTANCE.m2217outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
                                                            i26 = i36 & (-234881025);
                                                            z11 = z15;
                                                            z12 = z16;
                                                            textStyle2 = textStyle4;
                                                            i29 = i34;
                                                            function25 = function214;
                                                            function211 = function215;
                                                            function212 = function216;
                                                            function213 = function217;
                                                            z13 = z17;
                                                            visualTransformation3 = none;
                                                            keyboardOptions3 = keyboardOptions4;
                                                            z14 = z18;
                                                            i30 = i35;
                                                            mutableInteractionSource4 = mutableInteractionSource3;
                                                            shape4 = shape3;
                                                        } else {
                                                            composer2 = startRestartGroup;
                                                            textFieldColors3 = textFieldColors;
                                                            keyboardActions4 = keyboardActions3;
                                                            modifier4 = companion;
                                                            z11 = z15;
                                                            z12 = z16;
                                                            textStyle2 = textStyle4;
                                                            i29 = i34;
                                                            function25 = function214;
                                                            function211 = function215;
                                                            function212 = function216;
                                                            function213 = function217;
                                                            z13 = z17;
                                                            visualTransformation3 = none;
                                                            keyboardOptions3 = keyboardOptions4;
                                                            z14 = z18;
                                                            i30 = i35;
                                                            mutableInteractionSource4 = mutableInteractionSource3;
                                                            shape4 = shape3;
                                                            i26 = i36;
                                                        }
                                                    }
                                                    composer2.endDefaults();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1710103060, i29, i26, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:642)");
                                                    }
                                                    int i37 = i29 & 2147483646;
                                                    int i38 = (i26 & 14) | 1572864 | (i26 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26);
                                                    int i39 = i26 << 3;
                                                    OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier4, z11, z12, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function211, (Function2<? super Composer, ? super Integer, Unit>) function212, (Function2<? super Composer, ? super Integer, Unit>) function213, z13, visualTransformation3, keyboardOptions3, keyboardActions4, z14, i30, 1, mutableInteractionSource4, shape4, textFieldColors3, composer2, i37, i38 | (29360128 & i39) | (234881024 & i39) | (i39 & 1879048192), 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    modifier3 = modifier4;
                                                    z9 = z11;
                                                    z10 = z12;
                                                    textStyle3 = textStyle2;
                                                    function27 = function25;
                                                    function28 = function211;
                                                    function29 = function212;
                                                    function210 = function213;
                                                    z7 = z13;
                                                    visualTransformation2 = visualTransformation3;
                                                    keyboardOptions2 = keyboardOptions3;
                                                    keyboardActions2 = keyboardActions4;
                                                    z8 = z14;
                                                    i27 = i30;
                                                    mutableInteractionSource2 = mutableInteractionSource4;
                                                    shape2 = shape4;
                                                    textFieldColors2 = textFieldColors3;
                                                } else {
                                                    composer2 = startRestartGroup;
                                                    composer2.skipToGroupEnd();
                                                    z7 = z3;
                                                    visualTransformation2 = visualTransformation;
                                                    z8 = z4;
                                                    i27 = i;
                                                    mutableInteractionSource2 = mutableInteractionSource;
                                                    shape2 = shape;
                                                    textFieldColors2 = textFieldColors;
                                                    z9 = z5;
                                                    z10 = z6;
                                                    textStyle3 = textStyle2;
                                                    function27 = function25;
                                                    function28 = function26;
                                                    modifier3 = modifier2;
                                                    function29 = function23;
                                                    function210 = function24;
                                                    keyboardOptions2 = keyboardOptions;
                                                    keyboardActions2 = keyboardActions;
                                                }
                                                endRestartGroup = composer2.endRestartGroup();
                                                if (endRestartGroup != null) {
                                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda7
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit OutlinedTextField$lambda$21;
                                                            OutlinedTextField$lambda$21 = OutlinedTextFieldKt.OutlinedTextField$lambda$21(TextFieldValue.this, function1, modifier3, z9, z10, textStyle3, function27, function28, function29, function210, z7, visualTransformation2, keyboardOptions2, keyboardActions2, z8, i27, mutableInteractionSource2, shape2, textFieldColors2, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                            return OutlinedTextField$lambda$21;
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        i24 = i4 & 32768;
                                        if (i24 != 0) {
                                        }
                                        i25 = i4 & 65536;
                                        if (i25 != 0) {
                                        }
                                        if ((i3 & 12582912) == 0) {
                                        }
                                        if ((i3 & 100663296) == 0) {
                                        }
                                        i26 = i23;
                                        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i5 & 1)) {
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup != null) {
                                        }
                                    }
                                }
                                if ((i3 & 3072) == 0) {
                                }
                                int i332 = i21;
                                i22 = i4 & 16384;
                                if (i22 == 0) {
                                }
                                i24 = i4 & 32768;
                                if (i24 != 0) {
                                }
                                i25 = i4 & 65536;
                                if (i25 != 0) {
                                }
                                if ((i3 & 12582912) == 0) {
                                }
                                if ((i3 & 100663296) == 0) {
                                }
                                i26 = i23;
                                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i5 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i14 = i13;
                            i15 = i4 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i4 & 2048;
                            if (i18 != 0) {
                            }
                            int i322 = i17;
                            i20 = i4 & 4096;
                            if (i20 != 0) {
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            int i3322 = i21;
                            i22 = i4 & 16384;
                            if (i22 == 0) {
                            }
                            i24 = i4 & 32768;
                            if (i24 != 0) {
                            }
                            i25 = i4 & 65536;
                            if (i25 != 0) {
                            }
                            if ((i3 & 12582912) == 0) {
                            }
                            if ((i3 & 100663296) == 0) {
                            }
                            i26 = i23;
                            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i5 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i4 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i4 & 2048;
                        if (i18 != 0) {
                        }
                        int i3222 = i17;
                        i20 = i4 & 4096;
                        if (i20 != 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i33222 = i21;
                        i22 = i4 & 16384;
                        if (i22 == 0) {
                        }
                        i24 = i4 & 32768;
                        if (i24 != 0) {
                        }
                        i25 = i4 & 65536;
                        if (i25 != 0) {
                        }
                        if ((i3 & 12582912) == 0) {
                        }
                        if ((i3 & 100663296) == 0) {
                        }
                        i26 = i23;
                        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    z6 = z2;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i9 = i4 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 != 0) {
                    }
                    int i32222 = i17;
                    i20 = i4 & 4096;
                    if (i20 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i332222 = i21;
                    i22 = i4 & 16384;
                    if (i22 == 0) {
                    }
                    i24 = i4 & 32768;
                    if (i24 != 0) {
                    }
                    i25 = i4 & 65536;
                    if (i25 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i3 & 100663296) == 0) {
                    }
                    i26 = i23;
                    if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z5 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                z6 = z2;
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 != 0) {
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                }
                int i322222 = i17;
                i20 = i4 & 4096;
                if (i20 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i3322222 = i21;
                i22 = i4 & 16384;
                if (i22 == 0) {
                }
                i24 = i4 & 32768;
                if (i24 != 0) {
                }
                i25 = i4 & 65536;
                if (i25 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                i26 = i23;
                if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            int i312 = 2048;
            if (i7 != 0) {
            }
            z5 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            z6 = z2;
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 != 0) {
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
            }
            int i3222222 = i17;
            i20 = i4 & 4096;
            if (i20 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i33222222 = i21;
            i22 = i4 & 16384;
            if (i22 == 0) {
            }
            i24 = i4 & 32768;
            if (i24 != 0) {
            }
            i25 = i4 & 65536;
            if (i25 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            i26 = i23;
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        int i3122 = 2048;
        if (i7 != 0) {
        }
        z5 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        z6 = z2;
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 != 0) {
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
        }
        int i32222222 = i17;
        i20 = i4 & 4096;
        if (i20 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i332222222 = i21;
        i22 = i4 & 16384;
        if (i22 == 0) {
        }
        i24 = i4 & 32768;
        if (i24 != 0) {
        }
        i25 = i4 & 65536;
        if (i25 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        i26 = i23;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (38347923 & i26) != 38347922, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, final Function1<? super Size, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function25, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(36320288);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldLayout)N(modifier,textField,placeholder,label,leading,trailing,singleLine,animationProgress,onLabelMeasured,border,paddingValues)687@33864L268,695@34180L7,696@34192L2415:OutlinedTextField.kt#jmzs0o");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function25) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            function26 = function22;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(36320288, i3, i4, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:685)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 544074092, "CC(remember):OutlinedTextField.kt#9igjgp");
            boolean z2 = ((i4 & 14) == 4) | ((3670016 & i3) == 1048576) | ((234881024 & i3) == 67108864) | ((29360128 & i3) == 8388608);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, outlinedTextFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1336985421, "C704@34696L8,744@36249L183:OutlinedTextField.kt#jmzs0o");
            function25.invoke(startRestartGroup, Integer.valueOf((i3 >> 27) & 14));
            if (function23 != null) {
                startRestartGroup.startReplaceGroup(1336978507);
                ComposerKt.sourceInformation(startRestartGroup, "707@34757L224");
                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.INSTANCE, "Leading"));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, minimumInteractiveComponentSize);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                i5 = i3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2068226786, "C711@34954L9:OutlinedTextField.kt#jmzs0o");
                function23.invoke(startRestartGroup, Integer.valueOf((i5 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                i5 = i3;
                startRestartGroup.startReplaceGroup(1337224523);
                startRestartGroup.endReplaceGroup();
            }
            if (function24 != null) {
                startRestartGroup.startReplaceGroup(1337267241);
                ComposerKt.sourceInformation(startRestartGroup, "715@35048L226");
                Modifier minimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.INSTANCE, "Trailing"));
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, minimumInteractiveComponentSize2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4976constructorimpl3 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl3.getInserting() || !Intrinsics.areEqual(m4976constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4976constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4976constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4983setimpl(m4976constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 479587178, "C719@35246L10:OutlinedTextField.kt#jmzs0o");
                function24.invoke(startRestartGroup, Integer.valueOf((i5 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1337515179);
                startRestartGroup.endReplaceGroup();
            }
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion = Modifier.INSTANCE;
            if (function23 != null) {
                i6 = 0;
                calculateStartPadding = Dp.m8401constructorimpl(RangesKt.coerceAtLeast(Dp.m8401constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m8401constructorimpl(0)));
            } else {
                i6 = 0;
            }
            float f2 = calculateStartPadding;
            if (function24 != null) {
                calculateEndPadding = Dp.m8401constructorimpl(RangesKt.coerceAtLeast(Dp.m8401constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m8401constructorimpl(i6)));
            }
            Modifier m841paddingqDBjuR0$default = PaddingKt.m841paddingqDBjuR0$default(companion, f2, 0.0f, calculateEndPadding, 0.0f, 10, null);
            if (function3 != null) {
                startRestartGroup.startReplaceGroup(1338367152);
                ComposerKt.sourceInformation(startRestartGroup, "741@36162L59");
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, "Hint").then(m841paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i5 >> 3) & 112));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1338454603);
                startRestartGroup.endReplaceGroup();
            }
            Modifier then = LayoutIdKt.layoutId(Modifier.INSTANCE, "TextField").then(m841paddingqDBjuR0$default);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4976constructorimpl4 = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl4.getInserting() || !Intrinsics.areEqual(m4976constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4976constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4976constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4983setimpl(m4976constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -842047077, "C748@36407L11:OutlinedTextField.kt#jmzs0o");
            function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (function22 != null) {
                startRestartGroup.startReplaceGroup(1338685429);
                ComposerKt.sourceInformation(startRestartGroup, "752@36483L54");
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "Label");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m4976constructorimpl5 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl5, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4976constructorimpl5.getInserting() || !Intrinsics.areEqual(m4976constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m4976constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m4976constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m4983setimpl(m4976constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1905963083, "C752@36528L7:OutlinedTextField.kt#jmzs0o");
                function26 = function22;
                function26.invoke(startRestartGroup, Integer.valueOf((i5 >> 9) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                function26 = function22;
                startRestartGroup.startReplaceGroup(1338768075);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OutlinedTextFieldLayout$lambda$28;
                    OutlinedTextFieldLayout$lambda$28 = OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$28(Modifier.this, function2, function3, function26, function23, function24, z, f, function1, function25, paddingValues, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OutlinedTextFieldLayout$lambda$28;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m2090calculateWidthO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        return ConstraintsKt.m8371constrainWidthK40F9xA(j, Math.max(i + Math.max(i3, Math.max(MathHelpersKt.lerp(i4, 0, f), i5)) + i2, MathKt.roundToInt((i4 + (Dp.m8401constructorimpl(paddingValues.mo781calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr) + paddingValues.mo782calculateRightPaddingu2uoSUM(LayoutDirection.Ltr)) * f2)) * f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m2089calculateHeightO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int max = Math.max(i3, Math.max(i5, MathHelpersKt.lerp(i4, 0, f)));
        float top = paddingValues.getTop() * f2;
        return ConstraintsKt.m8370constrainHeightK40F9xA(j, Math.max(i, Math.max(i2, MathKt.roundToInt(MathHelpersKt.lerp(top, Math.max(top, i4 / 2.0f), f) + max + (paddingValues.getBottom() * f2)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int roundToInt = MathKt.roundToInt(paddingValues.getTop() * f2);
        int roundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, MathKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f)) + roundToInt2, MathHelpersKt.lerp(z ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i) : roundToInt, -(placeable4.getHeight() / 2), f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i) : roundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(roundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m7140place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m8540getZeronOccac(), 0.0f, 2, null);
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m2091outlineCutout12SF9DM(Modifier modifier, final long j, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new Function1() { // from class: androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit outlineCutout_12SF9DM$lambda$32;
                outlineCutout_12SF9DM$lambda$32 = OutlinedTextFieldKt.outlineCutout_12SF9DM$lambda$32(j, paddingValues, (ContentDrawScope) obj);
                return outlineCutout_12SF9DM$lambda$32;
            }
        });
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit outlineCutout_12SF9DM$lambda$32(long j, PaddingValues paddingValues, ContentDrawScope contentDrawScope) {
        float coerceAtLeast;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > 0.0f) {
            float f = contentDrawScope.mo424toPx0680j_4(OutlinedTextFieldInnerPadding);
            float f2 = contentDrawScope.mo424toPx0680j_4(paddingValues.mo781calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - f;
            float f3 = 2;
            float f4 = intBitsToFloat + f2 + (f * f3);
            if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] != 1) {
                coerceAtLeast = RangesKt.coerceAtLeast(f2, 0.0f);
            } else {
                coerceAtLeast = Float.intBitsToFloat((int) (contentDrawScope.mo6236getSizeNHjbRc() >> 32)) - f4;
            }
            float f5 = coerceAtLeast;
            if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                f4 = Float.intBitsToFloat((int) (contentDrawScope.mo6236getSizeNHjbRc() >> 32)) - RangesKt.coerceAtLeast(f2, 0.0f);
            }
            float f6 = f4;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float f7 = (-intBitsToFloat2) / f3;
            float f8 = intBitsToFloat2 / f3;
            int m5645getDifferencertfAjoo = ClipOp.INSTANCE.m5645getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo6157getSizeNHjbRc = drawContext.mo6157getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6160clipRectN_I0leg(f5, f7, f6, f8, m5645getDifferencertfAjoo);
                contentDrawScope.drawContent();
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo6158setSizeuvyYCjk(mo6157getSizeNHjbRc);
            }
        } else {
            contentDrawScope.drawContent();
        }
        return Unit.INSTANCE;
    }
}
