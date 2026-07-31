package com.mbridge.msdk.config.component.common.network.retry;

import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestRetry.java */
/* loaded from: classes9.dex */
public class c {
    private ScheduledFuture<?> d;
    private final String f;
    private final com.mbridge.msdk.config.component.nori.model.a g;
    private final com.mbridge.msdk.config.component.common.network.a h;
    private com.mbridge.msdk.config.component.common.network.result.a i;
    private com.mbridge.msdk.config.component.nori.monitor.b j;
    private com.mbridge.msdk.config.component.common.network.connect.socket.a a = null;
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a b = null;
    private volatile boolean c = false;
    private ScheduledExecutorService e = null;
    private final AtomicInteger k = new AtomicInteger(0);

    /* compiled from: RequestRetry.java */
    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Retry-InstanceScheduler-" + System.currentTimeMillis() + "-" + this.a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* compiled from: RequestRetry.java */
    class b implements com.mbridge.msdk.config.component.common.network.retry.a {
        b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* compiled from: RequestRetry.java */
    /* renamed from: com.mbridge.msdk.config.component.common.network.retry.c$c, reason: collision with other inner class name */
    class C1394c implements com.mbridge.msdk.config.component.common.network.retry.b {
        C1394c() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    /* compiled from: RequestRetry.java */
    class d implements com.mbridge.msdk.config.component.common.network.retry.a {
        d() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* compiled from: RequestRetry.java */
    class e implements com.mbridge.msdk.config.component.common.network.retry.b {
        e() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    /* compiled from: RequestRetry.java */
    private static class f {
        private static final f b = new f();
        private final ThreadPoolExecutor a = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new a(), new ThreadPoolExecutor.DiscardOldestPolicy());

        /* compiled from: RequestRetry.java */
        class a implements ThreadFactory {
            private final AtomicInteger a = new AtomicInteger(1);

            a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Retry-NetworkThread-" + this.a.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            }
        }

        private f() {
        }

        public static f a() {
            return b;
        }

        public ThreadPoolExecutor b() {
            return this.a;
        }
    }

    public c(String str, com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.a aVar2, com.mbridge.msdk.config.component.common.network.result.a aVar3) {
        this.f = str;
        this.g = aVar;
        this.h = aVar2;
        this.i = aVar3;
        this.j = aVar3.a();
        b();
    }

    private void d() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar;
        try {
            try {
                this.b = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.g, this.i, this.h);
                h();
                this.b.a(this.f);
                aVar = this.b;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e2) {
                this.i.c(0);
                this.i.b(0);
                this.i.a(e2.getMessage());
                g();
                aVar = this.b;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th) {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.c) {
            q0.c("RequestRetry", "重试任务已被取消，停止执行");
        } else if (this.g.i().equals(com.mbridge.msdk.config.component.common.util.c.c("340"))) {
            f();
        } else if (this.g.i().equals(com.mbridge.msdk.config.component.common.util.c.c("341"))) {
            d();
        }
    }

    private void f() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar;
        try {
            try {
                this.a = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.g, this.i, this.h);
                i();
                this.a.a(this.f);
                aVar = this.a;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e2) {
                this.i.c(0);
                this.i.b(0);
                this.i.a(e2.getMessage());
                g();
                aVar = this.a;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th) {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar2 = this.a;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.c) {
            q0.c("RequestRetry", "重试任务已被取消，停止调度重试");
            return;
        }
        this.k.incrementAndGet();
        if (this.k.get() >= this.g.g()) {
            q0.c("RequestRetry", "重试次数已达上限: " + this.k.get());
            com.mbridge.msdk.config.component.common.network.a aVar = this.h;
            if (aVar != null) {
                aVar.d(this.i);
            }
            a();
            return;
        }
        q0.b("RequestRetry", "重试 次数 " + this.k.get());
        try {
            ScheduledExecutorService scheduledExecutorService = this.e;
            if (scheduledExecutorService != null) {
                this.d = scheduledExecutorService.schedule(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.c$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.c();
                    }
                }, this.g.h(), TimeUnit.SECONDS);
                q0.c("RequestRetry", "已调度第 " + this.k.get() + " 次重试");
            }
        } catch (Exception e2) {
            q0.b("RequestRetry", "调度重试任务失败: " + e2.getMessage());
            com.mbridge.msdk.config.component.common.network.a aVar2 = this.h;
            if (aVar2 != null) {
                aVar2.d(this.i);
            }
            a();
        }
    }

    private void h() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = this.b;
        if (aVar != null) {
            aVar.a(new d());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.j;
        if (bVar != null) {
            bVar.a(new e());
        }
    }

    private void i() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.a;
        if (aVar != null) {
            aVar.a(new b());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.j;
        if (bVar != null) {
            bVar.a(new C1394c());
        }
    }

    private void j() {
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        try {
            q0.c("RequestRetry", "正在关闭独立调度器");
            this.e.shutdown();
            if (this.e.awaitTermination(5L, TimeUnit.SECONDS)) {
                q0.c("RequestRetry", "独立调度器已成功关闭");
            } else {
                q0.d("RequestRetry", "独立调度器未能在5秒内关闭，强制关闭");
                this.e.shutdownNow();
            }
        } catch (InterruptedException e2) {
            q0.b("RequestRetry", "关闭独立调度器时被中断: " + e2.getMessage());
            this.e.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public void c() {
        if (this.c) {
            q0.c("RequestRetry", "重试任务已被取消，跳过执行");
        } else {
            f.a().b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.c) {
            return;
        }
        q0.c("RequestRetry", "取消所有重试任务");
        this.c = true;
        ScheduledFuture<?> scheduledFuture = this.d;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.d.cancel(true);
            q0.c("RequestRetry", "已取消当前重试调度任务");
        }
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.a;
        if (aVar != null) {
            aVar.a();
            q0.c("RequestRetry", "已取消TCP连接");
        }
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.b;
        if (aVar2 != null) {
            aVar2.a();
            q0.c("RequestRetry", "已取消HTTP连接");
        }
        j();
    }

    private void b() {
        try {
            this.e = Executors.newSingleThreadScheduledExecutor(new a());
            q0.c("RequestRetry", "创建独立调度器成功");
        } catch (Exception e2) {
            q0.b("RequestRetry", "创建独立调度器失败: " + e2.getMessage());
        }
    }
}
