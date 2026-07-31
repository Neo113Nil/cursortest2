package com.pubmatic.sdk.common.utility;

import android.app.Application;
import android.content.Context;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.browser.POBInternalBrowserActivity;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBDeepLinkURLModel;
import com.pubmatic.sdk.common.session.POBAppStateMonitor;
import com.pubmatic.sdk.video.POBVideoLogConstants;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public class POBUrlHandler {
    private final UrlHandlerListener a;
    private final Context b;
    private boolean c = false;
    private boolean d = false;
    private POBAppStateMonitor.POBAppLifecycleListener e;

    public interface UrlHandlerListener {
        void onErrorOpenUrl(@NonNull String str);

        default void onExternalBrowserClose() {
        }

        void onHandleTrackers(@NonNull String str, @NonNull List<String> list);

        void onInternalBrowserClose(@NonNull String str);

        void onInternalBrowserOpen(@NonNull String str);

        void onLeaveApp(@NonNull String str);
    }

    class a implements POBAppStateMonitor.POBAppLifecycleListener {
        a() {
        }

        @Override // com.pubmatic.sdk.common.session.POBAppStateMonitor.POBAppLifecycleListener
        public void onAppMovedToBackground() {
        }

        @Override // com.pubmatic.sdk.common.session.POBAppStateMonitor.POBAppLifecycleListener
        public void onAppMovedToForeground() {
            if (POBUrlHandler.this.d) {
                POBUrlHandler.this.d = false;
                POBLog.debug("POBUrlHandler", POBLogConstants.MSG_RETURNED_FROM_EXTERNAL_BROWSER, new Object[0]);
                POBUrlHandler.this.a.onExternalBrowserClose();
            }
        }
    }

    class b implements POBInternalBrowserActivity.InternalBrowserListener {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // com.pubmatic.sdk.common.browser.POBInternalBrowserActivity.InternalBrowserListener
        public void onBrowserDismiss() {
            POBLog.debug("POBUrlHandler", "Dismissed device default browser. url :%s", this.a);
            POBUrlHandler.this.a.onInternalBrowserClose(this.a);
            POBUrlHandler.this.c = false;
        }

        @Override // com.pubmatic.sdk.common.browser.POBInternalBrowserActivity.InternalBrowserListener
        public void onBrowserStart() {
            POBUrlHandler.this.a.onInternalBrowserOpen(this.a);
        }

        @Override // com.pubmatic.sdk.common.browser.POBInternalBrowserActivity.InternalBrowserListener
        public void onExternalBrowserClick(String str) {
            POBLog.debug("POBUrlHandler", "Opening current page in device's default browser. url :%s", str);
            if (POBUtils.openExternalBrowser(POBUrlHandler.this.b, str)) {
                POBUrlHandler.this.a.onLeaveApp(str);
            } else {
                POBUrlHandler.this.a.onErrorOpenUrl(str);
                POBLog.warn("POBUrlHandler", "Unable to open url in external browser from internal browser %s", str);
            }
        }
    }

    public POBUrlHandler(@NonNull Context context, @NonNull UrlHandlerListener urlHandlerListener) {
        this.b = context;
        this.a = urlHandlerListener;
        a();
    }

    private void d(String str, String str2) {
        if (this.c) {
            POBLog.warn("POBUrlHandler", "Internal browser already displayed", new Object[0]);
            return;
        }
        this.c = true;
        POBInternalBrowserActivity.startNewActivity(this.b, str, new b(str));
        b(str, str2);
    }

    public void destroy() {
        if (this.e != null) {
            POBAppStateMonitor.getInstance((Application) this.b.getApplicationContext()).removeAppLifecycleListener(this.e);
            this.e = null;
        }
    }

    public void open(@Nullable String str, @Nullable String str2) {
        if (!POBUtils.isStringValueNullOrEmpty(str)) {
            POBLog.debug("POBUrlHandler", POBVideoLogConstants.MSG_VAST_LEARN_MORE_CLICKED, str);
            open(str);
            return;
        }
        if (!POBUtils.isStringValueNullOrEmpty(str2)) {
            POBLog.debug("POBUrlHandler", POBVideoLogConstants.MSG_VAST_LEARN_MORE_CLICKED, str);
            open(str2);
            return;
        }
        POBLog.debug("POBUrlHandler", "Failed to open url: " + str, new Object[0]);
        UrlHandlerListener urlHandlerListener = this.a;
        if (str == null) {
            str = "";
        }
        urlHandlerListener.onErrorOpenUrl(str);
    }

    private void c(String str) {
        POBLog.warn("POBUrlHandler", "Unable to handle URL: %s", str);
        this.a.onErrorOpenUrl(str);
    }

    private void a() {
        POBAppStateMonitor pOBAppStateMonitor = POBAppStateMonitor.getInstance((Application) this.b.getApplicationContext());
        a aVar = new a();
        this.e = aVar;
        pOBAppStateMonitor.addAppLifecycleListener(aVar);
    }

    private void b(String str, String str2) {
        if (POBUtils.isNullOrEmpty(str2)) {
            return;
        }
        this.a.onHandleTrackers(str, Collections.singletonList(str2));
    }

    private void c(String str, String str2) {
        if (POBUtils.openExternalBrowser(this.b, str)) {
            POBLog.debug("POBUrlHandler", "Opened URL in external browser %s", str);
            this.d = true;
            b(str, str2);
            this.a.onLeaveApp(str);
            return;
        }
        c(str);
    }

    private void b(String str) {
        if (POBDeepLinkUtil.a(this.b, str)) {
            POBLog.debug("POBUrlHandler", "Deep link success", new Object[0]);
            this.d = true;
            this.a.onLeaveApp(str);
            return;
        }
        c(str);
    }

    public void open(@NonNull String str) {
        if (POBDeepLinkURLModel.isPubMaticDeepLink(str)) {
            if (a(POBDeepLinkURLModel.parseFromUrl(str))) {
                return;
            }
            c(str);
        } else {
            if (POBDeepLinkUtil.b(str)) {
                b(str);
                return;
            }
            if (POBDeepLinkUtil.a(str)) {
                a(str);
            } else if (URLUtil.isValidUrl(str)) {
                a(str, (String) null);
            } else {
                c(str);
            }
        }
    }

    private boolean a(POBDeepLinkURLModel pOBDeepLinkURLModel) {
        boolean triggerDeepLink;
        if (!POBUtils.isNullOrEmpty(pOBDeepLinkURLModel.getPrimaryUrl())) {
            if (POBDeepLinkUtil.b(pOBDeepLinkURLModel.getPrimaryUrl())) {
                triggerDeepLink = POBDeepLinkUtil.a(this.b, pOBDeepLinkURLModel.getPrimaryUrl());
            } else {
                triggerDeepLink = POBDeepLinkUtil.triggerDeepLink(this.b, pOBDeepLinkURLModel.getPrimaryUrl(), false);
            }
            if (triggerDeepLink) {
                POBLog.debug("POBUrlHandler", "Deep link success", new Object[0]);
                b(pOBDeepLinkURLModel.getPrimaryUrl(), pOBDeepLinkURLModel.getPrimaryTrackingUrl());
                this.d = true;
                this.a.onLeaveApp(pOBDeepLinkURLModel.getPrimaryUrl());
                return true;
            }
        } else {
            POBLog.debug("POBUrlHandler", "Primary url is not available", new Object[0]);
        }
        if (!POBUtils.isNullOrEmpty(pOBDeepLinkURLModel.getFallbackUrl()) && URLUtil.isValidUrl(pOBDeepLinkURLModel.getFallbackUrl())) {
            a(pOBDeepLinkURLModel.getFallbackUrl(), pOBDeepLinkURLModel.getFallbackTrackingUrl());
            return true;
        }
        POBLog.debug("POBUrlHandler", "Fallback url is not available", new Object[0]);
        return false;
    }

    private void a(String str, String str2) {
        if (POBInstanceProvider.getSdkConfig().isUseInternalBrowser()) {
            d(str, str2);
        } else {
            c(str, str2);
        }
    }

    private void a(String str) {
        if (POBDeepLinkUtil.triggerDeepLink(this.b, str, false)) {
            POBLog.debug("POBUrlHandler", "Deep link success", new Object[0]);
            this.d = true;
            this.a.onLeaveApp(str);
            return;
        }
        c(str);
    }
}
