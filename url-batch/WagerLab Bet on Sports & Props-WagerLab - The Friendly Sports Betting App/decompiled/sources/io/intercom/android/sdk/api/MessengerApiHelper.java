package io.intercom.android.sdk.api;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.Gson;
import io.intercom.android.sdk.Injector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: MessengerApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001J#\u0010\t\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¢\u0006\u0002\b\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/api/MessengerApiHelper;", "", "<init>", "()V", "optionsMapToRequestBody", "Lokhttp3/RequestBody;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "", "", "getDefaultRequestBody", "bodyParams", "getDefaultRequestBody$intercom_sdk_base_release", "getDefaultMultipartFields", "", "Lokhttp3/MultipartBody$Part;", "getDefaultMultipartFields$intercom_sdk_base_release", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessengerApiHelper {
    public static final int $stable = 0;
    public static final MessengerApiHelper INSTANCE = new MessengerApiHelper();

    private MessengerApiHelper() {
    }

    public final RequestBody optionsMapToRequestBody(Map<String, ? extends Object> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String json = new Gson().toJson(options);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return companion.create(json, MediaType.INSTANCE.get("application/json; charset=utf-8"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestBody getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper messengerApiHelper, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        return messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(map);
    }

    public final RequestBody getDefaultRequestBody$intercom_sdk_base_release(Map<String, ? extends Object> bodyParams) {
        Intrinsics.checkNotNullParameter(bodyParams, "bodyParams");
        Injector injector = Injector.get();
        Map<String, Object> map = injector.getUserIdentity().toMap();
        injector.getApi().addSecureHash(map);
        map.putAll(bodyParams);
        Intrinsics.checkNotNull(map);
        return optionsMapToRequestBody(map);
    }

    public final List<MultipartBody.Part> getDefaultMultipartFields$intercom_sdk_base_release() {
        Injector injector = Injector.get();
        Map<String, Object> map = injector.getUserIdentity().toMap();
        Intrinsics.checkNotNullExpressionValue(map, "toMap(...)");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(map);
        injector.getApi().addSecureHash(mutableMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : mutableMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
            Intrinsics.checkNotNull(key);
            arrayList.add(companion.createFormData(key, value.toString()));
        }
        return arrayList;
    }
}
