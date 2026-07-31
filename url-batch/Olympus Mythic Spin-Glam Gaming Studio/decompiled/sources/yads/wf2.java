package yads;

import com.mobilefuse.sdk.config.ExternalUsageInfo;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class wf2 {
    public static final /* synthetic */ wf2[] c;
    public static final /* synthetic */ EnumEntries d;
    public final List b;

    static {
        wf2[] wf2VarArr = {new wf2(0, "Flutter", CollectionsKt.listOf("io.flutter.embedding.android.FlutterActivity")), new wf2(1, "ReactNative", CollectionsKt.listOf("com.facebook.react.bridge.ReactContext")), new wf2(2, ExternalUsageInfo.SDK_MODULE_UNITY, CollectionsKt.listOf((Object[]) new String[]{MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME, "com.unity3d.player.UnityPlayerActivity"}))};
        c = wf2VarArr;
        d = EnumEntriesKt.enumEntries(wf2VarArr);
    }

    public wf2(int i, String str, List list) {
        this.b = list;
    }

    public static wf2 valueOf(String str) {
        return (wf2) Enum.valueOf(wf2.class, str);
    }

    public static wf2[] values() {
        return (wf2[]) c.clone();
    }
}
