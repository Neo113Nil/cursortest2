package com.my.target;

import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
final class ic implements CookieStore {
    ic() {
    }

    @Override // java.net.CookieStore
    public void add(URI uri, HttpCookie httpCookie) {
    }

    @Override // java.net.CookieStore
    public List get(URI uri) {
        return Collections.EMPTY_LIST;
    }

    @Override // java.net.CookieStore
    public List getCookies() {
        return Collections.EMPTY_LIST;
    }

    @Override // java.net.CookieStore
    public List getURIs() {
        return Collections.EMPTY_LIST;
    }

    @Override // java.net.CookieStore
    public boolean remove(URI uri, HttpCookie httpCookie) {
        return false;
    }

    @Override // java.net.CookieStore
    public boolean removeAll() {
        return false;
    }
}
