package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴄ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0951 extends BroadcastReceiver {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2266 = StringFog.decrypt("2mbiEfCsNqfgYuIDzbs+kf118xQ=\n", "lAOWZp/eXfQ=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f2269;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public boolean f2268 = false;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f2267 = new HashSet();

    public C0951(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2269 = applicationContext;
        AbstractC0580.m4073(f2266, StringFog.decrypt("y7VwpBLyuGbtoCSyCfO+Ivuxd6Rb7rol/blytQmy\n", "mNAE0Huc30Y=\n"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StringFog.decrypt("FhjMerQGIKQZE9wmuAAq5Fk150aVKgfePiDhXIIwB8I2OO9N\n", "d3aoCNtvRIo=\n"));
        applicationContext.registerReceiver(this, intentFilter);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m4245(C0951 c0951, boolean z) {
        synchronized (c0951) {
            c0951.f2268 = z;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC1026.m4316(new C0957(this, intent, context));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m4247() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f2267);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1076) it.next()).getClass();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m4246(C0951 c0951, Context context) {
        c0951.getClass();
        NetworkInfo activeNetworkInfo = context != null ? ((ConnectivityManager) context.getSystemService(StringFog.decrypt("MkvZp+ifNnonTcOw\n", "USS3yY38QhM=\n"))).getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        AbstractC0580.m4078(f2266, StringFog.decrypt("I9RbuDc0Txw=\n", "bbEvz1hGJDw=\n") + activeNetworkInfo.getTypeName() + StringFog.decrypt("TKJ58STAp/QJpTg=\n", "bMEWn0qlxIA=\n"));
        return true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m4248() {
        return this.f2268;
    }
}
