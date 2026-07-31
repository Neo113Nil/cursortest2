package io.bidmachine.ads.networks.gam_dynamic;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.VersionWrapperImpl;
import io.bidmachine.utils.version.Version;
import io.bidmachine.utils.version.VersionRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
class VersionManager {
    VersionManager() {
    }

    @Nullable
    static VersionWrapper findVersionWrapper(@NonNull String str) {
        List<Pair<VersionRange, VersionWrapper>> initializeVersionWrapperList;
        Version findVersion;
        VersionRange parseVersionRange = VersionRange.parseVersionRange(str);
        if (parseVersionRange == null || (findVersion = findVersion((initializeVersionWrapperList = initializeVersionWrapperList()))) == null || !parseVersionRange.contains(findVersion)) {
            return null;
        }
        for (Pair<VersionRange, VersionWrapper> pair : initializeVersionWrapperList) {
            if (((VersionRange) pair.first).contains(findVersion)) {
                return (VersionWrapper) pair.second;
            }
        }
        return null;
    }

    @NonNull
    @VisibleForTesting
    static List<Pair<VersionRange, VersionWrapper>> initializeVersionWrapperList() {
        ArrayList arrayList = new ArrayList();
        ArrayList<VersionWrapper> arrayList2 = new ArrayList<VersionWrapper>() { // from class: io.bidmachine.ads.networks.gam_dynamic.VersionManager.1
            {
                add(new VersionWrapperImpl());
                add(new io.bidmachine.ads.networks.gam_dynamic.versions.v22_0_0.VersionWrapperImpl());
                add(new io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.VersionWrapperImpl());
            }
        };
        Collections.sort(arrayList2, new Comparator() { // from class: io.bidmachine.ads.networks.gam_dynamic.VersionManager$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$initializeVersionWrapperList$0;
                lambda$initializeVersionWrapperList$0 = VersionManager.lambda$initializeVersionWrapperList$0((VersionWrapper) obj, (VersionWrapper) obj2);
                return lambda$initializeVersionWrapperList$0;
            }
        });
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            VersionWrapper versionWrapper = arrayList2.get(i);
            Version version = null;
            VersionWrapper versionWrapper2 = i < size + (-1) ? arrayList2.get(i + 1) : null;
            Version versionForWhichCompiled = versionWrapper.getVersionForWhichCompiled();
            if (versionWrapper2 != null) {
                version = versionWrapper2.getVersionForWhichCompiled();
            }
            arrayList.add(new Pair(new VersionRange(versionForWhichCompiled, version, true, false), versionWrapper));
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$initializeVersionWrapperList$0(VersionWrapper versionWrapper, VersionWrapper versionWrapper2) {
        return versionWrapper.getVersionForWhichCompiled().compareTo(versionWrapper2.getVersionForWhichCompiled());
    }

    @Nullable
    @VisibleForTesting
    static Version findVersion(@NonNull List<Pair<VersionRange, VersionWrapper>> list) {
        Version safeGetVersion;
        Iterator<Pair<VersionRange, VersionWrapper>> it = list.iterator();
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
