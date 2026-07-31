package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadManager;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class DownloadManager$InternalHandler$$ExternalSyntheticLambda0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareStartTimes;
        compareStartTimes = DownloadManager.InternalHandler.compareStartTimes((Download) obj, (Download) obj2);
        return compareStartTimes;
    }
}
