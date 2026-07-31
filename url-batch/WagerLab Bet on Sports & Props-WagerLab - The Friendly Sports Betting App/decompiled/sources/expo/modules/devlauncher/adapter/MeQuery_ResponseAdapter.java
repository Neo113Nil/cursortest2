package expo.modules.devlauncher.adapter;

import androidx.autofill.HintConstants;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import expo.modules.devlauncher.MeQuery;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeQuery_ResponseAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lexpo/modules/devlauncher/adapter/MeQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "MeUserActor", "Account", "OwnerUserActor", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MeQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final MeQuery_ResponseAdapter INSTANCE = new MeQuery_ResponseAdapter();

    /* compiled from: MeQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/MeQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/MeQuery$Data;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<MeQuery.Data> {
        public static final Data INSTANCE = new Data();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf("meUserActor");
        public static final int $stable = 8;

        private Data() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public MeQuery.Data fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            MeQuery.MeUserActor meUserActor = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                meUserActor = (MeQuery.MeUserActor) Adapters.m9317nullable(Adapters.m9319obj$default(MeUserActor.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new MeQuery.Data(meUserActor);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MeQuery.Data value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("meUserActor");
            Adapters.m9317nullable(Adapters.m9319obj$default(MeUserActor.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getMeUserActor());
        }
    }

    private MeQuery_ResponseAdapter() {
    }

    /* compiled from: MeQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/MeQuery_ResponseAdapter$MeUserActor;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/MeQuery$MeUserActor;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MeUserActor implements Adapter<MeQuery.MeUserActor> {
        public static final MeUserActor INSTANCE = new MeUserActor();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf((Object[]) new String[]{"id", "appCount", "profilePhoto", HintConstants.AUTOFILL_HINT_USERNAME, "isExpoAdmin", "accounts"});
        public static final int $stable = 8;

        private MeUserActor() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public MeQuery.MeUserActor fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    num = num2;
                    str = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    num2 = Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    num = num2;
                    str2 = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    num = num2;
                    str3 = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    num = num2;
                    bool = Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    list = Adapters.m9316list(Adapters.m9319obj$default(Account.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                    num2 = num2;
                    bool = bool;
                }
                num2 = num;
            }
            Integer num3 = num2;
            if (str == null) {
                Assertions.missingField(reader, "id");
                throw new KotlinNothingValueException();
            }
            if (num3 != null) {
                Boolean bool2 = bool;
                int intValue = num3.intValue();
                if (str2 == null) {
                    Assertions.missingField(reader, "profilePhoto");
                    throw new KotlinNothingValueException();
                }
                if (str3 == null) {
                    Assertions.missingField(reader, HintConstants.AUTOFILL_HINT_USERNAME);
                    throw new KotlinNothingValueException();
                }
                if (bool2 != null) {
                    boolean booleanValue = bool2.booleanValue();
                    if (list != null) {
                        return new MeQuery.MeUserActor(str, intValue, str2, str3, booleanValue, list);
                    }
                    Assertions.missingField(reader, "accounts");
                    throw new KotlinNothingValueException();
                }
                Assertions.missingField(reader, "isExpoAdmin");
                throw new KotlinNothingValueException();
            }
            Assertions.missingField(reader, "appCount");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MeQuery.MeUserActor value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("id");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("appCount");
            Adapters.IntAdapter.toJson(writer, customScalarAdapters, Integer.valueOf(value.getAppCount()));
            writer.name("profilePhoto");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getProfilePhoto());
            writer.name(HintConstants.AUTOFILL_HINT_USERNAME);
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getUsername());
            writer.name("isExpoAdmin");
            Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isExpoAdmin()));
            writer.name("accounts");
            Adapters.m9316list(Adapters.m9319obj$default(Account.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (List) value.getAccounts());
        }
    }

    /* compiled from: MeQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/MeQuery_ResponseAdapter$Account;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/MeQuery$Account;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Account implements Adapter<MeQuery.Account> {
        public static final Account INSTANCE = new Account();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf((Object[]) new String[]{"id", "name", "ownerUserActor"});
        public static final int $stable = 8;

        private Account() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public MeQuery.Account fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            MeQuery.OwnerUserActor ownerUserActor = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    ownerUserActor = (MeQuery.OwnerUserActor) Adapters.m9317nullable(Adapters.m9319obj$default(OwnerUserActor.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.missingField(reader, "id");
                throw new KotlinNothingValueException();
            }
            if (str2 != null) {
                return new MeQuery.Account(str, str2, ownerUserActor);
            }
            Assertions.missingField(reader, "name");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MeQuery.Account value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name("id");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("name");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getName());
            writer.name("ownerUserActor");
            Adapters.m9317nullable(Adapters.m9319obj$default(OwnerUserActor.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getOwnerUserActor());
        }
    }

    /* compiled from: MeQuery_ResponseAdapter.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devlauncher/adapter/MeQuery_ResponseAdapter$OwnerUserActor;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/MeQuery$OwnerUserActor;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OwnerUserActor implements Adapter<MeQuery.OwnerUserActor> {
        public static final OwnerUserActor INSTANCE = new OwnerUserActor();
        private static final List<String> RESPONSE_NAMES = CollectionsKt.listOf((Object[]) new String[]{HintConstants.AUTOFILL_HINT_USERNAME, "fullName", "profilePhoto"});
        public static final int $stable = 8;

        private OwnerUserActor() {
        }

        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public MeQuery.OwnerUserActor fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str3 = Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.missingField(reader, HintConstants.AUTOFILL_HINT_USERNAME);
                throw new KotlinNothingValueException();
            }
            if (str3 != null) {
                return new MeQuery.OwnerUserActor(str, str2, str3);
            }
            Assertions.missingField(reader, "profilePhoto");
            throw new KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, MeQuery.OwnerUserActor value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.name(HintConstants.AUTOFILL_HINT_USERNAME);
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getUsername());
            writer.name("fullName");
            Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFullName());
            writer.name("profilePhoto");
            Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getProfilePhoto());
        }
    }
}
