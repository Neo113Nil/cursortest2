package expo.modules.devlauncher.selections;

import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CompiledVariable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import expo.modules.devlauncher.type.App;
import expo.modules.devlauncher.type.AppQuery;
import expo.modules.devlauncher.type.DateTime;
import expo.modules.devlauncher.type.GraphQLID;
import expo.modules.devlauncher.type.GraphQLString;
import expo.modules.devlauncher.type.Update;
import expo.modules.devlauncher.type.UpdateBranch;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* compiled from: GetUpdatesWithFiltersQuerySelections.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/devlauncher/selections/GetUpdatesWithFiltersQuerySelections;", "", "<init>", "()V", "__updates", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__updateBranchByName", "__byId", "__app", "__root", "get__root", "()Ljava/util/List;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetUpdatesWithFiltersQuerySelections {
    public static final int $stable;
    public static final GetUpdatesWithFiltersQuerySelections INSTANCE = new GetUpdatesWithFiltersQuerySelections();
    private static final List<CompiledSelection> __app;
    private static final List<CompiledSelection> __byId;
    private static final List<CompiledSelection> __root;
    private static final List<CompiledSelection> __updateBranchByName;
    private static final List<CompiledSelection> __updates;

    private GetUpdatesWithFiltersQuerySelections() {
    }

    static {
        List<CompiledSelection> listOf = CollectionsKt.listOf((Object[]) new CompiledField[]{new CompiledField.Builder("id", CompiledGraphQL.m9327notNull(GraphQLID.INSTANCE.getType())).build(), new CompiledField.Builder("message", GraphQLString.INSTANCE.getType()).build(), new CompiledField.Builder("runtimeVersion", CompiledGraphQL.m9327notNull(GraphQLString.INSTANCE.getType())).build(), new CompiledField.Builder("createdAt", CompiledGraphQL.m9327notNull(DateTime.INSTANCE.getType())).build(), new CompiledField.Builder("manifestPermalink", CompiledGraphQL.m9327notNull(GraphQLString.INSTANCE.getType())).build()});
        __updates = listOf;
        List<CompiledSelection> listOf2 = CollectionsKt.listOf(new CompiledField.Builder("updates", CompiledGraphQL.m9327notNull(CompiledGraphQL.m9326list(CompiledGraphQL.m9327notNull(Update.INSTANCE.getType())))).arguments(CollectionsKt.listOf((Object[]) new CompiledArgument[]{new CompiledArgument.Builder(UpdateBranch.INSTANCE.get__updates_filter()).value(MapsKt.mapOf(TuplesKt.to("platform", new CompiledVariable("platform")))).build(), new CompiledArgument.Builder(UpdateBranch.INSTANCE.get__updates_limit()).value(new CompiledVariable("limit")).build(), new CompiledArgument.Builder(UpdateBranch.INSTANCE.get__updates_offset()).value(new CompiledVariable("offset")).build()})).selections(listOf).build());
        __updateBranchByName = listOf2;
        List<CompiledSelection> listOf3 = CollectionsKt.listOf(new CompiledField.Builder("updateBranchByName", UpdateBranch.INSTANCE.getType()).arguments(CollectionsKt.listOf(new CompiledArgument.Builder(App.INSTANCE.get__updateBranchByName_name()).value(new CompiledVariable("branchName")).build())).selections(listOf2).build());
        __byId = listOf3;
        List<CompiledSelection> listOf4 = CollectionsKt.listOf(new CompiledField.Builder("byId", CompiledGraphQL.m9327notNull(App.INSTANCE.getType())).arguments(CollectionsKt.listOf(new CompiledArgument.Builder(AppQuery.INSTANCE.get__byId_appId()).value(new CompiledVariable(RemoteConfigConstants.RequestFieldKey.APP_ID)).build())).selections(listOf3).build());
        __app = listOf4;
        __root = CollectionsKt.listOf(new CompiledField.Builder("app", CompiledGraphQL.m9327notNull(AppQuery.INSTANCE.getType())).selections(listOf4).build());
        $stable = 8;
    }

    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
