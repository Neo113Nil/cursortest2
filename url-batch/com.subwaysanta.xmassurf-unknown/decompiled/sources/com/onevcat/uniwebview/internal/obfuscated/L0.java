package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class L0 extends Lambda implements Function0 {
    public static final L0 a = new L0();

    public L0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity currentActivity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(currentActivity, "currentActivity");
        return Integer.valueOf(AbstractC0074t.a(currentActivity));
    }
}
