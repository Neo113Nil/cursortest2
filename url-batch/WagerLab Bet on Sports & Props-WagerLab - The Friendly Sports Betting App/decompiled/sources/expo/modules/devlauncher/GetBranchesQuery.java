package expo.modules.devlauncher;

import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import expo.modules.devlauncher.adapter.GetBranchesQuery_ResponseAdapter;
import expo.modules.devlauncher.adapter.GetBranchesQuery_VariablesAdapter;
import expo.modules.devlauncher.selections.GetBranchesQuerySelections;
import expo.modules.devlauncher.type.AppPlatform;
import expo.modules.devlauncher.type.RootQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetBranchesQuery.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005,-./0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J1\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u00061"}, d2 = {"Lexpo/modules/devlauncher/GetBranchesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lexpo/modules/devlauncher/GetBranchesQuery$Data;", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "offset", "", "limit", "platform", "Lexpo/modules/devlauncher/type/AppPlatform;", "<init>", "(Ljava/lang/String;IILexpo/modules/devlauncher/type/AppPlatform;)V", "getAppId", "()Ljava/lang/String;", "getOffset", "()I", "getLimit", "getPlatform", "()Lexpo/modules/devlauncher/type/AppPlatform;", "id", "document", "name", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Data", "App", "ById", "UpdateBranch", "Companion", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GetBranchesQuery implements Query<Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String OPERATION_ID = "98ce022222807e926e31a412c57e96d6e46f1dd343be5bb7a82d6dec2efaf456";
    public static final String OPERATION_NAME = "getBranches";
    private final String appId;
    private final int limit;
    private final int offset;
    private final AppPlatform platform;

    public static /* synthetic */ GetBranchesQuery copy$default(GetBranchesQuery getBranchesQuery, String str, int i, int i2, AppPlatform appPlatform, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getBranchesQuery.appId;
        }
        if ((i3 & 2) != 0) {
            i = getBranchesQuery.offset;
        }
        if ((i3 & 4) != 0) {
            i2 = getBranchesQuery.limit;
        }
        if ((i3 & 8) != 0) {
            appPlatform = getBranchesQuery.platform;
        }
        return getBranchesQuery.copy(str, i, i2, appPlatform);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component4, reason: from getter */
    public final AppPlatform getPlatform() {
        return this.platform;
    }

    public final GetBranchesQuery copy(String appId, int offset, int limit, AppPlatform platform) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new GetBranchesQuery(appId, offset, limit, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetBranchesQuery)) {
            return false;
        }
        GetBranchesQuery getBranchesQuery = (GetBranchesQuery) other;
        return Intrinsics.areEqual(this.appId, getBranchesQuery.appId) && this.offset == getBranchesQuery.offset && this.limit == getBranchesQuery.limit && this.platform == getBranchesQuery.platform;
    }

    public int hashCode() {
        return (((((this.appId.hashCode() * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.limit)) * 31) + this.platform.hashCode();
    }

    public String toString() {
        return "GetBranchesQuery(appId=" + this.appId + ", offset=" + this.offset + ", limit=" + this.limit + ", platform=" + this.platform + ")";
    }

    public GetBranchesQuery(String appId, int i, int i2, AppPlatform platform) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.appId = appId;
        this.offset = i;
        this.limit = i2;
        this.platform = platform;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final AppPlatform getPlatform() {
        return this.platform;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(JsonWriter writer, CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        GetBranchesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public Adapter<Data> adapter() {
        return Adapters.m9319obj$default(GetBranchesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public CompiledField rootField() {
        return new CompiledField.Builder("data", RootQuery.INSTANCE.getType()).selections(GetBranchesQuerySelections.INSTANCE.get__root()).build();
    }

    /* compiled from: GetBranchesQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lexpo/modules/devlauncher/GetBranchesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "app", "Lexpo/modules/devlauncher/GetBranchesQuery$App;", "<init>", "(Lexpo/modules/devlauncher/GetBranchesQuery$App;)V", "getApp", "()Lexpo/modules/devlauncher/GetBranchesQuery$App;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;
        private final App app;

        public static /* synthetic */ Data copy$default(Data data, App app, int i, Object obj) {
            if ((i & 1) != 0) {
                app = data.app;
            }
            return data.copy(app);
        }

        /* renamed from: component1, reason: from getter */
        public final App getApp() {
            return this.app;
        }

        public final Data copy(App app) {
            Intrinsics.checkNotNullParameter(app, "app");
            return new Data(app);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.areEqual(this.app, ((Data) other).app);
        }

        public int hashCode() {
            return this.app.hashCode();
        }

        public String toString() {
            return "Data(app=" + this.app + ")";
        }

        public Data(App app) {
            Intrinsics.checkNotNullParameter(app, "app");
            this.app = app;
        }

        public final App getApp() {
            return this.app;
        }
    }

    /* compiled from: GetBranchesQuery.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/devlauncher/GetBranchesQuery$App;", "", "byId", "Lexpo/modules/devlauncher/GetBranchesQuery$ById;", "<init>", "(Lexpo/modules/devlauncher/GetBranchesQuery$ById;)V", "getById", "()Lexpo/modules/devlauncher/GetBranchesQuery$ById;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class App {
        public static final int $stable = 8;
        private final ById byId;

        public static /* synthetic */ App copy$default(App app, ById byId, int i, Object obj) {
            if ((i & 1) != 0) {
                byId = app.byId;
            }
            return app.copy(byId);
        }

        /* renamed from: component1, reason: from getter */
        public final ById getById() {
            return this.byId;
        }

        public final App copy(ById byId) {
            Intrinsics.checkNotNullParameter(byId, "byId");
            return new App(byId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof App) && Intrinsics.areEqual(this.byId, ((App) other).byId);
        }

        public int hashCode() {
            return this.byId.hashCode();
        }

        public String toString() {
            return "App(byId=" + this.byId + ")";
        }

        public App(ById byId) {
            Intrinsics.checkNotNullParameter(byId, "byId");
            this.byId = byId;
        }

        public final ById getById() {
            return this.byId;
        }
    }

    /* compiled from: GetBranchesQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lexpo/modules/devlauncher/GetBranchesQuery$ById;", "", "updateBranches", "", "Lexpo/modules/devlauncher/GetBranchesQuery$UpdateBranch;", "<init>", "(Ljava/util/List;)V", "getUpdateBranches", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ById {
        public static final int $stable = 8;
        private final List<UpdateBranch> updateBranches;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ById copy$default(ById byId, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = byId.updateBranches;
            }
            return byId.copy(list);
        }

        public final List<UpdateBranch> component1() {
            return this.updateBranches;
        }

        public final ById copy(List<UpdateBranch> updateBranches) {
            Intrinsics.checkNotNullParameter(updateBranches, "updateBranches");
            return new ById(updateBranches);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ById) && Intrinsics.areEqual(this.updateBranches, ((ById) other).updateBranches);
        }

        public int hashCode() {
            return this.updateBranches.hashCode();
        }

        public String toString() {
            return "ById(updateBranches=" + this.updateBranches + ")";
        }

        public ById(List<UpdateBranch> updateBranches) {
            Intrinsics.checkNotNullParameter(updateBranches, "updateBranches");
            this.updateBranches = updateBranches;
        }

        public final List<UpdateBranch> getUpdateBranches() {
            return this.updateBranches;
        }
    }

    /* compiled from: GetBranchesQuery.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lexpo/modules/devlauncher/GetBranchesQuery$UpdateBranch;", "", "id", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateBranch {
        public static final int $stable = 0;
        private final String id;
        private final String name;

        public static /* synthetic */ UpdateBranch copy$default(UpdateBranch updateBranch, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateBranch.id;
            }
            if ((i & 2) != 0) {
                str2 = updateBranch.name;
            }
            return updateBranch.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final UpdateBranch copy(String id, String name) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            return new UpdateBranch(id, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateBranch)) {
                return false;
            }
            UpdateBranch updateBranch = (UpdateBranch) other;
            return Intrinsics.areEqual(this.id, updateBranch.id) && Intrinsics.areEqual(this.name, updateBranch.name);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "UpdateBranch(id=" + this.id + ", name=" + this.name + ")";
        }

        public UpdateBranch(String id, String name) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = id;
            this.name = name;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* compiled from: GetBranchesQuery.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lexpo/modules/devlauncher/GetBranchesQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getOPERATION_DOCUMENT() {
            return "query getBranches($appId: String!, $offset: Int!, $limit: Int!, $platform: AppPlatform!) { app { byId(appId: $appId) { updateBranches(offset: $offset, limit: $limit) { id name } } } }";
        }
    }
}
