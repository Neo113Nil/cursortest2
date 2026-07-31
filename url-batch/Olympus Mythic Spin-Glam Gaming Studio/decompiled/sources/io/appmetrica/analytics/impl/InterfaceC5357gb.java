package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.gb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC5357gb {
    InterfaceC5357gb a(String str, float f);

    InterfaceC5357gb a(String str, int i);

    InterfaceC5357gb a(String str, long j);

    InterfaceC5357gb a(String str, String str2);

    InterfaceC5357gb a(String str, boolean z);

    void a();

    boolean a(String str);

    Set b();

    void flushAsync();

    boolean getBoolean(String str, boolean z);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    InterfaceC5357gb remove(String str);
}
