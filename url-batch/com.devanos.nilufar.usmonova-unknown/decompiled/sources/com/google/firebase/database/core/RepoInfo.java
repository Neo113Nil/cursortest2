package com.google.firebase.database.core;

import com.google.firebase.database.annotations.Nullable;
import com.google.firebase.emulators.EmulatedServiceSettings;
import java.net.URI;
import o.AbstractC1888sN;

/* loaded from: classes.dex */
public final class RepoInfo {
    private static final String LAST_SESSION_ID_PARAM = "ls";
    private static final String VERSION_PARAM = "v";
    public String host;
    public String internalHost;
    public String namespace;
    public boolean secure;

    public void applyEmulatorSettings(@Nullable EmulatedServiceSettings emulatedServiceSettings) {
        if (emulatedServiceSettings == null) {
            return;
        }
        String str = emulatedServiceSettings.getHost() + ":" + emulatedServiceSettings.getPort();
        this.host = str;
        this.internalHost = str;
        this.secure = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RepoInfo.class != obj.getClass()) {
            return false;
        }
        RepoInfo repoInfo = (RepoInfo) obj;
        if (this.secure == repoInfo.secure && this.host.equals(repoInfo.host)) {
            return this.namespace.equals(repoInfo.namespace);
        }
        return false;
    }

    public URI getConnectionURL(String str) {
        String str2 = this.secure ? "wss" : "ws";
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("://");
        sb.append(this.internalHost);
        sb.append("/.ws?ns=");
        String l = AbstractC1888sN.l(sb, this.namespace, "&v=5");
        if (str != null) {
            l = l + "&ls=" + str;
        }
        return URI.create(l);
    }

    public int hashCode() {
        return this.namespace.hashCode() + (((this.host.hashCode() * 31) + (this.secure ? 1 : 0)) * 31);
    }

    public boolean isCacheableHost() {
        return this.internalHost.startsWith("s-");
    }

    public boolean isCustomHost() {
        return (this.host.contains(".firebaseio.com") || this.host.contains(".firebaseio-demo.com")) ? false : true;
    }

    public boolean isDemoHost() {
        return this.host.contains(".firebaseio-demo.com");
    }

    public boolean isSecure() {
        return this.secure;
    }

    public String toDebugString() {
        StringBuilder sb = new StringBuilder("(host=");
        sb.append(this.host);
        sb.append(", secure=");
        sb.append(this.secure);
        sb.append(", ns=");
        sb.append(this.namespace);
        sb.append(" internal=");
        return AbstractC1888sN.l(sb, this.internalHost, ")");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("http");
        sb.append(this.secure ? "s" : "");
        sb.append("://");
        sb.append(this.host);
        return sb.toString();
    }
}
