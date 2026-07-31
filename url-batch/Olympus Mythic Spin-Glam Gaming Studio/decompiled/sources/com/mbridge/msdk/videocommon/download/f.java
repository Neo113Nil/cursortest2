package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;
import java.io.File;

/* compiled from: HTMLResourceManager.java */
/* loaded from: classes8.dex */
public class f {
    private String a;

    /* compiled from: HTMLResourceManager.java */
    private static class a {
        public static f a = new f(null);
    }

    /* synthetic */ f(e eVar) {
        this();
    }

    public static f a() {
        return a.a;
    }

    public void b() {
        this.a = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
    }

    private f() {
        b();
    }

    public String a(String str) {
        try {
            File file = new File(this.a + "/" + SameMD5.getMD5(c1.b(str)) + ".html");
            if (file.exists()) {
                return o0.e(file);
            }
            return null;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public String b(String str) {
        try {
            String str2 = this.a + "/" + SameMD5.getMD5(c1.b(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f != null && !TextUtils.isEmpty(f.V())) {
                com.mbridge.msdk.foundation.same.d.a(str, file);
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
