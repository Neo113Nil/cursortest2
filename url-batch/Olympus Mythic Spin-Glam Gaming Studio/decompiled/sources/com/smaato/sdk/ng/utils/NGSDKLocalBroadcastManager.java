package com.smaato.sdk.ng.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class NGSDKLocalBroadcastManager {
    private static final Object f = new Object();
    private static NGSDKLocalBroadcastManager g;
    private final Context a;
    private final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap<>();
    private final HashMap<String, ArrayList<c>> c = new HashMap<>();
    private final ArrayList<b> d = new ArrayList<>();
    private final Handler e;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                NGSDKLocalBroadcastManager.this.a();
            } else {
                super.handleMessage(message);
            }
        }
    }

    private static final class b {
        final Intent a;
        final ArrayList<c> b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    private static final class c {
        final IntentFilter a;
        final BroadcastReceiver b;
        boolean c;
        boolean d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private NGSDKLocalBroadcastManager(Context context) {
        this.a = context;
        this.e = new a(context.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.b) {
                try {
                    size = this.d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.d.toArray(bVarArr);
                    this.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                b bVar = bVarArr[i];
                int size2 = bVar.b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c cVar = bVar.b.get(i2);
                    if (!cVar.d) {
                        cVar.b.onReceive(this.a, bVar.a);
                    }
                }
            }
        }
    }

    public static NGSDKLocalBroadcastManager getInstance(Context context) {
        NGSDKLocalBroadcastManager nGSDKLocalBroadcastManager;
        synchronized (f) {
            try {
                if (g == null) {
                    g = new NGSDKLocalBroadcastManager(context.getApplicationContext());
                }
                nGSDKLocalBroadcastManager = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nGSDKLocalBroadcastManager;
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<c> arrayList2 = this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean sendBroadcast(Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        boolean z;
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = true;
                boolean z3 = (intent.getFlags() & 8) != 0;
                if (z3) {
                    intent.toString();
                }
                ArrayList<c> arrayList3 = this.c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z3) {
                        arrayList3.toString();
                    }
                    ArrayList arrayList4 = null;
                    int i2 = 0;
                    while (i2 < arrayList3.size()) {
                        c cVar = arrayList3.get(i2);
                        if (z3) {
                            Objects.toString(cVar.a);
                        }
                        if (cVar.c) {
                            i = i2;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = resolveTypeIfNeeded;
                            arrayList = arrayList4;
                            z = z2;
                        } else {
                            IntentFilter intentFilter = cVar.a;
                            String str3 = action;
                            String str4 = resolveTypeIfNeeded;
                            i = i2;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = resolveTypeIfNeeded;
                            z = z2;
                            int match = intentFilter.match(str3, str4, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z3) {
                                    Integer.toHexString(match);
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.c = z;
                                i2 = i + 1;
                                z2 = z;
                                action = str;
                                arrayList3 = arrayList2;
                                resolveTypeIfNeeded = str2;
                            }
                        }
                        arrayList4 = arrayList;
                        i2 = i + 1;
                        z2 = z;
                        action = str;
                        arrayList3 = arrayList2;
                        resolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    boolean z4 = z2;
                    if (arrayList5 != null) {
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            ((c) arrayList5.get(i3)).c = false;
                        }
                        this.d.add(new b(intent, arrayList5));
                        if (!this.e.hasMessages(z4 ? 1 : 0)) {
                            this.e.sendEmptyMessage(z4 ? 1 : 0);
                        }
                        return z4;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void sendBroadcastSync(Intent intent) {
        if (sendBroadcast(intent)) {
            a();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            try {
                ArrayList<c> remove = this.b.remove(broadcastReceiver);
                if (remove == null) {
                    return;
                }
                for (int size = remove.size() - 1; size >= 0; size--) {
                    c cVar = remove.get(size);
                    cVar.d = true;
                    for (int i = 0; i < cVar.a.countActions(); i++) {
                        String action = cVar.a.getAction(i);
                        ArrayList<c> arrayList = this.c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.b == broadcastReceiver) {
                                    cVar2.d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
