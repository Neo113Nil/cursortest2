package com.fyber.inneractive.sdk.ignite;

import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.v;
import com.fyber.inneractive.sdk.flow.w;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s extends IIgniteServiceCallback.Stub {
    public final r a;
    public final c b;

    public s(e eVar, c cVar) {
        this.a = eVar;
        this.b = cVar;
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).optString("taskId");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(2:4|5)|(6:7|8|9|(1:11)|13|14)|18|8|9|(0)|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #0 {Exception -> 0x0038, blocks: (B:9:0x0027, B:11:0x0032), top: B:8:0x0027 }] */
    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onError(String str) {
        String str2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        IAlog.a("InstallCallback onError %s", str);
        if (this.a != null) {
            String a = a(str);
            String str3 = null;
            try {
                optJSONObject2 = new JSONObject(str).optJSONObject("data");
            } catch (Exception unused) {
            }
            if (optJSONObject2 != null) {
                str2 = optJSONObject2.optString("message");
                optJSONObject = new JSONObject(str).optJSONObject("data");
                if (optJSONObject != null) {
                    str3 = optJSONObject.optString("code");
                }
                this.a.a(a, str2, str3);
            }
            str2 = null;
            optJSONObject = new JSONObject(str).optJSONObject("data");
            if (optJSONObject != null) {
            }
            this.a.a(a, str2, str3);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
        JSONObject optJSONObject;
        IAlog.a("InstallCallback onProgress %s", str);
        try {
            String a = a(str);
            JSONObject optJSONObject2 = new JSONObject(str).optJSONObject("data");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("progress")) == null) {
                return;
            }
            int optInt = optJSONObject.optInt("action");
            double optDouble = optJSONObject.optDouble("value");
            r rVar = this.a;
            if (rVar != null) {
                rVar.a(a, optInt, optDouble);
            }
        } catch (Exception unused) {
            IAlog.a("Failed to resolve progress data", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
        String str2;
        IAlog.a("InstallCallback onScheduled %s", str);
        try {
            String a = a(str);
            try {
                str2 = new JSONObject(str).getJSONObject("application").optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
            } catch (Exception unused) {
                str2 = null;
            }
            r rVar = this.a;
            if (rVar != null) {
                rVar.a(a, str2);
            }
        } catch (Exception unused2) {
            IAlog.a("Failed to resolve taskId", new Object[0]);
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
        IAlog.a("InstallCallback onStart %s", str);
        if (this.a != null) {
            this.a.a(a(str));
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        IAlog.a("InstallCallback onSuccess %s", str);
        if (this.a != null) {
            this.a.b(a(str));
            c cVar = this.b;
            if (cVar != null) {
                h hVar = cVar.b;
                String str2 = cVar.a.a;
                hVar.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    IAConfigManager.N.r.a(new z0(new f(str2), str2));
                }
                g gVar = cVar.a;
                w wVar = gVar.b;
                m mVar = gVar.c;
                v vVar = wVar.h;
                u uVar = u.IGNITE_FLOW_INSTALL_DONE;
                if (mVar == null) {
                    mVar = m.SINGLE_TAP;
                }
                vVar.a(uVar, mVar);
            }
        }
    }
}
