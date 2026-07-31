package com.mbridge.msdk.foundation.same.task;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.s0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: CommonTaskLoader.java */
/* loaded from: classes10.dex */
public class b {
    ThreadPoolExecutor a;
    HashMap<Long, com.mbridge.msdk.foundation.same.task.a> b;
    WeakReference<Context> c;

    /* compiled from: CommonTaskLoader.java */
    class a implements a.InterfaceC1419a {
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a a;
        final /* synthetic */ a.InterfaceC1419a b;

        a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC1419a interfaceC1419a) {
            this.a = aVar;
            this.b = interfaceC1419a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC1419a
        public void a(a.b bVar) {
            if (bVar == a.b.CANCEL) {
                b.this.b.remove(Long.valueOf(this.a.getId()));
            } else if (bVar == a.b.FINISH) {
                b.this.b.remove(Long.valueOf(this.a.getId()));
            } else if (bVar == a.b.RUNNING && b.this.c.get() == null) {
                b.this.a();
            }
            a.InterfaceC1419a interfaceC1419a = this.b;
            if (interfaceC1419a != null) {
                interfaceC1419a.a(bVar);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context, int i) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.a = c.b();
        } else {
            if (i == 0) {
                this.a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.a = new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.a.execute(aVar);
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC1419a interfaceC1419a) {
        a(aVar, interfaceC1419a);
        this.a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC1419a interfaceC1419a) {
        this.b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC1419a));
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context) {
        if (s0.a().a("c_t_l_t_p", true)) {
            this.a = c.b();
        } else {
            if (s0.a().a("c_t_p_t_l", true)) {
                int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }
}
