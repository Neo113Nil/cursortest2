package com.yandex.div.core.view2;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* compiled from: AccessibilityListDelegate.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AccessibilityListDelegate$firstChild$1 extends FunctionReferenceImpl implements Function1 {
    public static final AccessibilityListDelegate$firstChild$1 INSTANCE = new AccessibilityListDelegate$firstChild$1();

    AccessibilityListDelegate$firstChild$1() {
        super(1, View.class, "getTop", "getTop()I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Integer invoke(@NotNull View view) {
        return Integer.valueOf(view.getTop());
    }
}
