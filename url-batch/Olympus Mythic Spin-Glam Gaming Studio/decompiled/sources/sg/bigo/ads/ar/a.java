package sg.bigo.ads.ar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes4.dex */
public final class a extends BroadcastReceiver {
    private boolean a;
    private final List<WeakReference<b>> b;

    /* renamed from: sg.bigo.ads.ar.a$a, reason: collision with other inner class name */
    static class C1840a {
        private static final a a = new a(0);
    }

    private a() {
        this.a = false;
        this.b = new ArrayList();
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C1840a.a;
    }

    public final void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.a = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(this, intentFilter);
        }
    }

    public final void a(Context context, final b bVar) {
        if (!this.a) {
            a(context);
        }
        sg.bigo.ads.bh.d.a(2, new Runnable() { // from class: sg.bigo.ads.ar.a.1
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = a.this.b.iterator();
                while (it.hasNext()) {
                    b bVar2 = (b) ((WeakReference) it.next()).get();
                    if (bVar2 != null && bVar2 == bVar) {
                        return;
                    }
                }
                a.this.b.add(new WeakReference(bVar));
            }
        }, 1L);
    }

    public final void a(final b bVar) {
        sg.bigo.ads.bh.d.b(new Runnable() { // from class: sg.bigo.ads.ar.a.2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = a.this.b.iterator();
                while (it.hasNext()) {
                    b bVar2 = (b) ((WeakReference) it.next()).get();
                    b bVar3 = bVar;
                    if (bVar3 != null && bVar2 == bVar3) {
                        it.remove();
                        return;
                    }
                }
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        Iterator<WeakReference<b>> it = this.b.iterator();
        while (it.hasNext()) {
            b bVar = it.next().get();
            if (bVar != null) {
                String action = intent.getAction();
                if ((bVar instanceof c) && !TextUtils.isEmpty(action) && "android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    bVar.a(context, intent);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String action2 = intent.getAction();
                    if ((bVar instanceof e) && r.b((CharSequence) action2)) {
                        action2.hashCode();
                        switch (action2) {
                            case "android.intent.action.SCREEN_OFF":
                            case "android.intent.action.SCREEN_ON":
                            case "android.intent.action.ACTION_POWER_CONNECTED":
                                bVar.a(context, intent);
                                z = true;
                                break;
                        }
                    }
                    z = false;
                }
                if (!z) {
                    String action3 = intent.getAction();
                    if ((bVar instanceof d) && !TextUtils.isEmpty(action3) && "android.intent.action.CONFIGURATION_CHANGED".equals(action3)) {
                        bVar.a(context, intent);
                    }
                }
            }
        }
    }
}
