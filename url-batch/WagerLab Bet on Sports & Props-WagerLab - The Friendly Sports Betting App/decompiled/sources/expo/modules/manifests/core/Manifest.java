package expo.modules.manifests.core;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.amazon.a.a.o.b;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.manifests.core.PluginType;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Manifest.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010$\n\u0002\b\u0003\b&\u0018\u0000 =2\u00020\u0001:\u0001=B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0007J\b\u0010\t\u001a\u00020\nH\u0017J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH'J\b\u0010\f\u001a\u00020\nH&J\n\u0010\r\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000e\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\nH&J\u0006\u0010\u0010\u001a\u00020\nJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003J\n\u0010\u0012\u001a\u0004\u0018\u00010\nH&J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\n\u0010\u001b\u001a\u0004\u0018\u00010\nH&J\u0006\u0010\u001c\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\nJ\b\u0010\u001e\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u001f\u001a\u00020\u0018J\n\u0010 \u001a\u0004\u0018\u00010\nH&J\b\u0010!\u001a\u0004\u0018\u00010\nJ\b\u0010\"\u001a\u0004\u0018\u00010\nJ\b\u0010#\u001a\u0004\u0018\u00010\u0003J\b\u0010$\u001a\u0004\u0018\u00010\nJ\b\u0010%\u001a\u0004\u0018\u00010\nJ\b\u0010&\u001a\u0004\u0018\u00010\nJ\b\u0010'\u001a\u0004\u0018\u00010\nJ\b\u0010(\u001a\u0004\u0018\u00010\u0003J\b\u0010)\u001a\u0004\u0018\u00010\nJ\b\u0010*\u001a\u0004\u0018\u00010\u0003J\b\u00100\u001a\u0004\u0018\u00010\nJ\b\u00101\u001a\u0004\u0018\u00010\u0003J\b\u00102\u001a\u0004\u0018\u00010\u0003J\b\u00103\u001a\u0004\u0018\u00010\u0003J\b\u00104\u001a\u0004\u0018\u00010\nJ\b\u00105\u001a\u0004\u0018\u00010\nJ\u0006\u00106\u001a\u00020\u0018J\u0006\u00107\u001a\u00020\nJ\u0006\u00108\u001a\u00020\nJ\u0006\u00109\u001a\u00020\u0018J\u001c\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010;2\u0006\u0010<\u001a\u00020\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010+\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u0006>"}, d2 = {"Lexpo/modules/manifests/core/Manifest;", "", "json", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "getJson", "()Lorg/json/JSONObject;", "getRawJson", InAppPurchaseConstants.METHOD_TO_STRING, "", "getStableLegacyID", "getScopeKey", "getEASProjectID", "getLegacyID", "getBundleURL", "getRevisionId", "getMetadata", "getExpoGoSDKVersion", "getAssets", "Lorg/json/JSONArray;", "getExpoGoConfigRootObject", "getExpoClientConfigRootObject", "isDevelopmentMode", "", "isDevelopmentSilentLaunch", "isUsingDeveloperTool", "getSlug", "getDebuggerHost", "getMainModuleName", "getHostUri", "isVerified", "getAppKey", "getName", "getVersion", "getUpdatesInfo", "getPrimaryColor", "getOrientation", "getAndroidKeyboardLayoutMode", "getAndroidUserInterfaceStyle", "getAndroidStatusBarOptions", "getAndroidBackgroundColor", "getAndroidNavigationBarOptions", "jsEngine", "getJsEngine", "()Ljava/lang/String;", "jsEngine$delegate", "Lkotlin/Lazy;", "getIconUrl", "getNotificationPreferences", "getAndroidSplashInfo", "getRootSplashInfo", "getAndroidGoogleServicesFile", "getAndroidPackageName", "shouldUseNextNotificationsApi", "getFacebookAppId", "getFacebookApplicationName", "getFacebookAutoInitEnabled", "getPluginProperties", "", "packageName", "Companion", "expo-manifests_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class Manifest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: jsEngine$delegate, reason: from kotlin metadata */
    private final Lazy jsEngine;
    private final JSONObject json;

    @JvmStatic
    public static final Manifest fromManifestJson(JSONObject jSONObject) {
        return INSTANCE.fromManifestJson(jSONObject);
    }

    public abstract String getAppKey();

    public abstract JSONArray getAssets();

    public abstract String getBundleURL() throws JSONException;

    public abstract String getEASProjectID();

    public abstract JSONObject getExpoClientConfigRootObject();

    public abstract JSONObject getExpoGoConfigRootObject();

    public abstract String getExpoGoSDKVersion();

    public abstract String getScopeKey() throws JSONException;

    public abstract String getSlug();

    @Deprecated(message = "Prefer scopeKey or projectId depending on use case")
    public abstract String getStableLegacyID();

    public Manifest(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.json = json;
        this.jsEngine = LazyKt.lazy(new Function0() { // from class: expo.modules.manifests.core.Manifest$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String jsEngine_delegate$lambda$0;
                jsEngine_delegate$lambda$0 = Manifest.jsEngine_delegate$lambda$0(Manifest.this);
                return jsEngine_delegate$lambda$0;
            }
        });
    }

    protected final JSONObject getJson() {
        return this.json;
    }

    @Deprecated(message = "Prefer to use specific field getters")
    public final JSONObject getRawJson() {
        return this.json;
    }

    @Deprecated(message = "Prefer to use specific field getters")
    public String toString() {
        String jSONObject = getRawJson().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    @Deprecated(message = "Prefer scopeKey or projectId depending on use case")
    public final String getLegacyID() throws JSONException {
        JSONObject jSONObject = this.json;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = jSONObject.getString("id");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(jSONObject.getDouble("id"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObject.getInt("id"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(jSONObject.getLong("id"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("id"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = jSONObject.getJSONArray("id");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("id");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObject.get("id");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getRevisionId() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        Intrinsics.checkNotNull(expoClientConfigRootObject);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoClientConfigRootObject.getString("revisionId");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("revisionId"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("revisionId"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("revisionId"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("revisionId"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("revisionId");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("revisionId");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("revisionId");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject getMetadata() {
        JSONObject jSONObject = this.json;
        if (!jSONObject.has(TtmlNode.TAG_METADATA)) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            Object string = jSONObject.getString(TtmlNode.TAG_METADATA);
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObject.getDouble(TtmlNode.TAG_METADATA));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObject.getInt(TtmlNode.TAG_METADATA));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObject.getLong(TtmlNode.TAG_METADATA));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObject.getBoolean(TtmlNode.TAG_METADATA));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = jSONObject.getJSONArray(TtmlNode.TAG_METADATA);
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(TtmlNode.TAG_METADATA);
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObject.get(TtmlNode.TAG_METADATA);
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01b5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isDevelopmentMode() {
        JSONObject jSONObject;
        boolean z;
        Boolean bool;
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        if (expoGoConfigRootObject == null) {
            return false;
        }
        try {
            if (expoGoConfigRootObject.has("developer")) {
                Boolean bool2 = null;
                if (expoGoConfigRootObject.has("packagerOpts")) {
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                        Object string = expoGoConfigRootObject.getString("packagerOpts");
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject = (JSONObject) string;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                        jSONObject = (JSONObject) Double.valueOf(expoGoConfigRootObject.getDouble("packagerOpts"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        jSONObject = (JSONObject) Integer.valueOf(expoGoConfigRootObject.getInt("packagerOpts"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        jSONObject = (JSONObject) Long.valueOf(expoGoConfigRootObject.getLong("packagerOpts"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        jSONObject = (JSONObject) Boolean.valueOf(expoGoConfigRootObject.getBoolean("packagerOpts"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                        Object jSONArray = expoGoConfigRootObject.getJSONArray("packagerOpts");
                        if (jSONArray == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject = (JSONObject) jSONArray;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                        jSONObject = expoGoConfigRootObject.getJSONObject("packagerOpts");
                        if (jSONObject == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        Object obj = expoGoConfigRootObject.get("packagerOpts");
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject = (JSONObject) obj;
                    }
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    if (jSONObject.has("dev")) {
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Boolean.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                            Object string2 = jSONObject.getString("dev");
                            if (string2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            bool = (Boolean) string2;
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            bool = (Boolean) Double.valueOf(jSONObject.getDouble("dev"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            bool = (Boolean) Integer.valueOf(jSONObject.getInt("dev"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            bool = (Boolean) Long.valueOf(jSONObject.getLong("dev"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            bool = Boolean.valueOf(jSONObject.getBoolean("dev"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                            Object jSONArray2 = jSONObject.getJSONArray("dev");
                            if (jSONArray2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            bool = (Boolean) jSONArray2;
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                            Object jSONObject2 = jSONObject.getJSONObject("dev");
                            if (jSONObject2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            bool = (Boolean) jSONObject2;
                        } else {
                            Object obj2 = jSONObject.get("dev");
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            bool = (Boolean) obj2;
                        }
                        bool2 = bool;
                    }
                    if (bool2 != null) {
                        z = bool2.booleanValue();
                        if (!z) {
                            return true;
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public final boolean isDevelopmentSilentLaunch() {
        JSONObject jSONObject;
        Boolean bool;
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        if (expoGoConfigRootObject == null) {
            return false;
        }
        Boolean bool2 = null;
        if (expoGoConfigRootObject.has("developmentClient")) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = expoGoConfigRootObject.getString("developmentClient");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoGoConfigRootObject.getDouble("developmentClient"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoGoConfigRootObject.getInt("developmentClient"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoGoConfigRootObject.getLong("developmentClient"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoGoConfigRootObject.getBoolean("developmentClient"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = expoGoConfigRootObject.getJSONArray("developmentClient");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = expoGoConfigRootObject.getJSONObject("developmentClient");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoGoConfigRootObject.get("developmentClient");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            if (jSONObject.has("silentLaunch")) {
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Boolean.class);
                if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                    if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                        if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                    if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                                        if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                                            Object obj2 = jSONObject.get("silentLaunch");
                                            if (obj2 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                            }
                                            bool = (Boolean) obj2;
                                        } else {
                                            Object jSONObject2 = jSONObject.getJSONObject("silentLaunch");
                                            if (jSONObject2 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                            }
                                            bool = (Boolean) jSONObject2;
                                        }
                                    } else {
                                        Object jSONArray2 = jSONObject.getJSONArray("silentLaunch");
                                        if (jSONArray2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                        }
                                        bool = (Boolean) jSONArray2;
                                    }
                                } else {
                                    bool = Boolean.valueOf(jSONObject.getBoolean("silentLaunch"));
                                }
                            } else {
                                bool = (Boolean) Long.valueOf(jSONObject.getLong("silentLaunch"));
                            }
                        } else {
                            bool = (Boolean) Integer.valueOf(jSONObject.getInt("silentLaunch"));
                        }
                    } else {
                        bool = (Boolean) Double.valueOf(jSONObject.getDouble("silentLaunch"));
                    }
                } else {
                    Object string2 = jSONObject.getString("silentLaunch");
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    bool = (Boolean) string2;
                }
                bool2 = bool;
            }
            if (bool2 != null) {
                return bool2.booleanValue();
            }
        }
        return false;
    }

    public final boolean isUsingDeveloperTool() {
        JSONObject jSONObject;
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        if (expoGoConfigRootObject == null) {
            return false;
        }
        if (expoGoConfigRootObject.has("developer")) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = expoGoConfigRootObject.getString("developer");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoGoConfigRootObject.getDouble("developer"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoGoConfigRootObject.getInt("developer"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoGoConfigRootObject.getLong("developer"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoGoConfigRootObject.getBoolean("developer"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = expoGoConfigRootObject.getJSONArray("developer");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = expoGoConfigRootObject.getJSONObject("developer");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoGoConfigRootObject.get("developer");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.has("tool");
        }
        return false;
    }

    public final String getDebuggerHost() {
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        Intrinsics.checkNotNull(expoGoConfigRootObject);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoGoConfigRootObject.getString("debuggerHost");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoGoConfigRootObject.getDouble("debuggerHost"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoGoConfigRootObject.getInt("debuggerHost"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoGoConfigRootObject.getLong("debuggerHost"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoGoConfigRootObject.getBoolean("debuggerHost"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoGoConfigRootObject.getJSONArray("debuggerHost");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoGoConfigRootObject.getJSONObject("debuggerHost");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoGoConfigRootObject.get("debuggerHost");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getMainModuleName() {
        String str;
        JSONObject expoGoConfigRootObject = getExpoGoConfigRootObject();
        if (expoGoConfigRootObject == null) {
            return "main";
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            str = expoGoConfigRootObject.getString("mainModuleName");
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            str = (String) Double.valueOf(expoGoConfigRootObject.getDouble("mainModuleName"));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            str = (String) Integer.valueOf(expoGoConfigRootObject.getInt("mainModuleName"));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            str = (String) Long.valueOf(expoGoConfigRootObject.getLong("mainModuleName"));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            str = (String) Boolean.valueOf(expoGoConfigRootObject.getBoolean("mainModuleName"));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoGoConfigRootObject.getJSONArray("mainModuleName");
            if (jSONArray == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str = (String) jSONArray;
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoGoConfigRootObject.getJSONObject("mainModuleName");
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str = (String) jSONObject;
        } else {
            Object obj = expoGoConfigRootObject.get("mainModuleName");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str = (String) obj;
        }
        return str == null ? "main" : str;
    }

    public final String getHostUri() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("hostUri")) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoClientConfigRootObject.getString("hostUri");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("hostUri"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("hostUri"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("hostUri"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("hostUri"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("hostUri");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("hostUri");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("hostUri");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final boolean isVerified() {
        Boolean bool;
        JSONObject jSONObject = this.json;
        if (jSONObject.has("isVerified")) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = jSONObject.getString("isVerified");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                bool = (Boolean) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                bool = (Boolean) Double.valueOf(jSONObject.getDouble("isVerified"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                bool = (Boolean) Integer.valueOf(jSONObject.getInt("isVerified"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                bool = (Boolean) Long.valueOf(jSONObject.getLong("isVerified"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                bool = Boolean.valueOf(jSONObject.getBoolean("isVerified"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = jSONObject.getJSONArray("isVerified");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                bool = (Boolean) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("isVerified");
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                bool = (Boolean) jSONObject2;
            } else {
                Object obj = jSONObject.get("isVerified");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                bool = (Boolean) obj;
            }
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String getName() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("name")) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoClientConfigRootObject.getString("name");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("name"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("name"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("name"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("name"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("name");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("name");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("name");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getVersion() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("version")) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoClientConfigRootObject.getString("version");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("version"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("version"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("version"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("version"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("version");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("version");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("version");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject getUpdatesInfo() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("updates")) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            Object string = expoClientConfigRootObject.getString("updates");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("updates"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("updates"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("updates"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("updates"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("updates");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            JSONObject jSONObject = expoClientConfigRootObject.getJSONObject("updates");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = expoClientConfigRootObject.get("updates");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String getPrimaryColor() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("primaryColor")) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoClientConfigRootObject.getString("primaryColor");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("primaryColor"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("primaryColor"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("primaryColor"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("primaryColor"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("primaryColor");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("primaryColor");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("primaryColor");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getOrientation() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("orientation")) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoClientConfigRootObject.getString("orientation");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("orientation"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("orientation"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("orientation"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("orientation"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("orientation");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("orientation");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("orientation");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getAndroidKeyboardLayoutMode() {
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        if (expoClientConfigRootObject.has("android")) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("softwareKeyboardLayoutMode")) {
            return null;
        }
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
            String string2 = jSONObject.getString("softwareKeyboardLayoutMode");
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(jSONObject.getDouble("softwareKeyboardLayoutMode"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObject.getInt("softwareKeyboardLayoutMode"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(jSONObject.getLong("softwareKeyboardLayoutMode"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("softwareKeyboardLayoutMode"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("softwareKeyboardLayoutMode");
            if (jSONArray2 != null) {
                return (String) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("softwareKeyboardLayoutMode");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj2 = jSONObject.get("softwareKeyboardLayoutMode");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getAndroidUserInterfaceStyle() {
        String str;
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        try {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                String string2 = jSONObject.getString("userInterfaceStyle");
                if (string2 != null) {
                    return string2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                return (String) Double.valueOf(jSONObject.getDouble("userInterfaceStyle"));
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                return (String) Integer.valueOf(jSONObject.getInt("userInterfaceStyle"));
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                return (String) Long.valueOf(jSONObject.getLong("userInterfaceStyle"));
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                return (String) Boolean.valueOf(jSONObject.getBoolean("userInterfaceStyle"));
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray("userInterfaceStyle");
                if (jSONArray2 != null) {
                    return (String) jSONArray2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("userInterfaceStyle");
                if (jSONObject2 != null) {
                    return (String) jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            Object obj2 = jSONObject.get("userInterfaceStyle");
            if (obj2 != null) {
                return (String) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (JSONException unused) {
            if (!expoClientConfigRootObject.has("userInterfaceStyle")) {
                return null;
            }
            KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(String.class);
            if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(String.class))) {
                str = expoClientConfigRootObject.getString("userInterfaceStyle");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                str = (String) Double.valueOf(expoClientConfigRootObject.getDouble("userInterfaceStyle"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                str = (String) Integer.valueOf(expoClientConfigRootObject.getInt("userInterfaceStyle"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                str = (String) Long.valueOf(expoClientConfigRootObject.getLong("userInterfaceStyle"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                str = (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("userInterfaceStyle"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray3 = expoClientConfigRootObject.getJSONArray("userInterfaceStyle");
                if (jSONArray3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) jSONArray3;
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                Object jSONObject3 = expoClientConfigRootObject.getJSONObject("userInterfaceStyle");
                if (jSONObject3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) jSONObject3;
            } else {
                Object obj3 = expoClientConfigRootObject.get("userInterfaceStyle");
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) obj3;
            }
            return str;
        }
    }

    public final JSONObject getAndroidStatusBarOptions() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("androidStatusBar")) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            Object string = expoClientConfigRootObject.getString("androidStatusBar");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("androidStatusBar"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("androidStatusBar"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("androidStatusBar"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("androidStatusBar"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("androidStatusBar");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            JSONObject jSONObject = expoClientConfigRootObject.getJSONObject("androidStatusBar");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = expoClientConfigRootObject.get("androidStatusBar");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String getAndroidBackgroundColor() {
        String str;
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        try {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                String string2 = jSONObject.getString("backgroundColor");
                if (string2 != null) {
                    return string2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                return (String) Double.valueOf(jSONObject.getDouble("backgroundColor"));
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                return (String) Integer.valueOf(jSONObject.getInt("backgroundColor"));
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                return (String) Long.valueOf(jSONObject.getLong("backgroundColor"));
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                return (String) Boolean.valueOf(jSONObject.getBoolean("backgroundColor"));
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray("backgroundColor");
                if (jSONArray2 != null) {
                    return (String) jSONArray2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("backgroundColor");
                if (jSONObject2 != null) {
                    return (String) jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            Object obj2 = jSONObject.get("backgroundColor");
            if (obj2 != null) {
                return (String) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (JSONException unused) {
            if (!expoClientConfigRootObject.has("backgroundColor")) {
                return null;
            }
            KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(String.class);
            if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(String.class))) {
                str = expoClientConfigRootObject.getString("backgroundColor");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                str = (String) Double.valueOf(expoClientConfigRootObject.getDouble("backgroundColor"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                str = (String) Integer.valueOf(expoClientConfigRootObject.getInt("backgroundColor"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                str = (String) Long.valueOf(expoClientConfigRootObject.getLong("backgroundColor"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                str = (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("backgroundColor"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray3 = expoClientConfigRootObject.getJSONArray("backgroundColor");
                if (jSONArray3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) jSONArray3;
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                Object jSONObject3 = expoClientConfigRootObject.getJSONObject("backgroundColor");
                if (jSONObject3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) jSONObject3;
            } else {
                Object obj3 = expoClientConfigRootObject.get("backgroundColor");
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str = (String) obj3;
            }
            return str;
        }
    }

    public final JSONObject getAndroidNavigationBarOptions() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("androidNavigationBar")) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            Object string = expoClientConfigRootObject.getString("androidNavigationBar");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("androidNavigationBar"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("androidNavigationBar"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("androidNavigationBar"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("androidNavigationBar"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("androidNavigationBar");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            JSONObject jSONObject = expoClientConfigRootObject.getJSONObject("androidNavigationBar");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = expoClientConfigRootObject.get("androidNavigationBar");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String getJsEngine() {
        return (String) this.jsEngine.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0199, code lost:
    
        if (r4 != null) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String jsEngine_delegate$lambda$0(Manifest manifest) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = manifest.getExpoClientConfigRootObject();
        if (expoClientConfigRootObject != null) {
            if (expoClientConfigRootObject.has("android")) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    Object string = expoClientConfigRootObject.getString("android");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                    Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    jSONObject = expoClientConfigRootObject.getJSONObject("android");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj = expoClientConfigRootObject.get("android");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                if (jSONObject.has("jsEngine")) {
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
                    if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                        str = jSONObject.getString("jsEngine");
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                        str = (String) Double.valueOf(jSONObject.getDouble("jsEngine"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                        str = (String) Integer.valueOf(jSONObject.getInt("jsEngine"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        str = (String) Long.valueOf(jSONObject.getLong("jsEngine"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                        str = (String) Boolean.valueOf(jSONObject.getBoolean("jsEngine"));
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                        Object jSONArray2 = jSONObject.getJSONArray("jsEngine");
                        if (jSONArray2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str = (String) jSONArray2;
                    } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                        Object jSONObject2 = jSONObject.getJSONObject("jsEngine");
                        if (jSONObject2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str = (String) jSONObject2;
                    } else {
                        Object obj2 = jSONObject.get("jsEngine");
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str = (String) obj2;
                    }
                } else {
                    str = null;
                }
            }
        }
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("jsEngine")) {
            str = null;
        } else {
            KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(String.class);
            if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(String.class))) {
                str2 = expoClientConfigRootObject.getString("jsEngine");
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                str2 = (String) Double.valueOf(expoClientConfigRootObject.getDouble("jsEngine"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                str2 = (String) Integer.valueOf(expoClientConfigRootObject.getInt("jsEngine"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                str2 = (String) Long.valueOf(expoClientConfigRootObject.getLong("jsEngine"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                str2 = (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("jsEngine"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray3 = expoClientConfigRootObject.getJSONArray("jsEngine");
                if (jSONArray3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str2 = (String) jSONArray3;
            } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                Object jSONObject3 = expoClientConfigRootObject.getJSONObject("jsEngine");
                if (jSONObject3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str2 = (String) jSONObject3;
            } else {
                Object obj3 = expoClientConfigRootObject.get("jsEngine");
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                str2 = (String) obj3;
            }
            str = str2;
        }
        if (str != null) {
            return str;
        }
        String expoGoSDKVersion = manifest.getExpoGoSDKVersion();
        List split$default = expoGoSDKVersion != null ? StringsKt.split$default((CharSequence) expoGoSDKVersion, new String[]{"."}, false, 0, 6, (Object) null) : null;
        Integer intOrNull = (split$default == null || split$default.size() != 3) ? 0 : StringsKt.toIntOrNull((String) split$default.get(0));
        return (intOrNull == null || !new IntRange(1, 47).contains(intOrNull.intValue())) ? "hermes" : "jsc";
    }

    public final String getIconUrl() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has(b.j)) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoClientConfigRootObject.getString(b.j);
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble(b.j));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt(b.j));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong(b.j));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean(b.j));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray(b.j);
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject(b.j);
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get(b.j);
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject getNotificationPreferences() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has(NotificationsService.NOTIFICATION_KEY)) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            Object string = expoClientConfigRootObject.getString(NotificationsService.NOTIFICATION_KEY);
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble(NotificationsService.NOTIFICATION_KEY));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt(NotificationsService.NOTIFICATION_KEY));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong(NotificationsService.NOTIFICATION_KEY));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean(NotificationsService.NOTIFICATION_KEY));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray(NotificationsService.NOTIFICATION_KEY);
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            JSONObject jSONObject = expoClientConfigRootObject.getJSONObject(NotificationsService.NOTIFICATION_KEY);
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = expoClientConfigRootObject.get(NotificationsService.NOTIFICATION_KEY);
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final JSONObject getAndroidSplashInfo() {
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        if (expoClientConfigRootObject.has("android")) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("splash")) {
            return null;
        }
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(JSONObject.class);
        if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
            if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                        if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                                if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                                    Object obj2 = jSONObject.get("splash");
                                    if (obj2 != null) {
                                        return (JSONObject) obj2;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                }
                                JSONObject jSONObject2 = jSONObject.getJSONObject("splash");
                                if (jSONObject2 != null) {
                                    return jSONObject2;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                            }
                            Object jSONArray2 = jSONObject.getJSONArray("splash");
                            if (jSONArray2 != null) {
                                return (JSONObject) jSONArray2;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        return (JSONObject) Boolean.valueOf(jSONObject.getBoolean("splash"));
                    }
                    return (JSONObject) Long.valueOf(jSONObject.getLong("splash"));
                }
                return (JSONObject) Integer.valueOf(jSONObject.getInt("splash"));
            }
            return (JSONObject) Double.valueOf(jSONObject.getDouble("splash"));
        }
        Object string2 = jSONObject.getString("splash");
        if (string2 != null) {
            return (JSONObject) string2;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final JSONObject getRootSplashInfo() {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null || !expoClientConfigRootObject.has("splash")) {
            return null;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            Object string = expoClientConfigRootObject.getString("splash");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("splash"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("splash"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("splash"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("splash"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("splash");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            JSONObject jSONObject = expoClientConfigRootObject.getJSONObject("splash");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = expoClientConfigRootObject.get("splash");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String getAndroidGoogleServicesFile() {
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        if (expoClientConfigRootObject.has("android")) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("googleServicesFile")) {
            return null;
        }
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
            String string2 = jSONObject.getString("googleServicesFile");
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(jSONObject.getDouble("googleServicesFile"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObject.getInt("googleServicesFile"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(jSONObject.getLong("googleServicesFile"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("googleServicesFile"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("googleServicesFile");
            if (jSONArray2 != null) {
                return (String) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("googleServicesFile");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj2 = jSONObject.get("googleServicesFile");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getAndroidPackageName() {
        JSONObject jSONObject;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return null;
        }
        if (expoClientConfigRootObject.has("android")) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("packageName")) {
            return null;
        }
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
            String string2 = jSONObject.getString("packageName");
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(jSONObject.getDouble("packageName"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObject.getInt("packageName"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(jSONObject.getLong("packageName"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("packageName"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("packageName");
            if (jSONArray2 != null) {
                return (String) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("packageName");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj2 = jSONObject.get("packageName");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final boolean shouldUseNextNotificationsApi() {
        JSONObject jSONObject;
        Boolean bool;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject == null) {
            return false;
        }
        Boolean bool2 = null;
        if (expoClientConfigRootObject.has("android")) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONObject.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string = expoClientConfigRootObject.getString("android");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                jSONObject = (JSONObject) Double.valueOf(expoClientConfigRootObject.getDouble("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                jSONObject = (JSONObject) Integer.valueOf(expoClientConfigRootObject.getInt("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                jSONObject = (JSONObject) Long.valueOf(expoClientConfigRootObject.getLong("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                jSONObject = (JSONObject) Boolean.valueOf(expoClientConfigRootObject.getBoolean("android"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray = expoClientConfigRootObject.getJSONArray("android");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                jSONObject = expoClientConfigRootObject.getJSONObject("android");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = expoClientConfigRootObject.get("android");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("useNextNotificationsApi")) {
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Boolean.class);
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                Object string2 = jSONObject.getString("useNextNotificationsApi");
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                bool = (Boolean) string2;
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                bool = (Boolean) Double.valueOf(jSONObject.getDouble("useNextNotificationsApi"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                bool = (Boolean) Integer.valueOf(jSONObject.getInt("useNextNotificationsApi"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                bool = (Boolean) Long.valueOf(jSONObject.getLong("useNextNotificationsApi"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                bool = Boolean.valueOf(jSONObject.getBoolean("useNextNotificationsApi"));
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray("useNextNotificationsApi");
                if (jSONArray2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                bool = (Boolean) jSONArray2;
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("useNextNotificationsApi");
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                bool = (Boolean) jSONObject2;
            } else {
                Object obj2 = jSONObject.get("useNextNotificationsApi");
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                bool = (Boolean) obj2;
            }
            bool2 = bool;
        }
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public final String getFacebookAppId() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        Intrinsics.checkNotNull(expoClientConfigRootObject);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoClientConfigRootObject.getString("facebookAppId");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("facebookAppId"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("facebookAppId"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("facebookAppId"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("facebookAppId"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("facebookAppId");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("facebookAppId");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("facebookAppId");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String getFacebookApplicationName() throws JSONException {
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        Intrinsics.checkNotNull(expoClientConfigRootObject);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            String string = expoClientConfigRootObject.getString("facebookDisplayName");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return (String) Double.valueOf(expoClientConfigRootObject.getDouble("facebookDisplayName"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            return (String) Integer.valueOf(expoClientConfigRootObject.getInt("facebookDisplayName"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            return (String) Long.valueOf(expoClientConfigRootObject.getLong("facebookDisplayName"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            return (String) Boolean.valueOf(expoClientConfigRootObject.getBoolean("facebookDisplayName"));
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("facebookDisplayName");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("facebookDisplayName");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = expoClientConfigRootObject.get("facebookDisplayName");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final boolean getFacebookAutoInitEnabled() throws JSONException {
        Boolean bool;
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        Intrinsics.checkNotNull(expoClientConfigRootObject);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            Object string = expoClientConfigRootObject.getString("facebookAutoInitEnabled");
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool = (Boolean) string;
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            bool = (Boolean) Double.valueOf(expoClientConfigRootObject.getDouble("facebookAutoInitEnabled"));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
            bool = (Boolean) Integer.valueOf(expoClientConfigRootObject.getInt("facebookAutoInitEnabled"));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
            bool = (Boolean) Long.valueOf(expoClientConfigRootObject.getLong("facebookAutoInitEnabled"));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
            bool = Boolean.valueOf(expoClientConfigRootObject.getBoolean("facebookAutoInitEnabled"));
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
            Object jSONArray = expoClientConfigRootObject.getJSONArray("facebookAutoInitEnabled");
            if (jSONArray == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool = (Boolean) jSONArray;
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
            Object jSONObject = expoClientConfigRootObject.getJSONObject("facebookAutoInitEnabled");
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool = (Boolean) jSONObject;
        } else {
            Object obj = expoClientConfigRootObject.get("facebookAutoInitEnabled");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool = (Boolean) obj;
        }
        return bool.booleanValue();
    }

    public final Map<String, Object> getPluginProperties(String packageName) throws JSONException, IllegalArgumentException {
        JSONArray jSONArray;
        Object obj;
        Pair<String, Map<String, Object>> plugin;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        JSONObject expoClientConfigRootObject = getExpoClientConfigRootObject();
        if (expoClientConfigRootObject != null) {
            if (expoClientConfigRootObject.has("plugins")) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(JSONArray.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    Object string = expoClientConfigRootObject.getString("plugins");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    }
                    jSONArray = (JSONArray) string;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    jSONArray = (JSONArray) Double.valueOf(expoClientConfigRootObject.getDouble("plugins"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    jSONArray = (JSONArray) Integer.valueOf(expoClientConfigRootObject.getInt("plugins"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    jSONArray = (JSONArray) Long.valueOf(expoClientConfigRootObject.getLong("plugins"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    jSONArray = (JSONArray) Boolean.valueOf(expoClientConfigRootObject.getBoolean("plugins"));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                    jSONArray = expoClientConfigRootObject.getJSONArray("plugins");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    }
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    Object jSONObject = expoClientConfigRootObject.getJSONObject("plugins");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    }
                    jSONArray = (JSONArray) jSONObject;
                } else {
                    Object obj2 = expoClientConfigRootObject.get("plugins");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                    }
                    jSONArray = (JSONArray) obj2;
                }
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                List<PluginType> fromRawArrayValue = PluginType.INSTANCE.fromRawArrayValue(jSONArray);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : fromRawArrayValue) {
                    if (obj3 instanceof PluginType.WithProps) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((PluginType.WithProps) obj).getPlugin().getFirst(), packageName)) {
                        break;
                    }
                }
                PluginType.WithProps withProps = (PluginType.WithProps) obj;
                if (withProps == null || (plugin = withProps.getPlugin()) == null) {
                    return null;
                }
                return plugin.getSecond();
            }
        }
        return null;
    }

    /* compiled from: Manifest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/manifests/core/Manifest$Companion;", "", "<init>", "()V", "fromManifestJson", "Lexpo/modules/manifests/core/Manifest;", "manifestJson", "Lorg/json/JSONObject;", "expo-manifests_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Manifest fromManifestJson(JSONObject manifestJson) {
            Intrinsics.checkNotNullParameter(manifestJson, "manifestJson");
            if (manifestJson.has("releaseId")) {
                throw new Exception("Legacy manifests are no longer supported");
            }
            if (manifestJson.has(TtmlNode.TAG_METADATA)) {
                return new ExpoUpdatesManifest(manifestJson);
            }
            return new EmbeddedManifest(manifestJson);
        }
    }
}
