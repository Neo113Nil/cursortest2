package io.ably.lib.types;

import java.util.List;

/* loaded from: classes7.dex */
public class SummaryClientIdList {
    public final List<String> clientIds;
    public final boolean clipped;
    public final int total;

    public SummaryClientIdList(int i, List<String> list, boolean z) {
        this.total = i;
        this.clientIds = list;
        this.clipped = z;
    }
}
