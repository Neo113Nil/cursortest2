package com.iab.omid.library.vungle.messagelistener;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public interface b {
    String getListenerName();

    void onMessageReceived(String str, JSONObject jSONObject);

    void onWebMessageListenerUnsupported();
}
