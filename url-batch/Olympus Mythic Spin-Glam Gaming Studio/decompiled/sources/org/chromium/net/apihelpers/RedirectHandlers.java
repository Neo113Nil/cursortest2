package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public class RedirectHandlers {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$alwaysFollow$1(UrlResponseInfo urlResponseInfo, String str) throws Exception {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$neverFollow$0(UrlResponseInfo urlResponseInfo, String str) throws Exception {
        return false;
    }

    public static RedirectHandler neverFollow() {
        return new RedirectHandler() { // from class: org.chromium.net.apihelpers.RedirectHandlers$$ExternalSyntheticLambda0
            @Override // org.chromium.net.apihelpers.RedirectHandler
            public final boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) {
                boolean lambda$neverFollow$0;
                lambda$neverFollow$0 = RedirectHandlers.lambda$neverFollow$0(urlResponseInfo, str);
                return lambda$neverFollow$0;
            }
        };
    }

    public static RedirectHandler alwaysFollow() {
        return new RedirectHandler() { // from class: org.chromium.net.apihelpers.RedirectHandlers$$ExternalSyntheticLambda1
            @Override // org.chromium.net.apihelpers.RedirectHandler
            public final boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) {
                boolean lambda$alwaysFollow$1;
                lambda$alwaysFollow$1 = RedirectHandlers.lambda$alwaysFollow$1(urlResponseInfo, str);
                return lambda$alwaysFollow$1;
            }
        };
    }

    private RedirectHandlers() {
    }
}
