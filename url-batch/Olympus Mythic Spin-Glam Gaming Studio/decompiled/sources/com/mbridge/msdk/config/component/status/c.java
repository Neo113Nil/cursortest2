package com.mbridge.msdk.config.component.status;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MBNetworkEventPublisher.java */
/* loaded from: classes14.dex */
public class c {
    ConnectivityManager b;
    b c;
    boolean d;
    private final List<com.mbridge.msdk.config.component.status.a> a = new CopyOnWriteArrayList();

    @RequiresApi
    private final ConnectivityManager.NetworkCallback e = new a();

    /* compiled from: MBNetworkEventPublisher.java */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            boolean hasTransport = networkCapabilities.hasTransport(1);
            boolean hasTransport2 = networkCapabilities.hasTransport(0);
            int i = hasTransport ? 9 : -1;
            if (hasTransport2) {
                i = c.this.c();
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916002");
            HashMap hashMap = new HashMap();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(i));
            bVar.a(hashMap);
            c.this.a(bVar);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            super.onLost(network);
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916002");
            HashMap hashMap = new HashMap();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(c.this.c()));
            bVar.a(hashMap);
            c.this.a(bVar);
        }
    }

    /* compiled from: MBNetworkEventPublisher.java */
    private final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                int c = c.this.c();
                com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
                bVar.b("916002");
                HashMap hashMap = new HashMap();
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("networkType"), String.valueOf(c));
                bVar.a(hashMap);
                c.this.a(bVar);
            } catch (Throwable th) {
                q0.b("MBNetworkEventPublisher", th.getMessage());
            }
        }

        /* synthetic */ b(c cVar, a aVar) {
            this();
        }
    }

    public c() {
        a(com.mbridge.msdk.foundation.controller.c.n().d());
        a();
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        this.a.remove(aVar);
    }

    @SuppressLint({"MissingPermission"})
    public int c() {
        NetworkInfo activeNetworkInfo;
        if (this.d) {
            TelephonyManager telephonyManager = (TelephonyManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("phone");
            return m0.c(telephonyManager != null ? telephonyManager.getDataNetworkType() : 0);
        }
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        return m0.c(activeNetworkInfo.getSubtype());
    }

    public void d() {
        if (this.a.isEmpty()) {
            b();
        }
    }

    private void a() {
        int checkSelfPermission = ContextCompat.checkSelfPermission(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_PHONE_STATE");
        if (Build.VERSION.SDK_INT < 33) {
            this.d = checkSelfPermission == 0;
            return;
        }
        int checkSelfPermission2 = ContextCompat.checkSelfPermission(com.mbridge.msdk.foundation.controller.c.n().d(), "android.permission.READ_BASIC_PHONE_STATE");
        if (checkSelfPermission != 0 && checkSelfPermission2 != 0) {
            r3 = false;
        }
        this.d = r3;
    }

    public void b() {
        if (this.b == null) {
            this.b = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
        }
        this.b.unregisterNetworkCallback(this.e);
        this.b = null;
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar == null || this.a.contains(aVar)) {
            return;
        }
        this.a.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th) {
            q0.b("MBNetworkEventPublisher", th.getMessage());
        }
    }

    private void a(Context context) {
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(11).addCapability(12).build(), this.e);
    }
}
