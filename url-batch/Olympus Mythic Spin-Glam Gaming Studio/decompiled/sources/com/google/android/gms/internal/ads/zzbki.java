package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzbki extends CustomTabsCallback {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlz)).split(StringUtils.COMMA));
    private final zzbkl zzc;

    @Nullable
    private final CustomTabsCallback zzd;
    private final zzeao zze;

    zzbki(@NonNull zzbkl zzbklVar, @Nullable CustomTabsCallback customTabsCallback, zzeao zzeaoVar) {
        this.zzd = customTabsCallback;
        this.zzc = zzbklVar;
        this.zze = zzeaoVar;
    }

    private final void zzb(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void extraCallback(String str, @Nullable Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    @Nullable
    public final Bundle extraCallbackWithResult(String str, @Nullable Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onActivityResized(i, i2, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onMessageChannelReady(@Nullable Bundle bundle) {
        this.zza.set(false);
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, @Nullable Bundle bundle) {
        this.zza.set(false);
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onNavigationEvent(i, bundle);
        }
        zzbkl zzbklVar = this.zzc;
        zzbklVar.zzg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        zzbklVar.zzc();
        zzb("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onPostMessage(String str, @Nullable Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzd(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e);
        }
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, @Nullable Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onRelationshipValidationResult(i, uri, z, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
