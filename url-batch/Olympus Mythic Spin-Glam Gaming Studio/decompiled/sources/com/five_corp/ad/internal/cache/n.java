package com.five_corp.ad.internal.cache;

import android.os.Handler;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class n {
    public final Handler b;
    public final com.five_corp.ad.internal.storage.a c;
    public final Object a = new Object();
    public boolean d = false;
    public boolean e = false;
    public ArrayList f = new ArrayList();
    public i g = null;
    public WeakReference h = null;

    public n(Handler handler, com.five_corp.ad.internal.storage.a aVar) {
        this.b = handler;
        this.c = aVar;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                this.b.post(new l(this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.five_corp.ad.internal.util.b b() {
        synchronized (this.a) {
            try {
                if (this.e) {
                    return new com.five_corp.ad.internal.util.b(false, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.b6, null, null), null);
                }
                com.five_corp.ad.internal.storage.a aVar = this.c;
                com.five_corp.ad.internal.util.b b = aVar.a.b(aVar.b);
                if (!b.a) {
                    return new com.five_corp.ad.internal.util.b(false, b.b, null);
                }
                if (!((Boolean) b.c).booleanValue()) {
                    return new com.five_corp.ad.internal.util.b(true, null, 0);
                }
                com.five_corp.ad.internal.storage.b bVar = aVar.a;
                String str = aVar.b;
                bVar.getClass();
                File file = new File(bVar.a, str);
                try {
                    return new com.five_corp.ad.internal.util.b(true, null, Integer.valueOf((int) file.length()));
                } catch (SecurityException e) {
                    return new com.five_corp.ad.internal.util.b(false, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.R2, "File path: " + file.getAbsolutePath(), e), null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            try {
                z = !this.e && this.d;
            } finally {
            }
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        return ((n) obj).c.b.equals(this.c.b);
    }

    public final int hashCode() {
        return this.c.b.hashCode();
    }

    public final com.five_corp.ad.internal.util.b a(int i, com.five_corp.ad.internal.storage.h hVar) {
        com.five_corp.ad.internal.storage.a aVar = this.c;
        com.five_corp.ad.internal.storage.i iVar = new com.five_corp.ad.internal.storage.i(i, aVar.b, aVar.a, this.b, hVar, aVar.c);
        synchronized (this.a) {
            try {
                if (this.e) {
                    return new com.five_corp.ad.internal.util.b(false, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.W5, null, null), null);
                }
                this.h = new WeakReference(iVar);
                return new com.five_corp.ad.internal.util.b(true, null, iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(m mVar) {
        synchronized (this.a) {
            try {
                this.f.add(mVar);
                if (this.d || this.e) {
                    this.b.post(new k(this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
