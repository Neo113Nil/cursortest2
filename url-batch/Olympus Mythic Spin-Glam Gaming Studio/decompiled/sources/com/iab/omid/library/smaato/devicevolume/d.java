package com.iab.omid.library.smaato.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class d extends ContentObserver {
    private final Context a;
    private final AudioManager b;
    private final com.iab.omid.library.smaato.devicevolume.a c;
    private final c d;
    private final AtomicReference<Float> e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float a = d.this.a();
            if (((Float) d.this.e.getAndSet(Float.valueOf(a))).floatValue() != a) {
                d.this.d.a(a);
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.smaato.devicevolume.a aVar, c cVar) {
        super(handler);
        this.e = new AtomicReference<>(Float.valueOf(-1.0f));
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = aVar;
        this.d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
    }

    private void d() {
        new Thread(new a()).start();
    }

    public void b() {
        d();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        d();
    }
}
