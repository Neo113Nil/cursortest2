package expo.modules.devlauncher.type.adapter;

import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import expo.modules.devlauncher.type.AppPlatform;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppPlatform_ResponseAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lexpo/modules/devlauncher/type/adapter/AppPlatform_ResponseAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lexpo/modules/devlauncher/type/AppPlatform;", "<init>", "()V", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppPlatform_ResponseAdapter implements Adapter<AppPlatform> {
    public static final int $stable = 0;
    public static final AppPlatform_ResponseAdapter INSTANCE = new AppPlatform_ResponseAdapter();

    private AppPlatform_ResponseAdapter() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.apollographql.apollo.api.Adapter
    public AppPlatform fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        String nextString = reader.nextString();
        Intrinsics.checkNotNull(nextString);
        return AppPlatform.INSTANCE.safeValueOf(nextString);
    }

    @Override // com.apollographql.apollo.api.Adapter
    public void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, AppPlatform value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.value(value.getRawValue());
    }
}
