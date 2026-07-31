package expo.modules.devlauncher.adapter;

import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import expo.modules.devlauncher.GetBranchesQuery;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetBranchesQuery_ResponseAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetBranchesQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "App", "ById", "UpdateBranch", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetBranchesQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final GetBranchesQuery_ResponseAdapter INSTANCE = new GetBranchesQuery_ResponseAdapter();

    /* compiled from: GetBranchesQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetBranchesQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/GetBranchesQuery$Data;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<GetBranchesQuery.Data> {
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
        public GetBranchesQuery.Data fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            GetBranchesQuery.App app = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                app = (GetBranchesQuery.App) Adapters.m9319obj$default(App.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (app != null) {
                return new GetBranchesQuery.Data(app);
            }
            Assertions.missingField(reader, "app");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetBranchesQuery.Data value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("app");
            Adapters.m9319obj$default(App.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getApp());
        }
    }

    private GetBranchesQuery_ResponseAdapter() {
    }

    /* compiled from: GetBranchesQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetBranchesQuery_ResponseAdapter$App;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/GetBranchesQuery$App;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class App implements Adapter<GetBranchesQuery.App> {
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
        public GetBranchesQuery.App fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            GetBranchesQuery.ById byId = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                byId = (GetBranchesQuery.ById) Adapters.m9319obj$default(ById.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (byId != null) {
                return new GetBranchesQuery.App(byId);
            }
            Assertions.missingField(reader, "byId");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetBranchesQuery.App value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("byId");
            Adapters.m9319obj$default(ById.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getById());
        }
    }

    /* compiled from: GetBranchesQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetBranchesQuery_ResponseAdapter$ById;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/GetBranchesQuery$ById;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ById implements Adapter<GetBranchesQuery.ById> {
        public static final ById INSTANCE = new ById();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf("updateBranches");
        public static final int $stable = 8;

        private ById() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public GetBranchesQuery.ById fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = Adapters.m9316list(Adapters.m9319obj$default(UpdateBranch.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new GetBranchesQuery.ById(list);
            }
            Assertions.missingField(reader, "updateBranches");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetBranchesQuery.ById value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("updateBranches");
            Adapters.m9316list(Adapters.m9319obj$default(UpdateBranch.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (List) value.getUpdateBranches());
        }
    }

    /* compiled from: GetBranchesQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetBranchesQuery_ResponseAdapter$UpdateBranch;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/GetBranchesQuery$UpdateBranch;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateBranch implements Adapter<GetBranchesQuery.UpdateBranch> {
        public static final UpdateBranch INSTANCE = new UpdateBranch();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf((Object[]) new String[]{"id", "name"});
        public static final int $stable = 8;

        private UpdateBranch() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public GetBranchesQuery.UpdateBranch fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str2 = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.missingField(reader, "id");
                throw new KotlinNothingValueException();
            }
            if (str2 != null) {
                return new GetBranchesQuery.UpdateBranch(str, str2);
            }
            Assertions.missingField(reader, "name");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, GetBranchesQuery.UpdateBranch value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("id");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("name");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
        }
    }
}
