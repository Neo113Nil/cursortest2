package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭜ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1199 implements InterfaceC1130 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f3125;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3126;

    public C1199(C0880 c0880, ArrayList arrayList) {
        this.f3125 = c0880;
        this.f3126 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1130
    /* renamed from: ﾇ */
    public final void mo4410(Activity activity) {
        String decrypt = StringFog.decrypt("GdKO/jO7suwTz7z+Iqul\n", "drzIkVDOwb4=\n");
        if (C0880.m4229(this.f3125, activity, this.f3126)) {
            String m4083 = AbstractC0584.m4083("tPmZa9A7dI+54JpZ2jZkjts=\n", "9YnpLb9YAfw=\n", new StringBuilder(), decrypt);
            C0880.m4228(this.f3125, m4083, true, false, Collections.singletonList(activity));
            AbstractC1026.m4313(new C1203(this, m4083, activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1130
    /* renamed from: ﾒ */
    public final void mo4411(Activity activity) {
        String decrypt = StringFog.decrypt("8ToA1aSAI4nxJzI=\n", "nlRGusf1UMU=\n");
        if (C0880.m4229(this.f3125, activity, this.f3126)) {
            String m4083 = AbstractC0584.m4083("tPmZa9A7dI+54JpZ2jZkjts=\n", "9YnpLb9YAfw=\n", new StringBuilder(), decrypt);
            C0880.m4228(this.f3125, m4083, true, false, Collections.singletonList(activity));
            AbstractC1026.m4313(new C1203(this, m4083, activity));
        }
    }
}
