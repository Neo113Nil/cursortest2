package io.bidmachine.ads.networks.gam;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import io.bidmachine.ads.networks.gam.versions.v21_0_0.VersionWrapperImpl;
import io.bidmachine.utils.version.Version;
import io.bidmachine.utils.version.VersionRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class VersionManager {

    @NonNull
    @VisibleForTesting
    static final List<Pair<VersionRange, VersionWrapper>> VERSION_WRAPPER_LIST = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VersionWrapperImpl());
        arrayList.add(new io.bidmachine.ads.networks.gam.versions.v22_0_0.VersionWrapperImpl());
        arrayList.add(new io.bidmachine.ads.networks.gam.versions.v23_0_0.VersionWrapperImpl());
        Collections.sort(arrayList, new Comparator() { // from class: io.bidmachine.ads.networks.gam.VersionManager$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$static$0;
                lambda$static$0 = VersionManager.lambda$static$0((VersionWrapper) obj, (VersionWrapper) obj2);
                return lambda$static$0;
            }
        });
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            VersionWrapper versionWrapper = (VersionWrapper) arrayList.get(i);
            Version version = null;
            VersionWrapper versionWrapper2 = i < size + (-1) ? (VersionWrapper) arrayList.get(i + 1) : null;
            Version versionForWhichCompiled = versionWrapper.getVersionForWhichCompiled();
            if (versionWrapper2 != null) {
                version = versionWrapper2.getVersionForWhichCompiled();
            }
            VERSION_WRAPPER_LIST.add(new Pair<>(new VersionRange(versionForWhichCompiled, version, true, false), versionWrapper));
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(VersionWrapper versionWrapper, VersionWrapper versionWrapper2) {
        return versionWrapper.getVersionForWhichCompiled().compareTo(versionWrapper2.getVersionForWhichCompiled());
    }

    @Nullable
    public static VersionWrapper findVersionWrapper(@NonNull String str) {
        Version findVersion;
        VersionRange parseVersionRange = VersionRange.parseVersionRange(str);
        if (parseVersionRange == null || (findVersion = findVersion()) == null || !parseVersionRange.contains(findVersion)) {
            return null;
        }
        for (Pair<VersionRange, VersionWrapper> pair : VERSION_WRAPPER_LIST) {
            if (((VersionRange) pair.first).contains(findVersion)) {
                return (VersionWrapper) pair.second;
            }
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    static Version findVersion() {
        Version safeGetVersion;
        Iterator<Pair<VersionRange, VersionWrapper>> it = VERSION_WRAPPER_LIST.iterator();
        while (it.hasNext()) {
            VersionWrapper versionWrapper = (VersionWrapper) it.next().second;
            if (Build.VERSION.SDK_INT >= versionWrapper.getMinDeviceApiVersion() && (safeGetVersion = safeGetVersion(versionWrapper)) != null) {
                return safeGetVersion;
            }
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    static Version safeGetVersion(@NonNull VersionWrapper versionWrapper) {
        try {
            return versionWrapper.getVersion();
        } catch (Throwable unused) {
            return null;
        }
    }
}
