package expo.modules.easclient;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EASClientID.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lexpo/modules/easclient/EASClientID;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "uuid", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "uuid$delegate", "Lkotlin/Lazy;", "expo-eas-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EASClientID {
    private final Context context;

    /* renamed from: uuid$delegate, reason: from kotlin metadata */
    private final Lazy uuid;

    public EASClientID(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.uuid = LazyKt.lazy(new Function0() { // from class: expo.modules.easclient.EASClientID$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UUID uuid_delegate$lambda$1;
                uuid_delegate$lambda$1 = EASClientID.uuid_delegate$lambda$1(EASClientID.this);
                return uuid_delegate$lambda$1;
            }
        });
    }

    public final UUID getUuid() {
        Object value = this.uuid.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID uuid_delegate$lambda$1(EASClientID eASClientID) {
        SharedPreferences sharedPreferences = eASClientID.context.getSharedPreferences("dev.expo.EASSharedPreferences", 0);
        String string = sharedPreferences.getString("eas-client-id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("eas-client-id", string);
            edit.apply();
        }
        return UUID.fromString(string);
    }
}
