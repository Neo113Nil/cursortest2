package io.intercom.android.nexus;

/* loaded from: classes8.dex */
public interface NexusListener {
    void notifyEvent(NexusEvent nexusEvent);

    void onConnect();

    void onConnectFailed();

    void onShutdown();
}
