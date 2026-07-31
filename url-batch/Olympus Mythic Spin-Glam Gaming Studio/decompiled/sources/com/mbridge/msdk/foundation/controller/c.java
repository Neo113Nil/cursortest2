package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;
import com.mbridge.msdk.foundation.controller.a;

/* compiled from: MBSDKContext.java */
/* loaded from: classes3.dex */
public class c extends a {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile c t;

    private c() {
    }

    public static c n() {
        if (t == null) {
            synchronized (c.class) {
                try {
                    if (t == null) {
                        t = new c();
                    }
                } finally {
                }
            }
        }
        return t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    protected void a(a.e eVar) {
    }
}
