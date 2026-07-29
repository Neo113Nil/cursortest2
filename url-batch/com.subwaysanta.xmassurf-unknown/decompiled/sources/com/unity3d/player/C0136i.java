package com.unity3d.player;

import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import java.util.HashSet;

/* renamed from: com.unity3d.player.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136i {
    public static C0136i e;
    public final UnityPlayer a;
    public final AssetPackManager b;
    public final HashSet c;
    public C0124c d;

    public C0136i(UnityPlayer unityPlayer, Context context) {
        if (e != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.a = unityPlayer;
        this.b = AssetPackManagerFactory.getInstance(context);
        this.c = new HashSet();
    }
}
