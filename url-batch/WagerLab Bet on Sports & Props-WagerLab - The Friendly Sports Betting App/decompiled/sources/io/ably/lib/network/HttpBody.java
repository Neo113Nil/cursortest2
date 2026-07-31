package io.ably.lib.network;

import java.util.Arrays;

/* loaded from: classes7.dex */
public class HttpBody {
    private final byte[] content;
    private final String contentType;

    protected boolean canEqual(Object obj) {
        return obj instanceof HttpBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpBody)) {
            return false;
        }
        HttpBody httpBody = (HttpBody) obj;
        if (!httpBody.canEqual(this)) {
            return false;
        }
        String contentType = getContentType();
        String contentType2 = httpBody.getContentType();
        if (contentType != null ? contentType.equals(contentType2) : contentType2 == null) {
            return Arrays.equals(getContent(), httpBody.getContent());
        }
        return false;
    }

    public int hashCode() {
        String contentType = getContentType();
        return (((contentType == null ? 43 : contentType.hashCode()) + 59) * 59) + Arrays.hashCode(getContent());
    }

    public String toString() {
        return "HttpBody(contentType=" + getContentType() + ", content=" + Arrays.toString(getContent()) + ")";
    }

    public HttpBody(String str, byte[] bArr) {
        this.contentType = str;
        this.content = bArr;
    }

    public String getContentType() {
        return this.contentType;
    }

    public byte[] getContent() {
        return this.content;
    }
}
