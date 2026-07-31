package net.pubnative.lite.sdk.provider;

import android.content.Context;
import java.util.List;
import net.pubnative.lite.sdk.models.Topic;

/* loaded from: classes15.dex */
public interface TopicProvider {

    public interface Callback {
        void onResult(List<Topic> list);
    }

    void getTopics(Context context, Callback callback);
}
