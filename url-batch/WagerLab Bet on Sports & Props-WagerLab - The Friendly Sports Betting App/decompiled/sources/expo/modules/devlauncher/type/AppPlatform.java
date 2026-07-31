package expo.modules.devlauncher.type;

import com.apollographql.apollo.api.EnumType;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppPlatform.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lexpo/modules/devlauncher/type/AppPlatform;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "IOS", "ANDROID", "UNKNOWN__", "Companion", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppPlatform {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppPlatform[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final EnumType type;
    private final String rawValue;
    public static final AppPlatform IOS = new AppPlatform("IOS", 0, "IOS");
    public static final AppPlatform ANDROID = new AppPlatform("ANDROID", 1, "ANDROID");
    public static final AppPlatform UNKNOWN__ = new AppPlatform("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ AppPlatform[] $values() {
        return new AppPlatform[]{IOS, ANDROID, UNKNOWN__};
    }

    public static EnumEntries<AppPlatform> getEntries() {
        return $ENTRIES;
    }

    private AppPlatform(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    static {
        AppPlatform[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        type = new EnumType("AppPlatform", CollectionsKt.listOf((Object[]) new String[]{"IOS", "ANDROID"}));
    }

    /* compiled from: AppPlatform.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lexpo/modules/devlauncher/type/AppPlatform$Companion;", "", "<init>", "()V", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "knownEntries", "", "Lexpo/modules/devlauncher/type/AppPlatform;", "getKnownEntries", "()Ljava/util/List;", "knownValues", "", "()[Lexpo/modules/devlauncher/type/AppPlatform;", "safeValueOf", "rawValue", "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EnumType getType() {
            return AppPlatform.type;
        }

        public final List<AppPlatform> getKnownEntries() {
            return CollectionsKt.listOf((Object[]) new AppPlatform[]{AppPlatform.IOS, AppPlatform.ANDROID});
        }

        @Deprecated(message = "Use knownEntries instead", replaceWith = @ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final AppPlatform[] knownValues() {
            return (AppPlatform[]) getKnownEntries().toArray(new AppPlatform[0]);
        }

        public final AppPlatform safeValueOf(String rawValue) {
            Object obj;
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            Iterator<E> it = AppPlatform.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((AppPlatform) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            AppPlatform appPlatform = (AppPlatform) obj;
            return appPlatform == null ? AppPlatform.UNKNOWN__ : appPlatform;
        }
    }

    public static AppPlatform valueOf(String str) {
        return (AppPlatform) Enum.valueOf(AppPlatform.class, str);
    }

    public static AppPlatform[] values() {
        return (AppPlatform[]) $VALUES.clone();
    }
}
