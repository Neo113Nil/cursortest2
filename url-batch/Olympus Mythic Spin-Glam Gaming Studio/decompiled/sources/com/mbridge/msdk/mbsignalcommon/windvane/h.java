package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbsignalcommon.mapping.b;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WindVaneSignalCommunication.java */
/* loaded from: classes4.dex */
public class h implements b, Handler.Callback {
    protected Pattern a;
    protected String b;
    protected Context d;
    protected WindVaneWebView e;
    protected final int c = 1;
    protected Handler f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a a = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.e, str);
        if (a != null) {
            a.b = this.e;
            return a;
        }
        Matcher matcher = this.a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int groupCount = matcher.groupCount();
            if (groupCount >= 5) {
                aVar.f = matcher.group(5);
            }
            if (groupCount >= 3) {
                aVar.d = matcher.group(1);
                aVar.g = matcher.group(2);
                String group = matcher.group(3);
                aVar.e = group;
                HashMap<String, String> hashMap = com.mbridge.msdk.mbsignalcommon.base.e.k;
                if (hashMap != null && hashMap.containsKey(group)) {
                    aVar.e = com.mbridge.msdk.mbsignalcommon.base.e.k.get(aVar.e);
                }
                aVar.b = this.e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/mbsignalcommon/windvane/h;->handleMessage(Landroid/os/Message;)Z");
        boolean safedk_h_handleMessage_36c818e2bae56b0bccddbb07f37e736e = safedk_h_handleMessage_36c818e2bae56b0bccddbb07f37e736e(message);
        BrandSafetyUtils.onWindVaneSignalCommunicationHandleMessage(com.safedk.android.utils.h.o, this, message);
        return safedk_h_handleMessage_36c818e2bae56b0bccddbb07f37e736e;
    }

    public boolean safedk_h_handleMessage_36c818e2bae56b0bccddbb07f37e736e(Message p0) {
        a aVar = (a) p0.obj;
        if (aVar == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (p0.what != 1) {
            return false;
        }
        Object obj = aVar.c;
        b.C1441b c1441b = aVar.a;
        if (c1441b != null && obj != null) {
            c1441b.a(obj, aVar, TextUtils.isEmpty(aVar.f) ? JsonUtils.EMPTY_JSON : aVar.f);
        }
        return true;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a c;
        if (TextUtils.isEmpty(str) || (c = c(str)) == null) {
            return;
        }
        a(c);
    }

    protected void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.d);
        if (jsObject == null) {
            return;
        }
        try {
            b.C1441b a = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.d.getClassLoader(), jsObject.getClass().getName()).a(aVar.e, Object.class, String.class);
            a.a();
            if (jsObject instanceof g) {
                aVar.a = a;
                aVar.c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    protected void a(int i, a aVar) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = aVar;
        this.f.sendMessage(obtain);
    }

    public void a(Pattern pattern) {
        this.a = pattern;
    }
}
