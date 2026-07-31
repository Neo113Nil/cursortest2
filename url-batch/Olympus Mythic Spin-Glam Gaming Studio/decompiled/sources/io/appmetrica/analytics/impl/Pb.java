package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes.dex */
public final class Pb implements InterfaceC5357gb {
    public final InterfaceC5357gb a;

    public Pb(InterfaceC5357gb interfaceC5357gb) {
        this.a = interfaceC5357gb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final InterfaceC5357gb a(String str, String str2) {
        this.a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final Set b() {
        return this.a.b();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final void flushAsync() {
        this.a.flushAsync();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final int getInt(String str, int i) {
        return this.a.getInt(str, i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final long getLong(String str, long j) {
        return this.a.getLong(str, j);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final String getString(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final InterfaceC5357gb remove(String str) {
        this.a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final InterfaceC5357gb a(String str, long j) {
        this.a.a(str, j);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final InterfaceC5357gb a(String str, int i) {
        this.a.a(str, i);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final InterfaceC5357gb a(String str, boolean z) {
        this.a.a(str, z);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final InterfaceC5357gb a(String str, float f) {
        this.a.a(str, f);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final boolean a(String str) {
        return this.a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357gb
    public final void a() {
        this.a.a();
    }
}
