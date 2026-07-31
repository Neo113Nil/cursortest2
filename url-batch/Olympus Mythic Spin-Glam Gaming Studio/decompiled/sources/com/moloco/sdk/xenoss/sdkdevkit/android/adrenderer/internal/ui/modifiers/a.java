package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers;

import android.annotation.SuppressLint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a {
    @SuppressLint({"ModifierFactoryExtensionFunction"})
    @NotNull
    public static final Modifier a(@NotNull Modifier modifier, @NotNull final a.AbstractC1677a.c savedStateButton, @NotNull final Function1 updateButtonState) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(savedStateButton, "savedStateButton");
        Intrinsics.checkNotNullParameter(updateButtonState, "updateButtonState");
        return OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a.a(a.AbstractC1677a.c.this, updateButtonState, (LayoutCoordinates) obj);
            }
        });
    }

    public static final Unit a(a.AbstractC1677a.c cVar, Function1 function1, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c cVar2 = c.a;
        a.AbstractC1677a.c a = cVar2.a(it, cVar.d());
        if (cVar2.a(a) && !Intrinsics.areEqual(a, cVar)) {
            function1.invoke(a);
        }
        return Unit.INSTANCE;
    }
}
