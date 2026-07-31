package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Address.java */
/* loaded from: classes13.dex */
public final class a {
    final s a;
    final n b;
    final SocketFactory c;
    final b d;
    final List<w> e;
    final List<j> f;
    final ProxySelector g;
    final Proxy h;
    final SSLSocketFactory i;
    final HostnameVerifier j;
    final f k;

    public a(String str, int i, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        this.a = new s.a().f(sSLSocketFactory != null ? "https" : "http").b(str).a(i).a();
        if (nVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.b = nVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.c = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.d = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.e = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.g = proxySelector;
        this.h = proxy;
        this.i = sSLSocketFactory;
        this.j = hostnameVerifier;
        this.k = fVar;
    }

    public f a() {
        return this.k;
    }

    public List<j> b() {
        return this.f;
    }

    public n c() {
        return this.b;
    }

    public HostnameVerifier d() {
        return this.j;
    }

    public List<w> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public Proxy f() {
        return this.h;
    }

    public b g() {
        return this.d;
    }

    public ProxySelector h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        Proxy proxy = this.h;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.k;
        return hashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public SocketFactory i() {
        return this.c;
    }

    public SSLSocketFactory j() {
        return this.i;
    }

    public s k() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.a.g());
        sb.append(":");
        sb.append(this.a.j());
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append("}");
        return sb.toString();
    }

    boolean a(a aVar) {
        return this.b.equals(aVar.b) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.h, aVar.h) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.i, aVar.i) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.j, aVar.j) && com.mbridge.msdk.thrid.okhttp.internal.c.a(this.k, aVar.k) && k().j() == aVar.k().j();
    }
}
