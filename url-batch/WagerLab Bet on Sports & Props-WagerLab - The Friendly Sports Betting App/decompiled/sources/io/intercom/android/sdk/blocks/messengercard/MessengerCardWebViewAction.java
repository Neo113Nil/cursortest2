package io.intercom.android.sdk.blocks.messengercard;

import java.util.Map;

/* loaded from: classes8.dex */
public class MessengerCardWebViewAction {
    private final Map<String, Object> payload;
    private final String type;

    public MessengerCardWebViewAction(String str, Map<String, Object> map) {
        this.type = str;
        this.payload = map;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getPayload() {
        return this.payload;
    }
}
