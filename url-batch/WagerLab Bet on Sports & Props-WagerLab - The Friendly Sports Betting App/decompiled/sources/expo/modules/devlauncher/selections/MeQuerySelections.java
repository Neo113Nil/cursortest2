package expo.modules.devlauncher.selections;

import androidx.autofill.HintConstants;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import expo.modules.devlauncher.type.Account;
import expo.modules.devlauncher.type.GraphQLBoolean;
import expo.modules.devlauncher.type.GraphQLID;
import expo.modules.devlauncher.type.GraphQLInt;
import expo.modules.devlauncher.type.GraphQLString;
import expo.modules.devlauncher.type.UserActor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: MeQuerySelections.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/devlauncher/selections/MeQuerySelections;", "", "<init>", "()V", "__ownerUserActor", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__accounts", "__meUserActor", "__root", "get__root", "()Ljava/util/List;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MeQuerySelections {
    public static final int $stable;
    public static final MeQuerySelections INSTANCE = new MeQuerySelections();
    private static final List<CompiledSelection> __accounts;
    private static final List<CompiledSelection> __meUserActor;
    private static final List<CompiledSelection> __ownerUserActor;
    private static final List<CompiledSelection> __root;

    private MeQuerySelections() {
    }

    static {
        List<CompiledSelection> listOf = CollectionsKt.listOf((Object[]) new CompiledField[]{new CompiledField.Builder(HintConstants.AUTOFILL_HINT_USERNAME, CompiledGraphQL.m9327notNull(GraphQLString.INSTANCE.getType())).build(), new CompiledField.Builder("fullName", GraphQLString.INSTANCE.getType()).build(), new CompiledField.Builder("profilePhoto", CompiledGraphQL.m9327notNull(GraphQLString.INSTANCE.getType())).build()});
        __ownerUserActor = listOf;
        List<CompiledSelection> listOf2 = CollectionsKt.listOf((Object[]) new CompiledField[]{new CompiledField.Builder("id", CompiledGraphQL.m9327notNull(GraphQLID.INSTANCE.getType())).build(), new CompiledField.Builder("name", CompiledGraphQL.m9327notNull(GraphQLString.INSTANCE.getType())).build(), new CompiledField.Builder("ownerUserActor", UserActor.INSTANCE.getType()).selections(listOf).build()});
        __accounts = listOf2;
        List<CompiledSelection> listOf3 = CollectionsKt.listOf((Object[]) new CompiledField[]{new CompiledField.Builder("id", CompiledGraphQL.m9327notNull(GraphQLID.INSTANCE.getType())).build(), new CompiledField.Builder("appCount", CompiledGraphQL.m9327notNull(GraphQLInt.INSTANCE.getType())).build(), new CompiledField.Builder("profilePhoto", CompiledGraphQL.m9327notNull(GraphQLString.INSTANCE.getType())).build(), new CompiledField.Builder(HintConstants.AUTOFILL_HINT_USERNAME, CompiledGraphQL.m9327notNull(GraphQLString.INSTANCE.getType())).build(), new CompiledField.Builder("isExpoAdmin", CompiledGraphQL.m9327notNull(GraphQLBoolean.INSTANCE.getType())).build(), new CompiledField.Builder("accounts", CompiledGraphQL.m9327notNull(CompiledGraphQL.m9326list(CompiledGraphQL.m9327notNull(Account.INSTANCE.getType())))).selections(listOf2).build()});
        __meUserActor = listOf3;
        __root = CollectionsKt.listOf(new CompiledField.Builder("meUserActor", UserActor.INSTANCE.getType()).selections(listOf3).build());
        $stable = 8;
    }

    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
