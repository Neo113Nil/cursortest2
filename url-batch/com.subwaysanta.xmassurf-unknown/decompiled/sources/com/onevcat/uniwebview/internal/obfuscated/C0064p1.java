package com.onevcat.uniwebview.internal.obfuscated;

import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064p1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064p1(String str) {
        super(0);
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r rVar = r.b;
        String name = this.a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        K2 k2 = (K2) rVar.a.get(name);
        if (k2 != null) {
            CustomTabsClient customTabsClient = k2.e;
            if (customTabsClient == null) {
                k2.i = true;
            } else {
                if (k2.f == null) {
                    k2.f = customTabsClient.newSession(new J2(k2));
                }
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(k2.f);
                Integer num = k2.h;
                if (num != null) {
                    builder.setToolbarColor(num.intValue());
                }
                builder.build().launchUrl(k2.a, Uri.parse(k2.c));
            }
        }
        return Unit.INSTANCE;
    }
}
