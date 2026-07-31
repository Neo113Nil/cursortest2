package net.pubnative.lite.sdk.provider;

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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.pubnative.lite.sdk.provider.TopicProvider;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes11.dex */
public class TopicsApiImpl implements TopicProvider {
    private final String TAG = TopicsApiImpl.class.getSimpleName();

    @Override // net.pubnative.lite.sdk.provider.TopicProvider
    public void getTopics(Context context, final TopicProvider.Callback callback) {
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
                    m.getTopics(build, newCachedThreadPool, new OutcomeReceiver() { // from class: net.pubnative.lite.sdk.provider.TopicsApiImpl.1
                        public /* bridge */ /* synthetic */ void onResult(Object obj) {
                            onResult(TopicsManagerImplCommon$$ExternalSyntheticApiModelOutline0.m(obj));
                        }

                        public void onError(Exception exc) {
                            Logger.e(TopicsApiImpl.this.TAG, exc.getMessage());
                            callback.onResult(null);
                            super.onError((Throwable) exc);
                        }

                        /* JADX WARN: Incorrect condition in loop: B:3:0x000e */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public void onResult(GetTopicsResponse getTopicsResponse) {
                            List topics;
                            List topics2;
                            int topicId;
                            long taxonomyVersion;
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < topics.size(); i++) {
                                topics2 = getTopicsResponse.getTopics();
                                Topic m3 = GetTopicsResponseHelper$$ExternalSyntheticApiModelOutline1.m(topics2.get(i));
                                topicId = m3.getTopicId();
                                taxonomyVersion = m3.getTaxonomyVersion();
                                net.pubnative.lite.sdk.models.Topic topic = new net.pubnative.lite.sdk.models.Topic(topicId, taxonomyVersion, "Chromium Topics API taxonomy");
                                if (!arrayList.contains(topic)) {
                                    arrayList.add(topic);
                                }
                            }
                            callback.onResult(arrayList);
                        }
                    });
                    return;
                } catch (Exception e) {
                    Logger.e(this.TAG, e.getMessage());
                    callback.onResult(null);
                    return;
                }
            }
        }
        callback.onResult(null);
    }
}
