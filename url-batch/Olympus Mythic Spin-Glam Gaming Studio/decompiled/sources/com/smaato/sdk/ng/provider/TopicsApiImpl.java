package com.smaato.sdk.ng.provider;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.os.Build;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequestHelper$$ExternalSyntheticApiModelOutline0;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper$$ExternalSyntheticApiModelOutline1;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext11Impl$$ExternalSyntheticApiModelOutline0;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext11Impl$$ExternalSyntheticApiModelOutline1;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$$ExternalSyntheticApiModelOutline0;
import com.smaato.sdk.ng.provider.TopicProvider;
import com.smaato.sdk.ng.utils.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes15.dex */
public class TopicsApiImpl implements TopicProvider {
    private final String a = TopicsApiImpl.class.getSimpleName();

    @Override // com.smaato.sdk.ng.provider.TopicProvider
    public void getTopics(Context context, TopicProvider.Callback callback) {
        int extensionVersion;
        int extensionVersion2;
        GetTopicsRequest build;
        if (context == null || callback == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            if (extensionVersion >= 4) {
                TopicsManager m = TopicsManagerApi33Ext11Impl$$ExternalSyntheticApiModelOutline1.m(context.getSystemService(TopicsManagerApi33Ext11Impl$$ExternalSyntheticApiModelOutline0.m()));
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                GetTopicsRequest.Builder m2 = GetTopicsRequestHelper$$ExternalSyntheticApiModelOutline0.m();
                m2.setAdsSdkName(context.getPackageName());
                extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
                if (extensionVersion2 >= 5) {
                    m2.setShouldRecordObservation(true);
                }
                if (m == null) {
                    callback.onResult(null);
                    return;
                }
                try {
                    build = m2.build();
                    m.getTopics(build, newCachedThreadPool, new a(callback));
                    return;
                } catch (Exception e) {
                    Logger.e(this.a, e.getMessage());
                    callback.onResult(null);
                    return;
                }
            }
        }
        callback.onResult(null);
    }

    class a implements OutcomeReceiver {
        final /* synthetic */ TopicProvider.Callback a;

        a(TopicProvider.Callback callback) {
            this.a = callback;
        }

        /* JADX WARN: Incorrect condition in loop: B:3:0x000e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(GetTopicsResponse getTopicsResponse) {
            List topics;
            List topics2;
            int topicId;
            long taxonomyVersion;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < topics.size(); i++) {
                topics2 = getTopicsResponse.getTopics();
                Topic m = GetTopicsResponseHelper$$ExternalSyntheticApiModelOutline1.m(topics2.get(i));
                topicId = m.getTopicId();
                taxonomyVersion = m.getTaxonomyVersion();
                com.smaato.sdk.ng.models.Topic topic = new com.smaato.sdk.ng.models.Topic(topicId, taxonomyVersion, "Chromium Topics API taxonomy");
                if (!arrayList.contains(topic)) {
                    arrayList.add(topic);
                }
            }
            this.a.onResult(arrayList);
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            a(TopicsManagerImplCommon$$ExternalSyntheticApiModelOutline0.m(obj));
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            Logger.e(TopicsApiImpl.this.a, exc.getMessage());
            this.a.onResult(null);
            super.onError(exc);
        }
    }
}
