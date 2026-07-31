package expo.modules.devlauncher.type;

import com.apollographql.apollo.api.CompiledArgumentDefinition;
import com.apollographql.apollo.api.ObjectType;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AppQuery.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lexpo/modules/devlauncher/type/AppQuery;", "", "<init>", "()V", "Companion", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppQuery {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CompiledArgumentDefinition __byId_appId = new CompiledArgumentDefinition.Builder(RemoteConfigConstants.RequestFieldKey.APP_ID).build();
    private static final ObjectType type = new ObjectType.Builder("AppQuery").build();

    /* compiled from: AppQuery.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/devlauncher/type/AppQuery$Companion;", "", "<init>", "()V", "__byId_appId", "Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "get__byId_appId", "()Lcom/apollographql/apollo/api/CompiledArgumentDefinition;", "type", "Lcom/apollographql/apollo/api/ObjectType;", "getType", "()Lcom/apollographql/apollo/api/ObjectType;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CompiledArgumentDefinition get__byId_appId() {
            return AppQuery.__byId_appId;
        }

        public final ObjectType getType() {
            return AppQuery.type;
        }
    }
}
