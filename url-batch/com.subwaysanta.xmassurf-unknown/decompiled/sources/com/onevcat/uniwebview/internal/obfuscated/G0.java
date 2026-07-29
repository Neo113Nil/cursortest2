package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class G0 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(String str, String str2) {
        super(0);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = C0092z.i;
        Activity currentActivity = UnityPlayer.currentActivity;
        Intrinsics.checkNotNullExpressionValue(currentActivity, "currentActivity");
        AbstractC0086x.a(currentActivity, this.a, this.b);
        return Unit.INSTANCE;
    }
}
