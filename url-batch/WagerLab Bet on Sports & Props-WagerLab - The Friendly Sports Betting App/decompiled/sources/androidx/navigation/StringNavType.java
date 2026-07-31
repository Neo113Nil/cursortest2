package androidx.navigation;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import com.amazon.a.a.o.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavType.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/navigation/StringNavType;", "Landroidx/navigation/NavType;", "", "<init>", "()V", "name", "getName", "()Ljava/lang/String;", "put", "", "bundle", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "value", b.au, "parseValue", "serializeAsValue", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StringNavType extends NavType<String> {
    public StringNavType() {
        super(true);
    }

    @Override // androidx.navigation.NavType
    public String getName() {
        return TypedValues.Custom.S_STRING;
    }

    @Override // androidx.navigation.NavType
    public String parseValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, "null")) {
            return null;
        }
        return value;
    }

    @Override // androidx.navigation.NavType
    public String serializeAsValue(String value) {
        String encode$default;
        return (value == null || (encode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, value, null, 2, null)) == null) ? "null" : encode$default;
    }

    @Override // androidx.navigation.NavType
    public void put(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle m9097constructorimpl = SavedStateWriter.m9097constructorimpl(bundle);
        if (value != null) {
            SavedStateWriter.m9130putStringimpl(m9097constructorimpl, key, value);
        } else {
            SavedStateWriter.m9120putNullimpl(m9097constructorimpl, key);
        }
    }

    @Override // androidx.navigation.NavType
    public String get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle m9011constructorimpl = SavedStateReader.m9011constructorimpl(bundle);
        if (!SavedStateReader.m9012containsimpl(m9011constructorimpl, key) || SavedStateReader.m9090isNullimpl(m9011constructorimpl, key)) {
            return null;
        }
        return SavedStateReader.m9082getStringimpl(m9011constructorimpl, key);
    }
}
