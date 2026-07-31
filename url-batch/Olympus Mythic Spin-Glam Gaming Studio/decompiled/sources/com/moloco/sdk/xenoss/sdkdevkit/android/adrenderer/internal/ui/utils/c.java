package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntSize;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final c a = new c();
    public static final int b = 0;

    public final float a(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    @NotNull
    public final a.AbstractC1677a.g b(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new a.AbstractC1677a.g(a(IntSize.m2567getWidthimpl(layoutCoordinates.mo1946getSizeYbymL2g())), a(IntSize.m2566getHeightimpl(layoutCoordinates.mo1946getSizeYbymL2g())));
    }

    @NotNull
    public final a.AbstractC1677a.f a(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new a.AbstractC1677a.f(a((int) Offset.m1297getXimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))), a((int) Offset.m1298getYimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))));
    }

    @NotNull
    public final a.AbstractC1677a.f a(long j) {
        return new a.AbstractC1677a.f(a((int) Offset.m1297getXimpl(j)), a((int) Offset.m1298getYimpl(j)));
    }

    @NotNull
    public final a.AbstractC1677a.c a(@NotNull LayoutCoordinates layoutCoordinates, @NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        return new a.AbstractC1677a.c(buttonType, a(layoutCoordinates), b(layoutCoordinates));
    }

    public final boolean a(@NotNull a.AbstractC1677a.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.f().c() > 0.0f && cVar.f().d() > 0.0f;
    }
}
