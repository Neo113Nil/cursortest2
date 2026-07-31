package com.smaato.sdk.ng.vpaid.volume;

/* loaded from: classes10.dex */
public class VolumeObserver {
    private static VolumeObserver b;
    private VolumeChangeListener a;

    public interface VolumeChangeListener {
        void onVolumeChanged();
    }

    private VolumeObserver() {
    }

    public static synchronized VolumeObserver getInstance() {
        VolumeObserver volumeObserver;
        synchronized (VolumeObserver.class) {
            try {
                if (b == null) {
                    b = new VolumeObserver();
                }
                volumeObserver = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return volumeObserver;
    }

    public synchronized void notifyObservers() {
        VolumeChangeListener volumeChangeListener = this.a;
        if (volumeChangeListener != null) {
            volumeChangeListener.onVolumeChanged();
        }
    }

    public synchronized void reset() {
        this.a = null;
    }

    public synchronized void setListener(VolumeChangeListener volumeChangeListener) {
        this.a = volumeChangeListener;
    }
}
