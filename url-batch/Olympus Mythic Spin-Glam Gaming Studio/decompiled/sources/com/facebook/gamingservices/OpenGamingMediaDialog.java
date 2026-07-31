package com.facebook.gamingservices;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class OpenGamingMediaDialog implements GraphRequest.OnProgressCallback {
    private Context context;
    private GraphRequest.Callback nestedCallback;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivity(p1);
    }

    public OpenGamingMediaDialog(Context context) {
        this(context, null);
    }

    public OpenGamingMediaDialog(Context context, GraphRequest.Callback callback) {
        this.context = context;
        this.nestedCallback = callback;
    }

    @Override // com.facebook.GraphRequest.Callback
    public void onCompleted(GraphResponse graphResponse) {
        GraphRequest.Callback callback = this.nestedCallback;
        if (callback != null) {
            callback.onCompleted(graphResponse);
        }
        if (graphResponse == null || graphResponse.getError() != null) {
            return;
        }
        String optString = graphResponse.getGraphObject().optString("id", null);
        String optString2 = graphResponse.getGraphObject().optString("video_id", null);
        if (optString == null && optString2 == null) {
            return;
        }
        if (optString == null) {
            optString = optString2;
        }
        if (CloudGameLoginHandler.isRunningInCloud()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", optString);
                jSONObject.put(SDKConstants.PARAM_DEEP_LINK, "MEDIA_ASSET");
                DaemonRequest.executeAsync(this.context, jSONObject, (DaemonRequest.Callback) null, SDKMessageEnum.OPEN_GAMING_SERVICES_DEEP_LINK);
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, new Intent("android.intent.action.VIEW", Uri.parse("https://fb.gg/me/media_asset/" + optString)));
    }

    @Override // com.facebook.GraphRequest.OnProgressCallback
    public void onProgress(long j, long j2) {
        GraphRequest.Callback callback = this.nestedCallback;
        if (callback == null || !(callback instanceof GraphRequest.OnProgressCallback)) {
            return;
        }
        ((GraphRequest.OnProgressCallback) callback).onProgress(j, j2);
    }
}
