package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ףּ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1187 extends AbstractC0872 implements InterfaceC1096 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public C1196 f3076;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public boolean f3077;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public boolean f3078;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public boolean f3079;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public boolean f3080;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public Class f3081;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public C1204 f3082;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3075 = StringFog.decrypt("IL+otkck6S8guJS+XynxMxM=\n", "Ydzc3zFNnVY=\n");

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f3074 = StringFog.decrypt("FvE3BzlGRKMG8S9bM1EFrBHvL0g8XV+0BvoxByNQQOM0+glBP0NF\n", "dZ5aKVA0K80=\n");

    public C1187(JSONObject jSONObject, C1150 c1150) {
        super(c1150);
        this.f3080 = false;
        this.f3079 = false;
        this.f3078 = false;
        this.f3077 = false;
        C1196 c1196 = new C1196(jSONObject);
        this.f2098 = c1196;
        this.f3076 = c1196;
        AbstractC1026.m4313(new C1279(this));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m4448(C1187 c1187, Activity activity) {
        c1187.getClass();
        Class<?> cls = activity.getClass();
        Class cls2 = c1187.f3081;
        if (cls2 != null) {
            return c1187.f3076.f3099 ? cls2.equals(cls) : cls2.isAssignableFrom(cls);
        }
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1261 c1261 = new C1261(this, activity, bundle);
        if (this.f3076.f3098) {
            AbstractC1026.m4312(c1261);
        } else {
            AbstractC1026.m4314(c1261);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C1302 c1302 = new C1302(this, activity);
        if (this.f3076.f3098) {
            AbstractC1026.m4312(c1302);
        } else {
            AbstractC1026.m4314(c1302);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC1026.m4316(new C1217(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1221 c1221 = new C1221(this, activity);
        if (this.f3076.f3098) {
            AbstractC1026.m4312(c1221);
        } else {
            AbstractC1026.m4314(c1221);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C1220 c1220 = new C1220(this, activity, bundle);
        if (this.f3076.f3098) {
            AbstractC1026.m4312(c1220);
        } else {
            AbstractC1026.m4314(c1220);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC1026.m4316(new C1233(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C1208 c1208 = new C1208(this, activity);
        if (this.f3076.f3098) {
            AbstractC1026.m4312(c1208);
        } else {
            AbstractC1026.m4314(c1208);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0872
    /* renamed from: ﾇ */
    public final void mo3968(Object obj, ArrayList arrayList) {
        Activity activity = (Activity) obj;
        C1196 c1196 = this.f3076;
        AbstractC1240.m4492(activity, WebView.class, c1196.f3100, c1196.f3101, false, false, null, c1196.f2102, arrayList);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0872
    /* renamed from: ﾒ */
    public final InterfaceC1156 mo3969() {
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0872
    /* renamed from: ﾇ */
    public final View mo3966(Object obj) {
        return ((Activity) obj).findViewById(R.id.content);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1096
    /* renamed from: ﾇ */
    public final void mo4165(Activity activity) {
        AbstractC1026.m4316(new C1277(this, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0872
    /* renamed from: ﾇ */
    public final AbstractViewOnLayoutChangeListenerC0474 mo3967() {
        return new C0473();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1096
    /* renamed from: ﾒ */
    public final void mo4166(Activity activity) {
        AbstractC1026.m4316(new C1278(this, activity));
    }
}
