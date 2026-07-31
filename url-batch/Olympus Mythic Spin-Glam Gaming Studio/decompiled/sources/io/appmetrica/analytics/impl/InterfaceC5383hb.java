package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.hb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC5383hb extends InterfaceC5254cb, InterfaceC5256cd {
    void a(@Nullable Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(@Nullable Location location);

    void a(@NonNull AnrListener anrListener);

    void a(@NonNull ExternalAttribution externalAttribution);

    void a(@NonNull ap apVar);

    void a(@NonNull EnumC5526n enumC5526n);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(String str, String str2);

    void a(@NonNull String str, boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(boolean z);

    @Override // io.appmetrica.analytics.impl.InterfaceC5256cd
    /* synthetic */ void a(boolean z, boolean z2);

    void b(@Nullable Activity activity);

    @Override // io.appmetrica.analytics.impl.InterfaceC5254cb
    /* synthetic */ void b(@NonNull String str);

    @Override // io.appmetrica.analytics.impl.InterfaceC5254cb
    /* synthetic */ void b(@NonNull String str, @Nullable String str2);

    @Override // io.appmetrica.analytics.impl.InterfaceC5254cb
    /* synthetic */ boolean b();

    void c();

    List<String> f();
}
