package androidx.work;

import android.app.ApplicationExitInfo;
import android.app.job.JobInfo;
import android.content.pm.ApkChecksum;
import android.media.MediaCodec;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebViewRenderProcess;
import dalvik.system.DelegateLastClassLoader;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Constraints$Builder$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo m(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ JobInfo.TriggerContentUri m(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ApkChecksum m245m(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern m(int i, int i2) {
        return new MediaCodec.CryptoInfo.Pattern(i, i2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SafeBrowsingResponse m248m(Object obj) {
        return (SafeBrowsingResponse) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ServiceWorkerWebSettings m249m(Object obj) {
        return (ServiceWorkerWebSettings) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WebMessagePort m250m(Object obj) {
        return (WebMessagePort) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WebResourceError m251m(Object obj) {
        return (WebResourceError) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WebViewRenderProcess m252m(Object obj) {
        return (WebViewRenderProcess) obj;
    }

    public static /* synthetic */ DelegateLastClassLoader m(String str, ClassLoader classLoader) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static /* synthetic */ InMemoryDexClassLoader m(ByteBuffer byteBuffer, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBuffer, classLoader);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m255m() {
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* synthetic */ void m$2() {
    }

    public static /* synthetic */ void m$3() {
    }
}
