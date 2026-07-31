package com.mbridge.msdk.foundation.same.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.tools.v0;

/* compiled from: CommonImageLoader.java */
/* loaded from: classes8.dex */
public class b {
    private static b a;

    protected b(Context context) {
    }

    public static b a(Context context) {
        if (a == null) {
            a = new b(context);
        }
        return a;
    }

    public void a() {
    }

    public void a(String str) {
    }

    public Bitmap b(String str) {
        if (v0.k(str)) {
            return null;
        }
        return d.a().c(str);
    }

    public void b() {
    }

    public boolean c(String str) {
        if (v0.k(str)) {
            return false;
        }
        return d.a().d(str);
    }

    public void a(String str, c cVar) {
        d.a().b(str, null, cVar);
    }
}
