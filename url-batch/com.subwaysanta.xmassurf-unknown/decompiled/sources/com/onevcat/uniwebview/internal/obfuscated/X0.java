package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class X0 extends Lambda implements Function0 {
    public static final X0 a = new X0();

    public X0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list = K2.j;
        Activity activity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(activity, "currentActivity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        return Boolean.valueOf(H2.a(activity) != null);
    }
}
