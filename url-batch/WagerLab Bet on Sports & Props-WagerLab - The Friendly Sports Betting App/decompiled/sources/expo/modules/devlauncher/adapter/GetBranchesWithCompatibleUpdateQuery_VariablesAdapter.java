package expo.modules.devlauncher.adapter;

import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import expo.modules.devlauncher.GetBranchesWithCompatibleUpdateQuery;
import expo.modules.devlauncher.type.adapter.AppPlatform_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetBranchesWithCompatibleUpdateQuery_VariablesAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/devlauncher/adapter/GetBranchesWithCompatibleUpdateQuery_VariablesAdapter;", "", "<init>", "()V", "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "Lexpo/modules/devlauncher/GetBranchesWithCompatibleUpdateQuery;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetBranchesWithCompatibleUpdateQuery_VariablesAdapter {
    public static final int $stable = 0;
    public static final GetBranchesWithCompatibleUpdateQuery_VariablesAdapter INSTANCE = new GetBranchesWithCompatibleUpdateQuery_VariablesAdapter();

    private GetBranchesWithCompatibleUpdateQuery_VariablesAdapter() {
    }

    public final void serializeVariables(JsonWriter writer, GetBranchesWithCompatibleUpdateQuery value, CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        writer.name(RemoteConfigConstants.RequestFieldKey.APP_ID);
        Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getAppId());
        writer.name("offset");
        Adapters.IntAdapter.toJson(writer, customScalarAdapters, Integer.valueOf(value.getOffset()));
        writer.name("limit");
        Adapters.IntAdapter.toJson(writer, customScalarAdapters, Integer.valueOf(value.getLimit()));
        writer.name("runtimeVersion");
        Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getRuntimeVersion());
        writer.name("platform");
        AppPlatform_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getPlatform());
    }
}
