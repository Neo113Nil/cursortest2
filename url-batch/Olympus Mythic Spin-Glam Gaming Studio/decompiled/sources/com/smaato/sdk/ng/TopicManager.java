package com.smaato.sdk.ng;

import android.content.Context;
import com.smaato.sdk.ng.models.Topic;
import com.smaato.sdk.ng.provider.TopicProvider;
import com.smaato.sdk.ng.provider.TopicsApiImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class TopicManager {
    private final String a = TopicManager.class.getSimpleName();
    private final List<TopicProvider> b = new ArrayList();
    private List<Topic> c = null;

    public TopicManager(Context context) {
        a();
        a(context);
    }

    private void a() {
        this.b.add(new TopicsApiImpl());
    }

    public List<Topic> getTopics() {
        return this.c;
    }

    private void a(Context context) {
        if (this.b.isEmpty()) {
            return;
        }
        this.c = new ArrayList();
        TopicProvider.Callback callback = new TopicProvider.Callback() { // from class: com.smaato.sdk.ng.TopicManager$$ExternalSyntheticLambda0
            @Override // com.smaato.sdk.ng.provider.TopicProvider.Callback
            public final void onResult(List list) {
                TopicManager.this.a((List<Topic>) list);
            }
        };
        Iterator<TopicProvider> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().getTopics(context, callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<Topic> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    if (this.c == null) {
                        this.c = new ArrayList();
                    }
                    for (Topic topic : list) {
                        if (topic != null && !this.c.contains(topic)) {
                            this.c.add(topic);
                        }
                    }
                }
            } finally {
            }
        }
    }
}
