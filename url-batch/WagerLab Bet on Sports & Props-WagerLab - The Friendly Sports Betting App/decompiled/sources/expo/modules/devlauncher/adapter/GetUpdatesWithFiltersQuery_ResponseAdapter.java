package expo.modules.devlauncher.adapter;

import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import expo.modules.devlauncher.GetUpdatesWithFiltersQuery;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetUpdatesWithFiltersQuery_ResponseAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetUpdatesWithFiltersQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "App", "ById", "UpdateBranchByName", "Update", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetUpdatesWithFiltersQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final GetUpdatesWithFiltersQuery_ResponseAdapter INSTANCE = new GetUpdatesWithFiltersQuery_ResponseAdapter();

    /* compiled from: GetUpdatesWithFiltersQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetUpdatesWithFiltersQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$Data;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<GetUpdatesWithFiltersQuery.Data> {
        public static final Data INSTANCE = new Data();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf("app");
        public static final int $stable = 8;

        private Data() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public GetUpdatesWithFiltersQuery.Data fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            GetUpdatesWithFiltersQuery.App app = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                app = (GetUpdatesWithFiltersQuery.App) Adapters.m9319obj$default(App.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (app != null) {
                return new GetUpdatesWithFiltersQuery.Data(app);
            }
            Assertions.missingField(reader, "app");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetUpdatesWithFiltersQuery.Data value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("app");
            Adapters.m9319obj$default(App.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getApp());
        }
    }

    private GetUpdatesWithFiltersQuery_ResponseAdapter() {
    }

    /* compiled from: GetUpdatesWithFiltersQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetUpdatesWithFiltersQuery_ResponseAdapter$App;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$App;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class App implements Adapter<GetUpdatesWithFiltersQuery.App> {
        public static final App INSTANCE = new App();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf("byId");
        public static final int $stable = 8;

        private App() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public GetUpdatesWithFiltersQuery.App fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            GetUpdatesWithFiltersQuery.ById byId = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                byId = (GetUpdatesWithFiltersQuery.ById) Adapters.m9319obj$default(ById.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (byId != null) {
                return new GetUpdatesWithFiltersQuery.App(byId);
            }
            Assertions.missingField(reader, "byId");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetUpdatesWithFiltersQuery.App value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("byId");
            Adapters.m9319obj$default(ById.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getById());
        }
    }

    /* compiled from: GetUpdatesWithFiltersQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetUpdatesWithFiltersQuery_ResponseAdapter$ById;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$ById;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ById implements Adapter<GetUpdatesWithFiltersQuery.ById> {
        public static final ById INSTANCE = new ById();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf("updateBranchByName");
        public static final int $stable = 8;

        private ById() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public GetUpdatesWithFiltersQuery.ById fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            GetUpdatesWithFiltersQuery.UpdateBranchByName updateBranchByName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                updateBranchByName = (GetUpdatesWithFiltersQuery.UpdateBranchByName) Adapters.m9317nullable(Adapters.m9319obj$default(UpdateBranchByName.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new GetUpdatesWithFiltersQuery.ById(updateBranchByName);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetUpdatesWithFiltersQuery.ById value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("updateBranchByName");
            Adapters.m9317nullable(Adapters.m9319obj$default(UpdateBranchByName.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getUpdateBranchByName());
        }
    }

    /* compiled from: GetUpdatesWithFiltersQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetUpdatesWithFiltersQuery_ResponseAdapter$UpdateBranchByName;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$UpdateBranchByName;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateBranchByName implements Adapter<GetUpdatesWithFiltersQuery.UpdateBranchByName> {
        public static final UpdateBranchByName INSTANCE = new UpdateBranchByName();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf("updates");
        public static final int $stable = 8;

        private UpdateBranchByName() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public GetUpdatesWithFiltersQuery.UpdateBranchByName fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = Adapters.m9316list(Adapters.m9319obj$default(Update.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new GetUpdatesWithFiltersQuery.UpdateBranchByName(list);
            }
            Assertions.missingField(reader, "updates");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetUpdatesWithFiltersQuery.UpdateBranchByName value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("updates");
            Adapters.m9316list(Adapters.m9319obj$default(Update.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (List) value.getUpdates());
        }
    }

    /* compiled from: GetUpdatesWithFiltersQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetUpdatesWithFiltersQuery_ResponseAdapter$Update;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/GetUpdatesWithFiltersQuery$Update;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Update implements Adapter<GetUpdatesWithFiltersQuery.Update> {
        public static final Update INSTANCE = new Update();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf((Object[]) new String[]{"id", "message", "runtimeVersion", "createdAt", "manifestPermalink"});
        public static final int $stable = 8;

        private Update() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public GetUpdatesWithFiltersQuery.Update fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Object obj = null;
            String str4 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    obj = Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    str4 = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.missingField(reader, "id");
                throw new KotlinNothingValueException();
            }
            if (str3 == null) {
                Assertions.missingField(reader, "runtimeVersion");
                throw new KotlinNothingValueException();
            }
            if (obj == null) {
                Assertions.missingField(reader, "createdAt");
                throw new KotlinNothingValueException();
            }
            if (str4 != null) {
                return new GetUpdatesWithFiltersQuery.Update(str, str2, str3, obj, str4);
            }
            Assertions.missingField(reader, "manifestPermalink");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetUpdatesWithFiltersQuery.Update value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("id");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("message");
            Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMessage());
            writer.name("runtimeVersion");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getRuntimeVersion());
            writer.name("createdAt");
            Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreatedAt());
            writer.name("manifestPermalink");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getManifestPermalink());
        }
    }
}
