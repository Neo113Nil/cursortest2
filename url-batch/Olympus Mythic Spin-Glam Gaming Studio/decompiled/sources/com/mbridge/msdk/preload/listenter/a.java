package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* compiled from: PreloadListenerEx.java */
/* loaded from: classes4.dex */
public class a implements PreloadListener {
    WeakReference<PreloadListener> a;
    private int b = 0;
    private boolean c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a.get().onPreloadSucceed();
    }

    public void a(boolean z) {
        this.c = z;
    }
}
