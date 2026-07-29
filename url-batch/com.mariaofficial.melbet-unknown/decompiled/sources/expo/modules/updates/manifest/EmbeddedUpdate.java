package expo.modules.updates.manifest;

import android.net.Uri;
import android.util.Log;
import com.caverock.androidsvg.SVGParser;
import expo.modules.manifests.core.EmbeddedManifest;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.db.enums.UpdateStatus;
import expo.modules.updates.loader.EmbeddedLoader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EmbeddedUpdate.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$BW\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\"X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"Lexpo/modules/updates/manifest/EmbeddedUpdate;", "Lexpo/modules/updates/manifest/Update;", "manifest", "Lexpo/modules/manifests/core/EmbeddedManifest;", "id", "Ljava/util/UUID;", UpdatesConfiguration.UPDATES_CONFIGURATION_SCOPE_KEY_KEY, "", "commitTime", "Ljava/util/Date;", UpdatesConfiguration.UPDATES_CONFIGURATION_RUNTIME_VERSION_KEY, "assets", "Lorg/json/JSONArray;", "url", "Landroid/net/Uri;", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "", "<init>", "(Lexpo/modules/manifests/core/EmbeddedManifest;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lorg/json/JSONArray;Landroid/net/Uri;Ljava/util/Map;)V", "getManifest", "()Lexpo/modules/manifests/core/EmbeddedManifest;", "updateEntity", "Lexpo/modules/updates/db/entity/UpdateEntity;", "getUpdateEntity", "()Lexpo/modules/updates/db/entity/UpdateEntity;", "updateEntity$delegate", "Lkotlin/Lazy;", "assetEntityList", "", "Lexpo/modules/updates/db/entity/AssetEntity;", "getAssetEntityList", "()Ljava/util/List;", "assetEntityList$delegate", "isDevelopmentMode", "", "()Z", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmbeddedUpdate implements Update {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "EmbeddedUpdate";

    /* renamed from: assetEntityList$delegate, reason: from kotlin metadata */
    private final Lazy assetEntityList;
    private final JSONArray assets;
    private final Date commitTime;
    private final UUID id;
    private final boolean isDevelopmentMode;
    private final EmbeddedManifest manifest;
    private final Map<String, String> requestHeaders;
    private final String runtimeVersion;
    private final String scopeKey;

    /* renamed from: updateEntity$delegate, reason: from kotlin metadata */
    private final Lazy updateEntity;
    private final Uri url;

    public /* synthetic */ EmbeddedUpdate(EmbeddedManifest embeddedManifest, UUID uuid, String str, Date date, String str2, JSONArray jSONArray, Uri uri, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(embeddedManifest, uuid, str, date, str2, jSONArray, uri, map);
    }

    private EmbeddedUpdate(EmbeddedManifest embeddedManifest, UUID uuid, String str, Date date, String str2, JSONArray jSONArray, Uri uri, Map<String, String> map) {
        this.manifest = embeddedManifest;
        this.id = uuid;
        this.scopeKey = str;
        this.commitTime = date;
        this.runtimeVersion = str2;
        this.assets = jSONArray;
        this.url = uri;
        this.requestHeaders = map;
        this.updateEntity = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.manifest.EmbeddedUpdate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UpdateEntity updateEntity_delegate$lambda$1;
                updateEntity_delegate$lambda$1 = EmbeddedUpdate.updateEntity_delegate$lambda$1(EmbeddedUpdate.this);
                return updateEntity_delegate$lambda$1;
            }
        });
        this.assetEntityList = LazyKt.lazy(new Function0() { // from class: expo.modules.updates.manifest.EmbeddedUpdate$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List assetEntityList_delegate$lambda$4;
                assetEntityList_delegate$lambda$4 = EmbeddedUpdate.assetEntityList_delegate$lambda$4(EmbeddedUpdate.this);
                return assetEntityList_delegate$lambda$4;
            }
        });
    }

    @Override // expo.modules.updates.manifest.Update
    public EmbeddedManifest getManifest() {
        return this.manifest;
    }

    @Override // expo.modules.updates.manifest.Update
    public UpdateEntity getUpdateEntity() {
        return (UpdateEntity) this.updateEntity.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateEntity updateEntity_delegate$lambda$1(EmbeddedUpdate embeddedUpdate) {
        UpdateEntity updateEntity = new UpdateEntity(embeddedUpdate.id, embeddedUpdate.commitTime, embeddedUpdate.runtimeVersion, embeddedUpdate.scopeKey, embeddedUpdate.getManifest().getRawJson(), embeddedUpdate.url, embeddedUpdate.requestHeaders);
        updateEntity.setStatus(UpdateStatus.EMBEDDED);
        return updateEntity;
    }

    @Override // expo.modules.updates.manifest.Update
    public List<AssetEntity> getAssetEntityList() {
        return (List) this.assetEntityList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List assetEntityList_delegate$lambda$4(EmbeddedUpdate embeddedUpdate) {
        String str;
        String str2;
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        AssetEntity assetEntity = new AssetEntity("bundle-" + embeddedUpdate.id, "js");
        assetEntity.setLaunchAsset(true);
        assetEntity.setEmbeddedAssetFilename(EmbeddedLoader.BARE_BUNDLE_FILENAME);
        arrayList.add(assetEntity);
        JSONArray jSONArray2 = embeddedUpdate.assets;
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            int length = embeddedUpdate.assets.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = embeddedUpdate.assets.getJSONObject(i);
                    AssetEntity assetEntity2 = new AssetEntity(jSONObject.getString("packagerHash"), jSONObject.getString(SVGParser.XML_STYLESHEET_ATTR_TYPE));
                    Intrinsics.checkNotNull(jSONObject);
                    JSONArray jSONArray3 = null;
                    if (jSONObject.has("resourcesFilename")) {
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                            str = jSONObject.getString("resourcesFilename");
                            if (str == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            str = (String) Double.valueOf(jSONObject.getDouble("resourcesFilename"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            str = (String) Integer.valueOf(jSONObject.getInt("resourcesFilename"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            str = (String) Long.valueOf(jSONObject.getLong("resourcesFilename"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            str = (String) Boolean.valueOf(jSONObject.getBoolean("resourcesFilename"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                            Object jSONArray4 = jSONObject.getJSONArray("resourcesFilename");
                            if (jSONArray4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str = (String) jSONArray4;
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                            Object jSONObject2 = jSONObject.getJSONObject("resourcesFilename");
                            if (jSONObject2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str = (String) jSONObject2;
                        } else {
                            Object obj = jSONObject.get("resourcesFilename");
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str = (String) obj;
                        }
                    } else {
                        str = null;
                    }
                    assetEntity2.setResourcesFilename(str);
                    if (jSONObject.has("resourcesFolder")) {
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(String.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                            str2 = jSONObject.getString("resourcesFolder");
                            if (str2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            str2 = (String) Double.valueOf(jSONObject.getDouble("resourcesFolder"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            str2 = (String) Integer.valueOf(jSONObject.getInt("resourcesFolder"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            str2 = (String) Long.valueOf(jSONObject.getLong("resourcesFolder"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            str2 = (String) Boolean.valueOf(jSONObject.getBoolean("resourcesFolder"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                            Object jSONArray5 = jSONObject.getJSONArray("resourcesFolder");
                            if (jSONArray5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str2 = (String) jSONArray5;
                        } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                            Object jSONObject3 = jSONObject.getJSONObject("resourcesFolder");
                            if (jSONObject3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str2 = (String) jSONObject3;
                        } else {
                            Object obj2 = jSONObject.get("resourcesFolder");
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            str2 = (String) obj2;
                        }
                    } else {
                        str2 = null;
                    }
                    assetEntity2.setResourcesFolder(str2);
                    if (jSONObject.has("scales")) {
                        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(JSONArray.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(String.class))) {
                            Object string = jSONObject.getString("scales");
                            if (string == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            jSONArray = (JSONArray) string;
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            jSONArray = (JSONArray) Double.valueOf(jSONObject.getDouble("scales"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            jSONArray = (JSONArray) Integer.valueOf(jSONObject.getInt("scales"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            jSONArray = (JSONArray) Long.valueOf(jSONObject.getLong("scales"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            jSONArray = (JSONArray) Boolean.valueOf(jSONObject.getBoolean("scales"));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                            jSONArray = jSONObject.getJSONArray("scales");
                            if (jSONArray == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                        } else if (Intrinsics.areEqual(orCreateKotlinClass3, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                            Object jSONObject4 = jSONObject.getJSONObject("scales");
                            if (jSONObject4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            jSONArray = (JSONArray) jSONObject4;
                        } else {
                            Object obj3 = jSONObject.get("scales");
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            jSONArray = (JSONArray) obj3;
                        }
                        jSONArray3 = jSONArray;
                    }
                    if (jSONArray3 != null && jSONArray3.length() > 1) {
                        assetEntity2.setScale(Float.valueOf((float) jSONObject.optDouble("scale")));
                        int length2 = jSONArray3.length();
                        Float[] fArr = new Float[length2];
                        for (int i2 = 0; i2 < length2; i2++) {
                            fArr[i2] = Float.valueOf(0.0f);
                        }
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            fArr[i3] = Float.valueOf((float) jSONArray3.getDouble(i3));
                        }
                        assetEntity2.setScales(fArr);
                    }
                    arrayList.add(assetEntity2);
                } catch (JSONException e) {
                    Log.e(TAG, "Could not read asset from manifest", e);
                }
            }
        }
        return arrayList;
    }

    @Override // expo.modules.updates.manifest.Update
    /* renamed from: isDevelopmentMode, reason: from getter */
    public boolean getIsDevelopmentMode() {
        return this.isDevelopmentMode;
    }

    /* compiled from: EmbeddedUpdate.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/updates/manifest/EmbeddedUpdate$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "fromEmbeddedManifest", "Lexpo/modules/updates/manifest/EmbeddedUpdate;", "manifest", "Lexpo/modules/manifests/core/EmbeddedManifest;", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EmbeddedUpdate fromEmbeddedManifest(EmbeddedManifest manifest, UpdatesConfiguration configuration) throws JSONException {
            Intrinsics.checkNotNullParameter(manifest, "manifest");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            UUID fromString = UUID.fromString(manifest.getID());
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
            return new EmbeddedUpdate(manifest, fromString, configuration.getScopeKey(), new Date(manifest.getCommitTimeLong()), configuration.getRuntimeVersion(), manifest.getAssets(), configuration.getOriginalEmbeddedUpdateUrl(), configuration.getOriginalEmbeddedRequestHeaders(), null);
        }
    }
}
