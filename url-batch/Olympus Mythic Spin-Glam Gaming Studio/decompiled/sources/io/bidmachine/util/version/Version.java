package io.bidmachine.util.version;

import com.yandex.div.core.DivActionHandler;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Version.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lio/bidmachine/util/version/Version;", "", "major", "", "minor", DivActionHandler.DivActionReason.PATCH, "(III)V", "compareTo", "other", "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "isAfter", "version", "isAfterOrEquals", "isBefore", "isBeforeOrEquals", "toString", "", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Version implements Comparable<Version> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int major;
    private final int minor;
    private final int patch;

    /* renamed from: component1, reason: from getter */
    private final int getMajor() {
        return this.major;
    }

    /* renamed from: component2, reason: from getter */
    private final int getMinor() {
        return this.minor;
    }

    /* renamed from: component3, reason: from getter */
    private final int getPatch() {
        return this.patch;
    }

    public static /* synthetic */ Version copy$default(Version version, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = version.major;
        }
        if ((i4 & 2) != 0) {
            i2 = version.minor;
        }
        if ((i4 & 4) != 0) {
            i3 = version.patch;
        }
        return version.copy(i, i2, i3);
    }

    @Nullable
    public static final Version parseVersion(@Nullable String str) {
        return INSTANCE.parseVersion(str);
    }

    @NotNull
    public final Version copy(int major, int minor, int patch) {
        return new Version(major, minor, patch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.major) * 31) + Integer.hashCode(this.minor)) * 31) + Integer.hashCode(this.patch);
    }

    public Version(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Version other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int compare = Intrinsics.compare(this.major, other.major);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Intrinsics.compare(this.minor, other.minor);
        return compare2 != 0 ? compare2 : Intrinsics.compare(this.patch, other.patch);
    }

    public final boolean isAfter(@NotNull Version version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return compareTo(version) > 0;
    }

    public final boolean isAfterOrEquals(@NotNull Version version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return compareTo(version) >= 0;
    }

    public final boolean isBefore(@NotNull Version version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return compareTo(version) < 0;
    }

    public final boolean isBeforeOrEquals(@NotNull Version version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return compareTo(version) <= 0;
    }

    /* compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/bidmachine/util/version/Version$Companion;", "", "()V", "parseVersion", "Lio/bidmachine/util/version/Version;", "versionString", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Nullable
        public final Version parseVersion(@Nullable String versionString) {
            List emptyList;
            if (versionString != null && versionString.length() != 0) {
                try {
                    List<String> split = new Regex("\\.").split(versionString, 0);
                    if (!split.isEmpty()) {
                        ListIterator<String> listIterator = split.listIterator(split.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() != 0) {
                                emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    emptyList = CollectionsKt.emptyList();
                    String[] strArr = (String[]) emptyList.toArray(new String[0]);
                    if (strArr.length == 0) {
                        return null;
                    }
                    int length = strArr.length;
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length; i4++) {
                        if (i4 == 0) {
                            i = Integer.parseInt(strArr[0]);
                        } else if (i4 == 1) {
                            i2 = Integer.parseInt(strArr[1]);
                        } else if (i4 == 2) {
                            i3 = Integer.parseInt(strArr[2]);
                        } else {
                            i3 = (i3 * 100) + Integer.parseInt(strArr[i4]);
                        }
                    }
                    return new Version(i, i2, i3);
                } catch (Throwable unused) {
                }
            }
            return null;
        }
    }
}
