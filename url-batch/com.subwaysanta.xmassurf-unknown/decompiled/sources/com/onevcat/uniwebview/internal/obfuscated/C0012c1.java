package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.WebSettings;
import com.unity3d.player.UnityPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012c1 extends Lambda implements Function0 {
    public static final C0012c1 a = new C0012c1();

    public C0012c1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            int i = C0092z.i;
            WebSettings.getDefaultUserAgent(UnityPlayer.currentActivity);
        } catch (Exception e) {
            C0058o c0058o = C0058o.b;
            C0008b1 messageProvider = new C0008b1(e);
            c0058o.getClass();
            Intrinsics.checkNotNullParameter(messageProvider, "messageProvider");
            c0058o.a(EnumC0054n.CRITICAL, messageProvider);
        }
        return Unit.INSTANCE;
    }
}
