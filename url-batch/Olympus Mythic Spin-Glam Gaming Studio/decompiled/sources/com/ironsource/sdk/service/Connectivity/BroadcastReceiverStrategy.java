package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C4782n4;
import com.ironsource.InterfaceC4874s7;
import com.ironsource.InterfaceC4892t7;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BroadcastReceiverStrategy implements InterfaceC4874s7 {
    private final InterfaceC4892t7 a;
    private BroadcastReceiver b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String b = U3.b(context);
            if (b.equals("none")) {
                BroadcastReceiverStrategy.this.a.a();
            } else {
                BroadcastReceiverStrategy.this.a.a(b, IronSourceNetworkBridge.jsonObjectInit());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC4892t7 interfaceC4892t7) {
        this.a = interfaceC4892t7;
    }

    @Override // com.ironsource.InterfaceC4874s7
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.b);
        } catch (IllegalArgumentException e) {
            C4782n4.d().a(e);
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e2);
        }
    }

    @Override // com.ironsource.InterfaceC4874s7
    public void b(Context context) {
        try {
            context.registerReceiver(this.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4874s7
    public JSONObject c(Context context) {
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    @Override // com.ironsource.InterfaceC4874s7
    public void a() {
        this.b = null;
    }
}
