package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes13.dex */
public final class T4 {
    public static final List j;
    public long b;
    public int d;
    public int g;
    public int h;
    public int i;
    public String a = "";
    public long c = -1;
    public long e = -1;
    public int f = -1;

    static {
        List listOf = CollectionsKt.listOf((Object[]) new String[]{CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "bid", "its", "vtm", "plid", "catid", "hcd", "hsv", "hcv"});
        j = listOf;
        listOf.size();
    }
}
