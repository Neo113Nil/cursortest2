package com.iab.omid.library.pubnativenet.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.pubnativenet.internal.d;
import com.iab.omid.library.pubnativenet.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class i implements d.a, com.iab.omid.library.pubnativenet.devicevolume.c {
    private static i f;
    private float a = 0.0f;
    private final com.iab.omid.library.pubnativenet.devicevolume.e b;
    private final com.iab.omid.library.pubnativenet.devicevolume.b c;
    private com.iab.omid.library.pubnativenet.devicevolume.d d;
    private c e;

    public i(com.iab.omid.library.pubnativenet.devicevolume.e eVar, com.iab.omid.library.pubnativenet.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    private c a() {
        if (this.e == null) {
            this.e = c.c();
        }
        return this.e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.pubnativenet.devicevolume.e(), new com.iab.omid.library.pubnativenet.devicevolume.b());
        }
        return f;
    }

    @Override // com.iab.omid.library.pubnativenet.devicevolume.c
    public void a(float f2) {
        this.a = f2;
        Iterator<com.iab.omid.library.pubnativenet.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.b.a(new Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.pubnativenet.internal.d.a
    public void a(boolean z) {
        if (z) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.d.c();
    }
}
