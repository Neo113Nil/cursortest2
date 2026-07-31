package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: MonitorNetworkRequestTimeout.java */
/* loaded from: classes3.dex */
public class b {
    private long a;
    private boolean b = false;
    private Handler c;
    private HandlerThread d;
    private Runnable e;
    private com.mbridge.msdk.config.component.common.network.a f;
    private com.mbridge.msdk.config.component.common.network.result.a g;
    private com.mbridge.msdk.config.component.common.network.b h;
    private com.mbridge.msdk.config.component.common.network.retry.b i;

    /* compiled from: MonitorNetworkRequestTimeout.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("MonitorNetworkTimeout", "超时结束触发");
            if (b.this.f != null && !b.this.g.h()) {
                b.this.a();
                b.this.f.d(b.this.g);
            }
            b.this.e();
        }
    }

    public b(long j) {
        if (this.a < 0) {
            this.a = 30L;
        } else {
            this.a = j;
        }
    }

    public void d() {
        Runnable runnable;
        if (this.b) {
            q0.d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.d = handlerThread;
            handlerThread.start();
            this.c = new Handler(this.d.getLooper());
            c();
        } catch (Exception e) {
            q0.b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e.getMessage());
            this.c = new Handler(Looper.getMainLooper());
            c();
        }
        if (this.c == null) {
            e();
            com.mbridge.msdk.config.component.common.network.a aVar = this.f;
            if (aVar != null) {
                aVar.d(this.g);
            }
        }
        q0.c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.a + "ms");
        Handler handler = this.c;
        if (handler == null || (runnable = this.e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.a * 1000);
    }

    public void e() {
        Runnable runnable;
        if (this.b) {
            this.b = false;
            Handler handler = this.c;
            if (handler != null && (runnable = this.e) != null) {
                handler.removeCallbacks(runnable);
            }
            q0.c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }

    private void c() {
        this.e = new a();
    }

    public void a(com.mbridge.msdk.config.component.common.network.b bVar) {
        this.h = bVar;
    }

    public void b() {
        try {
            e();
            Handler handler = this.c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.c = null;
            }
            HandlerThread handlerThread = this.d;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.d.join(1000L);
                    } catch (InterruptedException e) {
                        q0.d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e2) {
                        q0.b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e2.getMessage());
                    }
                    this.d = null;
                }
                this.e = null;
                this.b = false;
                q0.c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th) {
                this.d = null;
                throw th;
            }
        } catch (Exception e3) {
            q0.b("MonitorNetworkTimeout", "销毁MonitorNetworkTimeout时发生异常：" + e3.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.b bVar) {
        this.i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.h != null) {
                q0.c("MonitorNetworkTimeout", "取消网络请求");
                this.h.a();
            }
            if (this.i != null) {
                q0.c("MonitorNetworkTimeout", "取消重试任务");
                this.i.a();
            }
        } catch (Exception e) {
            q0.b("MonitorNetworkTimeout", "取消任务时发生异常：" + e.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        this.g = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f = aVar;
    }
}
