package com.pubmatic.sdk.webrendering.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class POBAudioVolumeObserver {
    private static volatile POBAudioVolumeObserver c;
    private final Set a = new HashSet();
    private b b;

    interface a {
        void a(Double d);
    }

    class b extends ContentObserver {
        private final AudioManager a;
        private int b;

        b(Handler handler, AudioManager audioManager) {
            super(handler);
            this.a = audioManager;
            this.b = audioManager.getStreamVolume(3);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            AudioManager audioManager = this.a;
            if (audioManager != null) {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = this.a.getStreamVolume(3);
                if (streamVolume != this.b) {
                    this.b = streamVolume;
                    POBAudioVolumeObserver.this.a(streamVolume, streamMaxVolume);
                }
            }
        }
    }

    private POBAudioVolumeObserver() {
    }

    private void b(Context context) {
        if (this.b != null) {
            context.getContentResolver().unregisterContentObserver(this.b);
            this.b = null;
        }
    }

    private void c(Context context) {
        b(context);
        c = null;
    }

    @Nullable
    protected static Double getAudioVolumePercentage(@NonNull Context context) {
        try {
            if (((AudioManager) context.getSystemService("audio")) == null) {
                return null;
            }
            return Double.valueOf((r5.getStreamVolume(3) * 100.0d) / r5.getStreamMaxVolume(3));
        } catch (Exception e) {
            POBLog.error("POBAudioVolumeObserver", "Error in getting audio manager. Error: %s", e.getMessage());
            return null;
        }
    }

    protected void registerListener(@NonNull Context context, @NonNull a aVar) {
        if (this.a.contains(aVar)) {
            return;
        }
        if (this.b == null) {
            a(context);
        }
        this.a.add(aVar);
    }

    protected void unregisterListener(@NonNull Context context, a aVar) {
        this.a.remove(aVar);
        if (this.a.isEmpty()) {
            c(context);
        }
    }

    static POBAudioVolumeObserver a() {
        if (c == null) {
            synchronized (POBAudioVolumeObserver.class) {
                try {
                    if (c == null) {
                        c = new POBAudioVolumeObserver();
                    }
                } finally {
                }
            }
        }
        return c;
    }

    private void a(Context context) {
        if (this.b == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            try {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    this.b = new b(handler, audioManager);
                    context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.b);
                }
            } catch (Exception e) {
                POBLog.warn("POBAudioVolumeObserver", "Error in getting audio manager. Error: %s", e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        Double valueOf = Double.valueOf((i * 100.0d) / i2);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(valueOf);
        }
    }
}
