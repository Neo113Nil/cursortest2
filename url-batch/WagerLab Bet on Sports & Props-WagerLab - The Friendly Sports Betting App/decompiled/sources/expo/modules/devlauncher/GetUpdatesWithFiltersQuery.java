package expo.modules.devlauncher;

import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import expo.modules.devlauncher.adapter.GetUpdatesWithFiltersQuery_ResponseAdapter;
import expo.modules.devlauncher.adapter.GetUpdatesWithFiltersQuery_VariablesAdapter;
import expo.modules.devlauncher.selections.GetUpdatesWithFiltersQuerySelections;
import expo.modules.devlauncher.type.AppPlatform;
import expo.modules.devlauncher.type.RootQuery;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetUpdatesWithFiltersQuery.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006/01234B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J;\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010*\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0007HÖ\u0001J\t\u0010.\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00065"}, d2 = {"Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery;", "Lcom/apollographql/apollo/api/Query;", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$Data;", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "branchName", "offset", "", "limit", "platform", "Lexpo/modules/devlauncher/type/AppPlatform;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILexpo/modules/devlauncher/type/AppPlatform;)V", "getAppId", "()Ljava/lang/String;", "getBranchName", "getOffset", "()I", "getLimit", "getPlatform", "()Lexpo/modules/devlauncher/type/AppPlatform;", "id", "document", "name", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Data", "App", "ById", "UpdateBranchByName", "Update", "Companion", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GetUpdatesWithFiltersQuery implements Query<Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String OPERATION_ID = "765d77a010ca8a4545d1149b5fb1b7131387a02c1eefcf68112754e3ab913724";
    public static final String OPERATION_NAME = "getUpdatesWithFilters";
    private final String appId;
    private final String branchName;
    private final int limit;
    private final int offset;
    private final AppPlatform platform;

    public static /* synthetic */ GetUpdatesWithFiltersQuery copy$default(GetUpdatesWithFiltersQuery getUpdatesWithFiltersQuery, String str, String str2, int i, int i2, AppPlatform appPlatform, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getUpdatesWithFiltersQuery.appId;
        }
        if ((i3 & 2) != 0) {
            str2 = getUpdatesWithFiltersQuery.branchName;
        }
        if ((i3 & 4) != 0) {
            i = getUpdatesWithFiltersQuery.offset;
        }
        if ((i3 & 8) != 0) {
            i2 = getUpdatesWithFiltersQuery.limit;
        }
        if ((i3 & 16) != 0) {
            appPlatform = getUpdatesWithFiltersQuery.platform;
        }
        AppPlatform appPlatform2 = appPlatform;
        int i4 = i;
        return getUpdatesWithFiltersQuery.copy(str, str2, i4, i2, appPlatform2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBranchName() {
        return this.branchName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component5, reason: from getter */
    public final AppPlatform getPlatform() {
        return this.platform;
    }

    public final GetUpdatesWithFiltersQuery copy(String appId, String branchName, int offset, int limit, AppPlatform platform) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(branchName, "branchName");
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new GetUpdatesWithFiltersQuery(appId, branchName, offset, limit, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetUpdatesWithFiltersQuery)) {
            return false;
        }
        GetUpdatesWithFiltersQuery getUpdatesWithFiltersQuery = (GetUpdatesWithFiltersQuery) other;
        return Intrinsics.areEqual(this.appId, getUpdatesWithFiltersQuery.appId) && Intrinsics.areEqual(this.branchName, getUpdatesWithFiltersQuery.branchName) && this.offset == getUpdatesWithFiltersQuery.offset && this.limit == getUpdatesWithFiltersQuery.limit && this.platform == getUpdatesWithFiltersQuery.platform;
    }

    public int hashCode() {
        return (((((((this.appId.hashCode() * 31) + this.branchName.hashCode()) * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.limit)) * 31) + this.platform.hashCode();
    }

    public String toString() {
        return "GetUpdatesWithFiltersQuery(appId=" + this.appId + ", branchName=" + this.branchName + ", offset=" + this.offset + ", limit=" + this.limit + ", platform=" + this.platform + ")";
    }

    public GetUpdatesWithFiltersQuery(String appId, String branchName, int i, int i2, AppPlatform platform) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(branchName, "branchName");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.appId = appId;
        this.branchName = branchName;
        this.offset = i;
        this.limit = i2;
        this.platform = platform;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBranchName() {
        return this.branchName;
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
        GetUpdatesWithFiltersQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public Adapter<Data> adapter() {
        return Adapters.m9319obj$default(GetUpdatesWithFiltersQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public CompiledField rootField() {
        return new CompiledField.Builder("data", RootQuery.INSTANCE.getType()).selections(GetUpdatesWithFiltersQuerySelections.INSTANCE.get__root()).build();
    }

    /* compiled from: GetUpdatesWithFiltersQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "app", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$App;", "<init>", "(Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$App;)V", "getApp", "()Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$App;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    /* compiled from: GetUpdatesWithFiltersQuery.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$App;", "", "byId", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$ById;", "<init>", "(Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$ById;)V", "getById", "()Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$ById;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    /* compiled from: GetUpdatesWithFiltersQuery.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$ById;", "", "updateBranchByName", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$UpdateBranchByName;", "<init>", "(Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$UpdateBranchByName;)V", "getUpdateBranchByName", "()Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$UpdateBranchByName;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ById {
        public static final int $stable = 8;
        private final UpdateBranchByName updateBranchByName;

        public static /* synthetic */ ById copy$default(ById byId, UpdateBranchByName updateBranchByName, int i, Object obj) {
            if ((i & 1) != 0) {
                updateBranchByName = byId.updateBranchByName;
            }
            return byId.copy(updateBranchByName);
        }

        /* renamed from: component1, reason: from getter */
        public final UpdateBranchByName getUpdateBranchByName() {
            return this.updateBranchByName;
        }

        public final ById copy(UpdateBranchByName updateBranchByName) {
            return new ById(updateBranchByName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ById) && Intrinsics.areEqual(this.updateBranchByName, ((ById) other).updateBranchByName);
        }

        public int hashCode() {
            UpdateBranchByName updateBranchByName = this.updateBranchByName;
            if (updateBranchByName == null) {
                return 0;
            }
            return updateBranchByName.hashCode();
        }

        public String toString() {
            return "ById(updateBranchByName=" + this.updateBranchByName + ")";
        }

        public ById(UpdateBranchByName updateBranchByName) {
            this.updateBranchByName = updateBranchByName;
        }

        public final UpdateBranchByName getUpdateBranchByName() {
            return this.updateBranchByName;
        }
    }

    /* compiled from: GetUpdatesWithFiltersQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$UpdateBranchByName;", "", "updates", "", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$Update;", "<init>", "(Ljava/util/List;)V", "getUpdates", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateBranchByName {
        public static final int $stable = 8;
        private final List<Update> updates;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdateBranchByName copy$default(UpdateBranchByName updateBranchByName, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = updateBranchByName.updates;
            }
            return updateBranchByName.copy(list);
        }

        public final List<Update> component1() {
            return this.updates;
        }

        public final UpdateBranchByName copy(List<Update> updates) {
            Intrinsics.checkNotNullParameter(updates, "updates");
            return new UpdateBranchByName(updates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateBranchByName) && Intrinsics.areEqual(this.updates, ((UpdateBranchByName) other).updates);
        }

        public int hashCode() {
            return this.updates.hashCode();
        }

        public String toString() {
            return "UpdateBranchByName(updates=" + this.updates + ")";
        }

        public UpdateBranchByName(List<Update> updates) {
            Intrinsics.checkNotNullParameter(updates, "updates");
            this.updates = updates;
        }

        public final List<Update> getUpdates() {
            return this.updates;
        }
    }

    /* compiled from: GetUpdatesWithFiltersQuery.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001f"}, d2 = {"Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$Update;", "", "id", "", "message", "runtimeVersion", "createdAt", "manifestPermalink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMessage", "getRuntimeVersion$annotations", "()V", "getRuntimeVersion", "getCreatedAt", "()Ljava/lang/Object;", "getManifestPermalink", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Update {
        public static final int $stable = 8;
        private final Object createdAt;
        private final String id;
        private final String manifestPermalink;
        private final String message;
        private final String runtimeVersion;

        public static /* synthetic */ Update copy$default(Update update, String str, String str2, String str3, Object obj, String str4, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = update.id;
            }
            if ((i & 2) != 0) {
                str2 = update.message;
            }
            if ((i & 4) != 0) {
                str3 = update.runtimeVersion;
            }
            if ((i & 8) != 0) {
                obj = update.createdAt;
            }
            if ((i & 16) != 0) {
                str4 = update.manifestPermalink;
            }
            String str5 = str4;
            String str6 = str3;
            return update.copy(str, str2, str6, obj, str5);
        }

        @Deprecated(message = "Use 'runtime' field .")
        public static /* synthetic */ void getRuntimeVersion$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        /* renamed from: component4, reason: from getter */
        public final Object getCreatedAt() {
            return this.createdAt;
        }

        /* renamed from: component5, reason: from getter */
        public final String getManifestPermalink() {
            return this.manifestPermalink;
        }

        public final Update copy(String id, String message, String runtimeVersion, Object createdAt, String manifestPermalink) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(runtimeVersion, "runtimeVersion");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(manifestPermalink, "manifestPermalink");
            return new Update(id, message, runtimeVersion, createdAt, manifestPermalink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Update)) {
                return false;
            }
            Update update = (Update) other;
            return Intrinsics.areEqual(this.id, update.id) && Intrinsics.areEqual(this.message, update.message) && Intrinsics.areEqual(this.runtimeVersion, update.runtimeVersion) && Intrinsics.areEqual(this.createdAt, update.createdAt) && Intrinsics.areEqual(this.manifestPermalink, update.manifestPermalink);
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.message;
            return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.runtimeVersion.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.manifestPermalink.hashCode();
        }

        public String toString() {
            return "Update(id=" + this.id + ", message=" + this.message + ", runtimeVersion=" + this.runtimeVersion + ", createdAt=" + this.createdAt + ", manifestPermalink=" + this.manifestPermalink + ")";
        }

        public Update(String id, String str, String runtimeVersion, Object createdAt, String manifestPermalink) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(runtimeVersion, "runtimeVersion");
            Intrinsics.checkNotNullParameter(createdAt, "createdAt");
            Intrinsics.checkNotNullParameter(manifestPermalink, "manifestPermalink");
            this.id = id;
            this.message = str;
            this.runtimeVersion = runtimeVersion;
            this.createdAt = createdAt;
            this.manifestPermalink = manifestPermalink;
        }

        public final String getId() {
            return this.id;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public final Object getCreatedAt() {
            return this.createdAt;
        }

        public final String getManifestPermalink() {
            return this.manifestPermalink;
        }
    }

    /* compiled from: GetUpdatesWithFiltersQuery.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getOPERATION_DOCUMENT() {
            return "query getUpdatesWithFilters($appId: String!, $branchName: String!, $offset: Int!, $limit: Int!, $platform: AppPlatform!) { app { byId(appId: $appId) { updateBranchByName(name: $branchName) { updates(offset: $offset, limit: $limit, filter: { platform: $platform } ) { id message runtimeVersion createdAt manifestPermalink } } } } }";
        }
    }
}
