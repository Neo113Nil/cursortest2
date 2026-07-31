package com.inmobi.media;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import java.util.Objects;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.uj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4398uj implements AppLovinCommunicatorSubscriber {
    public final /* synthetic */ Function2 a;

    public C4398uj(Function2 function2) {
        this.a = function2;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Uri data = message.getData();
        message.getTopic();
        Objects.toString(data);
        Function2 function2 = this.a;
        Bundle messageData = message.getMessageData();
        String topic = message.getTopic();
        Intrinsics.checkNotNullExpressionValue(topic, "getTopic(...)");
        function2.invoke(messageData, topic);
    }
}
