package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;

/* compiled from: MonitorPlayerTimeout.java */
/* loaded from: classes3.dex */
public class c {
    private int a;
    private long b;
    private long c;
    private Handler g;
    private HandlerThread h;
    private Runnable i;
    private Runnable j;
    private com.mbridge.msdk.config.component.midi.monitor.a k;
    private String m;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private int l = 0;

    /* compiled from: MonitorPlayerTimeout.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    /* compiled from: MonitorPlayerTimeout.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.k != null) {
                c.this.k.a("Video first frame render timeout : " + c.this.b + "ms");
            }
            c.this.h();
        }
    }

    public c(int i, String str) {
        this.a = 3;
        this.m = str;
        this.b = i > 0 ? i : 3000L;
        this.a = i / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.h = handlerThread;
            handlerThread.start();
            this.g = new Handler(this.h.getLooper());
            d();
        } catch (Exception e) {
            q0.b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e.getMessage());
            this.g = new Handler(Looper.getMainLooper());
            d();
        }
    }

    private void d() {
        this.i = new a();
        this.j = new b();
    }

    public boolean e() {
        return this.d;
    }

    public void f() {
        Runnable runnable;
        if (!this.d || this.f) {
            return;
        }
        this.f = true;
        long currentTimeMillis = System.currentTimeMillis() - this.c;
        q0.c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + currentTimeMillis + "ms");
        Handler handler = this.g;
        if (handler != null && (runnable = this.j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (currentTimeMillis > this.b) {
            q0.d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + currentTimeMillis + "ms");
        }
        h();
    }

    public void g() {
        Runnable runnable;
        if (this.g == null) {
            h();
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.k;
            if (aVar != null) {
                aVar.a("playerHandler is null");
            }
        }
        if (this.d) {
            q0.d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.d = true;
        this.e = false;
        this.f = false;
        this.l = 0;
        this.c = System.currentTimeMillis();
        q0.c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.b + "ms");
        Handler handler = this.g;
        if (handler != null && (runnable = this.j) != null) {
            handler.postDelayed(runnable, this.b);
        }
        a();
    }

    public void h() {
        if (this.d) {
            this.d = false;
            Handler handler = this.g;
            if (handler != null) {
                Runnable runnable = this.i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.j;
                if (runnable2 != null) {
                    this.g.removeCallbacks(runnable2);
                }
            }
            q0.c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.d || this.e || TextUtils.isEmpty(this.m)) {
            q0.b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String c = c();
            if (TextUtils.isEmpty(c)) {
                this.l++;
                q0.d("MonitorPlayerTimeout", "检查本地地址次数 " + this.l);
                if (this.l >= this.a) {
                    q0.d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.g;
                if (handler == null || (runnable2 = this.i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.e = true;
            q0.c("MonitorPlayerTimeout", "本地视频地址准备完成：" + c);
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.k;
            if (aVar != null) {
                aVar.b(c);
            }
            Handler handler2 = this.g;
            if (handler2 == null || (runnable3 = this.i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e) {
            q0.b("MonitorPlayerTimeout", "检查本地地址异常：" + e.getMessage());
            Handler handler3 = this.g;
            if (handler3 == null || (runnable = this.i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:3:0x0003, B:6:0x000d, B:9:0x0034, B:11:0x003e, B:13:0x0047, B:14:0x004d, B:16:0x005c, B:22:0x001a, B:24:0x002b, B:26:0x0031), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String c() {
        try {
            if (!this.m.startsWith("file://")) {
                if (this.m.startsWith("/")) {
                }
                if (this.m.startsWith("http")) {
                    com.mbridge.msdk.config.component.common.file.b a2 = com.mbridge.msdk.config.component.common.file.a.a(this.m, -1, null);
                    String a3 = a2 != null ? a2.a() : "";
                    File file = new File(a3.replace("file://", ""));
                    if (file.exists() && file.isFile()) {
                        return a3;
                    }
                }
                return null;
            }
            File file2 = new File(this.m.replace("file://", ""));
            if (file2.exists() && file2.isFile()) {
                return this.m;
            }
            if (this.m.startsWith("http")) {
            }
            return null;
        } catch (Exception e) {
            q0.b("MonitorPlayerTimeout", "获取本地视频地址异常：" + e.getMessage());
            return null;
        }
    }

    public void b() {
        try {
            h();
            Handler handler = this.g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.g = null;
            }
            HandlerThread handlerThread = this.h;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.h.join(1000L);
                    } catch (InterruptedException e) {
                        q0.d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e2) {
                        q0.b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e2.getMessage());
                    }
                    this.h = null;
                }
                this.i = null;
                this.j = null;
                this.k = null;
                this.d = false;
                this.e = false;
                this.f = false;
                this.l = 0;
                q0.c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th) {
                this.h = null;
                throw th;
            }
        } catch (Exception e3) {
            q0.b("MonitorPlayerTimeout", "销毁MonitorPlayerTimeout时发生异常：" + e3.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.midi.monitor.a aVar) {
        this.k = aVar;
    }
}
