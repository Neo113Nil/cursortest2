package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.webkit.WebView;
import com.unity3d.player.UnityPlayer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class Y0 extends Lambda implements Function0 {
    public static final Y0 a = new Y0();

    public Y0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = C0092z.i;
        Activity activity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(activity, "currentActivity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            new WebView(activity).destroy();
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
