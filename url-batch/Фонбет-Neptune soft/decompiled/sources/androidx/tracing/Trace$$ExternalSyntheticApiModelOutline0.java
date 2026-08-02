package androidx.tracing;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.WebSourceParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.net.Uri;
import android.webkit.TracingConfig;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Trace$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ DeletionRequest.Builder m() {
        return new DeletionRequest.Builder();
    }

    public static /* synthetic */ WebSourceParams.Builder m(Uri uri) {
        return new WebSourceParams.Builder(uri);
    }

    public static /* synthetic */ WebTriggerRegistrationRequest.Builder m(List list, Uri uri) {
        return new WebTriggerRegistrationRequest.Builder(list, uri);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ GetTopicsRequest.Builder m222m() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse m(Object obj) {
        return (GetTopicsResponse) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Topic m223m(Object obj) {
        return (Topic) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ TopicsManager m224m(Object obj) {
        return (TopicsManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ TracingConfig.Builder m228m() {
        return new TracingConfig.Builder();
    }

    public static /* synthetic */ WebMessage m(String str, WebMessagePort[] webMessagePortArr) {
        return new WebMessage(str, webMessagePortArr);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m234m() {
        return TopicsManager.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m236m() {
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* synthetic */ void m$3() {
    }
}
