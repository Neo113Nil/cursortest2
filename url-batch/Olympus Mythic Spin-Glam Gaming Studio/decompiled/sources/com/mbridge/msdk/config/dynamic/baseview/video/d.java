package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.io.File;

/* compiled from: LocalVideoFileMonitor.java */
/* loaded from: classes14.dex */
public class d {
    private Context b;
    private SimpleExoPlayer c;
    private String d;
    private com.mbridge.msdk.config.dynamic.baseview.video.a e;
    private int a = 5000;
    private long f = 0;
    private long g = 0;
    private long h = 0;
    private long i = 0;
    private final Handler j = new Handler(Looper.getMainLooper());
    private final Runnable k = new a();

    /* compiled from: LocalVideoFileMonitor.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.b();
        }
    }

    public d(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.b = context;
        this.c = simpleExoPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        q0.b("LocalVideoFileMonitor", " 触发 一次检查");
        try {
            File file = new File(this.d);
            if (file.exists()) {
                a(file);
            } else {
                q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件不存在");
                if (System.currentTimeMillis() - this.f < this.a) {
                    this.j.postDelayed(this.k, 1000L);
                } else {
                    a("resource buffer exception file is not found");
                }
            }
        } catch (Exception e) {
            a("resource buffer exception" + e.getMessage());
        }
    }

    private void d() {
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
    }

    private void e() {
        if (this.c != null) {
            com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.e;
            if (aVar != null) {
                aVar.onBufferingEnd();
            }
            ExtractorMediaSource createMediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.b, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(this.d));
            this.c.setRepeatMode(0);
            this.c.prepare(createMediaSource);
            this.c.seekTo(this.g);
            this.c.setPlayWhenReady(true);
        }
        a();
    }

    public void c() {
        a();
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.b = null;
        this.c = null;
        this.e = null;
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.baseview.video.a aVar, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e = aVar;
        if (i > 0) {
            this.a = i * 1000;
        }
        this.d = str;
    }

    public boolean a(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException == null || exoPlaybackException.type != 0) {
            return false;
        }
        q0.b("LocalVideoFileMonitor", " 触发 资源异常 监控");
        d();
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.e;
        if (aVar != null) {
            aVar.onBufferingStart();
        }
        this.f = System.currentTimeMillis();
        SimpleExoPlayer simpleExoPlayer = this.c;
        if (simpleExoPlayer != null) {
            this.g = simpleExoPlayer.getCurrentPosition();
        }
        this.j.post(this.k);
        return true;
    }

    private void a(File file) {
        q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件存在 但是不完整");
        long length = file.length();
        long lastModified = file.lastModified();
        long j = this.h;
        boolean z = false;
        boolean z2 = (j == 0 || length == j) ? false : true;
        long j2 = this.i;
        if (j2 != 0 && lastModified != j2) {
            z = true;
        }
        this.h = length;
        this.i = lastModified;
        if (z2 || z) {
            q0.b("LocalVideoFileMonitor", " 资源状态发生过变化 触发播放");
            e();
        } else if (System.currentTimeMillis() - this.f < this.a) {
            this.j.postDelayed(this.k, 1000L);
        } else {
            a("resource buffer time out");
        }
    }

    private void a() {
        this.j.removeCallbacks(this.k);
    }

    private void a(String str) {
        q0.b("LocalVideoFileMonitor", "通知外部 规定时间内 缓冲未成功");
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.e;
        if (aVar != null) {
            aVar.onBufferingTimeOut(str);
            this.e.onPlayError(str);
        }
    }
}
