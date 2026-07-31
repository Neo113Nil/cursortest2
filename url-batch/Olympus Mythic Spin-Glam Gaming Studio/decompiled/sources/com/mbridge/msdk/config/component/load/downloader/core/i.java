package com.mbridge.msdk.config.component.load.downloader.core;

/* compiled from: ExecutorManager.java */
/* loaded from: classes8.dex */
public class i {
    private j a;

    /* compiled from: ExecutorManager.java */
    private static final class b {
        private static final i a = new i();
    }

    public static i b() {
        return b.a;
    }

    public void a(int i) {
        this.a = new com.mbridge.msdk.config.component.load.downloader.core.a(i);
    }

    private i() {
    }

    public j a() {
        if (this.a == null) {
            this.a = new com.mbridge.msdk.config.component.load.downloader.core.a(10);
        }
        return this.a;
    }
}
