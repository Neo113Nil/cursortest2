package com.smaato.sdk.ng.provider;

import android.content.Context;
import com.smaato.sdk.ng.models.Topic;
import java.util.List;

/* loaded from: classes3.dex */
public interface TopicProvider {

    public interface Callback {
        void onResult(List<Topic> list);
    }

    void getTopics(Context context, Callback callback);
}
