package org.chromium.net.apihelpers;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes12.dex */
public class CronetResponse<T> {

    @Nullable
    private final T mResponseBody;
    private final UrlResponseInfo mUrlResponseInfo;

    CronetResponse(UrlResponseInfo urlResponseInfo, @Nullable T t) {
        this.mUrlResponseInfo = urlResponseInfo;
        this.mResponseBody = t;
    }

    public UrlResponseInfo getUrlResponseInfo() {
        return this.mUrlResponseInfo;
    }

    @Nullable
    public T getResponseBody() {
        return this.mResponseBody;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CronetResponse)) {
            return false;
        }
        CronetResponse cronetResponse = (CronetResponse) obj;
        return Objects.equals(this.mUrlResponseInfo, cronetResponse.mUrlResponseInfo) && Objects.equals(this.mResponseBody, cronetResponse.mResponseBody);
    }

    public int hashCode() {
        return Objects.hash(this.mUrlResponseInfo, this.mResponseBody);
    }
}
