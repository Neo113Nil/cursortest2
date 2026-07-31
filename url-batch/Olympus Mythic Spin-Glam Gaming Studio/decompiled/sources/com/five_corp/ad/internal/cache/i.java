package com.five_corp.ad.internal.cache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class i implements m {
    public final n a;
    public final String b;
    public final Handler c;
    public final Object d = new Object();
    public boolean e = false;
    public WeakReference f = null;
    public com.five_corp.ad.internal.util.d g = new com.five_corp.ad.internal.util.d();

    public i(n nVar, String str, Handler handler) {
        this.a = nVar;
        this.b = str;
        this.c = handler;
    }

    public final void a(e eVar) {
        synchronized (this.d) {
            try {
                if (this.e) {
                    this.g.a.add(new WeakReference(eVar));
                    return;
                }
                WeakReference weakReference = this.f;
                Bitmap bitmap = weakReference != null ? (Bitmap) weakReference.get() : null;
                if (bitmap == null) {
                    this.g.a.add(new WeakReference(eVar));
                    this.f = null;
                    this.e = true;
                }
                if (bitmap != null) {
                    this.c.post(new h(eVar, bitmap));
                } else {
                    this.a.a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(com.five_corp.ad.internal.l lVar) {
        ArrayList arrayList;
        synchronized (this.d) {
            this.e = false;
            com.five_corp.ad.internal.util.d dVar = this.g;
            dVar.getClass();
            arrayList = new ArrayList();
            dVar.a(arrayList);
            this.g = new com.five_corp.ad.internal.util.d();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.post(new g((e) it.next(), lVar));
        }
    }

    @Override // com.five_corp.ad.internal.cache.m
    public final void a(com.five_corp.ad.internal.l lVar) {
        b(lVar);
    }

    @Override // com.five_corp.ad.internal.cache.m
    public final void a(String str) {
        com.five_corp.ad.internal.util.b bVar;
        ArrayList arrayList;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            if (decodeFile == null) {
                bVar = new com.five_corp.ad.internal.util.b(false, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.K, "BitmapFactory.decodeFile return null: URL: " + this.b + ".", null), null);
            } else {
                bVar = new com.five_corp.ad.internal.util.b(true, null, decodeFile);
            }
        } catch (OutOfMemoryError e) {
            bVar = new com.five_corp.ad.internal.util.b(false, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.L, "BitmapFactory.decodeFile raise OutOfMemoryError: URL: " + this.b + ".", e), null);
        }
        if (!bVar.a) {
            b(bVar.b);
            return;
        }
        synchronized (this.d) {
            this.e = false;
            this.f = new WeakReference((Bitmap) bVar.c);
            com.five_corp.ad.internal.util.d dVar = this.g;
            dVar.getClass();
            arrayList = new ArrayList();
            dVar.a(arrayList);
            this.g = new com.five_corp.ad.internal.util.d();
        }
        String.format("URL: %s ready, call still alive %d callbacks.", this.b, Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.c.post(new h((e) it.next(), (Bitmap) bVar.c));
        }
    }
}
