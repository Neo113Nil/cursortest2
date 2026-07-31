package io.bidmachine.util.version;

import com.ironsource.X3;
import io.bidmachine.util.version.Version;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VersionRange.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/version/VersionRange;", "", "from", "Lio/bidmachine/util/version/Version;", "to", "isInclusiveFrom", "", "isInclusiveTo", "(Lio/bidmachine/util/version/Version;Lio/bidmachine/util/version/Version;ZZ)V", "contains", "version", "equals", "other", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class VersionRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Version from;
    private final boolean isInclusiveFrom;
    private final boolean isInclusiveTo;

    @Nullable
    private final Version to;

    public static final boolean isAfter(@NotNull Version version, @NotNull Version version2, boolean z) {
        return INSTANCE.isAfter(version, version2, z);
    }

    public static final boolean isBefore(@NotNull Version version, @NotNull Version version2, boolean z) {
        return INSTANCE.isBefore(version, version2, z);
    }

    @Nullable
    public static final VersionRange parseVersionRange(@Nullable String str) {
        return INSTANCE.parseVersionRange(str);
    }

    public VersionRange(@Nullable Version version, @Nullable Version version2, boolean z, boolean z2) {
        this.from = version;
        this.to = version2;
        this.isInclusiveFrom = z;
        this.isInclusiveTo = z2;
    }

    public final boolean contains(@NotNull Version version) {
        Version version2;
        Intrinsics.checkNotNullParameter(version, "version");
        Version version3 = this.from;
        if (version3 != null && this.to != null) {
            Companion companion = INSTANCE;
            if (companion.isAfter(version3, version, this.isInclusiveFrom) && companion.isBefore(this.to, version, this.isInclusiveTo)) {
                return true;
            }
        }
        Version version4 = this.from;
        if (version4 != null && this.to == null && INSTANCE.isAfter(version4, version, this.isInclusiveFrom)) {
            return true;
        }
        if (this.from == null && (version2 = this.to) != null && INSTANCE.isBefore(version2, version, this.isInclusiveTo)) {
            return true;
        }
        return this.from == null && this.to == null;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(VersionRange.class, other.getClass())) {
            return false;
        }
        VersionRange versionRange = (VersionRange) other;
        return this.isInclusiveFrom == versionRange.isInclusiveFrom && this.isInclusiveTo == versionRange.isInclusiveTo && Intrinsics.areEqual(this.from, versionRange.from) && Intrinsics.areEqual(this.to, versionRange.to);
    }

    /* compiled from: VersionRange.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/version/VersionRange$Companion;", "", "()V", "isAfter", "", "border", "Lio/bidmachine/util/version/Version;", "version", "isInclusive", "isBefore", "parseVersionRange", "Lio/bidmachine/util/version/VersionRange;", "versionRangeString", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:6:0x000b, B:11:0x002a, B:16:0x004b, B:18:0x005c, B:19:0x0064, B:21:0x006a, B:25:0x0077, B:26:0x0087, B:28:0x0094, B:30:0x009c, B:34:0x00a3, B:37:0x0083, B:38:0x003d, B:39:0x0021), top: B:5:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:6:0x000b, B:11:0x002a, B:16:0x004b, B:18:0x005c, B:19:0x0064, B:21:0x006a, B:25:0x0077, B:26:0x0087, B:28:0x0094, B:30:0x009c, B:34:0x00a3, B:37:0x0083, B:38:0x003d, B:39:0x0021), top: B:5:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #0 {all -> 0x00b7, blocks: (B:6:0x000b, B:11:0x002a, B:16:0x004b, B:18:0x005c, B:19:0x0064, B:21:0x006a, B:25:0x0077, B:26:0x0087, B:28:0x0094, B:30:0x009c, B:34:0x00a3, B:37:0x0083, B:38:0x003d, B:39:0x0021), top: B:5:0x000b }] */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final VersionRange parseVersionRange(@Nullable String versionRangeString) {
            boolean endsWith$default;
            List<String> split;
            List emptyList;
            String[] strArr;
            if (versionRangeString != null && versionRangeString.length() != 0) {
                try {
                    boolean startsWith$default = StringsKt.startsWith$default(versionRangeString, X3.j.d, false, 2, (Object) null);
                    boolean startsWith$default2 = StringsKt.startsWith$default(versionRangeString, "(", false, 2, (Object) null);
                    if (!startsWith$default && !startsWith$default2) {
                        startsWith$default = true;
                        endsWith$default = StringsKt.endsWith$default(versionRangeString, X3.j.e, false, 2, (Object) null);
                        boolean endsWith$default2 = StringsKt.endsWith$default(versionRangeString, ")", false, 2, (Object) null);
                        if (!endsWith$default && !endsWith$default2) {
                            endsWith$default = true;
                            split = new Regex("-").split(versionRangeString, 0);
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
                            strArr = (String[]) emptyList.toArray(new String[0]);
                            if (strArr.length >= 2) {
                                Version parseVersion = Version.INSTANCE.parseVersion(versionRangeString);
                                if (parseVersion != null) {
                                    return new VersionRange(parseVersion, parseVersion, startsWith$default, endsWith$default);
                                }
                                return null;
                            }
                            Version.Companion companion = Version.INSTANCE;
                            return new VersionRange(companion.parseVersion(strArr[0]), companion.parseVersion(strArr[1]), startsWith$default, endsWith$default);
                        }
                        versionRangeString = versionRangeString.substring(0, versionRangeString.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(versionRangeString, "this as java.lang.String…ing(startIndex, endIndex)");
                        split = new Regex("-").split(versionRangeString, 0);
                        if (!split.isEmpty()) {
                        }
                        emptyList = CollectionsKt.emptyList();
                        strArr = (String[]) emptyList.toArray(new String[0]);
                        if (strArr.length >= 2) {
                        }
                    }
                    versionRangeString = versionRangeString.substring(1);
                    Intrinsics.checkNotNullExpressionValue(versionRangeString, "this as java.lang.String).substring(startIndex)");
                    endsWith$default = StringsKt.endsWith$default(versionRangeString, X3.j.e, false, 2, (Object) null);
                    boolean endsWith$default22 = StringsKt.endsWith$default(versionRangeString, ")", false, 2, (Object) null);
                    if (!endsWith$default) {
                        endsWith$default = true;
                        split = new Regex("-").split(versionRangeString, 0);
                        if (!split.isEmpty()) {
                        }
                        emptyList = CollectionsKt.emptyList();
                        strArr = (String[]) emptyList.toArray(new String[0]);
                        if (strArr.length >= 2) {
                        }
                    }
                    versionRangeString = versionRangeString.substring(0, versionRangeString.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(versionRangeString, "this as java.lang.String…ing(startIndex, endIndex)");
                    split = new Regex("-").split(versionRangeString, 0);
                    if (!split.isEmpty()) {
                    }
                    emptyList = CollectionsKt.emptyList();
                    strArr = (String[]) emptyList.toArray(new String[0]);
                    if (strArr.length >= 2) {
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        public final boolean isAfter(@NotNull Version border, @NotNull Version version, boolean isInclusive) {
            Intrinsics.checkNotNullParameter(border, "border");
            Intrinsics.checkNotNullParameter(version, "version");
            return (isInclusive && version.isAfterOrEquals(border)) || (!isInclusive && version.isAfter(border));
        }

        public final boolean isBefore(@NotNull Version border, @NotNull Version version, boolean isInclusive) {
            Intrinsics.checkNotNullParameter(border, "border");
            Intrinsics.checkNotNullParameter(version, "version");
            return (isInclusive && version.isBeforeOrEquals(border)) || (!isInclusive && version.isBefore(border));
        }
    }
}
