package com.smaato.sdk.ng.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.smaato.sdk.ng.models.RemoteConfigResponse;
import com.smaato.sdk.ng.models.SdkConfig;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SDKConfigAPiClient {
    Context a;
    final String b = "https://sdkc.vervegroupinc.net/config";
    private final Boolean c = Boolean.FALSE;
    private String d = "";
    private String e = "https://sdkc.vervegroupinc.net/config";
    private ConfigType f = ConfigType.PRODUCTION;

    public interface AtomConfigListener {
        void onAtomValueFetched(Boolean bool);
    }

    public enum ConfigType {
        PRODUCTION,
        TESTING
    }

    class a implements NGSDKHttpClient.Listener {
        final /* synthetic */ AtomConfigListener a;

        a(AtomConfigListener atomConfigListener) {
            this.a = atomConfigListener;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            AtomConfigListener atomConfigListener = this.a;
            if (atomConfigListener != null) {
                atomConfigListener.onAtomValueFetched(SDKConfigAPiClient.this.c);
            }
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            SDKConfigAPiClient.this.processStream(str, this.a);
        }
    }

    public SDKConfigAPiClient(Context context) {
        this.a = context;
    }

    private void a(RemoteConfigResponse remoteConfigResponse, AtomConfigListener atomConfigListener) {
        if (atomConfigListener != null) {
            atomConfigListener.onAtomValueFetched(remoteConfigResponse.configs.isAtomEnabled());
        }
    }

    public void fetchConfig(AtomConfigListener atomConfigListener) {
        NGSDKHttpClient.makeRequest(this.a, a(), null, null, false, true, new a(atomConfigListener));
    }

    public ConfigType getConfigType() {
        return this.f;
    }

    public String getUrl() {
        return this.e;
    }

    public void processStream(String str, AtomConfigListener atomConfigListener) {
        try {
            processStream(new RemoteConfigResponse(new JSONObject(str)), atomConfigListener);
        } catch (Error | Exception unused) {
            if (atomConfigListener != null) {
                atomConfigListener.onAtomValueFetched(this.c);
            }
        }
    }

    public void setAppToken(String str) {
        this.d = str;
    }

    public void setURL(String str, ConfigType configType) {
        if (TextUtils.isEmpty(str)) {
            this.e = "https://sdkc.vervegroupinc.net/config";
            this.f = ConfigType.PRODUCTION;
        } else {
            this.e = str;
            this.f = configType;
        }
    }

    private String a() {
        if (this.f != ConfigType.PRODUCTION) {
            return this.e.trim();
        }
        Uri.Builder buildUpon = Uri.parse(this.e).buildUpon();
        if (!TextUtils.isEmpty(this.d)) {
            buildUpon.appendQueryParameter("app_token", this.d);
        }
        return buildUpon.build().toString();
    }

    public void processStream(RemoteConfigResponse remoteConfigResponse, AtomConfigListener atomConfigListener) {
        SdkConfig sdkConfig;
        if (remoteConfigResponse != null && (sdkConfig = remoteConfigResponse.configs) != null && sdkConfig.app_level != null) {
            if ("ok".equals(remoteConfigResponse.status)) {
                a(remoteConfigResponse, atomConfigListener);
                return;
            } else {
                if (atomConfigListener != null) {
                    atomConfigListener.onAtomValueFetched(this.c);
                    return;
                }
                return;
            }
        }
        atomConfigListener.onAtomValueFetched(this.c);
    }
}
