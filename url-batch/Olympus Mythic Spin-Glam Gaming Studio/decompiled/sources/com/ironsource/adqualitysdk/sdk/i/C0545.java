package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.г, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0545 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f610;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f611 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f612;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1007 f613;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0916 f614;

    static {
        StringFog.decrypt("qE9nWgF7Tk8=\n", "+ioKNXUeCg0=\n");
        StringFog.decrypt("6lQbVmefDJ/1CBFDLJkP0uxDF1p2mAme\n", "niZ6NQL9bfw=\n");
        StringFog.decrypt("7693pdgTNwX5o2qtwF8uEv4=\n", "nMAYyLRyGnY=\n");
        f610 = StringFog.decrypt("egDLmzmKDYQyf+rPHohTwxxVs8EwzBmZPUL9hiGPGplzYPbGI49OkmtO8J4w3E+EKk6xkzbLWJ4K\nSe24IfZPoDFC6JJ+kw==\n", "XjCE9lW+Kvc=\n");
    }

    public C0545(Context context, C1007 c1007, String str) {
        this.f614 = new C0916(context, StringFog.decrypt("D65VgAGu1D0Q8l+VSqjXcAm5WYwQqdE8\n", "e9w042TMtV4=\n"), StringFog.decrypt("1zodCuDCLbfBNgAC+I40oMY=\n", "pFVyZ4yjAMQ=\n"));
        this.f613 = c1007;
        this.f612 = str;
        AbstractC0590 m4087 = AbstractC0590.m4087();
        C0742 c0742 = new C0742(this);
        C0600 c0600 = (C0600) m4087;
        Handler handler = c0600.f1018;
        if (handler != null) {
            handler.post(new C0630(c0600, c0742));
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m4043(AbstractC0442 abstractC0442, InterfaceC1153 interfaceC1153) {
        String str;
        String mo4004 = abstractC0442.mo4004();
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            str = this.f612;
        }
        sb.append(str);
        String m4083 = AbstractC0584.m4083("5A==\n", "yyPcPAYx2vg=\n", sb, mo4004);
        String replace = abstractC0442.mo4004().replace(StringFog.decrypt("/w==\n", "0Prxh/nblcY=\n"), StringFog.decrypt("Tg==\n", "YCv5phv/FLs=\n"));
        if (AbstractC0590.m4087().mo4092()) {
            if (AbstractC0590.m4087().mo4091() || this.f614.m4242(replace) == null) {
                C0634 c0634 = new C0634(this, m4083, abstractC0442, replace, interfaceC1153);
                String str2 = AbstractC0530.f589;
                try {
                    Executors.newSingleThreadExecutor().execute(c0634);
                } catch (Throwable th) {
                    AbstractC0577.m4068(AbstractC0530.f589, StringFog.decrypt("CIuQwnq/D1oompfZYfENAiyKm8Nrvx5DPpI=\n", "TfnirQifaiI=\n"), th, false);
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m4044(AbstractC0442 abstractC0442, InterfaceC1153 interfaceC1153) {
        boolean z;
        if (TextUtils.isEmpty(abstractC0442.f321) || TextUtils.isEmpty(abstractC0442.f319)) {
            return null;
        }
        String replace = abstractC0442.mo4004().replace(StringFog.decrypt("/w==\n", "0Prxh/nblcY=\n"), StringFog.decrypt("Tg==\n", "YCv5phv/FLs=\n"));
        synchronized (this) {
            try {
                if (AbstractC0590.m4087().mo4094()) {
                    z = true;
                } else {
                    this.f611.add(new C0727(this, abstractC0442, interfaceC1153));
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m4043(abstractC0442, interfaceC1153);
        }
        return this.f614.m4242(replace);
    }
}
