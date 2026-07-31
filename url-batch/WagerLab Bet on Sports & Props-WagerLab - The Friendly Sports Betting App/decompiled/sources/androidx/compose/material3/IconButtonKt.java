package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IconButton.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u001aX\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e\u001ab\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0011\u001aX\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u0010\u0013\u001af\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00182\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0019\u001ap\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00182\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001a\u001ap\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00182\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u0010\u001a\u001ab\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001d\u001ap\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u00182\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001f\u001ab\u0010 \u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001d\u001ap\u0010!\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u00182\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001f\u001an\u0010\"\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010%\u001a|\u0010&\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\b\u001a\u00020\u00182\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010'\u001ab\u0010(\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u0010)\u001ap\u0010*\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0003¢\u0006\u0002\u0010+¨\u0006,"}, d2 = {"IconButton", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "colors", "Landroidx/compose/material3/IconButtonColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "shape", "Landroidx/compose/ui/graphics/Shape;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconButtonImpl", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "IconToggleButton", "checked", "onCheckedChange", "Lkotlin/Function1;", "Landroidx/compose/material3/IconToggleButtonColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "IconToggleButtonImpl", "FilledIconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FilledTonalIconButton", "FilledTonalIconToggleButton", "OutlinedIconButton", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OutlinedIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SurfaceIconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SurfaceIconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledIconButton$lambda$10(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledIconButton(function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledIconToggleButton$lambda$13(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledIconToggleButton(z, function1, modifier, z2, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalIconButton$lambda$14(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledTonalIconButton(function0, modifier, z, shape, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalIconToggleButton$lambda$17(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        FilledTonalIconToggleButton(z, function1, modifier, z2, shape, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButton$lambda$0(Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconButton(function0, modifier, z, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButton$lambda$1(Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconButton(function0, modifier, z, iconButtonColors, mutableInteractionSource, shape, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconButtonImpl$lambda$4(Modifier modifier, Function0 function0, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, Composer composer, int i2) {
        IconButtonImpl(modifier, function0, z, shape, iconButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconToggleButton$lambda$5(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconToggleButton(z, function1, modifier, z2, iconToggleButtonColors, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconToggleButton$lambda$6(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconToggleButton(z, function1, modifier, z2, iconToggleButtonColors, mutableInteractionSource, shape, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconToggleButtonImpl$lambda$9(boolean z, Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2, Composer composer, int i3) {
        IconToggleButtonImpl(z, function1, modifier, z2, iconToggleButtonColors, mutableInteractionSource, shape, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedIconButton$lambda$18(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        OutlinedIconButton(function0, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedIconToggleButton$lambda$21(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, Composer composer, int i3) {
        OutlinedIconToggleButton(z, function1, modifier, z2, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconButton$lambda$24(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, Composer composer, int i2) {
        SurfaceIconButton(function0, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconToggleButton$lambda$27(boolean z, Function1 function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, Composer composer, int i2) {
        SurfaceIconToggleButton(z, function1, modifier, z2, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with `shape`", replaceWith = @ReplaceWith(expression = "IconButton(onClick, modifier, enabled, colors, interactionSource, shape, content)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IconButton(final Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i, final int i2) {
        Function0 function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Function2 function22;
        final Modifier modifier3;
        final boolean z3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        IconButtonColors iconButtonColors4;
        Modifier modifier4;
        IconButtonColors iconButtonColors5;
        MutableInteractionSource mutableInteractionSource4;
        boolean z4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-2096213317);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButton)N(onClick,modifier,enabled,colors,interactionSource,content)100@4337L13,94@4203L171:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 2048;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 1024;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function22 = function2;
                    } else {
                        function22 = function2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                        }
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "90@4081L18");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier4 = modifier2;
                            iconButtonColors5 = iconButtonColors2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            z4 = z2;
                        } else {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i4 == 0 ? z2 : true;
                            if ((i2 & 8) != 0) {
                                iconButtonColors4 = IconButtonDefaults.INSTANCE.iconButtonColors(startRestartGroup, 6);
                                i3 &= -7169;
                            } else {
                                iconButtonColors4 = iconButtonColors2;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                modifier4 = companion;
                                iconButtonColors5 = iconButtonColors4;
                            } else {
                                modifier4 = companion;
                                iconButtonColors5 = iconButtonColors4;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            z4 = z5;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2096213317, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
                        }
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                        IconButton(function02, modifier4, z4, iconButtonColors5, mutableInteractionSource5, IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6), function22, startRestartGroup, (65534 & i3) | ((i3 << 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors5;
                        mutableInteractionSource3 = mutableInteractionSource5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconButton$lambda$0;
                                IconButton$lambda$0 = IconButtonKt.IconButton$lambda$0(Function0.this, modifier3, z3, iconButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconButton$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(final Function0<Unit> function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1413012038);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButton)N(onClick,modifier,enabled,colors,interactionSource,shape,content)151@6684L226:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i6 = 131072;
                                i3 |= i6;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i6 = 65536;
                        i3 |= i6;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                        function22 = function2;
                    } else {
                        function22 = function2;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "146@6509L18,148@6624L13");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier4 = modifier2;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.iconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                modifier4 = companion;
                                shape2 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                            } else {
                                modifier4 = companion;
                            }
                        }
                        IconButtonColors iconButtonColors4 = iconButtonColors2;
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        boolean z4 = z2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                        }
                        int i9 = i3 << 3;
                        composer2 = startRestartGroup;
                        IconButtonImpl(modifier4, function02, z4, shape2, iconButtonColors4, mutableInteractionSource4, function22, composer2, ((i3 >> 3) & 14) | (i9 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i9) | (i9 & 458752) | (i3 & 3670016));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    final Shape shape3 = shape2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconButton$lambda$1;
                                IconButton$lambda$1 = IconButtonKt.IconButton$lambda$1(Function0.this, modifier3, z3, iconButtonColors3, mutableInteractionSource3, shape3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconButton$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                final Shape shape32 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            final Shape shape322 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        final Shape shape3222 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void IconButtonImpl(final Modifier modifier, final Function0<Unit> function0, final boolean z, final Shape shape, final IconButtonColors iconButtonColors, final MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        MutableInteractionSource mutableInteractionSource2;
        Composer startRestartGroup = composer.startRestartGroup(-1134296466);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconButtonImpl)N(modifier,onClick,enabled,shape,colors,interactionSource,content)174@7337L779:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(iconButtonColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1134296466, i2, -1, "androidx.compose.material3.IconButtonImpl (IconButton.kt:171)");
            }
            if (mutableInteractionSource == null) {
                startRestartGroup.startReplaceGroup(977045485);
                ComposerKt.sourceInformation(startRestartGroup, "173@7293L39");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 862801589, "CC(remember):IconButton.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(862800938);
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            int i3 = i2;
            Modifier childSemantics$default = ChildParentSemanticsKt.childSemantics$default(ClickableKt.m299clickableO2vRcR0$default(BackgroundKt.m261backgroundbw27NRU(ClipKt.clip(SizeKt.m890size6HolHcs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), IconButtonDefaults.m2838smallContainerSizeNwlBFI$material3$default(IconButtonDefaults.INSTANCE, 0, 1, null)), shape), iconButtonColors.m2831containerColorvNxB06k$material3(z), shape), mutableInteractionSource2, RippleKt.m3193rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z, null, Role.m7575boximpl(Role.INSTANCE.m7582getButtono7Vup1c()), function0, 8, null), null, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, childSemantics$default);
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
            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -414233073, "C192@8026L84:IconButton.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(iconButtonColors.m2832contentColorvNxB06k$material3(z))), function2, startRestartGroup, ProvidedValue.$stable | ((i3 >> 15) & 112));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IconButtonImpl$lambda$4;
                    IconButtonImpl$lambda$4 = IconButtonKt.IconButtonImpl$lambda$4(Modifier.this, function0, z, shape, iconButtonColors, mutableInteractionSource, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return IconButtonImpl$lambda$4;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0069  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use overload with `shape`", replaceWith = @ReplaceWith(expression = "IconToggleButton(checked, onCheckedChange, modifier, enabled, colors, interactionSource, shape, content)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IconToggleButton(final boolean z, final Function1 function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        Function1 function12;
        Modifier modifier2;
        int i4;
        boolean z4;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        boolean z6;
        IconToggleButtonColors iconToggleButtonColors4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1307193856);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconToggleButton)N(checked,onCheckedChange,modifier,enabled,colors,interactionSource,content)251@10719L13,244@10554L202:IconButton.kt#uh7d8r");
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
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "240@10426L24");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonColors(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    modifier4 = companion;
                                    mutableInteractionSource4 = null;
                                    z6 = z4;
                                    iconToggleButtonColors4 = iconToggleButtonColors2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1307193856, i3, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                                    }
                                    composer2 = startRestartGroup;
                                    IconToggleButton(z3, function12, modifier4, z6, iconToggleButtonColors4, mutableInteractionSource4, IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6), function2, composer2, (524286 & i3) | ((i3 << 3) & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z5 = z6;
                                    iconToggleButtonColors3 = iconToggleButtonColors4;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                } else {
                                    modifier4 = companion;
                                }
                            }
                            iconToggleButtonColors4 = iconToggleButtonColors2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            z6 = z4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            IconToggleButton(z3, function12, modifier4, z6, iconToggleButtonColors4, mutableInteractionSource4, IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6), function2, composer2, (524286 & i3) | ((i3 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            z5 = z6;
                            iconToggleButtonColors3 = iconToggleButtonColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z4;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit IconToggleButton$lambda$5;
                                    IconToggleButton$lambda$5 = IconButtonKt.IconToggleButton$lambda$5(z, function1, modifier3, z5, iconToggleButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return IconToggleButton$lambda$5;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        Function1<? super Boolean, Unit> function12;
        Modifier modifier2;
        int i4;
        boolean z4;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        IconToggleButtonColors iconToggleButtonColors4;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape4;
        int i8;
        Modifier modifier4;
        int i9;
        boolean z6;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1031402037);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconToggleButton)N(checked,onCheckedChange,modifier,enabled,colors,interactionSource,shape,content)299@13114L275:IconButton.kt#uh7d8r");
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
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            }
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i10 = 524288;
                        i3 |= i10;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                        i6 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "294@12933L24,296@13054L13");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                i9 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                                if ((i2 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape4 = shape2;
                                i8 = -1031402037;
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i12 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i7 = i6 & (-57345);
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonColors(startRestartGroup, 6);
                                } else {
                                    i7 = i6;
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource2 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    shape4 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                                    z6 = z4;
                                    iconToggleButtonColors4 = iconToggleButtonColors2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    modifier4 = companion;
                                    i9 = (-3670017) & i7;
                                    i8 = -1031402037;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i8, i9, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                                    }
                                    composer2 = startRestartGroup;
                                    IconToggleButtonImpl(z3, function12, modifier4, z6, iconToggleButtonColors4, mutableInteractionSource4, shape4, function2, composer2, i9 & 33554430, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z5 = z6;
                                    iconToggleButtonColors3 = iconToggleButtonColors4;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    shape3 = shape4;
                                } else {
                                    iconToggleButtonColors4 = iconToggleButtonColors2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    shape4 = shape2;
                                    i8 = -1031402037;
                                    modifier4 = companion;
                                    i9 = i7;
                                }
                            }
                            z6 = z4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            IconToggleButtonImpl(z3, function12, modifier4, z6, iconToggleButtonColors4, mutableInteractionSource4, shape4, function2, composer2, i9 & 33554430, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            z5 = z6;
                            iconToggleButtonColors3 = iconToggleButtonColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                            shape3 = shape4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z4;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape3 = shape2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit IconToggleButton$lambda$6;
                                    IconToggleButton$lambda$6 = IconButtonKt.IconToggleButton$lambda$6(z, function1, modifier3, z5, iconToggleButtonColors3, mutableInteractionSource3, shape3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return IconToggleButton$lambda$6;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IconToggleButtonImpl(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i6;
        final Modifier modifier3;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1724745099);
        ComposerKt.sourceInformation(startRestartGroup, "C(IconToggleButtonImpl)N(checked,onCheckedChange,modifier,enabled,colors,interactionSource,shape,content)329@14159L32,323@13928L814:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i9 = 524288;
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "316@13619L31,318@13747L13");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            int i12 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                            if ((i2 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            boolean z5 = z3;
                            modifier4 = modifier2;
                            z4 = z5;
                            i8 = i12;
                        } else {
                            Modifier.Companion companion = i11 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i7 = i6 & (-57345);
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonVibrantColors(startRestartGroup, 6);
                            } else {
                                i7 = i6;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            if ((i2 & 64) != 0) {
                                shape2 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                                i8 = i7 & (-3670017);
                            } else {
                                i8 = i7;
                            }
                            z4 = z3;
                            modifier4 = companion;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1724745099, i8, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
                        }
                        if (mutableInteractionSource2 == null) {
                            startRestartGroup.startReplaceGroup(1187972528);
                            ComposerKt.sourceInformation(startRestartGroup, "322@13884L39");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -377320302, "CC(remember):IconButton.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-377320953);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        int i13 = ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 896);
                        Modifier m1171toggleableO2vRcR0 = ToggleableKt.m1171toggleableO2vRcR0(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(SizeKt.m890size6HolHcs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier4), IconButtonDefaults.m2838smallContainerSizeNwlBFI$material3$default(IconButtonDefaults.INSTANCE, 0, 1, null)), shape2), iconToggleButtonColors2.containerColor$material3(z4, z, startRestartGroup, i13).getValue().m5667unboximpl(), null, 2, null), z, mutableInteractionSource3, RippleKt.m3193rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z4, Role.m7575boximpl(Role.INSTANCE.m7584getCheckboxo7Vup1c()), function1);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1171toggleableO2vRcR0);
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
                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 190782627, "C340@14607L30,341@14652L84:IconButton.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m5647boximpl(iconToggleButtonColors2.contentColor$material3(z4, z, startRestartGroup, i13).getValue().m5667unboximpl())), function2, startRestartGroup, ProvidedValue.$stable | ((i8 >> 18) & 112));
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                    }
                    final IconToggleButtonColors iconToggleButtonColors3 = iconToggleButtonColors2;
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    final Shape shape3 = shape2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit IconToggleButtonImpl$lambda$9;
                                IconToggleButtonImpl$lambda$9 = IconButtonKt.IconToggleButtonImpl$lambda$9(z, function1, modifier3, z4, iconToggleButtonColors3, mutableInteractionSource4, shape3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return IconToggleButtonImpl$lambda$9;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i6 & 1)) {
                }
                final IconToggleButtonColors iconToggleButtonColors32 = iconToggleButtonColors2;
                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                final Shape shape32 = shape2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i6 & 1)) {
            }
            final IconToggleButtonColors iconToggleButtonColors322 = iconToggleButtonColors2;
            final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            final Shape shape322 = shape2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i6 & 1)) {
        }
        final IconToggleButtonColors iconToggleButtonColors3222 = iconToggleButtonColors2;
        final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        final Shape shape3222 = shape2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        IconButtonColors iconButtonColors4;
        Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(947208840);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconButton)N(onClick,modifier,enabled,shape,colors,interactionSource,content)385@16887L252:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "380@16696L11,381@16759L24");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                z4 = z2;
                                shape4 = shape2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                iconButtonColors4 = iconButtonColors2;
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    iconButtonColors2 = IconButtonDefaults.INSTANCE.filledIconButtonColors(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource4 = null;
                                    z4 = z2;
                                    shape4 = shape2;
                                } else {
                                    z4 = z2;
                                    shape4 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                }
                                iconButtonColors4 = iconButtonColors2;
                                modifier4 = companion;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                            }
                            int i9 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                            int i10 = i3 << 3;
                            composer2 = startRestartGroup;
                            SurfaceIconButton(function02, modifier4, z4, shape4, iconButtonColors4, null, mutableInteractionSource4, function2, composer2, i9 | (3670016 & i10) | (i10 & 29360128));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape4;
                            iconButtonColors3 = iconButtonColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            iconButtonColors3 = iconButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit FilledIconButton$lambda$10;
                                    FilledIconButton$lambda$10 = IconButtonKt.FilledIconButton$lambda$10(Function0.this, modifier3, z3, shape3, iconButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return FilledIconButton$lambda$10;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        Function1<? super Boolean, Unit> function12;
        Modifier modifier2;
        int i4;
        boolean z4;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final Shape shape3;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        MutableInteractionSource mutableInteractionSource4;
        boolean z6;
        Shape shape4;
        int i7;
        Object rememberedValue;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-713829427);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledIconToggleButton)N(checked,onCheckedChange,modifier,enabled,shape,colors,interactionSource,content)441@19585L24,438@19452L336:IconButton.kt#uh7d8r");
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
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            }
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                        i6 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "433@19249L11,434@19318L30");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i6 &= -458753;
                                }
                                companion = modifier2;
                            } else {
                                companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                    shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.filledIconToggleButtonColors(startRestartGroup, 6);
                                    i6 &= -458753;
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource4 = null;
                                    z6 = z4;
                                    shape4 = shape2;
                                    i7 = i6;
                                    IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-713829427, i7, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1204705317, "CC(remember):IconButton.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit FilledIconToggleButton$lambda$12$lambda$11;
                                                FilledIconToggleButton$lambda$12$lambda$11 = IconButtonKt.FilledIconToggleButton$lambda$12$lambda$11((SemanticsPropertyReceiver) obj);
                                                return FilledIconToggleButton$lambda$12$lambda$11;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i11 = i7 << 3;
                                    composer2 = startRestartGroup;
                                    SurfaceIconToggleButton(z3, function12, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z6, shape4, iconToggleButtonColors4, null, mutableInteractionSource4, function2, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i11) | (i11 & 234881024));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = companion;
                                    z5 = z6;
                                    shape3 = shape4;
                                    iconToggleButtonColors3 = iconToggleButtonColors4;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                }
                            }
                            z6 = z4;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            i7 = i6;
                            shape4 = shape2;
                            IconToggleButtonColors iconToggleButtonColors42 = iconToggleButtonColors2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1204705317, "CC(remember):IconButton.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i112 = i7 << 3;
                            composer2 = startRestartGroup;
                            SurfaceIconToggleButton(z3, function12, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z6, shape4, iconToggleButtonColors42, null, mutableInteractionSource4, function2, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i112) | (i112 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = companion;
                            z5 = z6;
                            shape3 = shape4;
                            iconToggleButtonColors3 = iconToggleButtonColors42;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z4;
                            shape3 = shape2;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit FilledIconToggleButton$lambda$13;
                                    FilledIconToggleButton$lambda$13 = IconButtonKt.FilledIconToggleButton$lambda$13(z, function1, modifier3, z5, shape3, iconToggleButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return FilledIconToggleButton$lambda$13;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 128) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 128) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 128) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledIconToggleButton$lambda$12$lambda$11(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m7601setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7584getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final IconButtonColors iconButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        IconButtonColors iconButtonColors4;
        Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-399178234);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconButton)N(onClick,modifier,enabled,shape,colors,interactionSource,content)495@22273L252:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i7 = 2048;
                            i3 |= i7;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i7 = 1024;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "490@22077L11,491@22140L29");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                z4 = z2;
                                shape4 = shape2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                iconButtonColors4 = iconButtonColors2;
                                modifier4 = modifier2;
                            } else {
                                Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    iconButtonColors2 = IconButtonDefaults.INSTANCE.filledTonalIconButtonColors(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource4 = null;
                                    z4 = z2;
                                    shape4 = shape2;
                                } else {
                                    z4 = z2;
                                    shape4 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                }
                                iconButtonColors4 = iconButtonColors2;
                                modifier4 = companion;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-399178234, i3, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                            }
                            int i9 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                            int i10 = i3 << 3;
                            composer2 = startRestartGroup;
                            SurfaceIconButton(function02, modifier4, z4, shape4, iconButtonColors4, null, mutableInteractionSource4, function2, composer2, i9 | (3670016 & i10) | (i10 & 29360128));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape4;
                            iconButtonColors3 = iconButtonColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            iconButtonColors3 = iconButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda17
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit FilledTonalIconButton$lambda$14;
                                    FilledTonalIconButton$lambda$14 = IconButtonKt.FilledTonalIconButton$lambda$14(Function0.this, modifier3, z3, shape3, iconButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return FilledTonalIconButton$lambda$14;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        Function1<? super Boolean, Unit> function12;
        Modifier modifier2;
        int i4;
        boolean z4;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final Shape shape3;
        final IconToggleButtonColors iconToggleButtonColors3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        MutableInteractionSource mutableInteractionSource4;
        boolean z6;
        Shape shape4;
        int i7;
        Object rememberedValue;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-436409269);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilledTonalIconToggleButton)N(checked,onCheckedChange,modifier,enabled,shape,colors,interactionSource,content)557@25342L24,554@25209L336:IconButton.kt#uh7d8r");
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
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            }
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                        i6 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "549@25001L11,550@25070L35");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i6 &= -458753;
                                }
                                companion = modifier2;
                            } else {
                                companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                    shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.filledTonalIconToggleButtonColors(startRestartGroup, 6);
                                    i6 &= -458753;
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource4 = null;
                                    z6 = z4;
                                    shape4 = shape2;
                                    i7 = i6;
                                    IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-436409269, i7, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1517505123, "CC(remember):IconButton.kt#9igjgp");
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit FilledTonalIconToggleButton$lambda$16$lambda$15;
                                                FilledTonalIconToggleButton$lambda$16$lambda$15 = IconButtonKt.FilledTonalIconToggleButton$lambda$16$lambda$15((SemanticsPropertyReceiver) obj);
                                                return FilledTonalIconToggleButton$lambda$16$lambda$15;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    int i11 = i7 << 3;
                                    composer2 = startRestartGroup;
                                    SurfaceIconToggleButton(z3, function12, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z6, shape4, iconToggleButtonColors4, null, mutableInteractionSource4, function2, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i11) | (i11 & 234881024));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = companion;
                                    z5 = z6;
                                    shape3 = shape4;
                                    iconToggleButtonColors3 = iconToggleButtonColors4;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                }
                            }
                            z6 = z4;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            i7 = i6;
                            shape4 = shape2;
                            IconToggleButtonColors iconToggleButtonColors42 = iconToggleButtonColors2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1517505123, "CC(remember):IconButton.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            int i112 = i7 << 3;
                            composer2 = startRestartGroup;
                            SurfaceIconToggleButton(z3, function12, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), z6, shape4, iconToggleButtonColors42, null, mutableInteractionSource4, function2, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i112) | (i112 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = companion;
                            z5 = z6;
                            shape3 = shape4;
                            iconToggleButtonColors3 = iconToggleButtonColors42;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z4;
                            shape3 = shape2;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit FilledTonalIconToggleButton$lambda$17;
                                    FilledTonalIconToggleButton$lambda$17 = IconButtonKt.FilledTonalIconToggleButton$lambda$17(z, function1, modifier3, z5, shape3, iconToggleButtonColors3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return FilledTonalIconToggleButton$lambda$17;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 128) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 128) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 128) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledTonalIconToggleButton$lambda$16$lambda$15(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m7601setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7584getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconButton(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        BorderStroke borderStroke2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final boolean z3;
        final Shape shape3;
        final IconButtonColors iconButtonColors3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        IconButtonColors iconButtonColors4;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier4;
        Shape shape4;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1481353380);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconButton)N(onClick,modifier,enabled,shape,colors,border,interactionSource,content)616@28361L254:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        borderStroke2 = borderStroke;
                        if (startRestartGroup.changed(borderStroke2)) {
                            i7 = 131072;
                            i3 |= i7;
                        }
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "610@28084L13,611@28149L26,612@28224L33");
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                z4 = z2;
                                iconButtonColors4 = iconButtonColors2;
                                borderStroke4 = borderStroke2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                i6 = -1481353380;
                                modifier4 = modifier2;
                                shape4 = shape2;
                            } else {
                                Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    iconButtonColors2 = IconButtonDefaults.INSTANCE.outlinedIconButtonColors(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    BorderStroke outlinedIconButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(z2, startRestartGroup, ((i3 >> 6) & 14) | 48);
                                    i3 &= -458753;
                                    borderStroke2 = outlinedIconButtonBorder;
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource4 = null;
                                    z4 = z2;
                                    shape4 = shape2;
                                    iconButtonColors4 = iconButtonColors2;
                                    borderStroke4 = borderStroke2;
                                    modifier4 = companion;
                                } else {
                                    z4 = z2;
                                    iconButtonColors4 = iconButtonColors2;
                                    borderStroke4 = borderStroke2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    modifier4 = companion;
                                    shape4 = shape2;
                                }
                                i6 = -1481353380;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                            }
                            composer2 = startRestartGroup;
                            SurfaceIconButton(function02, modifier4, z4, shape4, iconButtonColors4, borderStroke4, mutableInteractionSource4, function2, composer2, i3 & 33554430);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape4;
                            iconButtonColors3 = iconButtonColors4;
                            borderStroke3 = borderStroke4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            iconButtonColors3 = iconButtonColors2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit OutlinedIconButton$lambda$18;
                                    OutlinedIconButton$lambda$18 = IconButtonKt.OutlinedIconButton$lambda$18(Function0.this, modifier3, z3, shape3, iconButtonColors3, borderStroke3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return OutlinedIconButton$lambda$18;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 128) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 128) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 128) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        BorderStroke borderStroke2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape3;
        final IconToggleButtonColors iconToggleButtonColors3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1703707081);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedIconToggleButton)N(checked,onCheckedChange,modifier,enabled,shape,colors,border,interactionSource,content)677@31487L24,674@31354L338:IconButton.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i12 = 16384;
                                i3 |= i12;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i12 = 8192;
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            iconToggleButtonColors2 = iconToggleButtonColors;
                            if (startRestartGroup.changed(iconToggleButtonColors2)) {
                                i11 = 131072;
                                i3 |= i11;
                            }
                        } else {
                            iconToggleButtonColors2 = iconToggleButtonColors;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            if (startRestartGroup.changed(borderStroke2)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i10 = 524288;
                        i3 |= i10;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((12582912 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
                            i7 = i3;
                            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "668@31050L13,669@31121L32,670@31202L48");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        z3 = true;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i8 = i7 & (-57345);
                                        shape2 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                    } else {
                                        i8 = i7;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i8 &= -458753;
                                        iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonColors(startRestartGroup, 6);
                                    }
                                    if ((i2 & 64) != 0) {
                                        borderStroke2 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonBorder(z3, z, startRestartGroup, ((i8 >> 9) & 14) | 384 | ((i8 << 3) & 112));
                                        i9 = i8 & (-3670017);
                                    } else {
                                        i9 = i8;
                                    }
                                    if (i6 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    i9 = (i2 & 16) != 0 ? i7 & (-57345) : i7;
                                    if ((i2 & 32) != 0) {
                                        i9 &= -458753;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i9 &= -3670017;
                                    }
                                }
                                Shape shape4 = shape2;
                                BorderStroke borderStroke4 = borderStroke2;
                                Modifier modifier4 = modifier2;
                                IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1703707081, i9, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -879944465, "CC(remember):IconButton.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit OutlinedIconToggleButton$lambda$20$lambda$19;
                                            OutlinedIconToggleButton$lambda$20$lambda$19 = IconButtonKt.OutlinedIconToggleButton$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
                                            return OutlinedIconToggleButton$lambda$20$lambda$19;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                boolean z5 = z3;
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                SurfaceIconToggleButton(z, function1, SemanticsModifierKt.semantics$default(modifier4, false, (Function1) rememberedValue, 1, null), z5, shape4, iconToggleButtonColors4, borderStroke4, mutableInteractionSource4, function2, startRestartGroup, i9 & 268434558);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource3 = mutableInteractionSource4;
                                borderStroke3 = borderStroke4;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                shape3 = shape4;
                                z4 = z5;
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z4 = z3;
                                shape3 = shape2;
                                iconToggleButtonColors3 = iconToggleButtonColors2;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit OutlinedIconToggleButton$lambda$21;
                                        OutlinedIconToggleButton$lambda$21 = IconButtonKt.OutlinedIconToggleButton$lambda$21(z, function1, modifier3, z4, shape3, iconToggleButtonColors3, borderStroke3, mutableInteractionSource3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return OutlinedIconToggleButton$lambda$21;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 = i3;
                        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i2 & 256) != 0) {
                    }
                    i7 = i3;
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z2;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 256) != 0) {
                }
                i7 = i3;
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z3 = z2;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 256) != 0) {
            }
            i7 = i3;
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z3 = z2;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 256) != 0) {
        }
        i7 = i3;
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedIconToggleButton$lambda$20$lambda$19(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m7601setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7584getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    private static final void SurfaceIconButton(final Function0<Unit> function0, final Modifier modifier, final boolean z, final Shape shape, final IconButtonColors iconButtonColors, final BorderStroke borderStroke, final MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-171935091);
        ComposerKt.sourceInformation(startRestartGroup, "C(SurfaceIconButton)N(onClick,modifier,enabled,shape,colors,border,interactionSource,content)700@32102L22,707@32355L192,698@32028L519:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(iconButtonColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(borderStroke) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-171935091, i2, -1, "androidx.compose.material3.SurfaceIconButton (IconButton.kt:698)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2020852125, "CC(remember):IconButton.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SurfaceIconButton$lambda$23$lambda$22;
                        SurfaceIconButton$lambda$23$lambda$22 = IconButtonKt.SurfaceIconButton$lambda$23$lambda$22((SemanticsPropertyReceiver) obj);
                        return SurfaceIconButton$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = i2 << 9;
            composer2 = startRestartGroup;
            SurfaceKt.m3412Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null), z, shape, iconButtonColors.m2831containerColorvNxB06k$material3(z), iconButtonColors.m2832contentColorvNxB06k$material3(z), 0.0f, 0.0f, borderStroke, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(669231714, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$SurfaceIconButton$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    ComposerKt.sourceInformation(composer3, "C708@32365L176:IconButton.kt#uh7d8r");
                    if (!composer3.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(669231714, i4, -1, "androidx.compose.material3.SurfaceIconButton.<anonymous> (IconButton.kt:708)");
                    }
                    Modifier m890size6HolHcs = SizeKt.m890size6HolHcs(Modifier.INSTANCE, IconButtonDefaults.m2838smallContainerSizeNwlBFI$material3$default(IconButtonDefaults.INSTANCE, 0, 1, null));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m890size6HolHcs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4976constructorimpl = Updater.m4976constructorimpl(composer3);
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, 495427006, "C712@32522L9:IconButton.kt#uh7d8r");
                    function22.invoke(composer3, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), composer2, (i2 & 8078) | (234881024 & i3) | (i3 & 1879048192), 6, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurfaceIconButton$lambda$24;
                    SurfaceIconButton$lambda$24 = IconButtonKt.SurfaceIconButton$lambda$24(Function0.this, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SurfaceIconButton$lambda$24;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconButton$lambda$23$lambda$22(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m7601setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7582getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    private static final void SurfaceIconToggleButton(final boolean z, final Function1<? super Boolean, Unit> function1, final Modifier modifier, final boolean z2, final Shape shape, final IconToggleButtonColors iconToggleButtonColors, final BorderStroke borderStroke, final MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Function1<? super Boolean, Unit> function12;
        Composer startRestartGroup = composer.startRestartGroup(-1118363928);
        ComposerKt.sourceInformation(startRestartGroup, "C(SurfaceIconToggleButton)N(checked,onCheckedChange,modifier,enabled,shape,colors,border,interactionSource,content)732@33049L24,735@33148L32,736@33218L30,739@33334L192,729@32932L594:IconButton.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function12 = function1;
            i2 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(iconToggleButtonColors) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(borderStroke) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
        }
        if (!startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1118363928, i2, -1, "androidx.compose.material3.SurfaceIconToggleButton (IconButton.kt:728)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1005894784, "CC(remember):IconButton.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SurfaceIconToggleButton$lambda$26$lambda$25;
                        SurfaceIconToggleButton$lambda$26$lambda$25 = IconButtonKt.SurfaceIconToggleButton$lambda$26$lambda$25((SemanticsPropertyReceiver) obj);
                        return SurfaceIconToggleButton$lambda$26$lambda$25;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = i2 >> 9;
            int i4 = (i3 & 896) | (i3 & 14) | ((i2 << 3) & 112);
            SurfaceKt.m3411Surfaced85dljk(z, function12, SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null), z2, shape, iconToggleButtonColors.containerColor$material3(z2, z, startRestartGroup, i4).getValue().m5667unboximpl(), iconToggleButtonColors.contentColor$material3(z2, z, startRestartGroup, i4).getValue().m5667unboximpl(), 0.0f, 0.0f, borderStroke, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(1492028158, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$SurfaceIconToggleButton$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C740@33344L176:IconButton.kt#uh7d8r");
                    if (!composer2.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1492028158, i5, -1, "androidx.compose.material3.SurfaceIconToggleButton.<anonymous> (IconButton.kt:740)");
                    }
                    Modifier m890size6HolHcs = SizeKt.m890size6HolHcs(Modifier.INSTANCE, IconButtonDefaults.m2838smallContainerSizeNwlBFI$material3$default(IconButtonDefaults.INSTANCE, 0, 1, null));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m890size6HolHcs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -555521886, "C744@33501L9:IconButton.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (64638 & i2) | (1879048192 & (i2 << 9)), ((i2 >> 21) & 14) | 48, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurfaceIconToggleButton$lambda$27;
                    SurfaceIconToggleButton$lambda$27 = IconButtonKt.SurfaceIconToggleButton$lambda$27(z, function1, modifier, z2, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SurfaceIconToggleButton$lambda$27;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurfaceIconToggleButton$lambda$26$lambda$25(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m7601setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7584getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }
}
