package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056n1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0056n1(String str, String str2) {
        super(0);
        this.a = str;
        this.b = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity activity = UnityPlayer.currentActivity;
        String str = this.a;
        if (str == null) {
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue(activity, "activity");
        new K2(activity, this.b, str, new C0034i());
        return Unit.INSTANCE;
    }
}
