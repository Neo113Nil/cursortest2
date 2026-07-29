package expo.modules.updates;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import expo.modules.manifests.core.JSONObjectExtensionKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UpdatesConfigurationOverride.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lexpo/modules/updates/UpdatesConfigurationOverride;", "", UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY, "Landroid/net/Uri;", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "", "", "<init>", "(Landroid/net/Uri;Ljava/util/Map;)V", "getUpdateUrl", "()Landroid/net/Uri;", "getRequestHeaders", "()Ljava/util/Map;", "toJSONObject", "Lorg/json/JSONObject;", "toJSONObject$expo_updates_release", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UpdatesConfigurationOverride {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String UPDATES_PREFS_FILE = "dev.expo.updates.prefs";
    private static final String UPDATES_PREFS_KEY_UPDATES_CONFIGURATION_OVERRIDE = "updatesConfigOverride";
    private final Map<String, String> requestHeaders;
    private final Uri updateUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdatesConfigurationOverride copy$default(UpdatesConfigurationOverride updatesConfigurationOverride, Uri uri, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = updatesConfigurationOverride.updateUrl;
        }
        if ((i & 2) != 0) {
            map = updatesConfigurationOverride.requestHeaders;
        }
        return updatesConfigurationOverride.copy(uri, map);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getUpdateUrl() {
        return this.updateUrl;
    }

    public final Map<String, String> component2() {
        return this.requestHeaders;
    }

    public final UpdatesConfigurationOverride copy(Uri updateUrl, Map<String, String> requestHeaders) {
        return new UpdatesConfigurationOverride(updateUrl, requestHeaders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatesConfigurationOverride)) {
            return false;
        }
        UpdatesConfigurationOverride updatesConfigurationOverride = (UpdatesConfigurationOverride) other;
        return Intrinsics.areEqual(this.updateUrl, updatesConfigurationOverride.updateUrl) && Intrinsics.areEqual(this.requestHeaders, updatesConfigurationOverride.requestHeaders);
    }

    public int hashCode() {
        Uri uri = this.updateUrl;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Map<String, String> map = this.requestHeaders;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "UpdatesConfigurationOverride(updateUrl=" + this.updateUrl + ", requestHeaders=" + this.requestHeaders + ")";
    }

    public UpdatesConfigurationOverride(Uri uri, Map<String, String> map) {
        this.updateUrl = uri;
        this.requestHeaders = map;
    }

    public final Uri getUpdateUrl() {
        return this.updateUrl;
    }

    public final Map<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    public final JSONObject toJSONObject$expo_updates_release() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.updateUrl;
        if (uri != null) {
            jSONObject.put(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY, uri.toString());
        }
        Map<String, String> map = this.requestHeaders;
        if (map != null) {
            jSONObject.put(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, new JSONObject(map));
        }
        return jSONObject;
    }

    /* compiled from: UpdatesConfigurationOverride.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\u000fJ-\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lexpo/modules/updates/UpdatesConfigurationOverride$Companion;", "", "<init>", "()V", "UPDATES_PREFS_FILE", "", "UPDATES_PREFS_KEY_UPDATES_CONFIGURATION_OVERRIDE", "load", "Lexpo/modules/updates/UpdatesConfigurationOverride;", "context", "Landroid/content/Context;", "load$expo_updates_release", "save", "", "configOverride", "save$expo_updates_release", "saveRequestHeaders", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "", "saveRequestHeaders$expo_updates_release", "fromJSONObject", "json", "Lorg/json/JSONObject;", "fromJSONObject$expo_updates_release", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UpdatesConfigurationOverride load$expo_updates_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(UpdatesConfigurationOverride.UPDATES_PREFS_FILE, 0);
            String string = sharedPreferences != null ? sharedPreferences.getString(UpdatesConfigurationOverride.UPDATES_PREFS_KEY_UPDATES_CONFIGURATION_OVERRIDE, null) : null;
            if (string != null) {
                return UpdatesConfigurationOverride.INSTANCE.fromJSONObject$expo_updates_release(new JSONObject(string));
            }
            return null;
        }

        public final void save$expo_updates_release(Context context, UpdatesConfigurationOverride configOverride) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(UpdatesConfigurationOverride.UPDATES_PREFS_FILE, 0);
            Intrinsics.checkNotNull(sharedPreferences);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (configOverride != null) {
                edit.putString(UpdatesConfigurationOverride.UPDATES_PREFS_KEY_UPDATES_CONFIGURATION_OVERRIDE, configOverride.toJSONObject$expo_updates_release().toString());
            } else {
                edit.remove(UpdatesConfigurationOverride.UPDATES_PREFS_KEY_UPDATES_CONFIGURATION_OVERRIDE);
            }
            edit.apply();
        }

        public final UpdatesConfigurationOverride saveRequestHeaders$expo_updates_release(Context context, Map<String, String> requestHeaders) {
            Intrinsics.checkNotNullParameter(context, "context");
            UpdatesConfigurationOverride load$expo_updates_release = load$expo_updates_release(context);
            if (load$expo_updates_release == null) {
                load$expo_updates_release = new UpdatesConfigurationOverride(null, null);
            }
            UpdatesConfigurationOverride copy$default = UpdatesConfigurationOverride.copy$default(load$expo_updates_release, null, requestHeaders, 1, null);
            UpdatesConfigurationOverride updatesConfigurationOverride = (copy$default.getUpdateUrl() == null && copy$default.getRequestHeaders() == null) ? null : copy$default;
            save$expo_updates_release(context, updatesConfigurationOverride);
            return updatesConfigurationOverride;
        }

        public final UpdatesConfigurationOverride fromJSONObject$expo_updates_release(JSONObject json) {
            String str;
            JSONObject jSONObject;
            Map<String, Object> map;
            Intrinsics.checkNotNullParameter(json, "json");
            LinkedHashMap linkedHashMap = null;
            if (json.has(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY)) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    str = json.getString(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY);
                    if (str == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    str = (String) Double.valueOf(json.getDouble(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    str = (String) Integer.valueOf(json.getInt(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    str = (String) Long.valueOf(json.getLong(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    str = (String) Boolean.valueOf(json.getBoolean(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                    Object jSONArray = json.getJSONArray(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY);
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str = (String) jSONArray;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    Object jSONObject2 = json.getJSONObject(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY);
                    if (jSONObject2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str = (String) jSONObject2;
                } else {
                    Object obj = json.get(UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    str = (String) obj;
                }
            } else {
                str = null;
            }
            Uri parse = str != null ? Uri.parse(str) : null;
            if (json.has(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY)) {
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(JSONObject.class);
                if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                    Object string = json.getString(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string;
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    jSONObject = (JSONObject) Double.valueOf(json.getDouble(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    jSONObject = (JSONObject) Integer.valueOf(json.getInt(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    jSONObject = (JSONObject) Long.valueOf(json.getLong(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    jSONObject = (JSONObject) Boolean.valueOf(json.getBoolean(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY));
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                    Object jSONArray2 = json.getJSONArray(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY);
                    if (jSONArray2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray2;
                } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    jSONObject = json.getJSONObject(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY);
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj2 = json.get(UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY);
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj2;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && (map = JSONObjectExtensionKt.toMap(jSONObject)) != null) {
                linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            return new UpdatesConfigurationOverride(parse, linkedHashMap);
        }
    }
}
