package io.intercom.android.sdk.conversation;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class JavascriptRunner {
    private final Collection<Runnable> actionsAfterLoad;
    private boolean hasLoaded;
    private final WebView webView;

    public JavascriptRunner(WebView webView) {
        this(webView, new ArrayList());
    }

    JavascriptRunner(WebView webView, Collection<Runnable> collection) {
        this.hasLoaded = false;
        this.webView = webView;
        this.actionsAfterLoad = collection;
    }

    public synchronized void runPendingScripts() {
        this.hasLoaded = true;
        Iterator<Runnable> it = this.actionsAfterLoad.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        clearPendingScripts();
    }

    public synchronized void clearPendingScripts() {
        this.actionsAfterLoad.clear();
    }

    public synchronized void run(final String str) {
        Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.conversation.JavascriptRunner.1
            @Override // java.lang.Runnable
            public void run() {
                JavascriptRunner.this.webView.loadUrl("javascript:" + str);
            }
        };
        if (this.hasLoaded) {
            this.webView.post(runnable);
        } else {
            this.actionsAfterLoad.add(runnable);
        }
    }

    public synchronized void reset() {
        this.hasLoaded = false;
        clearPendingScripts();
    }
}
