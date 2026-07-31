package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;

/* loaded from: classes13.dex */
public interface RedirectHandler {
    boolean shouldFollowRedirect(UrlResponseInfo urlResponseInfo, String str) throws Exception;
}
