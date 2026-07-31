package net.pubnative.lite.sdk.vpaid.volume;

/* loaded from: classes11.dex */
public class VolumeObserver {
    private static VolumeObserver instance;
    private VolumeChangeListener listener;

    public interface VolumeChangeListener {
        void onVolumeChanged();
    }

    private VolumeObserver() {
    }

    public static synchronized VolumeObserver getInstance() {
        VolumeObserver volumeObserver;
        synchronized (VolumeObserver.class) {
            try {
                if (instance == null) {
                    instance = new VolumeObserver();
                }
                volumeObserver = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return volumeObserver;
    }

    public synchronized void notifyObservers() {
        VolumeChangeListener volumeChangeListener = this.listener;
        if (volumeChangeListener != null) {
            volumeChangeListener.onVolumeChanged();
        }
    }

    public synchronized void reset() {
        this.listener = null;
    }

    public synchronized void setListener(VolumeChangeListener volumeChangeListener) {
        this.listener = volumeChangeListener;
    }
}
