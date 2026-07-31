package expo.modules.devlauncher;

import androidx.autofill.HintConstants;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.devlauncher.adapter.MeQuery_ResponseAdapter;
import expo.modules.devlauncher.selections.MeQuerySelections;
import expo.modules.devlauncher.type.RootQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: MeQuery.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001a\u001b\u001c\u001d\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016¨\u0006\u001f"}, d2 = {"Lexpo/modules/devlauncher/MeQuery;", "Lcom/apollographql/apollo/api/Query;", "Lexpo/modules/devlauncher/MeQuery$Data;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "id", "", "document", "name", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "Data", "MeUserActor", "Account", "OwnerUserActor", "Companion", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MeQuery implements Query<Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String OPERATION_ID = "642e02708f78a880e85e2c2a3095923345220c154aa6ef2cb661e658e0d6f972";
    public static final String OPERATION_NAME = "Me";

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(JsonWriter writer, CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
    }

    public boolean equals(Object other) {
        return other != null && other.getClass() == getClass();
    }

    public int hashCode() {
        return Reflection.getOrCreateKotlinClass(getClass()).hashCode();
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
    public Adapter<Data> adapter() {
        return Adapters.m9319obj$default(MeQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public CompiledField rootField() {
        return new CompiledField.Builder("data", RootQuery.INSTANCE.getType()).selections(MeQuerySelections.INSTANCE.get__root()).build();
    }

    /* compiled from: MeQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lexpo/modules/devlauncher/MeQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "meUserActor", "Lexpo/modules/devlauncher/MeQuery$MeUserActor;", "<init>", "(Lexpo/modules/devlauncher/MeQuery$MeUserActor;)V", "getMeUserActor", "()Lexpo/modules/devlauncher/MeQuery$MeUserActor;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {
        public static final int $stable = 8;
        private final MeUserActor meUserActor;

        public static /* synthetic */ Data copy$default(Data data, MeUserActor meUserActor, int i, Object obj) {
            if ((i & 1) != 0) {
                meUserActor = data.meUserActor;
            }
            return data.copy(meUserActor);
        }

        /* renamed from: component1, reason: from getter */
        public final MeUserActor getMeUserActor() {
            return this.meUserActor;
        }

        public final Data copy(MeUserActor meUserActor) {
            return new Data(meUserActor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.areEqual(this.meUserActor, ((Data) other).meUserActor);
        }

        public int hashCode() {
            MeUserActor meUserActor = this.meUserActor;
            if (meUserActor == null) {
                return 0;
            }
            return meUserActor.hashCode();
        }

        public String toString() {
            return "Data(meUserActor=" + this.meUserActor + ")";
        }

        public Data(MeUserActor meUserActor) {
            this.meUserActor = meUserActor;
        }

        public final MeUserActor getMeUserActor() {
            return this.meUserActor;
        }
    }

    /* compiled from: MeQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lexpo/modules/devlauncher/MeQuery$MeUserActor;", "", "id", "", "appCount", "", "profilePhoto", HintConstants.AUTOFILL_HINT_USERNAME, "isExpoAdmin", "", "accounts", "", "Lexpo/modules/devlauncher/MeQuery$Account;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getId", "()Ljava/lang/String;", "getAppCount", "()I", "getProfilePhoto", "getUsername", "()Z", "getAccounts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MeUserActor {
        public static final int $stable = 8;
        private final List<Account> accounts;
        private final int appCount;
        private final String id;
        private final boolean isExpoAdmin;
        private final String profilePhoto;
        private final String username;

        public static /* synthetic */ MeUserActor copy$default(MeUserActor meUserActor, String str, int i, String str2, String str3, boolean z, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = meUserActor.id;
            }
            if ((i2 & 2) != 0) {
                i = meUserActor.appCount;
            }
            if ((i2 & 4) != 0) {
                str2 = meUserActor.profilePhoto;
            }
            if ((i2 & 8) != 0) {
                str3 = meUserActor.username;
            }
            if ((i2 & 16) != 0) {
                z = meUserActor.isExpoAdmin;
            }
            if ((i2 & 32) != 0) {
                list = meUserActor.accounts;
            }
            boolean z2 = z;
            List list2 = list;
            return meUserActor.copy(str, i, str2, str3, z2, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAppCount() {
            return this.appCount;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProfilePhoto() {
            return this.profilePhoto;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsExpoAdmin() {
            return this.isExpoAdmin;
        }

        public final List<Account> component6() {
            return this.accounts;
        }

        public final MeUserActor copy(String id, int appCount, String profilePhoto, String username, boolean isExpoAdmin, List<Account> accounts) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(profilePhoto, "profilePhoto");
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            return new MeUserActor(id, appCount, profilePhoto, username, isExpoAdmin, accounts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MeUserActor)) {
                return false;
            }
            MeUserActor meUserActor = (MeUserActor) other;
            return Intrinsics.areEqual(this.id, meUserActor.id) && this.appCount == meUserActor.appCount && Intrinsics.areEqual(this.profilePhoto, meUserActor.profilePhoto) && Intrinsics.areEqual(this.username, meUserActor.username) && this.isExpoAdmin == meUserActor.isExpoAdmin && Intrinsics.areEqual(this.accounts, meUserActor.accounts);
        }

        public int hashCode() {
            return (((((((((this.id.hashCode() * 31) + Integer.hashCode(this.appCount)) * 31) + this.profilePhoto.hashCode()) * 31) + this.username.hashCode()) * 31) + Boolean.hashCode(this.isExpoAdmin)) * 31) + this.accounts.hashCode();
        }

        public String toString() {
            return "MeUserActor(id=" + this.id + ", appCount=" + this.appCount + ", profilePhoto=" + this.profilePhoto + ", username=" + this.username + ", isExpoAdmin=" + this.isExpoAdmin + ", accounts=" + this.accounts + ")";
        }

        public MeUserActor(String id, int i, String profilePhoto, String username, boolean z, List<Account> accounts) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(profilePhoto, "profilePhoto");
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            this.id = id;
            this.appCount = i;
            this.profilePhoto = profilePhoto;
            this.username = username;
            this.isExpoAdmin = z;
            this.accounts = accounts;
        }

        public final String getId() {
            return this.id;
        }

        public final int getAppCount() {
            return this.appCount;
        }

        public final String getProfilePhoto() {
            return this.profilePhoto;
        }

        public final String getUsername() {
            return this.username;
        }

        public final boolean isExpoAdmin() {
            return this.isExpoAdmin;
        }

        public final List<Account> getAccounts() {
            return this.accounts;
        }
    }

    /* compiled from: MeQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lexpo/modules/devlauncher/MeQuery$Account;", "", "id", "", "name", "ownerUserActor", "Lexpo/modules/devlauncher/MeQuery$OwnerUserActor;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/devlauncher/MeQuery$OwnerUserActor;)V", "getId", "()Ljava/lang/String;", "getName", "getOwnerUserActor", "()Lexpo/modules/devlauncher/MeQuery$OwnerUserActor;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Account {
        public static final int $stable = 0;
        private final String id;
        private final String name;
        private final OwnerUserActor ownerUserActor;

        public static /* synthetic */ Account copy$default(Account account, String str, String str2, OwnerUserActor ownerUserActor, int i, Object obj) {
            if ((i & 1) != 0) {
                str = account.id;
            }
            if ((i & 2) != 0) {
                str2 = account.name;
            }
            if ((i & 4) != 0) {
                ownerUserActor = account.ownerUserActor;
            }
            return account.copy(str, str2, ownerUserActor);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final OwnerUserActor getOwnerUserActor() {
            return this.ownerUserActor;
        }

        public final Account copy(String id, String name, OwnerUserActor ownerUserActor) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Account(id, name, ownerUserActor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Account)) {
                return false;
            }
            Account account = (Account) other;
            return Intrinsics.areEqual(this.id, account.id) && Intrinsics.areEqual(this.name, account.name) && Intrinsics.areEqual(this.ownerUserActor, account.ownerUserActor);
        }

        public int hashCode() {
            int hashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
            OwnerUserActor ownerUserActor = this.ownerUserActor;
            return hashCode + (ownerUserActor == null ? 0 : ownerUserActor.hashCode());
        }

        public String toString() {
            return "Account(id=" + this.id + ", name=" + this.name + ", ownerUserActor=" + this.ownerUserActor + ")";
        }

        public Account(String id, String name, OwnerUserActor ownerUserActor) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = id;
            this.name = name;
            this.ownerUserActor = ownerUserActor;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final OwnerUserActor getOwnerUserActor() {
            return this.ownerUserActor;
        }
    }

    /* compiled from: MeQuery.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lexpo/modules/devlauncher/MeQuery$OwnerUserActor;", "", HintConstants.AUTOFILL_HINT_USERNAME, "", "fullName", "profilePhoto", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "getFullName", "getProfilePhoto", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OwnerUserActor {
        public static final int $stable = 0;
        private final String fullName;
        private final String profilePhoto;
        private final String username;

        public static /* synthetic */ OwnerUserActor copy$default(OwnerUserActor ownerUserActor, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ownerUserActor.username;
            }
            if ((i & 2) != 0) {
                str2 = ownerUserActor.fullName;
            }
            if ((i & 4) != 0) {
                str3 = ownerUserActor.profilePhoto;
            }
            return ownerUserActor.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProfilePhoto() {
            return this.profilePhoto;
        }

        public final OwnerUserActor copy(String username, String fullName, String profilePhoto) {
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(profilePhoto, "profilePhoto");
            return new OwnerUserActor(username, fullName, profilePhoto);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OwnerUserActor)) {
                return false;
            }
            OwnerUserActor ownerUserActor = (OwnerUserActor) other;
            return Intrinsics.areEqual(this.username, ownerUserActor.username) && Intrinsics.areEqual(this.fullName, ownerUserActor.fullName) && Intrinsics.areEqual(this.profilePhoto, ownerUserActor.profilePhoto);
        }

        public int hashCode() {
            int hashCode = this.username.hashCode() * 31;
            String str = this.fullName;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.profilePhoto.hashCode();
        }

        public String toString() {
            return "OwnerUserActor(username=" + this.username + ", fullName=" + this.fullName + ", profilePhoto=" + this.profilePhoto + ")";
        }

        public OwnerUserActor(String username, String str, String profilePhoto) {
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(profilePhoto, "profilePhoto");
            this.username = username;
            this.fullName = str;
            this.profilePhoto = profilePhoto;
        }

        public final String getUsername() {
            return this.username;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final String getProfilePhoto() {
            return this.profilePhoto;
        }
    }

    /* compiled from: MeQuery.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lexpo/modules/devlauncher/MeQuery$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getOPERATION_DOCUMENT() {
            return "query Me { meUserActor { id appCount profilePhoto username isExpoAdmin accounts { id name ownerUserActor { username fullName profilePhoto } } } }";
        }
    }
}
